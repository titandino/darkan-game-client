package com.jagex.client.js5.defs;

import com.jagex.Index;
import com.jagex.Interface;
import com.jagex.client.client;
import com.jagex.client.js5.defs.models.RSMesh;
import com.jagex.client.js5.loaders.IdentiKitIndexLoader;
import com.jagex.game.content.clans.settings.ChangeClanSetting;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class246;
import com.jagex.unknown.Class484;
import com.jagex.unknown.Class5;

public class IdentikitDefinition implements Definition {

	public int id;
	public static int[] anIntArray428 = {0, 1, 2, 3, 4, 5, 6, 14};
	public static int[] anIntArray422 = {7, 8, 9, 10, 11, 12, 13, 15};
	public static int anInt430;
	public static int anInt431;
	public IdentiKitIndexLoader aClass31_429;
	public int[] modelIds;
	public short[] originalColours;
	public short[] replacementColours;
	public short[] originalTextures;
	public short[] replacementTextures;
	public int[] headModels = {-1, -1, -1, -1, -1};

	public static int method912(int i_0) {
		return i_0 == 16711935 ? -1 : Class5.method294(i_0);
	}

	public static void method913(Interface interface_0, IComponentDefinitions icomponentdefinitions_1) {
		IComponentDefinitions icomponentdefinitions_3 = IComponentDefinitions.getParentLayer(interface_0, icomponentdefinitions_1);
		int i_4;
		int i_5;
		if (icomponentdefinitions_3 == null) {
			i_4 = ChangeClanSetting.BASE_WINDOW_WIDTH;
			i_5 = client.BASE_WINDOW_HEIGHT * -969250379;
		} else {
			i_4 = icomponentdefinitions_3.width;
			i_5 = icomponentdefinitions_3.height;
		}
		Class484.initSizes(icomponentdefinitions_1, i_4, i_5, false);
		Class246.method4204(icomponentdefinitions_1, i_4, i_5);
	}

	public RSMesh renderHead() {
		RSMesh[] arr_2 = new RSMesh[5];
		int i_3 = 0;
		Index index_4 = aClass31_429.meshIndex;
		int i_5;
		synchronized (aClass31_429.meshIndex) {
			i_5 = 0;
			while (i_5 < 5) {
				if (headModels[i_5] != -1) {
					arr_2[i_3++] = RSMesh.decodeMesh(aClass31_429.meshIndex, headModels[i_5]);
				}
				++i_5;
			}
		}
		for (int i_6 = 0; i_6 < 5; i_6++) {
			if (arr_2[i_6] != null && arr_2[i_6].version < 13) {
				arr_2[i_6].upscale();
			}
		}
		RSMesh rsmesh_8 = new RSMesh(arr_2, i_3);
		if (originalColours != null) {
			for (i_5 = 0; i_5 < originalColours.length; i_5++) {
				rsmesh_8.recolor(originalColours[i_5], replacementColours[i_5]);
			}
		}
		if (originalTextures != null) {
			for (i_5 = 0; i_5 < originalTextures.length; i_5++) {
				rsmesh_8.retexture(originalTextures[i_5], replacementTextures[i_5]);
			}
		}
		return rsmesh_8;
	}

	public void decode(ByteBuf buffer, int opcode) {
		if (opcode == 1) {
			buffer.readUnsignedByte();
		} else if (opcode == 2) {
			int count = buffer.readUnsignedByte();
			modelIds = new int[count];
			for (int i_5 = 0; i_5 < count; i_5++) {
				modelIds[i_5] = buffer.readBigSmart();
			}
		} else if (opcode == 40) {
			int count = buffer.readUnsignedByte();
			originalColours = new short[count];
			replacementColours = new short[count];
			for (int i_5 = 0; i_5 < count; i_5++) {
				originalColours[i_5] = (short) buffer.readUnsignedShort();
				replacementColours[i_5] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 41) {
			int count = buffer.readUnsignedByte();
			originalTextures = new short[count];
			replacementTextures = new short[count];
			for (int i_5 = 0; i_5 < count; i_5++) {
				originalTextures[i_5] = (short) buffer.readUnsignedShort();
				replacementTextures[i_5] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode >= 60 && opcode < 70) {
			headModels[opcode - 60] = buffer.readBigSmart();
		}
	}

	public boolean method898() {
		if (modelIds == null) {
			return true;
		} else {
			boolean bool_2 = true;
			Index index_3 = aClass31_429.meshIndex;
			synchronized (aClass31_429.meshIndex) {
				for (int i_4 = 0; i_4 < modelIds.length; i_4++) {
					if (!aClass31_429.meshIndex.load(modelIds[i_4], 0)) {
						bool_2 = false;
					}
				}
				return bool_2;
			}
		}
	}

	public RSMesh renderBody() {
		if (modelIds == null)
			return null;
		RSMesh[] meshes = new RSMesh[modelIds.length];
		int index;
		synchronized (aClass31_429.meshIndex) {
			index = 0;
			while (index < modelIds.length) {
				meshes[index] = RSMesh.decodeMesh(aClass31_429.meshIndex, modelIds[index]);
				++index;
			}
		}
		for (int i_5 = 0; i_5 < modelIds.length; i_5++) {
			if (meshes[i_5].version < 13) {
				meshes[i_5].upscale();
			}
		}
		RSMesh mesh = meshes.length == 1 ? meshes[0] : new RSMesh(meshes, meshes.length);
		if (mesh == null)
			return null;
		if (originalColours != null) {
			for (index = 0; index < originalColours.length; index++) {
				mesh.recolor(originalColours[index], replacementColours[index]);
			}
		}
		if (originalTextures != null) {
			for (index = 0; index < originalTextures.length; index++) {
				mesh.retexture(originalTextures[index], replacementTextures[index]);
			}
		}
		return mesh;
	}

	public boolean method900() {
		boolean bool_2 = true;
		Index index_3 = aClass31_429.meshIndex;
		synchronized (aClass31_429.meshIndex) {
			for (int i_4 = 0; i_4 < 5; i_4++) {
				if (headModels[i_4] != -1 && !aClass31_429.meshIndex.load(headModels[i_4], 0)) {
					bool_2 = false;
				}
			}
			return bool_2;
		}
	}

	public void decode(ByteBuf buffer) {
		while (true) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0) {
				return;
			}
			decode(buffer, opcode);
		}
	}
}
