package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.aj.i;
import com.tencent.mm.aj.l;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bt;
import com.tencent.mm.model.cs;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.LauncherUI;
import java.lang.ref.WeakReference;

final class v
  implements View.OnClickListener
{
  v(s params, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    bt.rn().y(this.eaJ, this.iWN);
    Context localContext = (Context)s.b(this.iWO).get();
    if (localContext != null)
    {
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(5);
      arrayOfObject[1] = Integer.valueOf(1);
      localn.d(11002, arrayOfObject);
      boolean bool = ch.b((Boolean)bg.qW().oQ().get(4103));
      new Intent().putExtra("KEnterFromBanner", true);
      if (!bool)
        a.l(localContext, "nearby", ".ui.NearbyFriendsIntroUI");
    }
    else
    {
      return;
    }
    cs localcs = cs.rR();
    if (localcs == null)
    {
      a.l(localContext, "nearby", ".ui.NearbyPersonalInfoUI");
      return;
    }
    String str = ch.ja(localcs.jp());
    int i = ch.a(Integer.valueOf(localcs.jj()), 0);
    if ((ch.jb(str)) || (i == 0))
    {
      a.l(localContext, "nearby", ".ui.NearbyPersonalInfoUI");
      return;
    }
    LauncherUI localLauncherUI = LauncherUI.aPm();
    if (localLauncherUI != null)
      localLauncherUI.Bs("tab_find_friend");
    if (l.AG().Ay() > 0)
    {
      a.l(localContext, "nearby", ".ui.NearbyFriendShowSayHiUI");
      return;
    }
    a.l(localContext, "nearby", ".ui.NearbyFriendsUI");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.v
 * JD-Core Version:    0.6.2
 */