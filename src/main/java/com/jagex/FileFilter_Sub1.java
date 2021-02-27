package com.jagex;

import com.jagex.unknown.Class191;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileFilter_Sub1 extends FileFilter {

	public Class191 this$0;
	public Class191 aClass191_7864;

	public FileFilter_Sub1(Class191 class191_1, Class191 class191_2) {
		this$0 = class191_1;
		aClass191_7864 = class191_2;
	}

	@Override
	public boolean accept(File file_1) {
		return aClass191_7864.method3156() && file_1.isDirectory() || !aClass191_7864.method3156();
	}

	@Override
	public String getDescription() {
		return null;
	}

}
