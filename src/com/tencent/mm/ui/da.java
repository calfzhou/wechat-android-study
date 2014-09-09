package com.tencent.mm.ui;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.e;

final class da
  implements CompoundButton.OnCheckedChangeListener
{
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      bg.qW().oQ().set(4105, Boolean.valueOf(true));
      return;
    }
    bg.qW().oQ().set(4105, Boolean.valueOf(false));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.da
 * JD-Core Version:    0.6.2
 */