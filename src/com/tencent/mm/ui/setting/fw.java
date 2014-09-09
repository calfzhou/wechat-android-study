package com.tencent.mm.ui.setting;

import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ax;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;

final class fw
  implements View.OnClickListener
{
  private m dDA = null;
  private ay jMg = null;

  fw(SettingsUI paramSettingsUI)
  {
  }

  public final void onClick(View paramView)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(bg.qW().oD());
    z.w("!32@/B4Tb64lLpJkrm2DE1IrTwd4KebLGflW", "dklogout User EXIT Now uin:%d", arrayOfObject1);
    com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(2);
    localn.d(11053, arrayOfObject2);
    SettingsUI.d(this.jOo).dismiss();
    if (bg.qW().oJ())
    {
      ac localac = bg.qX();
      fx localfx = new fx(this);
      this.dDA = localfx;
      localac.a(281, localfx);
      ax localax = new ax(2);
      bg.qX().d(localax);
      this.jMg = new ay(new fy(this, localax), false);
      this.jMg.cP(5000L);
      SettingsUI localSettingsUI = this.jOo;
      ActionBarActivity localActionBarActivity = this.jOo.aPI();
      this.jOo.getString(com.tencent.mm.n.buo);
      SettingsUI.a(localSettingsUI, e.a(localActionBarActivity, this.jOo.getString(com.tencent.mm.n.ctJ), true, new fz(this, localax)));
      return;
    }
    SettingsUI.f(this.jOo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fw
 * JD-Core Version:    0.6.2
 */