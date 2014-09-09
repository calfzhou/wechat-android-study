package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.q;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.sdk.platformtools.aq;

final class as
  implements aq
{
  as(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final boolean rD()
  {
    FindMContactInviteUI.a(this.jIB, a.aY(this.jIB));
    FindMContactInviteUI.b(this.jIB).j(FindMContactInviteUI.c(this.jIB));
    FindMContactInviteUI.b(this.jIB).b(az.xf());
    return true;
  }

  public final boolean rE()
  {
    if (FindMContactInviteUI.a(this.jIB) != null)
    {
      FindMContactInviteUI.a(this.jIB).dismiss();
      FindMContactInviteUI.a(this.jIB, null);
    }
    FindMContactInviteUI.b(this.jIB).notifyDataSetChanged();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.as
 * JD-Core Version:    0.6.2
 */