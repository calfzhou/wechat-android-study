package com.tencent.mm.a;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class b
{
  private Cipher cFa;
  private Cipher cFb;

  public b(String paramString)
  {
    try
    {
      DESKeySpec localDESKeySpec = new DESKeySpec(paramString.getBytes("UTF8"));
      SecretKey localSecretKey = SecretKeyFactory.getInstance("DES").generateSecret(localDESKeySpec);
      IvParameterSpec localIvParameterSpec = new IvParameterSpec("manifest".getBytes("UTF8"));
      this.cFa = Cipher.getInstance("DES/CBC/PKCS5Padding");
      this.cFa.init(1, localSecretKey, localIvParameterSpec);
      this.cFb = Cipher.getInstance("DES/CBC/PKCS5Padding");
      this.cFb.init(2, localSecretKey, localIvParameterSpec);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final String aa(String paramString)
  {
    try
    {
      byte[] arrayOfByte = Base64.decode(paramString, 0);
      String str = new String(this.cFb.doFinal(arrayOfByte), "UTF8");
      return str;
    }
    catch (Exception localException)
    {
      return "[des]" + paramString + "|" + localException.toString();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.b
 * JD-Core Version:    0.6.2
 */