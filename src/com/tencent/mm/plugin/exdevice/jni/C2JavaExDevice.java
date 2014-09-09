package com.tencent.mm.plugin.exdevice.jni;

import com.tencent.mm.plugin.exdevice.service.a;
import com.tencent.mm.plugin.exdevice.service.i;

public final class C2JavaExDevice
{
  private static final String TAG = "!56@/B4Tb64lLpLHXwcx366fGukttNA+l3Q84re/s4LIstyFwdYLzMLOjg==";

  public static void C2Java_onStateChange(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    a.b(paramLong, paramInt1, paramInt2, paramInt3);
  }

  public static void C2Java_onTaskEnd(long paramLong, int paramInt1, int paramInt2, String paramString, byte[] paramArrayOfByte)
  {
    a.b(paramLong, paramInt1, paramInt2, paramString);
  }

  public static boolean connect(long paramLong)
  {
    return i.connect(paramLong);
  }

  public static void createSession(long paramLong1, long paramLong2)
  {
    i.createSession(paramLong1, paramLong2);
  }

  public static void destroySession(long paramLong)
  {
    i.destroySession(paramLong);
  }

  public static void onDeviceRequest(long paramLong, short paramShort1, short paramShort2, byte[] paramArrayOfByte, int paramInt)
  {
    a.onDeviceRequest(paramLong, paramShort1, paramShort2, paramArrayOfByte, paramInt);
  }

  public static boolean sendData(long paramLong, byte[] paramArrayOfByte)
  {
    return i.sendData(paramLong, paramArrayOfByte);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.jni.C2JavaExDevice
 * JD-Core Version:    0.6.2
 */