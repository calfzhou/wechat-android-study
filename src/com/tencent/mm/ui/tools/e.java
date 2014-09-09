package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class e
  implements View.OnClickListener
{
  e(ActionBarSearchView paramActionBarSearchView)
  {
  }

  public final void onClick(View paramView)
  {
    if (j.jOO == ActionBarSearchView.c(this.jOM))
    {
      z.d("!44@/B4Tb64lLpL4/IPflj+tleANqnL7qi1AFYpzfZUCVoE=", "on status btn click, cur status is clear");
      this.jOM.ga(true);
    }
    do
    {
      return;
      z.d("!44@/B4Tb64lLpL4/IPflj+tleANqnL7qi1AFYpzfZUCVoE=", "on status btn click, cur status is voice search");
    }
    while (ActionBarSearchView.b(this.jOM) == null);
    ActionBarSearchView.b(this.jOM).aZE();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.e
 * JD-Core Version:    0.6.2
 */