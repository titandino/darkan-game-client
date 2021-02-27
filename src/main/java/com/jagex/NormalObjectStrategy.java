package com.jagex;

import com.jagex.client.route.strategy.RouteStrategy;

public class NormalObjectStrategy extends RouteStrategy {

	public int accessFlags;
	public ObjectType objectType;

	@Override
	public boolean canExit(int size, int x, int y, ClipFlagMap clipmap_4) {
		return clipmap_4.reachedObject(x, y, size, approxDestinationX, approxDestinationY, objectType.getValue(), accessFlags);
	}
}
