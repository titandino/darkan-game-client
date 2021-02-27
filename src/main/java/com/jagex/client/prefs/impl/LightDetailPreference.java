package com.jagex.client.prefs.impl;

import com.jagex.ClientProt;
import com.jagex.TCPPacket;
import com.jagex.client.prefs.ClientPreferences;
import com.jagex.game.content.clans.ClanChannel;
import com.jagex.game.content.clans.ClanChannelMember;
import com.jagex.game.messages.chat.ChatLine;
import com.jagex.net.BufferedConnectionContext;
import com.jagex.net.connection.async.AsyncConnection;
import com.jagex.unknown.Class113;

public class LightDetailPreference extends Preference {

	public LightDetailPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public LightDetailPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public static void kickClanChatMember(boolean mainCC, int playerIndex) {
		ClanChannel cc = mainCC ? Class113.CLAN_CHANNEL : AsyncConnection.LISTENED_CLAN_CHANNEL;
		if (cc != null && playerIndex >= 0 && playerIndex < cc.numPlayers) {
			ClanChannelMember ccPlayer = cc.players[playerIndex];
			if (ccPlayer.rank == -1) {
				String ccPlayerName = ccPlayer.name;
				BufferedConnectionContext connection = BufferedConnectionContext.getConnectionContext();
				TCPPacket packet = TCPPacket.createPacket(ClientProt.CLANCHANNEL_KICKUSER, connection.isaac);
				packet.buffer.writeByte(3 + ChatLine.getLength(ccPlayerName));
				packet.buffer.writeByte(mainCC ? 1 : 0);
				packet.buffer.writeShort(playerIndex);
				packet.buffer.writeString(ccPlayerName);
				connection.queuePacket(packet);
			}
		}

	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public void method12785() {
		if (anInt5578 != 1 && anInt5578 != 0) {
			anInt5578 = getDefaultValue();
		}

	}

	@Override
	public int getDefaultValue() {
		return 1;
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	public int method7786() {
		return 1;
	}

	public int method12786() {
		return anInt5578;
	}

	public void method7780(int i_1) {
		anInt5578 = i_1 * -754033619 * -859024475;
	}

	public int method7784() {
		return 1;
	}

	public int method7787() {
		return 1;
	}

}
