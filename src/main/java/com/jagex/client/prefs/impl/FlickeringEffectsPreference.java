package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;
import com.jagex.unknown.Class237;
import com.jagex.unknown.Class494;

public class FlickeringEffectsPreference extends Preference {

	public FlickeringEffectsPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public FlickeringEffectsPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public static void method12948(Class494 class494_0) {
		Class237.aClass494_2916 = class494_0;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public void method12941() {
		if (anInt5578 != 1 && anInt5578 != 0) {
			anInt5578 = getDefaultValue();
		}

	}

	@Override
	public int getDefaultValue() {
		return 1;
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	public int method12943() {
		return anInt5578;
	}

	public int method7784() {
		return 1;
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
