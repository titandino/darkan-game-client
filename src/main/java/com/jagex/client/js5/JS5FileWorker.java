package com.jagex.client.js5;

import com.jagex.ReferenceTable;
import com.jagex.client.input.InputSubscriberType;

public abstract class JS5FileWorker {

	public static InputSubscriberType[] method5815() {
		return new InputSubscriberType[]{InputSubscriberType.KEY_HOLD, InputSubscriberType.KEY_PRESS, InputSubscriberType.COMBINED};
	}

	public abstract ReferenceTable getReferenceTable();

	public abstract byte[] method5804(int var1);

	public abstract void method5805(int var1);

	public abstract int method5806(int var1);

	public abstract ReferenceTable method5807();

	public abstract void method5808(int var1);

	public abstract byte[] method5809(int var1);

	public abstract int method5810(int var1);

	public abstract byte[] method5811(int var1);

	public abstract void method5812(int var1);

	public abstract byte[] method5813(int var1);
}
