package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;

final class ba
  implements m
{
  ba(az paramaz)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (FindMContactInviteUI.a(this.jIC.jIB) != null)
    {
      FindMContactInviteUI.a(this.jIC.jIB).dismiss();
      FindMContactInviteUI.a(this.jIC.jIB, null);
    }
    if (FindMContactInviteUI.k(this.jIC.jIB) != null)
    {
      bg.qX().b(432, FindMContactInviteUI.k(this.jIC.jIB));
      FindMContactInviteUI.a(this.jIC.jIB, null);
    }
    FindMContactInviteUI.l(this.jIC.jIB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ba
 * JD-Core Version:    0.6.2
 */