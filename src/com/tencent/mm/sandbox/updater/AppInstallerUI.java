package com.tencent.mm.sandbox.updater;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.sandbox.d;
import com.tencent.mm.sandbox.monitor.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;

public class AppInstallerUI extends Activity
{
  private static AppInstallerUI iBs = null;
  private String cHL;
  private String desc;
  private int eZP;
  private aa fav = null;
  private aa iBr = null;
  private DialogInterface.OnClickListener iBt = new b(this);

  public static AppInstallerUI aMx()
  {
    return iBs;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    z.d("!32@/B4Tb64lLpK4dsObr+ZXlbJd1YO/EjJD", "onCreate");
    d.f(hashCode(), this);
    MMActivity.cg(this);
    if ((AppUpdaterUI.aMy() != null) && (!AppUpdaterUI.aMy().isFinishing()))
    {
      z.d("!32@/B4Tb64lLpK4dsObr+ZXlbJd1YO/EjJD", "AppUpdaterUI is there, finish self");
      finish();
    }
    do
    {
      return;
      if ((iBs != null) && (!iBs.isFinishing()) && (iBs != this))
      {
        z.d("!32@/B4Tb64lLpK4dsObr+ZXlbJd1YO/EjJD", "duplicate instance, finish self");
        finish();
        return;
      }
      iBs = this;
      this.cHL = an.aMF();
      if ((ch.jb(this.cHL)) || (g.AB(this.cHL) == null))
      {
        finish();
        return;
      }
      this.desc = an.aMG();
      this.eZP = an.aMH();
      setContentView(k.empty);
      ad localad = new ad(this);
      localad.pn(n.bLl);
      localad.eN(true);
      localad.b(new a(this));
      int i = n.bLo;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.desc;
      localad.BL(getString(i, arrayOfObject));
      localad.c(n.bOU, this.iBt);
      localad.e(n.cmO, null);
      this.fav = localad.aRB();
      this.fav.setCanceledOnTouchOutside(false);
      this.fav.show();
    }
    while (this.eZP != 2);
    an.a(this, 2, 1 + an.aMJ());
  }

  protected void onDestroy()
  {
    z.d("!32@/B4Tb64lLpK4dsObr+ZXlbJd1YO/EjJD", "onDestroy");
    if ((this.fav != null) && (this.fav.isShowing()))
      this.fav.dismiss();
    if ((this.iBr != null) && (this.iBr.isShowing()))
      this.iBr.dismiss();
    if (iBs == this)
      iBs = null;
    d.g(hashCode(), this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppInstallerUI
 * JD-Core Version:    0.6.2
 */