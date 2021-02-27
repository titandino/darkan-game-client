package com.jagex.client.cs2;

import com.jagex.Index;
import com.jagex.Interface;
import com.jagex.MovingAnimation;
import com.jagex.client.js5.defs.IComponentDefinitions;
import com.jagex.unknown.Class464;

public class CS2Interface {
	public Interface inter;
	public IComponentDefinitions defs;

	public static void method8777(int i_0) {
		if (MovingAnimation.isInterfaceLoaded(i_0, null)) {
			Class464.method7743(Interface.INTERFACES[i_0].components, -1);
		}

	}

	public boolean setChild(int ifComp, int slotId) {
		IComponentDefinitions def = Index.getIComponentDefinitions(ifComp, slotId);
		if (def != null) {
			inter = Interface.INTERFACES[ifComp >> 16];
			defs = def;
			return true;
		} else {
			method8768();
			return false;
		}
	}

	public boolean method8766(Interface interface_1, int i_2) {
		if (interface_1 != null) {
			IComponentDefinitions icomponentdefinitions_5 = interface_1.getComponent(i_2);
			if (icomponentdefinitions_5 != null) {
				inter = interface_1;
				defs = icomponentdefinitions_5;
				return true;
			}
		}

		method8768();
		return false;
	}

	public void method8768() {
		inter = null;
		defs = null;
	}

	public IComponentDefinitions method8772() {
		return inter.getComponent(defs.idHash);
	}

}
