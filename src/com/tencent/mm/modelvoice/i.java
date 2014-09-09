package com.tencent.mm.modelvoice;

import com.tencent.mm.pointers.PByteArray;

public final class i
{
  private int ddu;

  public static void release()
  {
    MediaRecorder.Bl();
  }

  public final int a(byte[] paramArrayOfByte, int paramInt1, PByteArray paramPByteArray, int paramInt2)
  {
    if ((!MediaRecorder.b(this.ddu, paramArrayOfByte, paramInt1, paramPByteArray, paramInt2)) || (paramPByteArray.value == null))
      return -1;
    return paramPByteArray.value.length;
  }

  public final boolean eN(int paramInt)
  {
    this.ddu = paramInt;
    return MediaRecorder.Bk();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.i
 * JD-Core Version:    0.6.2
 */