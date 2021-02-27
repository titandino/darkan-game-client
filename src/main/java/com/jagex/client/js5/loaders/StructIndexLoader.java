package com.jagex.client.js5.loaders;

import com.jagex.Comparable_Sub1;
import com.jagex.Index;
import com.jagex.Isaac;
import com.jagex.SharedConfigsType;
import com.jagex.client.cache.CacheableNode_Sub4;
import com.jagex.client.client;
import com.jagex.client.input.InputSubscriberType;
import com.jagex.client.js5.defs.IComponentDefinitions;
import com.jagex.game.content.clans.settings.ChangeClanSetting;
import com.jagex.net.io.ByteBuf;

public class StructIndexLoader {

	public static int anInt5015;
	public Index aClass317_5014;
	public int anInt5013;
	public CacheableNode_Sub4[] aCacheableNode_Sub4Array5012;

	public StructIndexLoader(Index index_3) {
		aClass317_5014 = index_3;
		anInt5013 = aClass317_5014.filesCount(SharedConfigsType.STRUCTS.id);
		aCacheableNode_Sub4Array5012 = new CacheableNode_Sub4[anInt5013];

		for (int i_5 = 0; i_5 < anInt5013; i_5++) {
			Index index_7 = aClass317_5014;
			byte[] bytes_6;
			synchronized (aClass317_5014) {
				bytes_6 = aClass317_5014.getFile(SharedConfigsType.STRUCTS.id, i_5);
			}

			CacheableNode_Sub4 class282_sub50_sub4_9 = new CacheableNode_Sub4();
			if (bytes_6 != null) {
				class282_sub50_sub4_9.method14748(new ByteBuf(bytes_6));
			}

			aCacheableNode_Sub4Array5012[i_5] = class282_sub50_sub4_9;
		}

	}

	public static void method7039() {
		Comparable_Sub1.aClass118Array3772 = null;
		BASIndexLoader.method3629(client.BASE_WINDOW_ID, 0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH, client.BASE_WINDOW_HEIGHT * -969250379, 0, 0, -1);
		if (Comparable_Sub1.aClass118Array3772 != null) {
			IComponentDefinitions[] arr_1 = Comparable_Sub1.aClass118Array3772;
			int i_2 = -1412584499;
			byte b_3 = 0;
			byte b_4 = 0;
			int i_5 = ChangeClanSetting.BASE_WINDOW_WIDTH;
			int i_6 = client.BASE_WINDOW_HEIGHT * -969250379;
			int i_7 = GameTipsLoader.anInt4822;
			int i_8 = Isaac.anInt5157;
			int i_9;
			if (client.aClass118_7247 == InputSubscriberType.aClass118_2763) {
				i_9 = -1;
			} else {
				i_9 = client.aClass118_7247.anInt1449;
			}

			IComponentDefinitions.render(arr_1, i_2, b_3, b_4, i_5, i_6, i_7, i_8, i_9, true);
			Comparable_Sub1.aClass118Array3772 = null;
		}

	}

	public CacheableNode_Sub4 getStruct(int i_1) {
		return i_1 < 0 ? new CacheableNode_Sub4() : aCacheableNode_Sub4Array5012[i_1];
	}

}
