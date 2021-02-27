package com.jagex.unknown;

import com.jagex.client.js5.defs.animations.AnimationDefinitions;
import com.jagex.client.js5.defs.animations.AnimationFrameSet;
import com.jagex.client.js5.loaders.AnimationIndexLoader;

public class Class462 {

	public int frame1Index;

	public AnimationFrameSet frame1;

	public int flag;

	public int frame2Index;

	public AnimationFrameSet frame2;

	public boolean aBool5544;

	public boolean setupAnimationFrame(AnimationIndexLoader animationLoader, AnimationDefinitions animationDefinitions, int frame1Index, int frame2Index, int[] frameIndices) {
		if (aBool5544) return true;
		if (frame1Index >= frameIndices.length)
			return false;
		this.frame1Index = frameIndices[frame1Index];
		frame1 = animationLoader.getAnimationFrame(this.frame1Index >> 16);
		this.frame1Index &= 0xffff;
		if (frame1 == null)
			return false;
		if (animationDefinitions.tweened && frame2Index != -1 && frame2Index < frameIndices.length) {
			this.frame2Index = frameIndices[frame2Index];
			frame2 = animationLoader.getAnimationFrame(this.frame2Index >> 16);
			this.frame2Index &= 0xffff;
		}
		if (animationDefinitions.aBool5923) {
			flag |= 0x200;
		}
		if (frame1.modifiesColour(this.frame1Index)) {
			flag |= 0x80;
		}
		if (frame1.modifiesAlpha(this.frame1Index)) {
			flag |= 0x100;
		}
		if (frame1.method15081(this.frame1Index)) {
			flag |= 0x400;
		}
		if (frame2 != null) {
			if (frame2.modifiesColour(this.frame2Index)) {
				flag |= 0x80;
			}
			if (frame2.modifiesAlpha(this.frame2Index)) {
				flag |= 0x100;
			}
			if (frame2.method15081(this.frame2Index)) {
				flag |= 0x400;
			}
		}
		flag |= 0x20;
		aBool5544 = true;
		return true;
	}

	public void resetFrames() {
		aBool5544 = false;
		flag = 0;
		frame2 = null;
		frame1 = null;
	}
}
