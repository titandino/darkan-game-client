package com.jagex.unknown;

import com.jagex.client.render.opengl.OpenGLRenderer;
import jaclib.memory.Buffer;
import jaggl.OpenGL;

public abstract class Class135 {

	public static int[] anIntArray1626 = new int[1];
	public boolean aBool1619;
	OpenGLRenderer aGraphicalRenderer_Sub1_1620;
	public int anInt1621;
	public int anInt1623;
	public boolean aBool1624;
	public int anInt1622;

	public Class135(OpenGLRenderer class505_sub1_1, Buffer buffer_3, int i_4) {
		aGraphicalRenderer_Sub1_1620 = class505_sub1_1;
		anInt1621 = 34962;
		anInt1623 = i_4;
		aBool1624 = false;
		OpenGL.glGenBuffersARB(1, anIntArray1626, 0);
		anInt1622 = anIntArray1626[0];
		method2341();
		OpenGL.glBufferDataARBa(34962, anInt1623, buffer_3.method2(), aBool1624 ? 35040 : 35044);
		aGraphicalRenderer_Sub1_1620.anInt8371 += anInt1623;
	}

	public Class135(OpenGLRenderer class505_sub1_1, int i_2, byte[] bytes_3, int i_4, boolean bool_5) {
		aGraphicalRenderer_Sub1_1620 = class505_sub1_1;
		anInt1621 = i_2;
		anInt1623 = i_4;
		aBool1624 = bool_5;
		OpenGL.glGenBuffersARB(1, anIntArray1626, 0);
		anInt1622 = anIntArray1626[0];
		method2341();
		OpenGL.glBufferDataARBub(i_2, anInt1623, bytes_3, 0, aBool1624 ? 35040 : 35044);
		aGraphicalRenderer_Sub1_1620.anInt8371 += anInt1623;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!aBool1619) {
			aGraphicalRenderer_Sub1_1620.method13657(anInt1622, anInt1623);
			aBool1619 = true;
		}

		super.finalize();
	}

	public abstract void method2341();

	public void method2342(byte[] bytes_1, int i_2) {
		method2341();
		if (i_2 > anInt1623) {
			OpenGL.glBufferDataARBub(anInt1621, i_2, bytes_1, 0, aBool1624 ? 35040 : 35044);
			aGraphicalRenderer_Sub1_1620.anInt8371 += i_2 - anInt1623;
			anInt1623 = i_2;
		} else {
			OpenGL.glBufferSubDataARBub(anInt1621, 0, i_2, bytes_1, 0);
		}

	}

	public abstract void method2345();

	public abstract void method2346();

}
