package com.tencent.mm.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import com.tencent.mm.c.a.fj;
import com.tencent.mm.f.c;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.protocal.j;
import com.tencent.mm.sandbox.updater.Updater;
import com.tencent.mm.sandbox.updater.an;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.aa;

public final class dm
{
  static ProgressDialog dWT = null;
  static SecurityImage iMR = null;

  public static aa a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent, String paramString)
  {
    if (paramInt1 != 4)
      return null;
    z.d("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "errType = " + paramInt1 + " errCode = " + paramInt2);
    switch (paramInt2)
    {
    default:
      return null;
    case -205:
    case -72:
    case -9:
    case -4:
    case -3:
      z.e("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "account expired=" + paramInt2);
      return com.tencent.mm.ui.base.e.a(paramActivity, n.bRa, n.buo, new dq(paramIntent, paramActivity));
    case -100:
      z.e("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "account expired=" + paramInt2);
      com.tencent.mm.c.a.l locall = new com.tencent.mm.c.a.l();
      com.tencent.mm.sdk.c.a.aGB().g(locall);
      fj localfj = new fj();
      localfj.cKH.status = 0;
      localfj.cKH.cKI = 1;
      com.tencent.mm.sdk.c.a.aGB().g(localfj);
      if (TextUtils.isEmpty(j.aGQ()));
      for (String str = com.tencent.mm.aq.a.p(paramActivity, n.bQZ); ; str = j.aGQ())
        return com.tencent.mm.ui.base.e.a(paramActivity, str, paramActivity.getString(n.buo), new dr(paramIntent, paramActivity), new ds(paramIntent, paramActivity));
    case -75:
      z.e("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "account expired=" + paramInt2);
      return com.tencent.mm.ui.base.e.a(paramActivity, n.bsC, n.buo, new dt(paramIntent, paramActivity));
    case -140:
    }
    z.e("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "alpha need whitelist : [%s]", new Object[] { paramString });
    if (ch.jb(paramString))
      paramString = ak.getContext().getString(n.bRa);
    return com.tencent.mm.ui.base.e.a(paramActivity, paramString, ak.getContext().getString(n.buo), new du(paramIntent, paramActivity));
  }

  public static aa a(Runnable paramRunnable, MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 != 4);
    do
    {
      return null;
      z.d("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "errType = " + paramInt1 + " errCode = " + paramInt2);
    }
    while (paramInt2 != -100);
    z.e("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "account expired=" + paramInt2);
    bg.re();
    fj localfj = new fj();
    localfj.cKH.status = 0;
    localfj.cKH.cKI = 1;
    com.tencent.mm.sdk.c.a.aGB().g(localfj);
    ActionBarActivity localActionBarActivity = paramMMActivity.aPI();
    if (TextUtils.isEmpty(j.aGQ()));
    for (String str = com.tencent.mm.aq.a.p(paramMMActivity.aPI(), n.bQZ); ; str = j.aGQ())
      return com.tencent.mm.ui.base.e.a(localActionBarActivity, str, paramMMActivity.aPI().getString(n.buo), new dn(paramIntent, paramRunnable, paramMMActivity), new dp(paramIntent, paramRunnable, paramMMActivity));
  }

  public static boolean a(Activity paramActivity, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = 0;
    Object[] arrayOfObject1 = new Object[5];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[i] = Integer.valueOf(paramInt2);
    arrayOfObject1[2] = Integer.valueOf(com.tencent.mm.protocal.a.hrn);
    arrayOfObject1[3] = Integer.valueOf(com.tencent.mm.sdk.platformtools.l.cFn);
    arrayOfObject1[4] = Integer.valueOf(com.tencent.mm.sdk.platformtools.l.cFr);
    z.w("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "updateRequired [%d,%d] current version:%d  channel:%d updateMode:%d", arrayOfObject1);
    if (paramInt1 != 4)
      i = 0;
    long l;
    do
    {
      return i;
      switch (paramInt2)
      {
      default:
        return false;
      case -16:
        Updater.b(paramActivity, new dx(paramActivity)).update(i);
        return i;
      case -17:
      }
      l = ak.getContext().getSharedPreferences("system_config_prefs", 0).getLong("recomended_update_ignore", -1L);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(l);
      arrayOfObject2[i] = Long.valueOf(ch.ab(l));
      z.i("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "updateRequired last:%d  now:%d", arrayOfObject2);
    }
    while ((l != -1L) && (ch.ab(l) < 86400L));
    if ((0x2 & com.tencent.mm.sdk.platformtools.l.cFr) != 0)
    {
      z.d("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "channel pack, not silence download.");
      return i;
    }
    z.d("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "not channel pack.");
    String str = com.tencent.mm.f.e.or().getValue("SilentDownloadApkAtWiFi");
    if ((0x1000000 & ((Integer)bg.qW().oQ().get(7, Integer.valueOf(0))).intValue()) == 0)
    {
      int k = i;
      if ((k == 0) || ((!ch.jb(str)) && (ch.xy(str) != 0)))
        break label361;
      int n = i;
      label295: if ((0x1 & com.tencent.mm.sdk.platformtools.l.cFr) == 0)
        break label367;
      z.d("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "channel pack, not silence download.");
    }
    while (true)
    {
      if (ch.xy(str) != 0)
        z.d("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "dynaCfg close silence wifi download.");
      if (j != 0)
        break label382;
      Updater.b(paramActivity, new do(null, paramActivity)).update(2);
      return i;
      int m = 0;
      break;
      label361: int i1 = 0;
      break label295;
      label367: z.d("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "not channel pack.");
      j = i1;
    }
    label382: return t(paramActivity);
  }

  public static boolean ba(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 4) && (paramInt2 == -6);
  }

  public static boolean cj(Context paramContext)
  {
    String str = an.aMF();
    z.i("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "installRequired %s", new Object[] { str });
    if ((!ch.jb(str)) && (!an.aMI()))
    {
      bg.qQ().n(new dv(str, paramContext));
      return true;
    }
    return false;
  }

  public static boolean r(Activity paramActivity)
  {
    int i = 1;
    if (ch.xy(com.tencent.mm.f.e.or().getValue("SilentDownloadApkAtWiFi")) != 0);
    label60: label98: label103: label112: 
    while (true)
    {
      return false;
      int j;
      if ((0x1000000 & ((Integer)bg.qW().oQ().get(7, Integer.valueOf(0))).intValue()) == 0)
      {
        j = i;
        if ((!bc.bP(paramActivity)) || (j == 0))
          break label98;
        if ((0x1 & com.tencent.mm.sdk.platformtools.l.cFr) == 0)
          break label103;
        z.d("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "channel pack, not silence download.");
        i = 0;
      }
      while (true)
      {
        if ((i == 0) || (!an.aMM()))
          break label112;
        return t(paramActivity);
        j = 0;
        break;
        i = 0;
        break label60;
        z.d("!44@/B4Tb64lLpLK/95/Wmq011KSsXOn368D0RVH0Tnzu9k=", "not channel pack.");
      }
    }
  }

  private static boolean t(Activity paramActivity)
  {
    Updater.bt(paramActivity).update(2);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dm
 * JD-Core Version:    0.6.2
 */