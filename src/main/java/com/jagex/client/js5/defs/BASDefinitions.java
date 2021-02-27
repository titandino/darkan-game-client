package com.jagex.client.js5.defs;

import com.jagex.IterableNodeMap;
import com.jagex.Matrix44Var;
import com.jagex.Node;
import com.jagex.Trig;
import com.jagex.client.js5.loaders.BASIndexLoader;
import com.jagex.game.entity.player.creation.AccountCreationStage;
import com.jagex.net.io.ByteBuf;

import java.util.Iterator;

public class BASDefinitions {

	public static int anInt2831;
	public int renderAnimId;
	public int standAnimation = -1;
	public int walkAnimation = -1;
	public int teleportingAnimation = -1;
	public int teleDir3 = -1;
	public int teleDir2 = -1;
	public int teleDir1 = -1;
	public int runningAnimation = -1;
	public int runDir3 = -1;
	public int runDir2 = -1;
	public int runDir1 = -1;
	public int anInt2786;
	public int anInt2829;
	public int[] anIntArray2811;
	public int[][] anIntArrayArray2802;
	public int anInt2820;
	public int anInt2804;
	public int anInt2825;
	public int anInt2823;
	public int anInt2824;
	public int anInt2816;
	public int anInt2815;
	public int anInt2827;
	public int anInt2826 = -1;
	public int standTurn1 = -1;
	public int standTurn2 = -1;
	public int walkDir3 = -1;
	public int walkDir2 = -1;
	public int walkDir1 = -1;
	public int anInt2798 = -1;
	public int teleTurn1 = -1;
	public int teleTurn2 = -1;
	public int runTurn1 = -1;
	public int runTurn2 = -1;
	public int walkTurn1 = -1;
	public int walkTurn2 = -1;
	public int[] randomStandAnimations;
	public int[] randomStandAnimationChances;
	public boolean aBool2787 = true;
	public int anInt2813;
	public int anInt2790;
	public int[] anIntArray2818;
	public int[][] anIntArrayArray2791;
	public BASIndexLoader basIndexLoader;
	int totalChance;
	public Matrix44Var[] matrices;

