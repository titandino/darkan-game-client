package com.jagex;

import com.jagex.client.anims.Animation;
import com.jagex.client.cache.CacheableNode_Sub7;
import com.jagex.client.client;
import com.jagex.client.input.KeyHoldInputSubscriber;
import com.jagex.client.js5.defaultfiles.impl.EquipmentDefaults;
import com.jagex.client.js5.defs.BASDefinitions;
import com.jagex.client.js5.defs.animations.AnimationDefinitions;
import com.jagex.client.js5.defs.models.RSMesh;
import com.jagex.client.js5.loaders.BASIndexLoader;
import com.jagex.client.js5.loaders.IdentiKitIndexLoader;
import com.jagex.client.js5.loaders.ItemIndexLoader;
import com.jagex.client.js5.loaders.NPCIndexLoader;
import com.jagex.client.render.AbstractRenderer;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.*;

import java.util.Arrays;

public class PlayerModel {
	/**
	 *
	 */
	public static int[] IDK_PART_TABLE = {8, 11, 4, 6, 9, 7, 10, 0};
	public static LRUCache aClass229_2920 = new LRUCache(260);
	public static LRUCache aClass229_2930 = new LRUCache(5);
	public int mimickingNpcId = -1;
	public int[] colours;
	public boolean isFemale;
	public long aLong2926;
	int basId;
	int[] appearance;
	MeshModifier[] meshModifiers;
	public long aLong2927;

	public static void method4032(String string_0, String string_1, int i_2, int i_3, int i_4, long long_5, int i_7, int i_8, boolean bool_9, boolean bool_10, long long_11, boolean bool_13) {
		if (!Class20.aBool161 && Class20.anInt169 < 520) {
			i_2 = i_2 != -1 ? i_2 : client.anInt7427;
			CacheableNode_Sub7 class282_sub50_sub7_15 = new CacheableNode_Sub7(string_0, string_1, i_2, i_3, i_4, long_5, i_7, i_8, bool_9, bool_10, long_11, bool_13);
			Class361.method6269(class282_sub50_sub7_15);
		}
	}

