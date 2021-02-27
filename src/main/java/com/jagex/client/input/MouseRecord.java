package com.jagex.client.input;

import com.jagex.Node;

public abstract class MouseRecord extends Node {

	public abstract int getY();

	public abstract int getClickType();

	public abstract long method13471();

	public abstract int getMeta();

	public abstract void cache();

	public abstract int getX();
}
