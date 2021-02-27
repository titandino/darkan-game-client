package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;
import com.jagex.unknown.Class60;

public class SkyBoxPreference extends Preference {

	public SkyBoxPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public SkyBoxPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12725() {
		if (anInt5578 < 0 || anInt5578 > 1) {
			anInt5578 = getDefaultValue();
		}

	}

	public boolean method12727() {
		return Class60.method1166(manager.currentToolkit.getValue());
	}

	@Override
	public int checkValid(int i_1) {
		return !Class60.method1166(manager.currentToolkit.getValue()) ? 3 : 1;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	@Override
	public int getDefaultValue() {
		return 1;
	}

	public int method7784() {
		return !Class60.method1166(manager.currentToolkit.getValue()) ? 3 : 1;
	}

	public int method12728() {
		return anInt5578;
	}

	public int method7786() {
		return 1;
	}

	public int method7787() {
		return 1;
	}

	public void method7780(int i_1) {
		anInt5578 = -754033619 * i_1 * -859024475;
	}

}
