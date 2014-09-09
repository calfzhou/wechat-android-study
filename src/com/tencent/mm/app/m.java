package com.tencent.mm.app;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.e.a;
import com.tencent.mm.ui.e.f;
import com.tencent.mm.ui.e.k;
import com.tencent.mm.y.ap;

final class m extends cm
{
  m(l paraml, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (paramMessage.what == -1999)
      if (!l.a(this.cGw))
      {
        LauncherUI localLauncherUI2 = LauncherUI.aPm();
        if ((localLauncherUI2 != null) && (localLauncherUI2.aOZ()))
        {
          localLauncherUI2.Bs("tab_main");
          localLauncherUI2.aPw();
          e.ny();
          s locals = am.ayg();
          if (locals != null)
            locals.akP();
          localLauncherUI2.aPg();
        }
      }
    while (true)
    {
      System.gc();
      do
        return;
      while ((paramMessage.what != -2999) || (l.a(this.cGw)));
      LauncherUI localLauncherUI1 = LauncherUI.aPm();
      if (localLauncherUI1 != null)
        localLauncherUI1.aPh();
      if (bg.qW().oD() != 0)
      {
        bd localbd = bg.qF().eA("plugin.emoji");
        if (localbd != null)
          localbd.ci(0);
        if ((ap)bg.qF().eA(ap.class.getName()) != null)
          ap.clearCache();
        f localf = f.bbM();
        a locala = a.bbH();
        k localk = k.bbQ();
        localf.bbI();
        locala.bbI();
        localk.a(localf);
        localk.a(locala);
        localk.update();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.m
 * JD-Core Version:    0.6.2
 */