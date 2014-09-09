package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cq;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.plugin.accountsync.a.f;
import com.tencent.mm.plugin.accountsync.a.i;

final class dd
  implements DialogInterface.OnClickListener
{
  dd(ct paramct)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ct.a(this.iUV).finish();
    f.eU(i.dWy);
    cq.rO();
    b.jE(ct.a(this.iUV).fUt);
    b.b(false, bg.qS() + "," + getClass().getName() + ",RE200_300," + bg.eg("RE200_300") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.dd
 * JD-Core Version:    0.6.2
 */