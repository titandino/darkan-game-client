package com.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public abstract class Node_Sub41 extends Node {

	public int anInt8031;
	public OggStreamState anOggStreamState8032;

	public Node_Sub41(OggStreamState oggstreamstate_1) {
		anOggStreamState8032 = oggstreamstate_1;
	}

	public static boolean method13367(int i_0) {
		return i_0 != 1 && i_0 != 7;
	}

	public abstract void method13360();

	public void method13361(OggPacket oggpacket_1) {
		method13362(oggpacket_1);
		++anInt8031;
	}

	public abstract void method13362(OggPacket var1);

	public abstract void method13363(OggPacket var1);

	public abstract void method13364();

	public abstract void method13365();

	public abstract void method13366(OggPacket var1);

}
