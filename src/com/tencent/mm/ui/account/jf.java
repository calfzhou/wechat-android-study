package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.plugin.a.b;

final class jf
  implements DialogInterface.OnClickListener
{
  jf(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jE("R500_100");
    Intent localIntent = new Intent(this.iSh, RegByEmailUI.class);
    localIntent.addFlags(67108864);
    this.iSh.startActivity(localIntent);
    this.iSh.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jf
 * JD-Core Version:    0.6.2
 */