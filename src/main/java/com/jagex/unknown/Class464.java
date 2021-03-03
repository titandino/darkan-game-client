package com.jagex.unknown;

import com.jagex.ComponentType;
import com.jagex.EntityNode_Sub1;
import com.jagex.SubInterface;
import com.jagex.client.anims.Animation_Sub1;
import com.jagex.client.client;
import com.jagex.client.cs2.CS2Interface;
import com.jagex.client.js5.defs.IComponentDefinitions;

public class Class464 {

	public static boolean aBool5556;
	public static String aString5555;
	public EntityNode_Sub1 aEntityNode_Sub1_5554 = new EntityNode_Sub1();
	EntityNode_Sub1 aEntityNode_Sub1_5553;

	public Class464() {
		aEntityNode_Sub1_5554.aEntityNode_Sub1_7706 = aEntityNode_Sub1_5554;
		aEntityNode_Sub1_5554.aEntityNode_Sub1_7707 = aEntityNode_Sub1_5554;
	}

	public static void method7743(IComponentDefinitions[] arr_0, int i_1) {
		for (int i_3 = 0; i_3 < arr_0.length; i_3++) {
			IComponentDefinitions icomponentdefinitions_4 = arr_0[i_3];
			if (icomponentdefinitions_4 != null && icomponentdefinitions_4.parent == i_1 && !client.method11651(icomponentdefinitions_4)) {
				if (icomponentdefinitions_4.type == ComponentType.CONTAINER) {
					method7743(arr_0, icomponentdefinitions_4.idHash);
					if (icomponentdefinitions_4.itemSlots != null) {
						method7743(icomponentdefinitions_4.itemSlots, icomponentdefinitions_4.idHash);
					}
					SubInterface class282_sub44_5 = (SubInterface) client.OPEN_INTERFACES.get(icomponentdefinitions_4.idHash);
					if (class282_sub44_5 != null) {
						CS2Interface.method8777(class282_sub44_5.interfaceId);
					}
				}
				if (icomponentdefinitions_4.type == ComponentType.MODEL && icomponentdefinitions_4.animation != -1) {
					if (icomponentdefinitions_4.anim == null) {
						icomponentdefinitions_4.anim = new Animation_Sub1();
						icomponentdefinitions_4.anim.update(icomponentdefinitions_4.animation);
					}
					if (icomponentdefinitions_4.anim.setupLoop(client.anInt7261) && icomponentdefinitions_4.anim.method7580()) {
						icomponentdefinitions_4.anim.resetAnimation();
					}
				}
			}
		}
	}

	public EntityNode_Sub1 method7731() {
		EntityNode_Sub1 class275_sub1_2 = aEntityNode_Sub1_5554.aEntityNode_Sub1_7706;
		if (class275_sub1_2 == aEntityNode_Sub1_5554) {
			aEntityNode_Sub1_5553 = null;
			return null;
		} else {
			aEntityNode_Sub1_5553 = class275_sub1_2.aEntityNode_Sub1_7706;
			return class275_sub1_2;
		}
	}

	public EntityNode_Sub1 method7734() {
		EntityNode_Sub1 class275_sub1_2 = aEntityNode_Sub1_5553;
		if (class275_sub1_2 == aEntityNode_Sub1_5554) {
			aEntityNode_Sub1_5553 = null;
			return null;
		} else {
			aEntityNode_Sub1_5553 = class275_sub1_2.aEntityNode_Sub1_7706;
			return class275_sub1_2;
		}
	}

	public void method7735(EntityNode_Sub1 class275_sub1_1) {
		if (class275_sub1_1.aEntityNode_Sub1_7707 != null) {
			class275_sub1_1.method12423();
		}
		class275_sub1_1.aEntityNode_Sub1_7707 = aEntityNode_Sub1_5554.aEntityNode_Sub1_7707;
		class275_sub1_1.aEntityNode_Sub1_7706 = aEntityNode_Sub1_5554;
		class275_sub1_1.aEntityNode_Sub1_7707.aEntityNode_Sub1_7706 = class275_sub1_1;
		class275_sub1_1.aEntityNode_Sub1_7706.aEntityNode_Sub1_7707 = class275_sub1_1;
	}

	public int method7736() {
		int i_2 = 0;
		for (EntityNode_Sub1 class275_sub1_3 = aEntityNode_Sub1_5554.aEntityNode_Sub1_7706; class275_sub1_3 != aEntityNode_Sub1_5554; class275_sub1_3 = class275_sub1_3.aEntityNode_Sub1_7706) {
			++i_2;
		}
		return i_2;
	}

	public void method7740() {
		while (true) {
			EntityNode_Sub1 class275_sub1_2 = aEntityNode_Sub1_5554.aEntityNode_Sub1_7706;
			if (class275_sub1_2 == aEntityNode_Sub1_5554) {
				aEntityNode_Sub1_5553 = null;
				return;
			}
			class275_sub1_2.method12423();
		}
	}
}
