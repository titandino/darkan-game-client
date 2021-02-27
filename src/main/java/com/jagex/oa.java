package com.jagex;

import com.jagex.unknown.Class156;

public class oa implements Interface8, Interface40 {

	public long nativeid;
	public int anInt2681;
	public int anInt2682;

	public oa(int i_1, int i_2) {
		anInt2681 = i_1;
		anInt2682 = i_2;
		g(i_1, i_2);
	}

	public native void e(long var1, boolean var3);

	public native void g(int var1, int var2);

	@Override
	public int method1() {
		return anInt2681;
	}

	@Override
	protected void finalize() {
		if (nativeid != 0L) {
			Class156.method2642(this);
		}

	}

	@Override
	public void y(boolean bool_1) {
		za(nativeid, bool_1);
	}

	public native void za(long var1, boolean var3);

	@Override
	public int method73() {
		return anInt2682;
	}

	@Override
	public int method75() {
		return anInt2681;
	}

	public native void w(long var1, boolean var3);

	@Override
	public int method77() {
		return anInt2682;
	}

	@Override
	public int method76() {
		return anInt2681;
	}

	@Override
	public void ma(boolean bool_1) {
		za(nativeid, bool_1);
	}

	@Override
	public void method32() {
		ma(false);
	}

	@Override
	public int method39() {
		return anInt2682;
	}

	@Override
	public void x(boolean bool_1) {
		za(nativeid, bool_1);
	}

	public native void j(int var1, int var2);

	public native void o(int var1, int var2);

	public native void l(long var1, boolean var3);

	@Override
	public int method74() {
		return anInt2682;
	}

	@Override
	public void method26() {
		ma(false);
	}

	public native void s(long var1, boolean var3);

}
