package com.tencent.mm.ui.friend;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.c.a.hh;
import com.tencent.mm.c.a.hj;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ax;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.y;
import com.tencent.mm.modelfriend.z;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

final class bz
  implements AdapterView.OnItemClickListener
{
  bz(QQFriendUI paramQQFriendUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < QQFriendUI.c(this.jJe).getHeaderViewsCount());
    ax localax;
    do
    {
      hh localhh;
      do
      {
        return;
        int i = paramInt - QQFriendUI.c(this.jJe).getHeaderViewsCount();
        localax = (ax)QQFriendUI.d(this.jJe).getItem(i);
        if (!this.jJe.getIntent().getBooleanExtra("qqgroup_sendmessage", false))
          break;
        localhh = new hh();
        localhh.cLX.cDf = 0;
        localhh.cLX.cLZ = (localax.wP() + "@qqim");
        localhh.cLX.cGZ = localax.getDisplayName();
        com.tencent.mm.sdk.c.a.aGB().g(localhh);
      }
      while (!localhh.cLY.cCM);
      Intent localIntent1 = new Intent();
      localIntent1.putExtra("Chat_User", localax.wP() + "@qqim");
      com.tencent.mm.plugin.a.a.dWo.d(localIntent1, this.jJe);
      return;
      if ((localax.wQ() == 1) || (localax.wQ() == 2))
      {
        i locali = bg.qW().oT().ys(localax.getUsername());
        if ((locali != null) && (locali.aIg()))
          n.fTF.q(10298, localax.getUsername() + ",12");
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("Contact_User", localax.getUsername());
        localIntent2.putExtra("Contact_Nick", localax.iV());
        localIntent2.putExtra("Contact_Uin", localax.wP());
        localIntent2.putExtra("Contact_QQNick", localax.getDisplayName());
        localIntent2.putExtra("Contact_Scene", 12);
        localIntent2.putExtra("Contact_RemarkName", localax.wU());
        y localy = az.xb().gv(localax.getUsername());
        if (localy != null)
          localIntent2.putExtra("Contact_Sex", localy.jj());
        localIntent2.putExtra("Contact_ShowUserName", false);
        com.tencent.mm.plugin.a.a.dWo.c(localIntent2, this.jJe);
        return;
      }
    }
    while (localax.wQ() != 0);
    Intent localIntent3 = new Intent(this.jJe, InviteFriendUI.class);
    localIntent3.putExtra("friend_type", 0);
    localIntent3.putExtra("friend_user_name", localax.getUsername());
    localIntent3.putExtra("friend_num", localax.wP());
    localIntent3.putExtra("friend_nick", localax.getDisplayName());
    localIntent3.putExtra("friend_weixin_nick", localax.iV());
    localIntent3.putExtra("friend_scene", 12);
    this.jJe.startActivity(localIntent3);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.bz
 * JD-Core Version:    0.6.2
 */