package com.jagex;

import com.jagex.unknown.Class156;
import com.jagex.unknown.Class158_Sub2;

import java.awt.*;

public class za extends Class158_Sub2 implements Interface40 {

	public static boolean aBool10291;
	public static long aLong10286;
	public int anInt10288;
	public int anInt10287;
	public long nativeid;
	Canvas aCanvas10290;
	ja aja10289;

	za(ja ja_1, Canvas canvas_2, int i_3, int i_4) {
		aja10289 = ja_1;
		aCanvas10290 = canvas_2;
		anInt10288 = i_3;
		anInt10287 = i_4;
		n(ja_1, aCanvas10290, i_3, i_4);
	}

	@Override
	public int method14345(int i_1, int i_2) {
		try {
			synchronized (aCanvas10290.getTreeLock()) {
				Dimension dimension_4 = aCanvas10290.getSize();
				H(i_1, i_2, dimension_4.width, dimension_4.height);
				aBool10291 = false;
				return 0;
			}
		} catch (Exception exception_6) {
			method15706(exception_6);
			return -1;
		}
	}

	@Override
	protected void finalize() {
		if (nativeid != 0L) {
			Class156.method2642(this);
		}

	}

	@Override
	public boolean method213() {
		aja10289.PA(this);
		return true;
	}

	@Override
	public void method14347(int i_1, int i_2) {
		anInt10288 = i_1;
		anInt10287 = i_2;
		wa(aCanvas10290, i_1, i_2);
		if (aja10289.method8523() == this) {
			method213();
		}

	}

	public native void n(ja var1, Canvas var2, int var3, int var4);

	public native void H(int var1, int var2, int var3, int var4);

	public native void wa(Canvas var1, int var2, int var3);

	@Override
	public int method14344() {
		return method14353(0, 0);
	}

	@Override
	public boolean method2723() {
		return true;
	}

	@Override
	public void method14354(int i_1, int i_2) {
		anInt10288 = i_1;
		anInt10287 = i_2;
		wa(aCanvas10290, i_1, i_2);
		if (aja10289.method8523() == this) {
			method213();
		}

	}

	@Override
	public int method2714() {
		return anInt10288;
	}

	@Override
	public int method14353(int i_1, int i_2) {
		try {
			synchronized (aCanvas10290.getTreeLock()) {
				Dimension dimension_4 = aCanvas10290.getSize();
				H(i_1, i_2, dimension_4.width, dimension_4.height);
				aBool10291 = false;
				return 0;
			}
		} catch (Exception exception_6) {
			method15706(exception_6);
			return -1;
		}
	}

	@Override
	public void method212() {
		if (aja10289.method8523() == this) {
			method2718();
		}

		ma(true);
		nativeid = 0L;
		aCanvas10290 = null;
	}

	@Override
	public void method186() {
		if (aja10289.method8523() == this) {
			method2718();
		}

		ma(true);
		nativeid = 0L;
		aCanvas10290 = null;
	}

	public native void as(int var1, int var2, int var3, int var4);

	@Override
	public int method2719() {
		return anInt10288;
	}

	@Override
	public int method2720() {
		return anInt10288;
	}

	public native void ai(Canvas var1, int var2, int var3);

	@Override
	public boolean method211() {
		aja10289.PA(this);
		return true;
	}

	@Override
	public boolean method54() {
		aja10289.PA(this);
		return true;
	}

	public native void ah(Canvas var1, int var2, int var3);

	@Override
	public native void ma(boolean var1);

	@Override
	public boolean method2717() {
		return true;
	}

	@Override
	public boolean method2724() {
		return true;
	}

	public native void ax(int var1, int var2, int var3, int var4);

	@Override
	public boolean method2722() {
		return true;
	}

	@Override
	public void method14348(int i_1, int i_2) {
		anInt10288 = i_1;
		anInt10287 = i_2;
		wa(aCanvas10290, i_1, i_2);
		if (aja10289.method8523() == this) {
			method213();
		}

	}

	@Override
	public int method2721() {
		return anInt10287;
	}

	@Override
	public int method2727() {
		return anInt10287;
	}

	@Override
	public int method14349() {
		return method14353(0, 0);
	}

	@Override
	public int method14350() {
		return method14353(0, 0);
	}

	@Override
	public int method14346() {
		return method14353(0, 0);
	}

	public void method15706(Exception exception_1) {
		if (!aBool10291) {
			aLong10286 = Utils.time();
			aBool10291 = true;
		} else {
			if (Utils.time() - aLong10286 >= 30000L) {
				throw new RuntimeException(exception_1.getMessage());
			}

			aCanvas10290.repaint();
		}

	}

	@Override
	public boolean method2725() {
		return true;
	}

	@Override
	public int method14352(int i_1, int i_2) {
		try {
			synchronized (aCanvas10290.getTreeLock()) {
				Dimension dimension_4 = aCanvas10290.getSize();
				H(i_1, i_2, dimension_4.width, dimension_4.height);
				aBool10291 = false;
				return 0;
			}
		} catch (Exception exception_6) {
			method15706(exception_6);
			return -1;
		}
	}

	@Override
	public int method2716() {
		return anInt10287;
	}

	@Override
	public boolean method2718() {
		return true;
	}

	@Override
	public native void y(boolean var1);

	@Override
	public native void x(boolean var1);

	public native void az(ja var1, Canvas var2, int var3, int var4);

	public native void ap(int var1, int var2, int var3, int var4);

	public native void al(int var1, int var2, int var3, int var4);

	@Override
	public boolean method2715() {
		return true;
	}

	@Override
	public int method2726() {
		return anInt10288;
	}

	@Override
	public int method14351(int i_1, int i_2) {
		try {
			synchronized (aCanvas10290.getTreeLock()) {
				Dimension dimension_4 = aCanvas10290.getSize();
				H(i_1, i_2, dimension_4.width, dimension_4.height);
				aBool10291 = false;
				return 0;
			}
		} catch (Exception exception_6) {
			method15706(exception_6);
			return -1;
		}
	}

}
