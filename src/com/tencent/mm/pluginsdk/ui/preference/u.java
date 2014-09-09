package com.tencent.mm.pluginsdk.ui.preference;

import com.tencent.mm.g.a;

final class u
  implements Runnable
{
  u(NormalUserHeaderPreference paramNormalUserHeaderPreference)
  {
  }

  public final void run()
  {
    NormalUserHeaderPreference.d(this.hHW);
    NormalUserHeaderPreference.e(this.hHW);
    NormalUserHeaderPreference.f(this.hHW);
    FMessageListView localFMessageListView;
    if (NormalUserHeaderPreference.g(this.hHW) != null)
    {
      localFMessageListView = NormalUserHeaderPreference.g(this.hHW);
      if (a.cv(NormalUserHeaderPreference.b(this.hHW).getType()))
        break label63;
    }
    label63: for (boolean bool = true; ; bool = false)
    {
      localFMessageListView.dM(bool);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.u
 * JD-Core Version:    0.6.2
 */