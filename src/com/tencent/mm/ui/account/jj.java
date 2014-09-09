package com.tencent.mm.ui.account;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.mm.sdk.platformtools.ay;

final class jj
  implements View.OnFocusChangeListener
{
  jj(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      RegSetInfoUI.r(this.iSh);
      RegSetInfoUI.m(this.iSh).cP(200L);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jj
 * JD-Core Version:    0.6.2
 */