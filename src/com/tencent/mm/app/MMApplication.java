package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Process;
import com.tencent.mm.a.c;
import com.tencent.mm.compatible.loader.l;
import com.tencent.mm.compatible.loader.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.d;
import com.tencent.mm.ui.tools.a.u;
import java.io.File;

public class MMApplication extends Application
{
  public static MMApplication cGc;
  public static long cGd;
  public static boolean cGe = false;
  private l cGb = null;

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    z.d("!32@/B4Tb64lLpIS+EmmM2BObYzdaCpCRy8i", "configuration changed");
    super.onConfigurationChanged(paramConfiguration);
    if (this.cGb != null)
      this.cGb.aQ();
  }

  public void onCreate()
  {
    cGd = System.currentTimeMillis();
    ak.ed(false);
    ak.setContext(this);
    cGc = this;
    com.tencent.mm.storage.h.ihY = "/data/data/" + ak.getContext().getPackageName() + "/";
    com.tencent.mm.storage.h.dgF = com.tencent.mm.storage.h.ihY + "MicroMsg/";
    File localFile = new File(com.tencent.mm.storage.h.dgF);
    String str1 = com.tencent.mm.storage.h.dgF + "SdcardInfo.cfg";
    if (localFile.exists())
      if (new File(str1).exists())
        com.tencent.mm.compatible.g.h.cH((String)new d(str1).get(1));
    while (true)
    {
      SharedPreferences localSharedPreferences = getSharedPreferences("system_config_prefs", 0);
      int i = 0;
      if (localSharedPreferences != null)
        i = localSharedPreferences.getInt("default_uin", 0);
      long l1 = System.currentTimeMillis();
      com.tencent.mm.platformtools.g localg = new com.tencent.mm.platformtools.g(com.tencent.mm.storage.h.dgF + "NowRev.ini");
      String str2 = localg.getValue("NowRev");
      long l2 = System.currentTimeMillis();
      long l3 = l2 - l1;
      long l4 = 0L;
      if (!"798589".equals(str2))
      {
        cGe = true;
        c.b(getDir("lib", 0));
        c.b(getDir("dex", 0));
        c.b(getDir("cache", 0));
        c.b(getDir("recover_lib", 0));
        localg.W("NowRev", "798589");
        l4 = System.currentTimeMillis() - l2;
      }
      b.g(getApplicationContext());
      String str3 = ch.w(this, Process.myPid());
      long l5 = System.currentTimeMillis();
      com.tencent.mm.compatible.loader.g.a(this);
      this.cGb = new n().a(this, str3);
      if (this.cGb != null)
        this.cGb.onCreate();
      Object[] arrayOfObject = new Object[9];
      arrayOfObject[0] = str3;
      arrayOfObject[1] = Long.valueOf(ch.ac(cGd));
      arrayOfObject[2] = Long.valueOf(ch.ac(l5));
      arrayOfObject[3] = Integer.valueOf(i);
      arrayOfObject[4] = str2;
      arrayOfObject[5] = "798589";
      arrayOfObject[6] = Long.valueOf(l3);
      arrayOfObject[7] = Long.valueOf(l4);
      arrayOfObject[8] = com.tencent.mm.storage.h.dgF;
      z.i("!32@/B4Tb64lLpIS+EmmM2BObYzdaCpCRy8i", "APPonCreate proc:%s time:%d(loader:%d) defuin:%d old:%s new:%s time[%d,%d] path:%s", arrayOfObject);
      z.i("!32@/B4Tb64lLpIS+EmmM2BObYzdaCpCRy8i", "start time check MMApplication oncreate use time " + (System.currentTimeMillis() - cGd));
      return;
      com.tencent.mm.compatible.g.h.cH(com.tencent.mm.compatible.g.h.dOH);
      continue;
      localFile.mkdir();
      d locald = new d(str1);
      com.tencent.mm.compatible.g.h.cH(null);
      locald.set(1, com.tencent.mm.compatible.g.h.dOH);
    }
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    u.close();
  }

  public void onTerminate()
  {
    super.onTerminate();
    if (this.cGb != null)
      this.cGb.onTerminate();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.MMApplication
 * JD-Core Version:    0.6.2
 */