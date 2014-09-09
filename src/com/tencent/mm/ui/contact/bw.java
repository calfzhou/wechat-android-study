package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.mm.h;

final class bw
  implements View.OnFocusChangeListener
{
  bw(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      ContactRemarkInfoModUI.i(this.jzm).setBackgroundResource(h.Wa);
      return;
    }
    ContactRemarkInfoModUI.i(this.jzm).setBackgroundResource(h.VZ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bw
 * JD-Core Version:    0.6.2
 */