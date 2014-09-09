package com.tencent.mm.ui.friend;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.q;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.ui.base.e;

final class az
  implements DialogInterface.OnClickListener
{
  az(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (FindMContactInviteUI.j(this.jIB) == 1)
      b.jF(bg.qS() + "," + getClass().getName() + ",R300_500_QQ," + bg.eg("R300_500_QQ") + ",3");
    while (true)
    {
      bg.qX().a(432, FindMContactInviteUI.a(this.jIB, new ba(this)));
      FindMContactInviteUI localFindMContactInviteUI = this.jIB;
      ActionBarActivity localActionBarActivity = this.jIB.aPI();
      this.jIB.getString(n.buo);
      FindMContactInviteUI.a(localFindMContactInviteUI, e.a(localActionBarActivity, this.jIB.getString(n.bJy), true, new bb(this)));
      FindMContactInviteUI.b(this.jIB).gt(FindMContactInviteUI.m(this.jIB));
      return;
      b.jF(bg.qS() + "," + getClass().getName() + ",R300_500_phone," + bg.eg("R300_500_phone") + ",3");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.az
 * JD-Core Version:    0.6.2
 */