package com.tencent.mm.ui.chatting;

import android.widget.RelativeLayout;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.cm;

final class hf
  implements ma
{
  hf(hd paramhd)
  {
  }

  public final boolean aWl()
  {
    hd.k(this.jtA);
    hd.l(this.jtA);
    hd.m(this.jtA);
    if (hd.n(this.jtA) == null)
    {
      hd.a(this.jtA, i.aVA);
      hd.a(this.jtA, (RelativeLayout)this.jtA.findViewById(i.ajt));
    }
    hd.n(this.jtA).setVisibility(0);
    hd.j(this.jtA).postDelayed(new hg(this), 5000L);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hf
 * JD-Core Version:    0.6.2
 */