package com.jagex.client.prefs.impl;

import com.jagex.client.js5.JS5Manager;
import com.jagex.client.prefs.ClientPreferences;

public class ScreenSizePreference extends Preference {

	public static JS5Manager JS5_MANAGER;

	public ScreenSizePreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public ScreenSizePreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public void method12684() {
		if (anInt5578 < 1 || anInt5578 > 3) {
			anInt5578 = getDefaultValue();
		}
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public int method7784() {
		return 1;
	}

	public void method7780(int i_1) {
		anInt5578 = -754033619 * i_1 * -859024475;
	}

	public int method7786() {
		return manager.getProcessorSpecs().isARM() ? 3 : 2;
	}

	public int method7787() {
		return manager.getProcessorSpecs().isARM() ? 3 : 2;
	}

	public int method12687() {
		return anInt5578;
	}

	@Override
	public int getDefaultValue() {
		return manager.getProcessorSpecs().isARM() ? 3 : 2;
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}
}
