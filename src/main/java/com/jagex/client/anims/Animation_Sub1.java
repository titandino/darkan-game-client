package com.jagex.client.anims;

import com.jagex.SoftwareItemRender;
import com.jagex.client.js5.defs.animations.AnimationDefinitions;

public class Animation_Sub1 extends Animation {

	public Animation_Sub1() {
		super(true);
	}

	@Override
	public void playAnimationSound(AnimationDefinitions defs, int frame1Index) {
		SoftwareItemRender.playAnimationSound(defs, frame1Index);
	}

}
