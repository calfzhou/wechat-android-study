package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class cx
  implements DialogInterface.OnClickListener
{
  cx(ct paramct, String paramString1, String paramString2, x paramx, Boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bg.qX().a(126, this.iUV);
    ae localae = new ae("", this.iUH, this.iUI, 0, "", ct.a(this.iUV).cTZ, ct.c(this.iUV), ct.a(this.iUV).dCP, "", ((ae)this.dpb).wC(), ct.a(this.iUV).iMR.aRi(), true, this.iUJ.booleanValue());
    bg.qX().d(localae);
    MobileVerifyUI localMobileVerifyUI1 = ct.a(this.iUV);
    MobileVerifyUI localMobileVerifyUI2 = ct.a(this.iUV);
    ct.a(this.iUV).getString(n.buo);
    localMobileVerifyUI1.dWT = e.a(localMobileVerifyUI2, ct.a(this.iUV).getString(n.bZa), true, new cy(this, localae));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.cx
 * JD-Core Version:    0.6.2
 */