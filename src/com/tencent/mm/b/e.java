package com.tencent.mm.b;

import java.io.InputStream;

public final class e
{
  public static final boolean a(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    while (true)
    {
      boolean bool;
      if (i >= paramInt)
        bool = true;
      int j;
      do
      {
        return bool;
        j = paramInputStream.read(paramArrayOfByte, i + 0, paramInt - i);
        bool = false;
      }
      while (j < 0);
      i += j;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.e
 * JD-Core Version:    0.6.2
 */