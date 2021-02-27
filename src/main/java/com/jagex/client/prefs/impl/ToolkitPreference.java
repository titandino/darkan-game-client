package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;

public class ToolkitPreference extends Preference {

	public ToolkitPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public ToolkitPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public int method7784(int i_1) {
		return i_1 == 2 ? 2 : 1;
	}

	public void method13048() {
		if (anInt5578 < 0 || anInt5578 > 2) {
			anInt5578 = getDefaultValue();
		}

	}

	@Override
	public int getDefaultValue() {
		return 0;
	}

	public boolean method13049() {
		return true;
	}

	@Override
	public int checkValid(int i_1) {
		return i_1 == 2 ? 2 : 1;
	}

	public int method13050() {
		return anInt5578;
	}

	public void method7780(int i_1) {
		anInt5578 = i_1 * -754033619 * -859024475;
	}

	public int method7787() {
		return 0;
	}

	public int method7786() {
		return 0;
	}

}
