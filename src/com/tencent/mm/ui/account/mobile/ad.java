package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.b;

final class ad
  implements DialogInterface.OnClickListener
{
  ad(aa paramaa)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    aa.a(this.iUk, aa.a(this.iUk).iPd + aa.a(this.iUk).iPe);
    b.jF(bg.qS() + "," + getClass().getName() + ",L200_300," + bg.eg("L200_300") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.ad
 * JD-Core Version:    0.6.2
 */