package com.jagex.unknown;

import com.jagex.ParticleProducer;

import java.awt.*;
import java.lang.reflect.Method;

public class Class459 {

	public static int FC_PLAYER_COUNT;
	public int anInt5496;
	public int anInt5499;
	byte[] aByteArray5502;
	public int anInt5505;
	public int anInt5507;
	public int anInt5508;
	byte aByte5509;
	public int anInt5511;
	public int anInt5513;
	public int anInt5514;
	public int anInt5515;
	public int anInt5516;
	public int anInt5518;
	public int anInt5520;
	byte[] aByteArray5526;
	public int anInt5532;
	public int anInt5498 = 6;

	public int anInt5500 = 50;

	public int anInt5501 = 18002;

	public int anInt5512 = 258;

	public int anInt5521 = 16;

	public int anInt5522 = 4096;

	public int anInt5503;

	public int anInt5506;

	int[] anIntArray5517;

	int[] anIntArray5519;

	public boolean[] aBoolArray5497;

	public boolean[] aBoolArray5510;

	byte[] aByteArray5523;

	byte[] aByteArray5524;

	int[] anIntArray5525;

	byte[] aByteArray5504;

	byte[] aByteArray5527;

	byte[][] aByteArrayArray5528;

	int[][] anIntArrayArray5529;

	int[][] anIntArrayArray5530;

	int[][] anIntArrayArray5531;

	int[] anIntArray5533;

	public Class459() {
		anInt5521 = 16;
		anInt5512 = 258;
		anInt5498 = 6;
		anInt5500 = 50;
		anInt5501 = 18002;
		anInt5503 = 0;
		anInt5506 = 0;
		anIntArray5517 = new int[256];
		anIntArray5519 = new int[257];
		aBoolArray5497 = new boolean[256];
		aBoolArray5510 = new boolean[16];
		aByteArray5523 = new byte[256];
		aByteArray5524 = new byte[4096];
		anIntArray5525 = new int[16];
		aByteArray5504 = new byte[18002];
		aByteArray5527 = new byte[18002];
		aByteArrayArray5528 = new byte[6][258];
		anIntArrayArray5529 = new int[6][258];
		anIntArrayArray5530 = new int[6][258];
		anIntArrayArray5531 = new int[6][258];
		anIntArray5533 = new int[6];
	}

	public static void method7678() {
		Class122.method2111(false);
		if (Class291_Sub1.anInt8021 >= 0 && Class291_Sub1.anInt8021 != 0) {
			ParticleProducer.method11500(Class291_Sub1.anInt8021, false);
			Class291_Sub1.anInt8021 = -1;
		}
	}

	public static void method7679(Canvas canvas_0) {
		try {
			Class class_2 = Class.forName("java.awt.Canvas");
			Method method_3 = class_2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			method_3.invoke(canvas_0, Boolean.TRUE);
		} catch (Exception ignored) {
		}
	}
}
