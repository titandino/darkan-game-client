package com.jagex;

import com.jagex.game.content.clans.settings.ClanSettings;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class348;

public class Node_Sub17_Sub13 extends Node_Sub17 {

	public int anInt10213;
	public int anInt10214;
	public Class348 this$0;

	public Node_Sub17_Sub13(Class348 class348_1) {
		this$0 = class348_1;
	}

	@Override
	public void method12252(ClanSettings class61_1) {
		class61_1.method1222(-1921394989 * anInt10213 * 322761051, anInt10214 * 551899093 * 1495232893);
	}

	@Override
	public void method12250(ByteBuf rsbytebuffer_1) {
		anInt10213 = rsbytebuffer_1.readInt();
		anInt10214 = rsbytebuffer_1.readInt();
	}

	@Override
	public void method12251(ClanSettings class61_1) {
		class61_1.method1222(anInt10213, anInt10214);
	}

	@Override
	public void method12249(ByteBuf rsbytebuffer_1) {
		anInt10213 = rsbytebuffer_1.readInt() * 322761051 * -1921394989;
		anInt10214 = rsbytebuffer_1.readInt() * 551899093 * 1495232893;
	}

	@Override
	public void method12253(ByteBuf rsbytebuffer_1) {
		anInt10213 = rsbytebuffer_1.readInt() * 322761051 * -1921394989;
		anInt10214 = rsbytebuffer_1.readInt() * 551899093 * 1495232893;
	}

	@Override
	public void method12254(ClanSettings class61_1) {
		class61_1.method1222(-1921394989 * anInt10213 * 322761051, anInt10214 * 551899093 * 1495232893);
	}

	@Override
	public void method12258(ClanSettings class61_1) {
		class61_1.method1222(-1921394989 * anInt10213 * 322761051, anInt10214 * 551899093 * 1495232893);
	}

	@Override
	public void method12255(ClanSettings class61_1) {
		class61_1.method1222(-1921394989 * anInt10213 * 322761051, anInt10214 * 551899093 * 1495232893);
	}

	@Override
	public void method12256(ClanSettings class61_1) {
		class61_1.method1222(-1921394989 * anInt10213 * 322761051, anInt10214 * 551899093 * 1495232893);
	}

	@Override
	public void method12257(ByteBuf rsbytebuffer_1) {
		anInt10213 = rsbytebuffer_1.readInt() * 322761051 * -1921394989;
		anInt10214 = rsbytebuffer_1.readInt() * 551899093 * 1495232893;
	}

}
