package com.tencent.mm.ui.contact;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.modelfriend.i;
import com.tencent.mm.ui.base.MMClearEditText;

final class bo
  implements View.OnClickListener
{
  bo(ContactRemarkInfoModUI paramContactRemarkInfoModUI, i parami)
  {
  }

  public final void onClick(View paramView)
  {
    ContactRemarkInfoModUI.e(this.jzm);
    ContactRemarkInfoModUI.a(this.jzm, true);
    ContactRemarkInfoModUI.f(this.jzm).setText(this.jzo.vw());
    ContactRemarkInfoModUI.f(this.jzm).setSelection(ContactRemarkInfoModUI.f(this.jzm).getText().length());
    ContactRemarkInfoModUI.w(this.jzm).setVisibility(8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bo
 * JD-Core Version:    0.6.2
 */