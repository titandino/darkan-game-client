package com.jagex;

import com.jagex.client.render.font.FontMetrics;
import com.jagex.game.content.clans.settings.ClanSettings;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class348;

public class Node_Sub17_Sub2 extends Node_Sub17 {

	public static boolean[] IS_VARC_SAVE_TO_FILE;
	public static FontMetrics aClass414_9933;
	public int anInt9932;
	public Class348 this$0;

	public Node_Sub17_Sub2(Class348 class348_1) {
		this$0 = class348_1;
		anInt9932 = -1;
	}

	@Override
	public void method12252(ClanSettings class61_1) {
		class61_1.method1233(-518396991 * anInt9932 * 390605889);
	}

	@Override
	public void method12250(ByteBuf rsbytebuffer_1) {
		anInt9932 = rsbytebuffer_1.readUnsignedShort();
	}

	@Override
	public void method12257(ByteBuf rsbytebuffer_1) {
		anInt9932 = rsbytebuffer_1.readUnsignedShort() * 390605889 * -518396991;
	}

	@Override
	public void method12249(ByteBuf rsbytebuffer_1) {
		anInt9932 = rsbytebuffer_1.readUnsignedShort() * 390605889 * -518396991;
	}

	@Override
	public void method12253(ByteBuf rsbytebuffer_1) {
		anInt9932 = rsbytebuffer_1.readUnsignedShort() * 390605889 * -518396991;
	}

	@Override
	public void method12254(ClanSettings class61_1) {
		class61_1.method1233(-518396991 * anInt9932 * 390605889);
	}

	@Override
	public void method12255(ClanSettings class61_1) {
		class61_1.method1233(-518396991 * anInt9932 * 390605889);
	}

	@Override
	public void method12256(ClanSettings class61_1) {
		class61_1.method1233(-518396991 * anInt9932 * 390605889);
	}

	@Override
	public void method12258(ClanSettings class61_1) {
		class61_1.method1233(-518396991 * anInt9932 * 390605889);
	}

	@Override
	public void method12251(ClanSettings class61_1) {
		class61_1.method1233(anInt9932);
	}

}
