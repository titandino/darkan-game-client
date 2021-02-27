package com.jagex.client.js5.loaders;

import com.jagex.GroundItemStrategy;
import com.jagex.Index;
import com.jagex.LRUCache;
import com.jagex.SharedConfigsType;
import com.jagex.client.js5.defs.animations.AnimationDefinitions;
import com.jagex.client.js5.defs.animations.AnimationFrameSet;
import com.jagex.game.content.cutscenes.actions.CutsceneAction_Sub10_Sub1;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class16;
import com.jagex.unknown.Class532_Sub2;

public class AnimationIndexLoader {

	LRUCache aClass229_6955 = new LRUCache(64);

	LRUCache cache = new LRUCache(100);

	Index sequenceIndex;

	public AnimationIndexLoader(Index index_3, Index index_4, Index index_5) {
		sequenceIndex = index_3;
		if (sequenceIndex != null) {
			int i_6 = sequenceIndex.containersCount() - 1;
			SharedConfigsType.ANIMATIONS.filesPerContainer();
			sequenceIndex.filesCount(i_6);
		}
		CutsceneAction_Sub10_Sub1.setAnimationIndices(index_4, index_5);
	}

	public static boolean method11219(char var_0) {
		return var_0 >= 48 && var_0 <= 57;
	}

	public static void method11220(int i_0, int i_1, int i_2, int i_3, int i_4) {
		int i_01 = i_0;
		int i_21 = i_2;
		int i_15 = i_1;
		int i_31 = i_3;
		int i_6 = i_31 - i_15;
		int i_7 = i_21 - i_01;
		if (i_7 == 0) {
			if (i_6 != 0) {
				GroundItemStrategy.method13411(i_01, i_15, i_31, i_4);
			}
		} else if (i_6 == 0) {
			Class16.method568(i_01, i_21, i_15, i_4);
		} else {
			if (i_6 < 0) {
				i_6 = -i_6;
			}
			if (i_7 < 0) {
				i_7 = -i_7;
			}
			boolean bool_8 = i_6 > i_7;
			int i_9;
			int i_10;
			if (bool_8) {
				i_9 = i_01;
				i_10 = i_21;
				i_01 = i_15;
				i_15 = i_9;
				i_21 = i_31;
				i_31 = i_10;
			}
			if (i_01 > i_21) {
				i_9 = i_01;
				i_10 = i_15;
				i_01 = i_21;
				i_21 = i_9;
				i_15 = i_31;
				i_31 = i_10;
			}
			i_9 = i_15;
			i_10 = i_21 - i_01;
			int i_11 = i_31 - i_15;
			int i_12 = -(i_10 >> 1);
			int i_13 = i_15 < i_31 ? 1 : -1;
			if (i_11 < 0) {
				i_11 = -i_11;
			}
			int i_14;
			if (bool_8) {
				for (i_14 = i_01; i_14 <= i_21; i_14++) {
					Class532_Sub2.anIntArrayArray7072[i_14][i_9] = i_4;
					i_12 += i_11;
					if (i_12 > 0) {
						i_9 += i_13;
						i_12 -= i_10;
					}
				}
			} else {
				for (i_14 = i_01; i_14 <= i_21; i_14++) {
					Class532_Sub2.anIntArrayArray7072[i_9][i_14] = i_4;
					i_12 += i_11;
					if (i_12 > 0) {
						i_9 += i_13;
						i_12 -= i_10;
					}
				}
			}
		}
	}

	public void method11204() {
		LRUCache softcache_2 = aClass229_6955;
		synchronized (aClass229_6955) {
			aClass229_6955.method3859();
		}
		softcache_2 = cache;
		synchronized (cache) {
			cache.method3859();
		}
	}

	public AnimationDefinitions getAnimDefs(int id) {
		LRUCache softcache_4 = aClass229_6955;
		AnimationDefinitions defs;
		synchronized (aClass229_6955) {
			defs = (AnimationDefinitions) aClass229_6955.get(id);
		}
		if (defs != null)
			return defs;
		byte[] data;
		synchronized (sequenceIndex) {
			data = sequenceIndex.getFile(SharedConfigsType.ANIMATIONS.containerId(id), SharedConfigsType.ANIMATIONS.fileId(id));
		}
		defs = new AnimationDefinitions();
		defs.id = id;
		defs.animationIndexLoader = this;
		if (data != null)
			defs.decode(new ByteBuf(data));
		defs.setAnimatingPrecedence();
		synchronized (aClass229_6955) {
			aClass229_6955.put(defs, id);
			return defs;
		}
	}

	public AnimationFrameSet getAnimationFrame(int i_1) {
		LRUCache softcache_4 = cache;
		synchronized (cache) {
			AnimationFrameSet animationskeleton_3 = (AnimationFrameSet) cache.get(i_1);
			if (animationskeleton_3 == null) {
				animationskeleton_3 = new AnimationFrameSet(i_1);
				cache.put(animationskeleton_3, i_1);
			}
			return !animationskeleton_3.decodeFrameData() ? null : animationskeleton_3;
		}
	}

	public void method11208() {
		LRUCache softcache_2 = aClass229_6955;
		synchronized (aClass229_6955) {
			aClass229_6955.method3863();
		}
		softcache_2 = cache;
		synchronized (cache) {
			cache.method3863();
		}
	}

	public void method11210() {
		LRUCache softcache_3 = aClass229_6955;
		synchronized (aClass229_6955) {
			aClass229_6955.method3858(5);
		}
		softcache_3 = cache;
		synchronized (cache) {
			cache.method3858(5);
		}
	}
}
