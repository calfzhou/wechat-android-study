package com.tencent.mm.protocal;

import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;

public final class MMProtocalJni
{
  public static native byte[] aesDecrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  public static native boolean mergeSyncKey(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, PByteArray paramPByteArray);

  public static native boolean pack(byte[] paramArrayOfByte1, PByteArray paramPByteArray, String paramString1, byte[] paramArrayOfByte2, String paramString2, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4);

  public static native boolean rsaPublicEncrypt(byte[] paramArrayOfByte1, PByteArray paramPByteArray, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);

  public static native boolean setClientPackVersion(int paramInt);

  public static native void setIsLite(boolean paramBoolean);

  public static native boolean setProtocalJniLogLevel(int paramInt);

  public static native boolean unpack(PByteArray paramPByteArray1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, PByteArray paramPByteArray2, PInt paramPInt);

  public static native boolean verifySyncKey(byte[] paramArrayOfByte);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.MMProtocalJni
 * JD-Core Version:    0.6.2
 */