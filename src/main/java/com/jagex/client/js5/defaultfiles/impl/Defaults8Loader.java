package com.jagex.client.js5.defaultfiles.impl;

import com.jagex.Index;
import com.jagex.client.input.InputSubscriber;
import com.jagex.client.js5.defaultfiles.DefaultsFile;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class285;

import java.util.Stack;

public class Defaults8Loader {

	public static int anInt5932;
	public InputSubscriber inputSubscriber;

	public Defaults8Loader(Index index_1) {
		byte[] data = index_1.getFile(DefaultsFile.FILE_8.fileId);
		decode(new ByteBuf(data));
	}

	public static void method11156() {
		Stack<Class285> stack_1 = Class285.aStack3390;
		synchronized (Class285.aStack3390) {
			Class285.aStack3390 = new Stack<>();
		}
	}

	public void decode(ByteBuf buffer) {
		while (true) {
			int i_3 = buffer.readUnsignedByte();
			if (i_3 == 0)
				return;
			if (i_3 == 1)
				inputSubscriber = InputSubscriber.decode(buffer);
		}
	}
}
