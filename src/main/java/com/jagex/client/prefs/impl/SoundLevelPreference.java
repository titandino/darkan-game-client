package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;

public class SoundLevelPreference extends Preference {

	public SoundLevelPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public SoundLevelPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public void method12712() {
		if (anInt5578 < 0 && anInt5578 > 127) {
			anInt5578 = getDefaultValue();
		}
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public int method12714() {
		return anInt5578;
	}

	public int method7786() {
		return 127;
	}

	public int method7784() {
		return 1;
	}

	public int method7787() {
		return 127;
	}

	@Override
	public int getDefaultValue() {
		return 127;
	}

	public void method7780(int i_1) {
		anInt5578 = -754033619 * i_1 * -859024475;
	}
}
