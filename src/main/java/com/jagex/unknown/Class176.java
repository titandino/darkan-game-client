package com.jagex.unknown;

import com.jagex.ModeWhere;
import com.jagex.client.Engine;
import com.jagex.client.render.font.FontMetrics;
import com.jagex.game.content.cutscenes.actions.CutsceneAction_Sub5;

public class Class176 {

	public static FontMetrics aClass414_2200;
	public static ModeWhere BUILD_ENVIRONMENT;
	public float aFloat2193;
	public int anInt2195;
	public int anInt2196;
	public int anInt2197;
	public int anInt2198;
	public float aFloat2190 = 1.0F;
	public float aFloat2191 = 1.0F;
	public int anInt2192;
	public int anInt2189;
	public int anInt2199;
	public int anInt2194;

	public Class176(int i_1, float f_2, float f_3, int i_4, int i_5, int i_6) {
		anInt2199 = i_1;
		aFloat2190 = f_2;
		aFloat2191 = f_3;
		anInt2192 = i_4;
		anInt2189 = i_5;
		anInt2194 = i_6;
	}

	public Class176(int i_1) {
		anInt2199 = i_1;
	}

	public static void method2977() {
		CutsceneAction_Sub5.method14243();
	}

	public static long method2979() {
		return Engine.FPS_MANAGER.method4852();
	}

	public static boolean method2980(int i_0) {
		return i_0 == 5 || i_0 == 0 || i_0 == 7 || i_0 == 13;
	}

	public void method2968(Class176 class176_1) {
		aFloat2190 = class176_1.aFloat2190;
		aFloat2191 = class176_1.aFloat2191;
		anInt2192 = class176_1.anInt2192;
		anInt2189 = class176_1.anInt2189;
		anInt2199 = class176_1.anInt2199;
		anInt2194 = class176_1.anInt2194;
	}

	public Class176 method2972() {
		return new Class176(anInt2199, aFloat2190, aFloat2191, anInt2192, anInt2189, anInt2194);
	}
}
