package com.jagex.client.prefs.impl;

import com.jagex.WorldDescriptor;
import com.jagex.client.prefs.ClientPreferences;
import com.jagex.game.content.cutscenes.CutsceneCameraMovement;
import com.jagex.net.connection.ConnectionInfo;

public class SceneryShadowPreference extends Preference {

	public static int anInt7868;

	public SceneryShadowPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public SceneryShadowPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public static WorldDescriptor method12629() {
		ConnectionInfo.CURRENT_WORLD = 0;
		return CutsceneCameraMovement.getCurrentWorldDescriptor();
	}

	public boolean method12622() {
		return manager.textures.method12873() != 0;
	}

	public int method7786() {
		return 2;
	}

	@Override
	public int checkValid(int i_1) {
		return manager.textures.method12873() == 0 ? 3 : 1;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public int method12624() {
		return anInt5578;
	}

	public int method7784() {
		return manager.textures.method12873() == 0 ? 3 : 1;
	}

	public void method7780(int i_1) {
		anInt5578 = i_1 * -754033619 * -859024475;
	}

	public int method7787() {
		return 2;
	}

	@Override
	public int getDefaultValue() {
		return 2;
	}

	public void method12627() {
		if (manager.textures.method12873() == 0) {
			anInt5578 = 0;
		}
		if (anInt5578 < 0 || anInt5578 > 2) {
			anInt5578 = getDefaultValue();
		}
	}
}
