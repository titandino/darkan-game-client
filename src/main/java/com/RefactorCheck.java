package com;

import com.google.common.reflect.ClassPath;

import java.io.IOException;
import java.util.ArrayList;

public class RefactorCheck {

	public static void main(String[] args) {
		int classes = 0;
		int variables = 0;
		int methods = 0;
		try {
			for (Class<?> clazz : getClasses("com.jagex")) {
				if (clazz.getSimpleName().matches("Class\\d+"))
					classes++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Refactor check: " + classes + ", " + variables + ", and " + methods + " not yet refactored.");
	}

	public static ArrayList<Class<?>> getClasses(String packageName) throws ClassNotFoundException, IOException {
		ClassPath cp = ClassPath.from(Thread.currentThread().getContextClassLoader());
		ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
		for (ClassPath.ClassInfo info : cp.getTopLevelClassesRecursive(packageName)) {
			classes.add(Class.forName(info.getName()));
		}
		return classes;
	}

}
