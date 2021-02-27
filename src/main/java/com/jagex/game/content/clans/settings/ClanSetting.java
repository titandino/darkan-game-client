package com.jagex.game.content.clans.settings;

import com.jagex.Node;
import com.jagex.Node_Sub17_Sub2;
import com.jagex.Utils;
import com.jagex.client.client;
import com.jagex.game.content.clans.ClanChannel;
import com.jagex.net.io.ByteBuf;
import com.jagex.net.io.FileStream;
import com.jagex.unknown.Class320;

public abstract class ClanSetting extends Node {

	public static void saveVarcsToFile() {
		FileStream fileStream = null;
		try {
			fileStream = FileStream.createPreferenceFileStream("2", client.CURRENT_GAME.name, true);
			ByteBuf buffer = new ByteBuf(client.anInt7399 * 6 + 3);
			buffer.writeByte(1);
			buffer.writeShort(client.anInt7399);
			for (int varcId = 0; varcId < Class320.VARC_INT.length; varcId++) {
				if (Node_Sub17_Sub2.IS_VARC_SAVE_TO_FILE[varcId]) {
					buffer.writeShort(varcId);
					buffer.writeInt(Class320.VARC_INT[varcId]);
				}
			}
			fileStream.writeBytes(buffer.buffer, 0, buffer.index);
		} catch (Exception ignored) {
		}
		try {
			if (fileStream != null)
				fileStream.close();
		} catch (Exception ignored) {
		}
		client.VARCS_LAST_SAVED = Utils.time();
		client.NEEDS_VARC_SAVE = false;
	}

	public abstract void readSettings(ByteBuf buffer);

	public abstract void apply(ClanChannel channel);

}
