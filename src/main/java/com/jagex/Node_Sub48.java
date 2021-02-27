package com.jagex;

import com.jagex.client.client;
import com.jagex.client.js5.defs.NPCDefinitions;
import com.jagex.client.js5.defs.ObjectDefinition;
import com.jagex.unknown.Class149_Sub2;
import com.jagex.unknown.Class158_Sub1;
import com.jagex.unknown.Class79;
import com.jagex.unknown.Class86;

public class Node_Sub48 extends Node {

	public static NodeCollection aClass482_8073 = new NodeCollection();
	public static NodeCollection aClass482_8074 = new NodeCollection();
	public static IterableNodeMap aClass465_8075 = new IterableNodeMap(16);
	public int anInt8076;
	public int anInt8077;
	public int anInt8078;
	public int anInt8079;
	public int anInt8080;
	public NPCEntity aTransform_Sub1_Sub1_Sub2_Sub2_8085;
	public PlayerEntity aTransform_Sub1_Sub1_Sub2_Sub1_8086;
	public MIDIInstrument aNode_Sub18_8087;
	public boolean aBool8092;
	public Node_Sub15_Sub5 aNode_Sub15_Sub5_8096;
	public ObjectDefinition aClass478_8104;
	public Node_Sub26_Sub1_Sub1 aNode_Sub26_Sub1_Sub1_8106;
	public int anInt8107;
	public int soundEffectId;
	public boolean aBool8098;
	public int anInt8105;
	public int anInt8081;
	public int anInt8089;
	public int anInt8094;
	public int anInt8093;
	public int anInt8072;
	public int anInt8101;
	public int[] anIntArray8102;
	public boolean aBool8103;
	public Node_Sub15_Sub5 aNode_Sub15_Sub5_8099;
	public Node_Sub26_Sub1_Sub1 aNode_Sub26_Sub1_Sub1_8082;
	public MIDIInstrument aNode_Sub18_8097;
	public int anInt8091;

	public void method13426() {
		int i_2 = soundEffectId;
		boolean bool_3 = aBool8098;
		if (aClass478_8104 != null) {
			ObjectDefinition objectdefinitions_4 = aClass478_8104.getMultiLoc(client.anInt7341 == 4 ? Class86.anInterface42_832 : Class158_Sub1.PLAYER_VAR_PROVIDER);
			if (objectdefinitions_4 != null) {
				soundEffectId = objectdefinitions_4.ambientSoundId;
				aBool8098 = objectdefinitions_4.aBool5696;
				anInt8105 = objectdefinitions_4.ambientSoundHearDistance << 9;
				anInt8089 = objectdefinitions_4.ambientSoundVolume;
				anInt8072 = objectdefinitions_4.anInt5667;
				anInt8101 = objectdefinitions_4.anInt5698;
				anIntArray8102 = objectdefinitions_4.audioTracks;
				aBool8103 = objectdefinitions_4.aBool5700;
				anInt8094 = objectdefinitions_4.anInt5709;
				anInt8093 = objectdefinitions_4.anInt5708;
			} else {
				soundEffectId = -1;
				aBool8098 = false;
				anInt8105 = 0;
				anInt8089 = 0;
				anInt8072 = 0;
				anInt8101 = 0;
				anIntArray8102 = null;
				aBool8103 = false;
				anInt8094 = 256;
				anInt8093 = 256;
				anInt8081 = 0;
			}
		} else if (aTransform_Sub1_Sub1_Sub2_Sub2_8085 != null) {
			int i_6 = RankSetting.method15433(aTransform_Sub1_Sub1_Sub2_Sub2_8085);
			if (i_2 != i_6) {
				soundEffectId = i_6;
				NPCDefinitions npcdefinitions_5 = aTransform_Sub1_Sub1_Sub2_Sub2_8085.definitions;
				if (npcdefinitions_5.transformTo != null) {
					npcdefinitions_5 = npcdefinitions_5.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
				}
				if (npcdefinitions_5 != null) {
					anInt8105 = npcdefinitions_5.specialByte << 9;
					anInt8081 = npcdefinitions_5.anInt4908 << 9;
					anInt8089 = npcdefinitions_5.anInt4909;
					aBool8098 = npcdefinitions_5.aBool4872;
					anInt8094 = npcdefinitions_5.anInt4919;
					anInt8093 = npcdefinitions_5.anInt4911;
				} else {
					anInt8081 = 0;
					anInt8105 = 0;
					anInt8089 = 0;
					aBool8098 = aTransform_Sub1_Sub1_Sub2_Sub2_8085.definitions.aBool4872;
					anInt8094 = 256;
					anInt8093 = 256;
				}
			}
		} else if (aTransform_Sub1_Sub1_Sub2_Sub1_8086 != null) {
			soundEffectId = Class149_Sub2.method14610(aTransform_Sub1_Sub1_Sub2_Sub1_8086);
			aBool8098 = aTransform_Sub1_Sub1_Sub2_Sub1_8086.isTransformedNPC;
			anInt8105 = aTransform_Sub1_Sub1_Sub2_Sub1_8086.isNpc << 9;
			anInt8081 = 0;
			anInt8089 = aTransform_Sub1_Sub1_Sub2_Sub1_8086.specialByte;
			anInt8094 = 256;
			anInt8093 = 256;
		}
		if ((i_2 != soundEffectId || bool_3 != aBool8098) && aNode_Sub15_Sub5_8099 != null) {
			Class79.aNode_Sub15_Sub4_783.method15276(aNode_Sub15_Sub5_8099);
			aNode_Sub15_Sub5_8099 = null;
			aNode_Sub26_Sub1_Sub1_8082 = null;
			aNode_Sub18_8097 = null;
		}
	}
}
