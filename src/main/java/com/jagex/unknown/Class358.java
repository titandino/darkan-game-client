package com.jagex.unknown;

import com.jagex.Friend;
import com.jagex.HitsplatIndexLoader;
import com.jagex.Node_Sub33;
import com.jagex.game.content.cutscenes.CutsceneEntity;
import com.jagex.game.content.cutscenes.actions.CutsceneAction_Sub22;
import com.jagex.net.io.ByteBuf;

public class Class358 {

	public static Class358 aClass358_4158 = new Class358("12");
	public static Class358 aClass358_4144 = new Class358("21");
	public static Class358 aClass358_4136 = new Class358("9");
	public static Class358 aClass358_4126 = new Class358("24");
	public static Class358 aClass358_4127 = new Class358("15");
	public static Class358 aClass358_4140 = new Class358("8");
	public static Class358 aClass358_4129 = new Class358("18");
	public static Class358 aClass358_4125 = new Class358("16");
	public static Class358 aClass358_4142 = new Class358("6");
	public static Class358 aClass358_4150 = new Class358("35");
	public static Class358 aClass358_4133 = new Class358("14");
	public static Class358 aClass358_4156 = new Class358("5");
	public static Class358 aClass358_4137 = new Class358("31");
	public static Class358 aClass358_4128 = new Class358("23");
	public static Class358 aClass358_4151 = new Class358("10");
	public static Class358 aClass358_4138 = new Class358("34");
	public static Class358 aClass358_4139 = new Class358("33");
	public static Class358 aClass358_4135 = new Class358("2");
	public static Class358 aClass358_4141 = new Class358("25");
	public static Class358 aClass358_4134 = new Class358("11");
	public static Class358 aClass358_4145 = new Class358("29");
	public static Class358 aClass358_4146 = new Class358("1");
	public static Class358 aClass358_4147 = new Class358("26");
	public static Class358 aClass358_4148 = new Class358("4");
	public static Class358 aClass358_4143 = new Class358("28");
	public static Class358 aClass358_4131 = new Class358("20");
	public static Class358 aClass358_4149 = new Class358("32");
	public static Class358 aClass358_4152 = new Class358("22");
	public static Class358 aClass358_4153 = new Class358("27");
	public static Class358 aClass358_4154 = new Class358("17");
	public static Class358 aClass358_4155 = new Class358("3");
	public static Class358 aClass358_4130 = new Class358("30");
	public static Class358 aClass358_4157 = new Class358("13");
	public static Class358 aClass358_4132 = new Class358("7");

	public String aString4159;

	public Class358(String string_2) {
		aString4159 = string_2;
	}

	public static void method6234() {
		Class299.aClass229_3545.method3859();
	}

	public static void method6235(byte[] bytes_0) {
		ByteBuf rsbytebuffer_2 = new ByteBuf(bytes_0);
		while (true) {
			int i_3 = rsbytebuffer_2.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			if (i_3 == 1) {
				int[] ints_4 = HitsplatIndexLoader.anIntArray2668 = new int[6];
				ints_4[0] = rsbytebuffer_2.readUnsignedShort();
				ints_4[1] = rsbytebuffer_2.readUnsignedShort();
				ints_4[2] = rsbytebuffer_2.readUnsignedShort();
				ints_4[3] = rsbytebuffer_2.readUnsignedShort();
				ints_4[4] = rsbytebuffer_2.readUnsignedShort();
				ints_4[5] = rsbytebuffer_2.readUnsignedShort();
			}
		}
	}

	public static void method6240() {
		Class148.anInt1730 = 1;
		CutsceneEntity.aClass317_746 = null;
		Friend.anInt46 = -1;
		Class148.anInt1738 = -1;
		Node_Sub33.aNode_Sub15_Sub2_7836 = null;
		Class158_Sub2_Sub3.anInt10243 = 0;
		Class152.aBool1962 = false;
		CutsceneAction_Sub22.anInt9440 = 2;
		Class11.aClass109_121 = null;
	}
}
