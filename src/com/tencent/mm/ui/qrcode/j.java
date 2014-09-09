package com.tencent.mm.ui.qrcode;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.ui.account.FacebookAuthUI;

final class j
  implements DialogInterface.OnClickListener
{
  j(ShareToQQUI paramShareToQQUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent(this.jLd.aPI(), FacebookAuthUI.class);
    localIntent.putExtra("is_force_unbind", true);
    this.jLd.aPI().startActivity(localIntent);
    this.jLd.XF();
    this.jLd.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.j
 * JD-Core Version:    0.6.2
 */