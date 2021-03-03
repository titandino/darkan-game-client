package com.jagex.client.anims;

import com.jagex.MeshRasterizer;
import com.jagex.NamedFileReference;
import com.jagex.client.js5.defs.animations.AnimationDefinitions;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class149_Sub1;
import com.jagex.unknown.Class462;

public class Animation {

	public AnimationDefinitions defs;
	public boolean aBool5462;
	public boolean aBool5463;
	public int speed;
	public int anInt5459;
	public int frame1Index;
	public int frame2Index;
	public int frame1Duration;
	public int anInt5461;
	public boolean aBool5456;
	public Class462 frameManager;
	public Class462 aClass462_5467;

	public Animation(boolean bool_1) {
		aBool5463 = bool_1;
		frameManager = new Class462();
		if (aBool5463) {
			aClass462_5467 = new Class462();
		} else {
			aClass462_5467 = null;
		}
	}

	public static Class149_Sub1 method7644(ByteBuf rsbytebuffer_0) {
		return new Class149_Sub1(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
	}

	public boolean setupAnimationFrames() {
		if (defs == null) return false;
		boolean setup = frameManager.setupAnimationFrame(NamedFileReference.ANIMATION_INDEX_LOADER, defs, frame1Index, frame2Index, defs.frames);
		if (setup && aBool5463 && defs.anIntArray5911 != null)
			aClass462_5467.setupAnimationFrame(NamedFileReference.ANIMATION_INDEX_LOADER, defs, frame1Index, frame2Index, defs.anIntArray5911);
		return setup;
	}

	public void method7563(Animation animation) {
		defs = animation.defs;
		aBool5462 = animation.aBool5462;
		aBool5463 = animation.aBool5463;
		speed = animation.speed;
		anInt5459 = animation.anInt5459;
		frame1Index = animation.frame1Index;
		frame2Index = animation.frame2Index;
		frame1Duration = animation.frame1Duration;
		resetFrames();
	}

	public boolean hasDefs() {
		return defs != null;
	}

	public AnimationDefinitions getDefs() {
		return defs;
	}

	public void update(int i_1) {
		setAnimationFull(i_1, 0, 0, false);
	}

	public void stopAnimation() {
		setAnimationFull(-1, 0, 0, false);
	}

	public void setAnimation(int animationId) {
		setAnimation(animationId, 0, 0, false, true);
	}

	public void setAnimationFull(int animationId, int speed, int i_3, boolean bool_4) {
		setAnimation(animationId, speed, i_3, bool_4, false);
	}

	public void setAnimation(int animationId, int speed, int i_3, boolean bool_4, boolean bool_5) {
		if (animationId == currentAnimationId()) return;
		if (animationId == -1) {
			defs = null;
			resetFrames();
			return;
		}
		if (defs == null || defs.id != animationId)
			defs = NamedFileReference.ANIMATION_INDEX_LOADER.getAnimDefs(animationId);
		else if (defs.replayMode == 0) //this should never even happen?
			return;
		anInt5459 = 0;
		this.speed = speed;
		anInt5461 = i_3;
		aBool5456 = bool_5;
		if (bool_4) { //randomize?
			frame1Index = (int) (Math.random() * defs.frames.length);
			frame1Duration = (int) (Math.random() * defs.frameDurations[frame1Index]);
		} else {
			frame1Index = 0;
			frame1Duration = 0; //i don't think this is actually duration
		}
		frame2Index = frame1Index + 1;
		if (frame2Index >= defs.frames.length)
			frame2Index = -1;
		if (this.speed == 0)
			playAnimationSound(defs, frame1Index);
		aBool5462 = false;
		resetFrames();
	}

	public boolean hasSpeed() {
		return speed != 0;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void rasterize(MeshRasterizer rasterizer, int i_2) {
		if (defs != null && defs.frames != null && setupAnimationFrames()) {
			rasterizer.method11262(defs.id, frameManager.frameSet1, frameManager.frame1Id, frameManager.frameSet2, frameManager.frame2Id, frame1Duration, defs.frameDurations[frame1Index], i_2, defs.aBool5923);
			if (aBool5463 && defs.anIntArray5911 != null && aClass462_5467.framesReady) {
				rasterizer.method11262(defs.id, aClass462_5467.frameSet1, aClass462_5467.frame1Id, aClass462_5467.frameSet2, aClass462_5467.frame2Id, frame1Duration, defs.frameDurations[frame1Index], i_2, defs.aBool5923);
			}
		}
	}

	public void method7578(MeshRasterizer meshrasterizer_1, int i_3) {
		if (defs.frames != null && setupAnimationFrames()) {
			meshrasterizer_1.method11258(defs.id, frameManager.frameSet1, frameManager.frame1Id, frameManager.frameSet2, frameManager.frame2Id, frame1Duration, defs.frameDurations[frame1Index], i_3, defs.aBool5923, null);
			//second animation?
			if (aBool5463 && defs.anIntArray5911 != null && aClass462_5467.framesReady) {
				meshrasterizer_1.method11258(defs.id, aClass462_5467.frameSet1, aClass462_5467.frame1Id, aClass462_5467.frameSet2, aClass462_5467.frame2Id, frame1Duration, defs.frameDurations[frame1Index], i_3, defs.aBool5923, null);
			}
		}
	}

	public void method7579(MeshRasterizer meshrasterizer_1) {
		if (defs.frames != null && setupAnimationFrames()) {
			meshrasterizer_1.method11284(frameManager.frameSet1, frameManager.frame1Id);
			if (aBool5463 && defs.anIntArray5911 != null && aClass462_5467.framesReady) {
				meshrasterizer_1.method11284(aClass462_5467.frameSet1, aClass462_5467.frame1Id);
			}
		}
	}

	public boolean method7580() {
		return aBool5462;
	}

	public void resetAnimation() {
		resetAnimation(0);
	}

	public void resetAnimation(int speed) {
		frame1Index = 0;
		frame2Index = defs.frames.length > 1 ? 1 : -1;
		frame1Duration = 0;
		aBool5462 = false;
		this.speed = speed;
		anInt5459 = 0;
		playAnimationSound(defs, frame1Index);
		resetFrames();
	}

	public void method7584() {
		anInt5459 = 0;
	}

	public boolean method7585(int i_1) {
		return !(defs == null | (i_1 -= speed) <= 0) && defs.tweened | frame1Duration + i_1 > defs.frameDurations[frame1Index];
	}

	public void playAnimationSound(AnimationDefinitions animationdefinitions_1, int i_2) {
	}

	public void resetFrames() {
		frameManager.resetFrames();
		if (aBool5463)
			aClass462_5467.resetFrames();
	}

	public int currentAnimationId() {
		return defs != null ? defs.id : -1;
	}

	public void method7615(int i_1, int i_2) {
		setAnimationFull(i_1, i_2, 0, false);
	}

	//begin animation loop or something.
	public boolean setupLoop(int loopStart) {
		if (defs != null && loopStart != 0) {
			if (speed > 0) {
				if (speed >= loopStart) {
					speed -= loopStart;
					return false;
				}
				loopStart -= speed;
				speed = 0;
				playAnimationSound(defs, frame1Index);
			}
			loopStart += frame1Duration;
			boolean bool_3 = defs.tweened | AnimationDefinitions.aBool5925;
			if (loopStart > 100 && defs.loopDelay > 0) {
				int i_4;
				for (i_4 = defs.frames.length - defs.loopDelay; frame1Index < i_4 && loopStart > defs.frameDurations[frame1Index]; frame1Index++) {
					loopStart -= defs.frameDurations[frame1Index];
				}
				if (frame1Index >= i_4) {
					int totalDuration = 0;
					for (int frame = i_4; frame < defs.frames.length; frame++)
						totalDuration += defs.frameDurations[frame];
					if (anInt5461 == 0)
						anInt5459 += loopStart / totalDuration;
					loopStart %= totalDuration;
				}
				frame2Index = frame1Index + 1;
				if (frame2Index >= defs.frames.length) {
					if (defs.loopDelay == -1 && aBool5456) {
						frame2Index = 0;
					} else {
						frame2Index -= defs.loopDelay;
					}
					if (frame2Index < 0 || frame2Index >= defs.frames.length) {
						frame2Index = -1;
					}
				}
				bool_3 = true;
			}
			while (loopStart > defs.frameDurations[frame1Index]) {
				bool_3 = true;
				loopStart -= defs.frameDurations[++frame1Index - 1];
				if (frame1Index >= defs.frames.length) {
					if (defs.loopDelay != -1 && anInt5461 != 2) {
						frame1Index -= defs.loopDelay;
						if (anInt5461 == 0) {
							++anInt5459;
						}
					}
					if (anInt5459 >= defs.maxLoops || frame1Index < 0 || frame1Index >= defs.frames.length) {
						aBool5462 = true;
						break;
					}
				}
				playAnimationSound(defs, frame1Index);
				frame2Index = frame1Index + 1;
				if (frame2Index >= defs.frames.length) {
					if (defs.loopDelay == -1 && aBool5456) {
						frame2Index = 0;
					} else {
						frame2Index -= defs.loopDelay;
					}
					if (frame2Index < 0 || frame2Index >= defs.frames.length) {
						frame2Index = -1;
					}
				}
			}
			frame1Duration = loopStart;
			if (bool_3) {
				resetFrames();
			}
			return bool_3;
		} else {
			return false;
		}
	}

	public int method7640() {
		if (setupAnimationFrames()) {
			int i_2 = 0;
			if (setupAnimationFrames()) {
				i_2 |= frameManager.flag;
				if (aBool5463 && defs.anIntArray5911 != null) {
					i_2 |= aClass462_5467.flag;
				}
			}
			return i_2;
		} else {
			return 0;
		}
	}
}
