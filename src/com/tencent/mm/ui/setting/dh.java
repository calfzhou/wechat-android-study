package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.am.a;
import com.tencent.mm.n;

final class dh
  implements DialogInterface.OnClickListener
{
  dh(SettingsModifyEmailAddrUI paramSettingsModifyEmailAddrUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("kintent_hint", this.jNu.getString(n.cfY));
    a.b(this.jNu, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.dh
 * JD-Core Version:    0.6.2
 */