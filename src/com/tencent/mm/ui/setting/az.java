package com.tencent.mm.ui.setting;

import android.app.Dialog;
import android.widget.LinearLayout;
import com.tencent.mm.model.cx;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.ek;

final class az
  implements Runnable
{
  az(ay paramay, float paramFloat)
  {
  }

  public final void run()
  {
    ((Dialog)this.jMo.iXK.getTag()).dismiss();
    ek.b(this.jMo.jMk.aPI(), this.jMn);
    cx localcx = cx.rV();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Float.valueOf(SetTextSizeUI.af(this.jMn));
    localcx.a(25, arrayOfObject);
    SettingsAboutSystemUI.c(this.jMo.jMk);
    if (LauncherUI.aPm() != null)
      LauncherUI.aPm().aPq();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.az
 * JD-Core Version:    0.6.2
 */