package com.jagex.net.io;

import com.jagex.InteractableObject;
import com.jagex.Interface;
import com.jagex.MovingAnimation;
import com.jagex.client.Engine;
import com.jagex.unknown.Class110;
import com.jagex.unknown.Class514;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileStream {

	RandomAccessFile file;
	public long offset;
	public long maxLength;

	public FileStream(File file, long maxLength) throws IOException {
		if (maxLength == -1L)
			maxLength = Long.MAX_VALUE;

		if (file.length() > maxLength)
			file.delete();

		this.file = new RandomAccessFile(file, "rw");
		this.maxLength = maxLength;
		offset = 0L;
		int i_5 = this.file.read();
		if (i_5 != -1) {
			this.file.seek(0L);
			this.file.write(i_5);
		}

		this.file.seek(0L);
	}

	public static void method7403(int i_0, int i_1, int i_2, boolean bool_3) {
		if (MovingAnimation.isInterfaceLoaded(i_0, null)) {
			InteractableObject.method16099(Interface.INTERFACES[i_0].components, -1, i_1, i_2, bool_3);
		}

	}

	public static FileStream createPreferenceFileStream(String index, String gameName, boolean useFallback) {
		File file = new File(Engine.aFile3264, "preferences" + index + ".dat");
		if (file.exists()) {
			try {
				FileStream stream = new FileStream(file, 10000L);
				return stream;
			} catch (IOException ignored) {
			}
		}
		String extra = "";
		if (Class514.anInt5887 == 33) {
			extra = "_rc";
		} else if (Class514.anInt5887 == 34) {
			extra = "_wip";
		}
		File fallback = new File(Class110.aString1103, "dk_" + gameName + "_preferences" + index + extra + ".dat");
		FileStream stream;
		if (!useFallback && fallback.exists()) {
			try {
				stream = new FileStream(fallback, 10000L);
				return stream;
			} catch (IOException ignored) {
			}
		}
		try {
			stream = new FileStream(file, 10000L);
			return stream;
		} catch (IOException ioexception_9) {
			throw new RuntimeException();
		}
	}

	public void close() throws IOException {
		if (file != null) {
			file.close();
			file = null;
		}

	}

	public void writeBytes(byte[] bytes, int offset, int length) throws IOException {
		if (this.offset + length > maxLength) {
			file.seek(maxLength);
			file.write(1);
			throw new EOFException();
		} else {
			file.write(bytes, offset, length);
			this.offset += length;
		}
	}

	public long getLength() throws IOException {
		return file.length();
	}

	public int readBytes(byte[] bytes, int offset, int length) throws IOException {
		int size = file.read(bytes, offset, length);
		if (size > 0)
			this.offset += size;

		return size;
	}

	@Override
	protected void finalize() throws Throwable {
		if (file != null) {
			System.out.println();
			close();
		}

	}

	public void seek(long offset) throws IOException {
		file.seek(offset);
		this.offset = offset;
	}

}
