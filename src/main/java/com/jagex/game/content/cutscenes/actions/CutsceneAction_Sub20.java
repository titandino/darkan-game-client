package com.jagex.game.content.cutscenes.actions;

import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class404;
import com.jagex.unknown.Class466;
import com.jagex.unknown.Class82;

public class CutsceneAction_Sub20 extends CutsceneAction {

	public static ByteBuf WORLD_LIST_BUFFER;

	public int anInt9414;

	public CutsceneAction_Sub20(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9414 = rsbytebuffer_1.readUnsignedShort();
	}

	public static Class466 method14668() {
		return Class404.aClass466_4831 == null ? Class466.aClass466_5569 : Class404.aClass466_4831;
	}

	public void method1601() {
		Class82.CUTSCENE_ENTITIES[1703207571 * anInt9414 * 1116179355].method1337();
	}

	@Override
	public void method1592() {
		Class82.CUTSCENE_ENTITIES[anInt9414].method1337();
	}
}
