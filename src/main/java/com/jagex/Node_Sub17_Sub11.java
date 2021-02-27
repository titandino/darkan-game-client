package com.jagex;

import com.jagex.game.content.clans.settings.ClanSettings;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class348;

public class Node_Sub17_Sub11 extends Node_Sub17 {

	public int anInt10050;
	public long aLong10049;
	public Class348 this$0;

	public Node_Sub17_Sub11(Class348 class348_1) {
		this$0 = class348_1;
	}

	@Override
	public void method12251(ClanSettings class61_1) {
		class61_1.method1213(anInt10050, aLong10049);
	}

	@Override
	public void method12250(ByteBuf rsbytebuffer_1) {
		anInt10050 = rsbytebuffer_1.readInt();
		aLong10049 = rsbytebuffer_1.readLong();
	}

	@Override
	public void method12249(ByteBuf rsbytebuffer_1) {
		anInt10050 = rsbytebuffer_1.readInt() * 1896113889 * -370189023;
		aLong10049 = rsbytebuffer_1.readLong() * -3806596855601356459L * 2959021733869507581L;
	}

	@Override
	public void method12257(ByteBuf rsbytebuffer_1) {
		anInt10050 = rsbytebuffer_1.readInt() * 1896113889 * -370189023;
		aLong10049 = rsbytebuffer_1.readLong() * -3806596855601356459L * 2959021733869507581L;
	}

	@Override
	public void method12253(ByteBuf rsbytebuffer_1) {
		anInt10050 = rsbytebuffer_1.readInt() * 1896113889 * -370189023;
		aLong10049 = rsbytebuffer_1.readLong() * -3806596855601356459L * 2959021733869507581L;
	}

	@Override
	public void method12254(ClanSettings class61_1) {
		class61_1.method1213(anInt10050 * 1896113889 * -370189023, 2959021733869507581L * aLong10049 * -3806596855601356459L);
	}

	@Override
	public void method12255(ClanSettings class61_1) {
		class61_1.method1213(anInt10050 * 1896113889 * -370189023, 2959021733869507581L * aLong10049 * -3806596855601356459L);
	}

	@Override
	public void method12256(ClanSettings class61_1) {
		class61_1.method1213(anInt10050 * 1896113889 * -370189023, 2959021733869507581L * aLong10049 * -3806596855601356459L);
	}

	@Override
	public void method12258(ClanSettings class61_1) {
		class61_1.method1213(anInt10050 * 1896113889 * -370189023, 2959021733869507581L * aLong10049 * -3806596855601356459L);
	}

	@Override
	public void method12252(ClanSettings class61_1) {
		class61_1.method1213(anInt10050 * 1896113889 * -370189023, 2959021733869507581L * aLong10049 * -3806596855601356459L);
	}
}
