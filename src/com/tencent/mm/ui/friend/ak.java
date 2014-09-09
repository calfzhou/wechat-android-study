package com.tencent.mm.ui.friend;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.q;
import com.tencent.mm.plugin.a.b;

final class ak
  implements View.OnClickListener
{
  ak(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void onClick(View paramView)
  {
    b.jF(bg.qS() + "," + this.jIz.getClass().getName() + ",R300_300_AddAllButton," + bg.eg("R300_300_AddAllButton") + ",3");
    if (FindMContactAddUI.e(this.jIz) == 2)
    {
      FindMContactAddUI.c(this.jIz).aa(true);
      FindMContactAddUI.c(this.jIz).notifyDataSetChanged();
      FindMContactAddUI.f(this.jIz).setVisibility(8);
      if (FindMContactAddUI.g(this.jIz) != null)
        FindMContactAddUI.g(this.jIz).setVisibility(0);
    }
    do
    {
      return;
      if (FindMContactAddUI.e(this.jIz) == 1)
      {
        FindMContactAddUI.c(this.jIz).aa(true);
        FindMContactAddUI.c(this.jIz).notifyDataSetChanged();
        FindMContactAddUI.i(this.jIz);
        return;
      }
      FindMContactAddUI.c(this.jIz).aa(true);
      FindMContactAddUI.c(this.jIz).notifyDataSetChanged();
      FindMContactAddUI.f(this.jIz).setVisibility(8);
    }
    while (FindMContactAddUI.g(this.jIz) == null);
    FindMContactAddUI.g(this.jIz).setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ak
 * JD-Core Version:    0.6.2
 */