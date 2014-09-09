package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.plugin.a.b;

final class jb
  implements DialogInterface.OnClickListener
{
  jb(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jE("R400_100_signup");
    Intent localIntent = new Intent(this.iSh, RegByQQUI.class);
    localIntent.addFlags(67108864);
    this.iSh.startActivity(localIntent);
    this.iSh.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jb
 * JD-Core Version:    0.6.2
 */