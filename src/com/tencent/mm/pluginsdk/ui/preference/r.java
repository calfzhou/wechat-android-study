package com.tencent.mm.pluginsdk.ui.preference;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.pluginsdk.ui.v;
import com.tencent.mm.storage.i;

final class r
  implements View.OnClickListener
{
  r(NormalUserHeaderPreference paramNormalUserHeaderPreference)
  {
  }

  public final void onClick(View paramView)
  {
    String str = NormalUserHeaderPreference.b(this.hHW).getUsername();
    v localv = new v(NormalUserHeaderPreference.a(this.hHW), str);
    if (i.yc(str))
      i.ye(str);
    localv.aAf();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.r
 * JD-Core Version:    0.6.2
 */