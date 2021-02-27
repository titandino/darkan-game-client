package com.jagex.client.prefs.impl;

import com.jagex.client.Game;
import com.jagex.client.client;
import com.jagex.client.js5.defs.IComponentDefinitions;
import com.jagex.client.prefs.ClientPreferences;

public class TexturesPreference extends Preference {

	public TexturesPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public TexturesPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public static IComponentDefinitions method12880(IComponentDefinitions icomponentdefinitions_0) {
		IComponentDefinitions icomponentdefinitions_2 = client.method11634(icomponentdefinitions_0);
		if (icomponentdefinitions_2 == null) {
			icomponentdefinitions_2 = icomponentdefinitions_0.aClass118_1379;
		}

		return icomponentdefinitions_2;
	}

	public int method7787() {
		return 1;
	}

	public void method12871() {
		if (manager.getGame() != Game.darkan) {
			anInt5578 = 1;
		}

		if (anInt5578 != 0 && anInt5578 != 1) {
			anInt5578 = getDefaultValue();
		}

	}

	@Override
	public int getDefaultValue() {
		return 1;
	}

	public boolean method12872() {
		return manager.getGame() == Game.darkan;
	}

	@Override
	public int checkValid(int i_1) {
		return manager.getGame() == Game.darkan ? (i_1 != 0 && manager.groundBlending.method12762() != 1 ? 2 : 1) : 3;
	}

	public int method12873() {
		return anInt5578;
	}

	public int method7786() {
		return 1;
	}

	public int method7784(int i_1) {
		return manager.getGame() == Game.darkan ? (i_1 != 0 && manager.groundBlending.method12762() != 1 ? 2 : 1) : 3;
	}

	public void method7780(int i_1) {
		anInt5578 = -754033619 * i_1 * -859024475;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

}
