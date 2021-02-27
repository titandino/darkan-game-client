package com.jagex.client.cache;

import com.jagex.Interface18;
import com.jagex.client.render.NativeSprite;

import java.lang.ref.SoftReference;

public class CacheableNode_Sub8_Sub2 extends CacheableNode_Sub8 {

	public SoftReference<NativeSprite> aSoftReference10410;

	public CacheableNode_Sub8_Sub2(Interface18 interface18_1, NativeSprite object_2, int i_3) {
		super(interface18_1, i_3);
		aSoftReference10410 = new SoftReference<NativeSprite>(object_2);
	}

	@Override
	public NativeSprite method14864() {
		return aSoftReference10410.get();
	}

	@Override
	public boolean method14865() {
		return true;
	}

	@Override
	public NativeSprite method14861() {
		return aSoftReference10410.get();
	}

	@Override
	public NativeSprite method14858() {
		return aSoftReference10410.get();
	}

	@Override
	public NativeSprite method14859() {
		return aSoftReference10410.get();
	}

	@Override
	public NativeSprite method14860() {
		return aSoftReference10410.get();
	}

	@Override
	public NativeSprite method14863() {
		return aSoftReference10410.get();
	}

	@Override
	public boolean method14862() {
		return true;
	}

}
