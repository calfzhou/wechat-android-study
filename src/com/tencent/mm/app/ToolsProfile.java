package com.tencent.mm.app;

import android.app.Application;
import com.tencent.mm.compatible.g.o;
import com.tencent.mm.compatible.loader.PluginDescription;
import com.tencent.mm.compatible.loader.l;
import com.tencent.mm.compatible.loader.p;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import java.util.Locale;

public final class ToolsProfile extends l
{
  public static final String cFO = ak.getPackageName() + ":tools";
  private static Locale locale;

  public final void aQ()
  {
    Locale localLocale = MMActivity.cg(this.dOv.getBaseContext());
    z.d("!32@/B4Tb64lLpIkgs39Nqw598Se1kGoMRt/", "onConfigurationChanged, locale = " + locale.toString() + ", n = " + localLocale.toString());
    if (!localLocale.equals(locale))
    {
      z.w("!32@/B4Tb64lLpIkgs39Nqw598Se1kGoMRt/", "language changed, restart process");
      System.exit(-1);
    }
  }

  public final void onCreate()
  {
    o.a("stlport_shared", ToolsProfile.class.getClassLoader());
    h.aq(cFO);
    o.nQ();
    a.a(new b());
    com.tencent.mm.compatible.loader.g.q("mutidex", com.tencent.mm.compatible.loader.g.j(ak.getContext(), "mutidex"));
    o.a("wechatImgTools", getClass().getClassLoader());
    PluginDescription localPluginDescription = p.uu("shoot");
    if (localPluginDescription != null)
    {
      ak.getContext();
      com.tencent.mm.compatible.loader.g.q("shoot", com.tencent.mm.compatible.loader.g.a(localPluginDescription.name, p.sF(localPluginDescription.cHL), localPluginDescription.cHL));
    }
    locale = MMActivity.cg(this.dOv.getBaseContext());
    new com.tencent.mm.booter.g(this.dOv.getBaseContext()).kW();
  }

  public final String toString()
  {
    return cFO;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ToolsProfile
 * JD-Core Version:    0.6.2
 */