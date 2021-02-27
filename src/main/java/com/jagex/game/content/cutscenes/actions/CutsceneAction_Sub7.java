package com.jagex.game.content.cutscenes.actions;

import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class82;

public class CutsceneAction_Sub7 extends CutsceneAction {

	public int anInt9177;
	public String aString9175;
	public int anInt9176;
	public int anInt9174;

	public CutsceneAction_Sub7(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9177 = rsbytebuffer_1.readUnsignedShort();
		aString9175 = rsbytebuffer_1.readString();
		anInt9176 = rsbytebuffer_1.readInt();
		anInt9174 = rsbytebuffer_1.readUnsignedShort();
	}

	@Override
	public void method1592() {
		Class82.CUTSCENE_ENTITIES[anInt9177].method1342().method15875(aString9175, anInt9176, 0, anInt9174);
	}

	public void method1601() {
		Class82.CUTSCENE_ENTITIES[411942041 * anInt9177 * -711272535].method1342().method15875(aString9175, 369590275 * anInt9176 * -637588821, 0, anInt9174 * -1631359867 * -171725747);
	}

}
