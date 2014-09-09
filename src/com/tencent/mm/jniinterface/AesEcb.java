package com.tencent.mm.jniinterface;

public class AesEcb
{
  public static native byte[] aesCryptEcb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, boolean paramBoolean1, boolean paramBoolean2);

  public static native void test();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jniinterface.AesEcb
 * JD-Core Version:    0.6.2
 */