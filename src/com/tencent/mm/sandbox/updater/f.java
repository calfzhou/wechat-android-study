package com.tencent.mm.sandbox.updater;

import android.widget.Button;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;

final class f
  implements al
{
  f(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void AC(String paramString)
  {
    if (AppUpdaterUI.b(this.iBB) != null)
      AppUpdaterUI.b(this.iBB).dismiss();
    if (this.iBB.isFinishing());
    do
    {
      return;
      z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", paramString);
    }
    while (paramString == null);
    AppUpdaterUI.a(this.iBB, paramString);
    AppUpdaterUI.a(this.iBB).setEnabled(false);
  }

  public final void a(com.tencent.mm.sandbox.monitor.g paramg)
  {
    if (this.iBB.isFinishing());
    do
    {
      return;
      if (!(paramg instanceof aa))
        break;
      z.e("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "download package from cdn error. switch to webserver");
      if (AppUpdaterUI.b(this.iBB) != null)
      {
        com.tencent.mm.ui.base.aa localaa = AppUpdaterUI.b(this.iBB);
        AppUpdaterUI localAppUpdaterUI = this.iBB;
        int i = n.bLn;
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = AppUpdaterUI.e(this.iBB).desc;
        arrayOfObject[1] = this.iBB.getString(n.cmS);
        arrayOfObject[2] = ch.Z(AppUpdaterUI.e(this.iBB).size);
        localaa.setMessage(localAppUpdaterUI.getString(i, arrayOfObject));
      }
    }
    while (!AppUpdaterUI.e(this.iBB).iCC);
    AppUpdaterUI.a(this.iBB, paramg);
    return;
    e.a(this.iBB, n.cmT, n.buo, new g(this), new h(this));
  }

  public final void aMB()
  {
    z.e("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "no sdcard.");
    if (AppUpdaterUI.b(this.iBB) != null)
      AppUpdaterUI.b(this.iBB).dismiss();
    if (this.iBB.isFinishing())
      return;
    AppUpdaterUI.c(this.iBB);
  }

  public final void aMC()
  {
    if (AppUpdaterUI.b(this.iBB) != null)
      AppUpdaterUI.b(this.iBB).dismiss();
    if (this.iBB.isFinishing())
      return;
    AppUpdaterUI.d(this.iBB);
  }

  public final void aMD()
  {
    if (this.iBB.isFinishing())
      return;
    AppUpdaterUI.a(this.iBB).setText(n.cmV);
    AppUpdaterUI.a(this.iBB).setEnabled(false);
  }

  public final void w(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= 0);
    for (long l = 0L; ; l = 100L * paramInt2 / paramInt1)
    {
      int i = (int)l;
      AppUpdaterUI.a(this.iBB).setText(this.iBB.getString(n.cmV) + i + "%");
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.f
 * JD-Core Version:    0.6.2
 */