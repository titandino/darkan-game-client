package com.jagex.client.js5.loaders;

import com.jagex.Index;
import com.jagex.LRUCache;
import com.jagex.SharedConfigsType;
import com.jagex.client.js5.defs.IComponentDefinitions;

public class VarcStringIndexLoader {

	public static IComponentDefinitions aClass118_4825;
	public int size;
	public Index configIndex;

	public VarcStringIndexLoader(Index index_3) {
		new LRUCache(64);
		configIndex = index_3;
		size = configIndex.filesCount(SharedConfigsType.VARC_STRING.id);
	}
}
