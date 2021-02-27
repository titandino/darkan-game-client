package com.jagex.unknown;

import com.jagex.Interface23;
import com.jagex.client.render.AbstractRenderer;
import com.jagex.client.render.NativeSprite;

public class Class502 implements Interface23 {

	public static Class253 aClass253_5830;
	public AbstractRenderer aAbstractRenderer_5829;

	@Override
	public NativeSprite method164(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
		return aAbstractRenderer_5829.createSprite(ints_1, i_2, i_3, i_4, i_5, false);
	}

	@Override
	public NativeSprite method163(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
		return aAbstractRenderer_5829.createSprite(ints_1, i_2, i_3, i_4, i_5, false);
	}

	@Override
	public NativeSprite method162(int[] ints_1, int i_3, int i_4, int i_5) {
		return aAbstractRenderer_5829.createSprite(ints_1, 0, i_3, i_4, i_5, false);
	}

}
