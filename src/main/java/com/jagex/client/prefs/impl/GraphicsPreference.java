package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;
import com.jagex.unknown.Class150;
import com.jagex.unknown.Class186;

public class GraphicsPreference extends Preference {

	public GraphicsPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public GraphicsPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public static void method12658() {
		Class150.method2580(-1, 255);
	}

	public static boolean method12661(String string_0, int i_1) {
		return Class186.method3082(string_0, i_1, "openjs");
	}

	public void method12653() {
		if (anInt5578 < 0 || anInt5578 > 4) {
			anInt5578 = getDefaultValue();
		}
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	@Override
	public int getDefaultValue() {
		return 0;
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	public int method7784() {
		return 1;
	}

	public int method12654() {
		return anInt5578;
	}

	public void method7780(int i_1) {
		anInt5578 = -754033619 * i_1 * -859024475;
	}

	public int method7786() {
		return 0;
	}

	public int method7787() {
		return 0;
	}
}
