package com.jagex;

import com.jagex.client.route.strategy.RouteStrategy;

public class WallObjectStrategy extends RouteStrategy {

	public int accessFlags;
	public ObjectType objectType;

	@Override
	public boolean canExit(int i_1, int i_2, int i_3, ClipFlagMap clipmap_4) {
		return clipmap_4.reachedObject(i_2, i_3, i_1, approxDestinationX, approxDestinationY, objectType.getValue(), accessFlags);
	}

}
