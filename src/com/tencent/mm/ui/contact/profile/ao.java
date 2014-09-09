package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import com.tencent.mm.model.x;
import com.tencent.mm.n;

final class ao
  implements cb
{
  private Context mContext;

  public ao(ak paramak, Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    if ((0x800000 & x.pO()) == 0);
    for (boolean bool = true; ; bool = false)
    {
      paramHelperHeaderPreference.fJ(bool);
      return;
    }
  }

  public final CharSequence getHint()
  {
    return this.mContext.getString(n.bBH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ao
 * JD-Core Version:    0.6.2
 */