	public void decode(ByteBuf buffer, int opcode) {
		if (opcode == 1) {
			standAnimation = buffer.readBigSmart();
			walkAnimation = buffer.readBigSmart();
		} else if (opcode == 2) {
			teleportingAnimation = buffer.readBigSmart();
		} else if (opcode == 3) {
			teleDir3 = buffer.readBigSmart();
		} else if (opcode == 4) {
			teleDir2 = buffer.readBigSmart();
		} else if (opcode == 5) {
			teleDir1 = buffer.readBigSmart();
		} else if (opcode == 6) {
			runningAnimation = buffer.readBigSmart();
		} else if (opcode == 7) {
			runDir3 = buffer.readBigSmart();
		} else if (opcode == 8) {
			runDir2 = buffer.readBigSmart();
		} else if (opcode == 9) {
			runDir1 = buffer.readBigSmart();
		} else if (opcode == 26) {
			anInt2786 = (short) (buffer.readUnsignedByte() * 4);
			anInt2829 = (short) (buffer.readUnsignedByte() * 4);
		} else {
			int i_4;
			int i_5;
			if (opcode == 27) {
				if (anIntArrayArray2802 == null) {
					anIntArrayArray2802 = new int[basIndexLoader.equipmentDefaults.hidden.length][];
				}
				i_4 = buffer.readUnsignedByte();
				anIntArrayArray2802[i_4] = new int[6];
				for (i_5 = 0; i_5 < 6; i_5++) {
					anIntArrayArray2802[i_4][i_5] = buffer.readShort();
				}
			} else if (opcode == 28) {
				i_4 = buffer.readUnsignedByte();
				anIntArray2811 = new int[i_4];
				for (i_5 = 0; i_5 < i_4; i_5++) {
					anIntArray2811[i_5] = buffer.readUnsignedByte();
					if (anIntArray2811[i_5] == 255) {
						anIntArray2811[i_5] = -1;
					}
				}
			} else if (opcode == 29) {
				anInt2820 = buffer.readUnsignedByte();
			} else if (opcode == 30) {
				anInt2804 = buffer.readUnsignedShort();
			} else if (opcode == 31) {
				anInt2825 = buffer.readUnsignedByte();
			} else if (opcode == 32) {
				anInt2823 = buffer.readUnsignedShort();
			} else if (opcode == 33) {
				anInt2824 = buffer.readShort();
			} else if (opcode == 34) {
				anInt2816 = buffer.readUnsignedByte();
			} else if (opcode == 35) {
				anInt2815 = buffer.readUnsignedShort();
			} else if (opcode == 36) {
				anInt2827 = buffer.readShort();
			} else if (opcode == 37) {
				anInt2826 = buffer.readUnsignedByte();
			} else if (opcode == 38) {
				standTurn1 = buffer.readBigSmart();
			} else if (opcode == 39) {
				standTurn2 = buffer.readBigSmart();
			} else if (opcode == 40) {
				walkDir3 = buffer.readBigSmart();
			} else if (opcode == 41) {
				walkDir2 = buffer.readBigSmart();
			} else if (opcode == 42) {
				walkDir1 = buffer.readBigSmart();
			} else if (opcode == 43) {
				buffer.readUnsignedShort();
			} else if (opcode == 44) {
				buffer.readUnsignedShort();
			} else if (opcode == 45) {
				anInt2798 = buffer.readUnsignedShort();
			} else if (opcode == 46) {
				teleTurn1 = buffer.readBigSmart();
			} else if (opcode == 47) {
				teleTurn2 = buffer.readBigSmart();
			} else if (opcode == 48) {
				runTurn1 = buffer.readBigSmart();
			} else if (opcode == 49) {
				runTurn2 = buffer.readBigSmart();
			} else if (opcode == 50) {
				walkTurn1 = buffer.readBigSmart();
			} else if (opcode == 51) {
				walkTurn2 = buffer.readBigSmart();
			} else if (opcode == 52) {
				i_4 = buffer.readUnsignedByte();
				randomStandAnimations = new int[i_4];
				randomStandAnimationChances = new int[i_4];
				for (i_5 = 0; i_5 < i_4; i_5++) {
					randomStandAnimations[i_5] = buffer.readBigSmart();
					int i_6 = buffer.readUnsignedByte();
					randomStandAnimationChances[i_5] = i_6;
					totalChance += i_6;
				}
			} else if (opcode == 53) {
				aBool2787 = false;
			} else if (opcode == 54) {
				anInt2813 = buffer.readUnsignedByte() << 6;
				anInt2790 = buffer.readUnsignedByte() << 6;
			} else if (opcode == 55) {
				if (anIntArray2818 == null) {
					anIntArray2818 = new int[basIndexLoader.equipmentDefaults.hidden.length];
				}
				i_4 = buffer.readUnsignedByte();
				anIntArray2818[i_4] = buffer.readUnsignedShort();
			} else if (opcode == 56) {
				if (anIntArrayArray2791 == null) {
					anIntArrayArray2791 = new int[basIndexLoader.equipmentDefaults.hidden.length][];
				}
				i_4 = buffer.readUnsignedByte();
				anIntArrayArray2791[i_4] = new int[3];
				for (i_5 = 0; i_5 < 3; i_5++) {
					anIntArrayArray2791[i_4][i_5] = buffer.readShort();
				}
			}
		}
	}

	public int getStandAnimation() {
		if (standAnimation != -1) {
			return standAnimation;
		} else if (randomStandAnimations == null) {
			return -1;
		} else {
			int i_2 = (int) (Math.random() * totalChance);
			int i_3;
			for (i_3 = 0; i_2 >= randomStandAnimationChances[i_3]; i_3++) {
				i_2 -= randomStandAnimationChances[i_3];
			}
			return randomStandAnimations[i_3];
		}
	}

