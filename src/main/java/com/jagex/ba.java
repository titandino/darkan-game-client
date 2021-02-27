package com.jagex;

import com.jagex.unknown.Class156;

public class ba extends Node_Sub1 implements Interface40 {

	public long nativeid;

	ba(ja ja_1, int i_2) {
		sa(ja_1, i_2);
	}

	public native void sa(ja var1, int var2);

	@Override
	public native void ma(boolean var1);

	public native void ha();

	public native void u();

	public native void v();

	@Override
	public native void y(boolean var1);

	public native void j();

	public native void n(ja var1, int var2);

	public native void g(ja var1, int var2);

	@Override
	public native void x(boolean var1);

	@Override
	protected void finalize() {
		if (nativeid != 0L) {
			Class156.method2642(this);
		}

	}

}
