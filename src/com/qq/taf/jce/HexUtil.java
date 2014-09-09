package com.qq.taf.jce;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class HexUtil
{
  private static final char[] digits = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  public static final byte[] emptybytes = new byte[0];

  public static String byte2HexStr(byte paramByte)
  {
    char[] arrayOfChar = new char[2];
    arrayOfChar[1] = digits[(paramByte & 0xF)];
    int i = (byte)(paramByte >>> 4);
    arrayOfChar[0] = digits[(i & 0xF)];
    return new String(arrayOfChar);
  }

  public static String bytes2HexStr(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      return null;
    char[] arrayOfChar = new char[2 * paramArrayOfByte.length];
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfByte.length)
        return new String(arrayOfChar);
      int j = paramArrayOfByte[i];
      arrayOfChar[(1 + i * 2)] = digits[(j & 0xF)];
      int k = (byte)(j >>> 4);
      arrayOfChar[(0 + i * 2)] = digits[(k & 0xF)];
    }
  }

  public static byte char2Byte(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9'))
      return (byte)(paramChar - '0');
    if ((paramChar >= 'a') && (paramChar <= 'f'))
      return (byte)(10 + (paramChar - 'a'));
    if ((paramChar >= 'A') && (paramChar <= 'F'))
      return (byte)(10 + (paramChar - 'A'));
    return 0;
  }

  public static byte hexStr2Byte(String paramString)
  {
    byte b = 0;
    if (paramString != null)
    {
      int i = paramString.length();
      b = 0;
      if (i == 1)
        b = char2Byte(paramString.charAt(0));
    }
    return b;
  }

  public static byte[] hexStr2Bytes(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      return emptybytes;
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    for (int i = 0; ; i++)
    {
      if (i >= arrayOfByte.length)
        return arrayOfByte;
      char c1 = paramString.charAt(i * 2);
      char c2 = paramString.charAt(1 + i * 2);
      arrayOfByte[i] = ((byte)(16 * char2Byte(c1) + char2Byte(c2)));
    }
  }

  public static void main(String[] paramArrayOfString)
  {
    try
    {
      byte[] arrayOfByte = "Hello WebSocket World?".getBytes("gbk");
      System.out.println(bytes2HexStr(arrayOfByte));
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.HexUtil
 * JD-Core Version:    0.6.2
 */