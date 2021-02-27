package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;
import com.jagex.unknown.Class302;
import com.jagex.unknown.Class520;

public class MaxScreenSizePreference extends Preference {

	public MaxScreenSizePreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public MaxScreenSizePreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public static int method12672() {
		return Class302.anInt3561;
	}

	public void method12663() {
		if (anInt5578 < 0 || anInt5578 > 2) {
			anInt5578 = getDefaultValue();
		}

	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	public boolean method12665() {
		return true;
	}

	public int method12666() {
		return anInt5578;
	}

	public void method7780(int i_1) {
		anInt5578 = -754033619 * i_1 * -859024475;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public int method7786() {
		return manager.currentToolkit.method12777() && Class520.method11162(manager.currentToolkit.getValue()) ? 1 : 0;
	}

	public int method7787() {
		return manager.currentToolkit.method12777() && Class520.method11162(manager.currentToolkit.getValue()) ? 1 : 0;
	}

	@Override
	public int getDefaultValue() {
		return manager.currentToolkit.method12777() && Class520.method11162(manager.currentToolkit.getValue()) ? 1 : 0;
	}

	public int method7784() {
		return 1;
	}

}
