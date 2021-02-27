package com.jagex.client.cache;

import java.lang.ref.SoftReference;

public class CacheableNode_Sub1_Sub2 extends CacheableNode_Sub1 {

	public SoftReference aSoftReference10403;

	public CacheableNode_Sub1_Sub2(Object object_1, int i_2) {
		super(i_2);
		aSoftReference10403 = new SoftReference(object_1);
	}

	@Override
	public boolean method14694() {
		return true;
	}

	@Override
	public Object method14692() {
		return aSoftReference10403.get();
	}

	@Override
	public boolean method14691() {
		return true;
	}

	@Override
	public Object method14693() {
		return aSoftReference10403.get();
	}

}
