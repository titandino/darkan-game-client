package com.jagex.game.content.cutscenes.actions;

import com.jagex.client.prefs.impl.BrightnessPreference;
import com.jagex.net.io.ByteBuf;

public class SendFinishedCutsceneAction extends CutsceneAction {

	public static int anInt8307;
	public static int anInt8308;

	public SendFinishedCutsceneAction(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
	}

	public void method1601() {
		BrightnessPreference.method12869(true);
	}

	@Override
	public void method1592() {
		BrightnessPreference.method12869(true);
	}

}
