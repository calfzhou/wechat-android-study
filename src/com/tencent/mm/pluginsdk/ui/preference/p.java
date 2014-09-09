package com.tencent.mm.pluginsdk.ui.preference;

import android.view.View;
import android.view.View.OnClickListener;

final class p
  implements View.OnClickListener
{
  p(LicencePreference paramLicencePreference)
  {
  }

  public final void onClick(View paramView)
  {
    if (LicencePreference.a(this.hHr) != null)
      LicencePreference.a(this.hHr).onClick(paramView);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.p
 * JD-Core Version:    0.6.2
 */