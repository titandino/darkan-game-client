
/* Class517 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;

public final class Class517 {
	static String aString5897;
	static boolean aBool5898;
	static final int anInt5899 = 2000000;
	static int[] anIntArray5900;
	public static SoftCache aClass229_5901;
	static final int anInt5902 = 200000;
	static ArrayList anArrayList5903;
	static int anInt5904 = 0;
	static int anInt5905;
	static int anInt5906;

	static final void method8871(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class388.method6689(class118, class98, class527, 994036944);
	}

	static final void method8872(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 96);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class359.method6244(class118, class98, class527, -1605685660);
	}

	static final CS2Executor method8873() {
		if (788272697 * anInt5905 == anArrayList5903.size())
			anArrayList5903.add(new CS2Executor());
		CS2Executor class527 = (CS2Executor) anArrayList5903.get(anInt5905 * 788272697);
		anInt5905 += 1618802697;
		return class527;
	}

	static final CS2Executor method8874() {
		if (788272697 * anInt5905 == anArrayList5903.size())
			anArrayList5903.add(new CS2Executor());
		CS2Executor class527 = (CS2Executor) anArrayList5903.get(anInt5905 * 788272697);
		anInt5905 += 1618802697;
		return class527;
	}

	static final void method8875(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1361997324) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1400 = Class351.method6193(string, class527, 1185194480);
		class118.aBool1384 = true;
	}

	static final void method8876(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt107 * -1951489731;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -79406355 * Class9.anInt109;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -532543837 * Class9.anInt108;
		Class9.anInt107 = 264209366;
		Class9.anInt109 = -915280613;
		Class9.anInt108 = 691675893;
	}

	public static void method8877(Class282_Sub43 class282_sub43) {
		Class400.method6794(class282_sub43, 200000, (byte) 100);
	}

	public static void method8878(Class282_Sub43 class282_sub43) {
		Class400.method6794(class282_sub43, 200000, (byte) 103);
	}

	static final void method8879(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (-1524615769 * (((NPC) class527.animable).aClass409_10580.anInt4856));
	}

	static final void method8880(CS2Executor class527) {
		Class473.method7886(true, 1516035825);
	}

	public static void method8881(Class118[] class118s) {
		for (int i = 0; i < class118s.length; i++) {
			Class118 class118 = class118s[i];
			if (null != class118.anObjectArray1318) {
				Class282_Sub43 class282_sub43 = new Class282_Sub43();
				class282_sub43.aClass118_8053 = class118;
				class282_sub43.anObjectArray8054 = class118.anObjectArray1318;
				Class400.method6794(class282_sub43, 2000000, (byte) 35);
			}
		}
	}

	static void method8882(Class282_Sub43 class282_sub43, int i) {
		Object[] objects = class282_sub43.anObjectArray8054;
		int i_0_ = ((Integer) objects[0]).intValue();
		CS2Script class282_sub50_sub5 = Class286.method5049(i_0_, -1952711419);
		if (null != class282_sub50_sub5) {
			CS2Executor class527 = Class125.method2167(508408537);
			class527.intLocals = new int[class282_sub50_sub5.intLocalsCount * 693687803];
			int i_1_ = 0;
			class527.objectLocals = new String[class282_sub50_sub5.stringLocalsCount * 1886892247];
			int i_2_ = 0;
			class527.aLongArray6996 = new long[class282_sub50_sub5.longLocalsCount * -684160137];
			int i_3_ = 0;
			for (int i_4_ = 1; i_4_ < objects.length; i_4_++) {
				if (objects[i_4_] instanceof Integer) {
					int i_5_ = ((Integer) objects[i_4_]).intValue();
					if (i_5_ == -2147483647)
						i_5_ = class282_sub43.anInt8059 * 1154494623;
					if (i_5_ == -2147483646)
						i_5_ = 558772889 * class282_sub43.anInt8055;
					if (-2147483645 == i_5_)
						i_5_ = (class282_sub43.aClass118_8053 != null ? (-1952846363 * class282_sub43.aClass118_8053.anInt1287) : -1);
					if (-2147483644 == i_5_)
						i_5_ = class282_sub43.anInt8051 * -1778855835;
					if (-2147483643 == i_5_)
						i_5_ = (class282_sub43.aClass118_8053 != null ? (1924549737 * class282_sub43.aClass118_8053.anInt1288) : -1);
					if (i_5_ == -2147483642)
						i_5_ = (null != class282_sub43.aClass118_8057 ? (class282_sub43.aClass118_8057.anInt1287 * -1952846363) : -1);
					if (-2147483641 == i_5_)
						i_5_ = (null != class282_sub43.aClass118_8057 ? (class282_sub43.aClass118_8057.anInt1288 * 1924549737) : -1);
					if (-2147483640 == i_5_)
						i_5_ = class282_sub43.anInt8058 * 101519687;
					if (-2147483639 == i_5_)
						i_5_ = 505716237 * class282_sub43.anInt8056;
					class527.intLocals[i_1_++] = i_5_;
				} else if (objects[i_4_] instanceof String) {
					String string = (String) objects[i_4_];
					if (string.equals("event_opbase"))
						string = class282_sub43.aString8060;
					class527.objectLocals[i_2_++] = string;
				} else if (objects[i_4_] instanceof Long) {
					long l = ((Long) objects[i_4_]).longValue();
					class527.aLongArray6996[i_3_++] = l;
				}
			}
			class527.anInt7015 = -1709878683 * ((Class282_Sub43) class282_sub43).anInt8061;
			Class51.method1068(class282_sub50_sub5, i, class527, 1629803881);
		}
	}

	static void method8883(Class282_Sub43 class282_sub43, int i) {
		Object[] objects = class282_sub43.anObjectArray8054;
		int i_6_ = ((Integer) objects[0]).intValue();
		CS2Script class282_sub50_sub5 = Class286.method5049(i_6_, -1569662027);
		if (null != class282_sub50_sub5) {
			CS2Executor class527 = Class125.method2167(167597781);
			class527.intLocals = new int[class282_sub50_sub5.intLocalsCount * 693687803];
			int i_7_ = 0;
			class527.objectLocals = new String[class282_sub50_sub5.stringLocalsCount * 1886892247];
			int i_8_ = 0;
			class527.aLongArray6996 = new long[class282_sub50_sub5.longLocalsCount * -684160137];
			int i_9_ = 0;
			for (int i_10_ = 1; i_10_ < objects.length; i_10_++) {
				if (objects[i_10_] instanceof Integer) {
					int i_11_ = ((Integer) objects[i_10_]).intValue();
					if (i_11_ == -2147483647)
						i_11_ = class282_sub43.anInt8059 * 1154494623;
					if (i_11_ == -2147483646)
						i_11_ = 558772889 * class282_sub43.anInt8055;
					if (-2147483645 == i_11_)
						i_11_ = (class282_sub43.aClass118_8053 != null ? (-1952846363 * class282_sub43.aClass118_8053.anInt1287) : -1);
					if (-2147483644 == i_11_)
						i_11_ = class282_sub43.anInt8051 * -1778855835;
					if (-2147483643 == i_11_)
						i_11_ = (class282_sub43.aClass118_8053 != null ? (1924549737 * class282_sub43.aClass118_8053.anInt1288) : -1);
					if (i_11_ == -2147483642)
						i_11_ = (null != class282_sub43.aClass118_8057 ? (class282_sub43.aClass118_8057.anInt1287 * -1952846363) : -1);
					if (-2147483641 == i_11_)
						i_11_ = (null != class282_sub43.aClass118_8057 ? (class282_sub43.aClass118_8057.anInt1288 * 1924549737) : -1);
					if (-2147483640 == i_11_)
						i_11_ = class282_sub43.anInt8058 * 101519687;
					if (-2147483639 == i_11_)
						i_11_ = 505716237 * class282_sub43.anInt8056;
					class527.intLocals[i_7_++] = i_11_;
				} else if (objects[i_10_] instanceof String) {
					String string = (String) objects[i_10_];
					if (string.equals("event_opbase"))
						string = class282_sub43.aString8060;
					class527.objectLocals[i_8_++] = string;
				} else if (objects[i_10_] instanceof Long) {
					long l = ((Long) objects[i_10_]).longValue();
					class527.aLongArray6996[i_9_++] = l;
				}
			}
			class527.anInt7015 = -1709878683 * ((Class282_Sub43) class282_sub43).anInt8061;
			Class51.method1068(class282_sub50_sub5, i, class527, 1049938335);
		}
	}

	static void method8884(Class282_Sub43 class282_sub43, int i) {
		Object[] objects = class282_sub43.anObjectArray8054;
		int i_12_ = ((Integer) objects[0]).intValue();
		CS2Script class282_sub50_sub5 = Class286.method5049(i_12_, -1079936837);
		if (null != class282_sub50_sub5) {
			CS2Executor class527 = Class125.method2167(261236018);
			class527.intLocals = new int[class282_sub50_sub5.intLocalsCount * 693687803];
			int i_13_ = 0;
			class527.objectLocals = new String[class282_sub50_sub5.stringLocalsCount * 1886892247];
			int i_14_ = 0;
			class527.aLongArray6996 = new long[class282_sub50_sub5.longLocalsCount * -684160137];
			int i_15_ = 0;
			for (int i_16_ = 1; i_16_ < objects.length; i_16_++) {
				if (objects[i_16_] instanceof Integer) {
					int i_17_ = ((Integer) objects[i_16_]).intValue();
					if (i_17_ == -2147483647)
						i_17_ = class282_sub43.anInt8059 * 1154494623;
					if (i_17_ == -2147483646)
						i_17_ = 558772889 * class282_sub43.anInt8055;
					if (-2147483645 == i_17_)
						i_17_ = (class282_sub43.aClass118_8053 != null ? (-1952846363 * class282_sub43.aClass118_8053.anInt1287) : -1);
					if (-2147483644 == i_17_)
						i_17_ = class282_sub43.anInt8051 * -1778855835;
					if (-2147483643 == i_17_)
						i_17_ = (class282_sub43.aClass118_8053 != null ? (1924549737 * class282_sub43.aClass118_8053.anInt1288) : -1);
					if (i_17_ == -2147483642)
						i_17_ = (null != class282_sub43.aClass118_8057 ? (class282_sub43.aClass118_8057.anInt1287 * -1952846363) : -1);
					if (-2147483641 == i_17_)
						i_17_ = (null != class282_sub43.aClass118_8057 ? (class282_sub43.aClass118_8057.anInt1288 * 1924549737) : -1);
					if (-2147483640 == i_17_)
						i_17_ = class282_sub43.anInt8058 * 101519687;
					if (-2147483639 == i_17_)
						i_17_ = 505716237 * class282_sub43.anInt8056;
					class527.intLocals[i_13_++] = i_17_;
				} else if (objects[i_16_] instanceof String) {
					String string = (String) objects[i_16_];
					if (string.equals("event_opbase"))
						string = class282_sub43.aString8060;
					class527.objectLocals[i_14_++] = string;
				} else if (objects[i_16_] instanceof Long) {
					long l = ((Long) objects[i_16_]).longValue();
					class527.aLongArray6996[i_15_++] = l;
				}
			}
			class527.anInt7015 = -1709878683 * ((Class282_Sub43) class282_sub43).anInt8061;
			Class51.method1068(class282_sub50_sub5, i, class527, 1116587583);
		}
	}

	static void method8885(Class282_Sub43 class282_sub43, int i) {
		Object[] objects = class282_sub43.anObjectArray8054;
		int i_18_ = ((Integer) objects[0]).intValue();
		CS2Script class282_sub50_sub5 = Class286.method5049(i_18_, -1144040356);
		if (null != class282_sub50_sub5) {
			CS2Executor class527 = Class125.method2167(136981268);
			class527.intLocals = new int[class282_sub50_sub5.intLocalsCount * 693687803];
			int i_19_ = 0;
			class527.objectLocals = new String[class282_sub50_sub5.stringLocalsCount * 1886892247];
			int i_20_ = 0;
			class527.aLongArray6996 = new long[class282_sub50_sub5.longLocalsCount * -684160137];
			int i_21_ = 0;
			for (int i_22_ = 1; i_22_ < objects.length; i_22_++) {
				if (objects[i_22_] instanceof Integer) {
					int i_23_ = ((Integer) objects[i_22_]).intValue();
					if (i_23_ == -2147483647)
						i_23_ = class282_sub43.anInt8059 * 1154494623;
					if (i_23_ == -2147483646)
						i_23_ = 558772889 * class282_sub43.anInt8055;
					if (-2147483645 == i_23_)
						i_23_ = (class282_sub43.aClass118_8053 != null ? (-1952846363 * class282_sub43.aClass118_8053.anInt1287) : -1);
					if (-2147483644 == i_23_)
						i_23_ = class282_sub43.anInt8051 * -1778855835;
					if (-2147483643 == i_23_)
						i_23_ = (class282_sub43.aClass118_8053 != null ? (1924549737 * class282_sub43.aClass118_8053.anInt1288) : -1);
					if (i_23_ == -2147483642)
						i_23_ = (null != class282_sub43.aClass118_8057 ? (class282_sub43.aClass118_8057.anInt1287 * -1952846363) : -1);
					if (-2147483641 == i_23_)
						i_23_ = (null != class282_sub43.aClass118_8057 ? (class282_sub43.aClass118_8057.anInt1288 * 1924549737) : -1);
					if (-2147483640 == i_23_)
						i_23_ = class282_sub43.anInt8058 * 101519687;
					if (-2147483639 == i_23_)
						i_23_ = 505716237 * class282_sub43.anInt8056;
					class527.intLocals[i_19_++] = i_23_;
				} else if (objects[i_22_] instanceof String) {
					String string = (String) objects[i_22_];
					if (string.equals("event_opbase"))
						string = class282_sub43.aString8060;
					class527.objectLocals[i_20_++] = string;
				} else if (objects[i_22_] instanceof Long) {
					long l = ((Long) objects[i_22_]).longValue();
					class527.aLongArray6996[i_21_++] = l;
				}
			}
			class527.anInt7015 = -1709878683 * ((Class282_Sub43) class282_sub43).anInt8061;
			Class51.method1068(class282_sub50_sub5, i, class527, -779218183);
		}
	}

	static final void method8886(CS2Executor class527) {
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1282175089);
		if (null != class282_sub50_sub6) {
			boolean bool = (class282_sub50_sub6.method14775(Class291.anInt3472 + Class427.anInt5123 * -861975801, Class291.anInt3473 + Class475.anInt5624 * 483850921, anIntArray5900, 102845678));
			if (bool) {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[1];
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[2];
			} else {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}

	static final void method8887(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 104);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1334 * 539377845;
	}

	public static void method8888(Class397 class397, int i, int i_24_, Animable class521_sub1_sub1_sub2, int i_25_) {
		CS2Executor class527 = Class125.method2167(-1233889458);
		class527.animable = class521_sub1_sub1_sub2;
		class527.anInt7004 = 2000547059 * i_25_;
		Class107.method1834(class397, i, i_24_, class527, (byte) 75);
		class527.animable = null;
		class527.anInt7004 = -2000547059;
	}

	public static void method8889(Class397 class397, int i, int i_26_, Animable class521_sub1_sub1_sub2, int i_27_) {
		CS2Executor class527 = Class125.method2167(1871393828);
		class527.animable = class521_sub1_sub1_sub2;
		class527.anInt7004 = 2000547059 * i_27_;
		Class107.method1834(class397, i, i_26_, class527, (byte) 38);
		class527.animable = null;
		class527.anInt7004 = -2000547059;
	}

	public static void method8890(Class397 class397, int i, int i_28_, Animable class521_sub1_sub1_sub2, int i_29_) {
		CS2Executor class527 = Class125.method2167(1177339887);
		class527.animable = class521_sub1_sub1_sub2;
		class527.anInt7004 = 2000547059 * i_29_;
		Class107.method1834(class397, i, i_28_, class527, (byte) 114);
		class527.animable = null;
		class527.anInt7004 = -2000547059;
	}

	static final void method8891(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7300 * 550395357;
	}

	public static void method8892(Class397 class397, int i, int i_30_, Interface12 interface12) {
		CS2Executor class527 = Class125.method2167(872338188);
		class527.anInterface12_7013 = interface12;
		Class107.method1834(class397, i, i_30_, class527, (byte) 17);
		class527.anInterface12_7013 = null;
	}

	public static void method8893(Class397 class397, int i, int i_31_, Interface12 interface12) {
		CS2Executor class527 = Class125.method2167(659348090);
		class527.anInterface12_7013 = interface12;
		Class107.method1834(class397, i, i_31_, class527, (byte) 68);
		class527.anInterface12_7013 = null;
	}

	static final void method8894(CS2Executor class527) {
		Class118 class118 = (class527.animable.aClass98_10324.method1618((class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), (byte) 12));
		class118.aClass118Array1438 = null;
		class118.aClass118Array1439 = null;
		Class109.method1858(class118, (byte) 31);
	}

	public static void method8895(Class397 class397, int i, int i_32_, Interface12 interface12) {
		CS2Executor class527 = Class125.method2167(-1071506799);
		class527.anInterface12_7013 = interface12;
		Class107.method1834(class397, i, i_32_, class527, (byte) 43);
		class527.anInterface12_7013 = null;
	}

	public static void method8896(Class397 class397, int i, int i_33_, Class520 class520, Class521_Sub1_Sub2_Sub1 class521_sub1_sub2_sub1) {
		CS2Executor class527 = Class125.method2167(2061522496);
		class527.aClass521_Sub1_Sub2_Sub1_7014 = class521_sub1_sub2_sub1;
		Class107.method1834(class397, i, i_33_, class527, (byte) 18);
		class527.aClass521_Sub1_Sub2_Sub1_7014 = null;
	}

	public static void method8897(Class397 class397, int i, int i_34_) {
		CS2Executor class527 = Class125.method2167(454353022);
		Class107.method1834(class397, i, i_34_, class527, (byte) 21);
	}

	static final void method8898(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_35_ = -1;
		if (null != class108)
			i_35_ = class108.anInt1092 * 1608788053;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_35_;
	}

	static void method8899(Class397 class397, int i, int i_36_, CS2Executor class527) {
		CS2Script class282_sub50_sub5 = Class225_Sub1.method12792(class397, i, i_36_, 856735933);
		if (null == class282_sub50_sub5)
			Class282_Sub50_Sub17.method15509(1950456482);
		else {
			class527.intLocals = new int[class282_sub50_sub5.intLocalsCount * 693687803];
			class527.objectLocals = new Object[1886892247 * class282_sub50_sub5.stringLocalsCount];
			if (Class397.aClass397_4797 == class282_sub50_sub5.aClass397_9527 || (Class397.aClass397_4805 == class282_sub50_sub5.aClass397_9527) || (Class397.aClass397_4798 == class282_sub50_sub5.aClass397_9527)) {
				int i_37_ = 0;
				int i_38_ = 0;
				if (Class282_Sub20_Sub24.aClass118_9884 != null) {
					i_37_ = (597157617 * Class282_Sub20_Sub24.aClass118_9884.anInt1299);
					i_38_ = (198275475 * Class282_Sub20_Sub24.aClass118_9884.anInt1428);
				}
				class527.intLocals[0] = Class163.aClass209_2031.method3569(2032400823) - i_37_;
				class527.intLocals[1] = Class163.aClass209_2031.method3570(756095591) - i_38_;
			} else if (Class397.aClass397_4806 == class282_sub50_sub5.aClass397_9527)
				class527.intLocals[0] = class527.anInt7004 * -945484741;
			Class51.method1068(class282_sub50_sub5, 200000, class527, 1580120110);
		}
	}

	static final void method8900(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte626;
	}

	static final void method8901(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 85);
		Class96_Sub22.method14680(class118, class527, 1075493594);
	}

	static final void method8902(CS2Executor class527) {
		if (!JS5CacheFile.method3360((byte) -50))
			JS5StandardRequester.method5558(-500941691);
	}

	static void method8903(CS2Script class282_sub50_sub5, int i, CS2Executor class527) {
		class527.anInt7012 = 0;
		class527.anInt7000 = 0;
		class527.instrPtr = 1051529003;
		class527.current = class282_sub50_sub5;
		class527.operations = (class527.current.operations);
		class527.unknown = class527.current.intOpValues;
		CS2OpInfo class522 = null;
		class527.anInt7002 = 0;
		try {
			try {
				anInt5904 = 0;
				for (;;) {
					anInt5904 += -1084131875;
					if (anInt5904 * -1176728971 > i)
						throw new RuntimeException("");
					class522 = (class527.operations[(class527.instrPtr += -1051529003) * 301123709]);
					if (aBool5898 && (null == aString5897 || (((class527.current.scriptName) != null) && class527.current.scriptName.indexOf(aString5897) != -1)))
						System.out.println(new StringBuilder().append(class527.current.scriptName).append(": ").append(class522).toString());
					if (1 == (class527.unknown[301123709 * class527.instrPtr]))
						class527.aBool7022 = true;
					else
						class527.aBool7022 = false;
					if (CS2OpInfo.aClass522_5959 == class522 && 0 == (class527.anInt7002 * -1837903909)) {
						Class282_Sub50_Sub17.method15509(791279819);
						break;
					}
					Class174.executeOperation(class522, class527, 626920185);
				}
			} catch (Exception exception) {
				StringBuilder stringbuilder = new StringBuilder(30);
				stringbuilder.append("").append(-3442165056282524525L * (class527.current.data)).append(" ");
				for (int i_39_ = class527.anInt7002 * -1837903909 - 1; i_39_ >= 0; i_39_--)
					stringbuilder.append("").append(-3442165056282524525L * (((Class509) class527.aClass509Array7016[i_39_]).aClass282_Sub50_Sub5_5869.data)).append(" ");
				stringbuilder.append("").append(Integer.valueOf(-2026890351 * class522.opcode));
				Class151.method2594(stringbuilder.toString(), exception, (byte) -14);
				Class282_Sub50_Sub17.method15509(1650861128);
			}
		} catch (Exception object) {
			Class282_Sub50_Sub17.method15509(1674899658);
			//throw object;
		}
	}

	static void method8904(Class98 class98, int i, int i_40_, int i_41_, boolean bool, CS2Executor class527) {
		if (0 == i_40_)
			throw new RuntimeException();
		Class118 class118 = class98.aClass118Array998[i];
		if (class118.aClass118Array1438 == null) {
			class118.aClass118Array1438 = new Class118[1 + i_41_];
			class118.aClass118Array1439 = class118.aClass118Array1438;
		}
		if (class118.aClass118Array1438.length <= i_41_) {
			if (class118.aClass118Array1438 == class118.aClass118Array1439) {
				Class118[] class118s = new Class118[i_41_ + 1];
				for (int i_42_ = 0; i_42_ < class118.aClass118Array1438.length; i_42_++)
					class118s[i_42_] = class118.aClass118Array1438[i_42_];
				class118.aClass118Array1438 = class118.aClass118Array1439 = class118s;
			} else {
				Class118[] class118s = new Class118[i_41_ + 1];
				Class118[] class118s_43_ = new Class118[i_41_ + 1];
				for (int i_44_ = 0; i_44_ < class118.aClass118Array1438.length; i_44_++) {
					class118s[i_44_] = class118.aClass118Array1438[i_44_];
					class118s_43_[i_44_] = class118.aClass118Array1439[i_44_];
				}
				class118.aClass118Array1438 = class118s;
				class118.aClass118Array1439 = class118s_43_;
			}
		}
		if (i_41_ > 0 && class118.aClass118Array1438[i_41_ - 1] == null)
			throw new RuntimeException(new StringBuilder().append("").append(i_41_ - 1).toString());
		Class118 class118_45_ = new Class118();
		class118_45_.anInt1268 = i_40_ * 720825663;
		class118_45_.anInt1305 = (class118_45_.anInt1287 = 1 * class118.anInt1287) * 1571006651;
		class118_45_.anInt1288 = -646708263 * i_41_;
		class118.aClass118Array1438[i_41_] = class118_45_;
		if (class118.aClass118Array1438 != class118.aClass118Array1439)
			class118.aClass118Array1439[i_41_] = class118_45_;
		UnderlayDefinition class513;
		if (bool)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		((UnderlayDefinition) class513).aClass98_5885 = class98;
		((UnderlayDefinition) class513).aClass118_5886 = class118_45_;
		Class109.method1858(class118, (byte) -58);
	}

	static void method8905(Class98 class98, int i, int i_46_, int i_47_, boolean bool, CS2Executor class527) {
		if (0 == i_46_)
			throw new RuntimeException();
		Class118 class118 = class98.aClass118Array998[i];
		if (class118.aClass118Array1438 == null) {
			class118.aClass118Array1438 = new Class118[1 + i_47_];
			class118.aClass118Array1439 = class118.aClass118Array1438;
		}
		if (class118.aClass118Array1438.length <= i_47_) {
			if (class118.aClass118Array1438 == class118.aClass118Array1439) {
				Class118[] class118s = new Class118[i_47_ + 1];
				for (int i_48_ = 0; i_48_ < class118.aClass118Array1438.length; i_48_++)
					class118s[i_48_] = class118.aClass118Array1438[i_48_];
				class118.aClass118Array1438 = class118.aClass118Array1439 = class118s;
			} else {
				Class118[] class118s = new Class118[i_47_ + 1];
				Class118[] class118s_49_ = new Class118[i_47_ + 1];
				for (int i_50_ = 0; i_50_ < class118.aClass118Array1438.length; i_50_++) {
					class118s[i_50_] = class118.aClass118Array1438[i_50_];
					class118s_49_[i_50_] = class118.aClass118Array1439[i_50_];
				}
				class118.aClass118Array1438 = class118s;
				class118.aClass118Array1439 = class118s_49_;
			}
		}
		if (i_47_ > 0 && class118.aClass118Array1438[i_47_ - 1] == null)
			throw new RuntimeException(new StringBuilder().append("").append(i_47_ - 1).toString());
		Class118 class118_51_ = new Class118();
		class118_51_.anInt1268 = i_46_ * 720825663;
		class118_51_.anInt1305 = (class118_51_.anInt1287 = 1 * class118.anInt1287) * 1571006651;
		class118_51_.anInt1288 = -646708263 * i_47_;
		class118.aClass118Array1438[i_47_] = class118_51_;
		if (class118.aClass118Array1438 != class118.aClass118Array1439)
			class118.aClass118Array1439[i_47_] = class118_51_;
		UnderlayDefinition class513;
		if (bool)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		((UnderlayDefinition) class513).aClass98_5885 = class98;
		((UnderlayDefinition) class513).aClass118_5886 = class118_51_;
		Class109.method1858(class118, (byte) -18);
	}

	static final void method8906(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		if (class118.aString1369 == null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class118.aString1369;
	}

	static void method8907(Class98 class98, int i, int i_52_, int i_53_, boolean bool, CS2Executor class527) {
		if (0 == i_52_)
			throw new RuntimeException();
		Class118 class118 = class98.aClass118Array998[i];
		if (class118.aClass118Array1438 == null) {
			class118.aClass118Array1438 = new Class118[1 + i_53_];
			class118.aClass118Array1439 = class118.aClass118Array1438;
		}
		if (class118.aClass118Array1438.length <= i_53_) {
			if (class118.aClass118Array1438 == class118.aClass118Array1439) {
				Class118[] class118s = new Class118[i_53_ + 1];
				for (int i_54_ = 0; i_54_ < class118.aClass118Array1438.length; i_54_++)
					class118s[i_54_] = class118.aClass118Array1438[i_54_];
				class118.aClass118Array1438 = class118.aClass118Array1439 = class118s;
			} else {
				Class118[] class118s = new Class118[i_53_ + 1];
				Class118[] class118s_55_ = new Class118[i_53_ + 1];
				for (int i_56_ = 0; i_56_ < class118.aClass118Array1438.length; i_56_++) {
					class118s[i_56_] = class118.aClass118Array1438[i_56_];
					class118s_55_[i_56_] = class118.aClass118Array1439[i_56_];
				}
				class118.aClass118Array1438 = class118s;
				class118.aClass118Array1439 = class118s_55_;
			}
		}
		if (i_53_ > 0 && class118.aClass118Array1438[i_53_ - 1] == null)
			throw new RuntimeException(new StringBuilder().append("").append(i_53_ - 1).toString());
		Class118 class118_57_ = new Class118();
		class118_57_.anInt1268 = i_52_ * 720825663;
		class118_57_.anInt1305 = (class118_57_.anInt1287 = 1 * class118.anInt1287) * 1571006651;
		class118_57_.anInt1288 = -646708263 * i_53_;
		class118.aClass118Array1438[i_53_] = class118_57_;
		if (class118.aClass118Array1438 != class118.aClass118Array1439)
			class118.aClass118Array1439[i_53_] = class118_57_;
		UnderlayDefinition class513;
		if (bool)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		((UnderlayDefinition) class513).aClass98_5885 = class98;
		((UnderlayDefinition) class513).aClass118_5886 = class118_57_;
		Class109.method1858(class118, (byte) -42);
	}

	static void method8908(Class98 class98, int i, int i_58_, int i_59_, boolean bool, CS2Executor class527) {
		if (0 == i_58_)
			throw new RuntimeException();
		Class118 class118 = class98.aClass118Array998[i];
		if (class118.aClass118Array1438 == null) {
			class118.aClass118Array1438 = new Class118[1 + i_59_];
			class118.aClass118Array1439 = class118.aClass118Array1438;
		}
		if (class118.aClass118Array1438.length <= i_59_) {
			if (class118.aClass118Array1438 == class118.aClass118Array1439) {
				Class118[] class118s = new Class118[i_59_ + 1];
				for (int i_60_ = 0; i_60_ < class118.aClass118Array1438.length; i_60_++)
					class118s[i_60_] = class118.aClass118Array1438[i_60_];
				class118.aClass118Array1438 = class118.aClass118Array1439 = class118s;
			} else {
				Class118[] class118s = new Class118[i_59_ + 1];
				Class118[] class118s_61_ = new Class118[i_59_ + 1];
				for (int i_62_ = 0; i_62_ < class118.aClass118Array1438.length; i_62_++) {
					class118s[i_62_] = class118.aClass118Array1438[i_62_];
					class118s_61_[i_62_] = class118.aClass118Array1439[i_62_];
				}
				class118.aClass118Array1438 = class118s;
				class118.aClass118Array1439 = class118s_61_;
			}
		}
		if (i_59_ > 0 && class118.aClass118Array1438[i_59_ - 1] == null)
			throw new RuntimeException(new StringBuilder().append("").append(i_59_ - 1).toString());
		Class118 class118_63_ = new Class118();
		class118_63_.anInt1268 = i_58_ * 720825663;
		class118_63_.anInt1305 = (class118_63_.anInt1287 = 1 * class118.anInt1287) * 1571006651;
		class118_63_.anInt1288 = -646708263 * i_59_;
		class118.aClass118Array1438[i_59_] = class118_63_;
		if (class118.aClass118Array1438 != class118.aClass118Array1439)
			class118.aClass118Array1439[i_59_] = class118_63_;
		UnderlayDefinition class513;
		if (bool)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		((UnderlayDefinition) class513).aClass98_5885 = class98;
		((UnderlayDefinition) class513).aClass118_5886 = class118_63_;
		Class109.method1858(class118, (byte) -16);
	}

	static void method8909(Class98 class98, Class118 class118) {
		if (null != class118) {
			if (class118.anInt1288 * 1924549737 != -1) {
				Class118 class118_64_ = (class98.aClass118Array998[class118.anInt1305 * 2110532063 & 0xffff]);
				if (null != class118_64_) {
					if (class118_64_.aClass118Array1438 == class118_64_.aClass118Array1439) {
						class118_64_.aClass118Array1439 = (new Class118[class118_64_.aClass118Array1438.length]);
						class118_64_.aClass118Array1439[0] = class118;
						Class503.method8359(class118_64_.aClass118Array1438, 0, class118_64_.aClass118Array1439, 1, 1924549737 * class118.anInt1288);
						Class503.method8359(class118_64_.aClass118Array1438, 1 + 1924549737 * class118.anInt1288, class118_64_.aClass118Array1439, 1924549737 * class118.anInt1288 + 1, (class118_64_.aClass118Array1438.length - 1924549737 * class118.anInt1288 - 1));
					} else {
						int i = 0;
						Class118[] class118s;
						for (class118s = class118_64_.aClass118Array1439; i < class118s.length && class118s[i] != class118; i++) {
							/* empty */
						}
						if (i < class118s.length) {
							Class503.method8359(class118s, 0, class118s, 1, i);
							class118s[0] = class118;
						}
					}
				}
			} else {
				Class118[] class118s = class98.method1617(-996055932);
				int i;
				for (i = 0; i < class118s.length && class118 != class118s[i]; i++) {
					/* empty */
				}
				if (i < class118s.length) {
					Class503.method8359(class118s, 0, class118s, 1, i);
					class118s[0] = class118;
				}
			}
		}
	}

	static void method8910(Class98 class98, Class118 class118) {
		if (null != class118) {
			if (class118.anInt1288 * 1924549737 != -1) {
				Class118 class118_65_ = (class98.aClass118Array998[class118.anInt1305 * 2110532063 & 0xffff]);
				if (null != class118_65_) {
					if (class118_65_.aClass118Array1438 == class118_65_.aClass118Array1439) {
						class118_65_.aClass118Array1439 = (new Class118[class118_65_.aClass118Array1438.length]);
						class118_65_.aClass118Array1439[0] = class118;
						Class503.method8359(class118_65_.aClass118Array1438, 0, class118_65_.aClass118Array1439, 1, 1924549737 * class118.anInt1288);
						Class503.method8359(class118_65_.aClass118Array1438, 1 + 1924549737 * class118.anInt1288, class118_65_.aClass118Array1439, 1924549737 * class118.anInt1288 + 1, (class118_65_.aClass118Array1438.length - 1924549737 * class118.anInt1288 - 1));
					} else {
						int i = 0;
						Class118[] class118s;
						for (class118s = class118_65_.aClass118Array1439; i < class118s.length && class118s[i] != class118; i++) {
							/* empty */
						}
						if (i < class118s.length) {
							Class503.method8359(class118s, 0, class118s, 1, i);
							class118s[0] = class118;
						}
					}
				}
			} else {
				Class118[] class118s = class98.method1617(-1612944782);
				int i;
				for (i = 0; i < class118s.length && class118 != class118s[i]; i++) {
					/* empty */
				}
				if (i < class118s.length) {
					Class503.method8359(class118s, 0, class118s, 1, i);
					class118s[0] = class118;
				}
			}
		}
	}

	static final void method8911(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_66_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (i >= 0 && i < 2)
			client.anIntArrayArrayArray7302[i] = new int[i_66_ << 1][4];
	}

	static final void method8912(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		Class533.method11404((String) (class527.objectStack[(1806726141 * class527.anInt7000)]), (String) (class527.objectStack[1 + (class527.anInt7000 * 1806726141)]), "", (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]) == 1, false, -94301647);
	}

	static void method8913(String string, String string_67_, String string_68_, boolean bool, boolean bool_69_) {
		Class184 class184 = Class468_Sub20.method12807(1347300953);
		if (class184.method3053((byte) -77) != null) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4543, class184.aClass432_2283, 479468903);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((Class108.method1846(string, -344035247) + Class108.method1846(string_67_, -1161846577) + Class108.method1846(string_68_, -1718602108) + 1), 1417031095);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_67_);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_68_);
			int i = 0;
			if (bool)
				i |= 0x1;
			if (bool_69_)
				i |= 0x2;
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			class184.method3049(class282_sub23, -224724586);
		}
	}

	static void method8914(String string, String string_70_, String string_71_, boolean bool, boolean bool_72_) {
		Class184 class184 = Class468_Sub20.method12807(2098168322);
		if (class184.method3053((byte) -126) != null) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4543, class184.aClass432_2283, -626752276);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((Class108.method1846(string, -1180370491) + Class108.method1846(string_70_, 173255980) + Class108.method1846(string_71_, -130472330) + 1), 1417031095);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_70_);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_71_);
			int i = 0;
			if (bool)
				i |= 0x1;
			if (bool_72_)
				i |= 0x2;
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			class184.method3049(class282_sub23, -846960543);
		}
	}

	static final void method8915(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.unknown[class527.instrPtr * 301123709]);
	}

	public static void method8916(int i, String string, int i_73_) {
		CS2Script class282_sub50_sub5 = Class225_Sub1.method12792(Class397.aClass397_4792, i, -1, 856735933);
		if (null != class282_sub50_sub5) {
			CS2Executor class527 = Class125.method2167(-847406374);
			class527.intLocals = new int[class282_sub50_sub5.intLocalsCount * 693687803];
			class527.objectLocals = new String[1886892247 * class282_sub50_sub5.stringLocalsCount];
			class527.objectLocals[0] = string;
			class527.intLocals[0] = i_73_;
			Class51.method1068(class282_sub50_sub5, 200000, class527, 1988626944);
		}
	}

	static final void method8917(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Class158_Sub1.aClass3_8507.method266(i, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 469194126);
	}

	static final void method8918(CS2Executor class527) {
		Class217_Sub1 class217_sub1 = IsaacCipher.method7266(-491115638);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = null == class217_sub1 ? 0 : 1203083985 * class217_sub1.anInt2700;
	}

	static final void method8919(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (class527.current.stringOpValues[class527.instrPtr * 301123709]);
	}

	static final void method8920(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_74_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_75_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(3, i << 16 | i_74_, i_75_, "", (byte) 29);
	}

	static final void method8921(CS2Executor class527) {
		class527.animable.method15813((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 127);
	}

	static final void method8922(CS2Executor class527) {
		class527.instrPtr += (class527.unknown[class527.instrPtr * 301123709]) * -1051529003;
	}

	static final void method8923(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12964((byte) 74) ? 1 : 0;
	}

	static final void method8924(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte627;
	}

	static final void method8925(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[1942118537 * class527.anInt7012 + 1]) != (class527.intStack[1942118537 * class527.anInt7012]))
			class527.instrPtr += ((class527.unknown[class527.instrPtr * 301123709]) * -1051529003);
	}

	static final void method8926(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[class527.anInt7012 * 1942118537]) == (class527.intStack[1 + class527.anInt7012 * 1942118537]))
			class527.instrPtr += (-1051529003 * (class527.unknown[class527.instrPtr * 301123709]));
	}

	static final void method8927(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub11.method12209(class118, class98, class527, 1467575804);
	}

	static final void method8928(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class185.method3078(class118, class98, class527, 1422493191);
	}

	static final void method8929(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class16.method567(string, true, (byte) 6);
	}

	static final void method8930(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method502(class118, class98, class527, -1380512648);
	}

	static final void method8931(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[1942118537 * class527.anInt7012]) < (class527.intStack[1942118537 * class527.anInt7012 + 1]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method8932(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[1942118537 * class527.anInt7012]) < (class527.intStack[1942118537 * class527.anInt7012 + 1]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method8933(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[class527.anInt7012 * 1942118537]) > (class527.intStack[1 + 1942118537 * class527.anInt7012]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method8934(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[class527.anInt7012 * 1942118537]) > (class527.intStack[1 + 1942118537 * class527.anInt7012]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method8935(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((Player) class527.animable).aClass155_10561.method2626(i, (byte) 101);
	}

	static final void method8936(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((Player) class527.animable).aClass155_10561.method2627(i, -1809156862);
	}

	static final void method8937(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((Player) class527.animable).aClass155_10561.method2627(i, -912658178);
	}

	static final void method8938(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((NPC) class527.animable).aClass153_10579.method2609(i, (byte) 111);
	}

	static final void method8939(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((NPC) class527.animable).aClass153_10579.method2609(i, (byte) 101);
	}

	static final void method8940(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((NPC) class527.animable).aClass153_10579.method2610(i, (short) 10745);
	}

	static final void method8941(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7316 ? 1 : 0;
	}

	static final void method8942(CS2Executor class527) {
		if (-1837903909 * class527.anInt7002 != 0) {
			Class509 class509 = (class527.aClass509Array7016[(class527.anInt7002 -= -72641453) * -1837903909]);
			class527.current = ((Class509) class509).aClass282_Sub50_Sub5_5869;
			class527.operations = (class527.current.operations);
			class527.unknown = (class527.current.intOpValues);
			class527.instrPtr = ((Class509) class509).anInt5866 * -390085499;
			class527.intLocals = ((Class509) class509).anIntArray5867;
			class527.objectLocals = ((Class509) class509).anObjectArray5865;
			class527.aLongArray6996 = ((Class509) class509).aLongArray5868;
		}
	}

	static final void method8943(CS2Executor class527) {
		if (-1837903909 * class527.anInt7002 != 0) {
			Class509 class509 = (class527.aClass509Array7016[(class527.anInt7002 -= -72641453) * -1837903909]);
			class527.current = ((Class509) class509).aClass282_Sub50_Sub5_5869;
			class527.operations = (class527.current.operations);
			class527.unknown = (class527.current.intOpValues);
			class527.instrPtr = ((Class509) class509).anInt5866 * -390085499;
			class527.intLocals = ((Class509) class509).anIntArray5867;
			class527.objectLocals = ((Class509) class509).anObjectArray5865;
			class527.aLongArray6996 = ((Class509) class509).aLongArray5868;
		}
	}

	static final void method8944(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class158_Sub1.aClass3_8507.method241(i, -1590932880);
	}

	static final void method8945(Class118 class118, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = ((class527.intStack[1942118537 * class527.anInt7012]) - 1);
		int i_76_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (i < 0 || i > 9)
			throw new RuntimeException();
		Class274.method4883(class118, i, i_76_, class527, -838566564);
	}

	static final void method8946(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		Class158_Sub1.aClass3_8507.method280(i, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 87484292);
	}

	static final void method8947(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870);
	}

	static final void method8948(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		Class158_Sub1.aClass3_8507.method280(i, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -273743793);
	}

	static final void method8949(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 106);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class290.method5121(class118, class98, class527, (byte) 7);
	}

	static final void method8950(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[class527.anInt7012 * 1942118537]) <= (class527.intStack[class527.anInt7012 * 1942118537 + 1]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method8951(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[1942118537 * class527.anInt7012]) >= (class527.intStack[1 + 1942118537 * class527.anInt7012]))
			class527.instrPtr += ((class527.unknown[class527.instrPtr * 301123709]) * -1051529003);
	}

	static final void method8952(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.intLocals[(class527.unknown[class527.instrPtr * 301123709])]);
	}

	static final void method8953(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != -1)
			Class123.method2152(i, 844934186);
	}

	static final void method8954(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 5);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1423 * -169127141;
	}

	static final void method8955(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (class527.objectLocals[(class527.unknown[class527.instrPtr * 301123709])]);
	}

	static final void method8956(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (class527.objectLocals[(class527.unknown[class527.instrPtr * 301123709])]);
	}

	static final void method8957(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (class527.objectLocals[(class527.unknown[class527.instrPtr * 301123709])]);
	}

	static final void method8958(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (class527.objectLocals[(class527.unknown[class527.instrPtr * 301123709])]);
	}

	static final void method8959(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 64);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -56249735 * class118.anInt1426;
	}

	static final void method8960(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		class527.anInt7000 -= i * 1476624725;
		String string = Class377.method6398(class527.objectStack, 1806726141 * class527.anInt7000, i, 1971314333);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method8961(CS2Executor class527) {
		class527.anInt7012 -= 141891001;
	}

	static final void method8962(CS2Executor class527) {
		class527.anInt7000 -= 1476624725;
	}

	static final void method8963(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class290.method5121(class118, class98, class527, (byte) 7);
	}

	static final void method8964(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		CS2Script class282_sub50_sub5 = Class286.method5049(i, -1579652967);
		if (class282_sub50_sub5 == null)
			throw new RuntimeException();
		int[] is = new int[693687803 * class282_sub50_sub5.intLocalsCount];
		Object[] objects = new Object[1886892247 * class282_sub50_sub5.stringLocalsCount];
		long[] ls = new long[-684160137 * class282_sub50_sub5.longLocalsCount];
		for (int i_77_ = 0; i_77_ < -1312392163 * class282_sub50_sub5.intArgsCount; i_77_++)
			is[i_77_] = (class527.intStack[i_77_ + (class527.anInt7012 * 1942118537 - class282_sub50_sub5.intArgsCount * -1312392163)]);
		for (int i_78_ = 0; i_78_ < class282_sub50_sub5.stringArgsCount * 1570560503; i_78_++)
			objects[i_78_] = (class527.objectStack[i_78_ + (1806726141 * class527.anInt7000 - 1570560503 * class282_sub50_sub5.stringArgsCount)]);
		for (int i_79_ = 0; i_79_ < -2105377515 * class282_sub50_sub5.longArgsCount; i_79_++)
			ls[i_79_] = (class527.aLongArray7003[i_79_ + (1820448321 * class527.anInt7001 - -2105377515 * class282_sub50_sub5.longArgsCount)]);
		class527.anInt7012 -= 1642009077 * class282_sub50_sub5.intArgsCount;
		class527.anInt7000 -= class282_sub50_sub5.stringArgsCount * -1798384125;
		class527.anInt7001 -= class282_sub50_sub5.longArgsCount * -1483277867;
		Class509 class509 = new Class509();
		((Class509) class509).aClass282_Sub50_Sub5_5869 = class527.current;
		((Class509) class509).anInt5866 = class527.instrPtr * 2054263885;
		((Class509) class509).anIntArray5867 = class527.intLocals;
		((Class509) class509).anObjectArray5865 = class527.objectLocals;
		((Class509) class509).aLongArray5868 = class527.aLongArray6996;
		if (class527.anInt7002 * -1837903909 >= class527.aClass509Array7016.length)
			throw new RuntimeException();
		class527.aClass509Array7016[(class527.anInt7002 += -72641453) * -1837903909 - 1] = class509;
		class527.current = class282_sub50_sub5;
		class527.operations = (class527.current.operations);
		class527.unknown = class527.current.intOpValues;
		class527.instrPtr = 1051529003;
		class527.intLocals = is;
		class527.objectLocals = objects;
		class527.aLongArray6996 = ls;
	}

	static final void method8965(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		CS2Script class282_sub50_sub5 = Class286.method5049(i, -625863862);
		if (class282_sub50_sub5 == null)
			throw new RuntimeException();
		int[] is = new int[693687803 * class282_sub50_sub5.intLocalsCount];
		Object[] objects = new Object[1886892247 * class282_sub50_sub5.stringLocalsCount];
		long[] ls = new long[-684160137 * class282_sub50_sub5.longLocalsCount];
		for (int i_80_ = 0; i_80_ < -1312392163 * class282_sub50_sub5.intArgsCount; i_80_++)
			is[i_80_] = (class527.intStack[i_80_ + (class527.anInt7012 * 1942118537 - class282_sub50_sub5.intArgsCount * -1312392163)]);
		for (int i_81_ = 0; i_81_ < class282_sub50_sub5.stringArgsCount * 1570560503; i_81_++)
			objects[i_81_] = (class527.objectStack[i_81_ + (1806726141 * class527.anInt7000 - 1570560503 * class282_sub50_sub5.stringArgsCount)]);
		for (int i_82_ = 0; i_82_ < -2105377515 * class282_sub50_sub5.longArgsCount; i_82_++)
			ls[i_82_] = (class527.aLongArray7003[i_82_ + (1820448321 * class527.anInt7001 - -2105377515 * class282_sub50_sub5.longArgsCount)]);
		class527.anInt7012 -= 1642009077 * class282_sub50_sub5.intArgsCount;
		class527.anInt7000 -= class282_sub50_sub5.stringArgsCount * -1798384125;
		class527.anInt7001 -= class282_sub50_sub5.longArgsCount * -1483277867;
		Class509 class509 = new Class509();
		((Class509) class509).aClass282_Sub50_Sub5_5869 = class527.current;
		((Class509) class509).anInt5866 = class527.instrPtr * 2054263885;
		((Class509) class509).anIntArray5867 = class527.intLocals;
		((Class509) class509).anObjectArray5865 = class527.objectLocals;
		((Class509) class509).aLongArray5868 = class527.aLongArray6996;
		if (class527.anInt7002 * -1837903909 >= class527.aClass509Array7016.length)
			throw new RuntimeException();
		class527.aClass509Array7016[(class527.anInt7002 += -72641453) * -1837903909 - 1] = class509;
		class527.current = class282_sub50_sub5;
		class527.operations = (class527.current.operations);
		class527.unknown = class527.current.intOpValues;
		class527.instrPtr = 1051529003;
		class527.intLocals = is;
		class527.objectLocals = objects;
		class527.aLongArray6996 = ls;
	}

	static final void method8966(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class320.anIntArray3724[(class527.unknown[301123709 * class527.instrPtr])]);
	}

	static final void method8967(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		class118.anInt1295 = 1302798223 * (class527.intStack[class527.anInt7012 * 1942118537]);
		class118.anInt1296 = (-1965685901 * (class527.intStack[1942118537 * class527.anInt7012 + 1]));
		int i = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		if (i < 0)
			i = 0;
		else if (i > 5)
			i = 5;
		int i_83_ = (class527.intStack[3 + 1942118537 * class527.anInt7012]);
		if (i_83_ < 0)
			i_83_ = 0;
		else if (i_83_ > 5)
			i_83_ = 5;
		class118.aByte1333 = (byte) i;
		class118.aByte1355 = (byte) i_83_;
		Class109.method1858(class118, (byte) -63);
		Class44.method913(class98, class118, (byte) 1);
		if (class118.anInt1268 * -2131393857 == 0)
			Class12.method483(class98, class118, false, -238504860);
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class396.method6774(class118.anInt1287 * -1952846363, (byte) 71);
	}

	static final void method8968(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method7785(i, 247073816);
	}

	static final void method8969(CS2Executor class527) {
		int i = ((class527.unknown[301123709 * class527.instrPtr]) >> 16);
		int i_84_ = ((class527.unknown[class527.instrPtr * 301123709]) & 0xffff);
		int i_85_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_85_ < 0 || i_85_ > 5000)
			throw new RuntimeException();
		class527.globalArrayLengths[i] = i_85_;
		int i_86_ = -1;
		if (i_84_ == 105)
			i_86_ = 0;
		for (int i_87_ = 0; i_87_ < i_85_; i_87_++)
			class527.globalArrays[i][i_87_] = i_86_;
	}

	static final void method8970(CS2Executor class527) {
		int i = ((class527.unknown[301123709 * class527.instrPtr]) >> 16);
		int i_88_ = ((class527.unknown[class527.instrPtr * 301123709]) & 0xffff);
		int i_89_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_89_ < 0 || i_89_ > 5000)
			throw new RuntimeException();
		class527.globalArrayLengths[i] = i_89_;
		int i_90_ = -1;
		if (i_88_ == 105)
			i_90_ = 0;
		for (int i_91_ = 0; i_91_ < i_89_; i_91_++)
			class527.globalArrays[i][i_91_] = i_90_;
	}

	static final void method8971(CS2Executor class527) {
		int i = ((class527.unknown[301123709 * class527.instrPtr]) >> 16);
		int i_92_ = ((class527.unknown[class527.instrPtr * 301123709]) & 0xffff);
		int i_93_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_93_ < 0 || i_93_ > 5000)
			throw new RuntimeException();
		class527.globalArrayLengths[i] = i_93_;
		int i_94_ = -1;
		if (i_92_ == 105)
			i_94_ = 0;
		for (int i_95_ = 0; i_95_ < i_93_; i_95_++)
			class527.globalArrays[i][i_95_] = i_94_;
	}

	static final void method8972(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		int i_96_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_96_ < 0 || i_96_ >= class527.globalArrayLengths[i])
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.globalArrays[i][i_96_];
	}

	static final void method8973(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, false, 2, class527, (byte) 79);
	}

	static final void method8974(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 956929439);
		int i_97_;
		if (class425.aBool5101)
			i_97_ = class425.anInt5102 * 712312847;
		else if (class425.members)
			i_97_ = Class149_Sub2.DEFAULTS_LOADER_7.anInt5880 * -1519092215;
		else
			i_97_ = Class149_Sub2.DEFAULTS_LOADER_7.anInt5881 * 725268415;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_97_;
	}

	static final void method8975(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		class527.anInt7012 -= 283782002;
		int i_98_ = (class527.intStack[1942118537 * class527.anInt7012]);
		if (i_98_ < 0 || i_98_ >= class527.globalArrayLengths[i])
			throw new RuntimeException();
		class527.globalArrays[i][i_98_] = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
	}

	static final void method8976(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		class527.anInt7012 -= 283782002;
		int i_99_ = (class527.intStack[1942118537 * class527.anInt7012]);
		if (i_99_ < 0 || i_99_ >= class527.globalArrayLengths[i])
			throw new RuntimeException();
		class527.globalArrays[i][i_99_] = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
	}

	static final void method8977(CS2Executor class527) {
		String string = (Class462.aStringArray5548[(class527.unknown[class527.instrPtr * 301123709])]);
		if (null == string)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method8978(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		Class533.method11404((String) (class527.objectStack[(1806726141 * class527.anInt7000)]), (String) (class527.objectStack[1 + (class527.anInt7000 * 1806726141)]), "", (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]) == 1, false, -94301647);
	}

	static final void method8979(CS2Executor class527) {
		String string = (Class462.aStringArray5548[(class527.unknown[class527.instrPtr * 301123709])]);
		if (null == string)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method8980(CS2Executor class527) {
		String string = (Class462.aStringArray5548[(class527.unknown[class527.instrPtr * 301123709])]);
		if (null == string)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method8981(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Class462.aStringArray5548[i] = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
		Class282_Sub20_Sub10.method15263(i, (byte) 40);
	}

	static final void method8982(CS2Executor class527) {
		if (Class96_Sub21.aClass199_9438.method3236(81, -1560630051))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method8983(CS2Executor class527) {
		IterableNodeMap class465 = (class527.current.switchMaps[(class527.unknown[class527.instrPtr * 301123709])]);
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) class465.method7754((long) class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]));
		if (null != class282_sub38)
			class527.instrPtr += class282_sub38.anInt8002 * 750266701;
	}

	static final void method8984(CS2Executor class527) {
		class527.aLongArray7003[(class527.anInt7001 += -1188480575) * 1820448321 - 1] = (class527.current.longOpValues[301123709 * class527.instrPtr]);
	}

	static final void method8985(CS2Executor class527) {
		class527.aLongArray7003[(class527.anInt7001 += -1188480575) * 1820448321 - 1] = (class527.current.longOpValues[301123709 * class527.instrPtr]);
	}

	static final void method8986(CS2Executor class527) {
		class527.aLongArray7003[(class527.anInt7001 += -1188480575) * 1820448321 - 1] = (class527.current.longOpValues[301123709 * class527.instrPtr]);
	}

	static final void method8987(CS2Executor class527) {
		class527.aLongArray7003[(class527.anInt7001 += -1188480575) * 1820448321 - 1] = (class527.aLongArray6996[(class527.unknown[class527.instrPtr * 301123709])]);
	}

	static final void method8988(CS2Executor class527) {
		class527.aLongArray7003[(class527.anInt7001 += -1188480575) * 1820448321 - 1] = (class527.aLongArray6996[(class527.unknown[class527.instrPtr * 301123709])]);
	}

	static final void method8989(CS2Executor class527) {
		class527.aLongArray7003[(class527.anInt7001 += -1188480575) * 1820448321 - 1] = (class527.aLongArray6996[(class527.unknown[class527.instrPtr * 301123709])]);
	}

	static final void method8990(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_100_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i, (byte) 8);
		if ('s' == class431.aChar5140) {
			/* empty */
		}
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class431.method7226(i_100_, 337423586);
	}

	static final void method8991(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_101_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = string.indexOf(i, i_101_);
	}

	static final void method8992(CS2Executor class527) {
		class527.aLongArray6996[(class527.unknown[301123709 * class527.instrPtr])] = (class527.aLongArray7003[((class527.anInt7001 -= -1188480575) * 1820448321)]);
	}

	static final void method8993(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_102_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_102_, (byte) 0);
		if (class437.method7319(2009428955))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.aClass523_3868.method11205(i, (byte) 71).method11129(i_102_, class437.aString5335, 538910120);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.aClass523_3868.method11205(i, (byte) -47).method11133(i_102_, -1741480635 * class437.anInt5337, -763137413));
	}

	static final void method8994(CS2Executor class527) {
		class527.anInt7001 -= 1918006146;
		if ((class527.aLongArray7003[1820448321 * class527.anInt7001]) != (class527.aLongArray7003[1 + class527.anInt7001 * 1820448321]))
			class527.instrPtr += (-1051529003 * (class527.unknown[class527.instrPtr * 301123709]));
	}

	static final void method8995(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 53);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class453.method7547(class118, class98, class527, -248727394);
	}

	static final void method8996(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 412083381 * Class468_Sub28.anInt7961;
	}

	static final void method8997(CS2Executor class527) {
		class527.anInt7001 -= 1918006146;
		if ((class527.aLongArray7003[1820448321 * class527.anInt7001]) < (class527.aLongArray7003[1820448321 * class527.anInt7001 + 1]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method8998(CS2Executor class527) {
		boolean bool = true;
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Object object = Class361.aClass361_4181.method6254(new Object[] { string }, (byte) 8);
				if (object != null)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final void method8999(CS2Executor class527) {
		class527.anInt7001 -= 1918006146;
		if ((class527.aLongArray7003[1820448321 * class527.anInt7001]) < (class527.aLongArray7003[1820448321 * class527.anInt7001 + 1]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method9000(CS2Executor class527) {
		class527.anInt7001 -= 1918006146;
		if ((class527.aLongArray7003[1820448321 * class527.anInt7001]) > (class527.aLongArray7003[1 + class527.anInt7001 * 1820448321]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method9001(CS2Executor class527) {
		Class217_Sub1 class217_sub1 = Class468_Sub2.method12629(-1660419525);
		if (null != class217_sub1) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 157132839 * class217_sub1.anInt7975;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2700 * 1203083985;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7977;
			Class213 class213 = class217_sub1.method13055((short) -10312);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class213.anInt2680 * -216896281;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class213.aString2679;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2701 * 652811625;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt7978 * -129507359;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7976;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method9002(CS2Executor class527) {
		class527.anInt7001 -= 1918006146;
		if ((class527.aLongArray7003[1820448321 * class527.anInt7001]) >= (class527.aLongArray7003[1 + 1820448321 * class527.anInt7001]))
			class527.instrPtr += (-1051529003 * (class527.unknown[301123709 * class527.instrPtr]));
	}

	static final void method9003(CS2Executor class527) {
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1)
			class527.instrPtr += (-1051529003 * (class527.unknown[301123709 * class527.instrPtr]));
	}

	static final void method9004(CS2Executor class527) {
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1)
			class527.instrPtr += (-1051529003 * (class527.unknown[301123709 * class527.instrPtr]));
	}

	static final void method9005(CS2Executor class527) {
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1)
			class527.instrPtr += (-1051529003 * (class527.unknown[301123709 * class527.instrPtr]));
	}

	static final void method9006(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 125);
		Class88.method1494(class118, class527, (byte) -19);
	}

	static final void method9007(CS2Executor class527) {
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 0)
			class527.instrPtr += (-1051529003 * (class527.unknown[class527.instrPtr * 301123709]));
	}

	static final void method9008(CS2Executor class527) {
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 0)
			class527.instrPtr += (-1051529003 * (class527.unknown[class527.instrPtr * 301123709]));
	}

	static final void method9009(CS2Executor class527) {
		if (client.aString7426 != null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class285.method5025(client.aString7426, 2074182888);
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method9010(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Integer integer = (Integer) Class46.anObjectArray437[i];
		if (integer == null) {
			Class405 class405 = IndexLoaders.aClass394_5831.method6753(i, 295056095);
			if ('i' == class405.aChar4832 || '1' == class405.aChar4832)
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = 0;
			else
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = integer.intValue();
	}

	static final void method9011(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		Class405 class405 = IndexLoaders.aClass394_5831.method6753(i, -439300050);
		if (class405.aChar4832 != '\001')
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		Integer integer = ((Integer) Class46.anObjectArray437[1135540345 * class405.anInt4833]);
		if (integer == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else {
			int i_103_ = (-1524555999 * class405.anInt4835 == 31 ? -1 : (1 << class405.anInt4835 * -1524555999 + 1) - 1);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = ((integer.intValue() & i_103_) >>> class405.anInt4834 * 1015111697);
		}
	}

	static final void method9012(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 25);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class339.method6045(class118, class98, class527, (byte) -11);
	}

	static final void method9013(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		Class405 class405 = IndexLoaders.aClass394_5831.method6753(i, -1506334925);
		if (class405.aChar4832 != '\001')
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		Integer integer = ((Integer) Class46.anObjectArray437[1135540345 * class405.anInt4833]);
		if (integer == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else {
			int i_104_ = (-1524555999 * class405.anInt4835 == 31 ? -1 : (1 << class405.anInt4835 * -1524555999 + 1) - 1);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = ((integer.intValue() & i_104_) >>> class405.anInt4834 * 1015111697);
		}
	}

	static final void method9014(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Long var_long = (Long) Class46.anObjectArray437[i];
		if (var_long == null)
			class527.aLongArray7003[((class527.anInt7001 += -1188480575) * 1820448321 - 1)] = -1L;
		else
			class527.aLongArray7003[((class527.anInt7001 += -1188480575) * 1820448321 - 1)] = var_long.longValue();
	}

	static final void method9015(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Long var_long = (Long) Class46.anObjectArray437[i];
		if (var_long == null)
			class527.aLongArray7003[((class527.anInt7001 += -1188480575) * 1820448321 - 1)] = -1L;
		else
			class527.aLongArray7003[((class527.anInt7001 += -1188480575) * 1820448321 - 1)] = var_long.longValue();
	}

	static final void method9016(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass282_Sub4_7011.aClass57Array7499[i].aByte525);
	}

	static final void method9017(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Class537 class537 = IndexLoaders.aClass233_5822.method3933(i, -1783231964);
		if (null == class537)
			throw new RuntimeException();
		Integer integer = (class527.aClass61_7010.method1199(client.CURRENT_GAME.anInt5746 * 1648080491 << 16 | i, 1683694641));
		int i_105_;
		if (integer == null) {
			if (class537.aChar7096 == 'i' || class537.aChar7096 == '1')
				i_105_ = 0;
			else
				i_105_ = -1;
		} else
			i_105_ = integer.intValue();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_105_;
	}

	static final void method9018(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Class537 class537 = IndexLoaders.aClass233_5822.method3933(i, 756427318);
		if (null == class537)
			throw new RuntimeException();
		Integer integer = (class527.aClass61_7010.method1199(client.CURRENT_GAME.anInt5746 * 1648080491 << 16 | i, 1913617524));
		int i_106_;
		if (integer == null) {
			if (class537.aChar7096 == 'i' || class537.aChar7096 == '1')
				i_106_ = 0;
			else
				i_106_ = -1;
		} else
			i_106_ = integer.intValue();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_106_;
	}

	static final void method9019(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Class537 class537 = IndexLoaders.aClass233_5822.method3933(i, 1695365871);
		if (null == class537)
			throw new RuntimeException();
		Integer integer = (class527.aClass61_7010.method1225((1648080491 * client.CURRENT_GAME.anInt5746 << 16 | -1659474903 * class537.anInt7097), class537.anInt7098 * 1866356493, -47997093 * class537.anInt7099, (byte) 77));
		int i_107_;
		if (null == integer)
			i_107_ = 0;
		else
			i_107_ = integer.intValue();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_107_;
	}

	static final void method9020(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Class537 class537 = IndexLoaders.aClass233_5822.method3933(i, 2047752927);
		if (null == class537)
			throw new RuntimeException();
		Integer integer = (class527.aClass61_7010.method1225((1648080491 * client.CURRENT_GAME.anInt5746 << 16 | -1659474903 * class537.anInt7097), class537.anInt7098 * 1866356493, -47997093 * class537.anInt7099, (byte) 76));
		int i_108_;
		if (null == integer)
			i_108_ = 0;
		else
			i_108_ = integer.intValue();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_108_;
	}

	static final void method9021(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		String string = (class527.aClass61_7010.method1202(client.CURRENT_GAME.anInt5746 * 1648080491 << 16 | i, 936987573));
		String string_109_;
		if (null == string)
			string_109_ = "";
		else
			string_109_ = string;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string_109_;
	}

	static final void method9022(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int[] is = Class96_Sub14.method14642(string, class527, 832741166);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1403 = Class351.method6193(string, class527, 999611474);
		class118.anIntArray1315 = is;
		class118.aBool1384 = true;
	}

	static final void method9023(CS2Executor class527) {
		Class242.method4167((String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), 1836898606);
	}

	static final void method9024(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.unknown[class527.instrPtr * 301123709]);
	}

	static final void method9025(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.intLocals[(class527.unknown[class527.instrPtr * 301123709])]);
	}

	static final void method9026(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 91);
		class118.aClass118Array1438 = null;
		class118.aClass118Array1439 = null;
		Class109.method1858(class118, (byte) -64);
	}

	static final void method9027(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class363.method6288(class118, class98, class527, (short) 15359);
	}

	static final void method9028(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 104);
		class118.aClass118Array1438 = null;
		class118.aClass118Array1439 = null;
		Class109.method1858(class118, (byte) -49);
	}

	static final void method9029(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 17);
		class118.aClass118Array1438 = null;
		class118.aClass118Array1439 = null;
		Class109.method1858(class118, (byte) 2);
	}

	static final void method9030(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		UnderlayDefinition class513;
		if (class527.aBool7022)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class513.method8764(i, -1, -1290054035) ? 1 : 0;
	}

	static final void method9031(CS2Executor class527) {
		Class101.method1774((byte) -21);
	}

	static final void method9032(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 40);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1423 * -169127141;
	}

	static final void method9033(Class118 class118, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = ((class527.intStack[1942118537 * class527.anInt7012]) - 1);
		int i_110_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (i < 0 || i > 9)
			throw new RuntimeException();
		Class274.method4883(class118, i, i_110_, class527, -838566564);
	}

	static final void method9034(boolean bool, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 29);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		if (bool)
			Class455.method7554(class98, class118, 2140508097);
		else
			WorldMapIndexLoader.method3710(class98, class118, 983481657);
	}

	static final void method9035(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(i);
		if (class282_sub50_sub6 == null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub6.anInt9532 * 556833041 >> 14 & 0x3fff;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub6.anInt9532 * 556833041 & 0x3fff;
		}
	}

	static final void method9036(boolean bool, CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		if (bool)
			Class455.method7554(class98, class118, 2054293305);
		else
			WorldMapIndexLoader.method3710(class98, class118, 983481657);
	}

	static final void method9037(boolean bool, CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		if (bool)
			Class455.method7554(class98, class118, 265568046);
		else
			WorldMapIndexLoader.method3710(class98, class118, 983481657);
	}

	static final void method9038(boolean bool, CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		if (bool)
			Class455.method7554(class98, class118, 557603617);
		else
			WorldMapIndexLoader.method3710(class98, class118, 983481657);
	}

	static void method9039(String string, String string_111_, String string_112_, boolean bool, boolean bool_113_) {
		Class184 class184 = Class468_Sub20.method12807(606784974);
		if (class184.method3053((byte) -100) != null) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4543, class184.aClass432_2283, 852769121);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((Class108.method1846(string, 160336089) + Class108.method1846(string_111_, -1634383028) + Class108.method1846(string_112_, -1469994426) + 1), 1417031095);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_111_);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_112_);
			int i = 0;
			if (bool)
				i |= 0x1;
			if (bool_113_)
				i |= 0x2;
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			class184.method3049(class282_sub23, 733536366);
		}
	}

	static final void method9040(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_114_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		if (null != Class84.myPlayer.playerAppearance) {
			for (int i_115_ = 0; i_115_ < Class44.anIntArray428.length; i_115_++) {
				if (Class44.anIntArray428[i_115_] == i) {
					Class84.myPlayer.playerAppearance.method3993(i_115_, i_114_, IndexLoaders.aClass31_204, -1016831249);
					return;
				}
			}
			for (int i_116_ = 0; i_116_ < Class44.anIntArray422.length; i_116_++) {
				if (Class44.anIntArray422[i_116_] == i) {
					Class84.myPlayer.playerAppearance.method3993(i_116_, i_114_, IndexLoaders.aClass31_204, -1605050885);
					break;
				}
			}
		}
	}

	static final void method9041(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_117_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		if (null != Class84.myPlayer.playerAppearance) {
			for (int i_118_ = 0; i_118_ < Class44.anIntArray428.length; i_118_++) {
				if (Class44.anIntArray428[i_118_] == i) {
					Class84.myPlayer.playerAppearance.method3993(i_118_, i_117_, IndexLoaders.aClass31_204, 629198676);
					return;
				}
			}
			for (int i_119_ = 0; i_119_ < Class44.anIntArray422.length; i_119_++) {
				if (Class44.anIntArray422[i_119_] == i) {
					Class84.myPlayer.playerAppearance.method3993(i_119_, i_117_, IndexLoaders.aClass31_204, -757706291);
					break;
				}
			}
		}
	}

	static final void method9042(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (null == client.aClass118_7183 ? -1 : -1952846363 * client.aClass118_7183.anInt1287);
	}

	static final void method9043(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(-294971439) == 1 ? 1 : 0;
	}

	static final void method9044(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 96);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class290.method5121(class118, class98, class527, (byte) 7);
	}

	static final void method9045(CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0);
		if (Class84.myPlayer.playerAppearance != null)
			Class84.myPlayer.playerAppearance.method4003(bool, -794449734);
	}

	static final void method9046(CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0);
		if (Class84.myPlayer.playerAppearance != null)
			Class84.myPlayer.playerAppearance.method4003(bool, -794449734);
	}

	static final void method9047(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7315 * 1595512269;
	}

	static final void method9048(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 83);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class457.method7667(class118, class98, class527, 1184244987);
	}

	static final void method9049(CS2Executor class527) {
		if (0 != -1741204137 * client.anInt7166 || JS5CacheFile.method3360((byte) -42))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else if (Class448.aBool5422)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else if (8133049586794585531L * Class448.aLong5425 > Class169.method2869(1587603596) - 1000L)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else {
			Class448.aBool5422 = true;
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4613, client.aClass184_7218.aClass432_2283, 1129530883);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(Class418.anInt4999 * 4249963);
			client.aClass184_7218.method3049(class282_sub23, 168534598);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		}
	}

	public static void method9050(Class397 class397, int i, int i_120_, Animable class521_sub1_sub1_sub2, int i_121_) {
		CS2Executor class527 = Class125.method2167(1633634156);
		class527.animable = class521_sub1_sub1_sub2;
		class527.anInt7004 = 2000547059 * i_121_;
		Class107.method1834(class397, i, i_120_, class527, (byte) 108);
		class527.animable = null;
		class527.anInt7004 = -2000547059;
	}

	static final void method9051(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 118);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class236.method3983(class118, class98, class527, -806820698);
	}

	static final void method9052(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 12);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub17.method12260(class118, class98, class527, 1095410712);
	}

	static final void method9053(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub17.method12260(class118, class98, class527, 948545283);
	}

	static final void method9054(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_122_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.aClass429_4265.method7214(i, -1647135168).anIntArray9624[i_122_]);
	}

	static final void method9055(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub17.method12260(class118, class98, class527, 604720365);
	}

	static final void method9056(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub30_8194.method7785(i, -298283783);
	}

	static final void method9057(Class118 class118, Class98 class98, CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		if (bool != class118.aBool1306) {
			class118.aBool1306 = bool;
			Class109.method1858(class118, (byte) -88);
		}
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class78.method1389(class118.anInt1287 * -1952846363, -2142898356);
	}

	static final void method9058(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class412.aByte4963;
	}

	static final void method9059(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 67);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class29.method786(class118, class98, class527, -1279446637);
	}

	static final void method9060(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 97);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class29.method786(class118, class98, class527, -1279446637);
	}

	static final void method9061(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 61);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class29.method786(class118, class98, class527, -1279446637);
	}

	static final void method9062(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 45);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class29.method786(class118, class98, class527, -1279446637);
	}

	static final void method9063(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-1493683564) == 2 ? 1 : 0;
	}

	static final void method9064(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_123_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_123_, (byte) 0);
		if (class437.method7319(2003624402))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.aClass523_3868.method11205(i, (byte) -71).method11129(i_123_, class437.aString5335, 1910502991);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.aClass523_3868.method11205(i, (byte) -83).method11133(i_123_, -1741480635 * class437.anInt5337, 753761869));
	}

	static final void method9065(CS2Executor class527) {
		if (null == Class308.aShortArray3621 || (1750691703 * Class283.anInt3384 >= 560339485 * Class415.anInt4985))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = ((Class308.aShortArray3621[(Class283.anInt3384 += 220207687) * 1750691703 - 1]) & 0xffff);
	}

	static final void method9066(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.anInt7166 * -1741204137 != 0 || JS5CacheFile.method3360((byte) -15))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = Class62.method1262(i, string, (byte) 22) ? 1 : 0;
	}

	static final void method9067(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12727(-73670102) ? 1 : 0;
	}

	static final void method9068(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_124_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_125_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		if (i_124_ == -1)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_124_, (byte) 8);
		if (i != class431.aChar5140)
			throw new RuntimeException();
		int[] is = class431.method7251(Integer.valueOf(i_125_), 2098849170);
		int i_126_ = 0;
		if (null != is)
			i_126_ = is.length;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_126_;
	}

	static final void method9069(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 86);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class359.method6244(class118, class98, class527, 137733081);
	}

	static final void method9070(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1291 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
	}

	static final void method9071(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		FontRenderer.method403(class118, class98, class527, 1922732494);
	}

	static final void method9072(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		FontRenderer.method403(class118, class98, class527, -1269305488);
	}

	static final void method9073(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 13);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub52.method13468(class118, class98, class527, 769396750);
	}

	public static void method9074(Class397 class397, int i, int i_127_, Interface12 interface12) {
		CS2Executor class527 = Class125.method2167(1282970744);
		class527.anInterface12_7013 = interface12;
		Class107.method1834(class397, i, i_127_, class527, (byte) 74);
		class527.anInterface12_7013 = null;
	}

	static final void method9075(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 32);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class109.method1852(class118, class98, class527, 1050548242);
	}

	static final void method9076(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 115);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class109.method1852(class118, class98, class527, 1050548242);
	}

	static final void method9077(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 49);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class109.method1852(class118, class98, class527, 1050548242);
	}

	static final void method9078(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class109.method1852(class118, class98, class527, 1050548242);
	}

	static final void method9079(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class109.method1852(class118, class98, class527, 1050548242);
	}

	static final void method9080(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub17.method14653(class118, class98, class527, -1814527243);
	}

	static final void method9081(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1264 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1774983547);
		Class109.method1858(class118, (byte) 93);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class282_Sub14.method12223(class118.anInt1287 * -1952846363, (byte) -67);
	}

	static final void method9082(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 97);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class290.method5121(class118, class98, class527, (byte) 7);
	}

	static final void method9083(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1032218081);
		if (-1 == class425.certTemplateId * -722914683 && class425.certId * 1416589415 >= 0)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class425.certId * 1416589415;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i;
	}

	static final void method9084(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_128_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i | 1 << i_128_;
	}

	static final void method9085(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (client.aLong7153 * -8972807970865466165L >> 32);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (-8972807970865466165L * client.aLong7153 & 0xffffffffffffffffL);
	}

	static final void method9086(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aClass10Array7456[i].aBool117 ? 1 : 0;
	}

	static final void method9087(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 36);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class290.method5121(class118, class98, class527, (byte) 7);
	}

	static final void method9088(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class290.method5121(class118, class98, class527, (byte) 7);
	}

	static final void method9089(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method12706((byte) 109) == 1 ? 1 : 0;
	}

	static final void method9090(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class290.method5121(class118, class98, class527, (byte) 7);
	}

	static final void method9091(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		IsaacCipher.method7267(class118, class98, class527, 1175162225);
	}

	static final void method9092(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1316 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) -1);
	}

	static final void method9093(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1316 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) -32);
	}

	static final void method9094(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1316 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 77);
	}

	static final void method9095(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class184 class184 = Class468_Sub20.method12807(989932347);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4557, class184.aClass432_2283, 1431096475);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
		class184.method3049(class282_sub23, 556406671);
	}

	static final void method9096(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method7785(i, -458154026);
	}

	static final void method9097(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Defaults7Loader.method8754(class118, class98, class527, 1449946769);
	}

	static final void method9098(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Defaults7Loader.method8754(class118, class98, class527, 1449946769);
	}

	static final void method9099(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1453 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 542423029);
		Class109.method1858(class118, (byte) -67);
	}

	static final void method9100(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class488.anInt5760 * 1448596553;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1845665331 * Class351.anInt4097;
	}

	static final void method9101(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 99);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class306.method5453(class118, class98, class527, 225344906);
	}

	static final void method9102(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 97);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class306.method5453(class118, class98, class527, 1526280936);
	}

	static final void method9103(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 37);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class306.method5453(class118, class98, class527, -1866468759);
	}

	static final void method9104(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class306.method5453(class118, class98, class527, 839270175);
	}

	static final void method9105(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1377 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1802729151);
		Class109.method1858(class118, (byte) -28);
	}

	static final void method9106(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class329_Sub1.method12491(Class84.myPlayer, (class527.intStack[(class527.anInt7012 * 1942118537)]), (class527.intStack[(1942118537 * class527.anInt7012) + 1]), (byte) -68);
	}

	static final void method9107(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 125);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class521_Sub1_Sub4.method14892(class118, class98, class527, (byte) 25);
	}

	static final void method9108(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class521_Sub1_Sub4.method14892(class118, class98, class527, (byte) 30);
	}

	static final void method9109(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class521_Sub1_Sub4.method14892(class118, class98, class527, (byte) 101);
	}

	static final void method9110(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (class118.anInt1320 * 985215637 != i) {
			class118.anInt1320 = i * -1179842371;
			Class109.method1858(class118, (byte) 107);
		}
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Class105.method1807(class118.anInt1287 * -1952846363, (byte) 127);
	}

	static final void method9111(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 56);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class504.method8390(class118, class98, class527, 1964593641);
	}

	static final void method9112(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class293.method5206(-681683585);
	}

	static final void method9113(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 22);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class504.method8390(class118, class98, class527, 1964593641);
	}

	static final void method9114(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class504.method8390(class118, class98, class527, 1964593641);
	}

	static final void method9115(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1423 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 1700974355);
		Class109.method1858(class118, (byte) -82);
	}

	static final void method9116(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7465 ? 1 : 0;
	}

	static final void method9117(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class496.method8310(class118, class98, class527, (byte) -71);
	}

	static final void method9118(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class496.method8310(class118, class98, class527, (byte) -90);
	}

	static final void method9119(CS2Executor class527) {
		if (Class96_Sub21.aClass199_9438.method3236(86, -2045240982))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9120(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class496.method8310(class118, class98, class527, (byte) -41);
	}

	static final void method9121(CS2Executor class527) {
		if (null == Class149_Sub2.aClass461_9316)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1977256787 * Class149_Sub2.aClass461_9316.anInt5541;
	}

	static final void method9122(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1322 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 21);
	}

	static final void method9123(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 59);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class13.method501(class118, class98, class527, (byte) -48);
	}

	static final void method9124(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -81);
	}

	static final void method9125(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1343 * -1823193031;
	}

	static final void method9126(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method501(class118, class98, class527, (byte) -45);
	}

	static final void method9127(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1329 = 589750077;
		class118.anInt1330 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -636815827);
		Class109.method1858(class118, (byte) -106);
		if (1924549737 * class118.anInt1288 == -1 && !class98.aBool999)
			Class92.method1565(class118.anInt1287 * -1952846363, 1313001645);
	}

	static final void method9128(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 125);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class306.method5455(class118, class98, class527, 1859301325);
	}

	static final void method9129(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 82);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class455.method7555(class118, class98, class527, (byte) -18);
	}

	static final void method9130(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (class527.current.stringOpValues[class527.instrPtr * 301123709]);
	}

	static final void method9131(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 851346006;
		class118.anInt1293 = -1312401539 * (class527.intStack[1942118537 * class527.anInt7012]);
		class118.anInt1334 = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) * -2054115939);
		class118.anInt1385 = ((class527.intStack[1942118537 * class527.anInt7012 + 2]) * 1229969471);
		class118.anInt1336 = ((class527.intStack[3 + class527.anInt7012 * 1942118537]) * -140036259);
		class118.anInt1337 = (-906963849 * (class527.intStack[4 + 1942118537 * class527.anInt7012]));
		class118.anInt1343 = ((class527.intStack[5 + class527.anInt7012 * 1942118537]) * -807852535);
		Class109.method1858(class118, (byte) 43);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999) {
			Class106.method1818(-1952846363 * class118.anInt1287, -1561846158);
			Item.method12575(class118.anInt1287 * -1952846363, (byte) 54);
		}
	}

	static final void method9132(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 851346006;
		class118.anInt1293 = -1312401539 * (class527.intStack[1942118537 * class527.anInt7012]);
		class118.anInt1334 = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) * -2054115939);
		class118.anInt1385 = ((class527.intStack[1942118537 * class527.anInt7012 + 2]) * 1229969471);
		class118.anInt1336 = ((class527.intStack[3 + class527.anInt7012 * 1942118537]) * -140036259);
		class118.anInt1337 = (-906963849 * (class527.intStack[4 + 1942118537 * class527.anInt7012]));
		class118.anInt1343 = ((class527.intStack[5 + class527.anInt7012 * 1942118537]) * -807852535);
		Class109.method1858(class118, (byte) 21);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999) {
			Class106.method1818(-1952846363 * class118.anInt1287, -351806384);
			Item.method12575(class118.anInt1287 * -1952846363, (byte) 1);
		}
	}

	static final void method9133(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 14);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, false, 1, class527, (byte) -14);
	}

	static final void method9134(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 60);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class249.method4276(class118, class98, class527, -1460841920);
	}

	static final void method9135(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class249.method4276(class118, class98, class527, -709259158);
	}

	static final void method9136(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class457.method7667(class118, class98, class527, 1033428821);
	}

	static final void method9137(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != class118.anInt1321 * 1241177935) {
			if (i != -1) {
				if (null == class118.aClass456_1437)
					class118.aClass456_1437 = new Class456_Sub1();
				class118.aClass456_1437.method7567(i, (short) 8960);
			} else
				class118.aClass456_1437 = null;
			class118.anInt1321 = 388683695 * i;
			Class109.method1858(class118, (byte) -69);
		}
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class149_Sub1.method14582(-1952846363 * class118.anInt1287, -370064085);
	}

	static final void method9138(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != class118.anInt1321 * 1241177935) {
			if (i != -1) {
				if (null == class118.aClass456_1437)
					class118.aClass456_1437 = new Class456_Sub1();
				class118.aClass456_1437.method7567(i, (short) 8960);
			} else
				class118.aClass456_1437 = null;
			class118.anInt1321 = 388683695 * i;
			Class109.method1858(class118, (byte) 23);
		}
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class149_Sub1.method14582(-1952846363 * class118.anInt1287, -370064085);
	}

	static final void method9139(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 71);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class30.method797(class118, class98, class527, 2007111683);
	}

	static final void method9140(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 77);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class30.method797(class118, class98, class527, 2108850413);
	}

	static final void method9141(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 69);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class30.method797(class118, class98, class527, 2129345062);
	}

	static final void method9142(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class96_Sub22.method14680(class118, class527, 223488004);
	}

	static final void method9143(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1344 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 45);
	}

	static final void method9144(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1344 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 4);
	}

	static final void method9145(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 34);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class100.method1642(class118, class98, class527, 378257393);
	}

	static final void method9146(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 33);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		IsaacCipher.method7267(class118, class98, class527, -1755880113);
	}

	static final void method9147(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 99);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		IsaacCipher.method7267(class118, class98, class527, 1712680055);
	}

	static final void method9148(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		IsaacCipher.method7267(class118, class98, class527, 473713964);
	}

	static final void method9149(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub41_Sub1.method14700(class118, class98, class527, 1033157527);
	}

	static final void method9150(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i, (byte) 8);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class431.method7222(-370118267);
	}

	static final void method9151(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		class118.anInt1340 = 788815611 * (class527.intStack[class527.anInt7012 * 1942118537]);
		class118.anInt1350 = (2093089603 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]));
		class118.anInt1281 = (-875347675 * (class527.intStack[class527.anInt7012 * 1942118537 + 2]));
		class118.anInt1354 = ((class527.intStack[class527.anInt7012 * 1942118537 + 3]) * -797924565);
		Class109.method1858(class118, (byte) -45);
	}

	static final void method9152(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 2);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class242.method4159(class118, class98, class527, -1320034492);
	}

	static final void method9153(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 126);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class242.method4159(class118, class98, class527, -1385962551);
	}

	static final void method9154(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class242.method4159(class118, class98, class527, -1759620582);
	}

	static final void method9155(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aString1348 = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
	}

	static final void method9156(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, -286354936) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1346 = Class351.method6193(string, class527, 168567748);
		class118.aBool1384 = true;
	}

	static final void method9157(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 31);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class158.method2732(class118, class98, class527, -1503232948);
	}

	static void method9158(Class397 class397, int i, int i_129_, CS2Executor class527) {
		CS2Script class282_sub50_sub5 = Class225_Sub1.method12792(class397, i, i_129_, 856735933);
		if (null == class282_sub50_sub5)
			Class282_Sub50_Sub17.method15509(1991394643);
		else {
			class527.intLocals = new int[class282_sub50_sub5.intLocalsCount * 693687803];
			class527.objectLocals = new Object[1886892247 * class282_sub50_sub5.stringLocalsCount];
			if (Class397.aClass397_4797 == class282_sub50_sub5.aClass397_9527 || (Class397.aClass397_4805 == class282_sub50_sub5.aClass397_9527) || (Class397.aClass397_4798 == class282_sub50_sub5.aClass397_9527)) {
				int i_130_ = 0;
				int i_131_ = 0;
				if (Class282_Sub20_Sub24.aClass118_9884 != null) {
					i_130_ = (597157617 * Class282_Sub20_Sub24.aClass118_9884.anInt1299);
					i_131_ = (198275475 * Class282_Sub20_Sub24.aClass118_9884.anInt1428);
				}
				class527.intLocals[0] = Class163.aClass209_2031.method3569(2000218664) - i_130_;
				class527.intLocals[1] = Class163.aClass209_2031.method3570(756095591) - i_131_;
			} else if (Class397.aClass397_4806 == class282_sub50_sub5.aClass397_9527)
				class527.intLocals[0] = class527.anInt7004 * -945484741;
			Class51.method1068(class282_sub50_sub5, 200000, class527, 1748349019);
		}
	}

	static final void method9159(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class158.method2732(class118, class98, class527, -403718874);
	}

	static final void method9160(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class158.method2732(class118, class98, class527, -794840111);
	}

	static void method9161(Class98 class98, int i, int i_132_, int i_133_, boolean bool, CS2Executor class527) {
		if (0 == i_132_)
			throw new RuntimeException();
		Class118 class118 = class98.aClass118Array998[i];
		if (class118.aClass118Array1438 == null) {
			class118.aClass118Array1438 = new Class118[1 + i_133_];
			class118.aClass118Array1439 = class118.aClass118Array1438;
		}
		if (class118.aClass118Array1438.length <= i_133_) {
			if (class118.aClass118Array1438 == class118.aClass118Array1439) {
				Class118[] class118s = new Class118[i_133_ + 1];
				for (int i_134_ = 0; i_134_ < class118.aClass118Array1438.length; i_134_++)
					class118s[i_134_] = class118.aClass118Array1438[i_134_];
				class118.aClass118Array1438 = class118.aClass118Array1439 = class118s;
			} else {
				Class118[] class118s = new Class118[i_133_ + 1];
				Class118[] class118s_135_ = new Class118[i_133_ + 1];
				for (int i_136_ = 0; i_136_ < class118.aClass118Array1438.length; i_136_++) {
					class118s[i_136_] = class118.aClass118Array1438[i_136_];
					class118s_135_[i_136_] = class118.aClass118Array1439[i_136_];
				}
				class118.aClass118Array1438 = class118s;
				class118.aClass118Array1439 = class118s_135_;
			}
		}
		if (i_133_ > 0 && class118.aClass118Array1438[i_133_ - 1] == null)
			throw new RuntimeException(new StringBuilder().append("").append(i_133_ - 1).toString());
		Class118 class118_137_ = new Class118();
		class118_137_.anInt1268 = i_132_ * 720825663;
		class118_137_.anInt1305 = (class118_137_.anInt1287 = 1 * class118.anInt1287) * 1571006651;
		class118_137_.anInt1288 = -646708263 * i_133_;
		class118.aClass118Array1438[i_133_] = class118_137_;
		if (class118.aClass118Array1438 != class118.aClass118Array1439)
			class118.aClass118Array1439[i_133_] = class118_137_;
		UnderlayDefinition class513;
		if (bool)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		((UnderlayDefinition) class513).aClass98_5885 = class98;
		((UnderlayDefinition) class513).aClass118_5886 = class118_137_;
		Class109.method1858(class118, (byte) 42);
	}

	static final void method9162(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class158.method2732(class118, class98, class527, -142174046);
	}

	static final void method9163(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class158.method2732(class118, class98, class527, 175943700);
	}

	static final void method9164(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class158.method2732(class118, class98, class527, -193006323);
	}

	static final void method9165(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1277 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 204895771);
		Class109.method1858(class118, (byte) 28);
		if (1924549737 * class118.anInt1288 == -1 && !class98.aBool999)
			Game.method8207(-1952846363 * class118.anInt1287, -1659769157);
	}

	static final void method9166(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_138_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_139_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		if (i_138_ == -1)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_138_, (byte) 8);
		if (i != class431.aChar5140)
			throw new RuntimeException();
		int[] is = class431.method7251(Integer.valueOf(i_139_), 2043756931);
		int i_140_ = 0;
		if (null != is)
			i_140_ = is.length;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_140_;
	}

	static final void method9167(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1277 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 204895771);
		Class109.method1858(class118, (byte) -13);
		if (1924549737 * class118.anInt1288 == -1 && !class98.aBool999)
			Game.method8207(-1952846363 * class118.anInt1287, -1151705583);
	}

	static final void method9168(CS2Executor class527) {
		Class282_Sub4.method12114((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -84446938);
	}

	static final void method9169(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 95);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub41_Sub1.method14700(class118, class98, class527, 1458129646);
	}

	static final void method9170(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 50124473) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1393 = Class351.method6193(string, class527, 1674724083);
		class118.aBool1384 = true;
	}

	static final void method9171(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 52);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub41_Sub1.method14700(class118, class98, class527, 753799497);
	}

	static final void method9172(CS2Executor class527) {
		Class521_Sub1_Sub4_Sub2.method16088((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 1);
	}

	static final void method9173(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub41_Sub1.method14700(class118, class98, class527, -54651139);
	}

	static final void method9174(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anIntArray7338[i];
	}

	static final void method9175(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		class118.anInt1359 = (class527.intStack[1942118537 * class527.anInt7012]) * 1576498757;
		class118.anInt1360 = (class527.intStack[1 + 1942118537 * class527.anInt7012]) * 361885101;
		class118.anInt1358 = ((class527.intStack[2 + 1942118537 * class527.anInt7012]) * -1603580509);
		Class109.method1858(class118, (byte) 87);
	}

	static final void method9176(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		class118.anInt1359 = (class527.intStack[1942118537 * class527.anInt7012]) * 1576498757;
		class118.anInt1360 = (class527.intStack[1 + 1942118537 * class527.anInt7012]) * 361885101;
		class118.anInt1358 = ((class527.intStack[2 + 1942118537 * class527.anInt7012]) * -1603580509);
		Class109.method1858(class118, (byte) 5);
	}

	static final void method9177(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		class118.anInt1359 = (class527.intStack[1942118537 * class527.anInt7012]) * 1576498757;
		class118.anInt1360 = (class527.intStack[1 + 1942118537 * class527.anInt7012]) * 361885101;
		class118.anInt1358 = ((class527.intStack[2 + 1942118537 * class527.anInt7012]) * -1603580509);
		Class109.method1858(class118, (byte) -39);
	}

	static final void method9178(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 61);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class125.method2168(class118, class98, class527, 1424731356);
	}

	static final void method9179(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 64);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class125.method2168(class118, class98, class527, -1208380487);
	}

	static final void method9180(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class125.method2168(class118, class98, class527, -562812427);
	}

	static final void method9181(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 17);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		ItemDefinitions.method7142(class118, class98, class527, -1248347973);
	}

	static final void method9182(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		ItemDefinitions.method7142(class118, class98, class527, -1954963099);
	}

	static final void method9183(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1363 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 30);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Class244.method4196(-1952846363 * class118.anInt1287, (byte) 0);
	}

	static final void method9184(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1363 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) -84);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Class244.method4196(-1952846363 * class118.anInt1287, (byte) 0);
	}

	static final void method9185(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class455.method7557((String) (class527.objectStack[class527.anInt7000 * 1806726141]), (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]), Class223.CURRENT_LANGUAGE, 1341608337));
	}

	static final void method9186(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class175.method2960(class118, class98, class527, 1920613886);
	}

	static final void method9187(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class175.method2960(class118, class98, class527, 646983006);
	}

	static final void method9188(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 13);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class202.method3338(class118, class98, class527, (byte) 8);
	}

	static final void method9189(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class175.method2960(class118, class98, class527, 747329007);
	}

	static final void method9190(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1323 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -848451677);
		Class109.method1858(class118, (byte) 61);
	}

	static final void method9191(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (!string.equals(class118.aString1391)) {
			class118.aString1391 = string;
			Class109.method1858(class118, (byte) -86);
		}
		if (1924549737 * class118.anInt1288 == -1 && !class98.aBool999)
			Class211.method3631(class118.anInt1287 * -1952846363, -1694763763);
	}

	static final void method9192(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_141_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		Class414 class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, i_141_, 0, 1718596862);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class414.method6949(string, i, Class182.aClass160Array2261, 437013959);
	}

	static final void method9193(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 85);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class242.method4160(class118, class98, class527, (short) 28772);
	}

	static final void method9194(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 86);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class242.method4160(class118, class98, class527, (short) 24339);
	}

	static final void method9195(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 123);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class242.method4160(class118, class98, class527, (short) 12669);
	}

	static final void method9196(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class241.method4149(class118, class98, class527, -21859635);
	}

	static final void method9197(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class242.method4160(class118, class98, class527, (short) 26305);
	}

	static final void method9198(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1324 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 1596298199);
		Class109.method1858(class118, (byte) -6);
	}

	static final void method9199(CS2Executor class527) {
		if (Class475.aBool5623 && Class263.aFrame3260 != null)
			Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(336211269), -1, -1, false, (byte) 104);
		if (NamedFileReference.method867(1394927577) == Class279.aClass279_3368) {
			Class282_Sub11.method12211(-1126265723);
			System.exit(0);
		} else
			Class480.method8043(-558703610);
	}

	static final void method9200(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 62);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class172.method2915(class118, class98, class527, (byte) 0);
	}

	static final void method9201(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_142_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_143_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (null == string_142_)
			string_142_ = "";
		if (string_142_.length() > 80)
			string_142_ = string_142_.substring(0, 80);
		Class184 class184 = Class468_Sub20.method12807(-1477616308);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4611, class184.aClass432_2283, 1642338771);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte((Class108.method1846(string, -883433081) + 2 + Class108.method1846(string_142_, -1200602493)));
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i - 1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_143_);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_142_);
		class184.method3049(class282_sub23, -370059922);
	}

	static final void method9202(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 74);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1423 * -169127141;
	}

	static final void method9203(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class172.method2915(class118, class98, class527, (byte) 0);
	}

	static final void method9204(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int[] is = Class96_Sub14.method14642(string, class527, 1618100120);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1342 = Class351.method6193(string, class527, 1924789488);
		class118.anIntArray1398 = is;
		class118.aBool1384 = true;
	}

	static final void method9205(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class172.method2915(class118, class98, class527, (byte) 0);
	}

	static final void method9206(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1325 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) -95);
	}

	static final void method9207(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1325 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 82);
	}

	static final void method9208(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class249.method4280(class118, class98, class527, (byte) 102);
	}

	static final void method9209(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class249.method4280(class118, class98, class527, (byte) 73);
	}

	static final void method9210(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1351 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 45);
	}

	static final void method9211(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1351 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 47);
	}

	static final void method9212(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 11);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class28.method774(class118, class98, class527, -1296322680);
	}

	static final void method9213(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 12);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class100.method1642(class118, class98, class527, -155349428);
	}

	static final void method9214(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 84);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class28.method774(class118, class98, class527, -1296322680);
	}

	static final void method9215(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class28.method774(class118, class98, class527, -1296322680);
	}

	static final void method9216(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class369.method6313(class118, class98, class527, 1355761148);
	}

	static final void method9217(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i, (byte) 0);
		if (!class437.aString5335.equals(string))
			class118.method2000(i, string, 2127200493);
		else
			class118.method1995(i, -1265527536);
	}

	static final void method9218(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method505(class118, class98, class527, (byte) 1);
	}

	static final void method9219(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		class118.anInt1376 = -280394239 * (class527.intStack[1942118537 * class527.anInt7012]);
		class118.anInt1314 = (1004789833 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]));
		Class109.method1858(class118, (byte) 5);
		if (0 == -2131393857 * class118.anInt1268)
			Class12.method483(class98, class118, false, -960345802);
	}

	static final void method9220(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_144_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		int i_145_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		int i_146_ = (class527.intStack[3 + class527.anInt7012 * 1942118537]);
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(999069389);
		Class11.method469((i >> 14 & 0x3fff) - 1948093437 * class219.anInt2711, (i & 0x3fff) - class219.anInt2712 * -1002240017, i_144_ << 2, i_145_, i_146_, (byte) 68);
	}

	static final void method9221(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != -1)
			Class92.method1563(i, 1917715893);
	}

	static final void method9222(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method506(class118, class98, class527, -2080755009);
	}

	static final void method9223(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class172.method2915(class118, class98, class527, (byte) 0);
	}

	static final void method9224(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1327 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 45);
	}

	static final void method9225(Class118 class118, CS2Executor class527) {
		Class414 class414 = class118.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Point point = class414.method6954(class118.aString1391, 1506818197 * class118.anInt1301, class118.anInt1358 * -753644021, i, Class182.aClass160Array2261, -2038723986);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = point.x;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = point.y;
	}

	static final void method9226(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 24);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub17_Sub4.method15409(class118, class98, class527, -1532453373);
	}

	static final void method9227(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class159.method2741(class118, class98, class527, (byte) 24);
	}

	static final void method9228(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i == -1)
			throw new RuntimeException("");
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append((char) i).toString();
	}

	static final void method9229(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_147_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (Class475.aBool5623) {
			Class440.method7373(3, i, i_147_, false, (byte) 108);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = null != Class263.aFrame3260 ? 1 : 0;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9230(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub50_Sub17.method15511(class118, class98, class527, (byte) 124);
	}

	static final void method9231(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.anInt635 * -1130104385;
	}

	static final void method9232(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub50_Sub17.method15511(class118, class98, class527, (byte) 85);
	}

	static final void method9233(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != class118.anInt1321 * 1241177935) {
			if (i != -1) {
				if (null == class118.aClass456_1437)
					class118.aClass456_1437 = new Class456_Sub1();
				class118.aClass456_1437.method7567(i, (short) 8960);
			} else
				class118.aClass456_1437 = null;
			class118.anInt1321 = 388683695 * i;
			Class109.method1858(class118, (byte) 9);
		}
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class149_Sub1.method14582(-1952846363 * class118.anInt1287, -370064085);
	}

	static final void method9234(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 34);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		IsaacCipher.method7267(class118, class98, class527, -84016483);
	}

	static final void method9235(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 8);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class278_Sub1.method13450(class118, class98, class527, -1043063672);
	}

	static final void method9236(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 47);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class278_Sub1.method13450(class118, class98, class527, -75793);
	}

	static final void method9237(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class278_Sub1.method13450(class118, class98, class527, -571917869);
	}

	static final void method9238(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		class118.anInt1441 = 304814545 * (class527.intStack[class527.anInt7012 * 1942118537]);
		class118.anInt1263 = ((class527.intStack[1942118537 * class527.anInt7012 + 1]) * -1208146817);
		Class109.method1858(class118, (byte) 5);
	}

	static final void method9239(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1502086755).stackable * 318481945) == 1 ? 1 : 0;
	}

	static final void method9240(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 126);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		RsByteBuffer.method13292(class118, class98, class527, (byte) 60);
	}

	static final void method9241(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		RsByteBuffer.method13292(class118, class98, class527, (byte) 60);
	}

	static final void method9242(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		RsByteBuffer.method13292(class118, class98, class527, (byte) 60);
	}

	static final void method9243(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1362 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -310295877);
		Class109.method1858(class118, (byte) 45);
	}

	static final void method9244(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1362 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -310295877);
		Class109.method1858(class118, (byte) -59);
	}

	static final void method9245(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 60);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class17.method569(class118, class98, class527, 1356597877);
	}

	static final void method9246(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 42);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class17.method569(class118, class98, class527, 726354456);
	}

	static final void method9247(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_148_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i, (byte) 0);
		if (i_148_ != -1741480635 * class437.anInt5337)
			class118.method1999(i, i_148_, 99712235);
		else
			class118.method1995(i, -1265527536);
	}

	static final void method9248(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_149_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.aClass429_4265.method7214(i, -2143235043).anIntArray9624[i_149_]);
	}

	static final void method9249(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class82.method1454(class118, class98, class527, (byte) 25);
	}

	static final void method9250(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i, (byte) 0);
		if (!class437.aString5335.equals(string))
			class118.method2000(i, string, 2140131124);
		else
			class118.method1995(i, -1265527536);
	}

	static final void method9251(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i, (byte) 0);
		if (!class437.aString5335.equals(string))
			class118.method2000(i, string, 2146992135);
		else
			class118.method1995(i, -1265527536);
	}

	static final void method9252(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12761(-712187302) ? 1 : 0;
	}

	static final void method9253(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7436;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7437;
	}

	static final void method9254(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 103);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class13.method505(class118, class98, class527, (byte) 1);
	}

	static final void method9255(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 1, class527, (byte) 11);
	}

	static final void method9256(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method505(class118, class98, class527, (byte) 1);
	}

	static final void method9257(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method505(class118, class98, class527, (byte) 1);
	}

	static final void method9258(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		short i_150_ = (short) (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		short i_151_ = (short) (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		if (i >= 0 && i < 5) {
			class118.method2007(i, i_150_, i_151_, 2039505725);
			Class109.method1858(class118, (byte) -21);
			if (1924549737 * class118.anInt1288 == -1 && !class98.aBool999)
				Class311.method5513(class118.anInt1287 * -1952846363, i, (byte) -1);
		}
	}

	static final void method9259(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 122);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class457.method7667(class118, class98, class527, 50772771);
	}

	static final void method9260(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 90);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class457.method7667(class118, class98, class527, 2137043485);
	}

	static final void method9261(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 39);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, true, 1, class527, (byte) -29);
	}

	static final void method9262(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 81);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub20_Sub9.method15256(class118, class98, class527, -835527218);
	}

	static final void method9263(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class457.method7667(class118, class98, class527, 1283288949);
	}

	static final void method9264(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 39);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class295.method5291(class118, class98, class527, -897186436);
	}

	static final void method9265(Class118 class118, Class98 class98, CS2Executor class527) {
		if (5 == -2131393857 * class118.anInt1268)
			Class306.method5459(class118, class98, class527, -1514140714);
	}

	static final void method9266(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 113);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class29.method789(class118, class98, class527, -19478635);
	}

	static final void method9267(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 49);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class29.method789(class118, class98, class527, -19478635);
	}

	static final void method9268(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class29.method789(class118, class98, class527, -19478635);
	}

	static final void method9269(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class29.method789(class118, class98, class527, -19478635);
	}

	static final void method9270(Class118 class118, Class98 class98, CS2Executor class527) {
		if (4 == -2131393857 * class118.anInt1268)
			Class306.method5459(class118, class98, class527, -1947654230);
	}

	static final void method9271(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 149411748);
		if (-1 == class425.certTemplateId * -722914683 && class425.certId * 1416589415 >= 0)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class425.certId * 1416589415;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i;
	}

	static final void method9272(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.cycles * -1809259861;
	}

	static final void method9273(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class349.method6186(class118, class98, class527, -94301647);
	}

	static final void method9274(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class152.method2598(1519112830).method243((byte) 1);
	}

	static final void method9275(CS2Executor class527) {
		Class282_Sub36 class282_sub36 = Class540.method11595(-1239211133);
		if (class282_sub36 == null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1798678621 * class282_sub36.anInt7991;
			int i = (-1967986419 * class282_sub36.anInt7988 << 28 | (Class291.anInt3472 + class282_sub36.anInt7987 * -1306535747) << 14 | (Class291.anInt3473 + class282_sub36.anInt7993 * 1012301095));
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i;
		}
	}

	static final void method9276(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 11);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class336.method6010(class118, class98, class527, -1443856936);
	}

	static final void method9277(CS2Executor class527) {
		class527.intLocals[(class527.unknown[301123709 * class527.instrPtr])] = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
	}

	static final void method9278(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class336.method6010(class118, class98, class527, 56859744);
	}

	static final void method9279(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1356 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 9);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Class96_Sub17.method14656(class118.anInt1287 * -1952846363, 1494031023);
	}

	static final void method9280(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1356 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 29);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Class96_Sub17.method14656(class118.anInt1287 * -1952846363, -1304454793);
	}

	static final void method9281(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1356 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) -2);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Class96_Sub17.method14656(class118.anInt1287 * -1952846363, 400475682);
	}

	static final void method9282(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1356 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) -26);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Class96_Sub17.method14656(class118.anInt1287 * -1952846363, 1031402798);
	}

	static final void method9283(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 24);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class389.method6697(class118, class98, class527, 1767722937);
	}

	static final void method9284(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class389.method6697(class118, class98, class527, 2105715448);
	}

	static final void method9285(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (1609086245 * client.anInt7434 != 0 && i < client.anInt7373 * -1754449153)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = client.aClass10Array7456[i].aString115;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method9286(CS2Executor class527) {
		boolean bool = true;
		if (client.aBool7310) {
			try {
				Object object = Class361.aClass361_4169.method6255((short) 7681);
				if (object != null)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final void method9287(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_152_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i, (byte) 0);
		if (i_152_ != -1741480635 * class437.anInt5337)
			class118.method1999(i, i_152_, -511051143);
		else
			class118.method1995(i, -1265527536);
	}

	static final void method9288(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_153_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_154_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		int i_155_ = (class527.intStack[3 + class527.anInt7012 * 1942118537]);
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_154_, (byte) 8);
		if (class431.aChar5146 != i || class431.aChar5140 != i_153_)
			throw new RuntimeException(new StringBuilder().append(i_154_).append(" ").append(i_155_).toString());
		if (115 == i_153_)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class431.method7226(i_155_, 833595365);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class431.method7232(i_155_, 423897905);
	}

	static final void method9289(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_156_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i, (byte) 0);
		if (i_156_ != -1741480635 * class437.anInt5337)
			class118.method1999(i, i_156_, -801858386);
		else
			class118.method1995(i, -1265527536);
	}

	static final void method9290(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class389.method6697(class118, class98, class527, 937397134);
	}

	static final void method9291(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1328 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 15);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Message.method7278(-1952846363 * class118.anInt1287, 1835472984);
	}

	static final void method9292(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 32);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub52.method13468(class118, class98, class527, 769396750);
	}

	static final void method9293(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7300 * 550395357;
	}

	static final void method9294(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class118 class118_157_ = Class96_Sub23.method14682(class98, class118, -838454718);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (null == class118_157_ ? -1 : class118_157_.anInt1287 * -1952846363);
	}

	static final void method9295(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub52.method13468(class118, class98, class527, 769396750);
	}

	static final void method9296(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub52.method13468(class118, class98, class527, 769396750);
	}

	static final void method9297(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub52.method13468(class118, class98, class527, 769396750);
	}

	static final void method9298(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		class527.anInt7000 -= i * 1476624725;
		String string = Class377.method6398(class527.objectStack, 1806726141 * class527.anInt7000, i, 2088874425);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method9299(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt107 * -1951489731;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -79406355 * Class9.anInt109;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -532543837 * Class9.anInt108;
		Class9.anInt107 = 264209366;
		Class9.anInt109 = -915280613;
		Class9.anInt108 = 691675893;
	}

	static final void method9300(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4566, client.aClass184_7475.aClass432_2283, -58955954);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i, 1417031095);
		client.aClass184_7475.method3049(class282_sub23, 424650441);
	}

	static final void method9301(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 105);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		ReferenceTable.method5763(class118, class98, class527, -2135427655);
	}

	static final void method9302(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub20_Sub38.method15430(i, 16711935);
	}

	static final void method9303(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class158_Sub1.aClass3_8507.method241(i, 600559881);
	}

	static final void method9304(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7436;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7437;
	}

	static final void method9305(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1329 = 1769250231;
		class118.anInt1330 = -1183558903 * client.anInt7315;
		class118.anInt1339 = 0;
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.anInt1287 * -1952846363, -56063640);
	}

	static final void method9306(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class359.method6244(class118, class98, class527, -1616293795);
	}

	static final void method9307(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_158_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_159_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class159.method2738((class527.animable.aClass98_10324), i & 0xffff, i_158_, i_159_, class527.aBool7022, class527, -1306169472);
	}

	static final void method9308(CS2Executor class527) {
		NodeCollection.method8146(-1886140933);
	}

	static final void method9309(Class118 class118, Class98 class98, boolean bool, int i, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i_160_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_161_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999) {
			Class411.method6914(class118.anInt1287 * -1952846363, (short) 887);
			Class106.method1818(class118.anInt1287 * -1952846363, -1448688127);
			Item.method12575(-1952846363 * class118.anInt1287, (byte) 78);
		}
		if (-1 == i_160_) {
			class118.anInt1329 = 589750077;
			class118.anInt1330 = 636815827;
			class118.anInt1426 = 833742903;
		} else {
			class118.anInt1426 = i_160_ * -833742903;
			class118.anInt1427 = i_161_ * 1010829041;
			class118.aBool1388 = bool;
			ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_160_, 2143950025);
			class118.anInt1385 = -790145187 * class425.anInt5058;
			class118.anInt1336 = 427762477 * class425.anInt5045;
			class118.anInt1337 = -174540793 * class425.anInt5074;
			class118.anInt1293 = class425.anInt5063 * -1057479355;
			class118.anInt1334 = class425.anInt5044 * -1474252971;
			class118.anInt1343 = class425.modelZoom * 394720705;
			class118.anInt1335 = i * 582441359;
			if (class118.anInt1417 * -1326245411 > 0)
				class118.anInt1343 = (class118.anInt1343 * 1787365152 / (-1326245411 * class118.anInt1417) * -807852535);
			else if (class118.anInt1297 * 1352091441 > 0)
				class118.anInt1343 = -807852535 * (class118.anInt1343 * 1787365152 / (1352091441 * class118.anInt1297));
		}
	}

	static final void method9310(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 54);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, false, 2, class527, (byte) 37);
	}

	static final void method9311(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, false, 2, class527, (byte) -81);
	}

	static final void method9312(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		if (class118.aString1369 == null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class118.aString1369;
	}

	static final void method9313(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, false, 2, class527, (byte) 21);
	}

	static final void method9314(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1009302201 * class118.anInt1337;
	}

	static final void method9315(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 94);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, false, 0, class527, (byte) -16);
	}

	static final void method9316(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 23);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, false, 0, class527, (byte) 89);
	}

	static final void method9317(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, false, 0, class527, (byte) 25);
	}

	static final void method9318(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.aString7426 != null && i < -1772444859 * Class459.anInt5534)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = Class467.aClass173Array5575[i].aByte2126;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9319(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1343 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -807852535);
		Class109.method1858(class118, (byte) -98);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class106.method1818(-1952846363 * class118.anInt1287, -1114579640);
	}

	static final void method9320(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 2, class527, (byte) 33);
	}

	static final void method9321(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class8_Sub2.method14263(i >> 14 & 0x3fff, i & 0x3fff, (byte) 0);
	}

	static final void method9322(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 0, class527, (byte) 95);
	}

	static final void method9323(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 0, class527, (byte) -44);
	}

	static final void method9324(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 0, class527, (byte) -12);
	}

	static final void method9325(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 0, class527, (byte) 48);
	}

	static final void method9326(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[class527.anInt7012 * 1942118537]) <= (class527.intStack[class527.anInt7012 * 1942118537 + 1]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method9327(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 10);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, false, 1, class527, (byte) -54);
	}

	static final void method9328(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 17);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, false, 1, class527, (byte) 74);
	}

	static final void method9329(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 41);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, false, 1, class527, (byte) 23);
	}

	static final void method9330(CS2Executor class527) {
		AnimationDefinitions.method11148((class527.aClass521_Sub1_Sub2_Sub1_7014), (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), 1751285399);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method9331(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 75);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, true, 1, class527, (byte) -56);
	}

	static final void method9332(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class363.method6288(class118, class98, class527, (short) 12252);
	}

	static final void method9333(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 75);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, true, 1, class527, (byte) -97);
	}

	static final void method9334(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub52.method13468(class118, class98, class527, 769396750);
	}

	static final void method9335(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class96_Sub1.anInt8307 * -993852069;
	}

	static final void method9336(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 1, class527, (byte) -63);
	}

	static final void method9337(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1329 = -756466834;
		class118.aClass417_1308 = null;
		class118.anInt1330 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -636815827);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.anInt1287 * -1952846363, 175173715);
	}

	static final void method9338(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1329 = -756466834;
		class118.aClass417_1308 = null;
		class118.anInt1330 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -636815827);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.anInt1287 * -1952846363, 828220674);
	}

	static final void method9339(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4607, client.aClass184_7475.aClass432_2283, 1383858236);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string.length() + 1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		client.aClass184_7475.method3049(class282_sub23, 1821709056);
	}

	static final void method9340(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 95);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class529.method11337(class118, class98, class527, -1315257308);
	}

	static final void method9341(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 58);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class529.method11337(class118, class98, class527, -1420728460);
	}

	static final void method9342(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class349.method6186(class118, class98, class527, -94301647);
	}

	static final void method9343(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 39);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class529.method11337(class118, class98, class527, -816859624);
	}

	static final void method9344(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class529.method11337(class118, class98, class527, -225814594);
	}

	static final void method9345(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 998866533).aString5043;
	}

	static final void method9346(CS2Executor class527) {
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class527.animable);
		String string = class521_sub1_sub1_sub2_sub2.aString10584;
		NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
		if (null != class409.anIntArray4886) {
			class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null == class409)
				string = "";
			else
				string = class409.aString4857;
		}
		if (null == string)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method9347(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 4);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class287.method5066(class118, class98, class527, 788821383);
	}

	static final void method9348(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 31);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class287.method5066(class118, class98, class527, 847215777);
	}

	static final void method9349(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class369.method6313(class118, class98, class527, 754733078);
	}

	static final void method9350(CS2Executor class527) {
		Class101.method1774((byte) -17);
	}

	static final void method9351(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class369.method6313(class118, class98, class527, 1998967712);
	}

	static final void method9352(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		class118.anInt1430 = (class527.intStack[class527.anInt7012 * 1942118537]) * -1019275441;
		class118.anInt1431 = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) * 1761303305);
		Class109.method1858(class118, (byte) 35);
	}

	static final void method9353(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		class118.anInt1430 = (class527.intStack[class527.anInt7012 * 1942118537]) * -1019275441;
		class118.anInt1431 = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) * 1761303305);
		Class109.method1858(class118, (byte) 22);
	}

	static final void method9354(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 72);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class463.method7729(class118, class98, class527, 2064724449);
	}

	static final void method9355(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 39);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class463.method7729(class118, class98, class527, 1055299760);
	}

	static final void method9356(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class463.method7729(class118, class98, class527, 1024894337);
	}

	static final void method9357(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class463.method7729(class118, class98, class527, 526992740);
	}

	static final void method9358(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class468_Sub19.method12790((Class113.aClass282_Sub4_1235 == (class527.aClass282_Sub4_7011)), i, 1361541751);
	}

	static final void method9359(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class82.method1455(class118, class98, class527, -1784890209);
	}

	static final void method9360(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1329 = -1346216911;
		class118.anInt1330 = -1183558903 * client.anInt7315;
		class118.anInt1339 = 0;
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class92.method1565(-1952846363 * class118.anInt1287, 687431954);
	}

	static final void method9361(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 87);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub25.method12401(class118, class98, class527, 776284352);
	}

	static final void method9362(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 66);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub25.method12401(class118, class98, class527, -1167357315);
	}

	static final void method9363(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub25.method12401(class118, class98, class527, -384813006);
	}

	static final void method9364(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub25.method12401(class118, class98, class527, -521482208);
	}

	static final void method9365(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aString1369 = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
	}

	static final void method9366(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Class169.method2869(1535098734) / 86400000L) - 11745;
	}

	static final void method9367(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (2 == client.anInt7434 * 1609086245 && i < client.anInt7449 * 493536965) {
			Class6 class6 = client.aClass6Array7452[i];
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class6.aString37;
			if (class6.aString43 != null)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = class6.aString43;
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
		} else {
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method9368(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (i < 0 || i > 9)
			class527.anInt7000 -= 1476624725;
		else
			class118.method1994(i, (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), (byte) -5);
	}

	static final void method9369(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class344.method6119(string, 474966767);
	}

	static final void method9370(CS2Executor class527) {
		class527.anInt7001 -= 1918006146;
		if ((class527.aLongArray7003[class527.anInt7001 * 1820448321]) <= (class527.aLongArray7003[1 + 1820448321 * class527.anInt7001]))
			class527.instrPtr += (-1051529003 * (class527.unknown[301123709 * class527.instrPtr]));
	}

	static final void method9371(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 33);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class278_Sub1.method13450(class118, class98, class527, -49348013);
	}

	static final void method9372(Class118 class118, CS2Executor class527) {
		Class414 class414 = class118.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_162_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_163_ = class414.method6956(class118.aString1391, 1506818197 * class118.anInt1301, -753644021 * class118.anInt1358, i_162_, i, Class182.aClass160Array2261, -366951070);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_163_;
	}

	static final void method9373(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class295.method5291(class118, class98, class527, -163559185);
	}

	static final void method9374(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (1 == class118.anInt1329 * 2131324949 ? class118.anInt1330 * -402732635 : -1);
	}

	static final void method9375(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_164_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		if (-1 == i && i_164_ == -1)
			class118.aClass118_1379 = null;
		else
			class118.aClass118_1379 = Index.method5694(i, i_164_, -1442773118);
	}

	static final void method9376(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		Class320.anIntArray3724[i] = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub20_Sub11.method15264(i, (short) 14098);
		client.aBool7400 |= Class282_Sub17_Sub2.aBoolArray9934[i];
	}

	static final void method9377(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 85);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub50_Sub17.method15511(class118, class98, class527, (byte) 37);
	}

	static final void method9378(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 112);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		WorldMapAreaDefs.method3738(class118, class98, class527, (byte) -2);
	}

	static final void method9379(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		WorldMapAreaDefs.method3738(class118, class98, class527, (byte) -2);
	}

	static final void method9380(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		WorldMapAreaDefs.method3738(class118, class98, class527, (byte) -2);
	}

	static final void method9381(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (-281434611 * Class118.anInt1283 == i || i == -85967273 * Class118.anInt1373 || Class118.anInt1265 * -1267941319 == i)
			class118.anInt1382 = i * -1316583121;
	}

	static final void method9382(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (-281434611 * Class118.anInt1283 == i || i == -85967273 * Class118.anInt1373 || Class118.anInt1265 * -1267941319 == i)
			class118.anInt1382 = i * -1316583121;
	}

	static final void method9383(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (-281434611 * Class118.anInt1283 == i || i == -85967273 * Class118.anInt1373 || Class118.anInt1265 * -1267941319 == i)
			class118.anInt1382 = i * -1316583121;
	}

	static final void method9384(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1264 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1774983547);
		Class109.method1858(class118, (byte) 12);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class282_Sub14.method12223(class118.anInt1287 * -1952846363, (byte) -120);
	}

	static final void method9385(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 89);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		NamedFileReference.method869(class118, class98, class527, -656177278);
	}

	static final void method9386(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_165_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		if (Class468_Sub8.aClass98Array7889[i] == null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else {
			String string = (Class468_Sub8.aClass98Array7889[i].aClass118Array998[i_165_].aString1285);
			if (null == string)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = string;
		}
	}

	static final void method9387(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string.toLowerCase();
	}

	static final void method9388(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		NamedFileReference.method869(class118, class98, class527, -1333642331);
	}

	static final void method9389(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte628;
	}

	static final void method9390(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1380 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1380100089);
	}

	static final void method9391(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1380 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1380100089);
	}

	static final void method9392(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 123);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class504.method8387(class118, class98, class527, 2100104334);
	}

	static final void method9393(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 15);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class504.method8387(class118, class98, class527, 1692955872);
	}

	static final void method9394(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class504.method8387(class118, class98, class527, 1622346799);
	}

	static final void method9395(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1381 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1326599461);
	}

	static final void method9396(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 33);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub20_Sub9.method15256(class118, class98, class527, 799522475);
	}

	static final void method9397(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class174.method2955(class118, class98, class527, (byte) 0);
	}

	static final void method9398(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_166_ = -1;
		if (null != class108)
			i_166_ = class108.anInt1092 * 1608788053;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_166_;
	}

	static final void method9399(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub20_Sub9.method15256(class118, class98, class527, -1568207446);
	}

	static final void method9400(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1328 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) -14);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Message.method7278(-1952846363 * class118.anInt1287, 393653730);
	}

	static final void method9401(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub20_Sub9.method15256(class118, class98, class527, 1499481588);
	}

	static final void method9402(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub4_8187, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 1097544459);
		Class190.method3148((byte) 87);
	}

	static final void method9403(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aString1369 = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
	}

	static final void method9404(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 55);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class344.method6122(class118, class98, class527, -345845771);
	}

	static final void method9405(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_167_ = -1;
		if (class108 != null)
			i_167_ = class108.anInt1091 * -1987818893;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_167_;
	}

	static final void method9406(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class344.method6122(class118, class98, class527, -345845771);
	}

	static final void method9407(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_168_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (i > 700 || i_168_ > 700)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 256;
		double d = ((Math.random() * (double) (i_168_ + i) - (double) i + 800.0) / 100.0);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Math.pow(2.0, d) + 0.5);
	}

	static final void method9408(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -762135173 * client.anInt7178;
	}

	static final void method9409(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 54);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class204.method3369(class118, class98, class527, (byte) 0);
	}

	static final void method9410(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -492594917 * class118.anInt1429;
	}

	static final void method9411(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class204.method3369(class118, class98, class527, (byte) 0);
	}

	static final void method9412(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class204.method3369(class118, class98, class527, (byte) 0);
	}

	static final void method9413(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class204.method3369(class118, class98, class527, (byte) 0);
	}

	static final void method9414(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub21_8222), i, 1225101727);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -65);
		Class190.method3148((byte) 21);
		client.aBool7175 = false;
	}

	static final void method9415(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub5_8221.method12651(-1137548790);
	}

	static final void method9416(CS2Executor class527) {
		Class520.method11160(Class507.method8727(480192999), class527, 1060557669);
	}

	static final void method9417(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 89);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub21_Sub1.method15474(class118, class98, class527, (byte) 91);
	}

	static final void method9418(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 98);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub21_Sub1.method15474(class118, class98, class527, (byte) 75);
	}

	static final void method9419(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub21_Sub1.method15474(class118, class98, class527, (byte) 118);
	}

	static final void method9420(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (-1524615769 * (((NPC) class527.animable).aClass409_10580.anInt4856));
	}

	static final void method9421(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1310 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1006343589);
		class118.anInt1307 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 1860732359);
	}

	static final void method9422(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1310 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1006343589);
		class118.anInt1307 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 1860732359);
	}

	static final void method9423(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1310 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1006343589);
		class118.anInt1307 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 1860732359);
	}

	static final void method9424(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class383.method6513(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1246380252), 200, -324172845);
	}

	static final void method9425(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 41);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class339.method6045(class118, class98, class527, (byte) -109);
	}

	static final void method9426(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class339.method6045(class118, class98, class527, (byte) -109);
	}

	static final void method9427(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class339.method6045(class118, class98, class527, (byte) -16);
	}

	static final void method9428(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class339.method6045(class118, class98, class527, (byte) -47);
	}

	static final void method9429(CS2Executor class527) {
		Class283.anInt3384 = 0;
	}

	static final void method9430(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_169_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_169_ >= 1 && i_169_ <= 10)
			class118.method2039(i_169_ - 1, i, -995974388);
	}

	static final void method9431(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 28);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class47_Sub1.method14482(class118, class98, class527, 1695413908);
	}

	static final void method9432(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		class118.anInt1289 = (class527.intStack[class527.anInt7012 * 1942118537]) * 1000406043;
		class118.anInt1375 = 657648623 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class109.method1858(class118, (byte) -67);
		Class44.method913(class98, class118, (byte) 1);
		if (0 == -2131393857 * class118.anInt1268)
			Class12.method483(class98, class118, false, -399176102);
	}

	static final void method9433(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class47_Sub1.method14482(class118, class98, class527, -671089922);
	}

	static final void method9434(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class47_Sub1.method14482(class118, class98, class527, 498309954);
	}

	static final void method9435(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_170_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class515.method8861(i, i_170_, true, 754672834);
	}

	static final void method9436(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aString1338 = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
	}

	static final void method9437(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12622(1773860345) ? 1 : 0;
	}

	static final void method9438(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		class527.anInt7012 -= 283782002;
		Class119.method2074((String) (class527.objectStack[class527.anInt7000 * 1806726141]), (String) (class527.objectStack[1 + 1806726141 * class527.anInt7000]), (class527.intStack[1942118537 * class527.anInt7012]), 1 == (class527.intStack[class527.anInt7012 * 1942118537 + 1]), (byte) 4);
	}

	static final void method9439(CS2Executor class527) {
		class527.aLongArray6996[(class527.unknown[301123709 * class527.instrPtr])] = (class527.aLongArray7003[((class527.anInt7001 -= -1188480575) * 1820448321)]);
	}

	static final void method9440(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class453.method7547(class118, class98, class527, 1267174296);
	}

	static final void method9441(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class453.method7547(class118, class98, class527, 1150953753);
	}

	static final void method9442(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_171_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 236096688);
		if (i_171_ >= 1 && i_171_ <= 5 && null != class425.groundOptions[i_171_ - 1])
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class425.groundOptions[i_171_ - 1];
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method9443(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1378 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 125067541);
	}

	static final void method9444(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 456793949 * Class9.anInt72;
	}

	static final void method9445(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_172_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (i != -1) {
			if (i_172_ > 255)
				i_172_ = 255;
			else if (i_172_ < 0)
				i_172_ = 0;
			Class93.method1575(i, i_172_, false, 733762718);
		}
	}

	static final void method9446(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		WorldMapAreaDefs class220 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 1089527151);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class220.anInt2722 * 1172439539;
	}

	static final void method9447(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class84.myPlayer.aClass19_10359.method578((byte) 2) >> 3;
	}

	static final void method9448(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class241.method4149(class118, class98, class527, 333659866);
	}

	static final void method9449(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 21);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1312 * 682782159;
	}

	static final void method9450(Class118 class118, int i, int i_173_, CS2Executor class527) {
		if (null == class118.anIntArray1267) {
			if (i_173_ > 0) {
				class118.aByteArrayArray1366 = new byte[11][];
				class118.aByteArrayArray1367 = new byte[11][];
				class118.anIntArray1395 = new int[11];
				class118.anIntArray1267 = new int[11];
			} else
				return;
		}
		class118.anIntArray1267[i] = i_173_;
		if (i_173_ > 0)
			class118.aBool1424 = true;
		else {
			class118.aBool1424 = false;
			for (int i_174_ = 0; i_174_ < class118.aByteArrayArray1366.length; i_174_++) {
				if (class118.aByteArrayArray1366[i_174_] != null || class118.anIntArray1267[i_174_] > 0) {
					class118.aBool1424 = true;
					break;
				}
			}
		}
	}

	static final void method9451(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 20);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class529.method11337(class118, class98, class527, -1561861433);
	}

	static final void method9452(Class118 class118, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = ((class527.intStack[1942118537 * class527.anInt7012]) - 1);
		int i_175_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (i < 0 || i > 9)
			throw new RuntimeException();
		Class274.method4883(class118, i, i_175_, class527, -838566564);
	}

	static final void method9453(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_176_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i, (byte) 0);
		if (i_176_ != -1741480635 * class437.anInt5337)
			class118.method1999(i, i_176_, -1116057200);
		else
			class118.method1995(i, -1265527536);
	}

	static final void method9454(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -574868913 * client.anInt7416;
	}

	static final void method9455(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 120);
		Class475.method7927(class118, class527, (byte) -33);
	}

	static final void method9456(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 39);
		Class475.method7927(class118, class527, (byte) -127);
	}

	static final void method9457(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 80);
		Class475.method7927(class118, class527, (byte) -68);
	}

	static final void method9458(CS2Executor class527) {
		Class76.method1361((byte) -36);
		Class20.aBool187 = false;
	}

	static final void method9459(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class475.method7927(class118, class527, (byte) -72);
	}

	static final void method9460(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class475.method7927(class118, class527, (byte) -9);
	}

	static final void method9461(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class291.aClass282_Sub50_Sub6_3491 != null ? Class291.aClass282_Sub50_Sub6_3491.anInt9536 * 1864297169 : -1);
	}

	static final void method9462(Class118 class118, CS2Executor class527) {
		int i = 10;
		int i_177_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class274.method4883(class118, i, i_177_, class527, -838566564);
	}

	static final void method9463(Class118 class118, CS2Executor class527) {
		int i = 10;
		int i_178_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class274.method4883(class118, i, i_178_, class527, -838566564);
	}

	static final void method9464(Class118 class118, CS2Executor class527) {
		int i = 10;
		int i_179_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class274.method4883(class118, i, i_179_, class527, -838566564);
	}

	static final void method9465(CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8208), bool ? 2 : 1, 1823751701);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8209), bool ? 2 : 1, -1493833992);
		Class405.method6823(-734889653);
		Class190.method3148((byte) 53);
		client.aBool7175 = false;
	}

	static final void method9466(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 125);
		Class96_Sub10.method14605(class118, class527, (byte) -75);
	}

	static final void method9467(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class96_Sub10.method14605(class118, class527, (byte) -95);
	}

	static final void method9468(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class96_Sub10.method14605(class118, class527, (byte) -87);
	}

	static final void method9469(Class118 class118, byte[] is, byte[] is_180_, CS2Executor class527) {
		int i = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (i < 0 || i > 9)
			throw new RuntimeException();
		Class445.method7429(class118, i, is, is_180_, class527, -226902946);
	}

	static final void method9470(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		byte[] is = { (byte) class527.intStack[class527.anInt7012 * 1942118537] };
		byte[] is_181_ = { (byte) class527.intStack[1 + 1942118537 * class527.anInt7012] };
		int i = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class118 class118 = Class117.method1981(i, (byte) 88);
		Class107.method1838(class118, is, is_181_, class527, 1844755981);
	}

	static final void method9471(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		byte[] is = { (byte) class527.intStack[class527.anInt7012 * 1942118537] };
		byte[] is_182_ = { (byte) class527.intStack[1 + 1942118537 * class527.anInt7012] };
		int i = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class118 class118 = Class117.method1981(i, (byte) 112);
		Class107.method1838(class118, is, is_182_, class527, 1844755981);
	}

	static final void method9472(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub21_Sub1.method15474(class118, class98, class527, (byte) 103);
	}

	static final void method9473(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.anInt7012 -= 1418910010;
		byte[] is = null;
		byte[] is_183_ = null;
		int i;
		for (i = 0; (i < 10 && (class527.intStack[1942118537 * class527.anInt7012 + i]) >= 0); i += 2) {
			/* empty */
		}
		if (i > 0) {
			is = new byte[i / 2];
			is_183_ = new byte[i / 2];
			for (i -= 2; i >= 0; i -= 2) {
				is[i / 2] = (byte) (class527.intStack[i + (1942118537 * class527.anInt7012)]);
				is_183_[i / 2] = (byte) (class527.intStack[1 + ((class527.anInt7012 * 1942118537) + i)]);
			}
		}
		Class107.method1838(class118, is, is_183_, class527, 1844755981);
	}

	static final void method9474(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1168489751) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1271 = Class351.method6193(string, class527, 257641472);
		class118.aBool1384 = true;
	}

	static final void method9475(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = 10;
		byte[] is = { (byte) class527.intStack[class527.anInt7012 * 1942118537] };
		byte[] is_184_ = { (byte) class527.intStack[1942118537 * class527.anInt7012 + 1] };
		Class445.method7429(class118, i, is, is_184_, class527, -277305324);
	}

	static final void method9476(CS2Executor class527) {
		int i = Class393.aClass282_Sub54_4783.aClass468_Sub27_8208.method12952((byte) 39);
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub27_8209, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 0 : i, 950133770);
		Class405.method6823(-734889653);
	}

	static final void method9477(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1587441730).anInt5065 * 1247220121);
	}

	static final void method9478(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.aString7426 != null && i < Class459.anInt5534 * -1772444859)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i].aString2129;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method9479(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub11.method12209(class118, class98, class527, 1467575804);
	}

	static final void method9480(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_185_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (i == 99)
			Class209.method3598(string, -1538949261);
		else if (98 == i)
			Class240.method4140(string, -1844384884);
		else
			Class191.method3167(i, i_185_, "", "", "", string, 19012607);
	}

	static final void method9481(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub13_8225, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 1470313747);
		Class190.method3148((byte) 60);
		client.aBool7175 = false;
	}

	static final void method9482(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1309 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -511891533);
	}

	static final void method9483(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 126);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class174.method2955(class118, class98, class527, (byte) 0);
	}

	static final void method9484(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 79);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class174.method2955(class118, class98, class527, (byte) 0);
	}

	static final void method9485(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class174.method2955(class118, class98, class527, (byte) 0);
	}

	static final void method9486(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class174.method2955(class118, class98, class527, (byte) 0);
	}

	static final void method9487(CS2Executor class527) {
		if (Class282_Sub13.aClass61_7587 != null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
			class527.aClass61_7010 = Class282_Sub13.aClass61_7587;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9488(CS2Executor class527) {
		if (Class233.anInt2880 * -638562019 == 2)
			Class188.aBool2378 = true;
		else if (-638562019 * Class233.anInt2880 == 1)
			Class188.aBool2377 = true;
		else if (Class233.anInt2880 * -638562019 == 3)
			Class188.aBool2372 = true;
	}

	static final void method9489(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class527.aClass61_7010.aStringArray639[i];
	}

	static final void method9490(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.method1987(42315622);
	}

	static final void method9491(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 68);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class468_Sub2.method12630(class118, class98, class527, 1465627737);
	}

	static final void method9492(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 40);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class468_Sub2.method12630(class118, class98, class527, 1465627737);
	}

	static final void method9493(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class453.method7547(class118, class98, class527, 1963552865);
	}

	static final void method9494(CS2Executor class527) {
		int i = Class84.myPlayer.aByte7967;
		Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(861531253);
		int i_186_ = (1948093437 * class219.anInt2711 + ((int) class385.aFloat4671 >> 9));
		int i_187_ = (((int) class385.aFloat4673 >> 9) + class219.anInt2712 * -1002240017);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_187_ + ((i << 28) + (i_186_ << 14));
	}

	static final void method9495(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[class527.anInt7012 * 1942118537]) == (class527.intStack[1 + class527.anInt7012 * 1942118537]))
			class527.instrPtr += (-1051529003 * (class527.unknown[class527.instrPtr * 301123709]));
	}

	static final void method9496(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (-1 == i)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i, (byte) 8);
		if (class431.aChar5140 != 's')
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class431.method7228(string, (byte) -29) ? 1 : 0;
	}

	static final void method9497(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 58);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub17_Sub4.method15409(class118, class98, class527, -2139181277);
	}

	static final void method9498(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 650957543).anInt5047 * 1718037007);
	}

	static final void method9499(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		if (((UnderlayDefinition) class513).aClass118_5886.anInt1288 * 1924549737 == -1) {
			if (class527.aBool7022)
				throw new RuntimeException("");
			throw new RuntimeException("");
		}
		Class118 class118 = class513.method8772(451484671);
		class118.aClass118Array1438[1924549737 * (((UnderlayDefinition) class513).aClass118_5886.anInt1288)] = null;
		Class109.method1858(class118, (byte) -16);
	}

	static final void method9500(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub17_Sub4.method15409(class118, class98, class527, -1023493793);
	}

	static final void method9501(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub17_Sub4.method15409(class118, class98, class527, -1566108824);
	}

	static final void method9502(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub17_Sub4.method15409(class118, class98, class527, 277503818);
	}

	static final void method9503(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1410163689) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1389 = Class351.method6193(string, class527, -414391653);
		class118.aBool1384 = true;
	}

	static final void method9504(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 71);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class185.method3078(class118, class98, class527, 1340196119);
	}

	static final void method9505(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 62);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class185.method3078(class118, class98, class527, 1557913906);
	}

	static final void method9506(CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0);
		if (Class84.myPlayer.playerAppearance != null)
			Class84.myPlayer.playerAppearance.method4003(bool, -794449734);
	}

	static void method9507(String string, String string_188_, String string_189_, boolean bool, boolean bool_190_) {
		Class184 class184 = Class468_Sub20.method12807(934918492);
		if (class184.method3053((byte) -68) != null) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4543, class184.aClass432_2283, -527580995);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((Class108.method1846(string, -128079910) + Class108.method1846(string_188_, -1607965439) + Class108.method1846(string_189_, -901185301) + 1), 1417031095);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_188_);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_189_);
			int i = 0;
			if (bool)
				i |= 0x1;
			if (bool_190_)
				i |= 0x2;
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			class184.method3049(class282_sub23, 1052447382);
		}
	}

	static final void method9508(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class185.method3078(class118, class98, class527, 106618671);
	}

	static final void method9509(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class185.method3078(class118, class98, class527, 1964252891);
	}

	static final void method9510(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 2074405837) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1302 = Class351.method6193(string, class527, 1633524132);
		class118.aBool1384 = true;
	}

	static final void method9511(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1288 * 1924549737;
	}

	static final void method9512(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1334854505 * client.anInt7422;
	}

	static final void method9513(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 749641370) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1390 = Class351.method6193(string, class527, 372274626);
		class118.aBool1384 = true;
	}

	static final void method9514(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 2092348911) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1390 = Class351.method6193(string, class527, 1559714199);
		class118.aBool1384 = true;
	}

	static final void method9515(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int[] is = Class96_Sub14.method14642(string, class527, 538753340);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1397 = Class351.method6193(string, class527, -191118098);
		class118.anIntArray1401 = is;
		class118.aBool1384 = true;
	}

	static final void method9516(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		TilestreamPacket.method6289(class118, class98, class527, (byte) -64);
	}

	static final void method9517(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		TilestreamPacket.method6289(class118, class98, class527, (byte) -56);
	}

	static final void method9518(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class237.method3987(class118, class98, class527, -5710073);
	}

	static final void method9519(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 781454833) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1451 = Class351.method6193(string, class527, 402422882);
		class118.aBool1384 = true;
	}

	static final void method9520(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1452791236) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1451 = Class351.method6193(string, class527, 1323872433);
		class118.aBool1384 = true;
	}

	static final void method9521(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -120);
	}

	static final void method9522(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class84.myPlayer.anInt10565 * -1880473919);
	}

	static final void method9523(CS2Executor class527) {
		if (-1353302673 * client.anInt7319 >= 5 && -1353302673 * client.anInt7319 <= 9)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = client.anInt7319 * -1353302673;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9524(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_191_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		int i_192_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class282_Sub50_Sub9 class282_sub50_sub9 = IndexLoaders.aClass429_4265.method7214(i, -2093921432);
		if ((class282_sub50_sub9.method14918(i_191_, -1427856224).anInt2997 * -1869685303) != 0)
			throw new RuntimeException("");
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class282_sub50_sub9.method14901(i_191_, i_192_, 2076874213);
	}

	static final void method9525(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class52.method1083(class118, class98, class527, -1250124563);
	}

	static final void method9526(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class52.method1083(class118, class98, class527, -1250124563);
	}

	static final void method9527(CS2Executor class527) {
		int i = Class96_Sub14.method14641(-845419318);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class233.anInt2880 = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1729103212) * -1499268811) * -638562019;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -113);
		Class190.method3148((byte) 44);
		client.aBool7175 = false;
	}

	static final void method9528(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1614505717) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1396 = Class351.method6193(string, class527, 2139345924);
		class118.aBool1384 = true;
	}

	static final void method9529(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1277 * 442725395;
	}

	static final void method9530(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub9.method14586(class118, class98, class527, 909686877);
	}

	static final void method9531(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Class462.aStringArray5548[i] = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
		Class282_Sub20_Sub10.method15263(i, (byte) -84);
	}

	static final void method9532(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 121);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class388.method6689(class118, class98, class527, -1758093892);
	}

	static final void method9533(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 118);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class388.method6689(class118, class98, class527, 1911087645);
	}

	static final void method9534(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644);
	}

	static final void method9535(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, -278931841) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1409 = Class351.method6193(string, class527, 1857069630);
		class118.aBool1384 = true;
	}

	static final void method9536(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub14_8211), i, -902314963);
			Class190.method3148((byte) 61);
			client.aBool7175 = false;
		}
	}

	static final void method9537(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 83);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class240.method4136(class118, class98, class527, (byte) 85);
	}

	static final void method9538(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 868362545) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1410 = Class351.method6193(string, class527, 160627401);
		class118.aBool1384 = true;
	}

	static final void method9539(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 868965641) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1410 = Class351.method6193(string, class527, 44245354);
		class118.aBool1384 = true;
	}

	static final void method9540(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 58);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1376 * -354780671;
	}

	static final void method9541(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class44.method910(class118, class98, class527, 1956651275);
	}

	static final void method9542(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 550045749) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1394 = Class351.method6193(string, class527, 165735123);
		class118.aBool1384 = true;
	}

	static final void method9543(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 364717795) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1394 = Class351.method6193(string, class527, -304830631);
		class118.aBool1384 = true;
	}

	static final void method9544(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 73);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class151.method2593(class118, class98, class527, -1843260979);
	}

	static final void method9545(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 27);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class151.method2593(class118, class98, class527, -1811635391);
	}

	static final void method9546(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class151.method2593(class118, class98, class527, -1826652511);
	}

	static final void method9547(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1828248032) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1319 = Class351.method6193(string, class527, -326174309);
		class118.aBool1384 = true;
	}

	static final void method9548(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 84);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class169.method2874(class118, class98, class527, (byte) 30);
	}

	static final void method9549(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class169.method2874(class118, class98, class527, (byte) 33);
	}

	static final void method9550(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class169.method2874(class118, class98, class527, (byte) 13);
	}

	static final void method9551(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 597962193) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1278 = Class351.method6193(string, class527, 671934006);
		class118.aBool1384 = true;
	}

	static final void method9552(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -274659233 * Class9.anInt112;
	}

	static final void method9553(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1364417295);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14778(i >> 28 & 0x3, i >> 14 & 0x3fff, i & 0x3fff, anIntArray5900, -1662899450);
			if (bool)
				Class8_Sub2.method14263(anIntArray5900[1], anIntArray5900[2], (byte) 0);
		}
	}

	static final void method9554(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 32);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Language.method8277(class118, class98, class527, 906288292);
	}

	static final void method9555(CS2Executor class527) {
		Class337.method6018((class527.animable), class527, 1549030248);
	}

	static final void method9556(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class380.method6453(class118, class98, class527, -185534065);
	}

	static final void method9557(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class380.method6453(class118, class98, class527, -288093641);
	}

	static final void method9558(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class202.method3338(class118, class98, class527, (byte) 120);
	}

	static final void method9559(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 20);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class202.method3338(class118, class98, class527, (byte) 88);
	}

	static final void method9560(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (i < 0 || i > 9)
			class527.anInt7000 -= 1476624725;
		else
			class118.method1994(i, (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), (byte) -23);
	}

	static final void method9561(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 55);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class202.method3338(class118, class98, class527, (byte) 126);
	}

	static final void method9562(CS2Executor class527) {
		class527.intStack[class527.anInt7012 * 1942118537 - 1] = (class527.aClass282_Sub4_7011.method12095(1925516350)[(class527.intStack[class527.anInt7012 * 1942118537 - 1])]);
	}

	static final void method9563(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 101);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		ReferenceTable.method5763(class118, class98, class527, -1335724325);
	}

	static final void method9564(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class202.method3338(class118, class98, class527, (byte) 121);
	}

	static final void method9565(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 94);
		if (-1 != -56249735 * class118.anInt1426)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class118.anInt1427 * 6040081;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9566(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class202.method3338(class118, class98, class527, (byte) 66);
	}

	static final void method9567(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		NamedFileReference.method869(class118, class98, class527, -1797508169);
	}

	static final void method9568(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Class282_Sub50_Sub17.method15508(-333515116).toString();
	}

	static final void method9569(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 96);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class100.method1642(class118, class98, class527, 1805775239);
	}

	static final void method9570(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub15_8203, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 226978444);
		Class190.method3148((byte) 72);
	}

	static final void method9571(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		class527.anInt7012 -= 283782002;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_193_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		String string_194_ = (String) (class527.objectStack[1 + 1806726141 * class527.anInt7000]);
		Class96_Sub19.method14666(string, i == 1, i_193_, string_194_, 777926734);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method9572(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 38);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class100.method1642(class118, class98, class527, -1761753710);
	}

	static final void method9573(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 18);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class100.method1642(class118, class98, class527, -1063972719);
	}

	static final void method9574(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1323 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -848451677);
		Class109.method1858(class118, (byte) -25);
	}

	static final void method9575(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1327 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) -65);
	}

	static final void method9576(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1277 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 204895771);
		Class109.method1858(class118, (byte) 52);
		if (1924549737 * class118.anInt1288 == -1 && !class98.aBool999)
			Game.method8207(-1952846363 * class118.anInt1287, -1917072049);
	}

	static final void method9577(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1350465504) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1412 = Class351.method6193(string, class527, 1631767232);
		class118.aBool1384 = true;
	}

	static final void method9578(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (i == -1)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i, (byte) 8);
		if ('s' != class431.aChar5140)
			throw new RuntimeException();
		int[] is = class431.method7251(string, 2115965997);
		int i_195_ = 0;
		if (null != is)
			i_195_ = is.length;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_195_;
	}

	static final void method9579(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class215.method3672(class118, class98, class527, (short) 4890);
	}

	static final void method9580(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 102);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class283.method5009(class118, class98, class527, -1934352719);
	}

	static final void method9581(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1897969024) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1292 = Class351.method6193(string, class527, -495952969);
		class118.aBool1384 = true;
	}

	static final void method9582(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		int i_196_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_196_ < 0 || i_196_ >= class527.globalArrayLengths[i])
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.globalArrays[i][i_196_];
	}

	static final void method9583(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1651917161) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1292 = Class351.method6193(string, class527, 824828792);
		class118.aBool1384 = true;
	}

	static final void method9584(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_197_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_198_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class159.method2738((class527.animable.aClass98_10324), i & 0xffff, i_197_, i_198_, class527.aBool7022, class527, -1306169472);
	}

	static final void method9585(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class47_Sub1.aClass262_9143.method4639("jagtheora", (short) 255) ? 1 : 0);
	}

	static final void method9586(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class262.method4651(class118, class98, class527, (byte) 60);
	}

	static final void method9587(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class262.method4651(class118, class98, class527, (byte) 9);
	}

	static final void method9588(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class262.method4651(class118, class98, class527, (byte) 104);
	}

	static final void method9589(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class262.method4651(class118, class98, class527, (byte) 84);
	}

	static final void method9590(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1957655950) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1415 = Class351.method6193(string, class527, 1450424898);
		class118.aBool1384 = true;
	}

	static final void method9591(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, -148070700) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1415 = Class351.method6193(string, class527, 2003983414);
		class118.aBool1384 = true;
	}

	static final void method9592(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 99);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class346.method6158(class118, class98, class527, 676602438);
	}

	static final void method9593(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 75);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class346.method6158(class118, class98, class527, -1070130487);
	}

	static final void method9594(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 89);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class346.method6158(class118, class98, class527, -1290422351);
	}

	static final void method9595(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class100.method1642(class118, class98, class527, -428914127);
	}

	static final void method9596(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != -1)
			Class123.method2152(i, -282942076);
	}

	static final void method9597(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 2061170233) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1416 = Class351.method6193(string, class527, 1000825384);
		class118.aBool1384 = true;
	}

	static final void method9598(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 100);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class204.method3366(class118, class98, class527, (byte) -5);
	}

	static final void method9599(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class204.method3366(class118, class98, class527, (byte) -110);
	}

	static final void method9600(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		UnderlayDefinition class513;
		if (class527.aBool7022)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class513.method8764(i, -1, -1290054035) ? 1 : 0;
	}

	static final void method9601(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class204.method3366(class118, class98, class527, (byte) -6);
	}

	static final void method9602(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, -186905476) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1419 = Class351.method6193(string, class527, -172735320);
		class118.aBool1384 = true;
	}

	static final void method9603(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1516736235) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1419 = Class351.method6193(string, class527, 1359588680);
		class118.aBool1384 = true;
	}

	static final void method9604(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 26);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class263.method4772(class118, class98, class527, (byte) 16);
	}

	static final void method9605(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 102);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class263.method4772(class118, class98, class527, (byte) 21);
	}

	static final void method9606(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 5);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class263.method4772(class118, class98, class527, (byte) -7);
	}

	static final void method9607(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class263.method4772(class118, class98, class527, (byte) 22);
	}

	static final void method9608(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aClass330Array7428[i].method5909(1586883685);
	}

	static final void method9609(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1546553815) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1421 = Class351.method6193(string, class527, 2082617908);
		class118.aBool1384 = true;
	}

	static final void method9610(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_199_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_200_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(8, i << 16 | i_199_, i_200_, "", (byte) 40);
	}

	static final void method9611(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt106 * -1378127363;
	}

	static final void method9612(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method501(class118, class98, class527, (byte) 61);
	}

	static final void method9613(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 122);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class473.method7889(class118, class98, class527, 1072784051);
	}

	static final void method9614(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class473.method7889(class118, class98, class527, 1072784051);
	}

	static final void method9615(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1453 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 542423029);
		Class109.method1858(class118, (byte) 103);
	}

	static final void method9616(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1391612979) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1361 = Class351.method6193(string, class527, 833235645);
		class118.aBool1384 = true;
	}

	static final void method9617(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 20);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class388.method6690(class118, class98, class527, (byte) 85);
	}

	static final void method9618(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class388.method6690(class118, class98, class527, (byte) 70);
	}

	static final void method9619(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 820329317) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1353 = Class351.method6193(string, class527, 791249267);
		class118.aBool1384 = true;
	}

	static {
		anIntArray5900 = new int[3];
		aClass229_5901 = new SoftCache(4);
		aBool5898 = false;
		aString5897 = null;
		anArrayList5903 = new ArrayList();
		anInt5905 = 0;
		anInt5906 = 0;
	}

	static final void method9620(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 126);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub17.method14653(class118, class98, class527, -1229087597);
	}

	static final void method9621(CS2Executor class527) {
		Class242.method4166(9037895);
	}

	static final void method9622(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 126);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub17.method14653(class118, class98, class527, -2084045255);
	}

	static final void method9623(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 120);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub17.method14653(class118, class98, class527, -1806519337);
	}

	static final void method9624(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class6.method304(-1443843795);
	}

	static final void method9625(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (string.startsWith(Class76.method1358(0, (byte) 0)) || string.startsWith(Class76.method1358(1, (byte) 0)))
			string = string.substring(7);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class230.method3910(string, -555098945);
	}

	static final void method9626(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[class527.anInt7012 * 1942118537]) == (class527.intStack[1 + class527.anInt7012 * 1942118537]))
			class527.instrPtr += (-1051529003 * (class527.unknown[class527.instrPtr * 301123709]));
	}

	static final void method9627(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_201_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_202_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(2, i << 16 | i_201_, i_202_, "", (byte) 48);
	}

	static final void method9628(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class159.aClass450_2010.worldId * -87869981;
	}

	static final void method9629(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		String string_203_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string_203_;
	}

	static final void method9630(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 104);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class108.method1845(class118, class98, class527, -27661628);
	}

	static final void method9631(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 45);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class108.method1845(class118, class98, class527, -1611886246);
	}

	static final void method9632(CS2Executor class527) {
		if (0 != -1741204137 * client.anInt7166 || JS5CacheFile.method3360((byte) -5))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else if (Class448.aBool5422)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else if (8133049586794585531L * Class448.aLong5425 > Class169.method2869(1667843530) - 1000L)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else {
			Class448.aBool5422 = true;
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4613, client.aClass184_7218.aClass432_2283, -622442218);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(Class418.anInt4999 * 4249963);
			client.aClass184_7218.method3049(class282_sub23, -1230991485);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		}
	}

	static final void method9633(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class108.method1845(class118, class98, class527, -179506432);
	}

	static final void method9634(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class108.method1845(class118, class98, class527, -1585068187);
	}

	static final void method9635(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_204_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_204_ >= 1 && i_204_ <= 10)
			class118.method2039(i_204_ - 1, i, 1519297132);
	}

	static final void method9636(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(i);
		if (class282_sub50_sub6 == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub6.anInt9542 * -1337359695;
	}

	static final void method9637(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 2);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class13.method502(class118, class98, class527, 382223063);
	}

	static final void method9638(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 51);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class13.method502(class118, class98, class527, 507624103);
	}

	static final void method9639(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 5);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class13.method502(class118, class98, class527, -2036594085);
	}

	static final void method9640(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class152.method2603(string, -671341252);
	}

	static final void method9641(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method502(class118, class98, class527, -1223826722);
	}

	static final void method9642(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class184 class184 = Class468_Sub20.method12807(962869120);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4541, class184.aClass432_2283, 1041497030);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, -1229174875);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), -314743752);
		class184.method3049(class282_sub23, 608843083);
	}

	static final void method9643(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int[] is = Class96_Sub14.method14642(string, class527, 1542958787);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1405 = Class351.method6193(string, class527, 54184837);
		class118.anIntArray1406 = is;
		class118.aBool1384 = true;
	}

	static final void method9644(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 64);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class363.method6288(class118, class98, class527, (short) 12829);
	}

	static final void method9645(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class363.method6288(class118, class98, class527, (short) 8367);
	}

	static final void method9646(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1314 * -37350919;
	}

	static final void method9647(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class363.method6288(class118, class98, class527, (short) 18715);
	}

	static final void method9648(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (2 == 1609086245 * client.anInt7434 && i >= 0 && i < client.anInt7449 * 493536965)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -315765031 * client.aClass6Array7452[i].anInt42;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9649(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, -326422661) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1393 = Class351.method6193(string, class527, -412249360);
		class118.aBool1384 = true;
	}

	static final void method9650(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 108);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class13.method506(class118, class98, class527, -302784511);
	}

	static final void method9651(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		DefaultsFile.method11221(class118, class98, class527, -2007218506);
	}

	static final void method9652(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[class527.anInt7012 * 1942118537]) == (class527.intStack[1 + class527.anInt7012 * 1942118537]))
			class527.instrPtr += (-1051529003 * (class527.unknown[class527.instrPtr * 301123709]));
	}

	static final void method9653(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1274584051) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1383 = Class351.method6193(string, class527, 41820840);
		class118.aBool1384 = true;
	}

	static final void method9654(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Login.method5017(class118, class98, class527, -974856399);
	}

	static final void method9655(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 66);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class175.method2960(class118, class98, class527, 2126736130);
	}

	static final void method9656(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Login.method5017(class118, class98, class527, -974856399);
	}

	static final void method9657(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 21527996) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1418 = Class351.method6193(string, class527, -473929460);
		class118.aBool1384 = true;
	}

	static final void method9658(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 239763625) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1418 = Class351.method6193(string, class527, 462409744);
		class118.aBool1384 = true;
	}

	static final void method9659(Class118 class118, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_205_ = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (class118.anInt1329 * 2131324949 != 2)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(class118.anInt1330 * -402732635, (byte) -78);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, false);
		class118.aClass417_1308.aLong4993 = Class86.method1480(-1869019129) * 7197667099348947907L;
		if (i_205_ < 0 || i_205_ >= class409.anIntArray4860.length)
			throw new RuntimeException("");
		class118.aClass417_1308.anIntArray4992[i_205_] = i;
		Class109.method1858(class118, (byte) 16);
	}

	static final void method9660(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class306.method5455(class118, class98, class527, -241755138);
	}

	static final void method9661(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt103 * 327149175;
	}

	static final void method9662(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub20_Sub9.method15256(class118, class98, class527, -336817628);
	}

	static final void method9663(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class172.method2915(class118, class98, class527, (byte) 0);
	}

	static final void method9664(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class15.method542(class118, class98, class527, -1679990074);
	}

	static final void method9665(CS2Executor class527) {
		Class119.method2077(606786410);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -47);
		Class190.method3148((byte) 88);
		client.aBool7175 = false;
	}

	public static void method9666(Class118[] class118s) {
		for (int i = 0; i < class118s.length; i++) {
			Class118 class118 = class118s[i];
			if (null != class118.anObjectArray1318) {
				Class282_Sub43 class282_sub43 = new Class282_Sub43();
				class282_sub43.aClass118_8053 = class118;
				class282_sub43.anObjectArray8054 = class118.anObjectArray1318;
				Class400.method6794(class282_sub43, 2000000, (byte) 6);
			}
		}
	}

	static final void method9667(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_206_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.aClass429_4265.method7214(i, -1945810052).anIntArray9624[i_206_]);
	}

	static final void method9668(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1299 * 597157617;
	}

	static final void method9669(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1428 * 198275475;
	}

	static final void method9670(CS2Executor class527) {
		if (-1353302673 * client.anInt7319 >= 5 && -1353302673 * client.anInt7319 <= 9)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = client.anInt7319 * -1353302673;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9671(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1428 * 198275475;
	}

	static final void method9672(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1301 * 1506818197;
	}

	static final void method9673(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1301 * 1506818197;
	}

	static final void method9674(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 71);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class52.method1083(class118, class98, class527, -1250124563);
	}

	static final void method9675(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -492594917 * class118.anInt1429;
	}

	public static void method9676(Class397 class397, int i, int i_207_, Animable class521_sub1_sub1_sub2, int i_208_) {
		CS2Executor class527 = Class125.method2167(1310372103);
		class527.animable = class521_sub1_sub1_sub2;
		class527.anInt7004 = 2000547059 * i_208_;
		Class107.method1834(class397, i, i_207_, class527, (byte) 52);
		class527.animable = null;
		class527.anInt7004 = -2000547059;
	}

	static final void method9677(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -492594917 * class118.anInt1429;
	}

	static final void method9678(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -492594917 * class118.anInt1429;
	}

	static final void method9679(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.aBool1306 ? 1 : 0;
	}

	static final void method9680(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.aBool1306 ? 1 : 0;
	}

	static final void method9681(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 2110532063 * class118.anInt1305;
	}

	static final void method9682(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class118 class118_209_ = Class96_Sub23.method14682(class98, class118, -838454718);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (null == class118_209_ ? -1 : class118_209_.anInt1287 * -1952846363);
	}

	static final void method9683(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class118 class118_210_ = Class96_Sub23.method14682(class98, class118, -838454718);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (null == class118_210_ ? -1 : class118_210_.anInt1287 * -1952846363);
	}

	static final void method9684(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		CS2Script class282_sub50_sub5 = Class286.method5049(i, -486575140);
		if (class282_sub50_sub5 == null)
			throw new RuntimeException();
		int[] is = new int[693687803 * class282_sub50_sub5.intLocalsCount];
		Object[] objects = new Object[1886892247 * class282_sub50_sub5.stringLocalsCount];
		long[] ls = new long[-684160137 * class282_sub50_sub5.longLocalsCount];
		for (int i_211_ = 0; i_211_ < -1312392163 * class282_sub50_sub5.intArgsCount; i_211_++)
			is[i_211_] = (class527.intStack[i_211_ + (class527.anInt7012 * 1942118537 - class282_sub50_sub5.intArgsCount * -1312392163)]);
		for (int i_212_ = 0; i_212_ < class282_sub50_sub5.stringArgsCount * 1570560503; i_212_++)
			objects[i_212_] = (class527.objectStack[i_212_ + (1806726141 * class527.anInt7000 - 1570560503 * class282_sub50_sub5.stringArgsCount)]);
		for (int i_213_ = 0; i_213_ < -2105377515 * class282_sub50_sub5.longArgsCount; i_213_++)
			ls[i_213_] = (class527.aLongArray7003[i_213_ + (1820448321 * class527.anInt7001 - -2105377515 * class282_sub50_sub5.longArgsCount)]);
		class527.anInt7012 -= 1642009077 * class282_sub50_sub5.intArgsCount;
		class527.anInt7000 -= class282_sub50_sub5.stringArgsCount * -1798384125;
		class527.anInt7001 -= class282_sub50_sub5.longArgsCount * -1483277867;
		Class509 class509 = new Class509();
		((Class509) class509).aClass282_Sub50_Sub5_5869 = class527.current;
		((Class509) class509).anInt5866 = class527.instrPtr * 2054263885;
		((Class509) class509).anIntArray5867 = class527.intLocals;
		((Class509) class509).anObjectArray5865 = class527.objectLocals;
		((Class509) class509).aLongArray5868 = class527.aLongArray6996;
		if (class527.anInt7002 * -1837903909 >= class527.aClass509Array7016.length)
			throw new RuntimeException();
		class527.aClass509Array7016[(class527.anInt7002 += -72641453) * -1837903909 - 1] = class509;
		class527.current = class282_sub50_sub5;
		class527.operations = (class527.current.operations);
		class527.unknown = class527.current.intOpValues;
		class527.instrPtr = 1051529003;
		class527.intLocals = is;
		class527.objectLocals = objects;
		class527.aLongArray6996 = ls;
	}

	static final void method9685(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 3);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1453 * 1762983005;
	}

	static final void method9686(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1264 * -795991475;
	}

	static final void method9687(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1311 * 276864765;
	}

	static final void method9688(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1312 * 682782159;
	}

	static final void method9689(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub19_8204, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, 1712829978);
		Class94.method1589((short) 255);
		IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4048(-319408570);
		Class190.method3148((byte) 95);
		client.aBool7175 = false;
	}

	static final void method9690(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class118.aString1391;
	}

	static final void method9691(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class118.aString1391;
	}

	static final void method9692(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -354780671 * class118.anInt1376;
	}

	static final void method9693(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -354780671 * class118.anInt1376;
	}

	static final void method9694(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class152.method2603(string, -671341252);
	}

	static final void method9695(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (string.startsWith(Class76.method1358(0, (byte) 0)) || string.startsWith(Class76.method1358(1, (byte) 0)))
			string = string.substring(7);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class230.method3910(string, -555098945);
	}

	static final void method9696(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1343 * -1823193031;
	}

	static final void method9697(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1627383873 * class118.anInt1385;
	}

	static final void method9698(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int[] is = Class96_Sub14.method14642(string, class527, 38112895);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1403 = Class351.method6193(string, class527, 121734195);
		class118.anIntArray1315 = is;
		class118.aBool1384 = true;
	}

	static final void method9699(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1627383873 * class118.anInt1385;
	}

	static final void method9700(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 75);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 276864765 * class118.anInt1311;
	}

	static final void method9701(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = 10;
		byte[] is = { (byte) class527.intStack[class527.anInt7012 * 1942118537] };
		byte[] is_214_ = { (byte) class527.intStack[1942118537 * class527.anInt7012 + 1] };
		Class445.method7429(class118, i, is, is_214_, class527, -616561059);
	}

	static final void method9702(CS2Executor class527) {
		Class291_Sub1.aBool8027 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
	}

	static final void method9703(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		client.anInt7340 = 96844955 * (class527.intStack[class527.anInt7012 * 1942118537]);
		client.anInt7342 = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) * 1244871605);
	}

	static final void method9704(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1453 * 1762983005;
	}

	static final void method9705(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1453 * 1762983005;
	}

	static final void method9706(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1453 * 1762983005;
	}

	static final void method9707(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1552292309 * class118.anInt1293;
	}

	static final void method9708(CS2Executor class527) {
		if (Class475.aBool5623 && Class263.aFrame3260 != null)
			Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-216205179), -1, -1, false, (byte) 50);
	}

	static final void method9709(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1552292309 * class118.anInt1293;
	}

	static final void method9710(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1552292309 * class118.anInt1293;
	}

	static final void method9711(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1378 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 125067541);
	}

	static final void method9712(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 539377845 * class118.anInt1334;
	}

	static final void method9713(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 539377845 * class118.anInt1334;
	}

	static final void method9714(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(1952409536) == 2 ? 1 : 0;
	}

	static final void method9715(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i, (byte) 0);
		if (class437.method7319(1941705330))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class118.method1998(i, class437.aString5335, 1626513306);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class118.method1997(i, -1741480635 * class437.anInt5337, 979735677);
	}

	static final void method9716(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1423 * -169127141;
	}

	static final void method9717(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1423 * -169127141;
	}

	static final void method9718(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class215.method3672(class118, class98, class527, (short) 9257);
	}

	static final void method9719(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (1 == class118.anInt1329 * 2131324949 ? class118.anInt1330 * -402732635 : -1);
	}

	static final void method9720(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (1 == class118.anInt1329 * 2131324949 ? class118.anInt1330 * -402732635 : -1);
	}

	static final void method9721(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1277 * 442725395;
	}

	static final void method9722(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1277 * 442725395;
	}

	static final void method9723(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = null != Class46.anObjectArray437 ? 1 : 0;
	}

	static final void method9724(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_215_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		if (null != Class84.myPlayer.playerAppearance) {
			for (int i_216_ = 0; i_216_ < Class44.anIntArray428.length; i_216_++) {
				if (Class44.anIntArray428[i_216_] == i) {
					Class84.myPlayer.playerAppearance.method3993(i_216_, i_215_, IndexLoaders.aClass31_204, -420746134);
					return;
				}
			}
			for (int i_217_ = 0; i_217_ < Class44.anIntArray422.length; i_217_++) {
				if (Class44.anIntArray422[i_217_] == i) {
					Class84.myPlayer.playerAppearance.method3993(i_217_, i_215_, IndexLoaders.aClass31_204, -1503076487);
					break;
				}
			}
		}
	}

	static final void method9725(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1277 * 442725395;
	}

	static final void method9726(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		int i = -1;
		int i_218_ = -1;
		Class119 class119 = class118.method2046(Renderers.SOFTWARE_RENDERER, -131265739);
		if (class119 != null) {
			i = class119.anInt1458 * -1125753931;
			i_218_ = class119.anInt1454 * 2069222845;
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_218_;
	}

	static final void method9727(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 442725395 * class118.anInt1277;
	}

	static final void method9728(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 442725395 * class118.anInt1277;
	}

	static final void method9729(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class96_Sub20.method14668(693230142).method243((byte) 1);
	}

	static final void method9730(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -56249735 * class118.anInt1426;
	}

	static final void method9731(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		String string_219_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		if (client.rights * -644057819 != 0 || (!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
			Class184 class184 = Class468_Sub20.method12807(1658688871);
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4542, class184.aClass432_2283, 2083783968);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(0, 1417031095);
			int i = (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			Class427.method7189(class282_sub23.aClass282_Sub35_Sub2_7682, string_219_, 537326720);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13281((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index) - i, 1201423895);
			class184.method3049(class282_sub23, -825266315);
		}
	}

	static final void method9732(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(i);
		if (class282_sub50_sub6 == null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (235539227 * class282_sub50_sub6.anInt9540 - -742910705 * class282_sub50_sub6.anInt9539);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (1097246003 * class282_sub50_sub6.anInt9535 - class282_sub50_sub6.anInt9541 * 458255425);
		}
	}

	static final void method9733(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -56249735 * class118.anInt1426;
	}

	static final void method9734(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -56249735 * class118.anInt1426;
	}

	static final void method9735(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		if (-1 != -56249735 * class118.anInt1426)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 6040081 * class118.anInt1427;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9736(Class118 class118, CS2Executor class527) {
		int i = 10;
		int i_220_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class274.method4883(class118, i, i_220_, class527, -838566564);
	}

	static final void method9737(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub1.method11614(i, 143389073);
	}

	static final void method9738(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.method11633(class118).method12179(-1542842954);
	}

	static final void method9739(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.method11633(class118).method12179(-817542178);
	}

	static final void method9740(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		i--;
		if (class118.aStringArray1352 == null || i >= class118.aStringArray1352.length || class118.aStringArray1352[i] == null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class118.aStringArray1352[i];
	}

	static final void method9741(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		i--;
		if (class118.aStringArray1352 == null || i >= class118.aStringArray1352.length || class118.aStringArray1352[i] == null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class118.aStringArray1352[i];
	}

	static final void method9742(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (2 == client.anInt7434 * 1609086245 && i < client.anInt7449 * 493536965) {
			Class6 class6 = client.aClass6Array7452[i];
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class6.aString37;
			if (class6.aString43 != null)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = class6.aString43;
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
		} else {
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method9743(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (client.aLong7153 * -8972807970865466165L >> 32);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (-8972807970865466165L * client.aLong7153 & 0xffffffffffffffffL);
	}

	static final void method9744(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class527.animable);
		int i_221_ = class521_sub1_sub1_sub2_sub2.method16163(i, -1970084902);
		int i_222_ = class521_sub1_sub1_sub2_sub2.method16169(i, (byte) -100);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_221_;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_222_;
	}

	static final void method9745(Class118 class118, CS2Executor class527) {
		if (-613817135 * class527.anInt7015 >= 10)
			throw new RuntimeException();
		if (class118.anObjectArray1271 != null) {
			Class282_Sub43 class282_sub43 = new Class282_Sub43();
			class282_sub43.aClass118_8053 = class118;
			class282_sub43.anObjectArray8054 = class118.anObjectArray1271;
			((Class282_Sub43) class282_sub43).anInt8061 = 268621789 + 859311981 * class527.anInt7015;
			client.aClass482_7402.append(class282_sub43, 1884941167);
		}
	}

	static final void method9746(Class118 class118, CS2Executor class527) {
		if (-613817135 * class527.anInt7015 >= 10)
			throw new RuntimeException();
		if (class118.anObjectArray1271 != null) {
			Class282_Sub43 class282_sub43 = new Class282_Sub43();
			class282_sub43.aClass118_8053 = class118;
			class282_sub43.anObjectArray8054 = class118.anObjectArray1271;
			((Class282_Sub43) class282_sub43).anInt8061 = 268621789 + 859311981 * class527.anInt7015;
			client.aClass482_7402.append(class282_sub43, -279033179);
		}
	}

	static final void method9747(Class118 class118, CS2Executor class527) {
		if (-613817135 * class527.anInt7015 >= 10)
			throw new RuntimeException();
		if (class118.anObjectArray1271 != null) {
			Class282_Sub43 class282_sub43 = new Class282_Sub43();
			class282_sub43.aClass118_8053 = class118;
			class282_sub43.anObjectArray8054 = class118.anObjectArray1271;
			((Class282_Sub43) class282_sub43).anInt8061 = 268621789 + 859311981 * class527.anInt7015;
			client.aClass482_7402.append(class282_sub43, -1780038600);
		}
	}

	static final void method9748(Class118 class118, CS2Executor class527) {
		if (-613817135 * class527.anInt7015 >= 10)
			throw new RuntimeException();
		if (class118.anObjectArray1271 != null) {
			Class282_Sub43 class282_sub43 = new Class282_Sub43();
			class282_sub43.aClass118_8053 = class118;
			class282_sub43.anObjectArray8054 = class118.anObjectArray1271;
			((Class282_Sub43) class282_sub43).anInt8061 = 268621789 + 859311981 * class527.anInt7015;
			client.aClass482_7402.append(class282_sub43, 1105449149);
		}
	}

	static final void method9749(Class118 class118, CS2Executor class527) {
		if (-613817135 * class527.anInt7015 >= 10)
			throw new RuntimeException();
		if (class118.anObjectArray1271 != null) {
			Class282_Sub43 class282_sub43 = new Class282_Sub43();
			class282_sub43.aClass118_8053 = class118;
			class282_sub43.anObjectArray8054 = class118.anObjectArray1271;
			((Class282_Sub43) class282_sub43).anInt8061 = 268621789 + 859311981 * class527.anInt7015;
			client.aClass482_7402.append(class282_sub43, -1110025284);
		}
	}

	static final void method9750(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 51);
		Class199.method3251(class118, class527, -1006400299);
	}

	static final void method9751(Class118 class118, CS2Executor class527) {
		Class414 class414 = class118.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_223_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_224_ = class414.method6956(class118.aString1391, 1506818197 * class118.anInt1301, -753644021 * class118.anInt1358, i_223_, i, Class182.aClass160Array2261, 2014886029);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_224_;
	}

	static final void method9752(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_225_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class521_Sub1_Sub1_Sub6.method16125(i, i_225_, false, 63781027);
	}

	static final void method9753(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 35);
		Class235.method3965(class118, class527, 1720784399);
	}

	static final void method9754(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class82.method1455(class118, class98, class527, -1784890209);
	}

	static final void method9755(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub17_8200, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0) ? 1 : 0, 1766394110);
		Class190.method3148((byte) 42);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -69);
	}

	static final void method9756(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class235.method3965(class118, class527, 45302149);
	}

	static final void method9757(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class235.method3965(class118, class527, -426745895);
	}

	static final void method9758(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1601131816) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1271 = Class351.method6193(string, class527, 499971532);
		class118.aBool1384 = true;
	}

	static final void method9759(Class118 class118, CS2Executor class527) {
		Class414 class414 = class118.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Point point = class414.method6954(class118.aString1391, 1506818197 * class118.anInt1301, class118.anInt1358 * -753644021, i, Class182.aClass160Array2261, -1794640356);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = point.x;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = point.y;
	}

	static final void method9760(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1245841078);
		if (-1 == class425.certTemplateId * -722914683 && class425.certId * 1416589415 >= 0)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class425.certId * 1416589415;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i;
	}

	static final void method9761(Class118 class118, CS2Executor class527) {
		Class414 class414 = class118.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Point point = class414.method6954(class118.aString1391, 1506818197 * class118.anInt1301, class118.anInt1358 * -753644021, i, Class182.aClass160Array2261, -1560687336);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = point.x;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = point.y;
	}

	static final void method9762(CS2Executor class527) {
		Class291_Sub1.aBool8027 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
	}

	static final void method9763(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 74);
		Node.method5001(class118, class527, -666394902);
	}

	static final void method9764(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 72);
		Node.method5001(class118, class527, -921342829);
	}

	static final void method9765(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 13);
		Node.method5001(class118, class527, -99487522);
	}

	static final void method9766(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		UnderlayDefinition class513;
		if (class527.aBool7022)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class513.method8766((class527.animable.aClass98_10324), i, -1, (byte) 1) ? 1 : 0;
	}

	static final void method9767(CS2Executor class527) {
		Class217_Sub1 class217_sub1 = Class77.method1368(-382453845);
		if (null != class217_sub1) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 157132839 * class217_sub1.anInt7975;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2700 * 1203083985;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7977;
			Class213 class213 = class217_sub1.method13055((short) -26628);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -216896281 * class213.anInt2680;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class213.aString2679;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 652811625 * class217_sub1.anInt2701;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -129507359 * class217_sub1.anInt7978;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7976;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final long method9768() {
		return ((long) ((anInt5906 += -1393099101) * -336812789 - 1) << 32 | 0xffffffffL);
	}

	static final long method9769() {
		return ((long) ((anInt5906 += -1393099101) * -336812789 - 1) << 32 | 0xffffffffL);
	}

	static final void method9770(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub11.method12209(class118, class98, class527, 1467575804);
	}

	static final void method9771(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class30.method797(class118, class98, class527, 2012533487);
	}

	static final void method9772(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 12);
		Class96_Sub22.method14680(class118, class527, -1422924784);
	}

	static final void method9773(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 43);
		Class96_Sub22.method14680(class118, class527, 1547756613);
	}

	static final void method9774(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class115.anInt1247 * 842593263;
	}

	static final void method9775(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class96_Sub22.method14680(class118, class527, -867552172);
	}

	static final void method9776(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class96_Sub22.method14680(class118, class527, -2044293306);
	}

	static final void method9777(Class118 class118, CS2Executor class527) {
		Class414 class414 = class118.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Point point = class414.method6954(class118.aString1391, 1506818197 * class118.anInt1301, class118.anInt1358 * -753644021, i, Class182.aClass160Array2261, -1741928644);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = point.x;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = point.y;
	}

	static final void method9778(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class119.method2075(i, string, (byte) 47);
	}

	static final void method9779(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_226_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class252.method4327(i, i_226_, true, false, (byte) 89);
	}

	static final void method9780(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class242.method4160(class118, class98, class527, (short) 11902);
	}

	static final void method9781(CS2Executor class527) {
		class527.anInt7001 -= 1918006146;
		if ((class527.aLongArray7003[1820448321 * class527.anInt7001 + 1]) == (class527.aLongArray7003[1820448321 * class527.anInt7001]))
			class527.instrPtr += (-1051529003 * (class527.unknown[301123709 * class527.instrPtr]));
	}

	static final void method9782(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 107);
		Class88.method1494(class118, class527, (byte) 116);
	}

	static final void method9783(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class88.method1494(class118, class527, (byte) -47);
	}

	static final void method9784(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub17.method14653(class118, class98, class527, -1273039251);
	}

	static final void method9785(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class88.method1494(class118, class527, (byte) -33);
	}

	static final void method9786(Class118 class118, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_227_ = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (class118.anInt1329 * 2131324949 != 6 && 2 != class118.anInt1329 * 2131324949)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(-402732635 * class118.anInt1330, (byte) -38);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, 2131324949 * class118.anInt1329 == 6);
		class118.aClass417_1308.aLong4993 = Class86.method1480(-1652164871) * 7197667099348947907L;
		if (null == class409.aShortArray4892 || i_227_ < 0 || i_227_ >= class409.aShortArray4892.length)
			throw new RuntimeException("");
		class118.aClass417_1308.aShortArray4990[i_227_] = (short) i;
		Class109.method1858(class118, (byte) -28);
	}

	static final void method9787(Class118 class118, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_228_ = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (class118.anInt1329 * 2131324949 != 6 && 2 != class118.anInt1329 * 2131324949)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(-402732635 * class118.anInt1330, (byte) -2);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, 2131324949 * class118.anInt1329 == 6);
		class118.aClass417_1308.aLong4993 = Class86.method1480(1274098299) * 7197667099348947907L;
		if (null == class409.aShortArray4892 || i_228_ < 0 || i_228_ >= class409.aShortArray4892.length)
			throw new RuntimeException("");
		class118.aClass417_1308.aShortArray4990[i_228_] = (short) i;
		Class109.method1858(class118, (byte) -8);
	}

	static final void method9788(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 46);
		Class282_Sub20_Sub4.method15207(class118, class527, 1948802115);
	}

	static final void method9789(Class118 class118, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_229_ = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (6 != class118.anInt1329 * 2131324949 && 2 != 2131324949 * class118.anInt1329)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(-402732635 * class118.anInt1330, (byte) 2);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, 2131324949 * class118.anInt1329 == 6);
		class118.aClass417_1308.aLong4993 = Class86.method1480(-915426907) * 7197667099348947907L;
		if (null == class409.aShortArray4867 || i_229_ < 0 || i_229_ >= class409.aShortArray4867.length)
			throw new RuntimeException("");
		class118.aClass417_1308.aShortArray4991[i_229_] = (short) i;
		Class109.method1858(class118, (byte) -34);
	}

	static final void method9790(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 117);
		Class209.method3601(class118, class527, -2117021716);
	}

	static final void method9791(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 49);
		Class209.method3601(class118, class527, -2046003709);
	}

	static final void method9792(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class209.method3601(class118, class527, -2147262794);
	}

	static final void method9793(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class209.method3601(class118, class527, -2089326065);
	}

	static final void method9794(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class209.method3601(class118, class527, -2143606510);
	}

	static final void method9795(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class209.method3601(class118, class527, -1977571446);
	}

	static final void method9796(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 97);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 597157617 * class118.anInt1299;
	}

	static final void method9797(CS2Executor class527) {
		if (null == Class149_Sub2.aClass461_9316)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1977256787 * Class149_Sub2.aClass461_9316.anInt5541;
	}

	static final void method9798(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub20_8207.method7785(i, 40668028);
	}

	static final void method9799(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 56);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1506818197 * class118.anInt1301;
	}

	static final void method9800(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 102);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -492594917 * class118.anInt1429;
	}

	static final void method9801(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 0, class527, (byte) 107);
	}

	static final void method9802(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 9);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.aBool1306 ? 1 : 0;
	}

	static final void method9803(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 27);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 2110532063 * class118.anInt1305;
	}

	static final void method9804(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 67);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 2110532063 * class118.anInt1305;
	}

	static final void method9805(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 77);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >>> 16];
		Class118 class118_230_ = Class96_Sub23.method14682(class98, class118, -838454718);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class118_230_ == null ? -1 : class118_230_.anInt1287 * -1952846363);
	}

	static final void method9806(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 3);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1264 * -795991475;
	}

	static final void method9807(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 39);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1264 * -795991475;
	}

	static final void method9808(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 55);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 276864765 * class118.anInt1311;
	}

	static final void method9809(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class2.method258(string, 779827732);
	}

	static final void method9810(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 70);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 276864765 * class118.anInt1311;
	}

	static final void method9811(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		class118.anInt1376 = -280394239 * (class527.intStack[1942118537 * class527.anInt7012]);
		class118.anInt1314 = (1004789833 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]));
		Class109.method1858(class118, (byte) -47);
		if (0 == -2131393857 * class118.anInt1268)
			Class12.method483(class98, class118, false, -1715170362);
	}

	static final void method9812(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.method1987(1076530511);
	}

	static final void method9813(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 70);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1312 * 682782159;
	}

	static final void method9814(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_231_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (i != -1) {
			if (i_231_ > 255)
				i_231_ = 255;
			else if (i_231_ < 0)
				i_231_ = 0;
			Class93.method1575(i, i_231_, false, 733762718);
		}
	}

	static final void method9815(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 17);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1376 * -354780671;
	}

	static final void method9816(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 38);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1376 * -354780671;
	}

	static final void method9817(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 107);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1376 * -354780671;
	}

	static final void method9818(CS2Executor class527) {
		Class520.method11160(Class507.method8727(1382084232), class527, 1060557669);
	}

	static final void method9819(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1329 = 1179500154;
		class118.aClass417_1308 = null;
		class118.anInt1330 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -636815827);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.anInt1287 * -1952846363, -1650369054);
	}

	static final void method9820(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		String string_232_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string_232_;
	}

	static final void method9821(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 102);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -37350919 * class118.anInt1314;
	}

	static final void method9822(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 78);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1343 * -1823193031;
	}

	static final void method9823(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 66);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1343 * -1823193031;
	}

	static final void method9824(CS2Executor class527) {
		Class371.method6353((short) 255);
	}

	static final void method9825(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 49);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1385 * -1627383873;
	}

	static final void method9826(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 51);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1385 * -1627383873;
	}

	static final void method9827(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 55);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1385 * -1627383873;
	}

	static final void method9828(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 79);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1385 * -1627383873;
	}

	static final void method9829(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 84);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1385 * -1627383873;
	}

	static final void method9830(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_233_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1607876319);
		if (i_233_ >= 1 && i_233_ <= 5 && class425.inventoryOptions[i_233_ - 1] != null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class425.inventoryOptions[i_233_ - 1];
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method9831(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 54);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1337 * -1009302201;
	}

	static final void method9832(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 7);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1336 * 682349813;
	}

	static final void method9833(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		WorldMapAreaDefs class220 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 563309447);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class220.anInt2722 * 1172439539;
	}

	static final void method9834(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 66);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1336 * 682349813;
	}

	static final void method9835(Class118 class118, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_234_ = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (class118.anInt1329 * 2131324949 != 2)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(class118.anInt1330 * -402732635, (byte) 15);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, false);
		class118.aClass417_1308.aLong4993 = Class86.method1480(1696123143) * 7197667099348947907L;
		if (i_234_ < 0 || i_234_ >= class409.anIntArray4860.length)
			throw new RuntimeException("");
		class118.aClass417_1308.anIntArray4992[i_234_] = i;
		Class109.method1858(class118, (byte) -1);
	}

	static final void method9836(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 66);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1453 * 1762983005;
	}

	static final void method9837(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method12774((byte) -15) ? 1 : 0;
	}

	static final void method9838(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 11);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1453 * 1762983005;
	}

	static final void method9839(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 17);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1453 * 1762983005;
	}

	static final void method9840(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 23);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1293 * 1552292309;
	}

	static final void method9841(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 26);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1334 * 539377845;
	}

	static final void method9842(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 40);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1334 * 539377845;
	}

	static final void method9843(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class282_Sub45.method13405(Class169.method2869(1577959206));
	}

	static final void method9844(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 5);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1334 * 539377845;
	}

	static final void method9845(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 97);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1334 * 539377845;
	}

	static final void method9846(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 46);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 985215637 * class118.anInt1320;
	}

	static final void method9847(CS2Executor class527) {
		if (Class475.aBool5623 && Class263.aFrame3260 != null)
			Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-125085754), -1, -1, false, (byte) 76);
		if (NamedFileReference.method867(407455979) == Class279.aClass279_3368) {
			Class282_Sub11.method12211(96221665);
			System.exit(0);
		} else
			Class480.method8043(-1215725230);
	}

	static final void method9848(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 17);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, true, 2, class527, (byte) -7);
	}

	static final void method9849(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 38);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class349.method6186(class118, class98, class527, -94301647);
	}

	static final void method9850(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 82);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1423 * -169127141;
	}

	static final void method9851(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.method11633(class118).method12179(-711296213);
	}

	static final void method9852(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 88);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (1 == class118.anInt1329 * 2131324949 ? class118.anInt1330 * -402732635 : -1);
	}

	static final void method9853(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 6);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (1 == class118.anInt1329 * 2131324949 ? class118.anInt1330 * -402732635 : -1);
	}

	static final void method9854(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 51);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (1 == class118.anInt1329 * 2131324949 ? class118.anInt1330 * -402732635 : -1);
	}

	static final void method9855(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 125);
		int i_235_ = -1;
		int i_236_ = -1;
		Class119 class119 = class118.method2046(Renderers.SOFTWARE_RENDERER, -959068282);
		if (null != class119) {
			i_235_ = -1125753931 * class119.anInt1458;
			i_236_ = class119.anInt1454 * 2069222845;
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_235_;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_236_;
	}

	static final void method9856(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 24);
		int i_237_ = -1;
		int i_238_ = -1;
		Class119 class119 = class118.method2046(Renderers.SOFTWARE_RENDERER, -1781100909);
		if (null != class119) {
			i_237_ = -1125753931 * class119.anInt1458;
			i_238_ = class119.anInt1454 * 2069222845;
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_237_;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_238_;
	}

	static final void method9857(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 43);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 442725395 * class118.anInt1277;
	}

	static final void method9858(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 487511911 * class527.aClass61_7010.anInt641;
	}

	static final void method9859(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 78);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -56249735 * class118.anInt1426;
	}

	static final void method9860(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 37);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -56249735 * class118.anInt1426;
	}

	static final void method9861(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Class169.method2869(2012888170) / 60000L);
	}

	static final void method9862(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub44 class282_sub44 = (Class282_Sub44) client.aClass465_7442.method7754((long) i);
		if (class282_sub44 != null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9863(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub44 class282_sub44 = (Class282_Sub44) client.aClass465_7442.method7754((long) i);
		if (class282_sub44 != null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9864(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 71);
		if (class118.aClass118Array1438 == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else {
			int i = class118.aClass118Array1438.length;
			for (int i_239_ = 0; i_239_ < class118.aClass118Array1438.length; i_239_++) {
				if (null == class118.aClass118Array1438[i_239_]) {
					i = i_239_;
					break;
				}
			}
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i;
		}
	}

	static final void method9865(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 37);
		if (class118.aClass118Array1438 == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else {
			int i = class118.aClass118Array1438.length;
			for (int i_240_ = 0; i_240_ < class118.aClass118Array1438.length; i_240_++) {
				if (null == class118.aClass118Array1438[i_240_]) {
					i = i_240_;
					break;
				}
			}
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i;
		}
	}

	static final void method9866(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 91);
		if (class118.aClass118Array1438 == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else {
			int i = class118.aClass118Array1438.length;
			for (int i_241_ = 0; i_241_ < class118.aClass118Array1438.length; i_241_++) {
				if (null == class118.aClass118Array1438[i_241_]) {
					i = i_241_;
					break;
				}
			}
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i;
		}
	}

	static final void method9867(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_242_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		Class282_Sub44 class282_sub44 = (Class282_Sub44) client.aClass465_7442.method7754((long) i);
		if (null != class282_sub44 && 587626901 * class282_sub44.anInt8063 == i_242_)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9868(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1329 = 1769250231;
		class118.anInt1330 = -1183558903 * client.anInt7315;
		class118.anInt1339 = 0;
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.anInt1287 * -1952846363, 662881391);
	}

	static final void method9869(CS2Executor class527) {
		Class93.method1573(class527, (byte) 59);
	}

	static final void method9870(CS2Executor class527) {
		Class93.method1573(class527, (byte) 68);
	}

	static final void method9871(CS2Executor class527) {
		Class93.method1573(class527, (byte) 103);
	}

	static final void method9872(CS2Executor class527) {
		Class93.method1573(class527, (byte) 109);
	}

	static final void method9873(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		SharedConfigsType.method2094(i, (byte) 1);
	}

	static final void method9874(CS2Executor class527) {
		Class93.method1573(class527, (byte) 88);
	}

	static final void method9875(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 20);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.method11633(class118).method12179(1974939681);
	}

	static final void method9876(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 25);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.method11633(class118).method12179(55439266);
	}

	static final void method9877(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 103);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.method11633(class118).method12179(-1027551203);
	}

	static final void method9878(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 24);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.method11633(class118).method12179(-555859477);
	}

	static final void method9879(CS2Executor class527) {
		if (Class96_Sub21.aClass199_9438.method3236(81, -1714830366))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9880(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 34);
		if (null == class118.aString1369)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class118.aString1369;
	}

	static final void method9881(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 8);
		if (null == class118.aString1369)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class118.aString1369;
	}

	static final void method9882(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub5_8221, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 2135845983);
		Class190.method3148((byte) 93);
	}

	static final void method9883(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1329 = -1346216911;
		class118.anInt1330 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -636815827);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(-1952846363 * class118.anInt1287, -973640683);
	}

	static final void method9884(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class2.method258(string, 779827732);
	}

	static final CS2Executor method9885() {
		if (788272697 * anInt5905 == anArrayList5903.size())
			anArrayList5903.add(new CS2Executor());
		CS2Executor class527 = (CS2Executor) anArrayList5903.get(anInt5905 * 788272697);
		anInt5905 += 1618802697;
		return class527;
	}

	static final void method9886(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 98);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Defaults7Loader.method8754(class118, class98, class527, 1449946769);
	}

	static final void method9887(CS2Executor class527) {
		Class473.method7886(true, 1516035825);
	}

	static final void method9888(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class527.aClass282_Sub4_7011.aString7501;
	}

	static final void method9889(CS2Executor class527) {
		Class473.method7886(true, 1516035825);
	}

	static final void method9890(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = 0;
		if (Class115.method1950(string, -1213891014))
			i = Class328.method5830(string, -1849642790);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4585, client.aClass184_7475.aClass432_2283, 2043284645);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i);
		client.aClass184_7475.method3049(class282_sub23, -530030141);
	}

	static final void method9891(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = 0;
		if (Class115.method1950(string, -559820137))
			i = Class328.method5830(string, 1839699704);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4585, client.aClass184_7475.aClass432_2283, -261633873);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i);
		client.aClass184_7475.method3049(class282_sub23, 1671453258);
	}

	static final void method9892(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = 0;
		if (Class115.method1950(string, -1053814816))
			i = Class328.method5830(string, 1672131839);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4585, client.aClass184_7475.aClass432_2283, -334883664);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i);
		client.aClass184_7475.method3049(class282_sub23, 67517337);
	}

	static final void method9893(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = 0;
		if (Class115.method1950(string, -1338335635))
			i = Class328.method5830(string, -1311465349);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4585, client.aClass184_7475.aClass432_2283, 1273649626);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i);
		client.aClass184_7475.method3049(class282_sub23, 1417226417);
	}

	static final void method9894(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 30);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class13.method501(class118, class98, class527, (byte) 104);
	}

	static final void method9895(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4607, client.aClass184_7475.aClass432_2283, -180548803);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string.length() + 1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		client.aClass184_7475.method3049(class282_sub23, -1086894372);
	}

	static final void method9896(boolean bool, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 101);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		if (bool)
			Class455.method7554(class98, class118, 930737569);
		else
			WorldMapIndexLoader.method3710(class98, class118, 983481657);
	}

	static final void method9897(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1 ? 1 : 0;
	}

	static final void method9898(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((Class84.myPlayer.playerAppearance != null) && (Class84.myPlayer.playerAppearance.aBool2929)) ? 1 : 0;
	}

	static final void method9899(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class119.method2075(i, string, (byte) 111);
	}

	static final void method9900(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_243_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class282_Sub14.method12221(((UnderlayDefinition) class513).aClass118_5886, i, i_243_, 1817749170);
	}

	static final void method9901(CS2Executor class527) {
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class527.animable);
		NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
		if (null != class409.anIntArray4886)
			class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class409 != null ? 1 : 0;
	}

	static final void method9902(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_244_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class282_Sub14.method12221(((UnderlayDefinition) class513).aClass118_5886, i, i_244_, 1627759576);
	}

	static final void method9903(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4544, client.aClass184_7475.aClass432_2283, 1149704621);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i, 1417031095);
		client.aClass184_7475.method3049(class282_sub23, 758363217);
	}

	static final void method9904(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4544, client.aClass184_7475.aClass432_2283, 730968252);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i, 1417031095);
		client.aClass184_7475.method3049(class282_sub23, 2016087968);
	}

	static final void method9905(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_245_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_246_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class282_Sub20_Sub8.method15242(string, 1 == i, i_245_, i_246_, -224475229);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class415.anInt4985 * 560339485;
	}

	static final void method9906(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -704900783 * Class9.anInt94;
	}

	static final void method9907(CS2Executor class527) {
		Class242.method4167((String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), 1700898348);
	}

	static final void method9908(CS2Executor class527) {
		Class242.method4167((String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), 1858010308);
	}

	static final void method9909(CS2Executor class527) {
		Class242.method4167((String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), 1832820908);
	}

	static final void method9910(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_247_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_248_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(3, i << 16 | i_247_, i_248_, "", (byte) 11);
	}

	static final void method9911(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_249_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (i == 99)
			Class209.method3598(string, -79178732);
		else if (98 == i)
			Class240.method4140(string, -1031433398);
		else
			Class191.method3167(i, i_249_, "", "", "", string, 1767512330);
	}

	static final void method9912(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
	}

	static final void method9913(CS2Executor class527) {
		String string = null;
		if (null != Class119.aClass12_1461)
			string = Class119.aClass12_1461.method473(-732192220);
		if (null == string)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method9914(CS2Executor class527) {
		class527.anInt7012 -= 1560801011;
		Class356[] class356s = Class350_Sub3_Sub1.method15558(68930208);
		Class353[] class353s = Class483.method8155(152314627);
		Class282_Sub15_Sub3.method15239(class356s[(class527.intStack[class527.anInt7012 * 1942118537])], class353s[(class527.intStack[class527.anInt7012 * 1942118537 + 1])], (class527.intStack[1942118537 * class527.anInt7012 + 2]), (class527.intStack[3 + class527.anInt7012 * 1942118537]),
				(class527.intStack[4 + class527.anInt7012 * 1942118537]), (class527.intStack[5 + class527.anInt7012 * 1942118537]), (class527.intStack[class527.anInt7012 * 1942118537 + 6]), (class527.intStack[class527.anInt7012 * 1942118537 + 7]), (class527.intStack[8 + 1942118537 * class527.anInt7012]),
				(class527.intStack[class527.anInt7012 * 1942118537 + 9]), (class527.intStack[10 + class527.anInt7012 * 1942118537]), (byte) -63);
	}

	static final void method9915(Class118 class118, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = ((class527.intStack[1942118537 * class527.anInt7012]) - 1);
		int i_250_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (i < 0 || i > 9)
			throw new RuntimeException();
		Class274.method4883(class118, i, i_250_, class527, -838566564);
	}

	static final void method9916(CS2Executor class527) {
		class527.anInt7012 -= 1702692012;
		Class316.method5594(-559600711);
		Class96.method1607((byte) 37);
		Class282_Sub20_Sub9.anInt9792 = (class527.intStack[class527.anInt7012 * 1942118537]) * -2112332643;
		Class301.anInt3556 = -40093315 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class20.anInt188 = 50073545 * (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class182.anInt2262 = (2139103415 * (class527.intStack[3 + 1942118537 * class527.anInt7012]));
		Class450.anInt5438 = (1254300539 * (class527.intStack[class527.anInt7012 * 1942118537 + 4]));
		Class373.anInt4350 = ((class527.intStack[class527.anInt7012 * 1942118537 + 5]) * -923361129);
		Class254.anInt3145 = (1497808011 * (class527.intStack[6 + class527.anInt7012 * 1942118537]));
		Class446.anInt5396 = (-1722209539 * (class527.intStack[class527.anInt7012 * 1942118537 + 7]));
		Class17.anInt148 = (class527.intStack[class527.anInt7012 * 1942118537 + 8]) * 254147049;
		Class388.anInt4722 = (-581610323 * (class527.intStack[1942118537 * class527.anInt7012 + 9]));
		Class99.anInt1005 = ((class527.intStack[10 + class527.anInt7012 * 1942118537]) * 286693969);
		Class242.anInt2982 = (-918117939 * (class527.intStack[class527.anInt7012 * 1942118537 + 11]));
		IndexLoaders.SPRITES_INDEX.method5661(947424179 * Class450.anInt5438, -614048554);
		IndexLoaders.SPRITES_INDEX.method5661(-1626939609 * Class373.anInt4350, -102147904);
		IndexLoaders.SPRITES_INDEX.method5661(464964387 * Class254.anInt3145, 1467869812);
		IndexLoaders.SPRITES_INDEX.method5661(Class446.anInt5396 * -781860267, -304363296);
		IndexLoaders.SPRITES_INDEX.method5661(Class17.anInt148 * -1965396391, -346620263);
		IndexLoaders.SPRITES_INDEX.method5661(Class242.anInt2982 * -1242615035, -208369411);
		IndexLoaders.FONT_METRICS_INDEX.method5661(-1242615035 * Class242.anInt2982, 1820768226);
		Class354.aClass160_4110 = null;
		Class149_Sub2.aClass160_9315 = null;
		Class125.aClass160_1571 = null;
		Class60.aClass160_612 = null;
		Class61.aClass160_647 = null;
		Class467.aClass160_5576 = null;
		Class290.aClass160_3452 = null;
		AttributeDefault.aClass160_5339 = null;
		Class20.aBool187 = true;
	}

	static final void method9917(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte628;
	}

	static final void method9918(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4596, client.aClass184_7475.aClass432_2283, 694642761);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string.length() + 1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		client.aClass184_7475.method3049(class282_sub23, 83721117);
	}

	static final void method9919(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		Class153.method2618((class527.intStack[1942118537 * class527.anInt7012]), (class527.intStack[(class527.anInt7012 * 1942118537 + 1)]), (class527.intStack[(class527.anInt7012 * 1942118537 + 2)]), 255, 256, 1554668699);
	}

	static final void method9920(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		Class153.method2618((class527.intStack[1942118537 * class527.anInt7012]), (class527.intStack[(class527.anInt7012 * 1942118537 + 1)]), (class527.intStack[(class527.anInt7012 * 1942118537 + 2)]), 255, 256, 571372151);
	}

	static final void method9921(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		Class153.method2618((class527.intStack[class527.anInt7012 * 1942118537]), (class527.intStack[1942118537 * class527.anInt7012 + 1]), (class527.intStack[2 + class527.anInt7012 * 1942118537]), (class527.intStack[3 + 1942118537 * class527.anInt7012]), 256, 1703643756);
	}

	static final void method9922(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aString1348 = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
	}

	static final void method9923(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class417.anInt4994 * -385885769;
	}

	static final void method9924(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		Class435.method7300((class527.intStack[1942118537 * class527.anInt7012]), (class527.intStack[1 + 1942118537 * class527.anInt7012]), (class527.intStack[2 + class527.anInt7012 * 1942118537]), (class527.intStack[3 + class527.anInt7012 * 1942118537]), false, 256, 1449989045);
	}

	static final void method9925(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		Class435.method7300((class527.intStack[class527.anInt7012 * 1942118537]), (class527.intStack[1942118537 * class527.anInt7012 + 1]), (class527.intStack[1942118537 * class527.anInt7012 + 2]), (class527.intStack[3 + class527.anInt7012 * 1942118537]), true, 256, 1449989045);
	}

	static final void method9926(CS2Executor class527) {
		class527.anInt7012 -= 709455005;
		Class435.method7300((class527.intStack[class527.anInt7012 * 1942118537]), (class527.intStack[1 + 1942118537 * class527.anInt7012]), (class527.intStack[class527.anInt7012 * 1942118537 + 2]), (class527.intStack[3 + 1942118537 * class527.anInt7012]), false, (class527.intStack[4 + class527.anInt7012 * 1942118537]), 1449989045);
	}

	static final void method9927(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		Long var_long = (Long) Class46.anObjectArray437[i];
		if (var_long == null)
			class527.aLongArray7003[((class527.anInt7001 += -1188480575) * 1820448321 - 1)] = -1L;
		else
			class527.aLongArray7003[((class527.anInt7001 += -1188480575) * 1820448321 - 1)] = var_long.longValue();
	}

	static final void method9928(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.cycles * -1809259861;
	}

	static final void method9929(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.cycles * -1809259861;
	}

	static final void method9930(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.cycles * -1809259861;
	}

	static final void method9931(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class329_Sub1.method12491(Class84.myPlayer, (class527.intStack[(class527.anInt7012 * 1942118537)]), (class527.intStack[(1942118537 * class527.anInt7012) + 1]), (byte) -101);
	}

	static final void method9932(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_251_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class515.method8861(i, i_251_, false, 1501872644);
	}

	static final void method9933(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 456793949 * Class9.anInt72;
	}

	static final void method9934(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_252_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class521_Sub1_Sub1_Sub6.method16125(i, i_252_, false, -760800130);
	}

	static final void method9935(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != client.aString7426 && i < -1772444859 * Class459.anInt5534)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -774562077 * Class467.aClass173Array5575[i].anInt2131;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9936(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub25.method12401(class118, class98, class527, 1160428525);
	}

	static final void method9937(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.INVENTORY_INDEX_LOADER.getInventoryDef(i, (short) 8167).anInt10277) * 875957203;
	}

	static final void method9938(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.INVENTORY_INDEX_LOADER.getInventoryDef(i, (short) 9807).anInt10277) * 875957203;
	}

	static final void method9939(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		InventoryDef class282_sub50_sub18 = IndexLoaders.INVENTORY_INDEX_LOADER.getInventoryDef((class527.intStack[((class527.anInt7012) * 1942118537)]), (short) 25947);
		int i = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_253_ = -1;
		for (int i_254_ = 0; i_254_ < -1471207409 * class282_sub50_sub18.anInt10276; i_254_++) {
			if (i == class282_sub50_sub18.anIntArray10274[i_254_]) {
				i_253_ = class282_sub50_sub18.anIntArray10275[i_254_];
				break;
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_253_;
	}

	static final void method9940(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class473.method7889(class118, class98, class527, 1072784051);
	}

	static final void method9941(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anIntArray7338[i];
	}

	static final void method9942(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 90);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class262.method4651(class118, class98, class527, (byte) 60);
	}

	static final void method9943(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anIntArray7338[i];
	}

	static final void method9944(CS2Executor class527) {
		int i = Class84.myPlayer.aByte7967;
		Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1725640037);
		int i_255_ = (1948093437 * class219.anInt2711 + ((int) class385.aFloat4671 >> 9));
		int i_256_ = (((int) class385.aFloat4673 >> 9) + class219.anInt2712 * -1002240017);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_256_ + ((i << 28) + (i_255_ << 14));
	}

	static final void method9945(CS2Executor class527) {
		int i = Class84.myPlayer.aByte7967;
		Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(177624986);
		int i_257_ = (1948093437 * class219.anInt2711 + ((int) class385.aFloat4671 >> 9));
		int i_258_ = (((int) class385.aFloat4673 >> 9) + class219.anInt2712 * -1002240017);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_258_ + ((i << 28) + (i_257_ << 14));
	}

	static final void method9946(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (class527.current.stringOpValues[class527.instrPtr * 301123709]);
	}

	static final void method9947(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.anInt7012 -= 1418910010;
		byte[] is = null;
		byte[] is_259_ = null;
		int i;
		for (i = 0; (i < 10 && (class527.intStack[1942118537 * class527.anInt7012 + i]) >= 0); i += 2) {
			/* empty */
		}
		if (i > 0) {
			is = new byte[i / 2];
			is_259_ = new byte[i / 2];
			for (i -= 2; i >= 0; i -= 2) {
				is[i / 2] = (byte) (class527.intStack[i + (1942118537 * class527.anInt7012)]);
				is_259_[i / 2] = (byte) (class527.intStack[1 + ((class527.anInt7012 * 1942118537) + i)]);
			}
		}
		Class107.method1838(class118, is, is_259_, class527, 1844755981);
	}

	static final void method9948(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i >> 28;
	}

	static final void method9949(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i >> 28;
	}

	static final void method9950(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class158.method2732(class118, class98, class527, -156482988);
	}

	static final void method9951(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.membersWorld ? 1 : 0;
	}

	static final void method9952(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.membersWorld ? 1 : 0;
	}

	static final void method9953(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (string.startsWith(Class76.method1358(0, (byte) 0)) || string.startsWith(Class76.method1358(1, (byte) 0)))
			string = string.substring(7);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class230.method3910(string, -555098945);
	}

	static final void method9954(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_260_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class515.method8861(i, i_260_, true, 1629913761);
	}

	static final void method9955(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_261_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class515.method8861(i, i_261_, true, -105527918);
	}

	static final void method9956(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_262_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class117.method1980(i, i_262_, true, 1800544357);
	}

	static final void method9957(CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0);
		if (Class84.myPlayer.playerAppearance != null)
			Class84.myPlayer.playerAppearance.method4003(bool, -794449734);
	}

	static final void method9958(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		String string = "";
		if (class108 != null && null != class108.aString1087)
			string = class108.aString1087;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method9959(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_263_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		if (null != Class84.myPlayer.playerAppearance && (Class84.myPlayer.playerAppearance.aBool2929))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string_263_;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string;
	}

	static final void method9960(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 15);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1336 * 682349813;
	}

	static final void method9961(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7300 * 550395357;
	}

	static final void method9962(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_264_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		if (null != Class84.myPlayer.playerAppearance)
			Class84.myPlayer.playerAppearance.method3995(i, i_264_, IndexLoaders.ITEM_INDEX_LOADER, (byte) 102);
	}

	static final void method9963(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1627383873 * class118.anInt1385;
	}

	static final void method9964(CS2Executor class527) {
		if (-1353302673 * client.anInt7319 >= 5 && -1353302673 * client.anInt7319 <= 9)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9965(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 27);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		WorldMapAreaDefs.method3738(class118, class98, class527, (byte) -2);
	}

	static final void method9966(CS2Executor class527) {
		if (-1353302673 * client.anInt7319 >= 5 && -1353302673 * client.anInt7319 <= 9)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = client.anInt7319 * -1353302673;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9967() {
		anInt5905 -= 1618802697;
	}

	static final void method9968(CS2Executor class527) {
		if (-1353302673 * client.anInt7319 >= 5 && -1353302673 * client.anInt7319 <= 9)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = client.anInt7319 * -1353302673;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method9969(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7316 ? 1 : 0;
	}

	static final void method9970(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		Class533.method11404((String) (class527.objectStack[(1806726141 * class527.anInt7000)]), (String) (class527.objectStack[1 + (class527.anInt7000 * 1806726141)]), "", (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]) == 1, false, -94301647);
	}

	static final void method9971(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class263.method4772(class118, class98, class527, (byte) -96);
	}

	static final void method9972(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class84.myPlayer.anInt10565 * -1880473919);
	}

	static final void method9973(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class84.myPlayer.anInt10565 * -1880473919);
	}

	static final void method9974(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class84.myPlayer.anInt10565 * -1880473919);
	}

	static final void method9975(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_265_ = client.aClass330Array7428[i].method5908(660534683);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_265_ == 1 ? 1 : 0;
	}

	static final void method9976(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((Class84.myPlayer.playerAppearance != null) && (Class84.myPlayer.playerAppearance.aBool2929)) ? 1 : 0;
	}

	static final void method9977(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 115836904) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1353 = Class351.method6193(string, class527, 799325568);
		class118.aBool1384 = true;
	}

	static final void method9978(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7325 ? 1 : 0;
	}

	static final void method9979(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = 10;
		byte[] is = { (byte) class527.intStack[class527.anInt7012 * 1942118537] };
		byte[] is_266_ = { (byte) class527.intStack[1942118537 * class527.anInt7012 + 1] };
		Class445.method7429(class118, i, is, is_266_, class527, -489738962);
	}

	static final void method9980(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7325 ? 1 : 0;
	}

	static final void method9981(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class101.method1776(i, false, 1454834770);
	}

	static final void method9982(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_267_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class252.method4327(i, i_267_, false, false, (byte) 5);
	}

	static final void method9983(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_268_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class252.method4327(i, i_268_, true, false, (byte) -107);
	}

	static final void method9984(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != client.aString7426 && i < Class459.anInt5534 * -1772444859)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i].aString2127;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method9985(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_269_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class252.method4327(i, i_269_, true, false, (byte) 58);
	}

	static final void method9986(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1543197399 * client.anInt7149;
	}

	static final void method9987(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1543197399 * client.anInt7149;
	}

	static final void method9988(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class241.method4150(981291304);
	}

	static final void method9989(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class241.method4150(1504590320);
	}

	static final void method9990(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class241.method4150(1386780100);
	}

	static final void method9991(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 0;
	}

	static final void method9992(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class530.aBool7050 ? 1 : 0;
	}

	static final void method9993(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class530.aBool7050 ? 1 : 0;
	}

	static final void method9994(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class530.aBool7050 ? 1 : 0;
	}

	static final void method9995(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7151 ? 1 : 0;
	}

	static final void method9996(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7151 ? 1 : 0;
	}

	static final void method9997(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3570(756095591);
	}

	static final void method9998(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3570(756095591);
	}

	static final void method9999(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3570(756095591);
	}

	static final void method10000(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3570(756095591);
	}

	static final void method10001(CS2Executor class527) {
		Class520.method11160(GraphicalRenderer.method8697(-364738076), class527, 1060557669);
	}

	static final void method10002(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub30_8194.method13421(635605552) ? 1 : 0;
	}

	static final void method10003(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aStringArray1352 = null;
	}

	static final void method10004(CS2Executor class527) {
		Class520.method11160(Class507.method8727(1582072148), class527, 1060557669);
	}

	static final void method10005(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 63);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class29.method786(class118, class98, class527, -1279446637);
	}

	static final void method10006(CS2Executor class527) {
		Class520.method11160(Class507.method8727(1988960984), class527, 1060557669);
	}

	static final void method10007(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7190 * -1474737961;
	}

	public static void method10008(Class282_Sub43 class282_sub43) {
		Class400.method6794(class282_sub43, 200000, (byte) 117);
	}

	static final void method10009(CS2Executor class527) {
		Class520.method11160(Class507.method8727(-2034730203), class527, 1060557669);
	}

	static final void method10010(CS2Executor class527) {
		if (client.aString7426 != null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class285.method5025(client.aString7426, 2126071297);
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10011(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class84.myPlayer.aClass19_10359.method578((byte) 2) >> 3;
	}

	static final void method10012(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_270_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = string.indexOf(string_270_, i);
	}

	static final void method10013(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		client.anInt7416 = (class527.intStack[1942118537 * class527.anInt7012]) * 1429316783;
		Class149_Sub2.aClass461_9316 = Class246.method4203((class527.intStack[(class527.anInt7012 * 1942118537) + 1]), (byte) 2);
		if (Class149_Sub2.aClass461_9316 == null)
			Class149_Sub2.aClass461_9316 = Class461.aClass461_5539;
		client.anInt7422 = ((class527.intStack[2 + class527.anInt7012 * 1942118537]) * 1267760345);
		Class184 class184 = Class468_Sub20.method12807(1516427135);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4547, class184.aClass432_2283, 568613682);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-574868913 * client.anInt7416);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1977256787 * Class149_Sub2.aClass461_9316.anInt5541);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(client.anInt7422 * 1334854505);
		class184.method3049(class282_sub23, 586580156);
	}

	static final void method10014(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub2_8205, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 2116564853);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -118);
		Class190.method3148((byte) 85);
		client.aBool7175 = false;
	}

	static final void method10015(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3565((byte) -39) ? 1 : 0;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3566(-2143623365) ? 1 : 0;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3567((byte) 15) ? 1 : 0;
	}

	static final void method10016(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3565((byte) -14) ? 1 : 0;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3566(-2143623365) ? 1 : 0;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3567((byte) -18) ? 1 : 0;
	}

	static final void method10017(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 73);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class240.method4136(class118, class98, class527, (byte) 45);
	}

	static final void method10018(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7315 * 1595512269;
	}

	static final void method10019(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7344 ? 1 : 0;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = client.aString7356 == null ? "" : client.aString7356;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = null == client.aString7275 ? "" : client.aString7275;
	}

	static final void method10020(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
	}

	static final void method10021(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_271_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i, (byte) 8);
		if ('s' == class431.aChar5140) {
			/* empty */
		}
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class431.method7226(i_271_, -356598151);
	}

	static final void method10022(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1 ? 1 : 0;
	}

	static final void method10023(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_272_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_273_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		int i_274_ = (class527.intStack[3 + class527.anInt7012 * 1942118537]);
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_273_, (byte) 8);
		if (class431.aChar5146 != i || class431.aChar5140 != i_272_)
			throw new RuntimeException(new StringBuilder().append(i_273_).append(" ").append(i_274_).toString());
		if (115 == i_272_)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class431.method7226(i_274_, -1304766738);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class431.method7232(i_274_, -447797973);
	}

	static final void method10024(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_275_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i, (byte) 0);
		if (i_275_ != -1741480635 * class437.anInt5337)
			class118.method1999(i, i_275_, -812677931);
		else
			class118.method1995(i, -1265527536);
	}

	static final void method10025(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_276_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_277_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		int i_278_ = (class527.intStack[3 + class527.anInt7012 * 1942118537]);
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_277_, (byte) 8);
		if (class431.aChar5146 != i || class431.aChar5140 != i_276_)
			throw new RuntimeException(new StringBuilder().append(i_277_).append(" ").append(i_278_).toString());
		if (115 == i_276_)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class431.method7226(i_278_, -953520851);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class431.method7232(i_278_, -418967778);
	}

	static final void method10026(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_279_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		int i_280_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		if (i_279_ == -1)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_279_, (byte) 8);
		if (i != class431.aChar5140)
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class431.method7228(Integer.valueOf(i_280_), (byte) -119) ? 1 : 0);
	}

	static final void method10027(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class41_Sub1_Sub1.method15524((byte) -105);
	}

	static final void method10028(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (-1 == i)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i, (byte) 8);
		if (class431.aChar5140 != 's')
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class431.method7228(string, (byte) -120) ? 1 : 0;
	}

	static final void method10029(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		Class158_Sub1.aClass3_8507.method280(i, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 1651464247);
	}

	static final void method10030(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (-1 == i)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i, (byte) 8);
		if (class431.aChar5140 != 's')
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class431.method7228(string, (byte) -52) ? 1 : 0;
	}

	static final void method10031(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (-1 == i)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i, (byte) 8);
		if (class431.aChar5140 != 's')
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class431.method7228(string, (byte) -42) ? 1 : 0;
	}

	static final void method10032(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 99);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class455.method7555(class118, class98, class527, (byte) -39);
	}

	static final void method10033(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i, (byte) 8);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class431.method7222(-1321026128);
	}

	static final void method10034(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class84.myPlayer.aClass19_10359.method578((byte) 2) >> 3;
	}

	static final void method10035(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (!string.equals(class118.aString1391)) {
			class118.aString1391 = string;
			Class109.method1858(class118, (byte) -42);
		}
		if (1924549737 * class118.anInt1288 == -1 && !class98.aBool999)
			Class211.method3631(class118.anInt1287 * -1952846363, -1679495543);
	}

	static final void method10036(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1390951238);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14775(i >> 14 & 0x3fff, i & 0x3fff, anIntArray5900, -161566861);
			if (bool) {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[1];
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[2];
			} else {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}

	Class517() throws Throwable {
		throw new Error();
	}

	static final void method10037(CS2Executor class527) {
		class527.anInt7012 -= 709455005;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_281_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_282_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		int i_283_ = (class527.intStack[3 + class527.anInt7012 * 1942118537]);
		int i_284_ = (class527.intStack[1942118537 * class527.anInt7012 + 4]);
		if (i_282_ == -1)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_282_, (byte) 8);
		if (i_281_ != class431.aChar5146)
			throw new RuntimeException();
		if (i != class431.aChar5140)
			throw new RuntimeException();
		int[] is = class431.method7251(Integer.valueOf(i_283_), 1844622469);
		if (i_284_ < 0 || null == is || is.length <= i_284_)
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = is[i_284_];
	}

	static final void method10038(CS2Executor class527) {
		class527.anInt7012 -= 709455005;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_285_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_286_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		int i_287_ = (class527.intStack[3 + class527.anInt7012 * 1942118537]);
		int i_288_ = (class527.intStack[1942118537 * class527.anInt7012 + 4]);
		if (i_286_ == -1)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_286_, (byte) 8);
		if (i_285_ != class431.aChar5146)
			throw new RuntimeException();
		if (i != class431.aChar5140)
			throw new RuntimeException();
		int[] is = class431.method7251(Integer.valueOf(i_287_), 1798622159);
		if (i_288_ < 0 || null == is || is.length <= i_288_)
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = is[i_288_];
	}

	static final void method10039(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_289_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_290_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (-1 == i_289_)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_289_, (byte) 8);
		if (i != class431.aChar5146)
			throw new RuntimeException();
		if ('s' != class431.aChar5140)
			throw new RuntimeException();
		int[] is = class431.method7251(string, 1982371592);
		if (i_290_ < 0 || null == is || is.length <= i_290_)
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = is[i_290_];
	}

	static final void method10040(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4579, client.aClass184_7218.aClass432_2283, -504385446);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class108.method1846(string, -796868418));
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		client.aClass184_7218.method3049(class282_sub23, 781665830);
	}

	static final void method10041(CS2Executor class527) {
		class527.anInt7000 -= 1476624725;
		class527.anInt7012 -= 425673003;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		boolean bool = ((class527.intStack[class527.anInt7012 * 1942118537]) == 1);
		boolean bool_291_ = ((class527.intStack[1 + class527.anInt7012 * 1942118537]) == 1);
		boolean bool_292_ = ((class527.intStack[2 + 1942118537 * class527.anInt7012]) == 1);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4619, client.aClass184_7218.aClass432_2283, 1356964582);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(Class108.method1846(string, -1449334299) + 1, 1417031095);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		int i = 0;
		if (bool)
			i |= 0x1;
		if (bool_291_)
			i |= 0x2;
		if (bool_292_)
			i |= 0x4;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
		client.aClass184_7218.method3049(class282_sub23, -712039324);
	}

	static final void method10042(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -56249735 * class118.anInt1426;
	}

	static final void method10043(CS2Executor class527) {
		class527.anInt7000 -= 1476624725;
		class527.anInt7012 -= 425673003;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		boolean bool = ((class527.intStack[class527.anInt7012 * 1942118537]) == 1);
		boolean bool_293_ = ((class527.intStack[1 + class527.anInt7012 * 1942118537]) == 1);
		boolean bool_294_ = ((class527.intStack[2 + 1942118537 * class527.anInt7012]) == 1);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4619, client.aClass184_7218.aClass432_2283, -646558010);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(Class108.method1846(string, -1436767709) + 1, 1417031095);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		int i = 0;
		if (bool)
			i |= 0x1;
		if (bool_293_)
			i |= 0x2;
		if (bool_294_)
			i |= 0x4;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
		client.aClass184_7218.method3049(class282_sub23, -716221428);
	}

	static final void method10044(CS2Executor class527) {
		if (0 == client.anInt7434 * 1609086245)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -2;
		else if (1 == client.anInt7434 * 1609086245)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = client.anInt7449 * 493536965;
	}

	static final void method10045(CS2Executor class527) {
		if (0 == client.anInt7434 * 1609086245)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -2;
		else if (1 == client.anInt7434 * 1609086245)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = client.anInt7449 * 493536965;
	}

	static final void method10046(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (2 == client.anInt7434 * 1609086245 && i < client.anInt7449 * 493536965) {
			Class6 class6 = client.aClass6Array7452[i];
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class6.aString37;
			if (class6.aString43 != null)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = class6.aString43;
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
		} else {
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method10047(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (2 == client.anInt7434 * 1609086245 && i < client.anInt7449 * 493536965) {
			Class6 class6 = client.aClass6Array7452[i];
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class6.aString37;
			if (class6.aString43 != null)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = class6.aString43;
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
		} else {
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method10048(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12964((byte) 67) ? 1 : 0;
	}

	static final void method10049(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1900875655 * class527.aClass61_7010.anInt636;
	}

	static final void method10050(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8229.method12714(-1271192834);
	}

	static final void method10051(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (2 == client.anInt7434 * 1609086245 && i < 493536965 * client.anInt7449)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -2041808379 * client.aClass6Array7452[i].anInt41;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10052(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class100.method1642(class118, class98, class527, 1357903715);
	}

	static final void method10053(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_295_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_296_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class117.method1981(i, (byte) 88);
		Class159.method2738(Class468_Sub8.aClass98Array7889[i >>> 16], i & 0xffff, i_295_, i_296_, class527.aBool7022, class527, -1306169472);
	}

	static final void method10054(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class152.method2603(string, -671341252);
	}

	static final void method10055(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class16.method567(string, false, (byte) -14);
	}

	static final void method10056(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class16.method567(string, false, (byte) -54);
	}

	static final void method10057(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class96_Sub19.method14665(string, 1220033429);
	}

	static final void method10058(CS2Executor class527) {
		if (Class282_Sub13.aClass61_7587 != null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
			class527.aClass61_7010 = Class282_Sub13.aClass61_7587;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10059(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class96_Sub19.method14665(string, 1220033429);
	}

	static final void method10060(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class204.method3369(class118, class98, class527, (byte) 0);
	}

	static final void method10061(CS2Executor class527) {
		if (client.aString7426 != null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class285.method5025(client.aString7426, 2082693413);
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10062(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 431003979).members ? 1 : 0);
	}

	static final void method10063(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Login.method5017(class118, class98, class527, -974856399);
	}

	static final void method10064(CS2Executor class527) {
		if (client.aString7426 != null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1772444859 * Class459.anInt5534;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10065(CS2Executor class527) {
		if (client.aString7426 != null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1772444859 * Class459.anInt5534;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10066(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.aString7426 != null && i < Class459.anInt5534 * -1772444859)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i].aString2129;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10067(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.aString7426 != null && i < Class459.anInt5534 * -1772444859)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i].aString2129;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10068(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.aString7426 != null && i < Class459.anInt5534 * -1772444859)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i].aString2129;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10069(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.aString7426 != null && i < Class459.anInt5534 * -1772444859)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i].aString2129;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10070(CS2Executor class527) {
		int i = -2123019059 * Class363.anInt4203;
		int i_297_ = 977902937 * Class263.anInt3249;
		int i_298_ = -1;
		if (Class475.aBool5623) {
			Class467[] class467s = Class405.method6825((byte) -78);
			for (int i_299_ = 0; i_299_ < class467s.length; i_299_++) {
				Class467 class467 = class467s[i_299_];
				if (i == -1928226539 * class467.anInt5571 && class467.anInt5574 * -1980032233 == i_297_) {
					i_298_ = i_299_;
					break;
				}
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_298_;
	}

	static final void method10071(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		class527.anInt7012 -= 283782002;
		Class119.method2074((String) (class527.objectStack[class527.anInt7000 * 1806726141]), (String) (class527.objectStack[1 + 1806726141 * class527.anInt7000]), (class527.intStack[1942118537 * class527.anInt7012]), 1 == (class527.intStack[class527.anInt7012 * 1942118537 + 1]), (byte) 9);
	}

	static final void method10072(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != client.aString7426 && i < -1772444859 * Class459.anInt5534)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -774562077 * Class467.aClass173Array5575[i].anInt2131;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10073(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != client.aString7426 && i < -1772444859 * Class459.anInt5534)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -774562077 * Class467.aClass173Array5575[i].anInt2131;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10074(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class118.aBool1357 = 1 == i;
		Class109.method1858(class118, (byte) 19);
	}

	static final void method10075(CS2Executor class527) {
		if (Class475.aBool5623) {
			Class467[] class467s = Class405.method6825((byte) 38);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class467s.length;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10076(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class47_Sub1.method14482(class118, class98, class527, -55099967);
	}

	static final void method10077(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class412.aByte4963;
	}

	static final void method10078(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class412.aByte4963;
	}

	static final void method10079(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class344.method6119(string, -1767384782);
	}

	static final void method10080(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(-1001317211);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 950941023);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(3);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-624100047 * class527.aClass346_7009.anInt4048, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, -1306679726);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index - i), 415006228);
		class184.method3049(class282_sub23, 51312496);
	}

	static final void method10081(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class48_Sub2.aByte9263;
	}

	static final void method10082(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class48_Sub2.aByte9263;
	}

	static final void method10083(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class202.method3345(string, -1226405014);
	}

	static final void method10084(CS2Executor class527) {
		if (client.aString7165 != null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = client.aString7165;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10085(CS2Executor class527) {
		class527.instrPtr += (class527.unknown[class527.instrPtr * 301123709]) * -1051529003;
	}

	static final void method10086(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class202.method3345(string, 875822207);
	}

	static final void method10087(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class202.method3345(string, 936323847);
	}

	static final void method10088(CS2Executor class527) {
		Class371.method6353((short) 255);
	}

	static final void method10089(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub9.method14586(class118, class98, class527, 909686877);
	}

	static final void method10090(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.membersWorld ? 1 : 0;
	}

	static final void method10091(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (0 != 1609086245 * client.anInt7434 && i < client.anInt7373 * -1754449153) {
			Class10 class10 = client.aClass10Array7456[i];
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class10.aString115;
			if (class10.aString116 != null)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = class10.aString116;
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
		} else {
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method10092(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (string.startsWith(Class76.method1358(0, (byte) 0)) || string.startsWith(Class76.method1358(1, (byte) 0)))
			string = string.substring(7);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class280.method4975(string, (byte) -27) ? 1 : 0;
	}

	static final void method10093(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != Class467.aClass173Array5575 && i < Class459.anInt5534 * -1772444859 && (Class467.aClass173Array5575[i].aString2127.equalsIgnoreCase(Class84.myPlayer.displayName)))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10094(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != Class467.aClass173Array5575 && i < Class459.anInt5534 * -1772444859 && (Class467.aClass173Array5575[i].aString2127.equalsIgnoreCase(Class84.myPlayer.displayName)))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10095(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.aString7426 != null && i < Class459.anInt5534 * -1772444859)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i].aString2130;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10096(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class204.method3366(class118, class98, class527, (byte) -125);
	}

	static final void method10097(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 60);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class290.method5121(class118, class98, class527, (byte) 7);
	}

	static final void method10098(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_300_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_300_, (byte) 0);
		if (class437.method7319(1865404616))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.aClass421_2658.method7036(i, -2087627191).method14751(i_300_, class437.aString5335, 497189997);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.aClass421_2658.method7036(i, -317395132).method14750(i_300_, -1741480635 * class437.anInt5337, (byte) 19));
	}

	static final void method10099(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		if (((UnderlayDefinition) class513).aClass118_5886.anInt1288 * 1924549737 == -1) {
			if (class527.aBool7022)
				throw new RuntimeException("");
			throw new RuntimeException("");
		}
		Class118 class118 = class513.method8772(270676545);
		class118.aClass118Array1438[1924549737 * (((UnderlayDefinition) class513).aClass118_5886.anInt1288)] = null;
		Class109.method1858(class118, (byte) 9);
	}

	static final void method10100(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1627383873 * class118.anInt1385;
	}

	static final void method10101(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -520818011 * TilestreamPacket.anInt4219;
	}

	static final void method10102(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class16.method567(string, true, (byte) -103);
	}

	static final void method10103(CS2Executor class527) {
		class527.anInt7000 -= 1476624725;
		class527.anInt7012 -= 425673003;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		boolean bool = ((class527.intStack[class527.anInt7012 * 1942118537]) == 1);
		boolean bool_301_ = ((class527.intStack[1 + class527.anInt7012 * 1942118537]) == 1);
		boolean bool_302_ = ((class527.intStack[2 + 1942118537 * class527.anInt7012]) == 1);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4619, client.aClass184_7218.aClass432_2283, 185682100);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(Class108.method1846(string, -1534851210) + 1, 1417031095);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		int i = 0;
		if (bool)
			i |= 0x1;
		if (bool_301_)
			i |= 0x2;
		if (bool_302_)
			i |= 0x4;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
		client.aClass184_7218.method3049(class282_sub23, -1082275023);
	}

	static final void method10104(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aClass10Array7456[i].aBool117 ? 1 : 0;
	}

	static final void method10105(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class2.method258(string, 779827732);
	}

	static final void method10106(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 67);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class185.method3078(class118, class98, class527, 95929190);
	}

	static final void method10107(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1627383873 * class118.anInt1385;
	}

	static final void method10108(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != client.aString7426 && i < Class459.anInt5534 * -1772444859)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i].aString2127;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10109(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_303_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class521_Sub1_Sub1_Sub6.method16125(i, i_303_, false, 769156245);
	}

	static final void method10110(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.anInt7434 * 1609086245 == 2 && i < 493536965 * client.anInt7449)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = client.aClass6Array7452[i].aBool38 ? 1 : 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10111(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.anInt7434 * 1609086245 == 2 && i < 493536965 * client.anInt7449)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = client.aClass6Array7452[i].aBool38 ? 1 : 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10112(CS2Executor class527) {
		if (Class282_Sub13.aClass61_7587 != null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
			class527.aClass61_7010 = Class282_Sub13.aClass61_7587;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10113(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 682349813 * class118.anInt1336;
	}

	static final void method10114(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class496.method8310(class118, class98, class527, (byte) -53);
	}

	static final void method10115(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (2 == client.anInt7434 * 1609086245 && i < 493536965 * client.anInt7449)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -2041808379 * client.aClass6Array7452[i].anInt41;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10116(CS2Executor class527) {
		if (null != Class58.aClass61_528) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
			class527.aClass61_7010 = Class58.aClass61_528;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10117(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class527.aClass61_7010.aString622;
	}

	static final void method10118(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aBool624 ? 1 : 0;
	}

	static final void method10119(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte619;
	}

	static final void method10120(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub4_8223.method12641(-1553817994);
	}

	static final void method10121(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte626;
	}

	static final void method10122(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte627;
	}

	static final void method10123(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_304_ = i >> 14 & 0x3fff;
		int i_305_ = i & 0x3fff;
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(996887079);
		i_304_ -= class219.anInt2711 * 1948093437;
		if (i_304_ < 0)
			i_304_ = 0;
		else if (i_304_ >= IndexLoaders.MAP_REGION_DECODER.method4424(1635049496))
			i_304_ = IndexLoaders.MAP_REGION_DECODER.method4424(-1854451930);
		i_305_ -= class219.anInt2712 * -1002240017;
		if (i_305_ < 0)
			i_305_ = 0;
		else if (i_305_ >= IndexLoaders.MAP_REGION_DECODER.method4451(-829047155))
			i_305_ = IndexLoaders.MAP_REGION_DECODER.method4451(-2043301866);
		client.anInt7262 = 2146249857 * (256 + (i_304_ << 9));
		client.anInt7376 = (256 + (i_305_ << 9)) * -1818102377;
		Class262.anInt3240 = 1540976692;
		Class86.anInt833 = -1509271845;
		Class508.anInt5864 = 987778595;
	}

	static final void method10124(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte627;
	}

	static final void method10125(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte628;
	}

	static final void method10126(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class88.method1494(class118, class527, (byte) -37);
	}

	static final void method10127(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte628;
	}

	static final void method10128(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class29.method786(class118, class98, class527, -1279446637);
	}

	static final void method10129(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte628;
	}

	static final void method10130(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Math.random() * (double) (i + 1));
	}

	static final void method10131(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.anInt632 * 1869493667;
	}

	static final void method10132(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.anInt632 * 1869493667;
	}

	static final void method10133(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.anInt632 * 1869493667;
	}

	static final void method10134(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class527.aClass61_7010.aStringArray639[i];
	}

	static final int[] method10135(String string, CS2Executor class527) {
		int[] is = null;
		if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
			int i = (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]);
			if (i > 0) {
				is = new int[i];
				while (i-- > 0)
					is[i] = (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]);
			}
		}
		return is;
	}

	static final void method10136(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByteArray640[i];
	}

	static final void method10137(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByteArray640[i];
	}

	static final void method10138(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 487511911 * class527.aClass61_7010.anInt641;
	}

	static final void method10139(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 487511911 * class527.aClass61_7010.anInt641;
	}

	static final void method10140(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 483918258).aString5043;
	}

	static final void method10141(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class52.method1083(class118, class98, class527, -1250124563);
	}

	static final void method10142(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 9);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Language.method8277(class118, class98, class527, 1697835622);
	}

	static final void method10143(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1264 * -795991475;
	}

	static final void method10144(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method502(class118, class98, class527, 575012088);
	}

	static final void method10145(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1900875655 * class527.aClass61_7010.anInt636;
	}

	static final void method10146(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass61_7010.method1197((String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]), 1747614792));
	}

	static final void method10147(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 456793949 * Class9.anInt72;
	}

	static final void method10148(CS2Executor class527) {
		class527.intStack[1942118537 * class527.anInt7012 - 1] = (class527.aClass61_7010.method1215((byte) 41)[(class527.intStack[1942118537 * class527.anInt7012 - 1])]);
	}

	static final void method10149(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method7785(i, -1023894228);
	}

	static final void method10150(CS2Executor class527) {
		Class404.method6811((class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), -967098159);
	}

	static final void method10151(CS2Executor class527) {
		Class404.method6811((class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), -967098159);
	}

	static final void method10152(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.anIntArray634[i];
	}

	static final void method10153(CS2Executor class527) {
		if (null != Class202_Sub1.aClass282_Sub4_8186) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
			class527.aClass282_Sub4_7011 = Class202_Sub1.aClass282_Sub4_8186;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10154(CS2Executor class527) {
		if (null != Class113.aClass282_Sub4_1235) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
			class527.aClass282_Sub4_7011 = Class113.aClass282_Sub4_1235;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10155(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_306_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		int i_307_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		if (i_306_ == -1)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_306_, (byte) 8);
		if (i != class431.aChar5140)
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class431.method7228(Integer.valueOf(i_307_), (byte) 5) ? 1 : 0;
	}

	static final void method10156(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7271 * -871685551 - client.anInt7270 * -240868135;
	}

	static final void method10157(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class527.aClass282_Sub4_7011.aString7501;
	}

	static final void method10158(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 38110527) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1410 = Class351.method6193(string, class527, -587951509);
		class118.aBool1384 = true;
	}

	static final void method10159(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class527.aClass282_Sub4_7011.aString7501;
	}

	static final void method10160(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class527.aClass282_Sub4_7011.aString7501;
	}

	static final void method10161(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass282_Sub4_7011.aByte7504;
	}

	static final void method10162(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass282_Sub4_7011.anInt7503 * 1014406051;
	}

	static final void method10163(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (class527.aClass282_Sub4_7011.aClass57Array7499[i].aString524);
	}

	static final void method10164(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i >> 14 & 0x3fff;
	}

	static final void method10165(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass282_Sub4_7011.aClass57Array7499[i].aByte525);
	}

	static final void method10166(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 113);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class202.method3338(class118, class98, class527, (byte) 84);
	}

	static final void method10167(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass282_Sub4_7011.aClass57Array7499[i].anInt526) * -1097296133;
	}

	static final void method10168(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass282_Sub4_7011.aClass57Array7499[i].anInt526) * -1097296133;
	}

	static final void method10169(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class118.aString1391;
	}

	static final void method10170(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class468_Sub19.method12790((Class113.aClass282_Sub4_1235 == (class527.aClass282_Sub4_7011)), i, 1170454000);
	}

	static final void method10171(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass282_Sub4_7011.method12098((String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]), 1081544557));
	}

	static final void method10172(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass282_Sub4_7011.method12098((String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]), -1617531612));
	}

	static final void method10173(Class118 class118, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_308_ = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (class118.anInt1329 * 2131324949 != 2)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(class118.anInt1330 * -402732635, (byte) 39);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, false);
		class118.aClass417_1308.aLong4993 = Class86.method1480(-247481672) * 7197667099348947907L;
		if (i_308_ < 0 || i_308_ >= class409.anIntArray4860.length)
			throw new RuntimeException("");
		class118.aClass417_1308.anIntArray4992[i_308_] = i;
		Class109.method1858(class118, (byte) 15);
	}

	static final void method10174(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class455.method7557((String) (class527.objectStack[class527.anInt7000 * 1806726141]), (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]), Class223.CURRENT_LANGUAGE, 1341608337));
	}

	static final void method10175(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = null != Class46.anObjectArray437 ? 1 : 0;
	}

	static final void method10176(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(i);
		if (class282_sub50_sub6 == null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (235539227 * class282_sub50_sub6.anInt9540 - -742910705 * class282_sub50_sub6.anInt9539);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (1097246003 * class282_sub50_sub6.anInt9535 - class282_sub50_sub6.anInt9541 * 458255425);
		}
	}

	static final void method10177(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = null != Class46.anObjectArray437 ? 1 : 0;
	}

	static final void method10178(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class175.method2960(class118, class98, class527, 1048849034);
	}

	static final void method10179(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub29_8201.method7785(i, -1858092278);
	}

	static final void method10180(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -705707341 * client.aClass330Array7428[i].anInt3865;
	}

	static final void method10181(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 192651981 * client.aClass330Array7428[i].anInt3862;
	}

	static final void method10182(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 192651981 * client.aClass330Array7428[i].anInt3862;
	}

	static final void method10183(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 192651981 * client.aClass330Array7428[i].anInt3862;
	}

	static final void method10184(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aClass330Array7428[i].anInt3867 * 1545587551;
	}

	static final void method10185(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aClass330Array7428[i].anInt3867 * 1545587551;
	}

	static final void method10186(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aClass330Array7428[i].anInt3867 * 1545587551;
	}

	static final void method10187(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_309_ = client.aClass330Array7428[i].method5908(-759535650);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_309_ == 0 ? 1 : 0;
	}

	static final void method10188(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_310_ = client.aClass330Array7428[i].method5908(1200466347);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_310_ == 0 ? 1 : 0;
	}

	static final void method10189(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_311_ = client.aClass330Array7428[i].method5908(-1501851761);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_311_ == 0 ? 1 : 0;
	}

	static final void method10190(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_312_ = client.aClass330Array7428[i].method5908(-219265355);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_312_ == 0 ? 1 : 0;
	}

	static final void method10191(CS2Executor class527) {
		Class283.anInt3384 = 0;
	}

	static final void method10192(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_313_ = client.aClass330Array7428[i].method5908(-1621449877);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_313_ == 1 ? 1 : 0;
	}

	static final void method10193(CS2Executor class527) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 38);
		class118.aClass118Array1438 = null;
		class118.aClass118Array1439 = null;
		Class109.method1858(class118, (byte) 43);
	}

	static final void method10194(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 95);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -37350919 * class118.anInt1314;
	}

	static final void method10195(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass282_Sub4_7011.aClass57Array7499[i].anInt526) * -1097296133;
	}

	static final void method10196(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_314_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_314_ * i;
	}

	static final void method10197(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12964((byte) 70) ? 1 : 0;
	}

	static final void method10198(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_315_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i / i_315_;
	}

	static final void method10199(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i > 255 || i < 0)
			i = 0;
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -53)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub11_8217), i, -1309943468);
			Class190.method3148((byte) 29);
			client.aBool7175 = false;
		}
	}

	static final void method10200(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_316_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		if (i_316_ == -1)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = IndexLoaders.aClass331_3535.method5918(i, -667880935).method15212((char) i_316_, (byte) 13);
	}

	static final void method10201(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Math.random() * (double) (i + 1));
	}

	static void method10202(Class397 class397, int i, int i_317_, CS2Executor class527) {
		CS2Script class282_sub50_sub5 = Class225_Sub1.method12792(class397, i, i_317_, 856735933);
		if (null == class282_sub50_sub5)
			Class282_Sub50_Sub17.method15509(1466184711);
		else {
			class527.intLocals = new int[class282_sub50_sub5.intLocalsCount * 693687803];
			class527.objectLocals = new Object[1886892247 * class282_sub50_sub5.stringLocalsCount];
			if (Class397.aClass397_4797 == class282_sub50_sub5.aClass397_9527 || (Class397.aClass397_4805 == class282_sub50_sub5.aClass397_9527) || (Class397.aClass397_4798 == class282_sub50_sub5.aClass397_9527)) {
				int i_318_ = 0;
				int i_319_ = 0;
				if (Class282_Sub20_Sub24.aClass118_9884 != null) {
					i_318_ = (597157617 * Class282_Sub20_Sub24.aClass118_9884.anInt1299);
					i_319_ = (198275475 * Class282_Sub20_Sub24.aClass118_9884.anInt1428);
				}
				class527.intLocals[0] = Class163.aClass209_2031.method3569(2146263135) - i_318_;
				class527.intLocals[1] = Class163.aClass209_2031.method3570(756095591) - i_319_;
			} else if (Class397.aClass397_4806 == class282_sub50_sub5.aClass397_9527)
				class527.intLocals[0] = class527.anInt7004 * -945484741;
			Class51.method1068(class282_sub50_sub5, 200000, class527, 148416869);
		}
	}

	static final void method10203(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Math.random() * (double) (i + 1));
	}

	static final void method10204(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		long l = (long) (class527.intStack[1942118537 * class527.anInt7012]);
		long l_320_ = (long) (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (l + l * l_320_ / 100L);
	}

	static final void method10205(CS2Executor class527) {
		client.aBool7189 = true;
		Class188.method3142(-1747342562);
	}

	static final void method10206(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class172.method2915(class118, class98, class527, (byte) 0);
	}

	static final void method10207(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_321_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		if (-1 == i_321_)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = IndexLoaders.aClass331_3535.method5918(i, 938672156).method15211((char) i_321_, 1241922635);
	}

	static final void method10208(CS2Executor class527) {
		Class86.method1478(-2088577682);
	}

	static final void method10209(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12615(-289124067);
	}

	static final void method10210(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_322_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i % i_322_;
	}

	static final void method10211(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_323_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i % i_323_;
	}

	static final void method10212(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_324_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i & i_324_;
	}

	static final void method10213(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_325_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		int i_326_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class96_Sub10.method14603(6, i << 16 | i_325_, i_326_, "", (byte) 8);
	}

	static final void method10214(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_327_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i & i_327_;
	}

	static final void method10215(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_328_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i & i_328_;
	}

	static final void method10216(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_329_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i | i_329_;
	}

	static final void method10217(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_330_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i | i_330_;
	}

	static final void method10218(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_331_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i > i_331_ ? i : i_331_;
	}

	static final void method10219(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		long l = (long) (class527.intStack[1942118537 * class527.anInt7012]);
		long l_332_ = (long) (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		long l_333_ = (long) (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (l_333_ * l / l_332_);
	}

	static final void method10220(CS2Executor class527) {
		Class361.aClass361_4171.method6257(-1127907633);
	}

	static final void method10221(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1507292043) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1346 = Class351.method6193(string, class527, 1821977672);
		class118.aBool1384 = true;
	}

	static final void method10222(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i ^ 0xffffffff;
	}

	static final void method10223(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append(i).toString();
	}

	static final void method10224(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append(i).toString();
	}

	static final void method10225(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append(i).toString();
	}

	static final void method10226(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_334_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append(string_334_).toString();
	}

	static final void method10227(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append(Class290.method5120(i, true, 424102832)).toString();
	}

	static final void method10228(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append(Class290.method5120(i, true, 293173843)).toString();
	}

	static final void method10229(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append(Class290.method5120(i, true, -1342075650)).toString();
	}

	static final void method10230(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Class59.method1163(i, 619010179);
	}

	static final void method10231(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string.toLowerCase();
	}

	static final void method10232(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub17.method12260(class118, class98, class527, 240003073);
	}

	static final void method10233(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (Class225_Sub5.method13045(Class302.method5363((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -847558145), Class223.CURRENT_LANGUAGE.method243((byte) 1), -783159453));
	}

	static final void method10234(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (Class225_Sub5.method13045(Class302.method5363((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -729261043), Class223.CURRENT_LANGUAGE.method243((byte) 1), -424562377));
	}

	static final void method10235(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (Class225_Sub5.method13045(Class302.method5363((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -736658088), Class223.CURRENT_LANGUAGE.method243((byte) 1), 47354296));
	}

	static final void method10236(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (Class225_Sub5.method13045(Class302.method5363((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 546033316), Class223.CURRENT_LANGUAGE.method243((byte) 1), -889002787));
	}

	static final void method10237(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_335_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		if (null != Class84.myPlayer.playerAppearance && (Class84.myPlayer.playerAppearance.aBool2929))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string_335_;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string;
	}

	static final void method10238(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class311.aString3643 != null && Class311.aString3643.equalsIgnoreCase(string))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10239(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7190 * -1474737961;
	}

	static final void method10240(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_336_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		if (null != Class84.myPlayer.playerAppearance && (Class84.myPlayer.playerAppearance.aBool2929))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string_336_;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string;
	}

	static final void method10241(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Integer.toString(i);
	}

	static final void method10242(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Integer.toString(i);
	}

	static final void method10243(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Integer.toString(i);
	}

	static final void method10244(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Integer.toString(i);
	}

	static final void method10245(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		FontRenderer.method403(class118, class98, class527, 1460484173);
	}

	static final void method10246(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class455.method7557((String) (class527.objectStack[class527.anInt7000 * 1806726141]), (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]), Class223.CURRENT_LANGUAGE, 1341608337));
	}

	static final void method10247(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		String string = (class527.aClass61_7010.method1202(client.CURRENT_GAME.anInt5746 * 1648080491 << 16 | i, 760417312));
		String string_337_;
		if (null == string)
			string_337_ = "";
		else
			string_337_ = string;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string_337_;
	}

	static final void method10248(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_338_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		Class414 class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, i_338_, 0, 1446894473);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class414.method6949(string, i, Class182.aClass160Array2261, 437013959);
	}

	static final void method10249(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_339_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		Class414 class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, i_339_, 0, 1726061712);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class414.method6949(string, i, Class182.aClass160Array2261, 437013959);
	}

	static final void method10250(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class41_Sub1_Sub1.method15524((byte) -7);
	}

	static final void method10251(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_340_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class414 class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, i_340_, 0, 1281029655);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class414.method6951(string, i, Class182.aClass160Array2261, (byte) 113);
	}

	static final void method10252(CS2Executor class527) {
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 0)
			class527.instrPtr += (-1051529003 * (class527.unknown[class527.instrPtr * 301123709]));
	}

	static final void method10253(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Math.random() * (double) i);
	}

	static final void method10254(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		String string_341_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string_341_;
	}

	static final void method10255(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -672443707 * Class262.anInt3240 == 2 ? 1 : 0;
	}

	static final void method10256(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 214077913).members ? 1 : 0);
	}

	static final void method10257(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_342_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 226373746);
		if (i_342_ >= 1 && i_342_ <= 5 && null != class425.groundOptions[i_342_ - 1])
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class425.groundOptions[i_342_ - 1];
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10258(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Class182.method3044(string, -1519993030);
	}

	static final void method10259(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i == -1)
			throw new RuntimeException("");
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append((char) i).toString();
	}

	static final void method10260(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4607, client.aClass184_7475.aClass432_2283, 443598522);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string.length() + 1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		client.aClass184_7475.method3049(class282_sub23, -630085093);
	}

	static final void method10261(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class282_Sub25.method12402((char) i, (byte) 60) ? 1 : 0;
	}

	static final void method10262(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class282_Sub25.method12402((char) i, (byte) 18) ? 1 : 0;
	}

	static final void method10263(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class380.method6450((char) i, -1856153858) ? 1 : 0;
	}

	static final void method10264(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class380.method6450((char) i, 1911135733) ? 1 : 0;
	}

	static final void method10265(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class523.method11219((char) i, -1740914866) ? 1 : 0;
	}

	static final void method10266(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class523.method11219((char) i, -1978495830) ? 1 : 0;
	}

	static final void method10267(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class523.method11219((char) i, -2031773128) ? 1 : 0;
	}

	static final void method10268(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class523.method11219((char) i, -1729073491) ? 1 : 0;
	}

	static final void method10269(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (string != null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = string.length();
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10270(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		StringBuilder stringbuilder = new StringBuilder(string.length());
		boolean bool = false;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c == '<')
				bool = true;
			else if ('>' == c)
				bool = false;
			else if (!bool)
				stringbuilder.append(c);
		}
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = stringbuilder.toString();
	}

	static final void method10271(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_343_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = string.indexOf(i, i_343_);
	}

	static final void method10272(CS2Executor class527) {
		class527.anInt7001 -= 1918006146;
		if ((class527.aLongArray7003[1820448321 * class527.anInt7001]) != (class527.aLongArray7003[1 + class527.anInt7001 * 1820448321]))
			class527.instrPtr += (-1051529003 * (class527.unknown[class527.instrPtr * 301123709]));
	}

	static final void method10273(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class202.method3338(class118, class98, class527, (byte) 96);
	}

	static final void method10274(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_344_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = string.indexOf(i, i_344_);
	}

	static final void method10275(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 60);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, true, 1, class527, (byte) -8);
	}

	static final void method10276(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Character.toLowerCase((char) i);
	}

	static final void method10277(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 86);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		TilestreamPacket.method6289(class118, class98, class527, (byte) -28);
	}

	static final void method10278(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Character.toUpperCase((char) i);
	}

	static final void method10279(CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Class202.method3342((long) i, 0, bool, Class223.CURRENT_LANGUAGE, (byte) -21);
	}

	static final void method10280(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anIntArray7336[i];
	}

	static final void method10281(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class108.method1845(class118, class98, class527, 520752801);
	}

	static final void method10282(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class414 class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, i, 0, 1307426029);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class414.method6947(string, Class182.aClass160Array2261, 1646855588);
	}

	static final void method10283(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class414 class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, i, 0, 994764847);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class414.method6947(string, Class182.aClass160Array2261, 609996953);
	}

	static final void method10284(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(Class468.method7788((long) (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]) * 60000L, Class223.CURRENT_LANGUAGE.method243((byte) 1), true, 1461008046)).append(" UTC").toString();
	}

	static final void method10285(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(Class468.method7788((long) (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]) * 60000L, Class223.CURRENT_LANGUAGE.method243((byte) 1), true, 1657622703)).append(" UTC").toString();
	}

	static final void method10286(CS2Executor class527) {
		long l = (class527.aLongArray7003[((class527.anInt7001 -= -1188480575) * 1820448321)]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = -1L == l ? "" : Long.toString(l, 36).toUpperCase();
	}

	static final void method10287(CS2Executor class527) {
		long l = (class527.aLongArray7003[((class527.anInt7001 -= -1188480575) * 1820448321)]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = -1L == l ? "" : Long.toString(l, 36).toUpperCase();
	}

	static final void method10288(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 84850318).aString5043;
	}

	static final void method10289(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 213944639).aString5043;
	}

	static final void method10290(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_345_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i, (byte) 8);
		if ('s' == class431.aChar5140) {
			/* empty */
		}
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class431.method7226(i_345_, 874964104);
	}

	static final void method10291(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1243735647).aString5043;
	}

	static final void method10292(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7325 ? 1 : 0;
	}

	static final void method10293(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloat7365 >> 3;
	}

	static final void method10294(CS2Executor class527) {
		int i = Class96_Sub14.method14641(-170598419);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class233.anInt2880 = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1078311062) * -1499268811) * -638562019;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -108);
		Class190.method3148((byte) 91);
		client.aBool7175 = false;
	}

	static final void method10295(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_346_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1173923449);
		if (i_346_ >= 1 && i_346_ <= 5 && class425.inventoryOptions[i_346_ - 1] != null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class425.inventoryOptions[i_346_ - 1];
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10296(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub17.method12260(class118, class98, class527, 673796722);
	}

	static final void method10297(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 2112163409).anInt5051 * 15210351);
	}

	static final void method10298(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 47);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class496.method8310(class118, class98, class527, (byte) -74);
	}

	static final void method10299(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[1942118537 * class527.anInt7012]) < (class527.intStack[1942118537 * class527.anInt7012 + 1]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method10300(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 111);
		Class96_Sub10.method14605(class118, class527, (byte) -79);
	}

	static final void method10301(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != client.aString7426 && i < Class459.anInt5534 * -1772444859)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i].aString2127;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10302(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1714358275).stackable * 318481945) == 1 ? 1 : 0;
	}

	static final void method10303(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub23_8202, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, 2091300524);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -68);
		Class190.method3148((byte) 39);
		client.aBool7175 = false;
	}

	static final void method10304(CS2Executor class527) {
		Class337.method6018((class527.animable), class527, 1074768751);
	}

	static final void method10305(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 56);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class241.method4149(class118, class98, class527, 1297960016);
	}

	static final void method10306(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Character.toLowerCase((char) i);
	}

	static final void method10307(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		class118.anInt1289 = (class527.intStack[class527.anInt7012 * 1942118537]) * 1000406043;
		class118.anInt1375 = 657648623 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class109.method1858(class118, (byte) -51);
		Class44.method913(class98, class118, (byte) 1);
		if (0 == -2131393857 * class118.anInt1268)
			Class12.method483(class98, class118, false, -1547902324);
	}

	static final void method10308(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class291_Sub1.aBool8027 ? 1 : 0;
	}

	static final void method10309(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 399742433).anInt5064 * 155439281);
	}

	static final void method10310(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1137164398).anInt5064 * 155439281);
	}

	static final void method10311(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1022638148).anInt5065 * 1247220121);
	}

	static final void method10312(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub4_8187, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 75051949);
		Class190.method3148((byte) 114);
	}

	static final void method10313(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 61);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub17_Sub4.method15409(class118, class98, class527, 875043054);
	}

	static final void method10314(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 2072340574).members ? 1 : 0);
	}

	static final void method10315(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.aClass191_7008 = new Class191(string, true);
	}

	static final void method10316(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 81);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class295.method5291(class118, class98, class527, 660349899);
	}

	static final void method10317(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_347_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_347_, (byte) 0);
		if (class437.method7319(1654853004))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1025226480).method7101(i_347_, class437.aString5335, -1686439930);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 441997521).method7099(i_347_, class437.anInt5337 * -1741480635, -1741938496));
	}

	static final void method10318(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12923(253781552) ? 1 : 0;
	}

	static final void method10319(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_348_ = ((class527.intStack[1942118537 * class527.anInt7012 + 1]) - 1);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 693181675);
		if (-1330791315 * class425.anInt5061 == i_348_)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class425.anInt5062 * 439280359;
		else if (i_348_ == -1576872607 * class425.anInt5030)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class425.anInt5031 * -1516146479;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
	}

	static final void method10320(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_349_ = ((class527.intStack[1942118537 * class527.anInt7012 + 1]) - 1);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 276221085);
		if (-1330791315 * class425.anInt5061 == i_349_)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class425.anInt5062 * 439280359;
		else if (i_349_ == -1576872607 * class425.anInt5030)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class425.anInt5031 * -1516146479;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
	}

	static final void method10321(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub20_Sub36.method15419(string, 1 == i, -940793702);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method10322(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub20_Sub36.method15419(string, 1 == i, -940793702);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method10323(CS2Executor class527) {
		if (null == Class308.aShortArray3621 || (Class283.anInt3384 * 1750691703 >= 560339485 * Class415.anInt4985))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = ((Class308.aShortArray3621[(Class283.anInt3384 += 220207687) * 1750691703 - 1]) & 0xffff);
	}

	static final void method10324(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub2_8205, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 580261585);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -23);
		Class190.method3148((byte) 55);
		client.aBool7175 = false;
	}

	static final void method10325(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		WorldMapAreaDefs class220 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 1433242403);
		if (null == class220.areaName)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class220.areaName;
	}

	static final void method10326(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_350_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_351_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class282_Sub20_Sub8.method15242(string, 1 == i, i_350_, i_351_, -219428938);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class415.anInt4985 * 560339485;
	}

	static final void method10327(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1648412290) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1407 = Class351.method6193(string, class527, 1705115757);
		class118.aBool1384 = true;
	}

	static final void method10328(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		class527.anInt7012 -= 283782002;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_352_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		String string_353_ = (String) (class527.objectStack[1 + 1806726141 * class527.anInt7000]);
		Class96_Sub19.method14666(string, i == 1, i_352_, string_353_, 1698652178);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method10329(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		class527.anInt7012 -= 283782002;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_354_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		String string_355_ = (String) (class527.objectStack[1 + 1806726141 * class527.anInt7000]);
		Class96_Sub19.method14666(string, i == 1, i_354_, string_355_, 1165930932);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method10330(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class202.method3345(string, 2076117839);
	}

	static final void method10331(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1400700943);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class425.aBool5101 ? 1 : 0;
	}

	static final void method10332(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1118144097).stackable * 318481945) == 1 ? 1 : 0;
	}

	static final void method10333(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1190824915);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class425.aBool5101 ? 1 : 0;
	}

	static final void method10334(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1419940968);
		int i_356_;
		if (class425.aBool5101)
			i_356_ = class425.anInt5102 * 712312847;
		else if (class425.members)
			i_356_ = Class149_Sub2.DEFAULTS_LOADER_7.anInt5880 * -1519092215;
		else
			i_356_ = Class149_Sub2.DEFAULTS_LOADER_7.anInt5881 * 725268415;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_356_;
	}

	static final void method10335(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 295697878);
		int i_357_;
		if (class425.aBool5101)
			i_357_ = class425.anInt5102 * 712312847;
		else if (class425.members)
			i_357_ = Class149_Sub2.DEFAULTS_LOADER_7.anInt5880 * -1519092215;
		else
			i_357_ = Class149_Sub2.DEFAULTS_LOADER_7.anInt5881 * 725268415;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_357_;
	}

	static final void method10336(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12923(1254888772) ? 1 : 0;
	}

	static final void method10337(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_358_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_358_, (byte) 0);
		if (class437.method7319(2146291812))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(i, (byte) -60).method6882(i_358_, class437.aString5335, -1939123518);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(i, (byte) -4).method6876(i_358_, class437.anInt5337 * -1741480635, 498421777));
	}

	static final void method10338(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(1008524869);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 2132240661);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(2);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, 2096029875);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), 874160912);
		class184.method3049(class282_sub23, -1124471954);
	}

	static final void method10339(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_359_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_359_, (byte) 0);
		if (class437.method7319(1918236110))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.MAP_REGION_DECODER.method4436(-1888636758).getObjectDefinitions(i, 65280).method7973(i_359_, class437.aString5335, (byte) 97);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.MAP_REGION_DECODER.method4436(-1881295410).getObjectDefinitions(i, 65280).method7963(i_359_, -1741480635 * class437.anInt5337, -997837377));
	}

	static final void method10340(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		if (class118.aString1369 == null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class118.aString1369;
	}

	static final void method10341(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_360_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_360_, (byte) 0);
		if (class437.method7319(1615488377))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.aClass421_2658.method7036(i, 1597469751).method14751(i_360_, class437.aString5335, -30397290);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.aClass421_2658.method7036(i, 1889825505).method14750(i_360_, -1741480635 * class437.anInt5337, (byte) 10));
	}

	static final void method10342(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_361_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_361_, (byte) 0);
		if (class437.method7319(1659561594))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.aClass523_3868.method11205(i, (byte) 11).method11129(i_361_, class437.aString5335, 794799711);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.aClass523_3868.method11205(i, (byte) 26).method11133(i_361_, -1741480635 * class437.anInt5337, 481472556));
	}

	static final void method10343(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 539377845 * class118.anInt1334;
	}

	static final void method10344(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_362_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_362_, (byte) 0);
		if (class437.method7319(2139403259))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.aClass523_3868.method11205(i, (byte) -4).method11129(i_362_, class437.aString5335, 836296501);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.aClass523_3868.method11205(i, (byte) -63).method11133(i_362_, -1741480635 * class437.anInt5337, 1331186910));
	}

	static final void method10345(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class290.method5121(class118, class98, class527, (byte) 7);
	}

	static final void method10346(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_363_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_363_, (byte) 0);
		if (class437.method7319(1924089808))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.aClass523_3868.method11205(i, (byte) 51).method11129(i_363_, class437.aString5335, 1074208350);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.aClass523_3868.method11205(i, (byte) 28).method11133(i_363_, -1741480635 * class437.anInt5337, 1142473088));
	}

	static final void method10347(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class227 class227 = IndexLoaders.aClass211_9383.method3616(i, (byte) -93);
		if (null != class227.anIntArray2814 && class227.anIntArray2814.length > 0) {
			int i_364_ = 0;
			int i_365_ = class227.anIntArray2789[0];
			for (int i_366_ = 1; i_366_ < class227.anIntArray2814.length; i_366_++) {
				if (class227.anIntArray2789[i_366_] > i_365_) {
					i_364_ = i_366_;
					i_365_ = class227.anIntArray2789[i_366_];
				}
			}
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class227.anIntArray2814[i_364_];
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -243982531 * class227.anInt2819;
	}

	static final void method10348(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7323 ? 1 : 0;
	}

	static final void method10349(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7323 ? 1 : 0;
	}

	static final void method10350(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (0 != -1741204137 * client.anInt7166 || JS5CacheFile.method3360((byte) 105))
			client.aByte7458 = (byte) -5;
		else if (string.length() > 20)
			client.aByte7458 = (byte) -4;
		else {
			client.aByte7458 = (byte) -1;
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4624, client.aClass184_7218.aClass432_2283, 930448920);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
			int i = (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13061((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index) - i, 1232289389);
			client.aClass184_7218.method3049(class282_sub23, -1135854104);
		}
	}

	static final void method10351(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (0 != -1741204137 * client.anInt7166 || JS5CacheFile.method3360((byte) 50))
			client.aByte7458 = (byte) -5;
		else if (string.length() > 20)
			client.aByte7458 = (byte) -4;
		else {
			client.aByte7458 = (byte) -1;
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4624, client.aClass184_7218.aClass432_2283, -589730901);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
			int i = (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13061((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index) - i, -881278367);
			client.aClass184_7218.method3049(class282_sub23, -481321628);
		}
	}

	static final void method10352(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (0 != -1741204137 * client.anInt7166 || JS5CacheFile.method3360((byte) -77))
			client.aByte7458 = (byte) -5;
		else if (string.length() > 20)
			client.aByte7458 = (byte) -4;
		else {
			client.aByte7458 = (byte) -1;
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4624, client.aClass184_7218.aClass432_2283, 641388695);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
			int i = (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13061((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index) - i, -1813721053);
			client.aClass184_7218.method3049(class282_sub23, -791551444);
		}
	}

	static final void method10353(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		ReferenceTable.method5763(class118, class98, class527, 1148441316);
	}

	static final void method10354(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aByte7458;
		if (client.aByte7458 != -1)
			client.aByte7458 = (byte) -6;
	}

	static final void method10355(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aByte7458;
		if (client.aByte7458 != -1)
			client.aByte7458 = (byte) -6;
	}

	static final void method10356(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7316 ? 1 : 0;
	}

	static final void method10357(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		class118.anInt1295 = 1302798223 * (class527.intStack[class527.anInt7012 * 1942118537]);
		class118.anInt1296 = (-1965685901 * (class527.intStack[1942118537 * class527.anInt7012 + 1]));
		int i = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		if (i < 0)
			i = 0;
		else if (i > 5)
			i = 5;
		int i_367_ = (class527.intStack[3 + 1942118537 * class527.anInt7012]);
		if (i_367_ < 0)
			i_367_ = 0;
		else if (i_367_ > 5)
			i_367_ = 5;
		class118.aByte1333 = (byte) i;
		class118.aByte1355 = (byte) i_367_;
		Class109.method1858(class118, (byte) -18);
		Class44.method913(class98, class118, (byte) 1);
		if (class118.anInt1268 * -2131393857 == 0)
			Class12.method483(class98, class118, false, -594761730);
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class396.method6774(class118.anInt1287 * -1952846363, (byte) -49);
	}

	static final void method10358(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -574868913 * client.anInt7416;
	}

	static final void method10359(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -574868913 * client.anInt7416;
	}

	static final void method10360(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 124);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1337 * -1009302201;
	}

	static final void method10361(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		client.anInt7416 = (class527.intStack[1942118537 * class527.anInt7012]) * 1429316783;
		Class149_Sub2.aClass461_9316 = Class246.method4203((class527.intStack[(class527.anInt7012 * 1942118537) + 1]), (byte) 2);
		if (Class149_Sub2.aClass461_9316 == null)
			Class149_Sub2.aClass461_9316 = Class461.aClass461_5539;
		client.anInt7422 = ((class527.intStack[2 + class527.anInt7012 * 1942118537]) * 1267760345);
		Class184 class184 = Class468_Sub20.method12807(-1987053409);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4547, class184.aClass432_2283, 1966966269);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-574868913 * client.anInt7416);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1977256787 * Class149_Sub2.aClass461_9316.anInt5541);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(client.anInt7422 * 1334854505);
		class184.method3049(class282_sub23, -973022516);
	}

	static final void method10362(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_368_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_369_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (null == string_368_)
			string_368_ = "";
		if (string_368_.length() > 80)
			string_368_ = string_368_.substring(0, 80);
		Class184 class184 = Class468_Sub20.method12807(855993982);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4611, class184.aClass432_2283, -435026561);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte((Class108.method1846(string, -1920374435) + 2 + Class108.method1846(string_368_, -2035898353)));
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i - 1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_369_);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_368_);
		class184.method3049(class282_sub23, 1292057227);
	}

	static final void method10363(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3565((byte) -37) ? 1 : 0;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3566(-2143623365) ? 1 : 0;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3567((byte) 93) ? 1 : 0;
	}

	static final void method10364(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		String string = "";
		if (class108 != null && null != class108.aString1083)
			string = class108.aString1083;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10365(CS2Executor class527) {
		Class283.anInt3384 = 0;
	}

	static final void method10366(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_370_ = -1;
		if (null != class108)
			i_370_ = class108.anInt1092 * 1608788053;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_370_;
	}

	static final void method10367(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		IsaacCipher.method7267(class118, class98, class527, -2093948322);
	}

	static final void method10368(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8229.method12714(1822943470);
	}

	static final void method10369(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i, (byte) 0);
		if (!class437.aString5335.equals(string))
			class118.method2000(i, string, 2127965321);
		else
			class118.method1995(i, -1265527536);
	}

	static final void method10370(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (i < 0 || i > 9)
			class527.anInt7000 -= 1476624725;
		else
			class118.method1994(i, (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), (byte) 53);
	}

	static final void method10371(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (0 != -644057819 * client.rights || (!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
			String string_371_ = string.toLowerCase();
			int i = 0;
			if (string_371_.startsWith(Message.aClass433_5310.translate(Language.aClass495_5795, -1546927432))) {
				i = 0;
				string = string.substring(Message.aClass433_5310.translate(Language.aClass495_5795, -1380043712).length());
			} else if (string_371_.startsWith(Message.aClass433_5224.translate((Language.aClass495_5795), -1331141297))) {
				i = 1;
				string = string.substring(Message.aClass433_5224.translate(Language.aClass495_5795, -919911879).length());
			} else if (string_371_.startsWith(Message.aClass433_5312.translate((Language.aClass495_5795), -1846042780))) {
				i = 2;
				string = string.substring(Message.aClass433_5312.translate(Language.aClass495_5795, -418025635).length());
			} else if (string_371_.startsWith(Message.aClass433_5313.translate((Language.aClass495_5795), -1974340645))) {
				i = 3;
				string = string.substring(Message.aClass433_5313.translate(Language.aClass495_5795, -476699845).length());
			} else if (string_371_.startsWith(Message.aClass433_5314.translate((Language.aClass495_5795), -1809343571))) {
				i = 4;
				string = string.substring(Message.aClass433_5314.translate(Language.aClass495_5795, -1590876682).length());
			} else if (string_371_.startsWith(Message.aClass433_5221.translate((Language.aClass495_5795), -791155435))) {
				i = 5;
				string = string.substring(Message.aClass433_5221.translate(Language.aClass495_5795, -1058644956).length());
			} else if (string_371_.startsWith(Message.aClass433_5194.translate((Language.aClass495_5795), -1738833143))) {
				i = 6;
				string = string.substring(Message.aClass433_5194.translate(Language.aClass495_5795, -2077856510).length());
			} else if (string_371_.startsWith(Message.aClass433_5317.translate((Language.aClass495_5795), -1430099627))) {
				i = 7;
				string = string.substring(Message.aClass433_5317.translate(Language.aClass495_5795, -233803088).length());
			} else if (string_371_.startsWith(Message.aClass433_5318.translate((Language.aClass495_5795), -685825411))) {
				i = 8;
				string = string.substring(Message.aClass433_5318.translate(Language.aClass495_5795, -1618179729).length());
			} else if (string_371_.startsWith(Message.aClass433_5319.translate((Language.aClass495_5795), -882167756))) {
				i = 9;
				string = string.substring(Message.aClass433_5319.translate(Language.aClass495_5795, -347020502).length());
			} else if (string_371_.startsWith(Message.aClass433_5320.translate((Language.aClass495_5795), -1636497091))) {
				i = 10;
				string = string.substring(Message.aClass433_5320.translate(Language.aClass495_5795, -1760627942).length());
			} else if (string_371_.startsWith(Message.aClass433_5199.translate((Language.aClass495_5795), -1019566836))) {
				i = 11;
				string = string.substring(Message.aClass433_5199.translate(Language.aClass495_5795, -826823953).length());
			} else if (Class223.CURRENT_LANGUAGE != Language.aClass495_5795) {
				if (string_371_.startsWith(Message.aClass433_5310.translate(Class223.CURRENT_LANGUAGE, -1331338226))) {
					i = 0;
					string = string.substring(Message.aClass433_5310.translate(Class223.CURRENT_LANGUAGE, -1400123612).length());
				} else if (string_371_.startsWith(Message.aClass433_5224.translate(Class223.CURRENT_LANGUAGE, -2102177210))) {
					i = 1;
					string = string.substring(Message.aClass433_5224.translate(Class223.CURRENT_LANGUAGE, -378453306).length());
				} else if (string_371_.startsWith(Message.aClass433_5312.translate(Class223.CURRENT_LANGUAGE, -303540187))) {
					i = 2;
					string = string.substring(Message.aClass433_5312.translate(Class223.CURRENT_LANGUAGE, -1474039252).length());
				} else if (string_371_.startsWith(Message.aClass433_5313.translate(Class223.CURRENT_LANGUAGE, -1947633916))) {
					i = 3;
					string = string.substring(Message.aClass433_5313.translate(Class223.CURRENT_LANGUAGE, -495326148).length());
				} else if (string_371_.startsWith(Message.aClass433_5314.translate(Class223.CURRENT_LANGUAGE, -893659178))) {
					i = 4;
					string = string.substring(Message.aClass433_5314.translate(Class223.CURRENT_LANGUAGE, -694475172).length());
				} else if (string_371_.startsWith(Message.aClass433_5221.translate(Class223.CURRENT_LANGUAGE, -697721969))) {
					i = 5;
					string = string.substring(Message.aClass433_5221.translate(Class223.CURRENT_LANGUAGE, -1017141107).length());
				} else if (string_371_.startsWith(Message.aClass433_5194.translate(Class223.CURRENT_LANGUAGE, -2078078763))) {
					i = 6;
					string = string.substring(Message.aClass433_5194.translate(Class223.CURRENT_LANGUAGE, -1029562308).length());
				} else if (string_371_.startsWith(Message.aClass433_5317.translate(Class223.CURRENT_LANGUAGE, -578997633))) {
					i = 7;
					string = string.substring(Message.aClass433_5317.translate(Class223.CURRENT_LANGUAGE, -2101442280).length());
				} else if (string_371_.startsWith(Message.aClass433_5318.translate(Class223.CURRENT_LANGUAGE, -1102126179))) {
					i = 8;
					string = string.substring(Message.aClass433_5318.translate(Class223.CURRENT_LANGUAGE, -1348136538).length());
				} else if (string_371_.startsWith(Message.aClass433_5319.translate(Class223.CURRENT_LANGUAGE, -480847181))) {
					i = 9;
					string = string.substring(Message.aClass433_5319.translate(Class223.CURRENT_LANGUAGE, -1505864512).length());
				} else if (string_371_.startsWith(Message.aClass433_5320.translate(Class223.CURRENT_LANGUAGE, -2128961088))) {
					i = 10;
					string = string.substring(Message.aClass433_5320.translate(Class223.CURRENT_LANGUAGE, -640131025).length());
				} else if (string_371_.startsWith(Message.aClass433_5199.translate(Class223.CURRENT_LANGUAGE, -1096237121))) {
					i = 11;
					string = string.substring(Message.aClass433_5199.translate(Class223.CURRENT_LANGUAGE, -2012234665).length());
				}
			}
			string_371_ = string.toLowerCase();
			int i_372_ = 0;
			if (string_371_.startsWith(Message.aClass433_5292.translate(Language.aClass495_5795, -1737952685))) {
				i_372_ = 1;
				string = string.substring(Message.aClass433_5292.translate(Language.aClass495_5795, -1953339716).length());
			} else if (string_371_.startsWith(Message.aClass433_5323.translate((Language.aClass495_5795), -1734544764))) {
				i_372_ = 2;
				string = string.substring(Message.aClass433_5323.translate(Language.aClass495_5795, -1320256914).length());
			} else if (string_371_.startsWith(Message.aClass433_5324.translate((Language.aClass495_5795), -1569662260))) {
				i_372_ = 3;
				string = string.substring(Message.aClass433_5324.translate(Language.aClass495_5795, -1291741768).length());
			} else if (string_371_.startsWith(Message.aClass433_5325.translate((Language.aClass495_5795), -697209640))) {
				i_372_ = 4;
				string = string.substring(Message.aClass433_5325.translate(Language.aClass495_5795, -1693260634).length());
			} else if (string_371_.startsWith(Message.aClass433_5326.translate((Language.aClass495_5795), -1713875673))) {
				i_372_ = 5;
				string = string.substring(Message.aClass433_5326.translate(Language.aClass495_5795, -859726485).length());
			} else if (Language.aClass495_5795 != Class223.CURRENT_LANGUAGE) {
				if (string_371_.startsWith(Message.aClass433_5292.translate(Class223.CURRENT_LANGUAGE, -994990273))) {
					i_372_ = 1;
					string = string.substring(Message.aClass433_5292.translate(Class223.CURRENT_LANGUAGE, -1637846853).length());
				} else if (string_371_.startsWith(Message.aClass433_5323.translate(Class223.CURRENT_LANGUAGE, -564819830))) {
					i_372_ = 2;
					string = string.substring(Message.aClass433_5323.translate(Class223.CURRENT_LANGUAGE, -253852868).length());
				} else if (string_371_.startsWith(Message.aClass433_5324.translate(Class223.CURRENT_LANGUAGE, -1174119276))) {
					i_372_ = 3;
					string = string.substring(Message.aClass433_5324.translate(Class223.CURRENT_LANGUAGE, -1082279579).length());
				} else if (string_371_.startsWith(Message.aClass433_5325.translate(Class223.CURRENT_LANGUAGE, -1080976935))) {
					i_372_ = 4;
					string = string.substring(Message.aClass433_5325.translate(Class223.CURRENT_LANGUAGE, -1766209724).length());
				} else if (string_371_.startsWith(Message.aClass433_5326.translate(Class223.CURRENT_LANGUAGE, -223134670))) {
					i_372_ = 5;
					string = string.substring(Message.aClass433_5326.translate(Class223.CURRENT_LANGUAGE, -2008191304).length());
				}
			}
			Class184 class184 = Class468_Sub20.method12807(-108099634);
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4538, class184.aClass432_2283, -691654357);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
			int i_373_ = (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_372_);
			Class427.method7189(class282_sub23.aClass282_Sub35_Sub2_7682, string, -1024978161);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291) - i_373_, 829742739);
			class184.method3049(class282_sub23, 1989975421);
		}
	}

	static final void method10372(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (0 != -644057819 * client.rights || (!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
			String string_374_ = string.toLowerCase();
			int i = 0;
			if (string_374_.startsWith(Message.aClass433_5310.translate(Language.aClass495_5795, -2130467425))) {
				i = 0;
				string = string.substring(Message.aClass433_5310.translate(Language.aClass495_5795, -1805266233).length());
			} else if (string_374_.startsWith(Message.aClass433_5224.translate((Language.aClass495_5795), -1654533711))) {
				i = 1;
				string = string.substring(Message.aClass433_5224.translate(Language.aClass495_5795, -1913880845).length());
			} else if (string_374_.startsWith(Message.aClass433_5312.translate((Language.aClass495_5795), -663125369))) {
				i = 2;
				string = string.substring(Message.aClass433_5312.translate(Language.aClass495_5795, -2102850497).length());
			} else if (string_374_.startsWith(Message.aClass433_5313.translate((Language.aClass495_5795), -2132875158))) {
				i = 3;
				string = string.substring(Message.aClass433_5313.translate(Language.aClass495_5795, -1790536667).length());
			} else if (string_374_.startsWith(Message.aClass433_5314.translate((Language.aClass495_5795), -858233862))) {
				i = 4;
				string = string.substring(Message.aClass433_5314.translate(Language.aClass495_5795, -915546017).length());
			} else if (string_374_.startsWith(Message.aClass433_5221.translate((Language.aClass495_5795), -252301342))) {
				i = 5;
				string = string.substring(Message.aClass433_5221.translate(Language.aClass495_5795, -359615989).length());
			} else if (string_374_.startsWith(Message.aClass433_5194.translate((Language.aClass495_5795), -1335013747))) {
				i = 6;
				string = string.substring(Message.aClass433_5194.translate(Language.aClass495_5795, -1917316833).length());
			} else if (string_374_.startsWith(Message.aClass433_5317.translate((Language.aClass495_5795), -819416795))) {
				i = 7;
				string = string.substring(Message.aClass433_5317.translate(Language.aClass495_5795, -1911784429).length());
			} else if (string_374_.startsWith(Message.aClass433_5318.translate((Language.aClass495_5795), -1828537334))) {
				i = 8;
				string = string.substring(Message.aClass433_5318.translate(Language.aClass495_5795, -1516408281).length());
			} else if (string_374_.startsWith(Message.aClass433_5319.translate((Language.aClass495_5795), -966394666))) {
				i = 9;
				string = string.substring(Message.aClass433_5319.translate(Language.aClass495_5795, -1986711211).length());
			} else if (string_374_.startsWith(Message.aClass433_5320.translate((Language.aClass495_5795), -610696453))) {
				i = 10;
				string = string.substring(Message.aClass433_5320.translate(Language.aClass495_5795, -912187599).length());
			} else if (string_374_.startsWith(Message.aClass433_5199.translate((Language.aClass495_5795), -1476148277))) {
				i = 11;
				string = string.substring(Message.aClass433_5199.translate(Language.aClass495_5795, -2014309215).length());
			} else if (Class223.CURRENT_LANGUAGE != Language.aClass495_5795) {
				if (string_374_.startsWith(Message.aClass433_5310.translate(Class223.CURRENT_LANGUAGE, -452372266))) {
					i = 0;
					string = string.substring(Message.aClass433_5310.translate(Class223.CURRENT_LANGUAGE, -1008736212).length());
				} else if (string_374_.startsWith(Message.aClass433_5224.translate(Class223.CURRENT_LANGUAGE, -420370220))) {
					i = 1;
					string = string.substring(Message.aClass433_5224.translate(Class223.CURRENT_LANGUAGE, -708029763).length());
				} else if (string_374_.startsWith(Message.aClass433_5312.translate(Class223.CURRENT_LANGUAGE, -1122574097))) {
					i = 2;
					string = string.substring(Message.aClass433_5312.translate(Class223.CURRENT_LANGUAGE, -1052021043).length());
				} else if (string_374_.startsWith(Message.aClass433_5313.translate(Class223.CURRENT_LANGUAGE, -1993356956))) {
					i = 3;
					string = string.substring(Message.aClass433_5313.translate(Class223.CURRENT_LANGUAGE, -1110377140).length());
				} else if (string_374_.startsWith(Message.aClass433_5314.translate(Class223.CURRENT_LANGUAGE, -399875761))) {
					i = 4;
					string = string.substring(Message.aClass433_5314.translate(Class223.CURRENT_LANGUAGE, -1673193810).length());
				} else if (string_374_.startsWith(Message.aClass433_5221.translate(Class223.CURRENT_LANGUAGE, -2002814099))) {
					i = 5;
					string = string.substring(Message.aClass433_5221.translate(Class223.CURRENT_LANGUAGE, -2082866373).length());
				} else if (string_374_.startsWith(Message.aClass433_5194.translate(Class223.CURRENT_LANGUAGE, -630410309))) {
					i = 6;
					string = string.substring(Message.aClass433_5194.translate(Class223.CURRENT_LANGUAGE, -749178991).length());
				} else if (string_374_.startsWith(Message.aClass433_5317.translate(Class223.CURRENT_LANGUAGE, -2120264613))) {
					i = 7;
					string = string.substring(Message.aClass433_5317.translate(Class223.CURRENT_LANGUAGE, -1645008473).length());
				} else if (string_374_.startsWith(Message.aClass433_5318.translate(Class223.CURRENT_LANGUAGE, -1321730775))) {
					i = 8;
					string = string.substring(Message.aClass433_5318.translate(Class223.CURRENT_LANGUAGE, -925739015).length());
				} else if (string_374_.startsWith(Message.aClass433_5319.translate(Class223.CURRENT_LANGUAGE, -2041225036))) {
					i = 9;
					string = string.substring(Message.aClass433_5319.translate(Class223.CURRENT_LANGUAGE, -748086953).length());
				} else if (string_374_.startsWith(Message.aClass433_5320.translate(Class223.CURRENT_LANGUAGE, -368890785))) {
					i = 10;
					string = string.substring(Message.aClass433_5320.translate(Class223.CURRENT_LANGUAGE, -946703939).length());
				} else if (string_374_.startsWith(Message.aClass433_5199.translate(Class223.CURRENT_LANGUAGE, -1011029108))) {
					i = 11;
					string = string.substring(Message.aClass433_5199.translate(Class223.CURRENT_LANGUAGE, -922549943).length());
				}
			}
			string_374_ = string.toLowerCase();
			int i_375_ = 0;
			if (string_374_.startsWith(Message.aClass433_5292.translate(Language.aClass495_5795, -1628435747))) {
				i_375_ = 1;
				string = string.substring(Message.aClass433_5292.translate(Language.aClass495_5795, -790364010).length());
			} else if (string_374_.startsWith(Message.aClass433_5323.translate((Language.aClass495_5795), -402000366))) {
				i_375_ = 2;
				string = string.substring(Message.aClass433_5323.translate(Language.aClass495_5795, -1037328848).length());
			} else if (string_374_.startsWith(Message.aClass433_5324.translate((Language.aClass495_5795), -406851506))) {
				i_375_ = 3;
				string = string.substring(Message.aClass433_5324.translate(Language.aClass495_5795, -409106598).length());
			} else if (string_374_.startsWith(Message.aClass433_5325.translate((Language.aClass495_5795), -1479686789))) {
				i_375_ = 4;
				string = string.substring(Message.aClass433_5325.translate(Language.aClass495_5795, -1691958178).length());
			} else if (string_374_.startsWith(Message.aClass433_5326.translate((Language.aClass495_5795), -1188759940))) {
				i_375_ = 5;
				string = string.substring(Message.aClass433_5326.translate(Language.aClass495_5795, -1094334040).length());
			} else if (Language.aClass495_5795 != Class223.CURRENT_LANGUAGE) {
				if (string_374_.startsWith(Message.aClass433_5292.translate(Class223.CURRENT_LANGUAGE, -444622828))) {
					i_375_ = 1;
					string = string.substring(Message.aClass433_5292.translate(Class223.CURRENT_LANGUAGE, -1198827104).length());
				} else if (string_374_.startsWith(Message.aClass433_5323.translate(Class223.CURRENT_LANGUAGE, -463958313))) {
					i_375_ = 2;
					string = string.substring(Message.aClass433_5323.translate(Class223.CURRENT_LANGUAGE, -1505819746).length());
				} else if (string_374_.startsWith(Message.aClass433_5324.translate(Class223.CURRENT_LANGUAGE, -2080326473))) {
					i_375_ = 3;
					string = string.substring(Message.aClass433_5324.translate(Class223.CURRENT_LANGUAGE, -1684576138).length());
				} else if (string_374_.startsWith(Message.aClass433_5325.translate(Class223.CURRENT_LANGUAGE, -1855907175))) {
					i_375_ = 4;
					string = string.substring(Message.aClass433_5325.translate(Class223.CURRENT_LANGUAGE, -328444459).length());
				} else if (string_374_.startsWith(Message.aClass433_5326.translate(Class223.CURRENT_LANGUAGE, -1433288046))) {
					i_375_ = 5;
					string = string.substring(Message.aClass433_5326.translate(Class223.CURRENT_LANGUAGE, -309344146).length());
				}
			}
			Class184 class184 = Class468_Sub20.method12807(1979727248);
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4538, class184.aClass432_2283, 1639937388);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
			int i_376_ = (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_375_);
			Class427.method7189(class282_sub23.aClass282_Sub35_Sub2_7682, string, -856431694);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291) - i_376_, -783447467);
			class184.method3049(class282_sub23, 706290819);
		}
	}

	static final void method10373(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1324 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 1596298199);
		Class109.method1858(class118, (byte) -38);
	}

	static final void method10374(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub10_8215.method12691(2089431660) == 1 ? 1 : 0;
	}

	static final void method10375(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		String string = "";
		if (class108 != null && null != class108.aString1087)
			string = class108.aString1087;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10376(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		String string = "";
		if (class108 != null && null != class108.aString1087)
			string = class108.aString1087;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10377(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		String string = "";
		if (null != class108 && null != class108.aString1090)
			string = class108.aString1090;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10378(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		String string = "";
		if (null != class108 && null != class108.aString1090)
			string = class108.aString1090;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10379(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.anInt635 * -1130104385;
	}

	static final void method10380(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_377_ = -1;
		if (class108 != null)
			i_377_ = class108.anInt1091 * -1987818893;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_377_;
	}

	static final void method10381(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_378_ = -1;
		if (class108 != null)
			i_378_ = class108.anInt1091 * -1987818893;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_378_;
	}

	static final void method10382(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_379_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i | 1 << i_379_;
	}

	static final void method10383(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1498966688).stackable * 318481945) == 1 ? 1 : 0;
	}

	static final void method10384(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 84);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Defaults7Loader.method8754(class118, class98, class527, 1449946769);
	}

	static final void method10385(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class41_Sub1_Sub1.method15524((byte) -117);
	}

	static final void method10386(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_380_ = 0;
		if (null != class108)
			i_380_ = 905843927 * class108.anInt1086;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_380_;
	}

	static final void method10387(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_381_ = -1;
		if (null != class108)
			i_381_ = 840973581 * class108.anInt1085;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_381_;
	}

	static final void method10388(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_382_ = -1;
		if (null != class108)
			i_382_ = 840973581 * class108.anInt1085;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_382_;
	}

	static final void method10389(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_383_ = -1;
		if (null != class108)
			i_383_ = -2005145885 * class108.anInt1084;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_383_;
	}

	static final void method10390(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		int i_384_ = -1;
		if (null != class108)
			i_384_ = -2005145885 * class108.anInt1084;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_384_;
	}

	static final void method10391(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i, (byte) -1);
		String string = "";
		if (null != class108 && null != class108.aString1088)
			string = class108.aString1088;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10392(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = IndexLoaders.aClass331_3535.method5918(i, -1285554753).aString9744;
	}

	static final void method10393(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = IndexLoaders.aClass331_3535.method5918(i, -1350518229).aString9744;
	}

	static final void method10394(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = IndexLoaders.aClass331_3535.method5918(i, 346970508).aString9744;
	}

	static final void method10395(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class493.method8273(string, (byte) 71);
	}

	static final void method10396(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_385_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class282_Sub50_Sub14 class282_sub50_sub14 = IndexLoaders.aClass331_3535.method5918(i, -652762533);
		int i_386_ = class282_sub50_sub14.anIntArray9746[i_385_];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_386_;
	}

	static final void method10397(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_387_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class282_Sub50_Sub14 class282_sub50_sub14 = IndexLoaders.aClass331_3535.method5918(i, 1379532633);
		int i_388_ = class282_sub50_sub14.anIntArray9746[i_387_];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_388_;
	}

	static final void method10398(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub14 class282_sub50_sub14 = IndexLoaders.aClass331_3535.method5918(i, 1897274325);
		if (null == class282_sub50_sub14.anIntArray9747)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub14.anIntArray9747.length;
	}

	static final void method10399(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_389_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.aClass331_3535.method5918(i, -1934263040).anIntArray9747[i_389_]);
	}

	static final void method10400(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub9 class282_sub50_sub9 = IndexLoaders.aClass429_4265.method7214(i, -1639587191);
		if (null == class282_sub50_sub9.anIntArray9624)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub9.anIntArray9624.length;
	}

	static final void method10401(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_390_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		Class31.method812(i, new Class282_Sub44(i_390_, 3), null, true, (byte) 51);
	}

	static final void method10402(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_391_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.aClass429_4265.method7214(i, -2087802368).anIntArray9624[i_391_]);
	}

	static final void method10403(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_392_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.aClass429_4265.method7214(i, -1560932620).anIntArray9624[i_392_]);
	}

	static final void method10404(boolean bool, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 69);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		if (bool)
			Class455.method7554(class98, class118, 199285350);
		else
			WorldMapIndexLoader.method3710(class98, class118, 983481657);
	}

	static final void method10405(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1191769047);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class425.aBool5101 ? 1 : 0;
	}

	static final void method10406(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		Class320.anIntArray3724[i] = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub20_Sub11.method15264(i, (short) 21244);
		client.aBool7400 |= Class282_Sub17_Sub2.aBoolArray9934[i];
	}

	static final void method10407(CS2Executor class527) {
		class527.aClass346_7009 = new Class346();
		class527.aClass346_7009.anInt4048 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1506067503);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047 = IndexLoaders.aClass429_4265.method7214(((class527.aClass346_7009.anInt4048) * -624100047), -2019750427);
		class527.aClass346_7009.anIntArray4046 = new int[class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14916(2039841796)];
	}

	static final void method10408(CS2Executor class527) {
		class527.aClass346_7009 = new Class346();
		class527.aClass346_7009.anInt4048 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1506067503);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047 = IndexLoaders.aClass429_4265.method7214(((class527.aClass346_7009.anInt4048) * -624100047), -1797308588);
		class527.aClass346_7009.anIntArray4046 = new int[class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14916(-41276329)];
	}

	static final void method10409(CS2Executor class527) {
		class527.aClass346_7009 = new Class346();
		class527.aClass346_7009.anInt4048 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1506067503);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047 = IndexLoaders.aClass429_4265.method7214(((class527.aClass346_7009.anInt4048) * -624100047), -1746981790);
		class527.aClass346_7009.anIntArray4046 = new int[class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14916(1375143885)];
	}

	static final void method10410(CS2Executor class527) {
		class527.aClass346_7009 = new Class346();
		class527.aClass346_7009.anInt4048 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1506067503);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047 = IndexLoaders.aClass429_4265.method7214(((class527.aClass346_7009.anInt4048) * -624100047), -2048231116);
		class527.aClass346_7009.anIntArray4046 = new int[class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14916(528779723)];
	}

	static final void method10411(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(-140822631);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 1950209077);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-624100047 * class527.aClass346_7009.anInt4048, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, 1323216285);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), -1394352542);
		class184.method3049(class282_sub23, 454081180);
	}

	static final void method10412(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(-20864091);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 1700852602);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-624100047 * class527.aClass346_7009.anInt4048, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, -1430350881);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), -176167864);
		class184.method3049(class282_sub23, -660073835);
	}

	static final void method10413(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class184 class184 = Class468_Sub20.method12807(1335020812);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4541, class184.aClass432_2283, 574729056);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, 1126101962);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), 97554957);
		class184.method3049(class282_sub23, 1904458244);
	}

	static final void method10414(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class184 class184 = Class468_Sub20.method12807(-1043896267);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4541, class184.aClass432_2283, 1099214983);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, -161749518);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), -1288498854);
		class184.method3049(class282_sub23, -194942166);
	}

	static final void method10415(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4614, client.aClass184_7475.aClass432_2283, 2015239729);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string.length() + 1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		client.aClass184_7475.method3049(class282_sub23, -970230067);
	}

	static final void method10416(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(669611439);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 832994777);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, -34733041);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), 255892414);
		class184.method3049(class282_sub23, 1235299942);
	}

	static final void method10417(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(-1004695613);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, -106306887);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, 299349682);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), -1729297102);
		class184.method3049(class282_sub23, 471442088);
	}

	static final void method10418(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class417.anInt4994 * -385885769;
	}

	static final void method10419(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(1314679845);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 1386550891);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, -396301681);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), 482887850);
		class184.method3049(class282_sub23, 84732002);
	}

	static final void method10420(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1299 * 597157617;
	}

	static final void method10421(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_393_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		if (string.length() <= 500 && string_393_.length() <= 500)
			Class105.method1804(i, string, string_393_, (byte) -30);
	}

	static final void method10422(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_394_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		if (i_394_ == -1)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = IndexLoaders.aClass331_3535.method5918(i, 427496622).method15212((char) i_394_, (byte) 13);
	}

	static final void method10423(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class15.method542(class118, class98, class527, -1710419684);
	}

	static final void method10424(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = IndexLoaders.aClass429_4265.method7214(i, -1596011676).method14916(1686223979);
	}

	static final void method10425(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_395_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_396_ = (IndexLoaders.aClass429_4265.method7214(i, -1846944585).method14918(i_395_, -1347900528).anInt2997 * -1869685303);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_396_;
	}

	static final void method10426(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_397_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.aClass346_7009.anIntArray4046[i] = i_397_;
	}

	static final void method10427(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_398_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.aClass346_7009.anIntArray4046[i] = i_398_;
	}

	static final void method10428(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_399_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		int i_400_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class282_Sub50_Sub9 class282_sub50_sub9 = IndexLoaders.aClass429_4265.method7214(i, -1844917480);
		if ((class282_sub50_sub9.method14918(i_399_, -776097036).anInt2997 * -1869685303) != 0)
			throw new RuntimeException("");
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class282_sub50_sub9.method14901(i_399_, i_400_, 2057421022);
	}

	static final void method10429(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1900875655 * class527.aClass61_7010.anInt636;
	}

	static final void method10430(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 442725395 * class118.anInt1277;
	}

	static final void method10431(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_401_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		int i_402_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class282_Sub50_Sub9 class282_sub50_sub9 = IndexLoaders.aClass429_4265.method7214(i, -2119500524);
		if ((class282_sub50_sub9.method14918(i_401_, -1407040925).anInt2997 * -1869685303) != 0)
			throw new RuntimeException("");
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class282_sub50_sub9.method14901(i_401_, i_402_, 2008987048);
	}

	static final void method10432(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class76.method1360(string, bool, (byte) 1);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method10433(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class76.method1360(string, bool, (byte) 1);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method10434(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class76.method1360(string, bool, (byte) 1);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method10435(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class76.method1360(string, bool, (byte) 1);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method10436(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub21_8222), i, 501121364);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -79);
		Class190.method3148((byte) 44);
		client.aBool7175 = false;
	}

	static final void method10437(CS2Executor class527) {
		Class283.anInt3384 = 0;
	}

	static final void method10438(CS2Executor class527) {
		Class283.anInt3384 = 0;
	}

	static final void method10439(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 5);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1343 * -1823193031;
	}

	static final void method10440(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class158.method2730((short) -13358);
	}

	static final void method10441(CS2Executor class527) {
		String string = "";
		if (Class182.aClipboard2263 != null) {
			Transferable transferable = Class182.aClipboard2263.getContents(null);
			if (null != transferable) {
				try {
					string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
					if (string == null)
						string = "";
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10442(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(615912401);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 2019095438);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(2);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, 1817924736);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), 179638258);
		class184.method3049(class282_sub23, 2032504425);
	}

	static final void method10443(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(-1328689019);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 1013674565);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(2);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, 577886185);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), -1355106186);
		class184.method3049(class282_sub23, -973820734);
	}

	static final void method10444(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(-1284663536);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 1220504700);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(3);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-624100047 * class527.aClass346_7009.anInt4048, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, 1862889539);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index - i), -698799767);
		class184.method3049(class282_sub23, -88774465);
	}

	static final void method10445(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(-1120174444);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, -26536523);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(3);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-624100047 * class527.aClass346_7009.anInt4048, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, 1059472205);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index - i), 680923338);
		class184.method3049(class282_sub23, 700145594);
	}

	static final void method10446(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_403_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_403_, (byte) 0);
		if (class437.method7319(1827719166))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.MAP_REGION_DECODER.method4436(-2053810149).getObjectDefinitions(i, 65280).method7973(i_403_, class437.aString5335, (byte) 97);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.MAP_REGION_DECODER.method4436(-1567604906).getObjectDefinitions(i, 65280).method7963(i_403_, -1741480635 * class437.anInt5337, -1550000824));
	}

	static final void method10447(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(-1456121125);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 304490953);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(3);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-624100047 * class527.aClass346_7009.anInt4048, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, 725000911);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index - i), -1214335314);
		class184.method3049(class282_sub23, 414101353);
	}

	static final void method10448(CS2Executor class527) {
		if (Class96_Sub21.aClass199_9438.method3236(86, -1455473464))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	public static void method10449(Class397 class397, int i, int i_404_, Interface12 interface12) {
		CS2Executor class527 = Class125.method2167(1776771367);
		class527.anInterface12_7013 = interface12;
		Class107.method1834(class397, i, i_404_, class527, (byte) 87);
		class527.anInterface12_7013 = null;
	}

	static final void method10450(CS2Executor class527) {
		if (Class96_Sub21.aClass199_9438.method3236(82, -1453923163))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10451(CS2Executor class527) {
		if (Class96_Sub21.aClass199_9438.method3236(81, -1775303225))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10452(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class475.method7927(class118, class527, (byte) -68);
	}

	static final void method10453(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method12707(585342262) && Renderers.SOFTWARE_RENDERER.method8403()) ? 1 : 0;
	}

	static final void method10454(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub21_8222), i, -597608183);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -36);
		Class190.method3148((byte) 31);
		client.aBool7175 = false;
	}

	static final void method10455(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 101);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub41_Sub1.method14700(class118, class98, class527, -16236024);
	}

	static final void method10456(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_405_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_406_ = i_405_ >> 14 & 0x3fff;
		int i_407_ = i_405_ & 0x3fff;
		int i_408_ = Class468_Sub11.method12702(i, i_406_, i_407_, -2058824992);
		if (i_408_ < 0)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i_408_;
	}

	static final void method10457(CS2Executor class527) {
		Class282_Sub4.method12114((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -1132292531);
	}

	static final void method10458(CS2Executor class527) {
		Class282_Sub4.method12114((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 18698367);
	}

	static final void method10459(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 3);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		RsByteBuffer.method13292(class118, class98, class527, (byte) 60);
	}

	static final void method10460(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class6.method304(-1443843795);
	}

	static final void method10461(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_409_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 0 != (i & 1 << i_409_) ? 1 : 0;
	}

	static final void method10462(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5175(i >> 14 & 0x3fff, i & 0x3fff);
		if (null == class282_sub50_sub6)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub6.anInt9536 * 1864297169;
	}

	static final void method10463(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5175(i >> 14 & 0x3fff, i & 0x3fff);
		if (null == class282_sub50_sub6)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub6.anInt9536 * 1864297169;
	}

	static final void method10464(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5175(i >> 14 & 0x3fff, i & 0x3fff);
		if (null == class282_sub50_sub6)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub6.anInt9536 * 1864297169;
	}

	static final void method10465(CS2Executor class527) {
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (class282_sub50_sub6 == null || class282_sub50_sub6.aString9534 == null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class282_sub50_sub6.aString9534;
	}

	static final void method10466(CS2Executor class527) {
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (class282_sub50_sub6 == null || class282_sub50_sub6.aString9534 == null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class282_sub50_sub6.aString9534;
	}

	static final void method10467(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class488.anInt5760 * 1448596553;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1845665331 * Class351.anInt4097;
	}

	static final void method10468(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 124);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class28.method774(class118, class98, class527, -1296322680);
	}

	static final void method10469(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class488.anInt5760 * 1448596553;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1845665331 * Class351.anInt4097;
	}

	static final void method10470(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class100.method1642(class118, class98, class527, 1075564580);
	}

	static final void method10471(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(i);
		if (class282_sub50_sub6 == null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (235539227 * class282_sub50_sub6.anInt9540 - -742910705 * class282_sub50_sub6.anInt9539);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (1097246003 * class282_sub50_sub6.anInt9535 - class282_sub50_sub6.anInt9541 * 458255425);
		}
	}

	static final void method10472(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[1942118537 * class527.anInt7012 + 1]) != (class527.intStack[1942118537 * class527.anInt7012]))
			class527.instrPtr += ((class527.unknown[class527.instrPtr * 301123709]) * -1051529003);
	}

	static final void method10473(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.aString7426 != null && i < -1772444859 * Class459.anInt5534)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = Class467.aClass173Array5575[i].aByte2126;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10474(CS2Executor class527) {
		Class282_Sub36 class282_sub36 = Class540.method11595(2065294251);
		if (class282_sub36 == null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1798678621 * class282_sub36.anInt7991;
			int i = (-1967986419 * class282_sub36.anInt7988 << 28 | (Class291.anInt3472 + class282_sub36.anInt7987 * -1306535747) << 14 | (Class291.anInt3473 + class282_sub36.anInt7993 * 1012301095));
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i;
		}
	}

	static final void method10475(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_410_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		if (Class468_Sub8.aClass98Array7889[i] == null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else {
			String string = (Class468_Sub8.aClass98Array7889[i].aClass118Array998[i_410_].aString1285);
			if (null == string)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = string;
		}
	}

	static final void method10476(CS2Executor class527) {
		Class282_Sub36 class282_sub36 = Class540.method11595(389441679);
		if (class282_sub36 == null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1798678621 * class282_sub36.anInt7991;
			int i = (-1967986419 * class282_sub36.anInt7988 << 28 | (Class291.anInt3472 + class282_sub36.anInt7987 * -1306535747) << 14 | (Class291.anInt3473 + class282_sub36.anInt7993 * 1012301095));
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i;
		}
	}

	static final void method10477(CS2Executor class527) {
		Class282_Sub36 class282_sub36 = Class540.method11595(-1866963534);
		if (class282_sub36 == null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1798678621 * class282_sub36.anInt7991;
			int i = (-1967986419 * class282_sub36.anInt7988 << 28 | (Class291.anInt3472 + class282_sub36.anInt7987 * -1306535747) << 14 | (Class291.anInt3473 + class282_sub36.anInt7993 * 1012301095));
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i;
		}
	}

	static final void method10478(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass61_7010.method1197((String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]), 1702257385));
	}

	static final void method10479(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1925518385);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14778(i >> 28 & 0x3, i >> 14 & 0x3fff, i & 0x3fff, anIntArray5900, -1213582647);
			if (bool)
				Class8_Sub2.method14263(anIntArray5900[1], anIntArray5900[2], (byte) 0);
		}
	}

	static final void method10480(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1628981858);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14778(i >> 28 & 0x3, i >> 14 & 0x3fff, i & 0x3fff, anIntArray5900, -1907080953);
			if (bool)
				Class8_Sub2.method14263(anIntArray5900[1], anIntArray5900[2], (byte) 0);
		}
	}

	static final void method10481(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1258422954);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14778(i >> 28 & 0x3, i >> 14 & 0x3fff, i & 0x3fff, anIntArray5900, -1989123172);
			if (bool)
				Class8_Sub2.method14263(anIntArray5900[1], anIntArray5900[2], (byte) 0);
		}
	}

	static final void method10482(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_411_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class477 class477 = Class291.method5127(i >> 14 & 0x3fff, i & 0x3fff);
		boolean bool = false;
		for (Class282_Sub50_Sub6 class282_sub50_sub6 = (Class282_Sub50_Sub6) class477.method7941((byte) 4); class282_sub50_sub6 != null; class282_sub50_sub6 = (Class282_Sub50_Sub6) class477.method7955(-401768799)) {
			if (i_411_ == 1864297169 * class282_sub50_sub6.anInt9536) {
				bool = true;
				break;
			}
		}
		if (bool)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10483(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_412_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class515.method8862(i, i_412_ >> 14 & 0x3fff, i_412_ & 0x3fff, true, -1732540658);
	}

	static final void method10484(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(i);
		if (class282_sub50_sub6 == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub6.anInt9542 * -1337359695;
	}

	static final void method10485(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(i);
		if (class282_sub50_sub6 == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub6.anInt9542 * -1337359695;
	}

	static final void method10486(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 100 == -8084891 * Class291_Sub1.anInt8015 ? 1 : 0;
	}

	static final void method10487(CS2Executor class527) {
		if (client.aBool7310)
			Class361.aClass361_4177.method6257(99106487);
	}

	static void method10488(CS2Executor class527) {
		int i = (class527.intStack[1942118537 * class527.anInt7012 - 3]);
		int i_413_ = (class527.intStack[class527.anInt7012 * 1942118537 - 2]);
		int i_414_ = (class527.intStack[1942118537 * class527.anInt7012 - 1]);
		class527.anInt7012 -= 425673003;
		if (i > class527.globalArrayLengths[i_413_])
			throw new RuntimeException();
		if (i > class527.globalArrayLengths[i_414_])
			throw new RuntimeException();
		if (i_413_ == i_414_)
			throw new RuntimeException();
		Class225_Sub5.method13047((class527.globalArrays[i_413_]), (class527.globalArrays[i_414_]), 0, i - 1, (byte) 106);
	}

	static final void method10489(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class8_Sub2.method14263(i >> 14 & 0x3fff, i & 0x3fff, (byte) 0);
	}

	static final void method10490(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_415_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class414 class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, i_415_, 0, 1499077347);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class414.method6951(string, i, Class182.aClass160Array2261, (byte) 112);
	}

	static final void method10491(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class8_Sub2.method14263(i >> 14 & 0x3fff, i & 0x3fff, (byte) 0);
	}

	static final void method10492(CS2Executor class527) {
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1472665576);
		if (null != class282_sub50_sub6) {
			boolean bool = (class282_sub50_sub6.method14775(Class291.anInt3472 + Class427.anInt5123 * -861975801, Class291.anInt3473 + Class475.anInt5624 * 483850921, anIntArray5900, 93229911));
			if (bool) {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[1];
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[2];
			} else {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}

	static final void method10493(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1795990544).members ? 1 : 0);
	}

	static final void method10494(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_416_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		if (null != Class84.myPlayer.playerAppearance && (Class84.myPlayer.playerAppearance.aBool2929))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string_416_;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string;
	}

	static final void method10495(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1779512245);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14778(i >> 28 & 0x3, i >> 14 & 0x3fff, i & 0x3fff, anIntArray5900, -1915601197);
			if (bool) {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[1];
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[2];
			} else {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}

	static final void method10496(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(2077871047);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14778(i >> 28 & 0x3, i >> 14 & 0x3fff, i & 0x3fff, anIntArray5900, -1964892752);
			if (bool) {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[1];
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[2];
			} else {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}

	static final void method10497(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(2002546657);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14775(i >> 14 & 0x3fff, i & 0x3fff, anIntArray5900, -1337088655);
			if (bool) {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[1];
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[2];
			} else {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}

	static final void method10498(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		if ((class527.intStack[1942118537 * class527.anInt7012 + 1]) != (class527.intStack[1942118537 * class527.anInt7012]))
			class527.instrPtr += ((class527.unknown[class527.instrPtr * 301123709]) * -1051529003);
	}

	static final void method10499(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 25);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		NamedFileReference.method869(class118, class98, class527, -1701378690);
	}

	static final void method10500(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 706569284) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1292 = Class351.method6193(string, class527, 778279637);
		class118.aBool1384 = true;
	}

	static final void method10501(CS2Executor class527) {
		class527.aLongArray6996[(class527.unknown[301123709 * class527.instrPtr])] = (class527.aLongArray7003[((class527.anInt7001 -= -1188480575) * 1820448321)]);
	}

	static final void method10502(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Class182.method3044(string, -1519993030);
	}

	static final void method10503(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_417_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i & -1 - (1 << i_417_);
	}

	static final void method10504(CS2Executor class527) {
		Class291_Sub1.aBool8027 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
	}

	static final void method10505(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Math.random() * (double) i);
	}

	static final void method10506(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class291_Sub1.aBool8027 ? 1 : 0;
	}

	static final void method10507(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		SharedConfigsType.method2094(i, (byte) 1);
	}

	static final void method10508(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		SharedConfigsType.method2094(i, (byte) 1);
	}

	static final void method10509(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12622(250363178) ? 1 : 0;
	}

	static final void method10510(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		boolean bool = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) == 1);
		if (Class291_Sub1.aClass465_8029 != null) {
			Node class282 = Class291_Sub1.aClass465_8029.method7754((long) i);
			if (null != class282 && !bool)
				class282.unlink(-371378792);
			else if (null == class282 && bool) {
				class282 = new Node();
				Class291_Sub1.aClass465_8029.method7765(class282, (long) i);
			}
		}
	}

	static final void method10511(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (Class291_Sub1.aClass465_8029 != null) {
			Node class282 = Class291_Sub1.aClass465_8029.method7754((long) i);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282 != null ? 1 : 0;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10512(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (Class291_Sub1.aClass465_8029 != null) {
			Node class282 = Class291_Sub1.aClass465_8029.method7754((long) i);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282 != null ? 1 : 0;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10513(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		boolean bool = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) == 1);
		if (null != Class291_Sub1.aClass465_8025) {
			Node class282 = Class291_Sub1.aClass465_8025.method7754((long) i);
			if (class282 != null && !bool)
				class282.unlink(-371378792);
			else if (class282 == null && bool) {
				class282 = new Node();
				Class291_Sub1.aClass465_8025.method7765(class282, (long) i);
			}
		}
	}

	static final void method10514(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		boolean bool = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) == 1);
		if (null != Class291_Sub1.aClass465_8025) {
			Node class282 = Class291_Sub1.aClass465_8025.method7754((long) i);
			if (class282 != null && !bool)
				class282.unlink(-371378792);
			else if (class282 == null && bool) {
				class282 = new Node();
				Class291_Sub1.aClass465_8025.method7765(class282, (long) i);
			}
		}
	}

	static final void method10515(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != Class291_Sub1.aClass465_8025) {
			Node class282 = Class291_Sub1.aClass465_8025.method7754((long) i);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282 != null ? 1 : 0;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10516(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != Class291_Sub1.aClass465_8025) {
			Node class282 = Class291_Sub1.aClass465_8025.method7754((long) i);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282 != null ? 1 : 0;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10517(Class118 class118, CS2Executor class527) {
		if (client.method11633(class118).method12182(-391297441) && client.aClass118_7352 == null) {
			Class158_Sub2.method14355(class118.anInt1287 * -1952846363, 1924549737 * class118.anInt1288, 587716666);
			client.aClass118_7352 = Index.method5694(-1952846363 * class118.anInt1287, 1924549737 * class118.anInt1288, -1475065836);
			Class109.method1858(client.aClass118_7352, (byte) 32);
		}
	}

	static final void method10518(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null != Class291_Sub1.aClass465_8025) {
			Node class282 = Class291_Sub1.aClass465_8025.method7754((long) i);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282 != null ? 1 : 0;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10519(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class291.aClass282_Sub50_Sub6_3491 != null ? Class291.aClass282_Sub50_Sub6_3491.anInt9536 * 1864297169 : -1);
	}

	static final void method10520(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub7_8210, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -54294014);
		Class190.method3148((byte) 61);
		client.aBool7185 = true;
	}

	static final void method10521(CS2Executor class527) {
		ItemDefaultsLoader.method7081((byte) 16);
	}

	static final void method10522(CS2Executor class527) {
		Class521_Sub1_Sub4_Sub2.method16088((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 1);
	}

	static final void method10523(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_418_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (Class475.aBool5623) {
			Class440.method7373(3, i, i_418_, false, (byte) 5);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = null != Class263.aFrame3260 ? 1 : 0;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10524(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_419_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (Class475.aBool5623) {
			Class440.method7373(3, i, i_419_, false, (byte) 78);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = null != Class263.aFrame3260 ? 1 : 0;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10525(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4566, client.aClass184_7475.aClass432_2283, 1747735123);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i, 1417031095);
		client.aClass184_7475.method3049(class282_sub23, -1019165648);
	}

	static final void method10526(CS2Executor class527) {
		if (Class475.aBool5623 && Class263.aFrame3260 != null)
			Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-2004463854), -1, -1, false, (byte) 42);
	}

	static final void method10527(CS2Executor class527) {
		if (Class475.aBool5623) {
			Class467[] class467s = Class405.method6825((byte) -84);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class467s.length;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10528(CS2Executor class527) {
		if (Class475.aBool5623) {
			Class467[] class467s = Class405.method6825((byte) -89);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class467s.length;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10529(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloat7365 >> 3;
	}

	static final void method10530(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (Class475.aBool5623) {
			Class467[] class467s = Class405.method6825((byte) -33);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class467s[i].anInt5571 * -1928226539;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class467s[i].anInt5574 * -1980032233;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		}
	}

	static final void method10531(CS2Executor class527) {
		int i = -2123019059 * Class363.anInt4203;
		int i_420_ = 977902937 * Class263.anInt3249;
		int i_421_ = -1;
		if (Class475.aBool5623) {
			Class467[] class467s = Class405.method6825((byte) -11);
			for (int i_422_ = 0; i_422_ < class467s.length; i_422_++) {
				Class467 class467 = class467s[i_422_];
				if (i == -1928226539 * class467.anInt5571 && class467.anInt5574 * -1980032233 == i_420_) {
					i_421_ = i_422_;
					break;
				}
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_421_;
	}

	static final void method10532(CS2Executor class527) {
		int i = -2123019059 * Class363.anInt4203;
		int i_423_ = 977902937 * Class263.anInt3249;
		int i_424_ = -1;
		if (Class475.aBool5623) {
			Class467[] class467s = Class405.method6825((byte) 97);
			for (int i_425_ = 0; i_425_ < class467s.length; i_425_++) {
				Class467 class467 = class467s[i_425_];
				if (i == -1928226539 * class467.anInt5571 && class467.anInt5574 * -1980032233 == i_423_) {
					i_424_ = i_425_;
					break;
				}
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_424_;
	}

	static final void method10533(CS2Executor class527) {
		int i = -2123019059 * Class363.anInt4203;
		int i_426_ = 977902937 * Class263.anInt3249;
		int i_427_ = -1;
		if (Class475.aBool5623) {
			Class467[] class467s = Class405.method6825((byte) -24);
			for (int i_428_ = 0; i_428_ < class467s.length; i_428_++) {
				Class467 class467 = class467s[i_428_];
				if (i == -1928226539 * class467.anInt5571 && class467.anInt5574 * -1980032233 == i_426_) {
					i_427_ = i_428_;
					break;
				}
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_427_;
	}

	static final void method10534(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aString1348 = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
	}

	static final void method10535(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class158.method2730((short) -22563);
	}

	static final void method10536(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class158.method2730((short) -4216);
	}

	static final void method10537(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class158.method2730((short) -13441);
	}

	static final void method10538(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1329 = 1179500154;
		class118.aClass417_1308 = null;
		class118.anInt1330 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -636815827);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.anInt1287 * -1952846363, 375759312);
	}

	static final void method10539(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i >= 1 && i <= 2)
			Class440.method7373(i, -1, -1, false, (byte) 109);
	}

	static final void method10540(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i >= 1 && i <= 2)
			Class440.method7373(i, -1, -1, false, (byte) 8);
	}

	static final void method10541(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i >= 1 && i <= 2)
			Class440.method7373(i, -1, -1, false, (byte) 93);
	}

	static final void method10542(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(56380816);
	}

	static final void method10543(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-862689229);
	}

	static final void method10544(CS2Executor class527) {
		class527.anInt7001 -= 1918006146;
		if ((class527.aLongArray7003[1820448321 * class527.anInt7001]) < (class527.aLongArray7003[1820448321 * class527.anInt7001 + 1]))
			class527.instrPtr += ((class527.unknown[301123709 * class527.instrPtr]) * -1051529003);
	}

	static final void method10545(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i >= 1 && i <= 2) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub9_8226), i, -1511474493);
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub9_8218), i, -1261378840);
			Class190.method3148((byte) 94);
		}
	}

	static final void method10546(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_429_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class515.method8862(i, i_429_ >> 14 & 0x3fff, i_429_ & 0x3fff, false, -1732540658);
	}

	static final void method10547(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 318997953 * Class504.anInt5832;
	}

	static final void method10548(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		Class533.method11404((String) (class527.objectStack[(1806726141 * class527.anInt7000)]), (String) (class527.objectStack[1 + (class527.anInt7000 * 1806726141)]), "", (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]) == 1, false, -94301647);
	}

	static final void method10549(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_430_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i + i_430_;
	}

	static final void method10550(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class455.aShortArray5452[(class527.intStack[(class527.anInt7012 * 1942118537)])] = (short) Class5.method294((class527.intStack[(1 + 1942118537 * (class527.anInt7012))]), (byte) -81);
		IndexLoaders.ITEM_INDEX_LOADER.method7152(-1540745754);
		IndexLoaders.ITEM_INDEX_LOADER.method7151((byte) 89);
		IndexLoaders.NPC_INDEX_LOADER.method6831(-1083280039);
		IncomingPacket.method6378(-1538407760);
	}

	static final void method10551(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class455.aShortArray5452[(class527.intStack[(class527.anInt7012 * 1942118537)])] = (short) Class5.method294((class527.intStack[(1 + 1942118537 * (class527.anInt7012))]), (byte) 19);
		IndexLoaders.ITEM_INDEX_LOADER.method7152(-1435550834);
		IndexLoaders.ITEM_INDEX_LOADER.method7151((byte) 7);
		IndexLoaders.NPC_INDEX_LOADER.method6831(-1083280039);
		IncomingPacket.method6378(-1538407760);
	}

	static final void method10552(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class455.aShortArray5452[(class527.intStack[(class527.anInt7012 * 1942118537)])] = (short) Class5.method294((class527.intStack[(1 + 1942118537 * (class527.anInt7012))]), (byte) -16);
		IndexLoaders.ITEM_INDEX_LOADER.method7152(-1253488716);
		IndexLoaders.ITEM_INDEX_LOADER.method7151((byte) 50);
		IndexLoaders.NPC_INDEX_LOADER.method6831(-1083280039);
		IncomingPacket.method6378(-1538407760);
	}

	static final void method10553(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -672443707 * Class262.anInt3240 == 2 ? 1 : 0;
	}

	static final void method10554(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class455.aShortArray5452[(class527.intStack[(class527.anInt7012 * 1942118537)])] = (short) Class5.method294((class527.intStack[(1 + 1942118537 * (class527.anInt7012))]), (byte) -40);
		IndexLoaders.ITEM_INDEX_LOADER.method7152(-1643312928);
		IndexLoaders.ITEM_INDEX_LOADER.method7151((byte) -36);
		IndexLoaders.NPC_INDEX_LOADER.method6831(-1083280039);
		IncomingPacket.method6378(-1538407760);
	}

	static final void method10555(Class118 class118, Class98 class98, boolean bool, int i, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i_431_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_432_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999) {
			Class411.method6914(class118.anInt1287 * -1952846363, (short) 887);
			Class106.method1818(class118.anInt1287 * -1952846363, 169369057);
			Item.method12575(-1952846363 * class118.anInt1287, (byte) 21);
		}
		if (-1 == i_431_) {
			class118.anInt1329 = 589750077;
			class118.anInt1330 = 636815827;
			class118.anInt1426 = 833742903;
		} else {
			class118.anInt1426 = i_431_ * -833742903;
			class118.anInt1427 = i_432_ * 1010829041;
			class118.aBool1388 = bool;
			ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_431_, 1353913451);
			class118.anInt1385 = -790145187 * class425.anInt5058;
			class118.anInt1336 = 427762477 * class425.anInt5045;
			class118.anInt1337 = -174540793 * class425.anInt5074;
			class118.anInt1293 = class425.anInt5063 * -1057479355;
			class118.anInt1334 = class425.anInt5044 * -1474252971;
			class118.anInt1343 = class425.modelZoom * 394720705;
			class118.anInt1335 = i * 582441359;
			if (class118.anInt1417 * -1326245411 > 0)
				class118.anInt1343 = (class118.anInt1343 * 1787365152 / (-1326245411 * class118.anInt1417) * -807852535);
			else if (class118.anInt1297 * 1352091441 > 0)
				class118.anInt1343 = -807852535 * (class118.anInt1343 * 1787365152 / (1352091441 * class118.anInt1297));
		}
	}

	static final void method10556(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_433_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (i >= 0 && i < 2)
			client.anIntArrayArrayArray7302[i] = new int[i_433_ << 1][4];
	}

	static final void method10557(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_434_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (i >= 0 && i < 2)
			client.anIntArrayArrayArray7302[i] = new int[i_434_ << 1][4];
	}

	static final void method10558(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.anInt7434 * 1609086245 == 2 && i < 493536965 * client.anInt7449)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = client.aClass6Array7452[i].aString40;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method10559(CS2Executor class527) {
		class527.anInt7012 -= 993237007;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_435_ = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) << 1);
		int i_436_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		int i_437_ = (class527.intStack[1942118537 * class527.anInt7012 + 3]);
		int i_438_ = (class527.intStack[4 + class527.anInt7012 * 1942118537]);
		int i_439_ = (class527.intStack[class527.anInt7012 * 1942118537 + 5]);
		int i_440_ = (class527.intStack[6 + 1942118537 * class527.anInt7012]);
		if (i >= 0 && i < 2 && client.anIntArrayArrayArray7302[i] != null && i_435_ >= 0 && i_435_ < client.anIntArrayArrayArray7302[i].length) {
			client.anIntArrayArrayArray7302[i][i_435_] = new int[] { (i_436_ >> 14 & 0x3fff) << 9, i_437_ << 2, (i_436_ & 0x3fff) << 9, i_440_ };
			client.anIntArrayArrayArray7302[i][i_435_ + 1] = new int[] { (i_438_ >> 14 & 0x3fff) << 9, i_439_ << 2, (i_438_ & 0x3fff) << 9 };
		}
	}

	static final void method10560(CS2Executor class527) {
		class527.anInt7012 -= 993237007;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_441_ = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) << 1);
		int i_442_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		int i_443_ = (class527.intStack[1942118537 * class527.anInt7012 + 3]);
		int i_444_ = (class527.intStack[4 + class527.anInt7012 * 1942118537]);
		int i_445_ = (class527.intStack[class527.anInt7012 * 1942118537 + 5]);
		int i_446_ = (class527.intStack[6 + 1942118537 * class527.anInt7012]);
		if (i >= 0 && i < 2 && client.anIntArrayArrayArray7302[i] != null && i_441_ >= 0 && i_441_ < client.anIntArrayArrayArray7302[i].length) {
			client.anIntArrayArrayArray7302[i][i_441_] = new int[] { (i_442_ >> 14 & 0x3fff) << 9, i_443_ << 2, (i_442_ & 0x3fff) << 9, i_446_ };
			client.anIntArrayArrayArray7302[i][i_441_ + 1] = new int[] { (i_444_ >> 14 & 0x3fff) << 9, i_445_ << 2, (i_444_ & 0x3fff) << 9 };
		}
	}

	static final void method10561(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_447_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class521_Sub1_Sub1_Sub6.method16125(i, i_447_, false, 1096204132);
	}

	static final void method10562(CS2Executor class527) {
		int i = ((client.anIntArrayArrayArray7302[(class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)])]).length >> 1);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
	}

	static final void method10563(CS2Executor class527) {
		int i = ((client.anIntArrayArrayArray7302[(class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)])]).length >> 1);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
	}

	static final void method10564(CS2Executor class527) {
		int i = ((client.anIntArrayArrayArray7302[(class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)])]).length >> 1);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
	}

	static final void method10565(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aBool1327 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 42);
	}

	static final void method10566(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub17.method14653(class118, class98, class527, -1632283417);
	}

	static final void method10567(CS2Executor class527) {
		String string = null;
		if (Class119.aClass12_1461 != null)
			string = Class119.aClass12_1461.method473(-991056040);
		if (string == null)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10568(CS2Executor class527) {
		String string = null;
		if (Class119.aClass12_1461 != null)
			string = Class119.aClass12_1461.method473(1108398251);
		if (string == null)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10569(CS2Executor class527) {
		AnimationDefinitions.method11148((class527.aClass521_Sub1_Sub2_Sub1_7014), (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), 906367308);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method10570(Class118 class118, Class98 class98, CS2Executor class527) {
		if (4 == -2131393857 * class118.anInt1268)
			Class306.method5459(class118, class98, class527, -1348219539);
	}

	static final void method10571(CS2Executor class527) {
		class527.anInt7012 -= 1702692012;
		Class316.method5594(-559600711);
		Class96.method1607((byte) 41);
		Class282_Sub20_Sub9.anInt9792 = (class527.intStack[class527.anInt7012 * 1942118537]) * -2112332643;
		Class301.anInt3556 = -40093315 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class20.anInt188 = 50073545 * (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class182.anInt2262 = (2139103415 * (class527.intStack[3 + 1942118537 * class527.anInt7012]));
		Class450.anInt5438 = (1254300539 * (class527.intStack[class527.anInt7012 * 1942118537 + 4]));
		Class373.anInt4350 = ((class527.intStack[class527.anInt7012 * 1942118537 + 5]) * -923361129);
		Class254.anInt3145 = (1497808011 * (class527.intStack[6 + class527.anInt7012 * 1942118537]));
		Class446.anInt5396 = (-1722209539 * (class527.intStack[class527.anInt7012 * 1942118537 + 7]));
		Class17.anInt148 = (class527.intStack[class527.anInt7012 * 1942118537 + 8]) * 254147049;
		Class388.anInt4722 = (-581610323 * (class527.intStack[1942118537 * class527.anInt7012 + 9]));
		Class99.anInt1005 = ((class527.intStack[10 + class527.anInt7012 * 1942118537]) * 286693969);
		Class242.anInt2982 = (-918117939 * (class527.intStack[class527.anInt7012 * 1942118537 + 11]));
		IndexLoaders.SPRITES_INDEX.method5661(947424179 * Class450.anInt5438, -371371531);
		IndexLoaders.SPRITES_INDEX.method5661(-1626939609 * Class373.anInt4350, -283087110);
		IndexLoaders.SPRITES_INDEX.method5661(464964387 * Class254.anInt3145, 678047221);
		IndexLoaders.SPRITES_INDEX.method5661(Class446.anInt5396 * -781860267, -1973409174);
		IndexLoaders.SPRITES_INDEX.method5661(Class17.anInt148 * -1965396391, -2142693165);
		IndexLoaders.SPRITES_INDEX.method5661(Class242.anInt2982 * -1242615035, 1085701989);
		IndexLoaders.FONT_METRICS_INDEX.method5661(-1242615035 * Class242.anInt2982, 1837716821);
		Class354.aClass160_4110 = null;
		Class149_Sub2.aClass160_9315 = null;
		Class125.aClass160_1571 = null;
		Class60.aClass160_612 = null;
		Class61.aClass160_647 = null;
		Class467.aClass160_5576 = null;
		Class290.aClass160_3452 = null;
		AttributeDefault.aClass160_5339 = null;
		Class20.aBool187 = true;
	}

	static final void method10572(CS2Executor class527) {
		class527.anInt7012 -= 1702692012;
		Class316.method5594(-559600711);
		Class96.method1607((byte) 77);
		Class282_Sub20_Sub9.anInt9792 = (class527.intStack[class527.anInt7012 * 1942118537]) * -2112332643;
		Class301.anInt3556 = -40093315 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class20.anInt188 = 50073545 * (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class182.anInt2262 = (2139103415 * (class527.intStack[3 + 1942118537 * class527.anInt7012]));
		Class450.anInt5438 = (1254300539 * (class527.intStack[class527.anInt7012 * 1942118537 + 4]));
		Class373.anInt4350 = ((class527.intStack[class527.anInt7012 * 1942118537 + 5]) * -923361129);
		Class254.anInt3145 = (1497808011 * (class527.intStack[6 + class527.anInt7012 * 1942118537]));
		Class446.anInt5396 = (-1722209539 * (class527.intStack[class527.anInt7012 * 1942118537 + 7]));
		Class17.anInt148 = (class527.intStack[class527.anInt7012 * 1942118537 + 8]) * 254147049;
		Class388.anInt4722 = (-581610323 * (class527.intStack[1942118537 * class527.anInt7012 + 9]));
		Class99.anInt1005 = ((class527.intStack[10 + class527.anInt7012 * 1942118537]) * 286693969);
		Class242.anInt2982 = (-918117939 * (class527.intStack[class527.anInt7012 * 1942118537 + 11]));
		IndexLoaders.SPRITES_INDEX.method5661(947424179 * Class450.anInt5438, 616542110);
		IndexLoaders.SPRITES_INDEX.method5661(-1626939609 * Class373.anInt4350, 1438697357);
		IndexLoaders.SPRITES_INDEX.method5661(464964387 * Class254.anInt3145, 1367135253);
		IndexLoaders.SPRITES_INDEX.method5661(Class446.anInt5396 * -781860267, -517299172);
		IndexLoaders.SPRITES_INDEX.method5661(Class17.anInt148 * -1965396391, -1463622430);
		IndexLoaders.SPRITES_INDEX.method5661(Class242.anInt2982 * -1242615035, -1702902643);
		IndexLoaders.FONT_METRICS_INDEX.method5661(-1242615035 * Class242.anInt2982, -1270845934);
		Class354.aClass160_4110 = null;
		Class149_Sub2.aClass160_9315 = null;
		Class125.aClass160_1571 = null;
		Class60.aClass160_612 = null;
		Class61.aClass160_647 = null;
		Class467.aClass160_5576 = null;
		Class290.aClass160_3452 = null;
		AttributeDefault.aClass160_5339 = null;
		Class20.aBool187 = true;
	}

	static final void method10573(CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Class202.method3342((long) i, 0, bool, Class223.CURRENT_LANGUAGE, (byte) -65);
	}

	static final void method10574(CS2Executor class527) {
		Class76.method1361((byte) 106);
		Class20.aBool187 = false;
	}

	static final void method10575(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 29);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class282_Sub41_Sub1.method14700(class118, class98, class527, 1217652996);
	}

	static final void method10576(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		client.anInt7340 = 96844955 * (class527.intStack[class527.anInt7012 * 1942118537]);
		client.anInt7342 = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) * 1244871605);
	}

	static final void method10577(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
	}

	static final void method10578(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class393.aClass282_Sub54_4783.aClass468_Sub4_8187.method12646(977541683) && Renderers.SOFTWARE_RENDERER.method8405()) ? 1 : 0;
	}

	static final void method10579(CS2Executor class527) {
		if (!JS5CacheFile.method3360((byte) 82))
			JS5StandardRequester.method5558(-500941691);
	}

	static final void method10580(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_448_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class247.method4248(i, i_448_, (short) 660) ? 1 : 0;
	}

	static final void method10581(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_449_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class247.method4248(i, i_449_, (short) 660) ? 1 : 0;
	}

	static final void method10582(CS2Executor class527) {
		Class251.handleCommand((String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), false, false, -354697449);
	}

	static final void method10583(CS2Executor class527) {
		Class251.handleCommand((String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), false, false, -354697449);
	}

	static final void method10584(CS2Executor class527) {
		Class251.handleCommand((String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), false, false, -354697449);
	}

	static final void method10585(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 56);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class204.method3365(class118, class98, class527, 106231472);
	}

	static final void method10586(CS2Executor class527) {
		Class361.aClass361_4171.method6257(-877666336);
	}

	static final void method10587(CS2Executor class527) {
		Class361.aClass361_4171.method6257(1693018543);
	}

	static final void method10588(CS2Executor class527) {
		Class361.aClass361_4182.method6257(1248427339);
	}

	static final void method10589(CS2Executor class527) {
		Class361.aClass361_4182.method6257(-2074268814);
	}

	static final void method10590(CS2Executor class527) {
		Class361.aClass361_4182.method6257(-1390840651);
	}

	static final void method10591(CS2Executor class527) {
		if (Class282_Sub13.aClass61_7587 != null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
			class527.aClass61_7010 = Class282_Sub13.aClass61_7587;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10592(CS2Executor class527) {
		String string = "";
		if (Class182.aClipboard2263 != null) {
			Transferable transferable = Class182.aClipboard2263.getContents(null);
			if (null != transferable) {
				try {
					string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
					if (string == null)
						string = "";
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10593(CS2Executor class527) {
		String string = "";
		if (Class182.aClipboard2263 != null) {
			Transferable transferable = Class182.aClipboard2263.getContents(null);
			if (null != transferable) {
				try {
					string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
					if (string == null)
						string = "";
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10594(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 17);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class504.method8390(class118, class98, class527, 1964593641);
	}

	static final void method10595(CS2Executor class527) {
		class527.anInt7000 -= 134906879;
		Class533.method11404((String) (class527.objectStack[class527.anInt7000 * 1806726141]), (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]), (String) (class527.objectStack[2 + 1806726141 * class527.anInt7000]), ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1), true, -94301647);
	}

	static final void method10596(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7310 ? 1 : 0;
	}

	static final void method10597(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class169.method2875(client.anInt7166 * -1741204137, -2092817806) ? 1 : 0);
	}

	static final void method10598(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Class282_Sub50_Sub17.method15508(-339507407).toString();
	}

	static final void method10599(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Node.method5001(class118, class527, -802563784);
	}

	static final void method10600(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass521_Sub1_Sub2_Sub1_7014.method12997(-218366287);
	}

	static final void method10601(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_450_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_451_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		int i_452_ = (class527.intStack[class527.anInt7012 * 1942118537 + 3]);
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(842188517);
		Class225.method3794(((i >> 14 & 0x3fff) - class219.anInt2711 * 1948093437), (i & 0x3fff) - -1002240017 * class219.anInt2712, i_450_ << 2, i_451_, i_452_, false, (byte) -1);
	}

	static final void method10602(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1323 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -848451677);
		Class109.method1858(class118, (byte) -64);
	}

	static final void method10603(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_453_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		int i_454_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		int i_455_ = (class527.intStack[3 + class527.anInt7012 * 1942118537]);
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(347800908);
		Class11.method469((i >> 14 & 0x3fff) - 1948093437 * class219.anInt2711, (i & 0x3fff) - class219.anInt2712 * -1002240017, i_453_ << 2, i_454_, i_455_, (byte) 53);
	}

	static final void method10604(CS2Executor class527) {
		Class10.method458((class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), 1942118537);
	}

	static final void method10605(CS2Executor class527) {
		Class514.method8841(-675844950);
	}

	static final void method10606(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class12.method486((class527.intStack[class527.anInt7012 * 1942118537]), (class527.intStack[1 + class527.anInt7012 * 1942118537]), 0, 596260679);
	}

	static final void method10607(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class12.method486((class527.intStack[class527.anInt7012 * 1942118537]), (class527.intStack[1 + class527.anInt7012 * 1942118537]), 0, 596260679);
	}

	static final void method10608(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class12.method486((class527.intStack[class527.anInt7012 * 1942118537]), (class527.intStack[1 + class527.anInt7012 * 1942118537]), 0, 596260679);
	}

	static final void method10609(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class12.method486((class527.intStack[class527.anInt7012 * 1942118537]), (class527.intStack[1 + class527.anInt7012 * 1942118537]), 0, 596260679);
	}

	static final void method10610(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloat7146 >> 3;
	}

	static final void method10611(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloat7146 >> 3;
	}

	static final void method10612(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloat7146 >> 3;
	}

	static final void method10613(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloat7146 >> 3;
	}

	static final void method10614(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloat7365 >> 3;
	}

	static final void method10615(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		DefaultsFile.method11221(class118, class98, class527, -2007218506);
	}

	static final void method10616(CS2Executor class527) {
		if (client.aBool7310)
			Class361.aClass361_4177.method6257(1411818516);
	}

	static final void method10617(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloat7365 >> 3;
	}

	static final void method10618(CS2Executor class527) {
		Class242.method4166(1491844603);
	}

	static final void method10619(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		Class42.method890((class527.intStack[1942118537 * class527.anInt7012]), (class527.intStack[1 + class527.anInt7012 * 1942118537]), (class527.intStack[class527.anInt7012 * 1942118537 + 2]), (byte) -21);
	}

	static final void method10620(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_456_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i % i_456_;
	}

	static final void method10621(CS2Executor class527) {
		NodeCollection.method8146(-2025977576);
	}

	static final void method10622(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 40);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		DefaultsFile.method11223(class118, class98, class527, -970615019);
	}

	static final void method10623(CS2Executor class527) {
		NodeCollection.method8146(-2059524451);
	}

	static final void method10624(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i < 0)
			i = 0;
		client.anInt7271 = 1364289201 * (-240868135 * client.anInt7270 + i);
	}

	static final void method10625(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		class118.anInt1376 = -280394239 * (class527.intStack[1942118537 * class527.anInt7012]);
		class118.anInt1314 = (1004789833 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]));
		Class109.method1858(class118, (byte) 4);
		if (0 == -2131393857 * class118.anInt1268)
			Class12.method483(class98, class118, false, -1585433981);
	}

	static final void method10626(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7271 * -871685551 - client.anInt7270 * -240868135;
	}

	static final void method10627(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7271 * -871685551 - client.anInt7270 * -240868135;
	}

	static final void method10628(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_457_ = i >> 14 & 0x3fff;
		int i_458_ = i & 0x3fff;
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(424457687);
		i_457_ -= class219.anInt2711 * 1948093437;
		if (i_457_ < 0)
			i_457_ = 0;
		else if (i_457_ >= IndexLoaders.MAP_REGION_DECODER.method4424(-1911877219))
			i_457_ = IndexLoaders.MAP_REGION_DECODER.method4424(-1399469904);
		i_458_ -= class219.anInt2712 * -1002240017;
		if (i_458_ < 0)
			i_458_ = 0;
		else if (i_458_ >= IndexLoaders.MAP_REGION_DECODER.method4451(-2037475138))
			i_458_ = IndexLoaders.MAP_REGION_DECODER.method4451(-1890648786);
		client.anInt7262 = 2146249857 * (256 + (i_457_ << 9));
		client.anInt7376 = (256 + (i_458_ << 9)) * -1818102377;
		Class262.anInt3240 = 1540976692;
		Class86.anInt833 = -1509271845;
		Class508.anInt5864 = 987778595;
	}

	static final void method10629(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub23_8202, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, -1419729786);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -124);
		Class190.method3148((byte) 34);
		client.aBool7175 = false;
	}

	static final void method10630(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_459_ = i >> 14 & 0x3fff;
		int i_460_ = i & 0x3fff;
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1248900442);
		i_459_ -= class219.anInt2711 * 1948093437;
		if (i_459_ < 0)
			i_459_ = 0;
		else if (i_459_ >= IndexLoaders.MAP_REGION_DECODER.method4424(-1750439846))
			i_459_ = IndexLoaders.MAP_REGION_DECODER.method4424(-636700538);
		i_460_ -= class219.anInt2712 * -1002240017;
		if (i_460_ < 0)
			i_460_ = 0;
		else if (i_460_ >= IndexLoaders.MAP_REGION_DECODER.method4451(-1463134137))
			i_460_ = IndexLoaders.MAP_REGION_DECODER.method4451(-859777139);
		client.anInt7262 = 2146249857 * (256 + (i_459_ << 9));
		client.anInt7376 = (256 + (i_460_ << 9)) * -1818102377;
		Class262.anInt3240 = 1540976692;
		Class86.anInt833 = -1509271845;
		Class508.anInt5864 = 987778595;
	}

	static final void method10631(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 73);
		Class235.method3965(class118, class527, 2029354296);
	}

	static final void method10632(CS2Executor class527) {
		Class275_Sub7.method12606((byte) 16);
	}

	static final void method10633(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i == -1) {
			int i_461_ = i >> 14 & 0x3fff;
			int i_462_ = i & 0x3fff;
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(101794520);
			i_461_ -= class219.anInt2711 * 1948093437;
			if (i_461_ < 0)
				i_461_ = 0;
			else if (i_461_ >= IndexLoaders.MAP_REGION_DECODER.method4424(458422727))
				i_461_ = IndexLoaders.MAP_REGION_DECODER.method4424(-1923256203);
			i_462_ -= class219.anInt2712 * -1002240017;
			if (i_462_ < 0)
				i_462_ = 0;
			else if (i_462_ >= IndexLoaders.MAP_REGION_DECODER.method4451(-649759233))
				i_462_ = IndexLoaders.MAP_REGION_DECODER.method4451(-783620155);
			Class508.anInt5864 = -987778595 * ((i_461_ << 9) + 256);
			Class86.anInt833 = 1509271845 * (256 + (i_462_ << 9));
		} else {
			Class508.anInt5864 = 987778595;
			Class86.anInt833 = -1509271845;
		}
	}

	static final void method10634(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i == -1) {
			int i_463_ = i >> 14 & 0x3fff;
			int i_464_ = i & 0x3fff;
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(2124435937);
			i_463_ -= class219.anInt2711 * 1948093437;
			if (i_463_ < 0)
				i_463_ = 0;
			else if (i_463_ >= IndexLoaders.MAP_REGION_DECODER.method4424(464274719))
				i_463_ = IndexLoaders.MAP_REGION_DECODER.method4424(-1697877055);
			i_464_ -= class219.anInt2712 * -1002240017;
			if (i_464_ < 0)
				i_464_ = 0;
			else if (i_464_ >= IndexLoaders.MAP_REGION_DECODER.method4451(-451681311))
				i_464_ = IndexLoaders.MAP_REGION_DECODER.method4451(-1533269269);
			Class508.anInt5864 = -987778595 * ((i_463_ << 9) + 256);
			Class86.anInt833 = 1509271845 * (256 + (i_464_ << 9));
		} else {
			Class508.anInt5864 = 987778595;
			Class86.anInt833 = -1509271845;
		}
	}

	static final void method10635(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -672443707 * Class262.anInt3240 == 2 ? 1 : 0;
	}

	static final void method10636(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -672443707 * Class262.anInt3240 == 2 ? 1 : 0;
	}

	static final void method10637(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_465_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class282_Sub14.method12221(((UnderlayDefinition) class513).aClass118_5886, i, i_465_, 1493613786);
	}

	static final void method10638(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -672443707 * Class262.anInt3240 == 2 ? 1 : 0;
	}

	static final void method10639(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_466_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		UnderlayDefinition class513;
		if (class527.aBool7022)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class513.method8766((class527.animable.aClass98_10324), i, i_466_, (byte) 1) ? 1 : 0;
	}

	static final void method10640(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -672443707 * Class262.anInt3240 == 2 ? 1 : 0;
	}

	static final void method10641(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		String string_467_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		Class2.method257(string, string_467_, 1942118537);
	}

	static final void method10642(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		String string_468_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		Class2.method257(string, string_468_, 1942118537);
	}

	static final void method10643(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		String string_469_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		Class2.method257(string, string_469_, 1942118537);
	}

	static final void method10644(CS2Executor class527) {
		Class101.method1774((byte) -72);
	}

	static final void method10645(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12609(-1763675641) ? 1 : 0;
	}

	static final void method10646(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class529.method11337(class118, class98, class527, -944365595);
	}

	static final void method10647(CS2Executor class527) {
		if (!JS5CacheFile.method3360((byte) -43))
			JS5StandardRequester.method5558(-500941691);
	}

	static final void method10648(CS2Executor class527) {
		System.out.println(class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
	}

	static final void method10649(CS2Executor class527) {
		Class86.method1478(-2111140282);
	}

	static final void method10650(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_470_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		int i_471_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class282_Sub50_Sub9 class282_sub50_sub9 = IndexLoaders.aClass429_4265.method7214(i, -1662030498);
		if ((class282_sub50_sub9.method14918(i_470_, -1362550930).anInt2997 * -1869685303) != 0)
			throw new RuntimeException("");
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class282_sub50_sub9.method14901(i_470_, i_471_, 2123454292);
	}

	static final void method10651(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class493.method8273(string, (byte) -101);
	}

	static final void method10652(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class493.method8273(string, (byte) -96);
	}

	static final void method10653(CS2Executor class527) {
		Class282_Sub29.method12426(1841165816);
	}

	static final void method10654(CS2Executor class527) {
		Class282_Sub29.method12426(742288098);
	}

	static final void method10655(CS2Executor class527) {
		Class282_Sub29.method12426(1651942962);
	}

	static final void method10656(Class118 class118, int i, int i_472_, CS2Executor class527) {
		if (null == class118.anIntArray1267) {
			if (i_472_ > 0) {
				class118.aByteArrayArray1366 = new byte[11][];
				class118.aByteArrayArray1367 = new byte[11][];
				class118.anIntArray1395 = new int[11];
				class118.anIntArray1267 = new int[11];
			} else
				return;
		}
		class118.anIntArray1267[i] = i_472_;
		if (i_472_ > 0)
			class118.aBool1424 = true;
		else {
			class118.aBool1424 = false;
			for (int i_473_ = 0; i_473_ < class118.aByteArrayArray1366.length; i_473_++) {
				if (class118.aByteArrayArray1366[i_473_] != null || class118.anIntArray1267[i_473_] > 0) {
					class118.aBool1424 = true;
					break;
				}
			}
		}
	}

	static final void method10657(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		UnderlayDefinition class513;
		if (class527.aBool7022)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class513.method8764(i, -1, -1290054035) ? 1 : 0;
	}

	static final void method10658(CS2Executor class527) {
		int i = ((client.anIntArrayArrayArray7302[(class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)])]).length >> 1);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
	}

	static final void method10659(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub14_8211), i, 559237884);
			Class190.method3148((byte) 107);
			client.aBool7175 = false;
		}
	}

	static final void method10660(Class118 class118, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_474_ = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (6 != 2131324949 * class118.anInt1329)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(class118.anInt1330 * -402732635, (byte) 2);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, true);
		class118.aClass417_1308.aLong4993 = Class86.method1480(-1253906881) * 7197667099348947907L;
		if (i_474_ < 0 || i_474_ >= class409.anIntArray4859.length)
			throw new RuntimeException(new StringBuilder().append("").append(i_474_).toString());
		class118.aClass417_1308.anIntArray4992[i_474_] = i;
		Class109.method1858(class118, (byte) -2);
	}

	static final void method10661(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 96);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class52.method1083(class118, class98, class527, -1250124563);
	}

	static final void method10662(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 103);
		if (null == class118.aString1369)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class118.aString1369;
	}

	static final void method10663(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub41_Sub1.method14700(class118, class98, class527, -306402368);
	}

	static final void method10664(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1378127363 * Class9.anInt106;
	}

	static final void method10665(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1378127363 * Class9.anInt106;
	}

	static final void method10666(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt103 * 327149175;
	}

	static final void method10667(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt103 * 327149175;
	}

	static final void method10668(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt103 * 327149175;
	}

	static final void method10669(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt103 * 327149175;
	}

	static void method10670(CS2Executor class527) {
		int i = (class527.intStack[1942118537 * class527.anInt7012 - 3]);
		int i_475_ = (class527.intStack[class527.anInt7012 * 1942118537 - 2]);
		int i_476_ = (class527.intStack[1942118537 * class527.anInt7012 - 1]);
		class527.anInt7012 -= 425673003;
		if (i > class527.globalArrayLengths[i_475_])
			throw new RuntimeException();
		if (i > class527.globalArrayLengths[i_476_])
			throw new RuntimeException();
		if (i_475_ == i_476_)
			throw new RuntimeException();
		Class225_Sub5.method13047((class527.globalArrays[i_475_]), (class527.globalArrays[i_476_]), 0, i - 1, (byte) 98);
	}

	static final void method10671(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class152.method2598(2003271711).method243((byte) 1);
	}

	static final void method10672(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 118);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class359.method6244(class118, class98, class527, -1039617792);
	}

	static final void method10673(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class152.method2598(1785437657).method243((byte) 1);
	}

	static final void method10674(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aClass330Array7428[i].method5909(1196920939);
	}

	static final void method10675(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class87.method1489(454509334).method243((byte) 1);
	}

	static final void method10676(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870);
	}

	static final void method10677(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -274659233 * Class9.anInt112;
	}

	static final void method10678(CS2Executor class527) {
		Class466.method7777(1416493755);
	}

	static final void method10679(CS2Executor class527) {
		Class466.method7777(1416493755);
	}

	static final void method10680(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class336.method6010(class118, class98, class527, 197184080);
	}

	static final void method10681(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt106 * -1378127363;
	}

	static final void method10682(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt106 * -1378127363;
	}

	static final void method10683(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_477_ = (String) (class527.objectStack[1 + 1806726141 * class527.anInt7000]);
		Class155.method2635(string, string_477_, -293877252);
	}

	static final void method10684(CS2Executor class527) {
		Class438.method7333(false, 2057695265);
	}

	static final void method10685(CS2Executor class527) {
		Class438.method7333(false, 2138085069);
	}

	static final void method10686(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 456793949 * Class9.anInt72;
	}

	static final void method10687(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub17_8200, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0) ? 1 : 0, -988347105);
		Class190.method3148((byte) 100);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -19);
	}

	static final void method10688(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub25.method12401(class118, class98, class527, 1750829875);
	}

	static final void method10689(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(1717435572) == 2 ? 1 : 0;
	}

	static final void method10690(CS2Executor class527) {
		if (client.aByteArray7152 != null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10691(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub14 class282_sub50_sub14 = IndexLoaders.aClass331_3535.method5918(i, -482832811);
		if (class282_sub50_sub14.anIntArray9746 == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub14.anIntArray9746.length;
	}

	static final void method10692(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (client.aLong7153 * -8972807970865466165L >> 32);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (-8972807970865466165L * client.aLong7153 & 0xffffffffffffffffL);
	}

	static final void method10693(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, false, 2, class527, (byte) -11);
	}

	static final void method10694(CS2Executor class527) {
		AnimationDefinitions.method11148((class527.animable), (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), -958503425);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method10695(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt107 * -1951489731;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -79406355 * Class9.anInt109;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -532543837 * Class9.anInt108;
		Class9.anInt107 = 264209366;
		Class9.anInt109 = -915280613;
		Class9.anInt108 = 691675893;
	}

	static final void method10696(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_478_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (i >= 0 && i < 2)
			client.anIntArrayArrayArray7302[i] = new int[i_478_ << 1][4];
	}

	static final void method10697(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt107 * -1951489731;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -79406355 * Class9.anInt109;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -532543837 * Class9.anInt108;
		Class9.anInt107 = 264209366;
		Class9.anInt109 = -915280613;
		Class9.anInt108 = 691675893;
	}

	static final void method10698(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -574868913 * client.anInt7416;
	}

	static final void method10699(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = JS5CacheFile.method3360((byte) -8) ? 1 : 0;
	}

	static final void method10700(CS2Executor class527) {
		Class86.method1478(-2122104545);
	}

	static final void method10701(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7155 ? 1 : 0;
	}

	static final void method10702(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 30);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class158.method2732(class118, class98, class527, -303660615);
	}

	static final long method10703() {
		return ((long) ((anInt5906 += -1393099101) * -336812789 - 1) << 32 | 0xffffffffL);
	}

	static final void method10704(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class389.method6697(class118, class98, class527, 1702077725);
	}

	static final void method10705(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 603397989).anInt5051 * 15210351);
	}

	static final void method10706(CS2Executor class527) {
		class527.aLongArray6996[(class527.unknown[301123709 * class527.instrPtr])] = (class527.aLongArray7003[((class527.anInt7001 -= -1188480575) * 1820448321)]);
	}

	static final void method10707(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub19_8204, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, -359193657);
		Class94.method1589((short) 255);
		IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4048(2049660246);
		Class190.method3148((byte) 111);
		client.aBool7175 = false;
	}

	static final void method10708(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(-73968599);
	}

	static final void method10709(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aString1338 = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
	}

	static final void method10710(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub21_8222), i, 603890331);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -125);
		Class190.method3148((byte) 125);
		client.aBool7175 = false;
	}

	static final void method10711(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class96_Sub19.method14665(string, 1220033429);
	}

	static final void method10712(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_479_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i - i_479_;
	}

	static final void method10713(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3565((byte) -88) ? 1 : 0;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3566(-2143623365) ? 1 : 0;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3567((byte) 86) ? 1 : 0;
	}

	static final void method10714(CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8208), bool ? 2 : 1, 53070028);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8209), bool ? 2 : 1, -672707804);
		Class405.method6823(-734889653);
		Class190.method3148((byte) 71);
		client.aBool7175 = false;
	}

	static final void method10715(CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8208), bool ? 2 : 1, 604727553);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8209), bool ? 2 : 1, -1696278594);
		Class405.method6823(-734889653);
		Class190.method3148((byte) 52);
		client.aBool7175 = false;
	}

	static final void method10716(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub23_8202, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, -1488629787);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -43);
		Class190.method3148((byte) 37);
		client.aBool7175 = false;
	}

	static final void method10717(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		short i_480_ = (short) (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		short i_481_ = (short) (class527.intStack[class527.anInt7012 * 1942118537 + 2]);
		if (i >= 0 && i < 5) {
			class118.method2013(i, i_480_, i_481_, (byte) 44);
			Class109.method1858(class118, (byte) -60);
			if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
				Class276.method4903(-1952846363 * class118.anInt1287, i, 1216896381);
		}
	}

	static final void method10718(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class15.method542(class118, class98, class527, -1806297366);
	}

	static final void method10719(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub15_8203, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 597367717);
		Class190.method3148((byte) 76);
		client.aBool7175 = false;
	}

	static final void method10720(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub15_8203, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 1094106521);
		Class190.method3148((byte) 117);
		client.aBool7175 = false;
	}

	static final void method10721(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub15_8203, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -215410884);
		Class190.method3148((byte) 74);
		client.aBool7175 = false;
	}

	static final void method10722(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub26_8224, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, 1868442640);
		Class190.method3148((byte) 124);
		client.aBool7175 = false;
	}

	static final void method10723(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub26_8224, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, -2020325386);
		Class190.method3148((byte) 61);
		client.aBool7175 = false;
	}

	static final void method10724(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub26_8224, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, -2102189660);
		Class190.method3148((byte) 33);
		client.aBool7175 = false;
	}

	static final void method10725(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 47);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class290.method5121(class118, class98, class527, (byte) 7);
	}

	static final void method10726(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub28_8212, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, -839595987);
		Class190.method3148((byte) 100);
		client.aBool7175 = false;
	}

	static final void method10727(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub28_8212, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, 963715721);
		Class190.method3148((byte) 89);
		client.aBool7175 = false;
	}

	static final void method10728(CS2Executor class527) {
		class527.intStack[1942118537 * class527.anInt7012 - 1] = (class527.aClass61_7010.method1215((byte) 33)[(class527.intStack[1942118537 * class527.anInt7012 - 1])]);
	}

	static final void method10729(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class496.method8310(class118, class98, class527, (byte) -116);
	}

	static final void method10730(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 52);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 985215637 * class118.anInt1320;
	}

	static final void method10731(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != -1)
			Class92.method1563(i, 1917715893);
	}

	static final void method10732(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub30_8194, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, 2070025471);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -34);
		Class190.method3148((byte) 74);
		client.aBool7175 = false;
	}

	static final void method10733(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub30_8194, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, 1628382793);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -91);
		Class190.method3148((byte) 49);
		client.aBool7175 = false;
	}

	static final void method10734(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub4_8223, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 1045544698);
		Class538.method11500(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1511334580), false, (byte) 24);
		Class190.method3148((byte) 21);
	}

	static final void method10735(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub10_8215, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, -847365974);
		Class282_Sub20_Sub36.method15418(-244173127);
		Class190.method3148((byte) 121);
		client.aBool7175 = false;
	}

	static final void method10736(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method7785(i, -104024452);
	}

	static final void method10737(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 48);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub18.method14664(class118, class98, true, 0, class527, (byte) -8);
	}

	static final void method10738(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_482_ = Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(645473326);
		if (i != i_482_) {
			if (Class169.method2875(-1741204137 * client.anInt7166, -2056866600)) {
				if (0 == i_482_ && Class260.anInt3223 * 1293234709 != -1) {
					Class282_Sub43.method13400(IndexLoaders.MUSIC_INDEX, 1293234709 * Class260.anInt3223, 0, i, false, (byte) -64);
					Class468_Sub6.method12658(-596600001);
					Class260.aBool3220 = false;
				} else if (i == 0) {
					Class226.method3805(-1719520107);
					Class260.aBool3220 = false;
				} else
					Class87.method1491(i, (byte) -34);
			}
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub13_8228), i, 523959298);
			Class190.method3148((byte) 26);
			client.aBool7175 = false;
		}
	}

	static final void method10739(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_483_ = Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(-481989657);
		if (i != i_483_) {
			if (Class169.method2875(-1741204137 * client.anInt7166, -1996559058)) {
				if (0 == i_483_ && Class260.anInt3223 * 1293234709 != -1) {
					Class282_Sub43.method13400(IndexLoaders.MUSIC_INDEX, 1293234709 * Class260.anInt3223, 0, i, false, (byte) -120);
					Class468_Sub6.method12658(817612647);
					Class260.aBool3220 = false;
				} else if (i == 0) {
					Class226.method3805(-1719520107);
					Class260.aBool3220 = false;
				} else
					Class87.method1491(i, (byte) -120);
			}
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub13_8228), i, 1999946935);
			Class190.method3148((byte) 126);
			client.aBool7175 = false;
		}
	}

	static final void method10740(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_484_ = Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(422601430);
		if (i != i_484_) {
			if (Class169.method2875(-1741204137 * client.anInt7166, -1901488832)) {
				if (0 == i_484_ && Class260.anInt3223 * 1293234709 != -1) {
					Class282_Sub43.method13400(IndexLoaders.MUSIC_INDEX, 1293234709 * Class260.anInt3223, 0, i, false, (byte) -110);
					Class468_Sub6.method12658(-310135765);
					Class260.aBool3220 = false;
				} else if (i == 0) {
					Class226.method3805(-1719520107);
					Class260.aBool3220 = false;
				} else
					Class87.method1491(i, (byte) 24);
			}
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub13_8228), i, 1150617881);
			Class190.method3148((byte) 101);
			client.aBool7175 = false;
		}
	}

	static final void method10741(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub13_8193, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -1380014238);
		Class190.method3148((byte) 97);
		client.aBool7175 = false;
	}

	static final void method10742(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub13_8193, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -1674786695);
		Class190.method3148((byte) 29);
		client.aBool7175 = false;
	}

	static final void method10743(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -492594917 * class118.anInt1429;
	}

	static final void method10744(CS2Executor class527) {
		int i = Class393.aClass282_Sub54_4783.aClass468_Sub27_8208.method12952((byte) 10);
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub27_8209, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 0 : i, -1375100401);
		Class405.method6823(-734889653);
	}

	static final void method10745(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub20_8207), i, 1037922905);
		Class190.method3148((byte) 43);
		client.aBool7175 = false;
	}

	static final void method10746(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub20_8207), i, -272501841);
		Class190.method3148((byte) 72);
		client.aBool7175 = false;
	}

	static final void method10747(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub20_8207), i, 1359867208);
		Class190.method3148((byte) 44);
		client.aBool7175 = false;
	}

	static final void method10748(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub20_8207), i, -2074808808);
		Class190.method3148((byte) 21);
		client.aBool7175 = false;
	}

	static final void method10749(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub4_8187, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -865345882);
		Class190.method3148((byte) 53);
	}

	static final void method10750(CS2Executor class527) {
		Class184 class184 = Class468_Sub20.method12807(-1809449623);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 239716135);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, -1488753089);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i), -1330823532);
		class184.method3049(class282_sub23, 687882142);
	}

	static final void method10751(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 125);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class346.method6158(class118, class98, class527, 1243946017);
	}

	static final void method10752(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1329 = 1769250231;
		class118.anInt1330 = -1183558903 * client.anInt7315;
		class118.anInt1339 = 0;
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.anInt1287 * -1952846363, -1367457544);
	}

	static final void method10753(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i < 0 || i > 1)
			i = 0;
		Class115.method1952(i == 1, 996097710);
	}

	static final void method10754(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i < 0 || i > 1)
			i = 0;
		Class115.method1952(i == 1, 1047189121);
	}

	static final void method10755(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i < 0 || i > 1)
			i = 0;
		Class115.method1952(i == 1, 349771728);
	}

	static final void method10756(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 44);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class249.method4276(class118, class98, class527, -292996560);
	}

	static final void method10757(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub17_8200, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0) ? 1 : 0, 1247794178);
		Class190.method3148((byte) 39);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -29);
	}

	static final void method10758(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class235.method3965(class118, class527, -1516016299);
	}

	static final void method10759(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		class527.anInt7012 -= 283782002;
		Class119.method2074((String) (class527.objectStack[class527.anInt7000 * 1806726141]), (String) (class527.objectStack[1 + 1806726141 * class527.anInt7000]), (class527.intStack[1942118537 * class527.anInt7012]), 1 == (class527.intStack[class527.anInt7012 * 1942118537 + 1]), (byte) -44);
	}

	static final void method10760(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub17_8200, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0) ? 1 : 0, -650515495);
		Class190.method3148((byte) 33);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -46);
	}

	static final void method10761(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub17_8200, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0) ? 1 : 0, -785207784);
		Class190.method3148((byte) 24);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -111);
	}

	static final void method10762(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub17_8200, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0) ? 1 : 0, -1445789801);
		Class190.method3148((byte) 33);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -5);
	}

	static final void method10763(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub17_8200, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0) ? 1 : 0, -914445401);
		Class190.method3148((byte) 80);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -28);
	}

	static final void method10764(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i < 0 || i > 5)
			i = 2;
		Class538.method11500(i, false, (byte) 24);
	}

	static final void method10765(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		boolean bool = 1 == (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), i, -1959333393);
		if (!bool)
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub6_8192), 0, 341005537);
		Class190.method3148((byte) 25);
		client.aBool7175 = false;
	}

	static final void method10766(CS2Executor class527) {
		Class93.method1573(class527, (byte) 112);
	}

	static final void method10767(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1428 * 198275475;
	}

	static final void method10768(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub22_8213, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, 606300094);
		Class190.method3148((byte) 33);
		Class94.method1589((short) 255);
		client.aBool7175 = false;
	}

	static final void method10769(CS2Executor class527) {
		if (Class96_Sub21.aClass199_9438.method3236(81, -1908031526))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10770(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub7_8210, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -726390579);
		Class190.method3148((byte) 14);
		client.aBool7185 = true;
	}

	static final void method10771(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub13_8227, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 548686476);
		Class190.method3148((byte) 25);
		client.aBool7175 = false;
	}

	static final void method10772(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub13_8227, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 2070902215);
		Class190.method3148((byte) 66);
		client.aBool7175 = false;
	}

	static final void method10773(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_485_ = Class393.aClass282_Sub54_4783.aClass468_Sub13_8229.method12714(-1260426264);
		if (i_485_ != i && (Class260.anInt3228 * 1712678171 == Class260.anInt3223 * 1293234709)) {
			if (!Class169.method2875(client.anInt7166 * -1741204137, -2020975392)) {
				if (0 == i_485_) {
					Class282_Sub43.method13400(IndexLoaders.MUSIC_INDEX, 1293234709 * Class260.anInt3223, 0, i, false, (byte) -69);
					Class468_Sub6.method12658(1759375378);
					Class260.aBool3220 = false;
				} else if (i == 0) {
					Class226.method3805(-1719520107);
					Class260.aBool3220 = false;
				} else
					Class87.method1491(i, (byte) -38);
			}
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub13_8229), i, -750194898);
			Class190.method3148((byte) 55);
			client.aBool7175 = false;
		}
	}

	static final void method10774(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_486_ = Class393.aClass282_Sub54_4783.aClass468_Sub13_8229.method12714(-1007741551);
		if (i_486_ != i && (Class260.anInt3228 * 1712678171 == Class260.anInt3223 * 1293234709)) {
			if (!Class169.method2875(client.anInt7166 * -1741204137, -1967324413)) {
				if (0 == i_486_) {
					Class282_Sub43.method13400(IndexLoaders.MUSIC_INDEX, 1293234709 * Class260.anInt3223, 0, i, false, (byte) -40);
					Class468_Sub6.method12658(685900193);
					Class260.aBool3220 = false;
				} else if (i == 0) {
					Class226.method3805(-1719520107);
					Class260.aBool3220 = false;
				} else
					Class87.method1491(i, (byte) -7);
			}
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub13_8229), i, -921398035);
			Class190.method3148((byte) 114);
			client.aBool7175 = false;
		}
	}

	static final void method10775(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_487_ = Class393.aClass282_Sub54_4783.aClass468_Sub13_8229.method12714(-645521686);
		if (i_487_ != i && (Class260.anInt3228 * 1712678171 == Class260.anInt3223 * 1293234709)) {
			if (!Class169.method2875(client.anInt7166 * -1741204137, -1899071556)) {
				if (0 == i_487_) {
					Class282_Sub43.method13400(IndexLoaders.MUSIC_INDEX, 1293234709 * Class260.anInt3223, 0, i, false, (byte) -125);
					Class468_Sub6.method12658(715388558);
					Class260.aBool3220 = false;
				} else if (i == 0) {
					Class226.method3805(-1719520107);
					Class260.aBool3220 = false;
				} else
					Class87.method1491(i, (byte) -6);
			}
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub13_8229), i, 837411541);
			Class190.method3148((byte) 57);
			client.aBool7175 = false;
		}
	}

	static final void method10776(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 72);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -37350919 * class118.anInt1314;
	}

	static final void method10777(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i > 255 || i < 0)
			i = 0;
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -126)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub11_8217), i, 862124076);
			Class190.method3148((byte) 81);
			client.aBool7175 = false;
		}
	}

	static final void method10778(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub7_8210.method12666(529282518);
	}

	static final void method10779(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i > 255 || i < 0)
			i = 0;
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -69)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub11_8217), i, -1379498827);
			Class190.method3148((byte) 77);
			client.aBool7175 = false;
		}
	}

	static final void method10780(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i > 255 || i < 0)
			i = 0;
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -85)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub11_8217), i, -851821481);
			Class190.method3148((byte) 63);
			client.aBool7175 = false;
		}
	}

	static final void method10781(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub14_8211), i, 407706831);
			Class190.method3148((byte) 32);
			client.aBool7175 = false;
		}
	}

	static final void method10782(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub14_8211), i, 1190947116);
			Class190.method3148((byte) 18);
			client.aBool7175 = false;
		}
	}

	static final void method10783(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub14_8211), i, 884670667);
			Class190.method3148((byte) 99);
			client.aBool7175 = false;
		}
	}

	static final void method10784(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub14_8211), i, 1624894384);
			Class190.method3148((byte) 123);
			client.aBool7175 = false;
		}
	}

	static final void method10785(CS2Executor class527) {
		Class282_Sub29.method12426(1323076739);
	}

	static final void method10786(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1309 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -511891533);
	}

	static final void method10787(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870);
	}

	static final void method10788(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12727(-639967365) ? 1 : 0;
	}

	static final void method10789(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = null != Class46.anObjectArray437 ? 1 : 0;
	}

	static final void method10790(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub27_8208.method12952((byte) 7) == 2 ? 1 : 0;
	}

	static final void method10791(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 28) == 1 ? 1 : 0;
	}

	static final void method10792(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -15) == 1 ? 1 : 0;
	}

	static final void method10793(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 63);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class529.method11337(class118, class98, class527, -704518058);
	}

	static final void method10794(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -119);
	}

	static final void method10795(CS2Executor class527) {
		Class337.method6018((class527.animable), class527, 1241532198);
	}

	static final void method10796(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 40);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class52.method1083(class118, class98, class527, -1250124563);
	}

	static final void method10797(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		ReferenceTable.method5763(class118, class98, class527, 885167861);
	}

	static final void method10798(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub6_8192.method12654(-239553097);
	}

	static final void method10799(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_488_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class515.method8861(i, i_488_, false, 1694189824);
	}

	static final void method10800(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 78);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1506818197 * class118.anInt1301;
	}

	static final void method10801(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class202.method3345(string, 1026155258);
	}

	static final void method10802(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub30_8194.method13417(-2045639870) == 1 ? 1 : 0;
	}

	static final void method10803(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub4_8223.method12641(-922009023);
	}

	static final void method10804(CS2Executor class527) {
		if (client.rights * -644057819 >= 2)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -644057819 * client.rights;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method10805(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1855190170) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1386 = Class351.method6193(string, class527, 1008394497);
		class118.aBool1384 = true;
	}

	static final void method10806(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(-1731880820);
	}

	static final void method10807(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(-1551953709);
	}

	static final void method10808(CS2Executor class527) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0);
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Class202.method3342((long) i, 0, bool, Class223.CURRENT_LANGUAGE, (byte) -76);
	}

	static final void method10809(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub4_8187.method12641(-2082817050);
	}

	static final void method10810(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12615(-490417064);
	}

	static final void method10811(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12615(-1213844345);
	}

	static final void method10812(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1552292309 * class118.anInt1293;
	}

	static final void method10813(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class527.aClass282_Sub4_7011.aString7501;
	}

	static final void method10814(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub8_8219.method12675(-1589433086) == 1 ? 1 : 0;
	}

	static final void method10815(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_489_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_490_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(3, i << 16 | i_489_, i_490_, "", (byte) 112);
	}

	static final void method10816(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(-737952519) == 1 ? 1 : 0;
	}

	static final void method10817(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(1247685694) == 1 ? 1 : 0;
	}

	static final void method10818(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1013378171);
	}

	static final void method10819(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(331630968);
	}

	static final void method10820(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method12776(-656482518);
	}

	static final void method10821(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method12776(-1641993885);
	}

	static final void method10822(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 53);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1506818197 * class118.anInt1301;
	}

	static final void method10823(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1497854167) == 1 ? 1 : 0;
	}

	static final void method10824(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(-158496704) == 1 ? 1 : 0;
	}

	static final void method10825(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1487475356) == 1 ? 1 : 0;
	}

	static final void method10826(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.anInt7012 -= 1418910010;
		byte[] is = null;
		byte[] is_491_ = null;
		int i;
		for (i = 0; (i < 10 && (class527.intStack[1942118537 * class527.anInt7012 + i]) >= 0); i += 2) {
			/* empty */
		}
		if (i > 0) {
			is = new byte[i / 2];
			is_491_ = new byte[i / 2];
			for (i -= 2; i >= 0; i -= 2) {
				is[i / 2] = (byte) (class527.intStack[i + (1942118537 * class527.anInt7012)]);
				is_491_[i / 2] = (byte) (class527.intStack[1 + ((class527.anInt7012 * 1942118537) + i)]);
			}
		}
		Class107.method1838(class118, is, is_491_, class527, 1844755981);
	}

	static final void method10827(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		Class405 class405 = IndexLoaders.aClass394_5831.method6753(i, -300311119);
		if (class405.aChar4832 != '\001')
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		Integer integer = ((Integer) Class46.anObjectArray437[1135540345 * class405.anInt4833]);
		if (integer == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else {
			int i_492_ = (-1524555999 * class405.anInt4835 == 31 ? -1 : (1 << class405.anInt4835 * -1524555999 + 1) - 1);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = ((integer.intValue() & i_492_) >>> class405.anInt4834 * 1015111697);
		}
	}

	static final void method10828(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class383.method6513(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1920597712), 200, -133014974);
	}

	static final void method10829(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class335.anIntArray3916[Class372.method6362(i, 1372192720) & 0xffff]);
	}

	static final void method10830(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class344.method6122(class118, class98, class527, -345845771);
	}

	static final void method10831(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(2088372972);
	}

	static final void method10832(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(1235265436);
	}

	static final void method10833(CS2Executor class527) {
		Class514.method8841(-262983827);
	}

	static final void method10834(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8229.method12714(1277619303);
	}

	static final void method10835(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8229.method12714(-1693470958);
	}

	static final void method10836(Class118 class118, Class98 class98, CS2Executor class527) {
		int i = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (i < 0 || i > 9)
			class527.anInt7000 -= 1476624725;
		else
			class118.method1994(i, (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]), (byte) 73);
	}

	static final void method10837(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -762135173 * client.anInt7178;
	}

	static final void method10838(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -38);
	}

	static final void method10839(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_493_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_494_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		long l = Class42.method891(0, 0, 12, i, i_493_, i_494_, 1536482914);
		int i_495_ = ObjectIndexLoader.method7914(l);
		if (i_494_ < 1970)
			i_495_--;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_495_;
	}

	static final void method10840(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (-79546877 * Class11.aClass282_Sub51_124.anInt8167 < 512 || client.aBool7465 || client.aBool7171) ? 1 : 0;
	}

	static final void method10841(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (-79546877 * Class11.aClass282_Sub51_124.anInt8167 < 512 || client.aBool7465 || client.aBool7171) ? 1 : 0;
	}

	static final void method10842(CS2Executor class527) {
		Class515.method8862((class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), -1, -1, false, -1732540658);
	}

	static final void method10843(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7155 ? 1 : 0;
	}

	static final void method10844(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644);
	}

	static final void method10845(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 112);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class52.method1083(class118, class98, class527, -1250124563);
	}

	static final void method10846(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		client.aShort7436 = (short) (class527.intStack[class527.anInt7012 * 1942118537]);
		if (client.aShort7436 <= 0)
			client.aShort7436 = (short) 256;
		client.aShort7437 = (short) (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (client.aShort7437 <= 0)
			client.aShort7437 = (short) 205;
	}

	static final void method10847(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		client.aShort7436 = (short) (class527.intStack[class527.anInt7012 * 1942118537]);
		if (client.aShort7436 <= 0)
			client.aShort7436 = (short) 256;
		client.aShort7437 = (short) (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (client.aShort7437 <= 0)
			client.aShort7437 = (short) 205;
	}

	static final void method10848(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		client.aShort7394 = (short) (class527.intStack[1942118537 * class527.anInt7012]);
		if (client.aShort7394 <= 0)
			client.aShort7394 = (short) 256;
		client.aShort7324 = (short) (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (client.aShort7324 <= 0)
			client.aShort7324 = (short) 320;
	}

	static final void method10849(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		client.aShort7394 = (short) (class527.intStack[1942118537 * class527.anInt7012]);
		if (client.aShort7394 <= 0)
			client.aShort7394 = (short) 256;
		client.aShort7324 = (short) (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (client.aShort7324 <= 0)
			client.aShort7324 = (short) 320;
	}

	static final void method10850(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		client.aShort7276 = (short) (class527.intStack[class527.anInt7012 * 1942118537]);
		if (client.aShort7276 <= 0)
			client.aShort7276 = (short) 1;
		client.aShort7441 = (short) (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (client.aShort7441 <= 0)
			client.aShort7441 = (short) 32767;
		else if (client.aShort7441 < client.aShort7276)
			client.aShort7441 = client.aShort7276;
		client.aShort7214 = (short) (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		if (client.aShort7214 <= 0)
			client.aShort7214 = (short) 1;
		client.aShort7474 = (short) (class527.intStack[3 + class527.anInt7012 * 1942118537]);
		if (client.aShort7474 <= 0)
			client.aShort7474 = (short) 32767;
		else if (client.aShort7474 < client.aShort7214)
			client.aShort7474 = client.aShort7214;
	}

	static final void method10851(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		client.aShort7276 = (short) (class527.intStack[class527.anInt7012 * 1942118537]);
		if (client.aShort7276 <= 0)
			client.aShort7276 = (short) 1;
		client.aShort7441 = (short) (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (client.aShort7441 <= 0)
			client.aShort7441 = (short) 32767;
		else if (client.aShort7441 < client.aShort7276)
			client.aShort7441 = client.aShort7276;
		client.aShort7214 = (short) (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		if (client.aShort7214 <= 0)
			client.aShort7214 = (short) 1;
		client.aShort7474 = (short) (class527.intStack[3 + class527.anInt7012 * 1942118537]);
		if (client.aShort7474 <= 0)
			client.aShort7474 = (short) 32767;
		else if (client.aShort7474 < client.aShort7214)
			client.aShort7474 = client.aShort7214;
	}

	static final void method10852(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class217_Sub1 class217_sub1 = ObjectIndexLoader.method7916(i, 632924);
		if (null != class217_sub1) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1203083985 * class217_sub1.anInt2700;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7977;
			Class213 class213 = class217_sub1.method13055((short) -7612);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -216896281 * class213.anInt2680;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class213.aString2679;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2701 * 652811625;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt7978 * -129507359;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7976;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method10853(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7394;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7324;
	}

	static final void method10854(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7394;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7324;
	}

	static final void method10855(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 123);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class262.method4651(class118, class98, class527, (byte) 53);
	}

	static final void method10856(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub20_Sub38.method15430(i, 16711935);
	}

	static final void method10857(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Class169.method2869(1873777591) / 60000L);
	}

	static final void method10858(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_496_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i & i_496_;
	}

	static final void method10859(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1277 * 442725395;
	}

	static final void method10860(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Class169.method2869(2094430935) / 86400000L) - 11745;
	}

	static final void method10861(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(230476168) == 2 ? 1 : 0;
	}

	static final void method10862(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_497_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_498_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		long l = Class42.method891(0, 0, 12, i, i_497_, i_498_, 1462554461);
		int i_499_ = ObjectIndexLoader.method7914(l);
		if (i_498_ < 1970)
			i_499_--;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_499_;
	}

	static final void method10863(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub22_8213, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, 494084177);
		Class190.method3148((byte) 53);
		Class94.method1589((short) 255);
		client.aBool7175 = false;
	}

	static final void method10864(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_500_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_501_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		long l = Class42.method891(0, 0, 12, i, i_500_, i_501_, 1754135521);
		int i_502_ = ObjectIndexLoader.method7914(l);
		if (i_501_ < 1970)
			i_502_--;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_502_;
	}

	static final void method10865(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_503_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = string.indexOf(i, i_503_);
	}

	static final void method10866(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int[] is = Class268.method4799(i, 72550989);
		Class503.method8362(is, 0, class527.intStack, class527.anInt7012 * 1942118537, 3);
		class527.anInt7012 += 425673003;
	}

	static final void method10867(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Class302.method5363(i, 159033131) / 60000L);
	}

	static final void method10868(CS2Executor class527) {
		Class282_Sub4.method12114((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 816429293);
	}

	static final void method10869(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_504_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_504_ * i;
	}

	static final void method10870(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -1643559842);
		Class190.method3148((byte) 34);
		client.aBool7175 = false;
	}

	static final void method10871(CS2Executor class527) {
		Class217_Sub1 class217_sub1 = Class468_Sub2.method12629(-1660419525);
		if (null != class217_sub1) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 157132839 * class217_sub1.anInt7975;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2700 * 1203083985;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7977;
			Class213 class213 = class217_sub1.method13055((short) -26844);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class213.anInt2680 * -216896281;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class213.aString2679;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2701 * 652811625;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt7978 * -129507359;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7976;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method10872(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -62) == 1 ? 1 : 0;
	}

	static final void method10873(CS2Executor class527) {
		Class217_Sub1 class217_sub1 = Class77.method1368(-2106612803);
		if (null != class217_sub1) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 157132839 * class217_sub1.anInt7975;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2700 * 1203083985;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7977;
			Class213 class213 = class217_sub1.method13055((short) -24842);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -216896281 * class213.anInt2680;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class213.aString2679;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 652811625 * class217_sub1.anInt2701;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -129507359 * class217_sub1.anInt7978;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7976;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method10874(CS2Executor class527) {
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 0)
			class527.instrPtr += (-1051529003 * (class527.unknown[class527.instrPtr * 301123709]));
	}

	static final void method10875(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.anInt7166 * -1741204137 != 0 || JS5CacheFile.method3360((byte) 109))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = Class62.method1262(i, string, (byte) -79) ? 1 : 0;
	}

	static final void method10876(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class217_Sub1 class217_sub1 = ObjectIndexLoader.method7916(i, 981475805);
		if (null != class217_sub1) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1203083985 * class217_sub1.anInt2700;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7977;
			Class213 class213 = class217_sub1.method13055((short) -20595);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -216896281 * class213.anInt2680;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class213.aString2679;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2701 * 652811625;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt7978 * -129507359;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7976;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method10877(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 2, class527, (byte) 8);
	}

	static final void method10878(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class241.method4149(class118, class98, class527, -1898182330);
	}

	static final void method10879(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		boolean bool = ((class527.intStack[class527.anInt7012 * 1942118537 + 1]) == 1);
		int i_505_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		boolean bool_506_ = ((class527.intStack[3 + class527.anInt7012 * 1942118537]) == 1);
		Class365.method6299(i, bool, i_505_, bool_506_, (byte) -46);
	}

	static final void method10880(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		boolean bool = ((class527.intStack[class527.anInt7012 * 1942118537 + 1]) == 1);
		int i_507_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		boolean bool_508_ = ((class527.intStack[3 + class527.anInt7012 * 1942118537]) == 1);
		Class365.method6299(i, bool, i_507_, bool_508_, (byte) -49);
	}

	static final void method10881(CS2Executor class527) {
		class527.anInt7012 -= 567564004;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		boolean bool = ((class527.intStack[class527.anInt7012 * 1942118537 + 1]) == 1);
		int i_509_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		boolean bool_510_ = ((class527.intStack[3 + class527.anInt7012 * 1942118537]) == 1);
		Class365.method6299(i, bool, i_509_, bool_510_, (byte) -65);
	}

	static final void method10882(CS2Executor class527) {
		Class274.method4884((byte) 29);
	}

	static final void method10883(CS2Executor class527) {
		Class274.method4884((byte) 23);
	}

	static final void method10884(CS2Executor class527) {
		if (client.anInt7166 * -1741204137 == 0)
			Class448.aBool5419 = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1;
	}

	static final void method10885(CS2Executor class527) {
		Class217_Sub1 class217_sub1 = IsaacCipher.method7266(1972637227);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = null == class217_sub1 ? 0 : 1203083985 * class217_sub1.anInt2700;
	}

	static final void method10886(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -520818011 * TilestreamPacket.anInt4219;
	}

	static final void method10887(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null == Class468_Sub8.aClass98Array7889[i])
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else {
			String string = (Class468_Sub8.aClass98Array7889[i].aClass118Array998[0].aString1285);
			if (string == null)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = string.substring(0, string.indexOf(':'));
		}
	}

	static final void method10888(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null == Class468_Sub8.aClass98Array7889[i])
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else {
			String string = (Class468_Sub8.aClass98Array7889[i].aClass118Array998[0].aString1285);
			if (string == null)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = string.substring(0, string.indexOf(':'));
		}
	}

	static final void method10889(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class204.method3369(class118, class98, class527, (byte) 0);
	}

	static final void method10890(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.animable.method12997(-218366287);
	}

	static final void method10891(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_511_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		if (Class468_Sub8.aClass98Array7889[i] == null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else {
			String string = (Class468_Sub8.aClass98Array7889[i].aClass118Array998[i_511_].aString1285);
			if (null == string)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = string;
		}
	}

	static final void method10892(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_512_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (Class468_Sub8.aClass98Array7889[i] == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1726519169 * (Class468_Sub8.aClass98Array7889[i].aClass118Array998[i_512_].anInt1414);
	}

	static final void method10893(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_513_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (Class468_Sub8.aClass98Array7889[i] == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1726519169 * (Class468_Sub8.aClass98Array7889[i].aClass118Array998[i_513_].anInt1414);
	}

	static final void method10894(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_514_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (Class468_Sub8.aClass98Array7889[i] == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1726519169 * (Class468_Sub8.aClass98Array7889[i].aClass118Array998[i_514_].anInt1414);
	}

	static final void method10895(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_515_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (Class468_Sub8.aClass98Array7889[i] == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1726519169 * (Class468_Sub8.aClass98Array7889[i].aClass118Array998[i_515_].anInt1414);
	}

	static final void method10896(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_516_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (Class468_Sub8.aClass98Array7889[i] == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1726519169 * (Class468_Sub8.aClass98Array7889[i].aClass118Array998[i_516_].anInt1414);
	}

	static final void method10897(CS2Executor class527) {
		/* empty */
	}

	static final void method10898(CS2Executor class527) {
		/* empty */
	}

	static final void method10899(CS2Executor class527) {
		/* empty */
	}

	static final void method10900(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_517_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_518_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		Class96_Sub10.method14603(1, i << 16 | i_517_, i_518_, "", (byte) 118);
	}

	static final void method10901(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_519_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_520_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		Class96_Sub10.method14603(1, i << 16 | i_519_, i_520_, "", (byte) 35);
	}

	static final void method10902(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_521_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_522_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(2, i << 16 | i_521_, i_522_, "", (byte) 101);
	}

	static final void method10903(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_523_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_524_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(2, i << 16 | i_523_, i_524_, "", (byte) 124);
	}

	static final void method10904(CS2Executor class527) {
		Class521_Sub1_Sub5_Sub2.method16114(-191485904);
	}

	static final void method10905(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7224 && !client.aBool7244 ? 1 : 0;
	}

	static final void method10906(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub13_8225, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -2034695401);
		Class190.method3148((byte) 101);
		client.aBool7175 = false;
	}

	static final void method10907(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i >= 1 && i <= 2) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub9_8226), i, 1434170116);
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub9_8218), i, 318787711);
			Class190.method3148((byte) 90);
		}
	}

	static final void method10908(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_525_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_526_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(3, i << 16 | i_525_, i_526_, "", (byte) 23);
	}

	static final void method10909(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_527_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_528_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(3, i << 16 | i_527_, i_528_, "", (byte) 12);
	}

	static final void method10910(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_529_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_530_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(3, i << 16 | i_529_, i_530_, "", (byte) 70);
	}

	static final void method10911(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_531_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_532_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class96_Sub10.method14603(4, i << 16 | i_531_, i_532_, "", (byte) 41);
	}

	static final void method10912(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_533_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		int i_534_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class96_Sub10.method14603(6, i << 16 | i_533_, i_534_, "", (byte) 83);
	}

	static final void method10913(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_535_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		int i_536_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class96_Sub10.method14603(6, i << 16 | i_535_, i_536_, "", (byte) 20);
	}

	static final void method10914(CS2Executor class527) {
		AnimationDefinitions.method11148(((Class521_Sub1) class527.anInterface12_7013), (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), -964363291);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method10915(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_537_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_538_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(8, i << 16 | i_537_, i_538_, "", (byte) 62);
	}

	static final void method10916(CS2Executor class527) {
		String string = (Class462.aStringArray5548[(class527.unknown[class527.instrPtr * 301123709])]);
		if (null == string)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10917(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_539_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_540_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(8, i << 16 | i_539_, i_540_, "", (byte) 10);
	}

	static final void method10918(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_541_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		int i_542_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class96_Sub10.method14603(10, i << 16 | i_541_, i_542_, "", (byte) 107);
	}

	static final void method10919(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_543_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		int i_544_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		Class96_Sub10.method14603(10, i << 16 | i_543_, i_544_, "", (byte) 44);
	}

	static final void method10920(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_545_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_546_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		Class118 class118 = Index.method5694(i << 16 | i_545_, i_546_, 1614665786);
		Class60.method1170(-609337146);
		Class282_Sub10 class282_sub10 = client.method11633(class118);
		Class304.method5409(class118, class282_sub10.method12179(762257919), 1831058647 * class282_sub10.anInt7541, (byte) -114);
	}

	static final void method10921(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class235.method3965(class118, class527, -1507785815);
	}

	static final void method10922(Class118 class118, CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_547_ = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (6 != 2131324949 * class118.anInt1329)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(class118.anInt1330 * -402732635, (byte) 13);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, true);
		class118.aClass417_1308.aLong4993 = Class86.method1480(-585777690) * 7197667099348947907L;
		if (i_547_ < 0 || i_547_ >= class409.anIntArray4859.length)
			throw new RuntimeException(new StringBuilder().append("").append(i_547_).toString());
		class118.aClass417_1308.anIntArray4992[i_547_] = i;
		Class109.method1858(class118, (byte) 65);
	}

	static final void method10923(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		WorldMapAreaDefs class220 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 2137325071);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1248709255 * class220.anInt2719;
	}

	static final void method10924(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1551542249);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14775(i >> 14 & 0x3fff, i & 0x3fff, anIntArray5900, -76196658);
			if (bool) {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[1];
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = anIntArray5900[2];
			} else {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}

	static final void method10925(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1378127363 * Class9.anInt106;
	}

	static final void method10926(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		WorldMapAreaDefs class220 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 591966030);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 781329827 * class220.anInt2718;
	}

	static final void method10927(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		WorldMapAreaDefs class220 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, -249492375);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 781329827 * class220.anInt2718;
	}

	static final void method10928(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_548_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_548_, (byte) 0);
		if (class437.method7319(1643703088))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 1982708275).method3722(i_548_, class437.aString5335, -379285425);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 1069534103).method3723(i_548_, -1741480635 * class437.anInt5337, 1942118537));
	}

	static final void method10929(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_549_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_549_, (byte) 0);
		if (class437.method7319(2045892552))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 552024360).method3722(i_549_, class437.aString5335, -379285425);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 2087328401).method3723(i_549_, -1741480635 * class437.anInt5337, 1942118537));
	}

	static final void method10930(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_550_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		Class31.method812(i, new Class282_Sub44(i_550_, 3), null, true, (byte) 26);
	}

	static final void method10931(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7224 && !client.aBool7244 ? 1 : 0;
	}

	static final void method10932(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.anInt1380 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1380100089);
	}

	static final void method10933(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class221.anInt2762 * 509550843;
	}

	static void method10934(CS2Script class282_sub50_sub5, int i, CS2Executor class527) {
		class527.anInt7012 = 0;
		class527.anInt7000 = 0;
		class527.instrPtr = 1051529003;
		class527.current = class282_sub50_sub5;
		class527.operations = (class527.current.operations);
		class527.unknown = class527.current.intOpValues;
		CS2OpInfo class522 = null;
		class527.anInt7002 = 0;
		try {
			try {
				anInt5904 = 0;
				for (;;) {
					anInt5904 += -1084131875;
					if (anInt5904 * -1176728971 > i)
						throw new RuntimeException("");
					class522 = (class527.operations[(class527.instrPtr += -1051529003) * 301123709]);
					if (aBool5898 && (null == aString5897 || (((class527.current.scriptName) != null) && class527.current.scriptName.indexOf(aString5897) != -1)))
						System.out.println(new StringBuilder().append(class527.current.scriptName).append(": ").append(class522).toString());
					if (1 == (class527.unknown[301123709 * class527.instrPtr]))
						class527.aBool7022 = true;
					else
						class527.aBool7022 = false;
					if (CS2OpInfo.aClass522_5959 == class522 && 0 == (class527.anInt7002 * -1837903909)) {
						Class282_Sub50_Sub17.method15509(125704179);
						break;
					}
					Class174.executeOperation(class522, class527, -430507223);
				}
			} catch (Exception exception) {
				StringBuilder stringbuilder = new StringBuilder(30);
				stringbuilder.append("").append(-3442165056282524525L * (class527.current.data)).append(" ");
				for (int i_551_ = class527.anInt7002 * -1837903909 - 1; i_551_ >= 0; i_551_--)
					stringbuilder.append("").append(-3442165056282524525L * (((Class509) class527.aClass509Array7016[i_551_]).aClass282_Sub50_Sub5_5869.data)).append(" ");
				stringbuilder.append("").append(Integer.valueOf(-2026890351 * class522.opcode));
				Class151.method2594(stringbuilder.toString(), exception, (byte) -27);
				Class282_Sub50_Sub17.method15509(1533757322);
			}
		} catch (Exception object) {
			Class282_Sub50_Sub17.method15509(1476823476);
			//throw object;
		}
	}

	static final void method10935(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		Class117.method1978((class527.intStack[class527.anInt7012 * 1942118537]), (class527.intStack[1 + (1942118537 * class527.anInt7012)]), (class527.intStack[(1942118537 * class527.anInt7012 + 2)]), (byte) 1);
	}

	static final void method10936(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 38);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 276864765 * class118.anInt1311;
	}

	static final void method10937(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub20_Sub9.method15256(class118, class98, class527, 776039112);
	}

	static final void method10938(CS2Executor class527) {
		String string = null;
		if (null != Class119.aClass12_1461)
			string = Class119.aClass12_1461.method473(1719445645);
		if (null == string)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method10939(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -56249735 * class118.anInt1426;
	}

	static final void method10940(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (-6750871795187943813L * Class116.aLong1259 / 60000L);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) ((Class116.aLong1259 * -6750871795187943813L - Class169.method2869(1868821347) - -1002288734586436517L * Class43.aLong420) / 60000L);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class509.aBool5870 ? 1 : 0;
	}

	static final void method10941(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class15.method542(class118, class98, class527, -1929008587);
	}

	static final void method10942(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class221.anInt2762 * 509550843;
	}

	static final void method10943(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class96_Sub1.anInt8307 * -993852069;
	}

	static final void method10944(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, -268920497) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1400 = Class351.method6193(string, class527, 1140489409);
		class118.aBool1384 = true;
	}

	static final void method10945(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 214125473 * Class440.anInt5357;
	}

	static final void method10946(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 214125473 * Class440.anInt5357;
	}

	static final void method10947(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class464.aBool5556 ? 1 : 0;
	}

	static final void method10948(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1389991275).stackable * 318481945) == 1 ? 1 : 0;
	}

	static final void method10949(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 318997953 * Class504.anInt5832;
	}

	static final void method10950(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1174321703 * Class311.anInt3644;
	}

	static final void method10951(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1775931893 * Class121.anInt1526;
	}

	static final void method10952(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1775931893 * Class121.anInt1526;
	}

	static final void method10953(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1775931893 * Class121.anInt1526;
	}

	static final void method10954(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class354.anInt4112 * -1400898651;
	}

	static final void method10955(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class354.anInt4112 * -1400898651;
	}

	static final void method10956(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class469.aBool5585 ? 1 : 0;
	}

	static final void method10957(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1003441631 * Class232.anInt2879;
	}

	static final void method10958(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1003441631 * Class232.anInt2879;
	}

	static final void method10959(CS2Executor class527) {
		int i = Class96_Sub14.method14641(1080630455);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class233.anInt2880 = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1563612410) * -1499268811) * -638562019;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -104);
		Class190.method3148((byte) 84);
		client.aBool7175 = false;
	}

	static final void method10960(CS2Executor class527) {
		int i = Class96_Sub14.method14641(921744496);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class233.anInt2880 = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-542070243) * -1499268811) * -638562019;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -7);
		Class190.method3148((byte) 76);
		client.aBool7175 = false;
	}

	static final void method10961(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Class169.method2869(2060131701) / 60000L);
	}

	static final void method10962(CS2Executor class527) {
		int i = Class96_Sub14.method14641(868497611);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class233.anInt2880 = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1506236876) * -1499268811) * -638562019;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -58);
		Class190.method3148((byte) 78);
		client.aBool7175 = false;
	}

	static final void method10963(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 39);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1453 * 1762983005;
	}

	static final void method10964(CS2Executor class527) {
		Class86.method1478(-1990742315);
	}

	static final void method10965(CS2Executor class527) {
		Class119.method2077(925063779);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -99);
		Class190.method3148((byte) 97);
		client.aBool7175 = false;
	}

	static final void method10966(CS2Executor class527) {
		Class119.method2077(629564347);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -104);
		Class190.method3148((byte) 37);
		client.aBool7175 = false;
	}

	static final void method10967(CS2Executor class527) {
		Class119.method2077(-106582623);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -61);
		Class190.method3148((byte) 76);
		client.aBool7175 = false;
	}

	static final void method10968(CS2Executor class527) {
		Class282_Sub20_Sub25.method15393(true, 1596813839);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -43);
		Class190.method3148((byte) 76);
		client.aBool7175 = false;
	}

	static final void method10969(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub6_8192), 0, -519967036);
		Class190.method3148((byte) 52);
		client.aBool7175 = false;
	}

	static final void method10970(CS2Executor class527) {
		if (Class233.anInt2880 * -638562019 == 2)
			Class188.aBool2378 = true;
		else if (-638562019 * Class233.anInt2880 == 1)
			Class188.aBool2377 = true;
		else if (Class233.anInt2880 * -638562019 == 3)
			Class188.aBool2372 = true;
	}

	static final void method10971(CS2Executor class527) {
		if (Class233.anInt2880 * -638562019 == 2)
			Class188.aBool2378 = true;
		else if (-638562019 * Class233.anInt2880 == 1)
			Class188.aBool2377 = true;
		else if (Class233.anInt2880 * -638562019 == 3)
			Class188.aBool2372 = true;
	}

	static final void method10972(CS2Executor class527) {
		if (Class233.anInt2880 * -638562019 == 2)
			Class188.aBool2378 = true;
		else if (-638562019 * Class233.anInt2880 == 1)
			Class188.aBool2377 = true;
		else if (Class233.anInt2880 * -638562019 == 3)
			Class188.aBool2372 = true;
	}

	static final void method10973(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class383.method6513(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1593671128), 200, -198255348);
	}

	static final void method10974(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub6_8192.method12654(-239553097);
	}

	static final void method10975(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub6_8192.method12654(-239553097);
	}

	static final void method10976(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub6_8192.method12654(-239553097);
	}

	static final void method10977(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 13);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class455.method7555(class118, class98, class527, (byte) -41);
	}

	static final void method10978(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 59);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class159.method2741(class118, class98, class527, (byte) -63);
	}

	static final void method10979(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_552_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (i != -1) {
			if (i_552_ > 255)
				i_552_ = 255;
			else if (i_552_ < 0)
				i_552_ = 0;
			Class93.method1575(i, i_552_, false, 733762718);
		}
	}

	static final void method10980(CS2Executor class527) {
		int i = (class527.unknown[class527.instrPtr * 301123709]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((NPC) class527.animable).aClass153_10579.method2610(i, (short) 4754);
	}

	static final void method10981(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1378127363 * Class9.anInt106;
	}

	static final void method10982(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub29_8201.method7785(i, -245747389);
	}

	static final void method10983(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i != -1)
			Class92.method1563(i, 1917715893);
	}

	static final void method10984(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		class118.anInt1376 = -280394239 * (class527.intStack[1942118537 * class527.anInt7012]);
		class118.anInt1314 = (1004789833 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]));
		Class109.method1858(class118, (byte) 45);
		if (0 == -2131393857 * class118.anInt1268)
			Class12.method483(class98, class118, false, -2003966792);
	}

	static final void method10985(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub50_Sub17.method15511(class118, class98, class527, (byte) 62);
	}

	static final void method10986(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class47_Sub1.aClass262_9143.method4639("jagtheora", (short) 255) ? 1 : 0);
	}

	static final void method10987(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class47_Sub1.aClass262_9143.method4639("jagtheora", (short) 255) ? 1 : 0);
	}

	static final void method10988(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub7_8210.method7785(i, -1264975789);
	}

	static final void method10989(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class47_Sub1.aClass262_9143.method4639("jagtheora", (short) 255) ? 1 : 0);
	}

	static final void method10990(CS2Executor class527) {
		boolean bool = false;
		if (client.aBool7310) {
			try {
				Object object = (Class361.aClass361_4178.method6254((new Object[] { Integer.valueOf(Class504.anInt5832 * 318997953), (Boolean.valueOf(1 == (Class84.myPlayer.male))), Integer.valueOf(class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) }), (byte) -16));
				if (null != object)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final void method10991(CS2Executor class527) {
		if (client.aBool7310)
			Class361.aClass361_4175.method6257(-1368843701);
	}

	static final void method10992(CS2Executor class527) {
		if (client.aBool7310)
			Class361.aClass361_4175.method6257(512698902);
	}

	static final void method10993(CS2Executor class527) {
		if (client.aBool7310)
			Class361.aClass361_4175.method6257(926613918);
	}

	static final void method10994(CS2Executor class527) {
		if (client.aBool7310)
			Class361.aClass361_4175.method6257(1152056450);
	}

	static final void method10995(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 81);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub17.method14653(class118, class98, class527, -1272483523);
	}

	static final void method10996(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i > 255 || i < 0)
			i = 0;
		if (i != Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -33)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub11_8217), i, -1446337510);
			Class190.method3148((byte) 18);
			client.aBool7175 = false;
		}
	}

	static final void method10997(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_553_ = ((class527.intStack[1942118537 * class527.anInt7012 + 1]) - 1);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 840052410);
		if (-1330791315 * class425.anInt5061 == i_553_)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class425.anInt5062 * 439280359;
		else if (i_553_ == -1576872607 * class425.anInt5030)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class425.anInt5031 * -1516146479;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
	}

	static final void method10998(CS2Executor class527) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		String string_554_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		if ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string_554_;
	}

	static final void method10999(CS2Executor class527) {
		boolean bool = true;
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Object object = Class361.aClass361_4181.method6254(new Object[] { string }, (byte) -11);
				if (object != null)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final void method11000(CS2Executor class527) {
		boolean bool = false;
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Object object = Class361.aClass361_4172.method6254(new Object[] { string }, (byte) 62);
				if (null != object)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final void method11001(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Class361.aClass361_4183.method6254(new Object[] { string }, (byte) -1);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method11002(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Class361.aClass361_4183.method6254(new Object[] { string }, (byte) -27);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method11003(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Class361.aClass361_4183.method6254(new Object[] { string }, (byte) -81);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method11004(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Class361.aClass361_4183.method6254(new Object[] { string }, (byte) 49);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method11005(CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Class361.aClass361_4183.method6254(new Object[] { string }, (byte) 21);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method11006(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12964((byte) 39) ? 1 : 0;
	}

	static final void method11007(CS2Executor class527) {
		if (0 == 1609086245 * client.anInt7434)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1754449153 * client.anInt7373;
	}

	static final void method11008(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 115);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1312 * 682782159;
	}

	static final void method11009(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_555_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		Class282_Sub44 class282_sub44 = (Class282_Sub44) client.aClass465_7442.method7754((long) i);
		if (null != class282_sub44 && 587626901 * class282_sub44.anInt8063 == i_555_)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method11010(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class204.method3365(class118, class98, class527, -521795820);
	}

	static final void method11011(CS2Executor class527) {
		Class492.method8265(0, 0, client.aClass118_7183.anInt1301 * 1506818197, client.aClass118_7183.anInt1429 * -492594917, false, (byte) 24);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1064588657 * client.anInt7188;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 292041583 * client.anInt7440;
	}

	static final void method11012(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12622(1804270865) ? 1 : 0;
	}

	static final void method11013(CS2Executor class527) {
		Class275_Sub7.method12606((byte) 58);
	}

	static final void method11014(CS2Executor class527) {
		if (null == Class308.aShortArray3621 || (Class283.anInt3384 * 1750691703 >= 560339485 * Class415.anInt4985))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = ((Class308.aShortArray3621[(Class283.anInt3384 += 220207687) * 1750691703 - 1]) & 0xffff);
	}

	static final void method11015(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12923(-1656330950) ? 1 : 0;
	}

	static final void method11016(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_556_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.aClass331_3535.method5918(i, -1984200889).aCharArray9748[i_556_]);
	}

	static final void method11017(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub20_8207.method12797((byte) 37) ? 1 : 0;
	}

	static final void method11018(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class217_Sub1 class217_sub1 = ObjectIndexLoader.method7916(i, 2003460175);
		if (null != class217_sub1) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1203083985 * class217_sub1.anInt2700;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7977;
			Class213 class213 = class217_sub1.method13055((short) -5174);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -216896281 * class213.anInt2680;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class213.aString2679;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2701 * 652811625;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt7978 * -129507359;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7976;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method11019(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method12707(-1702292179) && Renderers.SOFTWARE_RENDERER.method8403()) ? 1 : 0;
	}

	static final void method11020(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method12707(394483436) && Renderers.SOFTWARE_RENDERER.method8403()) ? 1 : 0;
	}

	static final void method11021(CS2Executor class527) {
		class527.anInt7000 -= 134906879;
		Class533.method11404((String) (class527.objectStack[class527.anInt7000 * 1806726141]), (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]), (String) (class527.objectStack[2 + 1806726141 * class527.anInt7000]), ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1), true, -94301647);
	}

	static final void method11022(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method12707(-1760251320) && Renderers.SOFTWARE_RENDERER.method8403()) ? 1 : 0;
	}

	static final void method11023(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4566, client.aClass184_7475.aClass432_2283, 2050105813);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i, 1417031095);
		client.aClass184_7475.method3049(class282_sub23, 2034942141);
	}

	static final void method11024(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12761(456348209) ? 1 : 0;
	}

	static final void method11025(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub7_8210.method12665(1126307117) ? 1 : 0;
	}

	static final void method11026(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub30_8194.method13421(635605552) ? 1 : 0;
	}

	static final void method11027(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub30_8194.method13421(635605552) ? 1 : 0;
	}

	static final void method11028(CS2Executor class527) {
		int i = (class527.unknown[301123709 * class527.instrPtr]);
		int i_557_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_557_ < 0 || i_557_ >= class527.globalArrayLengths[i])
			throw new RuntimeException();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.globalArrays[i][i_557_];
	}

	static final void method11029(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class174.method2955(class118, class98, class527, (byte) 0);
	}

	static final void method11030(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method12774((byte) -24) ? 1 : 0;
	}

	static final void method11031(Class118 class118, Class98 class98, CS2Executor class527) {
		class118.aStringArray1352 = null;
	}

	static final void method11032(CS2Executor class527) {
		class527.anInt7012 -= 425673003;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_558_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_559_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		if (i_558_ == -1)
			throw new RuntimeException();
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_558_, (byte) 8);
		if (i != class431.aChar5140)
			throw new RuntimeException();
		int[] is = class431.method7251(Integer.valueOf(i_559_), 2143658735);
		int i_560_ = 0;
		if (null != is)
			i_560_ = is.length;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_560_;
	}

	static final void method11033(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12727(-1141505921) ? 1 : 0;
	}

	static final void method11034(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method7785(i, 494002997);
	}

	static final void method11035(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method7785(i, -239576184);
	}

	static final void method11036(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method7785(i, 600253400);
	}

	static final void method11037(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method7785(i, -1111889732);
	}

	static final void method11038(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub9 class282_sub50_sub9 = IndexLoaders.aClass429_4265.method7214(i, -2122605328);
		if (null == class282_sub50_sub9.anIntArray9624)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub9.anIntArray9624.length;
	}

	static final void method11039(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method7785(i, -1035502699);
	}

	static final void method11040(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method7785(i, -122561711);
	}

	static final void method11041(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method7785(i, 567438546);
	}

	static final void method11042(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method7785(i, -1086972240);
	}

	static final void method11043(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method7785(i, 369723142);
	}

	static final void method11044(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 56);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		NamedFileReference.method869(class118, class98, class527, -2070923638);
	}

	static final void method11045(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method7785(i, 544100250);
	}

	static final void method11046(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 124);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class236.method3983(class118, class98, class527, -878716245);
	}

	static final void method11047(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (!Renderers.SOFTWARE_RENDERER.method8405())
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 3;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = Class393.aClass282_Sub54_4783.aClass468_Sub4_8187.method7785(i, -2030749797);
	}

	static final void method11048(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class125.method2170(class118, class98, class527, 809860903);
	}

	static final void method11049(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 39);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class521_Sub1_Sub4.method14892(class118, class98, class527, (byte) 109);
	}

	static final void method11050(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (!Renderers.SOFTWARE_RENDERER.method8403())
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 3;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method7785(i, -1177397715);
	}

	static final void method11051(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (!Renderers.SOFTWARE_RENDERER.method8403())
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 3;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method7785(i, -612610296);
	}

	static final void method11052(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (!Renderers.SOFTWARE_RENDERER.method8403())
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 3;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method7785(i, -1458084473);
	}

	static final void method11053(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (!Renderers.SOFTWARE_RENDERER.method8403())
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 3;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method7785(i, 413608584);
	}

	static final void method11054(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method7785(i, -770831309);
	}

	static final void method11055(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub7_8210.method7785(i, -695460183);
	}

	static final void method11056(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 53);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		WorldMapAreaDefs.method3738(class118, class98, class527, (byte) -2);
	}

	static final void method11057(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 21);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class15.method542(class118, class98, class527, -1857507286);
	}

	static final void method11058(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte628;
	}

	static final void method11059(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class346.method6158(class118, class98, class527, -1709118421);
	}

	static final void method11060(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub29_8201.method7785(i, -529543254);
	}

	static final void method11061(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method7785(i, -436833830);
	}

	static final void method11062(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method7785(i, 326069468);
	}

	static final void method11063(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method7785(i, 398886525);
	}

	static final void method11064(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method7785(i, 538239104);
	}

	static final void method11065(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method7785(i, -1924067311);
	}

	static final void method11066(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method7785(i, -4470513);
	}

	static final void method11067(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method7785(i, -1697908637);
	}

	static final void method11068(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 55);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.aBool1306 ? 1 : 0;
	}

	static final void method11069(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.animable.anInt10374 * 226532721);
	}

	static final void method11070(CS2Executor class527) {
		Class163 class163 = class527.animable.method15811(-855373631);
		if (null == class163)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class163.method2829(-766550436);
	}

	static final void method11071(CS2Executor class527) {
		Class163 class163 = class527.animable.method15811(92619047);
		if (null == class163)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class163.method2829(-766550436);
	}

	static final void method11072(CS2Executor class527) {
		Class163 class163 = class527.animable.method15811(-466954291);
		if (null == class163)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class163.method2829(-766550436);
	}

	static final void method11073(CS2Executor class527) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = ((Player) class527.animable).method16127(true, 2005212101);
	}

	static final void method11074(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_561_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		UnderlayDefinition class513;
		if (class527.aBool7022)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class513.method8766((class527.animable.aClass98_10324), i, i_561_, (byte) 1) ? 1 : 0;
	}

	static final void method11075(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class457.method7667(class118, class98, class527, 600471682);
	}

	static final void method11076(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class8_Sub2.method14263(i >> 14 & 0x3fff, i & 0x3fff, (byte) 0);
	}

	static final void method11077(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int[] is = Class96_Sub14.method14642(string, class527, 315810046);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1387 = Class351.method6193(string, class527, -517579888);
		class118.anIntArray1402 = is;
		class118.aBool1384 = true;
	}

	static final void method11078(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1176728971 * anInt5904;
	}

	static final void method11079(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		Class455.aShortArray5452[(class527.intStack[(class527.anInt7012 * 1942118537)])] = (short) Class5.method294((class527.intStack[(1 + 1942118537 * (class527.anInt7012))]), (byte) -74);
		IndexLoaders.ITEM_INDEX_LOADER.method7152(-695073634);
		IndexLoaders.ITEM_INDEX_LOADER.method7151((byte) 24);
		IndexLoaders.NPC_INDEX_LOADER.method6831(-1083280039);
		IncomingPacket.method6378(-1538407760);
	}

	static final void method11080(CS2Executor class527) {
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class527.animable);
		NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
		if (null != class409.anIntArray4886)
			class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class409 != null ? 1 : 0;
	}

	static final void method11081(CS2Executor class527) {
		AnimationDefinitions.method11148((class527.animable), (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), -102797832);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method11082(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (null == client.aClass118_7183 ? -1 : -1952846363 * client.aClass118_7183.anInt1287);
	}

	static final void method11083(CS2Executor class527) {
		class527.anInt7012 -= 1560801011;
		Class356[] class356s = Class350_Sub3_Sub1.method15558(-480359629);
		Class353[] class353s = Class483.method8155(152314627);
		Class282_Sub15_Sub3.method15239(class356s[(class527.intStack[class527.anInt7012 * 1942118537])], class353s[(class527.intStack[class527.anInt7012 * 1942118537 + 1])], (class527.intStack[1942118537 * class527.anInt7012 + 2]), (class527.intStack[3 + class527.anInt7012 * 1942118537]),
				(class527.intStack[4 + class527.anInt7012 * 1942118537]), (class527.intStack[5 + class527.anInt7012 * 1942118537]), (class527.intStack[class527.anInt7012 * 1942118537 + 6]), (class527.intStack[class527.anInt7012 * 1942118537 + 7]), (class527.intStack[8 + 1942118537 * class527.anInt7012]),
				(class527.intStack[class527.anInt7012 * 1942118537 + 9]), (class527.intStack[10 + class527.anInt7012 * 1942118537]), (byte) -87);
	}

	static final void method11084(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_562_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_562_, (byte) 0);
		if (class437.method7319(1852396395))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 236612005).method3722(i_562_, class437.aString5335, -379285425);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i, 101917804).method3723(i_562_, -1741480635 * class437.anInt5337, 1942118537));
	}

	static final void method11085(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.animable.method12997(-218366287);
	}

	static final void method11086(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class527.animable);
		int i_563_ = class521_sub1_sub1_sub2_sub2.method16163(i, -1983628184);
		int i_564_ = class521_sub1_sub1_sub2_sub2.method16169(i, (byte) 57);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_563_;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_564_;
	}

	static final void method11087(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class527.animable);
		int i_565_ = class521_sub1_sub1_sub2_sub2.method16163(i, -2086868035);
		int i_566_ = class521_sub1_sub1_sub2_sub2.method16169(i, (byte) 17);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_565_;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_566_;
	}

	static final void method11088(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 276591650) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1278 = Class351.method6193(string, class527, 599417169);
		class118.aBool1384 = true;
	}

	static final void method11089(CS2Executor class527) {
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class527.animable);
		boolean bool = false;
		NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
		if (class409.anIntArray4886 != null)
			class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
		if (class409 != null)
			bool = class409.aBool4893;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final void method11090(CS2Executor class527) {
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class527.animable);
		boolean bool = false;
		NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
		if (class409.anIntArray4886 != null)
			class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
		if (class409 != null)
			bool = class409.aBool4893;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final void method11091(CS2Executor class527) {
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class527.animable);
		boolean bool = false;
		NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
		if (class409.anIntArray4886 != null)
			class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
		if (class409 != null)
			bool = class409.aBool4893;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final void method11092(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i, 1277390893).anInt5047 * 1718037007);
	}

	static final void method11093(Class118 class118, Class98 class98, CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		class118.anInt1311 = 1982656085 * (class527.intStack[1942118537 * class527.anInt7012]);
		if (class118.anInt1311 * 276864765 > (-354780671 * class118.anInt1376 - 1506818197 * class118.anInt1301))
			class118.anInt1311 = (class118.anInt1376 * -2044497835 - -833007751 * class118.anInt1301);
		if (class118.anInt1311 * 276864765 < 0)
			class118.anInt1311 = 0;
		class118.anInt1312 = 771324207 * (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (class118.anInt1312 * 682782159 > class118.anInt1314 * -37350919 - -492594917 * class118.anInt1429)
			class118.anInt1312 = (1980562871 * class118.anInt1314 - class118.anInt1429 * -1716920587);
		if (682782159 * class118.anInt1312 < 0)
			class118.anInt1312 = 0;
		Class109.method1858(class118, (byte) 47);
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class468_Sub12.method12709(-1952846363 * class118.anInt1287, (byte) 16);
	}

	static final void method11094(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass521_Sub1_Sub2_Sub1_7014.method12997(-218366287);
	}

	static final void method11095(Class118 class118, Class98 class98, CS2Executor class527) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1583320353) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1386 = Class351.method6193(string, class527, 1910650493);
		class118.aBool1384 = true;
	}

	static final void method11096(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (-1524615769 * (((NPC) class527.animable).aClass409_10580.anInt4856));
	}

	static final void method11097(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 412083381 * Class468_Sub28.anInt7961;
	}

	static final void method11098(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (client.anInt7162 * 2080273591 == class527.animable.method15794(1515405279)) ? 1 : 0;
	}

	static final void method11099(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (client.anInt7162 * 2080273591 == class527.animable.method15794(-1950745375)) ? 1 : 0;
	}

	static final void method11100(CS2Executor class527) {
		AnimationDefinitions.method11148(((Class521_Sub1) class527.anInterface12_7013), (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), -1659485428);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method11101(CS2Executor class527) {
		class527.anInt7012 -= 283782002;
		int i = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_567_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i + i_567_;
	}

	static final void method11102(CS2Executor class527) {
		AnimationDefinitions.method11148(((Class521_Sub1) class527.anInterface12_7013), (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), 1973174901);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	static final void method11103(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class295.method5291(class118, class98, class527, 1790953059);
	}

	static final void method11104(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 985215637 * class118.anInt1320;
	}

	static final void method11105(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((Class521_Sub1) class527.anInterface12_7013).method12997(-218366287);
	}

	static final void method11106(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aByte7458;
		if (client.aByte7458 != -1)
			client.aByte7458 = (byte) -6;
	}

	static final void method11107(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass521_Sub1_Sub2_Sub1_7014.method12997(-218366287);
	}

	static final void method11108(CS2Executor class527) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 100 == -8084891 * Class291_Sub1.anInt8015 ? 1 : 0;
	}

	static final void method11109(Class521_Sub1 class521_sub1, CS2Executor class527) {
		boolean bool = false;
		int i = 0;
		int i_568_ = 0;
		int i_569_ = 0;
		int i_570_ = 0;
		if (class521_sub1.aClass275_Sub5Array7965 != null) {
			for (int i_571_ = 0; i_571_ < class521_sub1.aClass275_Sub5Array7965.length; i_571_++) {
				Class275_Sub5 class275_sub5 = class521_sub1.aClass275_Sub5Array7965[i_571_];
				if (class275_sub5.aBool7849) {
					int i_572_;
					int i_573_;
					if (class275_sub5.anInt7850 < class275_sub5.anInt7847) {
						i_572_ = (class275_sub5.anInt7850 - class275_sub5.anInt7851);
						i_573_ = (class275_sub5.anInt7851 + class275_sub5.anInt7847);
					} else {
						i_572_ = (class275_sub5.anInt7847 - class275_sub5.anInt7851);
						i_573_ = (class275_sub5.anInt7850 + class275_sub5.anInt7851);
					}
					int i_574_;
					int i_575_;
					if (class275_sub5.anInt7846 < class275_sub5.anInt7848) {
						i_574_ = (class275_sub5.anInt7846 - class275_sub5.anInt7851);
						i_575_ = (class275_sub5.anInt7851 + class275_sub5.anInt7848);
					} else {
						i_574_ = (class275_sub5.anInt7848 - class275_sub5.anInt7851);
						i_575_ = (class275_sub5.anInt7846 + class275_sub5.anInt7851);
					}
					if (!bool || i_572_ < i)
						i = i_572_;
					if (!bool || i_574_ < i_568_)
						i_568_ = i_574_;
					if (!bool || i_573_ > i_569_)
						i_569_ = i_573_;
					if (!bool || i_575_ > i_570_)
						i_570_ = i_575_;
					bool = true;
				}
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_568_;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_569_;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_570_;
	}

	static final void method11110(Class521_Sub1 class521_sub1, CS2Executor class527) {
		boolean bool = false;
		int i = 0;
		int i_576_ = 0;
		int i_577_ = 0;
		int i_578_ = 0;
		if (class521_sub1.aClass275_Sub5Array7965 != null) {
			for (int i_579_ = 0; i_579_ < class521_sub1.aClass275_Sub5Array7965.length; i_579_++) {
				Class275_Sub5 class275_sub5 = class521_sub1.aClass275_Sub5Array7965[i_579_];
				if (class275_sub5.aBool7849) {
					int i_580_;
					int i_581_;
					if (class275_sub5.anInt7850 < class275_sub5.anInt7847) {
						i_580_ = (class275_sub5.anInt7850 - class275_sub5.anInt7851);
						i_581_ = (class275_sub5.anInt7851 + class275_sub5.anInt7847);
					} else {
						i_580_ = (class275_sub5.anInt7847 - class275_sub5.anInt7851);
						i_581_ = (class275_sub5.anInt7850 + class275_sub5.anInt7851);
					}
					int i_582_;
					int i_583_;
					if (class275_sub5.anInt7846 < class275_sub5.anInt7848) {
						i_582_ = (class275_sub5.anInt7846 - class275_sub5.anInt7851);
						i_583_ = (class275_sub5.anInt7851 + class275_sub5.anInt7848);
					} else {
						i_582_ = (class275_sub5.anInt7848 - class275_sub5.anInt7851);
						i_583_ = (class275_sub5.anInt7846 + class275_sub5.anInt7851);
					}
					if (!bool || i_580_ < i)
						i = i_580_;
					if (!bool || i_582_ < i_576_)
						i_576_ = i_582_;
					if (!bool || i_581_ > i_577_)
						i_577_ = i_581_;
					if (!bool || i_583_ > i_578_)
						i_578_ = i_583_;
					bool = true;
				}
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_576_;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_577_;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_578_;
	}

	static final void method11111(CS2Executor class527) {
		Class337.method6018(((Class521_Sub1) class527.anInterface12_7013), class527, 614255135);
	}

	static final void method11112(CS2Executor class527) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub26_8224, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, 366048406);
		Class190.method3148((byte) 105);
		client.aBool7175 = false;
	}

	static final void method11113(CS2Executor class527) {
		Class337.method6018((class527.animable), class527, 513636792);
	}

	static final void method11114(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_584_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		if (string.length() <= 500 && string_584_.length() <= 500)
			Class105.method1804(i, string, string_584_, (byte) -26);
	}

	static final void method11115(CS2Executor class527) {
		if (null != Class113.aClass282_Sub4_1235) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
			class527.aClass282_Sub4_7011 = Class113.aClass282_Sub4_1235;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method11116(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_585_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		if (string.length() <= 500 && string_585_.length() <= 500)
			Class105.method1804(i, string, string_585_, (byte) -100);
	}

	static final void method11117(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 20);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class468_Sub2.method12630(class118, class98, class527, 1465627737);
	}

	static final void method11118(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 59);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class96_Sub17.method14653(class118, class98, class527, -1996389792);
	}

	static void method11119(int i, String string, String string_586_) {
		if (client.aClass184_7475 != null) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4533, client.aClass184_7475.aClass432_2283, 348179729);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((1 + Class234.method3952(string, 1697622745) + Class234.method3952(string_586_, -997493979)), 1417031095);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13070(string_586_, 2144079397);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13070(string, 2116276376);
			client.aClass184_7475.method3049(class282_sub23, 1047468538);
		}
	}

	static void method11120(int i, String string, String string_587_) {
		if (client.aClass184_7475 != null) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4533, client.aClass184_7475.aClass432_2283, -386305808);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((1 + Class234.method3952(string, -657080536) + Class234.method3952(string_587_, 381028337)), 1417031095);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13070(string_587_, 2140601964);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13070(string, 2128795733);
			client.aClass184_7475.method3049(class282_sub23, 1813803597);
		}
	}

	static void method11121(CS2Executor class527) {
		int i = (class527.intStack[1942118537 * class527.anInt7012 - 3]);
		int i_588_ = (class527.intStack[class527.anInt7012 * 1942118537 - 2]);
		int i_589_ = (class527.intStack[1942118537 * class527.anInt7012 - 1]);
		class527.anInt7012 -= 425673003;
		if (i > class527.globalArrayLengths[i_588_])
			throw new RuntimeException();
		if (i > class527.globalArrayLengths[i_589_])
			throw new RuntimeException();
		if (i_588_ == i_589_)
			throw new RuntimeException();
		Class225_Sub5.method13047((class527.globalArrays[i_588_]), (class527.globalArrays[i_589_]), 0, i - 1, (byte) 2);
	}

	static void method11122(CS2Executor class527) {
		int i = (class527.intStack[1942118537 * class527.anInt7012 - 3]);
		int i_590_ = (class527.intStack[class527.anInt7012 * 1942118537 - 2]);
		int i_591_ = (class527.intStack[1942118537 * class527.anInt7012 - 1]);
		class527.anInt7012 -= 425673003;
		if (i > class527.globalArrayLengths[i_590_])
			throw new RuntimeException();
		if (i > class527.globalArrayLengths[i_591_])
			throw new RuntimeException();
		if (i_590_ == i_591_)
			throw new RuntimeException();
		Class225_Sub5.method13047((class527.globalArrays[i_590_]), (class527.globalArrays[i_591_]), 0, i - 1, (byte) 21);
	}

	static final void method11123(CS2Executor class527) {
		int i = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i, (byte) 46);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i >> 16];
		Class453.method7547(class118, class98, class527, -618078190);
	}

	static final void method11124(CS2Executor class527) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class28.method774(class118, class98, class527, -1296322680);
	}

	static final void method11125(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1311 * 276864765;
	}

	static final void method11126(CS2Executor class527, byte i) {
		int i_592_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_592_, (byte) 97);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_592_ >> 16];
		Class82.method1455(class118, class98, class527, -1784890209);
	}

	static Class282_Sub30 method11127(int i, boolean bool, int i_593_) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		return (Class282_Sub30) Class282_Sub30.aClass465_7711.method7754(l);
	}

	static final void method11128(CS2Executor class527, int i) {
		class527.anInt7012 -= 425673003;
		int i_594_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_595_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_596_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(2, i_594_ << 16 | i_595_, i_596_, "", (byte) 10);
	}
}
