package com.jagex.client.js5.defs;

import com.jagex.net.io.ByteBuf;

public class LightIntensityDefinitions {

	public int anInt4986;
	public int anInt4987;
	public int anInt4988 = 2048;
	public int anInt4989 = 2048;

	public void method6999(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			method7004(rsbytebuffer_1, i_3);
		}
	}

	public void method7004(ByteBuf rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			anInt4986 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 2) {
			anInt4989 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 3) {
			anInt4988 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 4) {
			anInt4987 = rsbytebuffer_1.readShort();
		}

	}

}
