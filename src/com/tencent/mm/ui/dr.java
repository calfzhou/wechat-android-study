package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.c.a.m;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.c.a;

final class dr
  implements DialogInterface.OnClickListener
{
  dr(Intent paramIntent, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.iMS != null)
    {
      if (!(this.dVg instanceof LauncherUI))
        this.dVg.finish();
      bg.re();
      this.dVg.startActivity(this.iMS);
      com.tencent.mm.modelsimple.f.H(this.dVg);
      m localm = new m();
      localm.cHo.cHp = true;
      a.aGB().g(localm);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dr
 * JD-Core Version:    0.6.2
 */