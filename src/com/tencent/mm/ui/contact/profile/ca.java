package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import com.tencent.mm.model.x;
import com.tencent.mm.n;

final class ca
  implements cb
{
  private Context context;

  public ca(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    if ((0x8000 & x.pO()) == 0);
    for (boolean bool = true; ; bool = false)
    {
      paramHelperHeaderPreference.fJ(bool);
      return;
    }
  }

  public final CharSequence getHint()
  {
    return this.context.getString(n.bBC);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ca
 * JD-Core Version:    0.6.2
 */