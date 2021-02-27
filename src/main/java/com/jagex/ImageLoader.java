package com.jagex;

public interface ImageLoader {

	public boolean loadTexture(int var1);

	int[] renderTexturePixels(int var1, float var2, int var3, int var4, boolean var5);

	int[] renderMaterialPixelsI(int var1, int var3, int var4);

	public int method84();

	TextureDetails getTextureDetails(int var1);

	public float[] renderMaterialPixelsF(int var1, int var3, int var4);

	public void method161();

}
