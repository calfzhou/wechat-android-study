package com.tencent.mm.ui.account.bind;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class e
  implements DialogInterface.OnClickListener
{
  e(BindMobileUI paramBindMobileUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    BindMobileUI.a(this.iTO, this.iTN);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.e
 * JD-Core Version:    0.6.2
 */