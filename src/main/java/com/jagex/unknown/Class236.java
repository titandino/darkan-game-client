package com.jagex.unknown;

import com.jagex.MoveSpeed;
import com.jagex.PathingEntity;
import com.jagex.client.input.MouseRecord_Sub1;

import java.util.LinkedList;
import java.util.Queue;

public class Class236 {

	public static long aLong2910 = -1L;

	public static int anInt2912;

	public static boolean aBool2909 = true;

	public static Class534_Sub2 aClass534_Sub2_2911 = new Class534_Sub2();

	public static Class534_Sub1 aClass534_Sub1_2913 = new Class534_Sub1();

	public static Queue<MouseRecord_Sub1> aQueue2914 = new LinkedList<MouseRecord_Sub1>();

	public Class236() throws Throwable {
		throw new Error();
	}

	public static void getAnimationForSpeed(PathingEntity entity, int value) {
		if (entity.currentAnimations != null) {
			MoveSpeed speed = (MoveSpeed) Class386.identify(MoveSpeed.values(), value);
			int i_4 = entity.currentAnimations[speed.getValueIncr()];
			if (i_4 != entity.currentAnimation.currentAnimationId()) {
				entity.currentAnimation.method7615(i_4, entity.currentAnimation.getSpeed());
				entity.anInt10367 = entity.anInt10355;
			}
		}
	}
}
