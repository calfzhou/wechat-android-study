package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

public class NewTaskUI extends Activity
  implements com.tencent.mm.o.m
{
  static NewTaskUI jUk;
  private ProgressDialog dWT = null;
  private SecurityImage iMR = null;
  private ds jUl = new ds();

  public static NewTaskUI baL()
  {
    return jUk;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((this.dWT != null) && (this.dWT.isShowing()))
      this.dWT.dismiss();
    if ((paramInt1 != 4) || (paramInt2 != -6))
    {
      jUk = null;
      finish();
      return;
    }
    if ((paramx instanceof i))
    {
      i locali = (i)paramx;
      this.jUl.username = locali.zf();
      this.jUl.jTd = locali.zg();
      this.jUl.jTe = locali.zh();
      this.jUl.iPN = locali.yY();
      this.jUl.iPM = locali.wB();
      this.jUl.iPK = locali.wC();
      this.jUl.iPL = locali.yZ();
      z.d("!32@/B4Tb64lLpIwz/fkTrbJFDJAgnSFqmV8", "imgSid:" + this.jUl.iPK + " img len" + this.jUl.iPM.length + " " + com.tencent.mm.compatible.g.k.nL());
    }
    if (this.iMR == null)
    {
      this.iMR = com.tencent.mm.ui.applet.m.a(this, n.bZc, this.jUl.iPN, this.jUl.iPM, this.jUl.iPK, this.jUl.iPL, new fc(this), new fe(this), new ff(this), this.jUl);
      return;
    }
    z.d("!32@/B4Tb64lLpIwz/fkTrbJFDJAgnSFqmV8", "imgSid:" + this.jUl.iPK + " img len" + this.jUl.iPM.length + " " + com.tencent.mm.compatible.g.k.nL());
    this.iMR.b(this.jUl.iPN, this.jUl.iPM, this.jUl.iPK, this.jUl.iPL);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(com.tencent.mm.k.bkq);
    bg.qX().a(380, this);
    jUk = this;
    i locali = new i();
    bg.qX().d(locali);
    getString(n.buo);
    this.dWT = e.a(this, getString(n.bQn), true, new fb(this, locali));
  }

  public void onDestroy()
  {
    if (equals(jUk))
      jUk = null;
    if ((this.dWT != null) && (this.dWT.isShowing()))
      this.dWT.dismiss();
    if (this.iMR != null)
      this.iMR.dismiss();
    bg.qX().b(380, this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.NewTaskUI
 * JD-Core Version:    0.6.2
 */