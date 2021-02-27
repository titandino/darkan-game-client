package com.jagex;

import com.jagex.client.js5.JS5CacheRequest;
import com.jagex.net.io.ByteBuf;

public class PaddedJS5Request extends JS5CacheRequest {

	public static Index TEXTURED_MESH_INDEX;
	public byte padding;
	public int anInt10377;
	public ByteBuf stream;

	@Override
	public int method14947() {
		return stream == null ? 0 : stream.index / (stream.buffer.length - padding);
	}

	@Override
	public byte[] getData() {
		if (!waiting && stream.index >= stream.buffer.length - padding) {
			return stream.buffer;
		} else {
			throw new RuntimeException();
		}
	}

	@Override
	public int getCompletion() {
		return stream == null ? 0 : stream.index * 100 / (stream.buffer.length - padding);
	}

	@Override
	public byte[] method14944() {
		if (!waiting && stream.index >= stream.buffer.length - padding) {
			return stream.buffer;
		} else {
			throw new RuntimeException();
		}
	}

	@Override
	public byte[] method14945() {
		if (!waiting && stream.index >= stream.buffer.length - padding) {
			return stream.buffer;
		} else {
			throw new RuntimeException();
		}
	}

	@Override
	public byte[] method14941() {
		if (!waiting && stream.index >= stream.buffer.length - padding) {
			return stream.buffer;
		} else {
			throw new RuntimeException();
		}
	}

	@Override
	public int method14946() {
		return stream == null ? 0 : stream.index / (stream.buffer.length - padding);
	}

	@Override
	public int method14948() {
		return stream == null ? 0 : stream.index / (stream.buffer.length - padding);
	}

}
