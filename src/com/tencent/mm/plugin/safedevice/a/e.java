package com.tencent.mm.plugin.safedevice.a;

import android.content.Context;
import android.os.Build;
import com.tencent.mm.model.b;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.protocal.a.aed;
import com.tencent.mm.protocal.a.bz;
import com.tencent.mm.protocal.a.cb;
import com.tencent.mm.protocal.a.je;
import com.tencent.mm.protocal.a.nb;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.protocal.a.wu;
import com.tencent.mm.protocal.a.wv;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e
{
  public static void a(vo paramvo)
  {
    if (paramvo == null)
      z.e("!44@/B4Tb64lLpI7vmNKcPQSbpFwH/mUT2FKKzdeVsThZqE=", "null resp");
    nb localnb;
    do
    {
      do
      {
        cb localcb;
        do
        {
          bz localbz;
          do
          {
            return;
            if (!(paramvo instanceof bz))
              break;
            localbz = (bz)paramvo;
          }
          while (localbz == null);
          a(localbz.hRr);
          return;
          if (!(paramvo instanceof cb))
            break;
          localcb = (cb)paramvo;
        }
        while (localcb == null);
        a(localcb.hRr);
        return;
      }
      while (!(paramvo instanceof nb));
      localnb = (nb)paramvo;
    }
    while ((localnb == null) || (localnb.idm == null));
    a(localnb.idm.hRr);
  }

  private static void a(wv paramwv)
  {
    if ((paramwv != null) && (paramwv.hQc != null))
    {
      LinkedList localLinkedList = paramwv.hQc;
      if ((localLinkedList != null) && (localLinkedList.size() >= 0))
      {
        f.afl().afi();
        Iterator localIterator = localLinkedList.iterator();
        while (localIterator.hasNext())
        {
          wu localwu = (wu)localIterator.next();
          f.afl().a(new c(localwu));
        }
      }
    }
  }

  public static String aN(Context paramContext)
  {
    if (paramContext == null)
    {
      if (l.iDv)
        return ak.getContext().getString(n.cbC);
      return ak.getContext().getString(n.cbB);
    }
    if (l.iDv)
      return paramContext.getString(n.cbC);
    return paramContext.getString(n.cbB);
  }

  public static String afj()
  {
    return Build.MANUFACTURER + "-" + Build.MODEL;
  }

  public static void j(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!com.tencent.mm.model.bg.oE());
    int i;
    int j;
    do
    {
      return;
      i = x.pL();
      if (!paramBoolean1)
        break;
      j = i | 0x4000;
      com.tencent.mm.model.bg.qW().oQ().set(40, Integer.valueOf(j));
    }
    while (!paramBoolean2);
    je localje = new je();
    localje.iad = 28;
    if (paramBoolean1);
    for (int k = 1; ; k = 2)
    {
      localje.iae = k;
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(23, localje));
      a.dWp.hT();
      return;
      j = i & 0xFFFFBFFF;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.a.e
 * JD-Core Version:    0.6.2
 */