package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class cb
  implements DialogInterface.OnClickListener
{
  cb(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.i("!32@/B4Tb64lLpKxsTbPEeLD3A+BAp2nPFbL", "db dangerous and auto logout");
    LoginHistoryUI.a(this.iPx);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.cb
 * JD-Core Version:    0.6.2
 */