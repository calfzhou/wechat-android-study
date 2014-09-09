package com.tencent.mm.ui.friend;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.modelfriend.q;

final class av
  implements View.OnClickListener
{
  av(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final void onClick(View paramView)
  {
    FindMContactInviteUI.e(this.jIB).setVisibility(0);
    FindMContactInviteUI.f(this.jIB).setVisibility(8);
    FindMContactInviteUI.b(this.jIB).aa(false);
    FindMContactInviteUI.b(this.jIB).notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.av
 * JD-Core Version:    0.6.2
 */