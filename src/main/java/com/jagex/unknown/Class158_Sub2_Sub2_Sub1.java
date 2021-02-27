package com.jagex.unknown;

import com.jagex.JAGGLRenderer;
import jaggl.OpenGL;

import java.awt.*;

public class Class158_Sub2_Sub2_Sub1 extends Class158_Sub2_Sub2 {

	public Canvas aCanvas10302;
	public OpenGL anOpenGL10299;
	public long aLong10300;
	public int anInt10298;
	public int anInt10301;

	public Class158_Sub2_Sub2_Sub1(JAGGLRenderer class505_sub2_sub1_1, Canvas canvas_2, long long_3) {
		super(class505_sub2_sub1_1);
		aCanvas10302 = canvas_2;
		anOpenGL10299 = class505_sub2_sub1_1.anOpenGL10191;
		aLong10300 = long_3;
		method15723();
	}

	public Class158_Sub2_Sub2_Sub1(JAGGLRenderer class505_sub2_sub1_1, Canvas canvas_2) {
		this(class505_sub2_sub1_1, canvas_2, class505_sub2_sub1_1.anOpenGL10191.prepareSurface(canvas_2));
	}

	@Override
	public int method14345(int i_1, int i_2) {
		return 0;
	}

	@Override
	public int method14352(int i_1, int i_2) {
		return 0;
	}

	@Override
	public int method2716() {
		return anInt10298;
	}

	@Override
	public void method14348(int i_1, int i_2) {
		anOpenGL10299.surfaceResized(aLong10300);
		method15723();
		super.method14354(i_1, i_2);
	}

	public void method15723() {
		Dimension dimension_1 = aCanvas10302.getSize();
		anInt10298 = dimension_1.height;
		anInt10301 = dimension_1.width;
	}

	@Override
	public int method14344() {
		anOpenGL10299.swapBuffers(aLong10300);
		return 0;
	}

	@Override
	public int method14353(int i_1, int i_2) {
		return 0;
	}

	@Override
	public boolean method213() {
		return anOpenGL10299.setSurface(aLong10300) && super.method213();
	}

	@Override
	public boolean method2724() {
		return true;
	}

	@Override
	public void method212() {
		anOpenGL10299.releaseSurface(aCanvas10302, aLong10300);
	}

	@Override
	public int method14349() {
		anOpenGL10299.swapBuffers(aLong10300);
		return 0;
	}

	@Override
	public int method2720() {
		return anInt10301;
	}

	@Override
	public int method2719() {
		return anInt10301;
	}

	@Override
	public boolean method2717() {
		return true;
	}

	@Override
	public boolean method54() {
		return anOpenGL10299.setSurface(aLong10300) && super.method213();
	}

	@Override
	public boolean method2723() {
		return true;
	}

	@Override
	public boolean method2715() {
		return true;
	}

	@Override
	public void method14347(int i_1, int i_2) {
		anOpenGL10299.surfaceResized(aLong10300);
		method15723();
		super.method14354(i_1, i_2);
	}

	@Override
	public void method14354(int i_1, int i_2) {
		anOpenGL10299.surfaceResized(aLong10300);
		method15723();
		super.method14354(i_1, i_2);
	}

	@Override
	public boolean method2725() {
		return true;
	}

	@Override
	public boolean method2722() {
		return true;
	}

	@Override
	public boolean method2718() {
		return true;
	}

	@Override
	public int method2726() {
		return anInt10301;
	}

	@Override
	public int method2727() {
		return anInt10298;
	}

	@Override
	public int method2721() {
		return anInt10298;
	}

	@Override
	public int method14350() {
		anOpenGL10299.swapBuffers(aLong10300);
		return 0;
	}

	@Override
	public int method14346() {
		anOpenGL10299.swapBuffers(aLong10300);
		return 0;
	}

	@Override
	public void method186() {
		anOpenGL10299.releaseSurface(aCanvas10302, aLong10300);
	}

	@Override
	public int method2714() {
		return anInt10301;
	}

	@Override
	public int method14351(int i_1, int i_2) {
		return 0;
	}

	@Override
	public boolean method211() {
		return anOpenGL10299.setSurface(aLong10300) && super.method213();
	}

}
