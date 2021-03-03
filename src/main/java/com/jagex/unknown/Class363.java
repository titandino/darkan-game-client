package com.jagex.unknown;

import com.jagex.*;
import com.jagex.client.client;
import com.jagex.client.js5.IndexLoaders;
import com.jagex.client.js5.defs.IdentikitDefinition;
import com.jagex.client.js5.loaders.MapSpriteIndexLoader;
import com.jagex.client.render.font.FontRenderer_Sub1;

public class Class363 {

	public static int anInt4203;

	public Class363() throws Throwable {
		throw new Error();
	}

	public static void method6286(long long_0) {
		Vector3 vector3_2 = VertexNormal.MY_PLAYER.method11166().coords;
		int i_3 = (int) vector3_2.x + client.anInt7248;
		int i_4 = (int) vector3_2.z + client.anInt7250;
		if (Class11.anInt122 - i_3 < -2000 || Class11.anInt122 - i_3 > 2000 || LibraryBase.anInt3289 - i_4 < -2000 || LibraryBase.anInt3289 - i_4 > 2000) {
			Class11.anInt122 = i_3;
			LibraryBase.anInt3289 = i_4;
		}
		int i_5;
		int i_6;
		if (i_3 != Class11.anInt122) {
			i_5 = i_3 - Class11.anInt122;
			i_6 = (int) (long_0 * i_5 / 320L);
			if (i_5 > 0) {
				if (i_6 == 0) {
					i_6 = 1;
				} else if (i_6 > i_5) {
					i_6 = i_5;
				}
			} else if (i_6 == 0) {
				i_6 = -1;
			} else if (i_6 < i_5) {
				i_6 = i_5;
			}
			Class11.anInt122 += i_6;
		}
		if (i_4 != LibraryBase.anInt3289) {
			i_5 = i_4 - LibraryBase.anInt3289;
			i_6 = (int) (long_0 * i_5 / 320L);
			if (i_5 > 0) {
				if (i_6 == 0) {
					i_6 = 1;
				} else if (i_6 > i_5) {
					i_6 = i_5;
				}
			} else if (i_6 == 0) {
				i_6 = -1;
			} else if (i_6 < i_5) {
				i_6 = i_5;
			}
			LibraryBase.anInt3289 += i_6;
		}
		client.camAngleY += client.aFloat7266 * long_0 / 6.0F;
		client.camAngleX += client.aFloat7284 * long_0 / 6.0F;
		Isaac.processCamera();
	}

	public static void method6287(PathingEntity entity, boolean bool_1) {
		int moveType = MoveSpeed.STATIONARY.id;
		int i_4 = 0;
		if (entity.forceMovementT1Delay > client.CYCLES_20MS) {
			Static.method4281(entity);
		} else if (entity.forceMovementT2Delay >= client.CYCLES_20MS) {
			ProcessorSpecs.method7727(entity);
		} else {
			SystemInfo.method13466(entity, bool_1);
			moveType = IdentikitDefinition.anInt430;
			i_4 = FontRenderer_Sub1.anInt8515;
		}
		Vector3 vector3_5 = entity.method11166().coords;
		int i_6;
		if ((int) vector3_5.x < 512 || (int) vector3_5.z < 512 || (int) vector3_5.x >= (IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1) * 512 || (int) vector3_5.z >= (IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1) * 512) {
			entity.currentAnimation.update(-1);
			for (i_6 = 0; i_6 < entity.spotAnims.length; i_6++) {
				entity.spotAnims[i_6].spotAnimId = -1;
				entity.spotAnims[i_6].animation.update(-1);
			}
			entity.currentAnimations = null;
			entity.forceMovementT1Delay = 0;
			entity.forceMovementT2Delay = 0;
			moveType = MoveSpeed.STATIONARY.id;
			i_4 = 0;
			entity.method11172((512 * entity.regionBaseX[0] + entity.getSize() * 256), vector3_5.y, (entity.regionBaseY[0] * 512 + entity.getSize() * 256));
			entity.method15801();
		}
		if (VertexNormal.MY_PLAYER == entity && ((int) vector3_5.x < 6144 || (int) vector3_5.z < 6144 || (int) vector3_5.x >= (IndexLoaders.MAP_REGION_DECODER.getSizeX() - 12) * 512 || (int) vector3_5.z >= (IndexLoaders.MAP_REGION_DECODER.getSizeY() - 12) * 512)) {
			entity.currentAnimation.update(-1);
			for (i_6 = 0; i_6 < entity.spotAnims.length; i_6++) {
				entity.spotAnims[i_6].spotAnimId = -1;
				entity.spotAnims[i_6].animation.update(-1);
			}
			entity.currentAnimations = null;
			entity.forceMovementT1Delay = 0;
			entity.forceMovementT2Delay = 0;
			moveType = MoveSpeed.STATIONARY.id;
			i_4 = 0;
			entity.method11172((entity.regionBaseX[0] * 512 + entity.getSize() * 256), vector3_5.y, (512 * entity.regionBaseY[0] + entity.getSize() * 256));
			entity.method15801();
		}
		i_6 = MapSpriteIndexLoader.method7188(entity);
		WallDecoration.method16087(entity);
		Class302.handleMovementAnimations(entity, moveType, i_4, i_6);
		Class236.getAnimationForSpeed(entity, moveType);
		Class150.method2581(entity);
		Quaternion quaternion_7 = Quaternion.create();
		quaternion_7.romYawPitchRoll(Trig.degToRad(entity.aClass19_10359.method578()), Trig.degToRad(entity.aClass19_10330.method578()), Trig.degToRad(entity.aClass19_10360.method578()));
		entity.method11187(quaternion_7);
		quaternion_7.cache();
	}
}
