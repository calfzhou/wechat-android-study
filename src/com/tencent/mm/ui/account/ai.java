package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;

final class ai
  implements DialogInterface.OnClickListener
{
  ai(FacebookFriendUI paramFacebookFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent(this.iOo.aPI(), FacebookAuthUI.class);
    localIntent.putExtra("is_force_unbind", true);
    this.iOo.aPI().startActivity(localIntent);
    this.iOo.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ai
 * JD-Core Version:    0.6.2
 */