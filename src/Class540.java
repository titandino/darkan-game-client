import java.util.Iterator;

public class Class540 {

	public static int[] anIntArray7136;

	static int anInt7137 = 0;

	static int anInt7135 = 0;

	Class540() throws Throwable {
		throw new Error();
	}

	public static Class282_Sub36 method11595(int i_0) {
		if (Class291_Sub1.aClass482_3459 != null && Class291_Sub1.aClass460_8030 != null) {
			for (Class282_Sub36 class282_sub36_1 = (Class282_Sub36) Class291_Sub1.aClass460_8030.next(); class282_sub36_1 != null; class282_sub36_1 = (Class282_Sub36) Class291_Sub1.aClass460_8030.next()) {
				WorldMapAreaDefs worldmapareadefs_2 = Class291_Sub1.aClass218_3456.getWorldMapDefs(class282_sub36_1.anInt7991, 461119623);
				if (worldmapareadefs_2 != null && worldmapareadefs_2.aBool2742 && worldmapareadefs_2.method3719(Class291_Sub1.anInterface42_3458, 1905436135)) {
					return class282_sub36_1;
				}
			}
			return null;
		} else {
			return null;
		}
	}

	static final void decodeNPCUpdate(boolean bool_0, int i_1) {
		client.anInt7216 = 0;
		client.npcListSize = 0;
		++client.anInt7332;
		Exception_Sub2_Sub2.decodeAddRemove(-1738671867);
		Class459.decodeUpdate(bool_0, 1344849031);
		Class14.decodeMasks();
		boolean bool_2 = false;
		int i_3;
		int i_4;
		for (i_3 = 0; i_3 < client.anInt7216; i_3++) {
			i_4 = client.anIntArray7421[i_3];
			Class282_Sub47 class282_sub47_5 = (Class282_Sub47) client.NPCS.get((long) i_4);
			NPC npc_7 = (NPC) class282_sub47_5.anObject8068;
			if (npc_7.anInt10353 != client.anInt7332) {
				if (Class20.aBool161 && EnumIndexLoader.method7426(i_4, (byte) -86)) {
					Class316.method5594();
				}
				if (npc_7.definitions.method6886(-1089073917)) {
					Class169.method2876(npc_7, 1280406765);
				}
				npc_7.method16166((NPCDefinitions) null, -12061587);
				class282_sub47_5.remove();
				bool_2 = true;
			}
		}
		if (bool_2) {
			i_3 = client.anInt7210;
			client.anInt7210 = client.NPCS.method7748((short) 15812);
			i_4 = 0;
			Class282_Sub47 class282_sub47_9;
			for (Iterator iterator_8 = client.NPCS.iterator(); iterator_8.hasNext(); client.aClass282_Sub47Array7209[i_4++] = class282_sub47_9) {
				class282_sub47_9 = (Class282_Sub47) iterator_8.next();
			}
			for (int i_6 = client.anInt7210; i_6 < i_3; i_6++) {
				client.aClass282_Sub47Array7209[i_6] = null;
			}
		}
		if (client.aClass184_7475.recievedBuffer.index != client.aClass184_7475.currentPacketSize) {
			throw new RuntimeException(client.aClass184_7475.recievedBuffer.index + " " + client.aClass184_7475.currentPacketSize);
		} else {
			for (i_3 = 0; i_3 < client.anInt7211; i_3++) {
				if (client.NPCS.get((long) client.anIntArray7212[i_3]) == null) {
					throw new RuntimeException(i_3 + " " + client.anInt7211);
				}
			}
			if (client.anInt7210 - client.anInt7211 != 0) {
				throw new RuntimeException("" + (client.anInt7210 - client.anInt7211));
			} else {
				for (i_3 = 0; i_3 < client.anInt7210; i_3++) {
					if (((Animable) client.aClass282_Sub47Array7209[i_3].anObject8068).anInt10353 != client.anInt7332) {
						throw new RuntimeException("" + ((Animable) client.aClass282_Sub47Array7209[i_3].anObject8068).anInt10314);
					}
				}
			}
		}
	}
}
