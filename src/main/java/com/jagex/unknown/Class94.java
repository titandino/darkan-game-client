package com.jagex.unknown;

import com.jagex.EntityNode_Sub1;
import com.jagex.Huffman;
import com.jagex.Index;
import com.jagex.client.Game;
import com.jagex.client.js5.IndexLoaders;
import com.jagex.client.js5.defs.ParticleArchive1Def;
import com.jagex.client.js5.defs.SunDefinitions;
import com.jagex.client.prefs.impl.BloomPreference;
import com.jagex.client.render.font.FontMetrics;
import com.jagex.net.io.ByteBuf;

public class Class94 {

	public Class94() throws Throwable {
		throw new Error();
	}

	public static String prependOS(String string_0) {
		return OperatingSystemInfo.OS_NAME.startsWith("win") ? string_0 + ".dll" : (OperatingSystemInfo.OS_NAME.startsWith("linux") ? "lib" + string_0 + ".so" : (OperatingSystemInfo.OS_NAME.startsWith("mac") ? "lib" + string_0 + ".dylib" : null));
	}

	public static ByteBuf method1587() {
		ByteBuf rsbytebuffer_1 = new ByteBuf(518);
		Class500.anIntArray5827 = new int[4];
		Class500.anIntArray5827[0] = (int) (Math.random() * 9.9999999E7D);
		Class500.anIntArray5827[1] = (int) (Math.random() * 9.9999999E7D);
		Class500.anIntArray5827[2] = (int) (Math.random() * 9.9999999E7D);
		Class500.anIntArray5827[3] = (int) (Math.random() * 9.9999999E7D);
		rsbytebuffer_1.writeByte(10);
		rsbytebuffer_1.writeInt(Class500.anIntArray5827[0]);
		rsbytebuffer_1.writeInt(Class500.anIntArray5827[1]);
		rsbytebuffer_1.writeInt(Class500.anIntArray5827[2]);
		rsbytebuffer_1.writeInt(Class500.anIntArray5827[3]);
		return rsbytebuffer_1;
	}

	public static FontMetrics getFontMetrics(Index index_0, int i_1) {
		byte[] bytes_4 = index_0.getFile(i_1, 0);
		return bytes_4 == null ? null : new FontMetrics(bytes_4);
	}

	public static void method1589() {
		int flag = 0;
		if (Class393.preferences.lightDetail.method12786() == 1) {
			flag |= 0x1;
			flag |= 0x10;
			flag |= 0x20;
			flag |= 0x2;
			flag |= 0x4;
		}
		if (Class393.preferences.textures.method12873() == 0) {
			flag |= 0x40;
		}
		BloomPreference.method12710(flag);
		IndexLoaders.MAP_REGION_DECODER.method4436().method7893(flag);
		IndexLoaders.MAP_REGION_LOADER_THREAD.method6052().method4436().method7893(flag);
		IndexLoaders.ITEM_LOADER.method7153(flag);
		IndexLoaders.NPC_INDEX_LOADER.method6829(flag);
		IndexLoaders.SPOT_ANIM_LOADER.method8846(flag);
		SunDefinitions.method851(flag);
		Game.method8204(flag);
		Huffman.method1982(flag);
		EntityNode_Sub1.method12424(flag);
		ParticleArchive1Def.method6143(flag);
		IndexLoaders.MAP_REGION_DECODER.method4547();
	}
}
