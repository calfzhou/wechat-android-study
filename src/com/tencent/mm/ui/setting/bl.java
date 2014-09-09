package com.tencent.mm.ui.setting;

import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.ab.k;
import com.tencent.mm.m.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.x;

final class bl
  implements x
{
  bl(SettingsAccountInfoUI paramSettingsAccountInfoUI)
  {
  }

  public final boolean o(CharSequence paramCharSequence)
  {
    if (!ch.iX(paramCharSequence.toString()))
    {
      e.aw(this.jMH.aPI(), this.jMH.getString(n.cnH));
      return false;
    }
    k localk = new k(5);
    bg.qX().d(localk);
    a locala = new a(a.dmJ, paramCharSequence.toString());
    bg.qX().d(locala);
    SettingsAccountInfoUI localSettingsAccountInfoUI = this.jMH;
    ActionBarActivity localActionBarActivity = this.jMH.aPI();
    this.jMH.getString(n.buo);
    SettingsAccountInfoUI.a(localSettingsAccountInfoUI, e.a(localActionBarActivity, this.jMH.getString(n.cfl), true, new bm(this, locala)));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bl
 * JD-Core Version:    0.6.2
 */