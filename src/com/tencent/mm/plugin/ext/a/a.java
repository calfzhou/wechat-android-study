package com.tencent.mm.plugin.ext.a;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public final class a
{
  private static SecretKey eLP = null;
  private static char[] ehw = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };

  private static void Qe()
  {
    try
    {
      if (eLP == null)
      {
        ObjectInputStream localObjectInputStream = new ObjectInputStream(new ByteArrayInputStream(kq("aced00057372001f6a617661782e63727970746f2e737065632e5365637265744b6579537065635b470b66e230614d0200024c0009616c676f726974686d7400124c6a6176612f6c616e672f537472696e673b5b00036b65797400025b427870740003414553757200025b42acf317f8060854e0020000787000000010402a2173bd6f2542e5e71ee414b2e1e8")));
        eLP = (SecretKey)localObjectInputStream.readObject();
        localObjectInputStream.close();
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static String aS(long paramLong)
  {
    byte[] arrayOfByte = encrypt(String.valueOf(paramLong));
    if (arrayOfByte == null)
      return null;
    StringBuilder localStringBuilder = new StringBuilder(2 * arrayOfByte.length);
    for (int i = 0; i < arrayOfByte.length; i++)
    {
      localStringBuilder.append(ehw[((0xF0 & arrayOfByte[i]) >>> 4)]);
      localStringBuilder.append(ehw[(0xF & arrayOfByte[i])]);
    }
    return localStringBuilder.toString();
  }

  private static byte[] encrypt(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    Qe();
    Cipher localCipher = Cipher.getInstance("AES");
    localCipher.init(1, eLP);
    return localCipher.doFinal(paramString.getBytes("UTF8"));
  }

  private static byte[] kq(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    for (int i = 0; i < arrayOfByte.length; i++)
      arrayOfByte[i] = ((byte)Integer.parseInt(paramString.substring(i * 2, 2 + i * 2), 16));
    return arrayOfByte;
  }

  private static String lW(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    Qe();
    Cipher localCipher = Cipher.getInstance("AES");
    localCipher.init(2, eLP);
    return new String(localCipher.doFinal(kq(paramString)), "UTF8");
  }

  public static long lX(String paramString)
  {
    return Long.valueOf(lW(paramString).trim()).longValue();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.a.a
 * JD-Core Version:    0.6.2
 */