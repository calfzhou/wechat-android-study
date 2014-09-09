package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.Process;
import com.tencent.mm.model.bg;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.d;

public final class ak
{
  static long diO = 0L;

  public static void J(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      f("mm_proc_startup", 2);
      return;
    }
    f("push_proc_startup", 1);
  }

  private static String a(String[] paramArrayOfString)
  {
    Object localObject = "";
    int i = 1;
    int j = paramArrayOfString.length;
    int k = 0;
    if (k < j)
    {
      String str1 = paramArrayOfString[k];
      if (i != 0)
        i = 0;
      while (true)
      {
        String str2 = (String)localObject + str1;
        k++;
        localObject = str2;
        break;
        localObject = (String)localObject + "=";
      }
    }
    return localObject;
  }

  private static void ca(String paramString)
  {
    SharedPreferences localSharedPreferences = com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences(paramString, 0);
    String[] arrayOfString = localSharedPreferences.getString("startup_info", "").split("=");
    if ((arrayOfString == null) || (arrayOfString.length == 0))
      return;
    an localan = new an();
    if (localan.ce(arrayOfString[(-1 + arrayOfString.length)]))
    {
      localan.diR = 2;
      arrayOfString[(-1 + arrayOfString.length)] = localan.toString();
    }
    String str = a(arrayOfString);
    z.d("!32@/B4Tb64lLpIUGQfqwvb6Vvq1+gSmGxdU", "uerExit new info %s", new Object[] { str });
    localSharedPreferences.edit().putString("startup_info", str).commit();
  }

  private static void f(String paramString, int paramInt)
  {
    SharedPreferences localSharedPreferences = com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences(paramString, 0);
    String[] arrayOfString = localSharedPreferences.getString("startup_info", "").split("=");
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      an localan2 = new an();
      if (localan2.ce(arrayOfString[(-1 + arrayOfString.length)]))
      {
        localan2.diU = Process.myPid();
        arrayOfString[(-1 + arrayOfString.length)] = localan2.toString();
      }
    }
    an localan1 = new an();
    localan1.diQ = paramInt;
    localan1.diS = Process.myPid();
    localan1.diT = ((int)ch.CL());
    String str1 = a(arrayOfString);
    String str2 = localan1.toString();
    if (str1.length() > 0)
      str2 = str1 + "=" + str2;
    z.d("!32@/B4Tb64lLpIUGQfqwvb6Vvq1+gSmGxdU", "startProc new info %s", new Object[] { str2 });
    localSharedPreferences.edit().putString("startup_info", str2).commit();
  }

  public static void lA()
  {
    ca("mm_proc_startup");
    ca("push_proc_startup");
  }

  public static void lB()
  {
    if ((diO != 0L) && (ch.ad(diO) < 3600000L))
      return;
    int i = ((Integer)bg.qP().get(37, Integer.valueOf(0))).intValue();
    if (a.hrn != i)
    {
      bg.qP().set(37, Integer.valueOf(a.hrn));
      new cm(Looper.getMainLooper()).post(new al(i));
    }
    diO = ch.CN();
    new cm(Looper.getMainLooper()).post(new am());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.ak
 * JD-Core Version:    0.6.2
 */