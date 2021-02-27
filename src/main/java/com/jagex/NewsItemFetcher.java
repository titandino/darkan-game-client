package com.jagex;

import com.jagex.client.client;
import com.jagex.net.connection.ConnectionInfo;
import com.jagex.unknown.Class235;
import com.jagex.unknown.Class51;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class NewsItemFetcher implements Runnable {

	Thread aThread355;

	volatile boolean fetched;

	NewsItem[] newsItems;

	public static void method795() {
		Class235.aClass465_2904 = new IterableNodeMap(8);
		Class235.anInt2898 = 0;
		for (ParticleSystem class539_2 : Class235.aList2896) {
			class539_2.method11506();
		}
	}

	public static void method796(int[] ints_0, Object[] arr_1) {
		Class51.method1074(ints_0, arr_1, 0, ints_0.length - 1);
	}

	public NewsItem get(int id) {
		return newsItems != null && id >= 0 && id < newsItems.length ? newsItems[id] : null;
	}

	public boolean fetch() {
		if (fetched) {
			return true;
		} else {
			if (aThread355 == null) {
				aThread355 = new Thread(this);
				aThread355.start();
			}
			return fetched;
		}
	}

	@Override
	public void run() {
		try {
			int port = HDWaterTile.SERVER_ENVIRONMENT == ServerEnvironment.LIVE ? 80 : ConnectionInfo.JS5_CONNECTION_INFO.worldId + 7000;
			//System.out.println("http://" + Class448.aClass450_5420.host + ":" + port + "/news.ws?game=" + client.CURRENT_GAME.id);
			BufferedReader reader = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + ConnectionInfo.JS5_CONNECTION_INFO.host + ":" + port + "/news.ws?game=" + client.CURRENT_GAME.id)).openStream())));
			String line = reader.readLine();
			ArrayList<String> list;
			for (list = new ArrayList<>(); line != null; line = reader.readLine()) {
				list.add(line);
			}
			String[] news = new String[list.size()];
			list.toArray(news);
			if (news.length % 3 != 0)
				return;
			newsItems = new NewsItem[news.length / 3];
			for (int i = 0; i < news.length; i += 3)
				newsItems[i / 3] = new NewsItem(news[i], news[i + 1], news[i + 2]);
		} catch (IOException ignored) {
		}
		fetched = true;
	}
}
