package com.jagex.unknown;

import com.jagex.net.connection.ConnectionInfo;

public class Class274 {

	public static Class470 aClass470_3336;

	public int width;
	public int height;
	public int anInt3333;
	public int anInt3335;
	public String name;

	public Class274(int width, int height, int i_3, int i_4, String name) {
		this.width = width;
		this.height = height;
		anInt3333 = i_3;
		anInt3335 = i_4;
		this.name = name;
	}

	public static void method4884() {
		if (ConnectionInfo.NEWS_CONNECTION_INFO.worldId != -1) {
			Class62.setGameHost(ConnectionInfo.NEWS_CONNECTION_INFO.worldId, ConnectionInfo.NEWS_CONNECTION_INFO.host);
		}
	}

	public int method4868() {
		return anInt3333;
	}

	public String getName() {
		return name;
	}

	public int getWidth() {
		return width;
	}

	public int method4872() {
		return anInt3335;
	}

	public int getHeight() {
		return height;
	}
}
