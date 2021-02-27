package com.jagex.client.js5.defs;

import com.jagex.Node_Sub33;
import com.jagex.game.content.cutscenes.CutsceneEntity;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class148;

public class VarBitDefinitions implements Definition {

	public int baseVar;
	public int startBit;
	public int endBit;

	public static void method3805() {
		Class148.aNode_Sub15_Sub2_1735.method15101();
		Class148.anInt1730 = 1;
		CutsceneEntity.aClass317_746 = null;
		Node_Sub33.aNode_Sub15_Sub2_7836 = null;
	}

	public void method3795(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			method3796(rsbytebuffer_1, i_3);
		}
	}

	public void method3796(ByteBuf rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			baseVar = rsbytebuffer_1.readUnsignedShort();
			startBit = rsbytebuffer_1.readUnsignedByte();
			endBit = rsbytebuffer_1.readUnsignedByte();
		}
	}
}
