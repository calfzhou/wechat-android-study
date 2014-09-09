package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.mm.h;

final class dh
  implements View.OnFocusChangeListener
{
  dh(ModRemarkNameUI paramModRemarkNameUI)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      ModRemarkNameUI.h(this.jAS).setBackgroundResource(h.Wa);
      return;
    }
    ModRemarkNameUI.h(this.jAS).setBackgroundResource(h.VZ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dh
 * JD-Core Version:    0.6.2
 */