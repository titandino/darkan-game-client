package com.jagex.unknown;

import com.jagex.AreadSound;
import com.jagex.Node_Sub15_Sub2;
import com.jagex.SongReference;

public class Class260 {

	public static int anInt3223 = -1;
	public static boolean aBool3220;
	public static int anInt3228 = -1;
	public static SongReference aClass116_3229;
	public static Node_Sub15_Sub2 aNode_Sub15_Sub2_3231;
	public static int SOUNDS_SIZE;

	public static AreadSound[] SOUNDS = new AreadSound[50];

	public static Class277 aClass277_3221;

	public static Class277 aClass277_3234;

	public Class260() throws Throwable {
		throw new Error();
	}

	public static int method4632(int i_0, int i_1) {
		int i_3 = i_1 * 57 + i_0;
		i_3 ^= i_3 << 13;
		int i_4 = i_3 * (i_3 * i_3 * 15731 + 789221) + 1376312589 & 0x7fffffff;
		return i_4 >> 19 & 0xff;
	}
}
