package com.tencent.mm.sandbox.updater;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.mm.b.h;
import com.tencent.mm.k;
import com.tencent.mm.sandbox.d;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.base.e;

public class AppUpdaterUI extends Activity
{
  private static AppUpdaterUI iBx = null;
  private Button efl;
  private aa fav = null;
  private DialogInterface.OnClickListener iBA = new r(this);
  private DialogInterface.OnClickListener iBt = new s(this);
  private Button iBw;
  private ar iBy;
  private al iBz = new f(this);

  private void aMA()
  {
    if ((this.fav != null) && (this.fav.isShowing()))
      this.fav.dismiss();
    finish();
  }

  public static AppUpdaterUI aMy()
  {
    return iBx;
  }

  public static void aMz()
  {
    if (iBx != null)
      iBx.aMA();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "onCreate");
    d.f(hashCode(), this);
    MMActivity.cg(this);
    if ((AppInstallerUI.aMx() != null) && (!AppInstallerUI.aMx().isFinishing()))
    {
      z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "AppInstallerUI is there, finish self");
      finish();
      return;
    }
    if ((iBx != null) && (!iBx.isFinishing()) && (iBx != this))
    {
      z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "duplicate instance, finish self");
      z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "we already got one instance, does it gonna leak?");
      finish();
      return;
    }
    iBx = this;
    setContentView(k.empty);
    this.iBy = au.iCK;
    if (!this.iBy.r(getIntent()))
    {
      if (this.iBy.QQ())
        if (this.iBy.eZP == 2)
        {
          e.aw(this, getString(com.tencent.mm.n.cnb));
          z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "updaterManager.handleCommand return false become downloading");
        }
      while (true)
      {
        aMA();
        return;
        e.aw(this, getString(com.tencent.mm.n.cmV));
        break;
        z.e("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "updaterManager.handleCommand return false");
      }
    }
    this.iBy.a(this.iBz);
    if ((this.iBy.iBm == 999) && (this.iBy.iBP != null) && (this.iBy.iBP.length > 0))
    {
      z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "into emergency status");
      new cm().postDelayed(new n(this), 100L);
      return;
    }
    z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "showUpdateDlg, downloadUrls = " + this.iBy.iBP);
    ad localad = new ad(this);
    localad.pn(com.tencent.mm.n.bLl);
    localad.eN(true);
    localad.b(new q(this));
    String str;
    if (this.iBy.iCC)
    {
      int k = com.tencent.mm.n.bLn;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = this.iBy.desc;
      arrayOfObject2[1] = getString(com.tencent.mm.n.cmW);
      arrayOfObject2[2] = ch.Z(this.iBy.iCB.getSize());
      str = getString(k, arrayOfObject2);
      label408: if (this.iBy.iBm == 1)
        break label585;
    }
    label585: for (int j = com.tencent.mm.n.cmO; ; j = com.tencent.mm.n.cmR)
    {
      localad.BL(str);
      localad.c(com.tencent.mm.n.cmZ, this.iBt);
      localad.e(j, null);
      this.fav = localad.aRB();
      this.fav.setCanceledOnTouchOutside(false);
      this.iBw = this.fav.getButton(-1);
      this.efl = this.fav.getButton(-2);
      this.fav.show();
      if (this.iBy.eZP != 1)
        break;
      an.u(this, 5);
      return;
      z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "had try to download full pack.");
      int i = com.tencent.mm.n.bLn;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = this.iBy.desc;
      arrayOfObject1[1] = getString(com.tencent.mm.n.cmS);
      arrayOfObject1[2] = ch.Z(this.iBy.size);
      str = getString(i, arrayOfObject1);
      break label408;
    }
  }

  protected void onDestroy()
  {
    z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "onDestroy");
    d.g(hashCode(), this);
    if (this.iBy != null)
      this.iBy.b(this.iBz);
    if (iBx == this)
      iBx = null;
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI
 * JD-Core Version:    0.6.2
 */