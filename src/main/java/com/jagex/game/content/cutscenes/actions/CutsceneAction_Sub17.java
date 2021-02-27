package com.jagex.game.content.cutscenes.actions;

import com.jagex.PulseEvent;
import com.jagex.client.js5.defs.ParticleProducerDefinition;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class4;
import com.jagex.unknown.Class504;

public class CutsceneAction_Sub17 extends CutsceneAction {

	public int anInt9385;

	public int anInt9386;

	public String aString9387;

	public int anInt9388;

	public int anInt9389;

	public CutsceneAction_Sub17(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9385 = rsbytebuffer_1.readUnsignedShort();
		anInt9386 = rsbytebuffer_1.readUnsignedShort();
		aString9387 = rsbytebuffer_1.readString();
		anInt9388 = rsbytebuffer_1.readInt();
		anInt9389 = rsbytebuffer_1.readUnsignedShort();
	}

	public static void method14656(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(20, i_0);
		class282_sub50_sub12_2.method14965();
	}

	@Override
	public void method1592() {
		ParticleProducerDefinition.method1161(Class4.MY_PLAYER_PLANE, anInt9385, anInt9386, Class504.getTerrainHeightAtPos(anInt9385, anInt9386, Class4.MY_PLAYER_PLANE), anInt9389, anInt9388, aString9387);
	}

	public void method1601() {
		ParticleProducerDefinition.method1161(Class4.MY_PLAYER_PLANE * -647602067 * 675588453, 31133705 * anInt9385 * -1930592711, anInt9386 * -621881623 * -2086575783, Class504.getTerrainHeightAtPos(31133705 * anInt9385 * -1930592711, -2086575783 * anInt9386 * -621881623, 675588453 * Class4.MY_PLAYER_PLANE * -647602067), anInt9389 * -159499065 * -469908233, anInt9388 * -1475639137 * 882611039, aString9387);
	}
}
