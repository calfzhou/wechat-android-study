package com.tencent.mm.ui.account;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class hs
  implements CompoundButton.OnCheckedChangeListener
{
  hs(RegByQQUI paramRegByQQUI)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    RegByQQUI.a(this.iRG);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hs
 * JD-Core Version:    0.6.2
 */