package com.tencent.mm.ui.friend;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.q;
import com.tencent.mm.plugin.a.b;

final class au
  implements View.OnClickListener
{
  au(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final void onClick(View paramView)
  {
    b.jF(bg.qS() + "," + this.jIB.getClass().getName() + ",R300_400_AddAllButton," + bg.eg("R300_300_AddAllButton") + ",3");
    if (FindMContactInviteUI.d(this.jIB) == 2)
    {
      FindMContactInviteUI.b(this.jIB).aa(true);
      FindMContactInviteUI.b(this.jIB).notifyDataSetChanged();
      FindMContactInviteUI.e(this.jIB).setVisibility(8);
      if (FindMContactInviteUI.f(this.jIB) != null)
        FindMContactInviteUI.f(this.jIB).setVisibility(0);
    }
    do
    {
      return;
      if (FindMContactInviteUI.d(this.jIB) == 1)
      {
        FindMContactInviteUI.b(this.jIB).aa(true);
        FindMContactInviteUI.b(this.jIB).notifyDataSetChanged();
        FindMContactInviteUI.h(this.jIB);
        return;
      }
      FindMContactInviteUI.b(this.jIB).aa(true);
      FindMContactInviteUI.b(this.jIB).notifyDataSetChanged();
      FindMContactInviteUI.e(this.jIB).setVisibility(8);
    }
    while (FindMContactInviteUI.f(this.jIB) == null);
    FindMContactInviteUI.f(this.jIB).setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.au
 * JD-Core Version:    0.6.2
 */