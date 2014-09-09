package com.tencent.mm.ak;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.FileInputStream;

public final class p
{
  public static boolean hS(String paramString)
  {
    z.d("!32@/B4Tb64lLpIFgWsnmr7FZpv2lTcZtbeJ", " filepath " + paramString);
    if (ch.jb(paramString));
    while (true)
    {
      return false;
      try
      {
        FileInputStream localFileInputStream = new FileInputStream(paramString);
        byte[] arrayOfByte = new byte[10];
        localFileInputStream.read(arrayOfByte, 0, 10);
        String str = x(arrayOfByte).toUpperCase();
        localFileInputStream.close();
        z.d("!32@/B4Tb64lLpIFgWsnmr7FZpv2lTcZtbeJ", "file type " + str);
        if (str.contains("00000014667479707174"))
        {
          z.d("!32@/B4Tb64lLpIFgWsnmr7FZpv2lTcZtbeJ", "file type qt ");
          return true;
        }
      }
      catch (Exception localException)
      {
      }
    }
    return false;
  }

  private static String x(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < 10; i++)
    {
      String str = Integer.toHexString(0xFF & paramArrayOfByte[i]);
      if (str.length() < 2)
        localStringBuilder.append(0);
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.p
 * JD-Core Version:    0.6.2
 */