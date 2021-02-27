package com.jagex.client.route;

import com.jagex.*;
import com.jagex.client.cache.CacheableNode;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class366;

public class RouteStrategies {

	public static FixedTileStrategy FIXED_TILE = new FixedTileStrategy();
	public static GroundItemStrategy GROUND_ITEM = new GroundItemStrategy();
	public static PlayerStrategy PLAYER = new PlayerStrategy();
	public static NPCStrategy NPC = new NPCStrategy();
	public static WallObjectStrategy WALL_OBJECT = new WallObjectStrategy();
	public static NormalObjectStrategy NORMAL_OBJECT = new NormalObjectStrategy();

	RouteStrategies() throws Throwable {
		throw new Error();
	}

	public static void method3782(CacheableNode cacheablenode_0, CacheableNode cacheablenode_1) {
		if (cacheablenode_0.current != null) {
			cacheablenode_0.method13452();
		}
		cacheablenode_0.current = cacheablenode_1;
		cacheablenode_0.aCacheableNode_8119 = cacheablenode_1.aCacheableNode_8119;
		cacheablenode_0.current.aCacheableNode_8119 = cacheablenode_0;
		cacheablenode_0.aCacheableNode_8119.current = cacheablenode_0;
	}

	public static Class366 method3784(ByteBuf rsbytebuffer_0) {
		int i_2 = rsbytebuffer_0.readInt();
		return new Class366(i_2);
	}
}
