package com.jagex.game.content.cutscenes.actions;

import com.jagex.SongReference;
import com.jagex.client.js5.IndexLoaders;
import com.jagex.game.entity.player.creation.AccountCreationResponseOpcodes;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class256;

public class CutsceneAction_Sub9 extends CutsceneAction {

	public static AccountCreationResponseOpcodes RECIEVED_RESPONSE;

	public static int anInt9282;

	public int anInt9280;

	public int anInt9279;

	public SongReference aClass116_9281;

	public CutsceneAction_Sub9(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9280 = rsbytebuffer_1.readUnsignedShort();
		anInt9279 = rsbytebuffer_1.readUnsignedByte();
	}

	public static boolean method14585(int i_0) {
		return i_0 == (i_0 & -i_0);
	}

	@Override
	public boolean method1599() {
		if (aClass116_9281 == null) {
			aClass116_9281 = new SongReference(IndexLoaders.MUSIC_INDEX, anInt9280);
		}
		return aClass116_9281.method1963();
	}

	public void method1601() {
		Class256.method4412(aClass116_9281, 68269153 * anInt9279 * -321392735);
	}

	@Override
	public void method1592() {
		Class256.method4412(aClass116_9281, anInt9279);
	}
}
