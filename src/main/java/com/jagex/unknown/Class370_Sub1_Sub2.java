package com.jagex.unknown;

public class Class370_Sub1_Sub2 extends Class370_Sub1 {

	byte[] aByteArray10215;

	public Class370_Sub1_Sub2() {
	}

	byte[] method15614() {
		aByteArray10215 = new byte[524288];
		method6322();
		return aByteArray10215;
	}

	@Override
	public void method12508(int i_1, byte b_2) {
		int i_3 = i_1 * 2;
		int i_4 = b_2 & 0xff;
		aByteArray10215[i_3++] = (byte) (i_4 * 3 >> 5);
		aByteArray10215[i_3] = (byte) (i_4 * 3 >> 5);
	}

}
