package com.jagex;

import com.jagex.client.GameState;
import com.jagex.client.client;
import com.jagex.client.js5.JS5CacheFile;
import com.jagex.unknown.Class85;

public class Node_Sub29 extends Node {

	public NodeCollection aClass482_7708 = new NodeCollection();

	public static void method12426() {
		if (client.GAME_STATE == 5 && !JS5CacheFile.method3360() && !Class85.method1466()) {
			GameState.setGameState(8);
		}
	}
}
