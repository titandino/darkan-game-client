package com.jagex.unknown;

import com.jagex.LRUCache;
import com.jagex.RenderFlagMap;
import com.jagex.client.cache.CacheableNode_Sub15;
import com.jagex.client.js5.IndexLoaders;
import com.jagex.client.route.RouteStrategies;

public class Class13 {

	public static int anInt128;

	public static String[] aStringArray129;

	public static int anInt130;

	public static LRUCache aClass229_127 = new LRUCache(32);

	public Class13() throws Throwable {
		throw new Error();
	}

	public static void method503(CacheableNode_Sub15 class282_sub50_sub15_0) {
		boolean bool_2 = false;
		class282_sub50_sub15_0.method13452();
		for (CacheableNode_Sub15 class282_sub50_sub15_3 = (CacheableNode_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_3 != null; class282_sub50_sub15_3 = (CacheableNode_Sub15) Class20.aClass477_182.method7955()) {
			if (Class301.method5334(class282_sub50_sub15_0.method15244(), class282_sub50_sub15_3.method15244())) {
				RouteStrategies.method3782(class282_sub50_sub15_0, class282_sub50_sub15_3);
				bool_2 = true;
				break;
			}
		}
		if (!bool_2) {
			Class20.aClass477_182.method7936(class282_sub50_sub15_0);
		}
	}

	public static int method507(int i_0, int i_1, int i_2, int i_3, int i_4) {
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() == null) {
			return 0;
		} else if (i_4 < 3) {
			RenderFlagMap regionmap_6 = IndexLoaders.MAP_REGION_DECODER.getRenderFlags();
			int i_7 = i_0 >> 9;
			int i_8 = i_1 >> 9;
			if (i_2 >= 0 && i_3 >= 0 && i_2 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1 && i_3 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1) {
				if (i_7 >= 1 && i_8 >= 1 && i_7 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1 && i_8 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1) {
					boolean bool_9 = (regionmap_6.tileMasks[1][i_0 >> 9][i_1 >> 9] & 0x2) != 0;
					boolean bool_10;
					boolean bool_11;
					if ((i_0 & 0x1ff) == 0) {
						bool_10 = (regionmap_6.tileMasks[1][i_7 - 1][i_1 >> 9] & 0x2) != 0;
						bool_11 = (regionmap_6.tileMasks[1][i_7][i_1 >> 9] & 0x2) != 0;
						if (bool_11 != bool_10) {
							bool_9 = (regionmap_6.tileMasks[1][i_2][i_3] & 0x2) != 0;
						}
					}
					if ((i_1 & 0x1ff) == 0) {
						bool_10 = (regionmap_6.tileMasks[1][i_0 >> 9][i_8 - 1] & 0x2) != 0;
						bool_11 = (regionmap_6.tileMasks[1][i_0 >> 9][i_8] & 0x2) != 0;
						if (bool_10 != bool_11) {
							bool_9 = (regionmap_6.tileMasks[1][i_2][i_3] & 0x2) != 0;
						}
					}
					if (bool_9) {
						++i_4;
					}
					return IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aGroundArray2591[i_4].averageHeight(i_0, i_1);
				} else {
					return 0;
				}
			} else {
				return 0;
			}
		} else {
			return IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aGroundArray2591[i_4].averageHeight(i_0, i_1);
		}
	}

	public static void method508(boolean bool_0, boolean bool_1) {
		if (bool_0) {
			--Class540.anInt7137;
			if (Class540.anInt7137 == 0) {
				Class335.HSL_TO_RGB = null;
			}
		}
		if (bool_1) {
			--Class540.anInt7135;
			if (Class540.anInt7135 == 0) {
				Class540.anIntArray7136 = null;
			}
		}
	}
}
