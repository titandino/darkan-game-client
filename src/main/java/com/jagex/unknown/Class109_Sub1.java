package com.jagex.unknown;

import com.jagex.Node;
import com.jagex.client.client;

public class Class109_Sub1 extends Class109 {

	public static int CAM_MOVE_ABSOLUTEZ;

	public static void method14650(int i_0) {
		for (Node node_2 = client.ICOMPONENT_SETTINGS_SLOTS.method7750(); node_2 != null; node_2 = client.ICOMPONENT_SETTINGS_SLOTS.method7751()) {
			if (i_0 == (node_2.pointer >> 48 & 0xffffL)) {
				node_2.unlink();
			}
		}

	}

	public static int method14651() {
		return 12;
	}

	@Override
	public void method1851() {
		Class260.aClass277_3221 = Class260.aClass277_3234;
		Class260.aClass277_3234 = null;
	}

	@Override
	public void method1849() {
		Class260.aClass277_3221 = Class260.aClass277_3234;
		Class260.aClass277_3234 = null;
	}

	@Override
	public void method1850() {
		Class260.aClass277_3221 = Class260.aClass277_3234;
		Class260.aClass277_3234 = null;
	}

}
