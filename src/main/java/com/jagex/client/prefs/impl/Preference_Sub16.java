package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;
import com.jagex.unknown.Class104;

public class Preference_Sub16 extends Preference {

	public Preference_Sub16(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public Preference_Sub16(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12749() {
		if (anInt5578 < Class104.aClass104_1061.id || anInt5578 > Class104.aClass104_1062.id) {
			anInt5578 = getDefaultValue();
		}

	}

	@Override
	public int getDefaultValue() {
		return Class104.aClass104_1061.id;
	}

	public int method7787() {
		return -1544200711 * Class104.aClass104_1061.id * 2087113801;
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	public int method12750() {
		return anInt5578;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public void method7780(int i_1) {
		anInt5578 = i_1 * -754033619 * -859024475;
	}

	public int method7786() {
		return -1544200711 * Class104.aClass104_1061.id * 2087113801;
	}

	public int method7784() {
		return 1;
	}

}
