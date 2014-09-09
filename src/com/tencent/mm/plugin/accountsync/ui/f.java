package com.tencent.mm.plugin.accountsync.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.ui.account.FacebookAuthUI;

final class f
  implements DialogInterface.OnClickListener
{
  f(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent(this.dWW.aPI(), FacebookAuthUI.class);
    localIntent.putExtra("is_force_unbind", true);
    this.dWW.aPI().startActivity(localIntent);
    this.dWW.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.f
 * JD-Core Version:    0.6.2
 */