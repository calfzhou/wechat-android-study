package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.plugin.a.b;

final class en
  implements DialogInterface.OnClickListener
{
  en(RegByEmailUI paramRegByEmailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jE("L2_signup");
    Intent localIntent = new Intent(this.iQk, LoginHistoryUI.class);
    localIntent.putExtra("email_address", RegByEmailUI.g(this.iQk));
    this.iQk.startActivity(localIntent);
    this.iQk.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.en
 * JD-Core Version:    0.6.2
 */