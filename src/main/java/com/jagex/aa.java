package com.jagex;

import com.jagex.unknown.Class156;

public class aa extends Shadow implements Interface40 {

	public long nativeid;

	aa() {
	}

	@Override
	public native void ma(boolean var1);

	@Override
	protected void finalize() {
		if (nativeid != 0L) {
			Class156.method2642(this);
		}
	}

	@Override
	public native void y(boolean var1);

	@Override
	public native void x(boolean var1);

}
