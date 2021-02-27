package com.jagex.client.js5;

import com.jagex.client.cache.CacheableNode;
import com.jagex.unknown.Class404;
import com.jagex.unknown.Class466;

public abstract class JS5CacheRequest extends CacheableNode {

	public boolean highPriority;
	public boolean aBool9638;
	public volatile boolean waiting = true;

	public static void method14949(Class466 class466_0) {
		Class404.aClass466_4831 = class466_0;
	}

	public abstract byte[] method14941();

	public abstract byte[] getData();

	public abstract int getCompletion();

	public abstract byte[] method14944();

	public abstract byte[] method14945();

	public abstract int method14946();

	public abstract int method14947();

	public abstract int method14948();

}
