package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ax;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.ui.base.e;

final class ak
  implements DialogInterface.OnClickListener
{
  private m dDA = null;
  private ay jMg = null;

  ak(SettingsAboutMicroMsgUI paramSettingsAboutMicroMsgUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (bg.qW().oJ())
    {
      ac localac = bg.qX();
      al localal = new al(this);
      this.dDA = localal;
      localac.a(281, localal);
      ax localax = new ax(2);
      bg.qX().d(localax);
      this.jMg = new ay(new am(this, localax), false);
      this.jMg.cP(5000L);
      SettingsAboutMicroMsgUI localSettingsAboutMicroMsgUI = this.jMf;
      ActionBarActivity localActionBarActivity = this.jMf.aPI();
      this.jMf.getString(n.buo);
      SettingsAboutMicroMsgUI.a(localSettingsAboutMicroMsgUI, e.a(localActionBarActivity, this.jMf.getString(n.ctJ), true, new an(this, localax)));
      return;
    }
    SettingsAboutMicroMsgUI.b(this.jMf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ak
 * JD-Core Version:    0.6.2
 */