	public static void method4034(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_8 = EntityNode.method4890(i_2, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068);
		int i_9 = EntityNode.method4890(i_3, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068);
		int i_10 = EntityNode.method4890(i_0, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069);
		int i_11 = EntityNode.method4890(i_1, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069);
		int i_12 = EntityNode.method4890(i_2 + i_6, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068);
		int i_13 = EntityNode.method4890(i_3 - i_6, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068);
		int i_14;
		for (i_14 = i_8; i_14 < i_12; i_14++) {
			KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_14], i_10, i_11, i_5);
		}
		for (i_14 = i_9; i_14 > i_13; --i_14) {
			KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_14], i_10, i_11, i_5);
		}
		i_14 = EntityNode.method4890(i_0 + i_6, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069);
		int i_15 = EntityNode.method4890(i_1 - i_6, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069);
		for (int i_16 = i_12; i_16 <= i_13; i_16++) {
			int[] ints_17 = Class532_Sub1.anIntArrayArray7072[i_16];
			KeyHoldInputSubscriber.method3922(ints_17, i_10, i_14, i_5);
			KeyHoldInputSubscriber.method3922(ints_17, i_14, i_15, i_4);
			KeyHoldInputSubscriber.method3922(ints_17, i_15, i_11, i_5);
		}
	}

	public void refresh() {
		long[] longs_2 = ByteBuf.aLongArray7979;
		aLong2926 = -1L;
		aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (basId >> 8)) & 0xffL)];
		aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ basId) & 0xffL)];
		int i_3;
		for (i_3 = 0; i_3 < appearance.length; i_3++) {
			aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (appearance[i_3] >> 24)) & 0xffL)];
			aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (appearance[i_3] >> 16)) & 0xffL)];
			aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (appearance[i_3] >> 8)) & 0xffL)];
			aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ appearance[i_3]) & 0xffL)];
		}
		if (meshModifiers != null) {
			for (i_3 = 0; i_3 < meshModifiers.length; i_3++) {
				if (meshModifiers[i_3] != null) {
					int[] ints_4;
					int[] ints_5;
					if (isFemale) {
						ints_4 = meshModifiers[i_3].femaleBody;
						ints_5 = meshModifiers[i_3].femaleHead;
					} else {
						ints_4 = meshModifiers[i_3].maleBody;
						ints_5 = meshModifiers[i_3].maleHead;
					}
					int i_6;
					if (ints_4 != null) {
						for (i_6 = 0; i_6 < ints_4.length; i_6++) {
							aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (ints_4[i_6] >> 8)) & 0xffL)];
							aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ ints_4[i_6]) & 0xffL)];
						}
					}
					if (ints_5 != null) {
						for (i_6 = 0; i_6 < ints_5.length; i_6++) {
							aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (ints_5[i_6] >> 8)) & 0xffL)];
							aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ ints_5[i_6]) & 0xffL)];
						}
					}
					if (meshModifiers[i_3].modifiedColors != null) {
						for (i_6 = 0; i_6 < meshModifiers[i_3].modifiedColors.length; i_6++) {
							aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (meshModifiers[i_3].modifiedColors[i_6] >> 8)) & 0xffL)];
							aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ meshModifiers[i_3].modifiedColors[i_6]) & 0xffL)];
						}
					}
					if (meshModifiers[i_3].modifiedTextures != null) {
						for (i_6 = 0; i_6 < meshModifiers[i_3].modifiedTextures.length; i_6++) {
							aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (meshModifiers[i_3].modifiedTextures[i_6] >> 8)) & 0xffL)];
							aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ meshModifiers[i_3].modifiedTextures[i_6]) & 0xffL)];
						}
					}
				}
			}
		}
		for (i_3 = 0; i_3 < 10; i_3++) {
			aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ colours[i_3]) & 0xffL)];
		}
		aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (isFemale ? 1 : 0)) & 0xffL)];
	}

	public void setAppearanceData(int basId, int[] appearance, MeshModifier[] meshModifiers, int[] colours, boolean isFemale, int mimickingNpcId) {
		this.basId = basId;
		this.appearance = appearance;
		this.meshModifiers = meshModifiers;
		this.colours = colours;
		this.isFemale = isFemale;
		this.mimickingNpcId = mimickingNpcId;
		refresh();
	}

	public void setIDKPart(int slot, int id, IdentiKitIndexLoader loader) {
		int partIndex = IDK_PART_TABLE[slot];
		if (loader.getIdentiKit(id) != null) {
			appearance[partIndex] = id | -2147483648;
			refresh();
		}
	}

	public void setItem(int index, int itemId, ItemIndexLoader loader) {
		if (itemId == -1) {
			appearance[index] = 0;
		} else if (loader.getItemDefinitions(itemId) != null) {
			appearance[index] = itemId | 0x40000000;
			refresh();
		}
	}

	public MeshRasterizer getBodyModel(AbstractRenderer renderer, int i_2, BASIndexLoader basDefsLoader, IdentiKitIndexLoader class31_4, NPCIndexLoader loader, ItemIndexLoader itemindexloader_6, VarProvider interface42_8, Animation currentAnimation, Animation animation_10, Animation[] arr_11, int[] ints_12, int i_13, EquipmentDefaults equipDefaults) {
		if (mimickingNpcId != -1) {
			return loader.getNPCType(mimickingNpcId).method6875(renderer, i_2, basDefsLoader, interface42_8, currentAnimation, animation_10, arr_11, ints_12, i_13, null);
		} else {
			int i_17 = i_2;
			long long_18 = aLong2926;
			int[] appearance = this.appearance;
			boolean bool_21 = false;
			boolean bool_22 = false;
			int i;
			if (currentAnimation != null) {
				AnimationDefinitions animationDefs = currentAnimation.getDefs();
				if (animationDefs != null && (animationDefs.leftHandItem >= 0 || animationDefs.rightHandItem >= 0)) {
					appearance = new int[this.appearance.length];
					for (i = 0; i < appearance.length; i++)
						appearance[i] = this.appearance[i];
					if (animationDefs.leftHandItem >= 0 && equipDefaults.offhandSlot != -1) {
						bool_21 = true;
						if (animationDefs.leftHandItem == 65535) {
							appearance[equipDefaults.offhandSlot] = 0;
							for (i = 0; i < equipDefaults.hiddenAnimationOffhandSlots.length; i++) {
								appearance[equipDefaults.hiddenAnimationOffhandSlots[i]] = 0;
							}
							long_18 ^= -4294967296L;
						} else {
							appearance[equipDefaults.offhandSlot] = animationDefs.leftHandItem | 0x40000000;
							for (i = 0; i < equipDefaults.hiddenAnimationOffhandSlots.length; i++) {
								appearance[equipDefaults.hiddenAnimationOffhandSlots[i]] = 0;
							}
							long_18 ^= (long) appearance[equipDefaults.offhandSlot] << 32;
						}
					}
					if (animationDefs.rightHandItem >= 0 && equipDefaults.weaponSlot != -1) {
						bool_22 = true;
						if (animationDefs.rightHandItem == 65535) {
							appearance[equipDefaults.weaponSlot] = 0;
							for (i = 0; i < equipDefaults.hiddenAnimationWeaponSlots.length; i++) {
								appearance[equipDefaults.hiddenAnimationWeaponSlots[i]] = 0;
							}
							long_18 ^= 0xffffffffL;
						} else {
							appearance[equipDefaults.weaponSlot] = animationDefs.rightHandItem | 0x40000000;
							for (i = 0; i < equipDefaults.hiddenAnimationWeaponSlots.length; i++) {
								appearance[equipDefaults.hiddenAnimationWeaponSlots[i]] = 0;
							}
							long_18 ^= appearance[equipDefaults.weaponSlot];
						}
					}
				}
			}
			boolean bool_38 = false;
			i = arr_11 != null ? arr_11.length : 0;
			for (int i_25 = 0; i_25 < i; i_25++) {
				if (arr_11[i_25] != null) {
					i_17 |= arr_11[i_25].method7640();
					bool_38 = true;
				}
			}
			if (currentAnimation != null) {
				i_17 |= currentAnimation.method7640(); //get flags
				bool_38 = true;
			}
			if (animation_10 != null) {
				i_17 |= animation_10.method7640();
				bool_38 = true;
			}
			boolean bool_50 = false;
			if (ints_12 != null) {
				for (int i_26 = 0; i_26 < ints_12.length; i_26++) {
					if (ints_12[i_26] != -1) {
						i_17 |= 0x20;
						bool_50 = true;
					}
				}
			}
			LRUCache softcache_27 = aClass229_2920;
			MeshRasterizer rasterizer;
			synchronized (aClass229_2920) {
				rasterizer = (MeshRasterizer) aClass229_2920.get(long_18);
			}
			BASDefinitions basDefinitions = null;
			if (basId != -1)
				basDefinitions = basDefsLoader.getBASDefs(basId);
			int i_30;
			int index;
			if (rasterizer == null || renderer.method8452(rasterizer.m(), i_17) != 0) {
				if (rasterizer != null) {
					i_17 = renderer.method8546(i_17, rasterizer.m());
				}
				boolean bool_29 = false;
				i_30 = 0;
				while (true) {
					int i_34;
					if (i_30 >= appearance.length) {
						if (bool_29) {
							if (aLong2927 != -1L) {
								LRUCache softcache_40 = aClass229_2920;
								synchronized (aClass229_2920) {
									rasterizer = (MeshRasterizer) aClass229_2920.get(aLong2927);
								}
							}
							if (rasterizer == null || renderer.method8452(rasterizer.m(), i_17) != 0) {
								return null;
							}
						} else {
							RSMesh[] meshes = new RSMesh[appearance.length];
							int look;
							for (index = 0; index < appearance.length; index++) {
								look = appearance[index];
								MeshModifier modifier = null;
								boolean bool_55 = index == 5 && bool_21 || index == 3 && bool_22;
								RSMesh mesh;
								if ((look & 0x40000000) != 0) {
									if (!bool_55 && meshModifiers != null && meshModifiers[index] != null)
										modifier = meshModifiers[index];
									int id = look & 0x3fffffff;
									mesh = itemindexloader_6.getItemDefinitions(look & 0x3fffffff).getBodyMesh(isFemale, modifier);
									if (mesh != null)
										meshes[index] = mesh;
								} else if ((look & -2147483648) != 0) {
									mesh = class31_4.getIdentiKit(look & 0x3fffffff).renderBody();
									if (mesh != null)
										meshes[index] = mesh;
								}
							}
							int i_54;
							if (basDefinitions != null && basDefinitions.anIntArrayArray2802 != null) {
								for (index = 0; index < basDefinitions.anIntArrayArray2802.length; index++) {
									if (meshes[index] != null) {
										look = 0;
										i_54 = 0;
										i_34 = 0;
										int i_43 = 0;
										int i_36 = 0;
										int i_37 = 0;
										if (basDefinitions.anIntArrayArray2802[index] != null) {
											look = basDefinitions.anIntArrayArray2802[index][0];
											i_54 = basDefinitions.anIntArrayArray2802[index][1];
											i_34 = basDefinitions.anIntArrayArray2802[index][2];
											i_43 = basDefinitions.anIntArrayArray2802[index][3] << 3;
											i_36 = basDefinitions.anIntArrayArray2802[index][4] << 3;
											i_37 = basDefinitions.anIntArrayArray2802[index][5] << 3;
										}
										if (i_43 != 0 || i_36 != 0 || i_37 != 0) {
											meshes[index].method2671(i_43, i_36, i_37);
										}
										if (look != 0 || i_54 != 0 || i_34 != 0) {
											meshes[index].translate(look, i_54, i_34);
										}
									}
								}
							}
							RSMesh rsmesh_44 = new RSMesh(meshes, meshes.length);
							int i_28 = i_17 | 0x4000;
							rasterizer = renderer.createMeshRasterizer(rsmesh_44, i_28, Class149.anInt1744, 64, 850);
							for (look = 0; look < 10; look++) {
								for (i_54 = 0; i_54 < AbstractQueue_Sub1.DEFAULT_SKIN_COLOURS[look].length; i_54++) {
									if (colours[look] < Class366.SKIN_COLORS[look][i_54].length) {
										rasterizer.recolour(AbstractQueue_Sub1.DEFAULT_SKIN_COLOURS[look][i_54], Class366.SKIN_COLORS[look][i_54][colours[look]]);
									}
								}
							}
							rasterizer.KA(i_17);
							LRUCache softcache_52 = aClass229_2920;
							synchronized (aClass229_2920) {
								aClass229_2920.put(rasterizer, long_18);
							}
							aLong2927 = long_18;
						}
						break;
					}
					index = appearance[i_30];
					MeshModifier meshmodifier_32 = null;
					boolean bool_33 = false;
					if (bool_21) {
						if (equipDefaults.offhandSlot == i_30) {
							bool_33 = true;
						} else {
							for (i_34 = 0; i_34 < equipDefaults.hiddenAnimationOffhandSlots.length; i_34++) {
								if (equipDefaults.hiddenAnimationOffhandSlots[i_34] == i_30) {
									bool_33 = true;
									break;
								}
							}
						}
					}
					if (bool_22) {
						if (equipDefaults.weaponSlot == i_30) {
							bool_33 = true;
						} else {
							for (i_34 = 0; i_34 < equipDefaults.hiddenAnimationWeaponSlots.length; i_34++) {
								if (equipDefaults.hiddenAnimationWeaponSlots[i_34] == i_30) {
									bool_33 = true;
									break;
								}
							}
						}
					}
					if ((index & 0x40000000) != 0) {
						if (!bool_33 && meshModifiers != null && meshModifiers[i_30] != null) {
							meshmodifier_32 = meshModifiers[i_30];
						}
						if (!itemindexloader_6.getItemDefinitions(index & 0x3fffffff).bodyMeshesReady(isFemale, meshmodifier_32)) {
							bool_29 = true;
						}
					} else if ((index & -2147483648) != 0 && !class31_4.getIdentiKit(index & 0x3fffffff).method898()) {
						bool_29 = true;
					}
					++i_30;
				}
			}
			rasterizer = rasterizer.method11289((byte) 4, i_17, true);
			if (bool_38 || bool_50) {
				Matrix44Var[] arr_46 = null;
				if (basDefinitions != null) {
					arr_46 = basDefinitions.method3811();
				}
				if (bool_50 && arr_46 != null) {
					for (i_30 = 0; i_30 < ints_12.length; i_30++) {
						if (arr_46[i_30] != null) {
							rasterizer.method11298(arr_46[i_30], 1 << i_30, true);
						}
					}
				}
				i_30 = 0;
				for (index = 1; i_30 < i; index <<= 1) {
					if (arr_11[i_30] != null) {
						arr_11[i_30].method7578(rasterizer, index);
					}
					++i_30;
				}
				if (bool_50) {
					for (i_30 = 0; i_30 < ints_12.length; i_30++) {
						if (ints_12[i_30] != -1) {
							index = ints_12[i_30] - i_13;
							index &= 0x3fff;
							Matrix44Var matrix44var_53 = new Matrix44Var();
							matrix44var_53.method5217(0.0F, 1.0F, 0.0F, Trig.degToRad(index));
							rasterizer.method11298(matrix44var_53, 1 << i_30, false);
						}
					}
				}
				if (bool_50 && arr_46 != null) {
					for (i_30 = 0; i_30 < ints_12.length; i_30++) {
						if (arr_46[i_30] != null) {
							rasterizer.method11298(arr_46[i_30], 1 << i_30, false);
						}
					}
				}
				if (currentAnimation != null && animation_10 != null) {
					GraphNode_Sub1_Sub3_Sub1.method16078(rasterizer, currentAnimation, animation_10);
				} else if (currentAnimation != null) {
					currentAnimation.rasterize(rasterizer, 0);
				} else if (animation_10 != null) {
					animation_10.rasterize(rasterizer, 0);
				}
			}
			return rasterizer;
		}
	}

	public MeshRasterizer getHeadModel(AbstractRenderer renderer, int i_2, IdentiKitIndexLoader loader, Animation animation, int idKit1, int idKit2, int idKit3) {
		int flag = animation != null ? i_2 | animation.method7640() : i_2;
		long long_11 = (long) idKit3 << 32 | (idKit2 << 16) | idKit1;
		LRUCache softcache_14 = aClass229_2930;
		MeshRasterizer rasterizer;
		synchronized (aClass229_2930) {
			rasterizer = (MeshRasterizer) aClass229_2930.get(long_11);
		}
		if (rasterizer == null || renderer.method8452(rasterizer.m(), flag) != 0) {
			if (rasterizer != null) {
				flag = renderer.method8546(flag, rasterizer.m());
			}
			RSMesh[] meshes = new RSMesh[3];
			int index = 0;
			if (!loader.getIdentiKit(idKit1).method900() || !loader.getIdentiKit(idKit2).method900() || !loader.getIdentiKit(idKit3).method900()) {
				return null;
			}
			RSMesh mesh = loader.getIdentiKit(idKit1).renderHead();
			if (mesh != null) {
				meshes[index++] = mesh;
			}
			mesh = loader.getIdentiKit(idKit2).renderHead();
			if (mesh != null) {
				meshes[index++] = mesh;
			}
			mesh = loader.getIdentiKit(idKit3).renderHead();
			if (mesh != null) {
				meshes[index++] = mesh;
			}
			mesh = new RSMesh(meshes, index); //combined
			int i_20 = flag | 0x4000;
			rasterizer = renderer.createMeshRasterizer(mesh, i_20, Class149.anInt1744, 64, 768);
			for (int i = 0; i < 10; i++) {
				for (int k = 0; k < AbstractQueue_Sub1.DEFAULT_SKIN_COLOURS[i].length; k++) {
					if (colours[i] < Class366.SKIN_COLORS[i][k].length) {
						rasterizer.recolour(AbstractQueue_Sub1.DEFAULT_SKIN_COLOURS[i][k], Class366.SKIN_COLORS[i][k][colours[i]]);
					}
				}
			}
			rasterizer.KA(flag);
			LRUCache softcache_21 = aClass229_2930;
			synchronized (aClass229_2930) {
				aClass229_2930.put(rasterizer, long_11);
			}
		}
		if (animation != null) {
			rasterizer = rasterizer.method11289((byte) 4, flag, true);
			animation.rasterize(rasterizer, 0);
		}
		return rasterizer;
	}

	public void method4003(boolean bool_1) {
		isFemale = bool_1;
		refresh();
	}

	public MeshRasterizer method4021(AbstractRenderer renderer, int i_2, IdentiKitIndexLoader kitLoader, NPCIndexLoader npcLoader, ItemIndexLoader itemLoader, VarProvider provider, Animation animation) {
		if (mimickingNpcId != -1)
			return npcLoader.getNPCType(mimickingNpcId).renderHead(renderer, i_2, provider, animation, null);
		int i_10 = animation != null ? i_2 | animation.method7640() : i_2;
		MeshRasterizer rasterizer;
		synchronized (aClass229_2930) {
			rasterizer = (MeshRasterizer) aClass229_2930.get(aLong2926);
		}
		if (rasterizer == null || renderer.method8452(rasterizer.m(), i_10) != 0) {
			if (rasterizer != null) {
				i_10 = renderer.method8546(i_10, rasterizer.m());
			}
			boolean bool_13 = false;
			int size;
			for (int index = 0; index < appearance.length; index++) {
				size = appearance[index];
				MeshModifier meshmodifier_16 = null;
				if ((size & 0x40000000) != 0) {
					if (meshModifiers != null && meshModifiers[index] != null) {
						meshmodifier_16 = meshModifiers[index];
					}
					if (!itemLoader.getItemDefinitions(size & 0x3fffffff).headMeshesReady(isFemale, meshmodifier_16)) {
						bool_13 = true;
					}
				} else if ((size & -2147483648) != 0 && !kitLoader.getIdentiKit(size & 0x3fffffff).method900()) {
					bool_13 = true;
				}
			}
			if (bool_13) {
				return null;
			}
			RSMesh[] meshes = new RSMesh[appearance.length];
			size = 0;
			int look;
			for (int index = 0; index < appearance.length; index++) {
				look = appearance[index];
				MeshModifier modifier = null;
				RSMesh mesh;
				if ((look & 0x40000000) != 0) {
					if (meshModifiers != null && meshModifiers[index] != null)
						modifier = meshModifiers[index];
					mesh = itemLoader.getItemDefinitions(look & 0x3fffffff).getHeadMesh(isFemale, modifier);
					if (mesh != null)
						meshes[size++] = mesh;
				} else if ((look & -2147483648) != 0) {
					mesh = kitLoader.getIdentiKit(look & 0x3fffffff).renderHead();
					if (mesh != null)
						meshes[size++] = mesh;
				}
			}
			RSMesh rsmesh_28 = new RSMesh(meshes, size);
			int i_20 = i_10 | 0x4000;
			rasterizer = renderer.createMeshRasterizer(rsmesh_28, i_20, Class149.anInt1744, 64, 768);
			for (look = 0; look < 10; look++) {
				for (int i_23 = 0; i_23 < AbstractQueue_Sub1.DEFAULT_SKIN_COLOURS[look].length; i_23++) {
					if (colours[look] < Class366.SKIN_COLORS[look][i_23].length) {
						rasterizer.recolour(AbstractQueue_Sub1.DEFAULT_SKIN_COLOURS[look][i_23], Class366.SKIN_COLORS[look][i_23][colours[look]]);
					}
				}
			}
			rasterizer.KA(i_10);
			LRUCache softcache_24 = aClass229_2930;
			synchronized (aClass229_2930) {
				aClass229_2930.put(rasterizer, aLong2926);
			}
		}
		if (animation == null) {
			return rasterizer;
		} else {
			MeshRasterizer meshrasterizer_27 = rasterizer.method11289((byte) 4, i_10, true);
			animation.rasterize(meshrasterizer_27, 0);
			return meshrasterizer_27;
		}
	}

	public void setBaseColor(int i_1, int i_2) {
		colours[i_1] = i_2;
		refresh();
	}
}
