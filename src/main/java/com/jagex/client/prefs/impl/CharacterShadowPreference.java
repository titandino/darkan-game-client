package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;

public class CharacterShadowPreference extends Preference {

	public static int LASTLOGINLDAY;

	public CharacterShadowPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public CharacterShadowPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public int method7784() {
		return 1;
	}

	public void method12959() {
		if (anInt5578 != 1 && anInt5578 != 0) {
			anInt5578 = getDefaultValue();
		}

	}

	@Override
	public int getDefaultValue() {
		return 1;
	}

	public int method7787() {
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

	public void method7780(int i_1) {
		anInt5578 = -754033619 * i_1 * -859024475;
	}

	public int method7786() {
		return 1;
	}

	public boolean method12964() {
		return true;
	}

	public int method12966() {
		return anInt5578;
	}

}
