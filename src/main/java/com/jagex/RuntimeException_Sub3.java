package com.jagex;

import java.applet.Applet;

public class RuntimeException_Sub3 extends RuntimeException {

	public static int anInt10457;
	public static String MY_PLAYER_USERNAME;
	public static Applet anApplet10460;
	public static long aLong10459;
	public String aString10461;
	public Throwable aThrowable10462;

	public RuntimeException_Sub3(Throwable throwable_1, String string_2) {
		aString10461 = string_2;
		aThrowable10462 = throwable_1;
		initCause(throwable_1);
	}

}
