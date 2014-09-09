package com.tencent.mm.ui.qrcode;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.ui.account.FacebookAuthUI;

final class m
  implements DialogInterface.OnClickListener
{
  m(ShareToQQUI paramShareToQQUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent(this.jLd.aPI(), FacebookAuthUI.class);
    localIntent.putExtra("is_force_unbind", true);
    this.jLd.aPI().startActivityForResult(localIntent, 8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.m
 * JD-Core Version:    0.6.2
 */