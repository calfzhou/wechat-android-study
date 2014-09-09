package com.tencent.mm.ui.bindlinkedin;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.aa.c;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class t
  implements MenuItem.OnMenuItemClickListener
{
  t(InviteLinkedInFriendUI paramInviteLinkedInFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if ((InviteLinkedInFriendUI.a(this.jjy).getText().toString().trim().length() > 0) && (InviteLinkedInFriendUI.b(this.jjy).getText().toString().trim().length() > 0))
    {
      InviteLinkedInFriendUI.a(this.jjy, new c(InviteLinkedInFriendUI.c(this.jjy), InviteLinkedInFriendUI.a(this.jjy).getText().toString(), InviteLinkedInFriendUI.b(this.jjy).getText().toString()));
      bg.qX().d(InviteLinkedInFriendUI.d(this.jjy));
      InviteLinkedInFriendUI.a(this.jjy, e.a(this.jjy, this.jjy.getString(n.aAy), false, new u(this)));
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.t
 * JD-Core Version:    0.6.2
 */