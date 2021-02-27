package com.jagex.client.js5.defs.models.materials;

import com.jagex.unknown.Class316;
import com.jagex.unknown.Class503;

public class MaterialProp3 extends MaterialProperty {

	public MaterialProp3() {
		super(0, true);
	}

	@Override
	public int[] method12319(int i_1) {
		int[] ints_3 = aClass320_7667.method5721(i_1);
		if (aClass320_7667.aBool3722) {
			Class503.method8365(ints_3, 0, Class316.anInt3670, Class316.anIntArray3668[i_1]);
		}
		return ints_3;
	}
}
