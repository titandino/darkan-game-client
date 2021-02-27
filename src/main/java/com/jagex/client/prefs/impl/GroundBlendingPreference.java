package com.jagex.client.prefs.impl;

import com.jagex.client.Game;
import com.jagex.client.prefs.ClientPreferences;

public class GroundBlendingPreference extends Preference {

	public GroundBlendingPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public GroundBlendingPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	@Override
	public int checkValid(int i_1) {
		if (manager.getGame() == Game.darkan) {
			if (i_1 == 0) {
				if (manager.fog.method13417() == 1) {
					return 2;
				}

				if (manager.textures.method12873() == 1) {
					return 2;
				}

				if (manager.water.getValue() > 0) {
					return 2;
				}
			}

			return 1;
		} else {
			return 3;
		}
	}

	public int method7786() {
		return 1;
	}

	@Override
	public int getDefaultValue() {
		return 1;
	}

	public boolean method12761() {
		return manager.getGame() == Game.darkan;
	}

	public int method12762() {
		return anInt5578;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public int method7784(int i_1) {
		if (manager.getGame() == Game.darkan) {
			if (i_1 == 0) {
				if (manager.fog.method13417() == 1) {
					return 2;
				}

				if (manager.textures.method12873() == 1) {
					return 2;
				}

				if (manager.water.getValue() > 0) {
					return 2;
				}
			}

			return 1;
		} else {
			return 3;
		}
	}

	public void method7780(int i_1) {
		anInt5578 = -754033619 * i_1 * -859024475;
	}

	public void method12767() {
		if (manager.getGame() != Game.darkan) {
			anInt5578 = 1;
		}

		if (anInt5578 != 0 && anInt5578 != 1) {
			anInt5578 = getDefaultValue();
		}

	}

	public int method7787() {
		return 1;
	}

}
