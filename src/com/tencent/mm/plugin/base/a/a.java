package com.tencent.mm.plugin.base.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

public final class a
{
  public static final String ehu = ak.getPackageName();
  private static String ehv = "";
  private static char[] ehw = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };

  private static Intent a(Context paramContext, String paramString1, boolean paramBoolean, String paramString2)
  {
    if ((paramString1 == null) || (paramContext == null))
      z.e("!44@/B4Tb64lLpJv3kgS2w9BTA7O/1lmdHaqmVpYXAGd7wk=", "getIntent, wrong parameters");
    Bitmap localBitmap2;
    i locali;
    String str1;
    do
    {
      return null;
      int i = (int)(48.0F * paramContext.getResources().getDisplayMetrics().density);
      Bitmap localBitmap1 = c.a(paramString1, false, -1);
      if (localBitmap1 == null)
        z.e("!44@/B4Tb64lLpJv3kgS2w9BTA7O/1lmdHaqmVpYXAGd7wk=", "getScaledBitmap fail, bmp is null");
      for (localBitmap2 = null; localBitmap2 == null; localBitmap2 = Bitmap.createScaledBitmap(localBitmap1, i, i, false))
      {
        z.e("!44@/B4Tb64lLpJv3kgS2w9BTA7O/1lmdHaqmVpYXAGd7wk=", "no bmp");
        return null;
      }
      locali = bg.qW().oT().ys(paramString1);
      if ((locali == null) || ((int)locali.dhv <= 0))
      {
        z.e("!44@/B4Tb64lLpJv3kgS2w9BTA7O/1lmdHaqmVpYXAGd7wk=", "no such user");
        return null;
      }
      str1 = kp(paramString1);
    }
    while (ch.jb(str1));
    if (paramBoolean);
    for (String str2 = "com.android.launcher.action.INSTALL_SHORTCUT"; ; str2 = "com.android.launcher.action.UNINSTALL_SHORTCUT")
    {
      Intent localIntent1 = new Intent(str2);
      localIntent1.putExtra("android.intent.extra.shortcut.NAME", y.a(locali, paramString1));
      localIntent1.putExtra("duplicate", false);
      Intent localIntent2 = new Intent("com.tencent.mm.action.BIZSHORTCUT");
      localIntent2.putExtra("LauncherUI.Shortcut.Username", str1);
      localIntent2.putExtra("LauncherUI.From.Biz.Shortcut", true);
      localIntent2.addFlags(67108864);
      localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
      localIntent1.putExtra("android.intent.extra.shortcut.ICON", localBitmap2);
      localIntent1.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_SOURCE_KEY", ehu);
      localIntent1.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_OWNER_ID", kp(paramString2));
      localIntent1.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_UNIQUE_ID", str1);
      localIntent1.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_TYPE", s(locali));
      localIntent1.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_CONTAINER", 0);
      return localIntent1;
    }
  }

  private static String ah(String paramString1, String paramString2)
  {
    while (true)
    {
      try
      {
        int[] arrayOfInt = new int[256];
        byte[] arrayOfByte = new byte[256];
        int i = 0;
        if (i < 256)
        {
          arrayOfInt[i] = i;
          i++;
          continue;
          if (j >= 256)
            break label301;
          arrayOfByte[j] = ((byte)paramString2.charAt(j % paramString2.length()));
          j = (short)(j + 1);
          continue;
          if (k < 255)
          {
            m = (m + arrayOfInt[k] + arrayOfByte[k]) % 256;
            int n = arrayOfInt[k];
            arrayOfInt[k] = arrayOfInt[m];
            arrayOfInt[m] = n;
            k++;
            continue;
          }
          char[] arrayOfChar1 = paramString1.toCharArray();
          char[] arrayOfChar2 = new char[arrayOfChar1.length];
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          if (i1 < arrayOfChar1.length)
          {
            i2 = (i2 + 1) % 256;
            i3 = (i3 + arrayOfInt[i2]) % 256;
            int i4 = arrayOfInt[i2];
            arrayOfInt[i2] = arrayOfInt[i3];
            arrayOfInt[i3] = i4;
            int i5 = arrayOfInt[((arrayOfInt[i2] + arrayOfInt[i3] % 256) % 256)];
            arrayOfChar2[i1] = ((char)(arrayOfChar1[i1] ^ (char)i5));
            i1 = (short)(i1 + 1);
            continue;
          }
          String str = new String(arrayOfChar2);
          return str;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        z.e("!44@/B4Tb64lLpJv3kgS2w9BTA7O/1lmdHaqmVpYXAGd7wk=", "Exception in rc4, %s", arrayOfObject);
        return null;
      }
      int j = 0;
      continue;
      label301: int k = 0;
      int m = 0;
    }
  }

  public static String ko(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      paramString = null;
    do
    {
      return paramString;
      if (!bg.oE())
        return null;
    }
    while (!paramString.startsWith("shortcut_"));
    return ah(new String(kq(paramString.substring(9))), bg.qW().oD());
  }

  public static String kp(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    String str;
    do
    {
      do
        return null;
      while (!bg.oE());
      str = ah(paramString, bg.qW().oD());
    }
    while (str == null);
    return "shortcut_" + toHexString(str.getBytes());
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

  public static int s(i parami)
  {
    if (parami.aIg())
      return 2;
    if (!y.dQ(parami.getUsername()))
      return 1;
    return 0;
  }

  private static String toHexString(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    StringBuilder localStringBuilder = new StringBuilder(2 * paramArrayOfByte.length);
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      localStringBuilder.append(ehw[((0xF0 & paramArrayOfByte[i]) >>> 4)]);
      localStringBuilder.append(ehw[(0xF & paramArrayOfByte[i])]);
    }
    return localStringBuilder.toString();
  }

  public static boolean x(Context paramContext, String paramString)
  {
    ehv = x.pG();
    String str = ehv;
    if ((paramContext == null) || (paramString == null))
    {
      z.e("!44@/B4Tb64lLpJv3kgS2w9BTA7O/1lmdHaqmVpYXAGd7wk=", "add fail, invalid argument");
      return true;
    }
    z.d("!44@/B4Tb64lLpJv3kgS2w9BTA7O/1lmdHaqmVpYXAGd7wk=", "add shortcut %s", new Object[] { paramString });
    ehv = str;
    Intent localIntent = a(paramContext, paramString, true, ehv);
    if (localIntent == null)
    {
      z.e("!44@/B4Tb64lLpJv3kgS2w9BTA7O/1lmdHaqmVpYXAGd7wk=", "add fail, intent is null");
      return true;
    }
    paramContext.sendBroadcast(localIntent);
    return true;
  }

  public static boolean y(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null))
    {
      z.e("!44@/B4Tb64lLpJv3kgS2w9BTA7O/1lmdHaqmVpYXAGd7wk=", "remove fail, invalid argument");
      return false;
    }
    ehv = x.pG();
    Intent localIntent = a(paramContext, paramString, false, ehv);
    if (localIntent == null)
    {
      z.e("!44@/B4Tb64lLpJv3kgS2w9BTA7O/1lmdHaqmVpYXAGd7wk=", "remove fail, intent is null");
      return false;
    }
    paramContext.sendBroadcast(localIntent);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.a.a
 * JD-Core Version:    0.6.2
 */