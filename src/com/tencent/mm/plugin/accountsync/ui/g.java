package com.tencent.mm.plugin.accountsync.ui;

import android.widget.TextView;
import com.tencent.mm.model.x;
import com.tencent.mm.ui.cc;

final class g
  implements cc
{
  g(InviteFacebookFriendsUI paramInviteFacebookFriendsUI, TextView paramTextView)
  {
  }

  public final void DT()
  {
    if (x.qc())
    {
      if (InviteFacebookFriendsUI.a(this.dWW).getCount() == 0)
        this.dWX.setVisibility(0);
    }
    else
      return;
    this.dWX.setVisibility(8);
  }

  public final void DU()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.g
 * JD-Core Version:    0.6.2
 */