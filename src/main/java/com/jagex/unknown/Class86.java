package com.jagex.unknown;

import com.jagex.*;
import com.jagex.client.input.KeyHoldInputSubscriber;
import com.jagex.client.js5.JS5StandardRequester;
import com.jagex.client.js5.defs.IComponentDefinitions;
import com.jagex.client.js5.defs.VarcDefinitions;
import com.jagex.game.content.cutscenes.CutsceneCameraMovement;
import com.jagex.game.content.cutscenes.CutsceneEntityMovement;
import com.jagex.game.content.cutscenes.CutsceneObject;
import com.jagex.game.content.cutscenes.actions.CutsceneAction;

public class Class86 {

	public static CutsceneAction[] aCutsceneActionArray822;
	public static int anInt833;
	public static NodeCollection CUTSCENE_AREAS = new NodeCollection();
	public static IterableNodeMap aClass465_823 = new IterableNodeMap(32);
	public static VarProvider anInterface42_832 = new Class79();
	public static CutsceneCameraMovement[] CUTSCENE_CAMERA_MOVEMENTS;
	public static CutsceneObject[] CUTSCENE_OBJECTS;
	public static CutsceneEntityMovement[] aClass93Array821;
	public static short aShort828;
	public static short aShort829;
	public static short aShort830;
	public static int anInt819 = 1;
	public static int anInt825;
	public static int anInt824;
	public static boolean aBool826;
	public static int anInt831 = -1;

	public Class86() throws Throwable {
		throw new Error();
	}

	public static void method1478() {
		if (Class9.loginStage != 2) {
			Class9.CURRENT_CONNECTION_CONTEXT.method3051();
			JS5StandardRequester.method5558();
			Class361.method6270();
		}
	}

	public static boolean method1481(KeyHoldInputSubscriber class232_0) {
		return Friend.method302(class232_0, null);
	}

	public static void method1482(IComponentDefinitions icomponentdefinitions_0) {
		if (icomponentdefinitions_0.type == ComponentType.SPRITE && icomponentdefinitions_0.containerItemId != -1) {
			VarcDefinitions.method6996(Renderers.CURRENT_RENDERER, icomponentdefinitions_0);
		}
	}
}
