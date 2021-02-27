package com.jagex.client.js5.defs;

import com.jagex.*;
import com.jagex.client.client;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class148;
import com.jagex.unknown.Class455;
import com.jagex.unknown.Class9;

public class ParticleArchive1Def {

	public static ParticleArchive1Def[] aClass345Array4025 = new ParticleArchive1Def[16];
	public static IterableNodeMap aClass465_4029 = new IterableNodeMap(16);
	public static Index PARTICLE_INDEX;
	public static int anInt4028;
	public static LRUCache aClass229_4031 = new LRUCache(64);
	public int anInt4032;
	public int anInt4038;
	public int anInt4035;
	public int anInt4027;
	public int anInt4036;
	public int anInt4037;
	public int anInt4041;
	public int anInt4039;
	public int anInt4040;
	public int anInt4024;
	public int anInt4033;
	public long aLong4044;
	public int anInt4034;
	public boolean aBool4042;

	public static boolean method6140() {
		return Class148.anInt1730 != 0;
	}

	public static void method6143(int i_0) {
		NewsItem.anInt1069 = i_0;
		ItemContainer.aClass229_7712.method3859();
	}

	public static void worldLogin(String string_0, String string_1) {
		Class9.lobbyStage = 273;
		Class9.CURRENT_CONNECTION_CONTEXT = client.GAME_CONNECTION_CONTEXT;
		Class455.method7558(false, false, string_0, string_1, -1L);
	}

	public void decode(ByteBuf buffer) {
		while (true) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0)
				return;
			decode(buffer, opcode);
		}
	}

	public void decode(ByteBuf buffer, int opcode) {
		if (opcode == 1) {
			anInt4034 = buffer.readUnsignedShort();
		} else if (opcode == 2) {
			buffer.readUnsignedByte();
		} else if (opcode == 3) {
			anInt4027 = buffer.readInt();
			anInt4036 = buffer.readInt();
			anInt4037 = buffer.readInt();
		} else if (opcode == 4) {
			anInt4035 = buffer.readInt();
		} else if (opcode == 6) {
			anInt4041 = buffer.readUnsignedByte();
		} else if (opcode == 8) {
			anInt4040 = 1;
		} else if (opcode == 9) {
			anInt4039 = 1;
		}
	}

	public void method6128() {
		anInt4024 = Trig.COSINE[anInt4034 << 3];
		long long_2 = anInt4027;
		long long_4 = anInt4036;
		long long_6 = anInt4037;
		anInt4033 = (int) Math.sqrt((long_2 * long_2 + long_4 * long_4 + long_6 * long_6));
		if (anInt4035 == 0) {
			anInt4035 = 1;
		}
		if (anInt4038 == 0) {
			aLong4044 = 2147483647L;
		} else if (anInt4038 == 1) {
			aLong4044 = anInt4033 * 8 / anInt4035;
			aLong4044 *= aLong4044;
		} else if (anInt4038 == 2) {
			aLong4044 = anInt4033 * 8 / anInt4035;
		}
		if (aBool4042) {
			anInt4033 *= -1;
		}
	}
}
