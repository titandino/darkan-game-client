import jaclib.ping.Ping;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.InetAddress;
import java.net.URI;
import java.util.LinkedList;
import java.util.Queue;

public class PingRequester implements Runnable {

	public static int anInt5864;

	Object anObject5862 = new Object();
	Queue requestQueue = new LinkedList();
	Thread requestThread = new Thread(this);

	public PingRequest createPingRequest(String ip) {
		if (this.requestThread == null) {
			throw new IllegalStateException("");
		} else if (ip == null) {
			throw new IllegalArgumentException("");
		} else {
			PingRequest class510_3 = new PingRequest(ip);
			this.queueRequest(class510_3, -1763010472);
			return class510_3;
		}
	}

	public PingRequester() {
		this.requestThread.setDaemon(true);
		this.requestThread.start();
	}

	void queueRequest(Object object_1, int i_2) {
		Queue queue_3 = this.requestQueue;
		synchronized (this.requestQueue) {
			this.requestQueue.add(object_1);
			this.requestQueue.notify();
		}
	}

	public void method8733() {
		if (this.requestThread != null) {
			this.queueRequest(this.anObject5862, -2004280805);
			try {
				this.requestThread.join();
			} catch (InterruptedException interruptedexception_3) {
				;
			}
			this.requestThread = null;
		}
	}

	public void run() {
		while (true) {
			PingRequest request;
			synchronized (this.requestQueue) {
				Object object_3;
				for (object_3 = this.requestQueue.poll(); object_3 == null; object_3 = this.requestQueue.poll()) {
					try {
						this.requestQueue.wait();
					} catch (InterruptedException interruptedexception_7) {
						;
					}
				}
				if (object_3 == this.anObject5862) {
					return;
				}
				request = (PingRequest) object_3;
			}
			int ping;
			try {
				byte[] addr = InetAddress.getByName(request.ip).getAddress();
				ping = Ping.ping(addr[0], addr[1], addr[2], addr[3], 1000L);
			} catch (Throwable throwable_6) {
				ping = 1000;
			}
			request.ping = ping;
		}
	}

	public static void method8736(String string_0, boolean bool_1, boolean bool_2, String string_3, boolean bool_4, boolean bool_5, byte b_6) {
		if (bool_1) {
			if (!bool_4 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(string_0));
					return;
				} catch (Exception exception_8) {
					;
				}
			}
			if (Class225_Sub6.aString8069.startsWith("win") && !bool_4) {
				Class468_Sub6.method12661(string_0, 0, (byte) -25);
			} else if (Class225_Sub6.aString8069.startsWith("mac")) {
				Class186.method3082(string_0, 1, string_3);
			} else {
				Class468_Sub6.method12661(string_0, 2, (byte) -47);
			}
		} else {
			Class468_Sub6.method12661(string_0, 3, (byte) -77);
		}
	}

	static final void decodeMasks(RsBitsBuffer rsbitsbuffer_0) {
		for (int i_2 = 0; i_2 < Class197.anInt2434; i_2++) {
			int i_3 = Class197.anIntArray2435[i_2];
			Player player_4 = client.players[i_3];
			int i_5 = rsbitsbuffer_0.readUnsignedByte();
			if ((i_5 & 0x8) != 0) {
				i_5 += rsbitsbuffer_0.readUnsignedByte() << 8;
			}
			if ((i_5 & 0x100) != 0) {
				i_5 += rsbitsbuffer_0.readUnsignedByte() << 16;
			}
			Class282_Sub15_Sub5.decodeMasks(rsbitsbuffer_0, i_3, player_4, i_5);
		}
	}
}