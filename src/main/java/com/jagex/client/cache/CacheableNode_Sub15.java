package com.jagex.client.cache;

import com.jagex.Queue;
import com.jagex.client.js5.defaultfiles.impl.Defaults7Loader;
import com.jagex.unknown.Class20;
import com.jagex.unknown.Class301;

public class CacheableNode_Sub15 extends CacheableNode {

	public String aString9771;
	public Queue aClass477_9770;
	public int anInt9769;

	public CacheableNode_Sub15(String string_1) {
		aString9771 = string_1;
		aClass477_9770 = new Queue();
	}

	public int method15244() {
		return aClass477_9770.aCacheableNode_5629.aCacheableNode_8119 != aClass477_9770.aCacheableNode_5629 ? ((CacheableNode_Sub7) aClass477_9770.aCacheableNode_5629.aCacheableNode_8119).clickType : -1;
	}

	public boolean method15245(CacheableNode_Sub7 class282_sub50_sub7_1) {
		boolean bool_3 = true;
		class282_sub50_sub7_1.method13452();

		for (CacheableNode_Sub7 class282_sub50_sub7_4 = (CacheableNode_Sub7) aClass477_9770.method7941(); class282_sub50_sub7_4 != null; bool_3 = false) {
			if (Class301.method5334(class282_sub50_sub7_1.clickType, class282_sub50_sub7_4.clickType)) {
				Defaults7Loader.method8751(class282_sub50_sub7_1, class282_sub50_sub7_4);
				++anInt9769;
				return !bool_3;
			}

			class282_sub50_sub7_4 = (CacheableNode_Sub7) aClass477_9770.method7955();
		}

		aClass477_9770.method7936(class282_sub50_sub7_1);
		++anInt9769;
		return bool_3;
	}

	public boolean method15249(CacheableNode_Sub7 class282_sub50_sub7_1) {
		int i_3 = method15244();
		class282_sub50_sub7_1.method13452();
		--anInt9769;
		if (anInt9769 == 0) {
			unlink();
			method13452();
			--Class20.anInt170;
			Class20.aClass229_164.put(this, class282_sub50_sub7_1.aLong9580);
			return false;
		} else {
			return i_3 != method15244();
		}
	}

}
