package com.tencent.mm.ui.voicesearch;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.storage.i;

final class x
  implements AdapterView.OnItemClickListener
{
  x(VoiceSearchResultUI paramVoiceSearchResultUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    n localn;
    StringBuilder localStringBuilder;
    if (!VoiceSearchResultUI.a(this.jZL))
    {
      localn = n.fTF;
      localStringBuilder = new StringBuilder().append(VoiceSearchResultUI.b(this.jZL)).append(",").append(VoiceSearchResultUI.c(this.jZL)).append(",");
      if (VoiceSearchResultUI.d(this.jZL) != null)
        break label125;
    }
    label125: for (int i = 0; ; i = VoiceSearchResultUI.d(this.jZL).length)
    {
      localn.q(10452, i + "," + paramInt);
      i locali = VoiceSearchResultUI.e(this.jZL).ry(paramInt);
      this.jZL.bO(locali.getUsername(), locali.od());
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.x
 * JD-Core Version:    0.6.2
 */