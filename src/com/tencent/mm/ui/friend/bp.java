package com.tencent.mm.ui.friend;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.c.a.hh;
import com.tencent.mm.c.a.hj;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.c.f;

final class bp
  implements View.OnClickListener
{
  bp(InviteFriendUI paramInviteFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    hh localhh = new hh();
    localhh.cLX.cDf = 0;
    localhh.cLX.cLZ = (InviteFriendUI.b(this.jIS) + "@qqim");
    localhh.cLX.cGZ = InviteFriendUI.g(this.jIS);
    com.tencent.mm.sdk.c.a.aGB().g(localhh);
    if (localhh.cLY.cCM)
      com.tencent.mm.plugin.a.a.dWo.d(new Intent().putExtra("Chat_User", InviteFriendUI.b(this.jIS) + "@qqim"), this.jIS);
    this.jIS.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.bp
 * JD-Core Version:    0.6.2
 */