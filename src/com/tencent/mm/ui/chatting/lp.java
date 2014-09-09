package com.tencent.mm.ui.chatting;

import android.content.Intent;
import com.tencent.mm.am.a;
import com.tencent.mm.ui.base.y;

final class lp
  implements y
{
  lp(hd paramhd)
  {
  }

  public final void onClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
      Intent localIntent = new Intent();
      localIntent.putExtra("map_view_type", 0);
      localIntent.putExtra("map_sender_name", this.jtA.zj());
      localIntent.putExtra("map_talker_name", this.jtA.aUL());
      a.b(this.jtA.agh(), "location", ".ui.RedirectUI", localIntent);
      return;
    case 1:
    }
    hd.ae(this.jtA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.lp
 * JD-Core Version:    0.6.2
 */