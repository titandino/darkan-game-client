package com.jagex.game.content.cutscenes.actions;

import com.jagex.NativeLibraryLoader;
import com.jagex.client.client;
import com.jagex.client.js5.loaders.SpotAnimIndexLoader;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class86;

public class CutsceneAction_Sub11 extends CutsceneAction {

	public int anInt9299;

	public int anInt9300;

	public int anInt9301;

	public int anInt9302;

	public int anInt9303;

	public int anInt9304;

	public CutsceneAction_Sub11(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9299 = rsbytebuffer_1.readUnsignedShort();
		anInt9300 = rsbytebuffer_1.readUnsignedShort();
		anInt9301 = rsbytebuffer_1.readUnsignedShort();
		anInt9302 = rsbytebuffer_1.readUnsignedShort();
		anInt9303 = rsbytebuffer_1.readUnsignedShort();
		anInt9304 = rsbytebuffer_1.readUnsignedShort();
	}

	public void method1601() {
		Class86.CUTSCENE_CAMERA_MOVEMENTS[136884767 * anInt9299 * -1845605921].method1363(0);
		Class86.CUTSCENE_CAMERA_MOVEMENTS[anInt9300 * 2006204237 * 1097011589].method1363(1);
		client.anInt7277 = 0;
		client.anInt7279 = anInt9301 * 1340850825 * 456369407 * 1010790215;
		client.anInt7256 = 0;
		client.anInt7327 = -1526006307 * anInt9303 * -666467409 * -768126693;
		client.anInt7182 = anInt9304 * -244194861 * -722833781 * 1448302961;
		client.anInt7448 = 1044733407 * -74015201;
		client.anInt7280 = anInt9302 * -692766461 * 1496611753 * -1508573389;
		NativeLibraryLoader.anInt3240 = 1155732519 * -672443707;
		SpotAnimIndexLoader.method8860();
		client.aBool7321 = true;
	}

	@Override
	public void method1592() {
		Class86.CUTSCENE_CAMERA_MOVEMENTS[anInt9299].method1363(0);
		Class86.CUTSCENE_CAMERA_MOVEMENTS[anInt9300].method1363(1);
		client.anInt7277 = 0;
		client.anInt7279 = anInt9301;
		client.anInt7256 = 0;
		client.anInt7327 = anInt9303;
		client.anInt7182 = anInt9304;
		client.anInt7448 = 1;
		client.anInt7280 = anInt9302;
		NativeLibraryLoader.anInt3240 = 3;
		SpotAnimIndexLoader.method8860();
		client.aBool7321 = true;
	}
}
