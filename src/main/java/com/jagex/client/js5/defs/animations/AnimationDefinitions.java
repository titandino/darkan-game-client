package com.jagex.client.js5.defs.animations;

import com.jagex.*;
import com.jagex.client.js5.loaders.AnimationIndexLoader;
import com.jagex.client.render.font.FontRenderer_Sub3;
import com.jagex.net.io.ByteBuf;

public class AnimationDefinitions {

	public static int anInt5930;
	public static boolean aBool5925;
	public int id;
	public int[] frameDurations;
	public int loopDelay = -1;
	public boolean[] aBoolArray5915;
	public int[] frames;
	public int priority = 5;
	public int leftHandItem = -1;
	public int rightHandItem = -1;
	public int maxLoops = 99;
	public int animatingPrecedence = -1;
	public int walkingPrecedence = -1;
	public int replayMode = 2;
	public int[] anIntArray5911;
	public int[][] soundIds;
	public boolean aBool5923;
	public boolean tweened;
	public boolean aBool5928;
	public int[] anIntArray5926;
	public int[] anIntArray5927;
	public int[] anIntArray5919;
	public AnimationIndexLoader animationIndexLoader;
	public IterableNodeMap aClass465_5910;

	public static void method11148(GraphNode_Sub1 class521_sub1_0, int i_1) {
		FontRenderer_Sub3.method14336(class521_sub1_0, i_1, true);
	}

	public String method11129(int i_1, String string_2) {
		if (aClass465_5910 == null) {
			return string_2;
		} else {
			ObjectNode class282_sub47_4 = (ObjectNode) aClass465_5910.get(i_1);
			return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
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

	public void decode(ByteBuf buffer, int opcode) {
		int i_4;
		int i_5;
		if (opcode == 1) {
			i_4 = buffer.readUnsignedShort();
			frameDurations = new int[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				frameDurations[i_5] = buffer.readUnsignedShort();
			}
			frames = new int[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				frames[i_5] = buffer.readUnsignedShort();
			}
			for (i_5 = 0; i_5 < i_4; i_5++) {
				frames[i_5] += buffer.readUnsignedShort() << 16;
			}
		} else if (opcode == 2) {
			loopDelay = buffer.readUnsignedShort();
		} else if (opcode == 3) {
			aBoolArray5915 = new boolean[256];
			i_4 = buffer.readUnsignedByte();
			for (i_5 = 0; i_5 < i_4; i_5++) {
				aBoolArray5915[buffer.readUnsignedByte()] = true;
			}
		} else if (opcode == 5) {
			priority = buffer.readUnsignedByte();
		} else if (opcode == 6) {
			leftHandItem = buffer.readUnsignedShort();
		} else if (opcode == 7) {
			rightHandItem = buffer.readUnsignedShort();
		} else if (opcode == 8) {
			maxLoops = buffer.readUnsignedByte();
		} else if (opcode == 9) {
			animatingPrecedence = buffer.readUnsignedByte();
		} else if (opcode == 10) {
			walkingPrecedence = buffer.readUnsignedByte();
		} else if (opcode == 11) {
			replayMode = buffer.readUnsignedByte();
		} else if (opcode == 12) {
			i_4 = buffer.readUnsignedByte();
			anIntArray5911 = new int[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				anIntArray5911[i_5] = buffer.readUnsignedShort();
			}
			for (i_5 = 0; i_5 < i_4; i_5++) {
				anIntArray5911[i_5] += buffer.readUnsignedShort() << 16;
			}
		} else {
			int i_7;
			if (opcode == 13) {
				i_4 = buffer.readUnsignedShort();
				soundIds = new int[i_4][];
				for (i_5 = 0; i_5 < i_4; i_5++) {
					int children = buffer.readUnsignedByte();
					if (children > 0) {
						soundIds[i_5] = new int[children];
						soundIds[i_5][0] = buffer.read24BitUnsignedInteger();
						for (i_7 = 1; i_7 < children; i_7++) {
							soundIds[i_5][i_7] = buffer.readUnsignedShort();
						}
					}
				}
			} else if (opcode == 14) {
				aBool5923 = true;
			} else if (opcode == 15) {
				tweened = true;
			} else if (opcode != 16) {
				if (opcode == 18) {
					aBool5928 = true;
				} else if (opcode == 19) {
					if (anIntArray5926 == null) {
						anIntArray5926 = new int[soundIds.length];
						for (i_4 = 0; i_4 < soundIds.length; i_4++) {
							anIntArray5926[i_4] = 255;
						}
					}
					anIntArray5926[buffer.readUnsignedByte()] = buffer.readUnsignedByte();
				} else if (opcode == 20) {
					if (anIntArray5927 == null || anIntArray5919 == null) {
						anIntArray5927 = new int[soundIds.length];
						anIntArray5919 = new int[soundIds.length];
						for (i_4 = 0; i_4 < soundIds.length; i_4++) {
							anIntArray5927[i_4] = 256;
							anIntArray5919[i_4] = 256;
						}
					}
					i_4 = buffer.readUnsignedByte();
					anIntArray5927[i_4] = buffer.readUnsignedShort();
					anIntArray5919[i_4] = buffer.readUnsignedShort();
				} else if (opcode == 249) {
					i_4 = buffer.readUnsignedByte();
					if (aClass465_5910 == null) {
						i_5 = Utils.nextPowerOfTwo(i_4);
						aClass465_5910 = new IterableNodeMap(i_5);
					}
					for (i_5 = 0; i_5 < i_4; i_5++) {
						boolean bool_9 = buffer.readUnsignedByte() == 1;
						i_7 = buffer.read24BitUnsignedInteger();
						Object obj_8;
						if (bool_9) {
							obj_8 = new ObjectNode(buffer.readString());
						} else {
							obj_8 = new IntNode(buffer.readInt());
						}
						aClass465_5910.put((Node) obj_8, i_7);
					}
				}
			}
		}
	}

	public boolean ready() {
		if (frames == null) {
			return true;
		} else {
			boolean bool_1 = true;
			int[] ints_2 = frames;
			for (int i_3 = 0; i_3 < ints_2.length; i_3++) {
				int i_4 = ints_2[i_3];
				if (animationIndexLoader.getFrameSet(i_4 >>> 16) == null) {
					bool_1 = false;
				}
			}
			return bool_1;
		}
	}

	public int method11133(int i_1, int i_2) {
		if (aClass465_5910 == null) {
			return i_2;
		} else {
			IntNode class282_sub38_4 = (IntNode) aClass465_5910.get(i_1);
			return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
		}
	}

	public void setAnimatingPrecedence() {
		if (animatingPrecedence == -1) {
			if (aBoolArray5915 != null) {
				animatingPrecedence = 2;
			} else {
				animatingPrecedence = 0;
			}
		}
		if (walkingPrecedence == -1) {
			if (aBoolArray5915 != null) {
				walkingPrecedence = 2;
			} else {
				walkingPrecedence = 0;
			}
		}
	}
}
