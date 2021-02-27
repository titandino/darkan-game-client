package com.jagex.client.js5.loaders;

import com.jagex.ImageLoader;
import com.jagex.Index;
import com.jagex.TextureDetails;
import com.jagex.client.Engine;
import com.jagex.client.cache.CacheableNode;
import com.jagex.client.js5.defs.models.materials.MaterialDefinitions;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class223;
import com.jagex.unknown.Class393;

public class ImageIndexLoader implements ImageLoader {

	public Class223 materialCache = new Class223(256);

	public Index textureIndex;

	public Index spriteIndex;

	public int textureDefSize;

	public TextureDetails[] textures;

	public ImageIndexLoader(Index textureDefIndex, Index textureIndex, Index spriteIndex) {
		this.textureIndex = textureIndex;
		this.spriteIndex = spriteIndex;
		ByteBuf stream = new ByteBuf(textureDefIndex.getFile(0, 0));
		textureDefSize = stream.readUnsignedShort();
		textures = new TextureDetails[textureDefSize];
		int i_5;
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (stream.readUnsignedByte() == 1) {
				textures[i_5] = new TextureDetails();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].isGroundMesh = stream.readUnsignedByte() == 0;
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].isHalfSize = stream.readUnsignedByte() == 1;
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].skipTriangles = stream.readUnsignedByte() == 1;
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].brightness = stream.readByte();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].shadowFactor = stream.readByte();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].effectId = stream.readByte();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].effectParam1 = stream.readByte();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].color = (short) stream.readUnsignedShort();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].textureSpeedU = stream.readByte();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].textureSpeedV = stream.readByte();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].aBool2087 = stream.readUnsignedByte() == 1;
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].isBrickTile = stream.readUnsignedByte() == 1;
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].useMipmaps = stream.readByte();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].repeatS = stream.readUnsignedByte() == 1;
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].repeatT = stream.readUnsignedByte() == 1;
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].hdr = stream.readUnsignedByte() == 1;
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].combineMode = stream.readUnsignedByte();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].effectParam2 = stream.readInt();
			}
		}
		for (i_5 = 0; i_5 < textureDefSize; i_5++) {
			if (textures[i_5] != null) {
				textures[i_5].blendType = stream.readUnsignedByte();
			}
		}
	}

	public static int method5773(int i_0, int i_1) {
		int i_3 = i_1 >>> 24;
		int i_4 = 255 - i_3;
		i_1 = (i_3 * (i_1 & 0xff00ff) & -16711936 | i_3 * (i_1 & 0xff00) & 0xff0000) >>> 8;
		return ((i_4 * (i_0 & 0xff00ff) & -16711936 | (i_0 & 0xff00) * i_4 & 0xff0000) >>> 8) + i_1;
	}

	public static void setDefaultCPUPreference() {
		if (Engine.AVAILABLE_PROCESSORS > 1) {
			Class393.preferences.setValue(Class393.preferences.cpu, 4);
		} else {
			Class393.preferences.setValue(Class393.preferences.cpu, 2);
		}
	}

	public MaterialDefinitions getMaterialDefinitions(int textureId) {
		if (textureId == 247)
			System.out.println("GETTING 247 MATERIAL");
		CacheableNode node = materialCache.get(textureId);
		if (node != null)
			return (MaterialDefinitions) node;
		byte[] data = textureIndex.getFile(textureId);
		if (data == null)
			return null;
		MaterialDefinitions materialDefinitions = new MaterialDefinitions(textureId, new ByteBuf(data));
		materialCache.put(materialDefinitions, textureId);
		return materialDefinitions;
	}

	@Override
	public int method84() {
		return textureDefSize;
	}

	@Override
	public TextureDetails getTextureDetails(int id) {
		return textures[id];
	}

	@Override
	public void method161() {
	}

	@Override
	public int[] renderMaterialPixelsI(int textureId, int width, int height) {
		int[] pixels = getMaterialDefinitions(textureId).renderIntPixels(spriteIndex, this, (float) 0.7, width, height, textures[textureId].isBrickTile);
		return pixels;
	}

	@Override
	public float[] renderMaterialPixelsF(int i_1, int i_3, int i_4) {
		float[] floats_7 = getMaterialDefinitions(i_1).renderFloatPixels(spriteIndex, this, i_3, i_4, textures[i_1].isBrickTile);
		return floats_7;
	}

	@Override
	public boolean loadTexture(int id) {
		if (id == 247)
			System.out.println("LOADING TEXTURE 247");
		MaterialDefinitions material = getMaterialDefinitions(id);
		return material != null && material.loadImageFiles(spriteIndex, this);
	}

	@Override
	public int[] renderTexturePixels(int textureId, float f_2, int i_3, int i_4, boolean bool_5) {
		int[] pixels = getMaterialDefinitions(textureId).method14718(spriteIndex, this, f_2, i_3, i_4, bool_5, textures[textureId].isBrickTile);
		return pixels;
	}

}
