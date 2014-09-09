package com.tencent.mm.model;

import com.tencent.mm.sdk.platformtools.ch;

final class ct
{
  public static boolean B(String paramString1, String paramString2)
  {
    if (ch.jb(paramString1));
    String str;
    do
    {
      return true;
      str = decode(encode(paramString1));
    }
    while ((ch.jb(str)) || (!str.equals(paramString2)));
    return false;
  }

  private static String decode(String paramString)
  {
    Object localObject;
    if ((ch.jb(paramString)) || (paramString.length() % 2 != 0))
      localObject = "";
    while (true)
    {
      return localObject;
      localObject = "";
      int i = 0;
      try
      {
        while (i < paramString.length())
        {
          String str = (String)localObject + (char)Integer.parseInt(paramString.substring(i, i + 2), 16);
          i += 2;
          localObject = str;
        }
      }
      catch (Exception localException)
      {
      }
    }
    return "";
  }

  private static String encode(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    Object localObject;
    try
    {
      int i = arrayOfChar.length;
      localObject = "";
      int j = 0;
      while (j < i)
      {
        int k = arrayOfChar[j];
        StringBuilder localStringBuilder = new StringBuilder().append((String)localObject);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(k);
        String str = String.format("%02x", arrayOfObject);
        j++;
        localObject = str;
      }
    }
    catch (Exception localException)
    {
      localObject = "";
    }
    return localObject;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ct
 * JD-Core Version:    0.6.2
 */