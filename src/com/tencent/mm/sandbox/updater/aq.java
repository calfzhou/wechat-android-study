package com.tencent.mm.sandbox.updater;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.b.h;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.k.i;
import com.tencent.mm.model.cg;
import com.tencent.mm.network.r;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

final class aq
  implements cg
{
  aq(Updater paramUpdater, com.tencent.mm.sandbox.a.a parama)
  {
  }

  public final void a(r paramr)
  {
    if (paramr == null)
      Assert.assertTrue("updater invalid assert", false);
    ((NotificationManager)this.iCv.getContext().getSystemService("notification")).cancel(34);
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "go to update");
    if (!m.getExternalStorageState().equals("mounted"))
    {
      z.e("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "no sdcard.");
      Updater.b(this.iCv);
    }
    int i = this.iCu.aMm();
    com.tencent.mm.b.g localg = com.tencent.mm.b.g.an(this.iCu.aMr());
    String str1 = an.bs(this.iCv.getContext());
    h localh = null;
    if (localg != null)
      localh = localg.am(str1);
    if (localh == null);
    for (long l = i; ; l = i + localh.getSize())
    {
      if (!j.u(l))
      {
        z.e("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "no enough space.");
        Updater.b(this.iCv);
      }
      if ((0x1 & l.cFr) != 0)
      {
        z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "channel pack, not silence download.");
        Updater.b(this.iCv);
      }
      if ((Updater.c(this.iCv) != 2) || (Updater.d(this.iCv)))
        break;
      String str2 = an.aMF();
      if ((com.tencent.mm.sandbox.monitor.g.AB(this.iCu.aMn()) == null) || (ch.jb(str2)) || (!str2.equals(this.iCu.aMn())))
        break;
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "we already have this pack %s being to install, just ignore this update request", new Object[] { str2 });
      return;
    }
    if (Updater.e(this.iCv))
    {
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "gonna start UpdaterService");
      Intent localIntent2 = new Intent(this.iCv.getContext(), UpdaterService.class);
      Updater.a(this.iCv, localIntent2, paramr, this.iCu);
      localIntent2.putExtra("intent_extra_run_in_foreground", true);
      localIntent2.putExtra("intent_extra_download_mode", 2);
      this.iCv.getContext().startService(localIntent2);
      i.Ck().d(262145, true);
      return;
    }
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "gonna start AppUpdaterUI");
    Intent localIntent1 = new Intent(this.iCv.getContext(), AppUpdaterUI.class);
    Updater.a(this.iCv, localIntent1, paramr, this.iCu);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(Updater.c(this.iCv));
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "current updateType : %s", arrayOfObject);
    if (Updater.c(this.iCv) == 1)
      localIntent1.putExtra("intent_extra_download_mode", 0);
    while (true)
    {
      this.iCv.getContext().startActivity(localIntent1);
      break;
      localIntent1.putExtra("intent_extra_download_mode", 1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.aq
 * JD-Core Version:    0.6.2
 */