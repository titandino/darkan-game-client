package com.jagex.unknown;

import com.jagex.client.render.opengl.OpenGLRenderer;
import jaggl.OpenGL;

public class Class133 {

	public static int[] anIntArray1599 = new int[1];
	OpenGLRenderer aGraphicalRenderer_Sub1_1597;
	public int anInt1596;

	public Class133(OpenGLRenderer class505_sub1_1, int i_3) {
		aGraphicalRenderer_Sub1_1597 = class505_sub1_1;
		anInt1596 = i_3;
	}

	public static Class133 method2321(OpenGLRenderer class505_sub1_0, String string_2) {
		int i_3 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, i_3);
		OpenGL.glProgramStringARB(34336, 34933, string_2);
		OpenGL.glGetIntegerv(34379, anIntArray1599, 0);
		if (anIntArray1599[0] != -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class133(class505_sub1_0, i_3);
		}
	}

	@Override
	protected void finalize() throws Throwable {
		aGraphicalRenderer_Sub1_1597.method13628(anInt1596);
		super.finalize();
	}

}
