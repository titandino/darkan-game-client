package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;

public class SafeModePreference extends Preference {

	public SafeModePreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public SafeModePreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public int method7787() {
		return 0;
	}

	public int getValue() {
		return anInt5578;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	public void method12928() {
		if (anInt5578 != 1 && anInt5578 != 0) {
			anInt5578 = getDefaultValue();
		}
	}

	public int method7784() {
		return 1;
	}

	public void method7780(int i_1) {
		anInt5578 = -754033619 * i_1 * -859024475;
	}

	public int method7786() {
		return 0;
	}

	@Override
	public int getDefaultValue() {
		return 0;
	}
}
