package com.tencent.mm.sdk.platformtools;

import com.tencent.mm.a.f;
import java.io.File;
import java.security.MessageDigest;

public final class aj
{
  protected static char[] iEt = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  protected static ThreadLocal iEu = new al();

  public static String AN(String paramString)
  {
    byte[] arrayOfByte1 = paramString.getBytes();
    byte[] arrayOfByte2 = ((MessageDigest)iEu.get()).digest(arrayOfByte1);
    int i = arrayOfByte2.length;
    StringBuffer localStringBuffer = new StringBuffer(i * 2);
    int j = i + 0;
    for (int k = 0; k < j; k++)
    {
      int m = arrayOfByte2[k];
      char c1 = iEt[((m & 0xF0) >> 4)];
      char c2 = iEt[(m & 0xF)];
      localStringBuffer.append(c1);
      localStringBuffer.append(c2);
    }
    return localStringBuffer.toString();
  }

  @Deprecated
  public static String k(File paramFile)
  {
    return f.c(paramFile);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.aj
 * JD-Core Version:    0.6.2
 */