package com.jagex;

import com.jagex.unknown.Class404;

public interface LibraryLoader {

	public boolean hasDxLibrary();

	public boolean unload();

	public boolean loadLibrary(String var1);

	public boolean containsLibrary(String var1);

	public static LibraryLoader getLoader() {
		if (Class404.LIBRARY_LOADER == null) {
			throw new IllegalStateException("");
		} else {
			return Class404.LIBRARY_LOADER;
		}
	}
}
