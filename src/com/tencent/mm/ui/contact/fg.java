package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.plugin.f.c.n;

final class fg
  implements View.OnClickListener
{
  fg(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(0);
    localn.d(11140, arrayOfObject);
    a.l(this.jBX, "pwdgroup", ".ui.FacingCreateChatRoomAllInONeUI");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fg
 * JD-Core Version:    0.6.2
 */