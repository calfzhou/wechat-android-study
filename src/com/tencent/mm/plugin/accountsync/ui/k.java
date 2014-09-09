package com.tencent.mm.plugin.accountsync.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.an;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;

final class k
  implements DialogInterface.OnCancelListener
{
  k(InviteFacebookFriendsUI paramInviteFacebookFriendsUI, ay paramay, an paraman)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.dWZ.aNu();
    bg.qX().c(this.dWY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.k
 * JD-Core Version:    0.6.2
 */