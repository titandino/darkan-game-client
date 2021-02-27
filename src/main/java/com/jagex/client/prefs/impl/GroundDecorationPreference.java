package com.jagex.client.prefs.impl;

import com.jagex.client.Game;
import com.jagex.client.prefs.ClientPreferences;

public class GroundDecorationPreference extends Preference {

	public GroundDecorationPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public GroundDecorationPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public int method12897() {
		return anInt5578;
	}

	public void method12898() {
		if (manager.getGame() != Game.darkan) {
			anInt5578 = 1;
		}
		if (anInt5578 != 0 && anInt5578 != 1) {
			anInt5578 = getDefaultValue();
		}
	}

	public int method7786() {
		return 1;
	}

	public boolean method12899() {
		return manager.getGame() == Game.darkan;
	}

	@Override
	public int getDefaultValue() {
		return 1;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public int method7784() {
		return manager.getGame() == Game.darkan ? 1 : 3;
	}

	public void method7780(int i_1) {
		anInt5578 = i_1 * -754033619 * -859024475;
	}

	public int method7787() {
		return 1;
	}

	@Override
	public int checkValid(int i_1) {
		return manager.getGame() == Game.darkan ? 1 : 3;
	}

}
