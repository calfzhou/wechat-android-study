package com.tencent.mm.ui.bindmobile;

import android.widget.Button;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;

final class t
  implements Runnable
{
  t(s params)
  {
  }

  public final void run()
  {
    if (aa.vZ())
    {
      BindMContactIntroUI.aUd();
      BindMContactIntroUI.c(this.jkd.jka).setText(this.jkd.jka.getString(com.tencent.mm.n.bwv));
      BindMContactIntroUI.a(this.jkd.jka, ab.dtS);
      boolean bool = ch.a((Boolean)bg.qW().oQ().get(12322, Boolean.valueOf(false)), false);
      if ((BindMContactIntroUI.d(this.jkd.jka)) && (bool))
      {
        com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(3);
        arrayOfObject[1] = Integer.valueOf(3);
        localn.d(11002, arrayOfObject);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.t
 * JD-Core Version:    0.6.2
 */