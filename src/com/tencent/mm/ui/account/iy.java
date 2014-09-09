package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.ui.account.mobile.MobileInputUI;

final class iy
  implements DialogInterface.OnClickListener
{
  iy(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jE("R200_100");
    Intent localIntent = new Intent(this.iSh, MobileInputUI.class);
    localIntent.putExtra("mobile_input_purpose", 2);
    localIntent.addFlags(67108864);
    this.iSh.startActivity(localIntent);
    this.iSh.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.iy
 * JD-Core Version:    0.6.2
 */