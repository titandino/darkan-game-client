package com.jagex.client.js5.defs.models.materials;

import com.jagex.PulseEvent;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class316;

public class MaterialProp26 extends MaterialProperty {

	public int anInt9805;
	public int anInt9803 = 4096;

	public MaterialProp26() {
		super(1, true);
	}

	public static void method15264(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(1, i_0);
		class282_sub50_sub12_2.method14965();
	}

	@Override
	public int[] method12319(int i_1) {
		int[] ints_3 = aClass320_7667.method5721(i_1);
		if (aClass320_7667.aBool3722) {
			int[] ints_4 = method12317(0, i_1);

			for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
				int i_6 = ints_4[i_5];
				ints_3[i_5] = i_6 >= anInt9805 && i_6 <= anInt9803 ? 4096 : 0;
			}
		}

		return ints_3;
	}

	@Override
	public void decode(int i_1, ByteBuf rsbytebuffer_2) {
		switch (i_1) {
			case 0:
				anInt9805 = rsbytebuffer_2.readUnsignedShort();
				break;
			case 1:
				anInt9803 = rsbytebuffer_2.readUnsignedShort();
		}

	}

}
