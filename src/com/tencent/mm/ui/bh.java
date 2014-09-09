package com.tencent.mm.ui;

import com.tencent.mm.aj.i;
import com.tencent.mm.aj.k;
import com.tencent.mm.aj.l;
import com.tencent.mm.f.c;
import com.tencent.mm.jdbiz.f;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.pluginsdk.q;

final class bh
  implements Runnable
{
  bh(LauncherUI paramLauncherUI)
  {
  }

  public final void run()
  {
    if (bg.qW().oD() == 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "Account not Ready!!!");
      return;
    }
    if (LauncherUI.a(this.iKj) == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "set tag job, but tab view is null");
      return;
    }
    int m;
    if (!bg.oE())
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+AkWszK7UvIu5cpERJB7d1VkLoGBmsjY=", "getFindTabUnreadCount, but mmcore not ready");
      m = 0;
      LauncherUI.a(this.iKj).er(false);
      LauncherUI.a(this.iKj).oB(m);
      if ((m <= 0) && ((0x8000 & x.pO()) == 0) && (ap.a((Boolean)bg.qW().oQ().get(68384), true)) && (!ap.jb((String)bg.qW().oQ().get(68377))))
        LauncherUI.a(this.iKj).er(true);
    }
    else
    {
      if ((0x8000 & x.pK()) != 0)
        break label443;
    }
    label428: label443: for (int i = 0 + com.tencent.mm.model.z.qs(); ; i = 0)
    {
      if ((0x200 & x.pO()) == 0);
      for (int j = 0 + l.AG().Ay(); ; j = 0)
      {
        if ((0x100 & x.pO()) == 0)
        {
          k localk = l.AH();
          if (localk != null)
            j += localk.Ay();
          j += com.tencent.mm.pluginsdk.g.axQ().ajA();
        }
        int k = i + j;
        if (((0x8000 & x.pO()) == 0) && (am.ayi() != null))
          k += am.ayi().Ay();
        m = k;
        break;
        if (m <= 0)
        {
          String str1 = com.tencent.mm.f.e.or().getValue("JDEntranceConfigName");
          String str2 = com.tencent.mm.f.e.or().getValue("JDEntranceConfigIconUrl");
          String str3 = com.tencent.mm.f.e.or().getValue("JDEntranceConfigJumpUrl");
          com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "jd tryshow configName " + str1 + " iconUrl " + str2 + " jumpUrl " + str3);
          if ((!ap.jb(str1)) && (!ap.jb(str2)) && (!ap.jb(str3)))
          {
            com.tencent.mm.jdbiz.g.Cp();
            boolean bool = com.tencent.mm.jdbiz.g.Cr();
            com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "jdshowFriend " + bool);
            if (bool)
            {
              if (com.tencent.mm.jdbiz.g.Cp().Cu().Cn())
                break label428;
              LauncherUI.a(this.iKj).er(true);
            }
          }
        }
        while (true)
        {
          LauncherUI.a(this.iKj, false);
          return;
          com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "jd time isExpire");
        }
      }
    }
  }

  public final String toString()
  {
    return super.toString() + "|setTagRunnable";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bh
 * JD-Core Version:    0.6.2
 */