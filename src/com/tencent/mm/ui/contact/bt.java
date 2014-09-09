package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.base.MMClearEditText;

final class bt
  implements View.OnClickListener
{
  bt(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(View paramView)
  {
    ContactRemarkInfoModUI.e(this.jzm);
    ContactRemarkInfoModUI.a(this.jzm, false);
    ContactRemarkInfoModUI.f(this.jzm).requestFocus();
    this.jzm.aep();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bt
 * JD-Core Version:    0.6.2
 */