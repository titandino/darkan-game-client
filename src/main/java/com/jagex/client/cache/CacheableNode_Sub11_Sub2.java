package com.jagex.client.cache;

import com.jagex.client.js5.JS5CacheFile;
import com.jagex.client.js5.JS5CacheRequest;

public class CacheableNode_Sub11_Sub2 extends JS5CacheRequest {

	public JS5CacheFile aClass203_10464;
	public int anInt10467;
	public byte[] aByteArray10469;

	@Override
	public int getCompletion() {
		return waiting ? 0 : 100;
	}

	@Override
	public byte[] method14944() {
		if (waiting) {
			throw new RuntimeException();
		} else {
			return aByteArray10469;
		}
	}

	@Override
	public int method14947() {
		return waiting ? 0 : 100;
	}

	@Override
	public byte[] getData() {
		if (waiting) {
			throw new RuntimeException();
		} else {
			return aByteArray10469;
		}
	}

	@Override
	public byte[] method14941() {
		if (waiting) {
			throw new RuntimeException();
		} else {
			return aByteArray10469;
		}
	}

	@Override
	public byte[] method14945() {
		if (waiting) {
			throw new RuntimeException();
		} else {
			return aByteArray10469;
		}
	}

	@Override
	public int method14946() {
		return waiting ? 0 : 100;
	}

	@Override
	public int method14948() {
		return waiting ? 0 : 100;
	}

}
