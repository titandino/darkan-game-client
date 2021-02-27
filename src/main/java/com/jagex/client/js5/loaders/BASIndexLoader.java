package com.jagex.client.js5.loaders;

import com.jagex.*;
import com.jagex.client.client;
import com.jagex.client.input.MouseRecord_Sub1;
import com.jagex.client.js5.defaultfiles.impl.EquipmentDefaults;
import com.jagex.client.js5.defs.BASDefinitions;
import com.jagex.client.js5.defs.IComponentDefinitions;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class236;

import java.util.Queue;

public class BASIndexLoader {

	public static BASDefinitions aClass227_2669 = new BASDefinitions();

	public LRUCache basCache = new LRUCache(64);

	public Index configIndex;

	public EquipmentDefaults equipmentDefaults;

	public BASIndexLoader(Index configIndex, EquipmentDefaults equipmentDefaults) {
		this.configIndex = configIndex;
		this.configIndex.filesCount(SharedConfigsType.RENDER_ANIMS.id);
		this.equipmentDefaults = equipmentDefaults;
	}

	public static void method3629(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		if (!MovingAnimation.isInterfaceLoaded(i_0, null)) {
			if (i_7 != -1) {
				client.aBoolArray7443[i_7] = true;
			} else {
				for (int i_9 = 0; i_9 < 107; i_9++) {
					client.aBoolArray7443[i_9] = true;
				}
			}
		} else {
			IComponentDefinitions.render(Interface.INTERFACES[i_0].method1616(), -1, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_7 < 0);
		}
	}

	public static void method3630() {
		Queue<MouseRecord_Sub1> queue_1 = Class236.aQueue2914;
		synchronized (Class236.aQueue2914) {
			while (true) {
				MouseRecord_Sub1 class282_sub53_sub1_2 = Class236.aQueue2914.poll();
				if (class282_sub53_sub1_2 == null) {
					return;
				}
				class282_sub53_sub1_2.cache();
			}
		}
	}

	public static void method3631(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(3, i_0);
		class282_sub50_sub12_2.method14965();
	}

	public void method3615() {
		synchronized (basCache) {
			basCache.method3858(5);
		}
	}

	public BASDefinitions getBASDefs(int animationId) {
		BASDefinitions basDefinitions;
		synchronized (basCache) {
			basDefinitions = (BASDefinitions) basCache.get(animationId);
		}
		if (basDefinitions != null) {
			basDefinitions.renderAnimId = animationId;
			return basDefinitions;
		}
		byte[] data;
		synchronized (configIndex) {
			data = configIndex.getFile(SharedConfigsType.RENDER_ANIMS.id, animationId);
		}
		basDefinitions = new BASDefinitions();
		basDefinitions.renderAnimId = animationId;
		basDefinitions.basIndexLoader = this;
		if (data != null) {
			basDefinitions.decode(new ByteBuf(data));
		}
		LRUCache softcache_9 = basCache;
		synchronized (basCache) {
			basCache.put(basDefinitions, animationId);
			return basDefinitions;
		}
	}

	public void method3617() {
		LRUCache softcache_2 = basCache;
		synchronized (basCache) {
			basCache.method3859();
		}
	}

	public void method3618() {
		LRUCache softcache_2 = basCache;
		synchronized (basCache) {
			basCache.method3863();
		}
	}
}
