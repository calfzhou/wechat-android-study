package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class bd
  implements DialogInterface.OnClickListener
{
  bd(MobileLoginOrForceReg paramMobileLoginOrForceReg, String paramString1, String paramString2, x paramx, Boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ae localae = new ae("", this.iUH, this.iUI, 0, "", MobileLoginOrForceReg.e(this.iUG), MobileLoginOrForceReg.h(this.iUG), MobileLoginOrForceReg.o(this.iUG), "", ((ae)this.dpb).wC(), MobileLoginOrForceReg.m(this.iUG).aRi(), true, this.iUJ.booleanValue());
    bg.qX().d(localae);
    MobileLoginOrForceReg localMobileLoginOrForceReg = this.iUG;
    ActionBarActivity localActionBarActivity = this.iUG.aPI();
    this.iUG.getString(n.buo);
    localMobileLoginOrForceReg.dWT = e.a(localActionBarActivity, this.iUG.getString(n.bZa), true, new be(this, localae));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.bd
 * JD-Core Version:    0.6.2
 */