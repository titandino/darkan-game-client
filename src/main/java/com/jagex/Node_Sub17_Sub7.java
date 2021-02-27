package com.jagex;

import com.jagex.game.content.clans.settings.ClanSettings;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class348;

public class Node_Sub17_Sub7 extends Node_Sub17 {

	public Class348 this$0;
	public int anInt10019;
	public byte aByte10020;

	public Node_Sub17_Sub7(Class348 class348_1) {
		this$0 = class348_1;
		anInt10019 = -1;
	}

	public static String method15439(byte[] bytes_0) {
		return Utils.readString(bytes_0, 0, bytes_0.length);
	}

	@Override
	public void method12258(ClanSettings class61_1) {
		class61_1.method1209(anInt10019 * -658188401 * 458516335, aByte10020);
	}

	@Override
	public void method12252(ClanSettings class61_1) {
		class61_1.method1209(anInt10019 * -658188401 * 458516335, aByte10020);
	}

	@Override
	public void method12251(ClanSettings class61_1) {
		class61_1.method1209(anInt10019, aByte10020);
	}

	@Override
	public void method12257(ByteBuf rsbytebuffer_1) {
		anInt10019 = rsbytebuffer_1.readUnsignedShort() * -658188401 * 458516335;
		aByte10020 = rsbytebuffer_1.readByte();
	}

	@Override
	public void method12253(ByteBuf rsbytebuffer_1) {
		anInt10019 = rsbytebuffer_1.readUnsignedShort() * -658188401 * 458516335;
		aByte10020 = rsbytebuffer_1.readByte();
	}

	@Override
	public void method12254(ClanSettings class61_1) {
		class61_1.method1209(anInt10019 * -658188401 * 458516335, aByte10020);
	}

	@Override
	public void method12250(ByteBuf rsbytebuffer_1) {
		anInt10019 = rsbytebuffer_1.readUnsignedShort();
		aByte10020 = rsbytebuffer_1.readByte();
	}

	@Override
	public void method12256(ClanSettings class61_1) {
		class61_1.method1209(anInt10019 * -658188401 * 458516335, aByte10020);
	}

	@Override
	public void method12249(ByteBuf rsbytebuffer_1) {
		anInt10019 = rsbytebuffer_1.readUnsignedShort() * -658188401 * 458516335;
		aByte10020 = rsbytebuffer_1.readByte();
	}

	@Override
	public void method12255(ClanSettings class61_1) {
		class61_1.method1209(anInt10019 * -658188401 * 458516335, aByte10020);
	}

}
