package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;

public class CPUMaxMemoryPreference extends Preference {

	public CPUMaxMemoryPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public CPUMaxMemoryPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public void method12648() {
		if (anInt5578 < 0 && anInt5578 > 4) {
			anInt5578 = getDefaultValue();
		}

	}

	@Override
	public int getDefaultValue() {
		return manager.getProcessorSpecs().getProcessorCount() > 1 ? 4 : 2;
	}

	public void method7780(int i_1) {
		anInt5578 = -754033619 * i_1 * -859024475;
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	public int method7784() {
		return 1;
	}

	public int method7786() {
		return manager.getProcessorSpecs().getProcessorCount() > 1 ? 4 : 2;
	}

	public int method7787() {
		return manager.getProcessorSpecs().getProcessorCount() > 1 ? 4 : 2;
	}

	public int getValue() {
		return anInt5578;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

}
