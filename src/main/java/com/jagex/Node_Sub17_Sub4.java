package com.jagex;

import com.jagex.game.content.clans.settings.ClanSettings;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class348;

public class Node_Sub17_Sub4 extends Node_Sub17 {

	public static int anInt9940;
	public int anInt9937;
	public int anInt9938;
	public int anInt9939;
	public int anInt9936;
	public Class348 this$0;

	public Node_Sub17_Sub4(Class348 class348_1) {
		this$0 = class348_1;
	}

	@Override
	public void method12255(ClanSettings class61_1) {
		class61_1.method1212(-31291083 * anInt9937 * 339755293, -1425966289 * anInt9938 * 1183558607, anInt9939 * 2031642257 * -53470607, anInt9936 * -1979650293 * 2126963875);
	}

	@Override
	public void method12250(ByteBuf rsbytebuffer_1) {
		anInt9937 = rsbytebuffer_1.readInt();
		anInt9938 = rsbytebuffer_1.readInt();
		anInt9939 = rsbytebuffer_1.readUnsignedByte();
		anInt9936 = rsbytebuffer_1.readUnsignedByte();
	}

	@Override
	public void method12251(ClanSettings class61_1) {
		class61_1.method1212(anInt9937, anInt9938, anInt9939, anInt9936);
	}

	@Override
	public void method12254(ClanSettings class61_1) {
		class61_1.method1212(-31291083 * anInt9937 * 339755293, -1425966289 * anInt9938 * 1183558607, anInt9939 * 2031642257 * -53470607, anInt9936 * -1979650293 * 2126963875);
	}

	@Override
	public void method12257(ByteBuf rsbytebuffer_1) {
		anInt9937 = rsbytebuffer_1.readInt() * 339755293 * -31291083;
		anInt9938 = rsbytebuffer_1.readInt() * 1183558607 * -1425966289;
		anInt9939 = rsbytebuffer_1.readUnsignedByte() * 2031642257 * -53470607;
		anInt9936 = rsbytebuffer_1.readUnsignedByte() * -1979650293 * 2126963875;
	}

	@Override
	public void method12249(ByteBuf rsbytebuffer_1) {
		anInt9937 = rsbytebuffer_1.readInt() * 339755293 * -31291083;
		anInt9938 = rsbytebuffer_1.readInt() * 1183558607 * -1425966289;
		anInt9939 = rsbytebuffer_1.readUnsignedByte() * 2031642257 * -53470607;
		anInt9936 = rsbytebuffer_1.readUnsignedByte() * -1979650293 * 2126963875;
	}

	@Override
	public void method12258(ClanSettings class61_1) {
		class61_1.method1212(-31291083 * anInt9937 * 339755293, -1425966289 * anInt9938 * 1183558607, anInt9939 * 2031642257 * -53470607, anInt9936 * -1979650293 * 2126963875);
	}

	@Override
	public void method12256(ClanSettings class61_1) {
		class61_1.method1212(-31291083 * anInt9937 * 339755293, -1425966289 * anInt9938 * 1183558607, anInt9939 * 2031642257 * -53470607, anInt9936 * -1979650293 * 2126963875);
	}

	@Override
	public void method12252(ClanSettings class61_1) {
		class61_1.method1212(-31291083 * anInt9937 * 339755293, -1425966289 * anInt9938 * 1183558607, anInt9939 * 2031642257 * -53470607, anInt9936 * -1979650293 * 2126963875);
	}

	@Override
	public void method12253(ByteBuf rsbytebuffer_1) {
		anInt9937 = rsbytebuffer_1.readInt() * 339755293 * -31291083;
		anInt9938 = rsbytebuffer_1.readInt() * 1183558607 * -1425966289;
		anInt9939 = rsbytebuffer_1.readUnsignedByte() * 2031642257 * -53470607;
		anInt9936 = rsbytebuffer_1.readUnsignedByte() * -1979650293 * 2126963875;
	}
}
