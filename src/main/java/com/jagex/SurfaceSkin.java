package com.jagex;

import com.jagex.client.js5.defs.ParticleArchive1Def;
import com.jagex.unknown.Class423;

public class SurfaceSkin {

	public int anInt2113;

	public SurfaceSkin aClass172_2114;

	public Matrix44 aClass384_2116;

	public int anInt2117;

	public int anInt2118;

	public int anInt2115;

	public int anInt2119;

	public SurfaceSkin(int i_1, int i_2) {
		anInt2115 = i_1;
		anInt2119 = i_2;
	}

	public SurfaceSkin method2911(int i_1) {
		return new SurfaceSkin(anInt2115, i_1);
	}

	public ParticleArchive1Def method2913() {
		return Class423.method7065(anInt2115);
	}
}
