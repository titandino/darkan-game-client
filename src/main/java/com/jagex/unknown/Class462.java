package com.jagex.unknown;

import com.jagex.client.js5.defs.animations.AnimationDefinitions;
import com.jagex.client.js5.defs.animations.AnimationFrameSet;
import com.jagex.client.js5.loaders.AnimationIndexLoader;

public class Class462 {

	public int frame1Id;

	public AnimationFrameSet frameSet1;

	public int flag;

	public int frame2Id;

	public AnimationFrameSet frameSet2;

	public boolean framesReady;

	public boolean setupAnimationFrame(AnimationIndexLoader animationLoader, AnimationDefinitions animationDefinitions, int frame1Index, int frame2Index, int[] frameIndices) {
		if (framesReady) return true;
		if (frame1Index >= frameIndices.length)
			return false;
		this.frame1Id = frameIndices[frame1Index];
		frameSet1 = animationLoader.getFrameSet(this.frame1Id >> 16);
		this.frame1Id &= 0xffff;
		if (frameSet1 == null)
			return false;
		if (animationDefinitions.tweened && frame2Index != -1 && frame2Index < frameIndices.length) {
			this.frame2Id = frameIndices[frame2Index];
			frameSet2 = animationLoader.getFrameSet(this.frame2Id >> 16);
			this.frame2Id &= 0xffff;
		}
		if (animationDefinitions.aBool5923) {
			flag |= 0x200;
		}
		if (frameSet1.modifiesColour(this.frame1Id)) {
			flag |= 0x80;
		}
		if (frameSet1.modifiesAlpha(this.frame1Id)) {
			flag |= 0x100;
		}
		if (frameSet1.method15081(this.frame1Id)) {
			flag |= 0x400;
		}
		if (frameSet2 != null) {
			if (frameSet2.modifiesColour(this.frame2Id)) {
				flag |= 0x80;
			}
			if (frameSet2.modifiesAlpha(this.frame2Id)) {
				flag |= 0x100;
			}
			if (frameSet2.method15081(this.frame2Id)) {
				flag |= 0x400;
			}
		}
		flag |= 0x20;
		framesReady = true;
		return true;
	}

	public void resetFrames() {
		framesReady = false;
		flag = 0;
		frameSet2 = null;
		frameSet1 = null;
	}
}
