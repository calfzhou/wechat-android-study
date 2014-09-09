package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.b;

final class an
  implements DialogInterface.OnClickListener
{
  an(ag paramag)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.b(true, bg.qS() + "," + getClass().getName() + ",R200_200," + bg.eg("R200_200") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.an
 * JD-Core Version:    0.6.2
 */