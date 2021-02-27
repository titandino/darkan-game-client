package com.jagex;

public class RendererInfo {

	public int id;
	public String name;
	public int version;
	public String description;
	public long driverVersion;

	public RendererInfo(int id, String name, int version, String description, long driverVersion) {
		this.id = id;
		this.name = name;
		this.version = version;
		this.description = description;
		this.driverVersion = driverVersion;
	}
}
