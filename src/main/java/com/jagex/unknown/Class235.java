package com.jagex.unknown;

import com.jagex.*;

import java.util.List;

public class Class235 {

	public static List<ParticleSystem> aList2896;
	public static Particle[] aEntityNode_Sub1_Sub1_Sub1Array2897;
	public static int anInt2902;
	public static int anInt2905;
	public static int anInt2899;
	public static int anInt2901;
	public static int anInt2900;
	public static int anInt2903;
	public static IterableNodeMap aClass465_2904 = new IterableNodeMap(8);
	public static int anInt2898;
	public static int anInt2906 = 2;

	public Class235() throws Throwable {
		throw new Error();
	}

	public static int method3967(int i_0, int i_1) {
		return i_0 != ObjectType.WALL_DIAGONAL_CORNER.id && i_0 != ObjectType.WALL_STRAIGHT_CORNER.id ? WallObjectGraphNode.anIntArray10522[i_1 & 0x3] : WallObjectGraphNode.anIntArray10518[i_1 & 0x3];
	}
}
