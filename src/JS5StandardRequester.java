
/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class JS5StandardRequester {
	Class477 aClass477_3645;
	static final int anInt3646 = 50;
	RsByteBuffer aClass282_Sub35_3647;
	long aLong3648;
	static final int anInt3649 = 20;
	public volatile int anInt3650;
	Class477 aClass477_3651;
	Class477 aClass477_3652 = new Class477();
	int anInt3653;
	Class477 aClass477_3654;
	RsByteBuffer aClass282_Sub35_3655;
	byte aByte3656;
	public volatile int anInt3657;
	static final int anInt3658 = 3;
	static final int anInt3659 = 512;
	Class282_Sub50_Sub11_Sub1 aClass282_Sub50_Sub11_Sub1_3660;

	public abstract void method5514();

	Class282_Sub50_Sub11_Sub1 method5515(int i, int i_0_, byte i_1_, boolean bool, byte i_2_) {
		long l = ((long) i << 32) + (long) i_0_;
		Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = new Class282_Sub50_Sub11_Sub1();
		class282_sub50_sub11_sub1.aLong8120 = 5418180015864004923L * l;
		((Class282_Sub50_Sub11_Sub1) class282_sub50_sub11_sub1).aByte10376 = i_1_;
		((Class282_Sub50_Sub11_Sub1) class282_sub50_sub11_sub1).aBool9637 = bool;
		if (bool) {
			if (method5553((short) 22331) >= 50)
				throw new RuntimeException();
			((JS5StandardRequester) this).aClass477_3652.method7936(class282_sub50_sub11_sub1, -1738910950);
		} else {
			if (method5518(-1983883069) >= 20)
				throw new RuntimeException();
			((JS5StandardRequester) this).aClass477_3651.method7936(class282_sub50_sub11_sub1, -1738910950);
		}
		return class282_sub50_sub11_sub1;
	}

	boolean method5516(int i) {
		return method5518(-1727956644) >= 20;
	}

	boolean method5517(int i) {
		return method5553((short) 24755) >= 50;
	}

	int method5518(int i) {
		return (((JS5StandardRequester) this).aClass477_3651.method7939(-1975244786) + ((JS5StandardRequester) this).aClass477_3654.method7939(431574855));
	}

	boolean method5519() {
		return method5553((short) 32767) >= 50;
	}

	abstract void method5520(byte i);

	public abstract boolean method5521(byte i);

	public abstract void method5522(Object object, boolean bool, int i);

	public abstract void method5523(boolean bool, byte i);

	public abstract boolean method5524();

	public abstract void method5525(int i);

	public abstract void method5526(int i);

	public abstract void method5527();

	public abstract void method5528();

	boolean method5529() {
		return method5518(-1700709774) >= 20;
	}

	public abstract void method5530();

	boolean method5531() {
		return method5553((short) 25005) >= 50;
	}

	public abstract void method5532();

	int method5533() {
		return (((JS5StandardRequester) this).aClass477_3651.method7939(-1833157623) + ((JS5StandardRequester) this).aClass477_3654.method7939(1052580148));
	}

	int method5534() {
		return (((JS5StandardRequester) this).aClass477_3651.method7939(-736499075) + ((JS5StandardRequester) this).aClass477_3654.method7939(778707133));
	}

	public int method5535() {
		return (((JS5StandardRequester) this).aClass477_3652.method7939(-2132459517) + ((JS5StandardRequester) this).aClass477_3645.method7939(-1042231454));
	}

	public int method5536() {
		return (((JS5StandardRequester) this).aClass477_3652.method7939(-87712776) + ((JS5StandardRequester) this).aClass477_3645.method7939(-4797720));
	}

	public abstract void method5537();

	abstract void method5538();

	abstract void method5539();

	abstract void method5540();

	public int method5541() {
		return (((JS5StandardRequester) this).aClass477_3652.method7939(-2034520370) + ((JS5StandardRequester) this).aClass477_3645.method7939(-1464928681));
	}

	public abstract boolean method5542();

	public abstract void method5543(byte i);

	public abstract void method5544(Object object, boolean bool);

	public abstract void method5545(Object object, boolean bool);

	public abstract void method5546(boolean bool);

	public abstract void method5547();

	public abstract void method5548();

	public abstract void method5549();

	JS5StandardRequester() {
		((JS5StandardRequester) this).aClass477_3645 = new Class477();
		((JS5StandardRequester) this).aClass477_3651 = new Class477();
		((JS5StandardRequester) this).aClass477_3654 = new Class477();
		((JS5StandardRequester) this).aClass282_Sub35_3655 = new RsByteBuffer(6);
		((JS5StandardRequester) this).aByte3656 = (byte) 0;
		anInt3657 = 0;
		anInt3650 = 0;
		((JS5StandardRequester) this).aClass282_Sub35_3647 = new RsByteBuffer(10);
	}

	public abstract void method5550();

	boolean method5551() {
		return method5553((short) 26572) >= 50;
	}

	public abstract void method5552();

	public int method5553(short i) {
		return (((JS5StandardRequester) this).aClass477_3652.method7939(946484951) + ((JS5StandardRequester) this).aClass477_3645.method7939(1256746547));
	}

	public abstract void method5554();

	Class282_Sub50_Sub11_Sub1 method5555(int i, int i_3_, byte i_4_, boolean bool) {
		long l = ((long) i << 32) + (long) i_3_;
		Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = new Class282_Sub50_Sub11_Sub1();
		class282_sub50_sub11_sub1.aLong8120 = 5418180015864004923L * l;
		((Class282_Sub50_Sub11_Sub1) class282_sub50_sub11_sub1).aByte10376 = i_4_;
		((Class282_Sub50_Sub11_Sub1) class282_sub50_sub11_sub1).aBool9637 = bool;
		if (bool) {
			if (method5553((short) 12213) >= 50)
				throw new RuntimeException();
			((JS5StandardRequester) this).aClass477_3652.method7936(class282_sub50_sub11_sub1, -1738910950);
		} else {
			if (method5518(-1770923873) >= 20)
				throw new RuntimeException();
			((JS5StandardRequester) this).aClass477_3651.method7936(class282_sub50_sub11_sub1, -1738910950);
		}
		return class282_sub50_sub11_sub1;
	}

	boolean method5556() {
		return method5518(-1507782793) >= 20;
	}

	public abstract boolean method5557();

	public static final void method5558(int i) {
		Class9.loginStage = -469549710;
		Class9.anInt106 = 278796630;
		Class9.anInt72 = 1604822550;
	}

	public static void method5559(Index class317, int i) {
		Class347.aClass317_4053 = class317;
	}

	public static void method5560(RsByteBuffer stream) {
		ReflectionCheck check = new ReflectionCheck();
		check.numChecks = stream.readUnsignedByte() * 1029882891;
		check.id = stream.readInt() * 1339438983;
		check.types = (new int[check.numChecks * -286349405]);
		check.returnCodes = (new int[-286349405 * check.numChecks]);
		check.fields = (new Field[-286349405 * check.numChecks]);
		check.values = (new int[-286349405 * check.numChecks]);
		check.methods = (new Method[-286349405 * check.numChecks]);
		check.aByteArrayArrayArray8041 = (new byte[check.numChecks * -286349405][][]);
		for (int i = 0; i < check.numChecks * -286349405; i++) {
			try {
				int type = stream.readUnsignedByte();
				if (type == 0 || 1 == type || type == 2) {
					String className = stream.readString();
					String fieldName = stream.readString();
					int value = 0;
					if (1 == type)
						value = stream.readInt();
					check.types[i] = type;
					check.values[i] = value;
					if (Class148.getClassType(className, (short) 15152).getClassLoader() == null)
						throw new SecurityException();
					check.fields[i] = Class148.getClassType(className, (short) 8812).getDeclaredField(fieldName);
				} else if (3 == type || 4 == type) {
					String className = stream.readString();
					String methodName = stream.readString();
					int paramCount = stream.readUnsignedByte();
					String[] params = new String[paramCount];
					for (int paramIdx = 0; paramIdx < paramCount; paramIdx++)
						params[paramIdx] = stream.readString();
					String returnType = stream.readString();
					byte[][] is = new byte[paramCount][];
					if (3 == type) {
						for (int i_14_ = 0; i_14_ < paramCount; i_14_++) {
							int i_15_ = stream.readInt();
							is[i_14_] = new byte[i_15_];
							stream.readBytes(is[i_14_], 0, i_15_, 1724620794);
						}
					}
					check.types[i] = type;
					Class[] paramClasses = new Class[paramCount];
					for (int i_16_ = 0; i_16_ < paramCount; i_16_++)
						paramClasses[i_16_] = Class148.getClassType(params[i_16_], (short) 32325);
					Class returnTypeClass = Class148.getClassType(returnType, (short) 26273);
					if (Class148.getClassType(className, (short) 12990).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class148.getClassType(className, (short) 12676).getDeclaredMethods();
					Method[] methods_17_ = methods;
					for (int i_18_ = 0; i_18_ < methods_17_.length; i_18_++) {
						Method method = methods_17_[i_18_];
						if (method.getName().equals(methodName)) {
							Class[] paramTypes = method.getParameterTypes();
							if (paramClasses.length == paramTypes.length) {
								boolean bool = true;
								for (int i_20_ = 0; i_20_ < paramClasses.length; i_20_++) {
									if (paramClasses[i_20_] != paramTypes[i_20_]) {
										bool = false;
										break;
									}
								}
								if (bool && returnTypeClass == method.getReturnType())
									check.methods[i] = method;
							}
						}
					}
					check.aByteArrayArrayArray8041[i] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				check.returnCodes[i] = -1;
			} catch (SecurityException securityexception) {
				check.returnCodes[i] = -2;
			} catch (NullPointerException nullpointerexception) {
				check.returnCodes[i] = -3;
			} catch (Exception exception) {
				check.returnCodes[i] = -4;
			} catch (Throwable throwable) {
				check.returnCodes[i] = -5;
			}
		}
		Class435.aClass482_5332.append(check, 1226152090);
	}
}
