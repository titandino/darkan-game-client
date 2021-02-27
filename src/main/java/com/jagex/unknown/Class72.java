package com.jagex.unknown;

public class Class72 {

	public long aLong724;
	public int anInt723;

	public Class72(Class69[] arr_1) {
		for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
			method1303(arr_1[i_2]);
		}

	}

	public Class72(Class69 class69_1) {
		aLong724 = class69_1.anInt703;
		anInt723 = 1;
	}

	public int method1296() {
		return anInt723;
	}

	public Class69 method1297(int i_1) {
		return Class69.method1285(method1299(i_1));
	}

	public int method1299(int i_1) {
		return (int) (aLong724 >> Class69.anInt702 * i_1) & 0xf;
	}

	public void method1303(Class69 class69_1) {
		aLong724 |= class69_1.anInt703 << Class69.anInt702 * anInt723++;
	}

}
