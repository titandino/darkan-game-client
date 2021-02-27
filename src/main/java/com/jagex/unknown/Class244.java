package com.jagex.unknown;

import com.jagex.PulseEvent;
import com.jagex.WorldDescriptor;
import com.jagex.client.client;

public class Class244 {

	public static int WORLD_LIST_SIZEPLUS1;

	public static WorldDescriptor[] WORLD_LIST_DESCRIPTORS;

	public static int anInt3008;

	public static boolean aBool3007;

	public Class244() throws Throwable {
		throw new Error();
	}

	public static void method4195() {
		if (!client.aBool7269) {
			client.aFloat7266 += (24.0F - client.aFloat7266) / 2.0F;
			client.aBool7371 = true;
			client.aBool7269 = true;
		}
	}

	public static void method4196(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(22, i_0);
		class282_sub50_sub12_2.method14965();
	}
}
