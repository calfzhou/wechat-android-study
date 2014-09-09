package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

final class bu
  implements View.OnClickListener
{
  bu(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(View paramView)
  {
    ContactRemarkInfoModUI.g(this.jzm);
    ContactRemarkInfoModUI.e(this.jzm);
    ContactRemarkInfoModUI.a(this.jzm, false);
    this.jzm.aep();
    ContactRemarkInfoModUI.h(this.jzm).requestFocus();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bu
 * JD-Core Version:    0.6.2
 */