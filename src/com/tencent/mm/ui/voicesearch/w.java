package com.tencent.mm.ui.voicesearch;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.plugin.f.c.n;

final class w
  implements MenuItem.OnMenuItemClickListener
{
  w(VoiceSearchResultUI paramVoiceSearchResultUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    n localn;
    StringBuilder localStringBuilder;
    if (!VoiceSearchResultUI.a(this.jZL))
    {
      localn = n.fTF;
      localStringBuilder = new StringBuilder().append(VoiceSearchResultUI.b(this.jZL)).append(",").append(VoiceSearchResultUI.c(this.jZL)).append(",");
      if (VoiceSearchResultUI.d(this.jZL) != null)
        break label95;
    }
    label95: for (int i = 0; ; i = VoiceSearchResultUI.d(this.jZL).length)
    {
      localn.q(10452, i + ",0");
      this.jZL.finish();
      return true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.w
 * JD-Core Version:    0.6.2
 */