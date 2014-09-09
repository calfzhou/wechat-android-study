package com.tencent.mm.platformtools;

import java.io.UnsupportedEncodingException;

public class SpellMap
{
  public static String j(char paramChar)
  {
    int i = k(paramChar);
    String str2;
    if (i < 65536)
    {
      str2 = String.valueOf(paramChar);
      return str2;
    }
    int j = i >> 16;
    int k = i & 0xFF;
    String str1;
    if ((j < 129) || (j > 253))
      str1 = null;
    String[] arrayOfString;
    while (true)
    {
      str2 = null;
      if (str1 == null)
        break;
      arrayOfString = str1.split(",");
      if ((arrayOfString != null) && (arrayOfString.length >= 2))
        break label116;
      return str1;
      if ((k < 63) || (k > 254))
        str1 = null;
      else
        str1 = spellGetJni(j - 129, k - 63);
    }
    label116: return arrayOfString[0];
  }

  private static int k(char paramChar)
  {
    if (paramChar <= '')
      return paramChar;
    byte[] arrayOfByte;
    try
    {
      arrayOfByte = String.valueOf(paramChar).getBytes("GBK");
      if ((arrayOfByte == null) || (arrayOfByte.length > 2) || (arrayOfByte.length <= 0))
        return 0;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return 0;
    }
    if (arrayOfByte.length == 1)
      return arrayOfByte[0];
    if (arrayOfByte.length == 2)
      return (256 + arrayOfByte[0] << 16) + (256 + arrayOfByte[1]);
    return 0;
  }

  public static native String spellGetJni(int paramInt1, int paramInt2);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.SpellMap
 * JD-Core Version:    0.6.2
 */