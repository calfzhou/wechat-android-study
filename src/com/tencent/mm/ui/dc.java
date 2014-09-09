package com.tencent.mm.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.provider.Settings.Secure;
import com.tencent.mm.ab.h;
import com.tencent.mm.ab.k;
import com.tencent.mm.c.a.d;
import com.tencent.mm.c.a.ik;
import com.tencent.mm.c.a.ix;
import com.tencent.mm.jdbiz.g;
import com.tencent.mm.kvcomm.KVReportJni.KVReportJava2C;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class dc
  implements az
{
  dc(MMAppMgr paramMMAppMgr)
  {
  }

  public final boolean kJ()
  {
    if (MMAppMgr.a(this.iML) == MMAppMgr.b(this.iML))
      z.d("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "status not changed, cur=" + MMAppMgr.a(this.iML));
    do
    {
      return true;
      MMAppMgr.a(this.iML, MMAppMgr.b(this.iML));
      KVReportJni.KVReportJava2C.onForeground(MMAppMgr.a(this.iML));
      if (!MMAppMgr.a(this.iML))
        break;
      z.w("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "[ACTIVATED MODE]");
      if ((bg.oE()) && (!bg.rd()))
      {
        bg.qX().d(new k(12));
        bg.qX().d(new h());
        bg.qQ().n(new dd(this));
        cx localcx = cx.rV();
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(1);
        localcx.a(19, arrayOfObject2);
        com.tencent.mm.ah.e.zQ().pause();
        com.tencent.mm.y.ap.yi().X(true);
        g.Cw();
      }
      bg.qX().X(true);
      bg.qX().W(false);
      ak.getContext().getSharedPreferences("notify_prep", 0).edit().putBoolean("longNoopIntervalFlag", false).commit();
    }
    while (MMAppMgr.c(this.iML).aNx());
    MMAppMgr.c(this.iML).aNu();
    return true;
    z.w("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "[DEACTIVATED MODE]");
    MMAppMgr.a(this.iML, com.tencent.mm.platformtools.ap.CN());
    MMAppMgr.a(this.iML, "desktop");
    Object localObject;
    boolean bool;
    if (bg.oE())
    {
      com.tencent.mm.an.a.wk(com.tencent.mm.an.a.aFl());
      com.tencent.mm.ah.e.zQ().resume();
      ik localik = new ik();
      localik.cMR.state = 0;
      com.tencent.mm.sdk.c.a.aGB().g(localik);
      d locald = new d();
      locald.cHi.cHj = false;
      com.tencent.mm.sdk.c.a.aGB().g(locald);
      ix localix = new ix();
      localix.cNj.Db = false;
      com.tencent.mm.sdk.c.a.aGB().g(localix);
      com.tencent.mm.y.ap.yi().X(false);
      z.d("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "[oneliang][statInputMethod]");
      localObject = bg.qW().oQ().get(327808);
      if (localObject != null)
        break label552;
      bool = true;
    }
    while (true)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = String.valueOf(bool);
      z.d("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "[oneliang][statInputMethod] needToStat:%s", arrayOfObject1);
      if (bool);
      try
      {
        String str = Settings.Secure.getString(ak.getContext().getContentResolver(), "default_input_method");
        n.fTF.q(11375, com.tencent.mm.platformtools.ap.ja(str));
        bg.qW().oQ().set(327808, Long.valueOf(System.currentTimeMillis()));
        bg.qX().X(false);
        if (!MMAppMgr.c(this.iML).aNx())
          MMAppMgr.c(this.iML).aNu();
        MMAppMgr.c(this.iML).cP(60000L);
        return true;
        label552: if (com.tencent.mm.platformtools.ap.jb(localObject.toString()))
        {
          bool = true;
        }
        else
        {
          long l = ch.xz(localObject.toString());
          if (System.currentTimeMillis() - l >= 604800000L)
            bool = true;
        }
      }
      catch (Exception localException)
      {
        while (true)
          z.e("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "[oneliang][inputMethodStat]exception:" + localException.getMessage());
        bool = false;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dc
 * JD-Core Version:    0.6.2
 */