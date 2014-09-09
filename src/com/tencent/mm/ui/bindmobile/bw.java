package com.tencent.mm.ui.bindmobile;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.modelfriend.i;
import com.tencent.mm.ui.friend.InviteFriendUI;

final class bw
  implements AdapterView.OnItemClickListener
{
  bw(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < MobileFriendUI.f(this.jkQ).getHeaderViewsCount());
    i locali;
    do
    {
      return;
      int i = paramInt - MobileFriendUI.f(this.jkQ).getHeaderViewsCount();
      locali = (i)MobileFriendUI.d(this.jkQ).getItem(i);
      if ((locali.getStatus() == 1) || (locali.getStatus() == 2))
        MobileFriendUI.a(this.jkQ, locali);
    }
    while (locali.getStatus() != 0);
    Intent localIntent = new Intent(this.jkQ, InviteFriendUI.class);
    localIntent.putExtra("friend_type", 1);
    localIntent.putExtra("friend_user_name", locali.getUsername());
    localIntent.putExtra("friend_num", locali.vC());
    localIntent.putExtra("friend_nick", locali.vw());
    localIntent.putExtra("friend_weixin_nick", locali.vz());
    localIntent.putExtra("friend_scene", 13);
    this.jkQ.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.bw
 * JD-Core Version:    0.6.2
 */