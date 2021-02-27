package com.jagex.client;

import com.jagex.HintTrail;
import com.jagex.PulseEvent;

public class Game {

	public static Game darkan = new Game("darkan", "Darkan", 0);
	public static Game stellarDawn = new Game("stellardawn", "Stellar Dawn", 1);
	public static Game aClass486_5745 = new Game("game3", "Game 3", 2);
	public static Game aClass486_5743 = new Game("game4", "Game 4", 3);
	public static Game aClass486_5747 = new Game("game5", "Game 5", 4);

	public String name;
	public String formattedName;
	public int id;

	Game(String name, String formattedName, int id) {
		this.name = name;
		this.formattedName = formattedName;
		this.id = id;
	}

	public static void method8204(int i_0) {
		HintTrail.anInt3376 = i_0;
	}

	public static void method8207(int i_0) {
		PulseEvent event = PulseEvent.createPulseEvent(16, i_0);
		event.method14965();
	}
}
