package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.platformtools.ap;

final class by
  implements View.OnClickListener
{
  by(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(View paramView)
  {
    if ((ap.jb(ContactRemarkInfoModUI.l(this.jzm))) || (ContactRemarkInfoModUI.o(this.jzm)))
    {
      ContactRemarkInfoModUI.b(this.jzm, false);
      ContactRemarkInfoModUI.g(this.jzm);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.by
 * JD-Core Version:    0.6.2
 */