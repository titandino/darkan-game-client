package com.jagex.unknown;

import jaggl.OpenGL;

public class Class138 {

	public int anInt1655;

	public Class138(int i_2) {
		anInt1655 = OpenGL.glGenLists(i_2);
	}

	public void method2379(char var_1) {
		OpenGL.glCallList(anInt1655 + var_1);
	}

	public void method2380(int i_1) {
		OpenGL.glNewList(anInt1655 + i_1, 4864);
	}

	public void method2381() {
		OpenGL.glEndList();
	}

}
