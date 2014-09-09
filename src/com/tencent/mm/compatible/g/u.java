package com.tencent.mm.compatible.g;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.ch;

public final class u
{
  public static String cJ(String paramString)
  {
    if (paramString == null);
    do
    {
      do
      {
        do
          return paramString;
        while ((v.dNG.dMI == 2) || (v.dNG.dMV == 1));
        if (v.dNG.dMI != 1)
          break;
      }
      while (!paramString.toString().contains("\n"));
      return paramString.toString().replace("\n", " ");
    }
    while ((Build.VERSION.SDK_INT != 16) || (!paramString.toString().contains("\n")) || (ch.Y(Build.MANUFACTURER, "").toLowerCase().indexOf("meizu".toLowerCase()) >= 0));
    return paramString.toString().replace("\n", " ");
  }

  public static CharSequence n(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    do
    {
      do
      {
        do
          return paramCharSequence;
        while ((v.dNG.dMI == 2) || (v.dNG.dMV == 1));
        if (v.dNG.dMI != 1)
          break;
      }
      while (!paramCharSequence.toString().contains("\n"));
      return paramCharSequence.toString().replace("\n", "                                                                                                                                                                                                                                                                                                                        ");
    }
    while ((Build.VERSION.SDK_INT != 16) || (!paramCharSequence.toString().contains("\n")) || (ch.Y(Build.MANUFACTURER, "").toLowerCase().indexOf("meizu".toLowerCase()) >= 0));
    return paramCharSequence.toString().replace("\n", "                                                                                                                                                                                                                                                                                                                        ");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.u
 * JD-Core Version:    0.6.2
 */