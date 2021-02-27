package com.jagex.unknown;

import com.jagex.Trig;
import com.jagex.client.input.CanvasKeyRecorder;

public class Class430 {

	public int anInt5135;

	public int anInt5139;

	public int anInt5137;

	public int anInt5138;

	public int anInt5136;

	public Class430(int i_1, int i_2, int i_3, int i_4, int i_5) {
		anInt5135 = i_1;
		anInt5139 = i_2;
		anInt5137 = i_3;
		anInt5138 = i_4;
		anInt5136 = i_5;
	}

	public static void method7217() {
		Class506.CS2_CACHE.method3760();
	}

	public static int method7220(int i_0, int i_1, int i_2, int i_3) {
		int i_5 = 65536 - Trig.COSINE[i_2 * 8192 / i_3] >> 1;
		return ((65536 - i_5) * i_0 >> 16) + (i_5 * i_1 >> 16);
	}

	public static void method7221() {
		CanvasKeyRecorder.anIntArray8044[44] = 71;
		CanvasKeyRecorder.anIntArray8044[45] = 26;
		CanvasKeyRecorder.anIntArray8044[46] = 72;
		CanvasKeyRecorder.anIntArray8044[47] = 73;
		CanvasKeyRecorder.anIntArray8044[59] = 57;
		CanvasKeyRecorder.anIntArray8044[61] = 27;
		CanvasKeyRecorder.anIntArray8044[91] = 42;
		CanvasKeyRecorder.anIntArray8044[92] = 74;
		CanvasKeyRecorder.anIntArray8044[93] = 43;
		CanvasKeyRecorder.anIntArray8044[192] = 28;
		CanvasKeyRecorder.anIntArray8044[222] = 58;
		CanvasKeyRecorder.anIntArray8044[520] = 59;
	}

	public int hashCode() {
		return anInt5135;
	}
}