	public boolean method3810(int i_1) {
		if (i_1 == -1) {
			return false;
		} else if (standAnimation == i_1) {
			return true;
		} else {
			if (randomStandAnimations != null) {
				for (int i_3 = 0; i_3 < randomStandAnimations.length; i_3++) {
					if (randomStandAnimations[i_3] == i_1) {
						return true;
					}
				}
			}
			return false;
		}
	}

	public Matrix44Var[] method3811() {
		if (matrices != null) {
			return matrices;
		} else if (anIntArrayArray2802 == null) {
			return null;
		} else {
			matrices = new Matrix44Var[anIntArrayArray2802.length];
			for (int i = 0; i < anIntArrayArray2802.length; i++) {
				int i_3 = 0;
				int i_4 = 0;
				int i_5 = 0;
				int xRot = 0;
				int yRot = 0;
				int zRot = 0;
				if (anIntArrayArray2802[i] != null) {
					i_3 = anIntArrayArray2802[i][0];
					i_4 = anIntArrayArray2802[i][1];
					i_5 = anIntArrayArray2802[i][2];
					xRot = anIntArrayArray2802[i][3] << 3;
					yRot = anIntArrayArray2802[i][4] << 3;
					zRot = anIntArrayArray2802[i][5] << 3;
				}
				if (i_3 != 0 || i_4 != 0 || i_5 != 0 || xRot != 0 || yRot != 0 || zRot != 0) {
					Matrix44Var matrix = matrices[i] = new Matrix44Var();
					if (zRot != 0) {
						matrix.rotation(0.0F, 0.0F, 1.0F, Trig.degToRad(zRot));
					}
					if (xRot != 0) {
						matrix.rotation(1.0F, 0.0F, 0.0F, Trig.degToRad(xRot));
					}
					if (yRot != 0) {
						matrix.rotation(0.0F, 1.0F, 0.0F, Trig.degToRad(yRot));
					}
					matrix.method5219(i_3, i_4, i_5);
				}
			}
			return matrices;
		}
	}

	public void decode(ByteBuf buffer) {
		while (true) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0)
				return;
			decode(buffer, opcode);
		}
	}

	public int[] method3828() {
		IterableNodeMap<Node> map = new IterableNodeMap<>(16);
		AccountCreationStage.insertEmptyNode(standAnimation, map);
		if (randomStandAnimations != null) {
			for (int index = 0; index < randomStandAnimations.length; index++)
				AccountCreationStage.insertEmptyNode(randomStandAnimations[index], map);
		}
		AccountCreationStage.insertEmptyNode(standTurn1, map);
		AccountCreationStage.insertEmptyNode(standTurn2, map);
		AccountCreationStage.insertEmptyNode(walkAnimation, map);
		AccountCreationStage.insertEmptyNode(walkDir3, map);
		AccountCreationStage.insertEmptyNode(walkDir2, map);
		AccountCreationStage.insertEmptyNode(walkDir1, map);
		AccountCreationStage.insertEmptyNode(runningAnimation, map);
		AccountCreationStage.insertEmptyNode(runDir3, map);
		AccountCreationStage.insertEmptyNode(runDir2, map);
		AccountCreationStage.insertEmptyNode(runDir1, map);
		AccountCreationStage.insertEmptyNode(teleportingAnimation, map);
		AccountCreationStage.insertEmptyNode(teleDir3, map);
		AccountCreationStage.insertEmptyNode(teleDir2, map);
		AccountCreationStage.insertEmptyNode(teleDir1, map);
		AccountCreationStage.insertEmptyNode(teleTurn1, map);
		AccountCreationStage.insertEmptyNode(teleTurn2, map);
		AccountCreationStage.insertEmptyNode(runTurn1, map);
		AccountCreationStage.insertEmptyNode(runTurn2, map);
		AccountCreationStage.insertEmptyNode(walkTurn1, map);
		AccountCreationStage.insertEmptyNode(walkTurn2, map);
		int[] pointers = new int[map.size()];
		int index = 0;
		Node node;
		for (Iterator<Node> iterator = map.iterator(); iterator.hasNext(); pointers[index++] = (int) node.pointer)
			node = iterator.next();
		return pointers;
	}
}
