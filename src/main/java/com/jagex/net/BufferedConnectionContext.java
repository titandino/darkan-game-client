package com.jagex.net;

import com.jagex.Isaac;
import com.jagex.NodeCollection;
import com.jagex.ServerProt;
import com.jagex.TCPPacket;
import com.jagex.client.GameState;
import com.jagex.client.client;
import com.jagex.net.connection.Connection;
import com.jagex.net.connection.ConnectionPinger;
import com.jagex.net.io.ByteBuf;

import java.io.IOException;

public class BufferedConnectionContext {

	public static int anInt2300;
	public Isaac isaac;
	public int anInt2290;
	public boolean aBool2298;
	public ServerProt lastPacket;
	public ServerProt thirdLastPacket;
	public Isaac aClass432_2295;
	public ServerProt secondLastPacket;
	public int anInt2297;
	public int readDataSize;
	public Connection connection;
	public NodeCollection queuedPackets = new NodeCollection();
	public ByteBuf writeBuffer = new ByteBuf(1600);
	public ByteBuf.Bit recievedBuffer = new ByteBuf.Bit(15000);
	public ServerProt currentPacket;
	public int currentPacketSize;
	public boolean aBool2288 = true;
	public int idleReadPulses;
	public ConnectionPinger pinger = new ConnectionPinger();
	public int anInt2293;
	public int anInt2294;
	public int read;

	public BufferedConnectionContext() {
		Thread thread_1 = new Thread(pinger);
		thread_1.setPriority(1);
		thread_1.start();
	}

	public static BufferedConnectionContext getConnectionContext() {
		return GameState.inLobby(client.GAME_STATE) ? client.LOBBY_CONNECTION_CONTEXT : client.GAME_CONNECTION_CONTEXT;
	}

	public void flush() throws IOException {
		if (connection != null && readDataSize > 0) {
			writeBuffer.index = 0;
			while (true) {
				TCPPacket packet = (TCPPacket) queuedPackets.head();
				if (packet == null || packet.anInt7680 > writeBuffer.buffer.length - writeBuffer.index) {
					connection.write(writeBuffer.buffer, writeBuffer.index);
					anInt2297 += writeBuffer.index;
					anInt2290 = 0;
					break;
				}
				writeBuffer.writeBytes(packet.buffer.buffer, 0, packet.anInt7680);
				readDataSize -= packet.anInt7680;
				packet.unlink();
				packet.buffer.method13059();
				packet.method12360();
			}
		}
	}

	public void queuePacket(TCPPacket tcpmessage_1) {
		queuedPackets.append(tcpmessage_1);
		tcpmessage_1.anInt7680 = tcpmessage_1.buffer.index;
		tcpmessage_1.buffer.index = 0;
		readDataSize += tcpmessage_1.anInt7680;
	}

	public void init(Connection connection, String ip) {
		this.connection = connection;
		pinger.setIp(ip);
	}

	public void method3051() {
		if (connection != null) {
			connection.method3318();
			connection = null;
		}
		pinger.setIp(null);
	}

	public Connection getConnection() {
		return connection;
	}

	public void clearAllQueuedPackets() {
		queuedPackets.removeAll();
		readDataSize = 0;
	}

	public void method3059() {
		if (client.CYCLES_20MS % 50 == 0) {
			anInt2293 = anInt2297;
			anInt2297 = 0;
			anInt2294 = read;
			read = 0;
		}
	}

	public void reset() {
		connection = null;
		pinger.setIp(null);
	}
}
