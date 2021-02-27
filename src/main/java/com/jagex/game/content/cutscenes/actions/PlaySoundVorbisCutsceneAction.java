package com.jagex.game.content.cutscenes.actions;

import com.jagex.AreadSound;
import com.jagex.QuickchatFiller;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class149_Sub2;
import com.jagex.unknown.Class435;
import com.jagex.unknown.Class86;

public class PlaySoundVorbisCutsceneAction extends CutsceneAction {

	public AreadSound aClass268_9271;

	public int anInt9270;

	public int anInt9269;

	public int anInt9272;

	public int anInt9268;

	public PlaySoundVorbisCutsceneAction(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9270 = rsbytebuffer_1.readUnsignedShort();
		anInt9269 = rsbytebuffer_1.readUnsignedByte();
		anInt9272 = rsbytebuffer_1.readUnsignedByte();
		anInt9268 = rsbytebuffer_1.readUnsignedByte();
	}

	public static boolean method14577() {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5879);
	}

	@Override
	public void method1592() {
		aClass268_9271 = Class435.playSoundVorbis(anInt9270, anInt9268, 0, anInt9269, false, anInt9272);
	}

	@Override
	public void method1593() {
		if (aClass268_9271 != null) {
			QuickchatFiller.method1142(aClass268_9271);
			aClass268_9271 = null;
		}
	}

	public void method1601() {
		aClass268_9271 = Class435.playSoundVorbis(983294899 * anInt9270 * -1315470469, anInt9268 * 1609664985 * -573413783, 0, anInt9269 * -957613339 * -840420627, false, 177588843 * anInt9272 * -1529769405);
	}
}
