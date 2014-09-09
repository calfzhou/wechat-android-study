package com.tencent.mm.sandbox.monitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.a.k;
import com.tencent.mm.a.m;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class a
{
  private static int Az(String paramString)
  {
    String str1 = com.tencent.mm.storage.h.dgF + "crash/" + paramString + ".crashini";
    long l1 = ch.a(g.X(str1, "count"));
    long l2 = ch.a(g.X(str1, "lasttime"));
    long l3 = ch.CM() - l2;
    String str2 = com.tencent.mm.storage.h.dgF + "crash/" + paramString + ".crashlog";
    int i = c.ab(str2);
    z.d("!32@/B4Tb64lLpJJjWiGupgZbcuzfFJRKwOo", "dkcrash count:" + l1 + " t:" + l3 + " len:" + i);
    byte[] arrayOfByte1 = c.b(str2, 0, -1);
    if (!ch.B(arrayOfByte1))
    {
      int j = arrayOfByte1.length;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(com.tencent.mm.protocal.a.hrn);
      arrayOfObject[1] = Integer.valueOf(j);
      String str3 = f.d(String.format("weixin#$()%d%d", arrayOfObject).getBytes()).toLowerCase();
      byte[] arrayOfByte2 = m.f(arrayOfByte1);
      PByteArray localPByteArray = new PByteArray();
      com.tencent.mm.a.a.a(localPByteArray, arrayOfByte2, str3.getBytes());
      new Thread(new b(j, str3, paramString, localPByteArray), "crashupload").start();
    }
    c.deleteFile(str2);
    g.d(str1, "count", 0);
    g.b(str1, "lasttime", ch.CM());
    return 1;
  }

  public static int a(String paramString, e parame)
  {
    if (ch.jb(parame.toString()))
      return -1;
    File localFile = new File(com.tencent.mm.storage.h.dgF + "crash/");
    if (!localFile.exists())
      localFile.mkdir();
    String str1 = com.tencent.mm.storage.h.dgF + "crash/" + paramString + ".crashini";
    g.b(str1, "count", 1L + ch.a(g.X(str1, "count")));
    if (ch.a(g.X(str1, "lasttime")) == 0L)
      g.b(str1, "lasttime", ch.CM());
    String str2 = com.tencent.mm.storage.h.dgF + "crash/" + paramString + ".crashlog";
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = str2;
    arrayOfObject[1] = Integer.valueOf(parame.toString().length());
    z.d("!32@/B4Tb64lLpJJjWiGupgZbcuzfFJRKwOo", "crash:[%s] len:[%d]", arrayOfObject);
    a(parame);
    b(str2, parame);
    return Az(paramString);
  }

  private static void a(e parame)
  {
    File localFile1 = new File(com.tencent.mm.compatible.g.h.dOR);
    if (!localFile1.exists())
      localFile1.mkdirs();
    File[] arrayOfFile = localFile1.listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
      {
        File localFile2 = arrayOfFile[j];
        if (ch.ac(localFile2.lastModified()) > 604800000L)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = localFile2.getPath();
          z.i("!32@/B4Tb64lLpJJjWiGupgZbcuzfFJRKwOo", "dealWithSdcardCrash del old file: %s", arrayOfObject);
          localFile2.delete();
        }
      }
    }
    Date localDate = new Date();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    String str = com.tencent.mm.compatible.g.h.dOR + "crash_" + localSimpleDateFormat.format(localDate) + ".txt";
    z.i("!32@/B4Tb64lLpJJjWiGupgZbcuzfFJRKwOo", "dealWithSdcardCrash %s", new Object[] { str });
    b(str, parame);
  }

  public static int aMs()
  {
    File localFile = new File(com.tencent.mm.storage.h.dgF + "crash/");
    if (!localFile.exists())
      z.w("!32@/B4Tb64lLpJJjWiGupgZbcuzfFJRKwOo", "dkcrash checkUpload dir never create ?");
    String[] arrayOfString1;
    do
    {
      return -1;
      if (localFile.isFile())
      {
        localFile.delete();
        z.w("!32@/B4Tb64lLpJJjWiGupgZbcuzfFJRKwOo", "dkcrash is the fucking file ??");
        return -1;
      }
      arrayOfString1 = localFile.list();
    }
    while ((arrayOfString1 == null) || (arrayOfString1.length == 0));
    for (int i = 0; i < arrayOfString1.length; i++)
      if (arrayOfString1[i].endsWith(".crashlog"))
      {
        String[] arrayOfString2 = arrayOfString1[i].split(".crashlog");
        if ((arrayOfString2 != null) && (arrayOfString2.length > 0))
          Az(arrayOfString2[0]);
      }
    return 1;
  }

  private static void b(String paramString, e parame)
  {
    int i;
    StringBuilder localStringBuilder;
    if (!new File(paramString).exists())
    {
      i = ak.getContext().getSharedPreferences("system_config_prefs", 0).getInt("default_uin", 0);
      localStringBuilder = new StringBuilder();
      if (i != 0)
        break label331;
      String str1 = ch.bH(ak.getContext());
      if (ch.jb(str1))
        break label256;
      localStringBuilder.append("uin[" + str1 + "] ");
    }
    while (true)
    {
      localStringBuilder.append(z.aGY());
      localStringBuilder.append(" BRAND:[" + Build.BRAND + "] ");
      String[] arrayOfString = v.nm();
      localStringBuilder.append("c1[" + arrayOfString[0] + "] ");
      localStringBuilder.append("c2[" + arrayOfString[1] + "] ");
      localStringBuilder.append("\n");
      c.a(paramString, localStringBuilder.toString().getBytes());
      c.a(paramString, (parame.toString() + "\n").getBytes());
      return;
      label256: String str2 = Build.DEVICE + Build.FINGERPRINT + Build.MANUFACTURER + Build.MODEL;
      localStringBuilder.append("uin[" + Integer.toString(str2.hashCode()) + "] ");
      continue;
      label331: localStringBuilder.append("uin[" + k.getString(i) + "] ");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.a
 * JD-Core Version:    0.6.2
 */