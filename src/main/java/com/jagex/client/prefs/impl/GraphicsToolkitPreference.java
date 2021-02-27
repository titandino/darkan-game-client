package com.jagex.client.prefs.impl;

import com.jagex.LibraryLoader;
import com.jagex.client.prefs.ClientPreferences;

public class GraphicsToolkitPreference extends Preference {

	public boolean aBool7914;
	public boolean aBool7913 = true;

	public GraphicsToolkitPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public GraphicsToolkitPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public void method12773() {
		if (anInt5578 < 0 || anInt5578 > 5) {
			anInt5578 = getDefaultValue();
		}

	}

	public boolean method12774() {
		return true;
	}

	@Override
	public int getDefaultValue() {
		aBool7914 = true;
		return 2;
	}

	@Override
	public void setValue(int i_1) {
		aBool7914 = false;
		anInt5578 = i_1;
	}

	@Override
	public int checkValid(int i_1) {
		return i_1 == 3 && !LibraryLoader.getLoader().hasDxLibrary() ? 3 : 2;
	}

	public int getValue() {
		return anInt5578;
	}

	public boolean method12777() {
		return aBool7913;
	}

	public int method7786() {
		aBool7914 = true;
		return 2;
	}

	public void method7780(int i_1) {
		aBool7914 = false;
		anInt5578 = i_1 * -754033619 * -859024475;
	}

	public int method7787() {
		aBool7914 = true;
		return 2;
	}

	public void method12783(boolean bool_1) {
		aBool7913 = bool_1;
	}

}
