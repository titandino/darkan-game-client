package com.jagex.game.content.clans.settings;

import com.jagex.NodeCollection;
import com.jagex.RankSetting;
import com.jagex.RemoveMemberSetting;
import com.jagex.game.content.clans.ClanChannel;
import com.jagex.game.content.clans.settings.impl.AddMemberSetting;
import com.jagex.game.content.clans.settings.impl.EditMemberSetting;
import com.jagex.net.io.ByteBuf;

public class ChangeClanSetting {

	public static int BASE_WINDOW_WIDTH;

	public long pointer;

	public long updateNumber = -1L;

	NodeCollection settings = new NodeCollection();

	public ChangeClanSetting(ByteBuf buffer) {
		decodeSettings(buffer);
	}

	public void decodeSettings(ByteBuf buffer) {
		pointer = buffer.readLong();
		updateNumber = buffer.readLong();
		for (int i = buffer.readUnsignedByte(); i != 0; i = buffer.readUnsignedByte()) {
			ClanSetting setting = null;
			if (i == 1)
				setting = new AddMemberSetting();
			else if (i == 2)
				setting = new EditMemberSetting();
			else if (i == 3)
				setting = new RemoveMemberSetting();
			else if (i == 4)
				setting = new RankSetting();
			setting.readSettings(buffer);
			settings.append(setting);
		}
	}

	public void applySettings(ClanChannel channel) {
		if (channel.pointer == pointer && channel.nextUpdateNumber == updateNumber) {
			for (ClanSetting setting = (ClanSetting) settings.head(); setting != null; setting = (ClanSetting) settings.next()) {
				setting.apply(channel);
			}
			++channel.nextUpdateNumber;
		} else {
			throw new RuntimeException("");
		}
	}
}
