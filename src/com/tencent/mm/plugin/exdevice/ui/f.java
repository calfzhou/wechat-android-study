package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.widget.ListView;

final class f
  implements d
{
  f(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final boolean hf(int paramInt)
  {
    if (paramInt == 1)
    {
      ExdeviceRankInfoUI.a(this.eLs).setVisibility(0);
      ExdeviceRankInfoUI.b(this.eLs).setVisibility(8);
      return true;
    }
    ExdeviceRankInfoUI.a(this.eLs).setVisibility(8);
    ExdeviceRankInfoUI.b(this.eLs).setVisibility(0);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.f
 * JD-Core Version:    0.6.2
 */