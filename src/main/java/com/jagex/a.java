package com.jagex;

import com.jagex.client.render.AbstractRenderer;
import com.jagex.unknown.Class156;

public class a implements Interface40 {

	public long nativeid;
	Runnable aRunnable48;
	h[] ahArray49 = new h[7];
	h[] ahArray47 = new h[7];
	ja aja50;
	public Matrix44 aClass384_51;

	a(ja ja_1, int i_2, int i_3) {
		aja50 = ja_1;

		for (int i_4 = 0; i_4 < 7; i_4++) {
			ahArray49[i_4] = new h(aja50);
			ahArray47[i_4] = new h(aja50);
		}

		aClass384_51 = new Matrix44();
		ha(nativeid, ja_1, i_2, i_3);
	}

	public void method307() {
		aRunnable48 = Thread.currentThread();
		method310();
	}

	public native void ha(long var1, AbstractRenderer var3, int var4, int var5);

	@Override
	protected void finalize() {
		if (nativeid != 0L) {
			Class156.method2642(this);
		}

	}

	@Override
	public void ma(boolean bool_1) {
		R(nativeid, bool_1);
	}

	public native void R(long var1, boolean var3);

	public native void b(long var1, AbstractRenderer var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

	public native void ac(long var1, AbstractRenderer var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

	public void method309(AbstractRenderer graphicalrenderer_1, int[] ints_2, int[] ints_3, int[] ints_4, short[] shorts_5, int i_6) {
		b(nativeid, graphicalrenderer_1, ints_2, ints_3, ints_4, shorts_5, i_6);
	}

	public void method310() {
		JA(nativeid);
	}

	public void method311(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		K(nativeid, graphicalrenderer_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
	}

	public void method313(MeshRasterizer meshrasterizer_1, MeshRasterizer meshrasterizer_2, int i_3, int i_4, int i_5, boolean bool_6) {
		P(nativeid, ((h) meshrasterizer_1).nativeid, ((h) meshrasterizer_2).nativeid, i_3, i_4, i_5, bool_6);
	}

	public native void aq(long var1, long var3, int[] var5, float[] var6);

	public void method314(MeshRasterizer meshrasterizer_1, Matrix44Var matrix44var_2, int[] ints_3, int i_4) {
		aClass384_51.fromVarMatrix44(matrix44var_2);
		wa(nativeid, ((h) meshrasterizer_1).nativeid, aClass384_51.buf, ints_3, i_4);
	}

	public native void wa(long var1, long var3, float[] var5, int[] var6, int var7);

	public native boolean ya(long var1, long var3, int var5, int var6, float[] var7, boolean var8);

	public native void a(long var1);

	public native void J(long var1, long var3, int[] var5, float[] var6);

	public void method316(Ground class390_1, int i_2, int i_3) {
		v(nativeid, ((i) class390_1).nativeid, i_2, i_3);
	}

	public void method318(Ground class390_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, boolean[][] bools_9) {
		i(nativeid, ((i) class390_1).nativeid, i_2, i_3, i_4, i_5, i_6, i_7, i_8, bools_9);
	}

	public native void v(long var1, long var3, int var5, int var6);

	public native void bs(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);

	@Override
	public void x(boolean bool_1) {
		R(nativeid, bool_1);
	}

	public native void s(long var1, AbstractRenderer var3, int var4, int var5);

	public native void i(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);

	public native void bz(long var1, long var3, int var5, int var6);

	public native void d(long var1);

	MeshRasterizer method325(h h_1, byte b_2, int i_3, boolean bool_4) {
		boolean bool_5 = false;
		h h_6;
		h h_7;
		if (b_2 > 0 && b_2 <= 7) {
			h_7 = ahArray47[b_2 - 1];
			h_6 = ahArray49[b_2 - 1];
			bool_5 = true;
		} else {
			h_6 = h_7 = new h(aja50);
		}

		h_1.BA(h_6, h_7, i_3, bool_5, bool_4);
		h_6.aClass87Array7139 = h_1.aClass87Array7139;
		h_6.aClass172Array7142 = h_1.aClass172Array7142;
		return h_6;
	}

	public native void au(long var1, AbstractRenderer var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

	public native void ay(long var1, AbstractRenderer var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

	public native void at(long var1, AbstractRenderer var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

	public native void K(long var1, AbstractRenderer var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

	public native void aw(long var1, long var3, long var5, int var7, int var8, int var9, boolean var10);

	public native void az(long var1, long var3, long var5, int var7, int var8, int var9, boolean var10);

	public void method331(MeshRasterizer meshrasterizer_1, int[] ints_2, Matrix44Var matrix44var_3) {
		aClass384_51.fromVarMatrix44(matrix44var_3);
		J(nativeid, ((h) meshrasterizer_1).nativeid, ints_2, aClass384_51.buf);
	}

	public boolean method335(MeshRasterizer meshrasterizer_1, int i_2, int i_3, Matrix44Var matrix44var_4, boolean bool_5) {
		aClass384_51.fromVarMatrix44(matrix44var_4);
		return ya(nativeid, ((h) meshrasterizer_1).nativeid, i_2, i_3, aClass384_51.buf, bool_5);
	}

	public native void ah(long var1, long var3, float[] var5, int[] var6, int var7);

	public native void ai(long var1, long var3, float[] var5, int[] var6, int var7);

	public native void P(long var1, long var3, long var5, int var7, int var8, int var9, boolean var10);

	public native void k(long var1, AbstractRenderer var3, int var4, int var5);

	public native void JA(long var1);

	@Override
	public void y(boolean bool_1) {
		R(nativeid, bool_1);
	}

	public native void bm(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);

	public native void u(long var1, AbstractRenderer var3, int var4, int var5);

}
