package com.jagex.client.prefs.impl;

import com.jagex.HintArrow;
import com.jagex.client.prefs.ClientPreferences;

public class RemoveRoofPreference extends Preference {

	public RemoveRoofPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public RemoveRoofPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public static void method12958() {
		HintArrow.aClass229_2245.method3859();
	}

	public void method12950() {
		if (manager.toolkitDefault.method13050() == 2 && anInt5578 == 2) {
			anInt5578 = 1;
		}

		if (anInt5578 < 0 || anInt5578 > 2) {
			anInt5578 = getDefaultValue();
		}

	}

	public int method7784() {
		return 1;
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public int method12952() {
		return anInt5578;
	}

	public void method7780(int i_1) {
		anInt5578 = i_1 * -754033619 * -859024475;
	}

	public int method7786() {
		return 2;
	}

	public int method7787() {
		return 2;
	}

	@Override
	public int getDefaultValue() {
		return 2;
	}

}
