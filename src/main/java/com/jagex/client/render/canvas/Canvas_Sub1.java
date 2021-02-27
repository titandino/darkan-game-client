package com.jagex.client.render.canvas;

import java.awt.*;
import java.io.File;

public class Canvas_Sub1 extends Canvas {

	public static File aFile9453;
	public Component aComponent9452;

	public Canvas_Sub1(Component component_1) {
		aComponent9452 = component_1;
	}

	@Override
	public void update(Graphics graphics_1) {
		aComponent9452.update(graphics_1);
	}

	@Override
	public void paint(Graphics graphics_1) {
		aComponent9452.paint(graphics_1);
	}

}
