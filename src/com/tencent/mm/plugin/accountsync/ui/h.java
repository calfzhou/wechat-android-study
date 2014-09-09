package com.tencent.mm.plugin.accountsync.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class h
  implements AdapterView.OnItemClickListener
{
  h(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (InviteFacebookFriendsUI.a(this.dWW).DV().length >= 50)
    {
      e.b(this.dWW, n.bGT, n.buo);
      return;
    }
    InviteFacebookFriendsUI.a(this.dWW).eV(paramInt - InviteFacebookFriendsUI.b(this.dWW).getHeaderViewsCount());
    if (InviteFacebookFriendsUI.a(this.dWW).DV().length > 0)
    {
      this.dWW.eC(true);
      return;
    }
    this.dWW.eC(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.h
 * JD-Core Version:    0.6.2
 */