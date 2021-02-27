package com.jagex.unknown;

import com.jagex.client.render.opengl.OpenGLRenderer;
import jaclib.memory.Buffer;

public class Class131 {

	OpenGLRenderer aGraphicalRenderer_Sub1_1594;
	Buffer aBuffer1593;

	public Class131(OpenGLRenderer class505_sub1_1, Buffer buffer_2) {
		aGraphicalRenderer_Sub1_1594 = class505_sub1_1;
		aBuffer1593 = buffer_2;
	}

	public Class131(OpenGLRenderer class505_sub1_1, byte[] bytes_2, int i_3) {
		aGraphicalRenderer_Sub1_1594 = class505_sub1_1;
		aBuffer1593 = aGraphicalRenderer_Sub1_1594.aNativeHeap8445.method759(i_3, false);
		if (bytes_2 != null) {
			aBuffer1593.method116(bytes_2, 0, 0, i_3);
		}

	}

	public void method2319(byte[] bytes_1, int i_2) {
		if (aBuffer1593 == null || aBuffer1593.method1() < i_2) {
			aBuffer1593 = aGraphicalRenderer_Sub1_1594.aNativeHeap8445.method759(i_2, false);
		}

		aBuffer1593.method116(bytes_1, 0, 0, i_2);
	}

}
