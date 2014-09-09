package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import com.tencent.mm.model.x;
import com.tencent.mm.n;

final class cc
  implements cb
{
  private Context context;

  public cc(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    if ((0x1000000 & x.pO()) == 0);
    for (boolean bool = true; ; bool = false)
    {
      paramHelperHeaderPreference.fJ(bool);
      return;
    }
  }

  public final CharSequence getHint()
  {
    return this.context.getString(n.bBX);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cc
 * JD-Core Version:    0.6.2
 */