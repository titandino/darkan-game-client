package com.jagex.client.js5.defs.models.materials;

import com.jagex.ShaderDecoder;
import com.jagex.client.js5.defs.IComponentDefinitions;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class316;
import com.jagex.unknown.Class320;
import com.jagex.unknown.Class532_Sub1;

public class MaterialPropTexture extends MaterialProperty {

	public static IComponentDefinitions aClass118_9884;
	int[] pixels;
	int height;
	int width;
	int textureId = -1;

	public MaterialPropTexture() {
		super(0, false);
	}

	public static int method15390(int i_0, int i_1) {
		return i_1 < 0 ? -i_0 : (int) (i_0 * Math.sqrt(1.220703125E-4D * i_1) + 0.5D);
	}

	public static void method15391() {
		if (Class320.aClass253_3723 != null) {
			Class320.aClass253_3723.method4333();
		}

		if (ShaderDecoder.aClass253_1008 != null) {
			ShaderDecoder.aClass253_1008.method4333();
		}

	}

	@Override
	public int[][] getPixels(int i_1) {
		int[][] ints_3 = aClass308_7670.method5463(i_1);
		if (aClass308_7670.aBool3619) {
			int i_4 = (height != Class316.anInt3671 ? height * i_1 / Class316.anInt3671 : i_1) * width;
			int[] ints_5 = ints_3[0];
			int[] ints_6 = ints_3[1];
			int[] ints_7 = ints_3[2];
			int i_8;
			int i_9;
			if (width == Class316.anInt3670) {
				for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
					i_9 = pixels[i_4++];
					ints_7[i_8] = (i_9 & 0xff) << 4;
					ints_6[i_8] = (i_9 & 0xff00) >> 4;
					ints_5[i_8] = (i_9 & 0xff0000) >> 12;
				}
			} else {
				for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
					i_9 = i_8 * width / Class316.anInt3670;
					int i_10 = pixels[i_4 + i_9];
					ints_7[i_8] = (i_10 & 0xff) << 4;
					ints_6[i_8] = (i_10 & 0xff00) >> 4;
					ints_5[i_8] = (i_10 & 0xff0000) >> 12;
				}
			}
		}

		return ints_3;
	}

	@Override
	public void method12315(int width, int height) {
		super.method12315(width, height);
		if (textureId >= 0 && Class532_Sub1.IMAGE_LOADER != null) {
			int resolution = Class532_Sub1.IMAGE_LOADER.getTextureDetails(textureId).isHalfSize ? 64 : 128;
			pixels = Class532_Sub1.IMAGE_LOADER.renderTexturePixels(textureId, 1.0F, resolution, resolution, false);
			this.height = resolution;
			this.width = resolution;
		}

	}

	@Override
	public void reset() {
		super.reset();
		pixels = null;
	}

	@Override
	public void decode(int i_1, ByteBuf rsbytebuffer_2) {
		if (i_1 == 0) {
			textureId = rsbytebuffer_2.readUnsignedShort();
		}

	}

	@Override
	public int getTextureId() {
		return textureId;
	}

}
