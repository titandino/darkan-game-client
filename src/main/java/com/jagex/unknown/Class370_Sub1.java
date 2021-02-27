package com.jagex.unknown;

public class Class370_Sub1 extends Class370 {

	byte[] aByteArray7752;
	public int anInt7750;
	public int anInt7749;
	public int anInt7751;
	public int anInt7747;
	public int anInt7746;
	public int anInt7748;
	public int anInt7753;
	public int anInt7754;

	public Class370_Sub1() {
		super(8, 8, 8);
		anInt7748 = (int) ((float) 3.0 * 4096.0F);
		anInt7753 = (int) ((float) 0.55 * 4096.0F);
		anInt7747 = anInt7754 = (int) (Math.pow(0.5D, -0.1f) * 4096.0D);
	}

	@Override
	public void method6337(int i_1, int i_2) {
		if (i_1 != 0) {
			anInt7750 = anInt7749 * anInt7748 >> 12;
			if (anInt7750 < 0) {
				anInt7750 = 0;
			} else if (anInt7750 > 4096) {
				anInt7750 = 4096;
			}

			anInt7749 = anInt7753 - (i_2 < 0 ? -i_2 : i_2);
			anInt7749 = anInt7749 * anInt7749 >> 12;
			anInt7749 = anInt7749 * anInt7750 >> 12;
			anInt7751 += anInt7749 * anInt7747 >> 12;
			anInt7747 = anInt7747 * anInt7754 >> 12;
		} else {
			anInt7749 = anInt7753 - (i_2 < 0 ? -i_2 : i_2);
			anInt7749 = anInt7749 * anInt7749 >> 12;
			anInt7750 = 4096;
			anInt7751 = anInt7749;
		}

	}

	public void method12508(int i_1, byte b_2) {
		aByteArray7752[i_1] = b_2;
	}

	@Override
	public void method6321() {
		anInt7747 = anInt7754;
		anInt7751 >>= 4;
		if (anInt7751 < 0) {
			anInt7751 = 0;
		} else if (anInt7751 > 255) {
			anInt7751 = 255;
		}

		method12508(anInt7746++, (byte) anInt7751);
		anInt7751 = 0;
	}

	@Override
	public void method6327(int i_1, int i_2) {
		if (i_1 != 0) {
			anInt7750 = anInt7749 * anInt7748 >> 12;
			if (anInt7750 < 0) {
				anInt7750 = 0;
			} else if (anInt7750 > 4096) {
				anInt7750 = 4096;
			}

			anInt7749 = anInt7753 - (i_2 < 0 ? -i_2 : i_2);
			anInt7749 = anInt7749 * anInt7749 >> 12;
			anInt7749 = anInt7749 * anInt7750 >> 12;
			anInt7751 += anInt7749 * anInt7747 >> 12;
			anInt7747 = anInt7747 * anInt7754 >> 12;
		} else {
			anInt7749 = anInt7753 - (i_2 < 0 ? -i_2 : i_2);
			anInt7749 = anInt7749 * anInt7749 >> 12;
			anInt7750 = 4096;
			anInt7751 = anInt7749;
		}

	}

	@Override
	public void method6330() {
		anInt7746 = 0;
		anInt7751 = 0;
	}

	@Override
	public void method6331() {
		anInt7746 = 0;
		anInt7751 = 0;
	}

	@Override
	public void method6344() {
		anInt7747 = anInt7754;
		anInt7751 >>= 4;
		if (anInt7751 < 0) {
			anInt7751 = 0;
		} else if (anInt7751 > 255) {
			anInt7751 = 255;
		}

		method12508(anInt7746++, (byte) anInt7751);
		anInt7751 = 0;
	}

	@Override
	public void method6333(int i_1, int i_2) {
		if (i_1 != 0) {
			anInt7750 = anInt7749 * anInt7748 >> 12;
			if (anInt7750 < 0) {
				anInt7750 = 0;
			} else if (anInt7750 > 4096) {
				anInt7750 = 4096;
			}

			anInt7749 = anInt7753 - (i_2 < 0 ? -i_2 : i_2);
			anInt7749 = anInt7749 * anInt7749 >> 12;
			anInt7749 = anInt7749 * anInt7750 >> 12;
			anInt7751 += anInt7749 * anInt7747 >> 12;
			anInt7747 = anInt7747 * anInt7754 >> 12;
		} else {
			anInt7749 = anInt7753 - (i_2 < 0 ? -i_2 : i_2);
			anInt7749 = anInt7749 * anInt7749 >> 12;
			anInt7750 = 4096;
			anInt7751 = anInt7749;
		}

	}

	@Override
	public void method6334(int i_1, int i_2) {
		if (i_1 != 0) {
			anInt7750 = anInt7749 * anInt7748 >> 12;
			if (anInt7750 < 0) {
				anInt7750 = 0;
			} else if (anInt7750 > 4096) {
				anInt7750 = 4096;
			}

			anInt7749 = anInt7753 - (i_2 < 0 ? -i_2 : i_2);
			anInt7749 = anInt7749 * anInt7749 >> 12;
			anInt7749 = anInt7749 * anInt7750 >> 12;
			anInt7751 += anInt7749 * anInt7747 >> 12;
			anInt7747 = anInt7747 * anInt7754 >> 12;
		} else {
			anInt7749 = anInt7753 - (i_2 < 0 ? -i_2 : i_2);
			anInt7749 = anInt7749 * anInt7749 >> 12;
			anInt7750 = 4096;
			anInt7751 = anInt7749;
		}

	}

	@Override
	public void method6332() {
		anInt7746 = 0;
		anInt7751 = 0;
	}

	@Override
	public void method6345() {
		anInt7747 = anInt7754;
		anInt7751 >>= 4;
		if (anInt7751 < 0) {
			anInt7751 = 0;
		} else if (anInt7751 > 255) {
			anInt7751 = 255;
		}

		method12508(anInt7746++, (byte) anInt7751);
		anInt7751 = 0;
	}

	@Override
	public void method6340() {
		anInt7747 = anInt7754;
		anInt7751 >>= 4;
		if (anInt7751 < 0) {
			anInt7751 = 0;
		} else if (anInt7751 > 255) {
			anInt7751 = 255;
		}

		method12508(anInt7746++, (byte) anInt7751);
		anInt7751 = 0;
	}

}
