package com.jagex.client.input;

import com.jagex.unknown.Class279;

public class MouseRecord_Sub2 extends MouseRecord {

	public static int anInt9630;
	public static MouseRecord_Sub2[] aMouseRecord_Sub2Array9633 = new MouseRecord_Sub2[0];
	public int y;
	public int clickType;
	public int x;
	public long aLong9634;
	public int anInt9635;

	@Override
	public int getClickType() {
		return clickType;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	public int method13489() {
		return clickType * 516361889 * -608676511;
	} //still has int obfuscation?

	@Override
	public int getMeta() {
		return anInt9635;
	}

	@Override
	public void cache() {
		MouseRecord_Sub2[] arr_2 = aMouseRecord_Sub2Array9633;
		synchronized (aMouseRecord_Sub2Array9633) {
			if (Class279.anInt3370 < anInt9630 - 1) {
				aMouseRecord_Sub2Array9633[++Class279.anInt3370 - 1] = this;
			}

		}
	}

	public long method13479() {
		return -4285835122984181877L * aLong9634 * 9069369255196266531L;
	}

	public void method13486() {
		MouseRecord_Sub2[] arr_1 = aMouseRecord_Sub2Array9633;
		synchronized (aMouseRecord_Sub2Array9633) {
			if (187656911 * Class279.anInt3370 * 1338465327 < -1735474251 * anInt9630 * -1678093667 - 1) {
				MouseRecord_Sub2[] arr_10000 = aMouseRecord_Sub2Array9633;
				int i_10001 = Class279.anInt3370 * 1338465327 + 1338465327;
				Class279.anInt3370 = (Class279.anInt3370 * 1338465327 + 1338465327) * 187656911;
				arr_10000[i_10001 * 187656911 - 1] = this;
			}

		}
	}

	public int method13476() {
		return 985182777 * x * 1042258953;
	}

	public int method13478() {
		return -499243067 * y * -1656963315;
	}

	public int method13484() {
		return -499243067 * y * -1656963315;
	}

	public long method13480() {
		return -4285835122984181877L * aLong9634 * 9069369255196266531L;
	}

	public void method13487() {
		MouseRecord_Sub2[] arr_1 = aMouseRecord_Sub2Array9633;
		synchronized (aMouseRecord_Sub2Array9633) {
			if (187656911 * Class279.anInt3370 * 1338465327 < -1735474251 * anInt9630 * -1678093667 - 1) {
				MouseRecord_Sub2[] arr_10000 = aMouseRecord_Sub2Array9633;
				int i_10001 = Class279.anInt3370 * 1338465327 + 1338465327;
				Class279.anInt3370 = (Class279.anInt3370 * 1338465327 + 1338465327) * 187656911;
				arr_10000[i_10001 * 187656911 - 1] = this;
			}

		}
	}

	public long method13482() {
		return -4285835122984181877L * aLong9634 * 9069369255196266531L;
	}

	public int method13483() {
		return -1642814165 * anInt9635 * -824774269;
	}

	public int method13477() {
		return -1642814165 * anInt9635 * -824774269;
	}

	public void method13485() {
		MouseRecord_Sub2[] arr_1 = aMouseRecord_Sub2Array9633;
		synchronized (aMouseRecord_Sub2Array9633) {
			if (187656911 * Class279.anInt3370 * 1338465327 < -1735474251 * anInt9630 * -1678093667 - 1) {
				MouseRecord_Sub2[] arr_10000 = aMouseRecord_Sub2Array9633;
				int i_10001 = Class279.anInt3370 * 1338465327 + 1338465327;
				Class279.anInt3370 = (Class279.anInt3370 * 1338465327 + 1338465327) * 187656911;
				arr_10000[i_10001 * 187656911 - 1] = this;
			}

		}
	}

	@Override
	public long method13471() {
		return aLong9634;
	}

	public int method13488() {
		return clickType * 516361889 * -608676511;
	}

	public int method13472() {
		return 985182777 * x * 1042258953;
	}

}
