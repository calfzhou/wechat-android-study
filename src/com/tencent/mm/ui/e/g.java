package com.tencent.mm.ui.e;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.tencent.mm.dbsupport.newcursor.l;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.List;

final class g
  implements l
{
  g(f paramf)
  {
  }

  public final void b(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    if ((b.foreground) && (((paramLong > f.a(this.jXU)) && (am.isMainThread())) || ((paramLong > f.b(this.jXU)) && (!am.isMainThread()))))
    {
      Iterator localIterator = f.bbO().iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        str = (String)localIterator.next();
      }
      while ((am.isMainThread()) || (!paramString1.contains(str)));
    }
    while ((paramInt == 2) && (am.isMainThread()) && (paramLong < f.c(this.jXU)))
    {
      String str;
      return;
    }
    if (!f.d(this.jXU))
    {
      this.jXU.y(paramString2, paramLong);
      return;
    }
    z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "mark stop as file is full !");
  }

  public final void iO(String paramString)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(ak.getContext()).edit();
    int i = 1 + PreferenceManager.getDefaultSharedPreferences(ak.getContext()).getInt(paramString, 0);
    localEditor.putInt(paramString, i).commit();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(i);
    z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "db path: %s ,crash count:%d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.g
 * JD-Core Version:    0.6.2
 */