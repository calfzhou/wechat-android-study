package com.tencent.mm.plugin.exdevice.jni;

import com.tencent.mm.compatible.g.o;
import com.tencent.mm.sdk.a;

public final class Java2CExDevice
{
  static
  {
    o.a(a.iCX, Java2CExDevice.class.getClassLoader());
    onCreate();
    initBluetoothAccessoryLib();
  }

  public static native void closeBluetoothAccessoryLib();

  public static native int createChannel(long paramLong, Java2CExDevice.LongWrapper paramLongWrapper);

  public static native void destroyChannel(long paramLong);

  public static native void initBluetoothAccessoryLib();

  public static native void onBluetoothConnected(long paramLong);

  public static native void onBluetoothDisconnected(long paramLong);

  public static native void onBluetoothError(long paramLong, int paramInt);

  public static native void onBluetoothRecvData(long paramLong, byte[] paramArrayOfByte);

  public static native void onBluetoothSendDataCompleted(long paramLong);

  public static native void onBluetoothSessionCreated(long paramLong1, long paramLong2, long paramLong3);

  public static native void onCreate();

  public static native void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte);

  public static native int startChannelService(long paramLong);

  public static native int startTask(long paramLong, short paramShort, Java2CExDevice.AccessoryCmd paramAccessoryCmd, byte[] paramArrayOfByte);

  public static native void stopChannelService(long paramLong);

  public static native void stopTask(long paramLong);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.jni.Java2CExDevice
 * JD-Core Version:    0.6.2
 */