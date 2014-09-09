package com.tencent.mm.modelstat;

import com.tencent.mm.at.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.r;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.j;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.xlog.LogLogicJni;
import com.tencent.mm.xlog.Xlog;
import java.util.Map;

public final class g extends com.tencent.mm.network.a.d
  implements j
{
  public static void b(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (!bg.oE())
      return;
    switch (paramInt1)
    {
    case 6:
    case 7:
    default:
      return;
    case 4:
      z.d("!44@/B4Tb64lLpKaLNAssnLXZmvmu982H1218xe3O5Y7Acg=", "recv bytes flow:" + paramInt3);
      if (paramBoolean)
      {
        k.i(paramInt3, 0, paramInt2);
        return;
      }
    case 5:
      z.d("!44@/B4Tb64lLpKaLNAssnLXZmvmu982H1218xe3O5Y7Acg=", "send bytes flow:" + paramInt3);
      if (paramBoolean)
      {
        k.i(0, paramInt3, paramInt2);
        return;
      }
      k.j(0, paramInt3, paramInt2);
      return;
      k.j(paramInt3, 0, paramInt2);
      return;
    case 8:
    }
    as.AO("dns_failed_report");
  }

  public final com.tencent.mm.o.k a(q paramq)
  {
    if (!bg.oE())
      z.e("!44@/B4Tb64lLpKaLNAssnLXZmvmu982H1218xe3O5Y7Acg=", "skip ipxx stat while account not set");
    String str1;
    Map localMap;
    do
    {
      do
      {
        return null;
        str1 = paramq.hOS.getString();
        z.d("!44@/B4Tb64lLpKaLNAssnLXZmvmu982H1218xe3O5Y7Acg=", "onPreAddMessage %s", new Object[] { str1 });
      }
      while (ch.jb(str1));
      z.appenderFlush();
      localMap = x.bB(str1, "cmd");
    }
    while (localMap == null);
    int i = ch.getInt((String)localMap.get(".cmd.upwd.$timespan"), -1);
    if (i > 0)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(i);
      z.d("!44@/B4Tb64lLpKaLNAssnLXZmvmu982H1218xe3O5Y7Acg=", "try upload watchdog timespan:%d", arrayOfObject3);
      WatchDogPushReceiver.Ar();
      WatchDogPushReceiver.eD(i);
      return null;
    }
    int j = ch.getInt((String)localMap.get(".cmd.trace.$code"), -1);
    if (j > 0)
    {
      String str3 = (String)localMap.get(".cmd.trace.$class");
      int n = ch.getInt((String)localMap.get(".cmd.trace.$size"), 0);
      int i1 = ch.getInt((String)localMap.get(".cmd.trace.$type"), 0);
      com.tencent.mm.at.d.aNZ().c(new com.tencent.mm.at.h(str3, j, n, i1));
      return null;
    }
    int k = ch.getInt((String)localMap.get(".cmd.hprof.$type"), -1);
    if (k > 0)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(k);
      z.d("!44@/B4Tb64lLpKaLNAssnLXZmvmu982H1218xe3O5Y7Acg=", "hprof type: %d", arrayOfObject2);
      b.oy(k);
      return null;
    }
    bg.qX().rk().fl(str1);
    LogLogicJni.initLogInfo();
    MMProtocalJni.setProtocalJniLogLevel(new Xlog().getLogLevel());
    int m = ch.getInt((String)localMap.get(".cmd.updzh.$pt"), -1);
    String str2 = (String)localMap.get(".cmd.updzh.$pd");
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(m);
    arrayOfObject1[1] = str2;
    z.d("!44@/B4Tb64lLpKaLNAssnLXZmvmu982H1218xe3O5Y7Acg=", "StackReportUploader pt:%d pd:%s", arrayOfObject1);
    bg.qQ().n(new h(this, m, str2));
    return null;
  }

  public final void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, boolean paramBoolean)
  {
    bg.qQ().n(new i(this, paramInt1, paramInt2, paramString1, paramInt3, paramString2, paramBoolean));
  }

  public final void d(ar paramar)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.g
 * JD-Core Version:    0.6.2
 */