package com.jagex.unknown;

import com.jagex.*;
import com.jagex.utils.ChoppyItemFixClass;

public class Class185 {
	public boolean aBool2304;
	public float aFloat2326;
	public float aFloat2331;
	public float aFloat2332;
	public float aFloat2333;
	public int anInt2337;
	public Runnable aRunnable2343;
	public ChoppyItemFixClass aClass144_2310;
	public float aFloat2305 = 0.85F;
	public float aFloat2303;
	public int anInt2307;
	public int anInt2336;
	public boolean aBool2309;
	public int anInt2306;
	public int anInt2313;
	public boolean aBool2334;
	public Matrix44 aClass384_2346;
	public Matrix44Var aClass294_2314;
	public Matrix44Var aClass294_2316;
	public Matrix44 aClass384_2317;
	public Matrix44 aClass384_2318;
	public int[] anIntArray2319;
	public float[] aFloatArray2302;
	public float[] aFloatArray2341;
	public float[] aFloatArray2322;
	public float[] aFloatArray2323;
	public int[] anIntArray2321;
	public int[] anIntArray2325;
	public int[] anIntArray2312;
	public int[] anIntArray2327;
	public int[] anIntArray2328;
	public float aFloat2311;
	public float aFloat2335;
	public float aFloat2308;
	public float[] aFloatArray2338;
	public MeshRasterizer_Sub2[] aMeshRasterizer_Sub2Array2339;
	public MeshRasterizer_Sub2[] aMeshRasterizer_Sub2Array2340;
	public float[] aFloatArray2315;
	public float[] aFloatArray2342;
	public float[] aFloatArray2330;
	public float[] aFloatArray2344;
	public float[] aFloatArray2345;
	public float[] aFloatArray2324;
	public JavaRenderer aGraphicalRenderer_Sub3_2320;
	public int[] anIntArray2329;

	public Class185(JavaRenderer hardwarerenderer_1) {
		aFloat2303 = 1.0F - aFloat2305;
		anInt2307 = 0;
		anInt2336 = 0;
		aBool2309 = false;
		anInt2306 = 0;
		anInt2313 = 0;
		aBool2334 = true;
		aClass384_2346 = new Matrix44();
		aClass294_2314 = new Matrix44Var();
		aClass294_2316 = new Matrix44Var();
		aClass384_2317 = new Matrix44();
		aClass384_2318 = new Matrix44();
		anIntArray2319 = new int[MeshRasterizer_Sub2.anInt8644];
		aFloatArray2302 = new float[MeshRasterizer_Sub2.anInt8644];
		aFloatArray2341 = new float[MeshRasterizer_Sub2.anInt8644];
		aFloatArray2322 = new float[MeshRasterizer_Sub2.anInt8644];
		aFloatArray2323 = new float[MeshRasterizer_Sub2.anInt8644];
		anIntArray2321 = new int[8];
		anIntArray2325 = new int[8];
		anIntArray2312 = new int[8];
		anIntArray2327 = new int[10000];
		anIntArray2328 = new int[10000];
		aFloat2311 = 1.0F;
		aFloat2335 = 0.0F;
		aFloat2308 = 1.0F;
		aFloatArray2338 = new float[2];
		aMeshRasterizer_Sub2Array2339 = new MeshRasterizer_Sub2[7];
		aMeshRasterizer_Sub2Array2340 = new MeshRasterizer_Sub2[7];
		aFloatArray2315 = new float[64];
		aFloatArray2342 = new float[64];
		aFloatArray2330 = new float[64];
		aFloatArray2344 = new float[64];
		aFloatArray2345 = new float[64];
		aFloatArray2324 = new float[3];
		aGraphicalRenderer_Sub3_2320 = hardwarerenderer_1;
		aClass144_2310 = new ChoppyItemFixClass(hardwarerenderer_1, this);
		int i_2;
		for (i_2 = 0; i_2 < 7; i_2++) {
			aMeshRasterizer_Sub2Array2339[i_2] = new MeshRasterizer_Sub2(aGraphicalRenderer_Sub3_2320);
			aMeshRasterizer_Sub2Array2340[i_2] = new MeshRasterizer_Sub2(aGraphicalRenderer_Sub3_2320);
		}
		anIntArray2329 = new int[MeshRasterizer_Sub2.anInt8562];
		for (i_2 = 0; i_2 < MeshRasterizer_Sub2.anInt8562; i_2++) {
			anIntArray2329[i_2] = -1;
		}
	}

	public static void resetSounds() {
		for (int i_1 = 0; i_1 < Class260.SOUNDS_SIZE; i_1++) {
			AreadSound sound = Class260.SOUNDS[i_1];
			if (sound.type == 3) {
				QuickchatFiller.method1142(sound);
			}
		}
	}

	public void method3070(Runnable runnable_1) {
		aRunnable2343 = runnable_1;
	}

	public void method3071() {
		aClass144_2310 = new ChoppyItemFixClass(aGraphicalRenderer_Sub3_2320, this);
	}
}
