package oicq.wlogin_sdk.c;

public final class e
{
  public static byte[] a(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, paramInt);
    return new a().encrypt(arrayOfByte, paramArrayOfByte2);
  }

  public static byte[] decrypt(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte1, paramInt1, arrayOfByte, 0, paramInt2);
    return new a().decrypt(arrayOfByte, paramArrayOfByte2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.c.e
 * JD-Core Version:    0.6.2
 */