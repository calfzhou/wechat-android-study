package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ay;

final class fx
  implements m
{
  fx(fw paramfw)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    bg.qX().b(281, fw.a(this.jOr));
    fw.b(this.jOr);
    if (fw.c(this.jOr) != null)
    {
      fw.c(this.jOr).aNu();
      fw.d(this.jOr);
    }
    if (SettingsUI.e(this.jOr.jOo) != null)
      SettingsUI.e(this.jOr.jOo).dismiss();
    SettingsUI.f(this.jOr.jOo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fx
 * JD-Core Version:    0.6.2
 */