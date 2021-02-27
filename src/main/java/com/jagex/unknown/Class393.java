package com.jagex.unknown;

import com.jagex.IFSubObjectPosition;
import com.jagex.Interface3;
import com.jagex.MapRegion;
import com.jagex.client.js5.loaders.VarDefinitionLoader;
import com.jagex.client.prefs.ClientPreferences;
import com.jagex.client.route.RouteStrategies;
import com.jagex.game.content.cutscenes.actions.CutsceneActionType;
import com.jagex.net.io.ByteBuf;

public class Class393 {

	public static ClientPreferences preferences;

	public Interface3[] anInterface3Array4782;

	public void method6743(ByteBuf rsbytebuffer_1) {
		anInterface3Array4782 = new Interface3[rsbytebuffer_1.readUnsignedByte()];
		Class60[] arr_3 = Class112.method1870();
		for (int i_4 = 0; i_4 < anInterface3Array4782.length; i_4++) {
			anInterface3Array4782[i_4] = method6745(rsbytebuffer_1, arr_3[rsbytebuffer_1.readUnsignedByte()]);
		}
	}

	public Interface3 method6745(ByteBuf rsbytebuffer_1, Class60 class60_2) {
		return class60_2 == Class60.aClass60_609 ? RouteStrategies.method3784(rsbytebuffer_1) : (class60_2 == Class60.aClass60_602 ? CutsceneActionType.method6915(rsbytebuffer_1) : (class60_2 == Class60.aClass60_605 ? Class366.method6303(rsbytebuffer_1) : (class60_2 == Class60.aClass60_607 ? IFSubObjectPosition.method11354(rsbytebuffer_1) : (class60_2 == Class60.aClass60_606 ? Class258.method4570(rsbytebuffer_1) : (class60_2 == Class60.aClass60_603 ? MapRegion.method4564(rsbytebuffer_1) : (class60_2 == Class60.aClass60_608 ? Class163.method2843(rsbytebuffer_1) : (class60_2 == Class60.aClass60_604 ? VarDefinitionLoader.method6401(rsbytebuffer_1) : (class60_2 == Class60.aClass60_601 ? Class214.method3668(rsbytebuffer_1) : (class60_2 == Class60.aClass60_610 ? Class332.method5928(rsbytebuffer_1) : null)))))))));
	}
}
