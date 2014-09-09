package com.tencent.mm.ui.friend;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.modelfriend.q;

final class al
  implements View.OnClickListener
{
  al(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void onClick(View paramView)
  {
    FindMContactAddUI.f(this.jIz).setVisibility(0);
    FindMContactAddUI.g(this.jIz).setVisibility(8);
    FindMContactAddUI.c(this.jIz).aa(false);
    FindMContactAddUI.c(this.jIz).notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.al
 * JD-Core Version:    0.6.2
 */