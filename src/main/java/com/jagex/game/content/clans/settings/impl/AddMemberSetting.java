package com.jagex.game.content.clans.settings.impl;

import com.jagex.game.content.clans.ClanChannel;
import com.jagex.game.content.clans.ClanChannelMember;
import com.jagex.game.content.clans.settings.ClanSetting;
import com.jagex.net.io.ByteBuf;

public class AddMemberSetting extends ClanSetting {

	public String username;
	int worldId;
	byte rank;

	public AddMemberSetting() {
		username = null;
	}

	@Override
	public void apply(ClanChannel channel) {
		ClanChannelMember member = new ClanChannelMember();
		member.name = username;
		member.world = worldId;
		member.rank = rank;
		channel.addMember(member);
	}

	@Override
	public void readSettings(ByteBuf buffer) {
		if (buffer.readUnsignedByte() != 255) {
			--buffer.index;
			buffer.readLong();
		}
		username = buffer.readNullString();
		worldId = buffer.readUnsignedShort();
		rank = buffer.readByte();
		buffer.readLong();
	}

}
