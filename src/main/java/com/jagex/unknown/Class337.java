package com.jagex.unknown;

import com.jagex.HostNameIdentifier;
import com.jagex.MIDIInstrument;
import com.jagex.client.js5.loaders.MapAreaIndexLoader;

import java.util.LinkedList;

public class Class337 {

	public static LinkedList<MIDIInstrument> aLinkedList3969 = new LinkedList<MIDIInstrument>();

	public Class337() throws Throwable {
		throw new Error();
	}

	public static void unloadInterface(int i_0) {
		MapAreaIndexLoader.INTERFACES_LOADED[i_0] = false;
		HostNameIdentifier.clearComponents(i_0);
	}
}
