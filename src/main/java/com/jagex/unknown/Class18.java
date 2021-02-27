package com.jagex.unknown;

import com.jagex.*;
import com.jagex.client.js5.defs.MapAreaDefinitions;
import com.jagex.client.render.AbstractRenderer;

public class Class18 {

	public Class18() throws Throwable {
		throw new Error();
	}

	public static void method571() {
		HintArrow.aClass229_2245.method3863();
	}

	public static void renderInformation(AbstractRenderer graphicalrenderer_0, NodeCollection nodecollection_1) {
		QuickChatMessage.aClass482_4049.removeAll();
		if (!Class291_Sub1.aBool8027) {
			for (Node_Sub36 class282_sub36_5 = (Node_Sub36) nodecollection_1.head(); class282_sub36_5 != null; class282_sub36_5 = (Node_Sub36) nodecollection_1.next()) {
				MapAreaDefinitions worldmapareadefs_6 = Class291_Sub1.MAP_AREA_LOADER.getWorldMapDefs(class282_sub36_5.anInt7991);
				if (Node_Sub16.method12248(worldmapareadefs_6)) {
					boolean bool_7 = MapAreaDefinitions.renderIconsAndNames(graphicalrenderer_0, class282_sub36_5, worldmapareadefs_6);
					if (bool_7) {
						Node_Sub39.method13297(graphicalrenderer_0, class282_sub36_5, worldmapareadefs_6);
					}
				}
			}
		}
	}

	public static void method574() {
	}
}
