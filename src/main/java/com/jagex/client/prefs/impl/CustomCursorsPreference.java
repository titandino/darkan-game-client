package com.jagex.client.prefs.impl;

import com.jagex.LRUCache;
import com.jagex.PlayerModel;
import com.jagex.client.prefs.ClientPreferences;

public class CustomCursorsPreference extends Preference {

	public CustomCursorsPreference(ClientPreferences class282_sub54_2) {
		super(class282_sub54_2);
	}

	public static void method12679() {
		LRUCache softcache_1 = PlayerModel.aClass229_2920;
		synchronized (PlayerModel.aClass229_2920) {
			PlayerModel.aClass229_2920.method3859();
		}

		softcache_1 = PlayerModel.aClass229_2930;
		synchronized (PlayerModel.aClass229_2930) {
			PlayerModel.aClass229_2930.method3859();
		}
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	@Override
	public int getDefaultValue() {
		return 1;
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	public void method12674() {
		if (anInt5578 != 1 && anInt5578 != 0) {
			anInt5578 = getDefaultValue();
		}

	}

	public int method12675() {
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
		anInt5578 = i_1 * -754033619 * -859024475;
	}

}
