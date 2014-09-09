package com.tencent.mm.ui.chatting;

import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import com.tencent.mm.y.n;

final class ie
  implements az
{
  ie(hd paramhd)
  {
  }

  public final boolean kJ()
  {
    if (!hd.d(this.jtA))
      return false;
    int i = hd.e(this.jtA).getFirstVisiblePosition() - hd.e(this.jtA).getHeaderViewsCount();
    int j = hd.e(this.jtA).getLastVisiblePosition() - hd.e(this.jtA).getHeaderViewsCount();
    int k = Math.max(i, 0);
    int m = Math.max(Math.min(j, this.jtA.joh.getCount()), 0);
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "first: " + k + " last: " + m);
    if (m < k)
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "start timer to wait listview refresh");
      hd.f(this.jtA).cP(300L);
      return false;
    }
    ap.yh().xG();
    for (int n = k; n <= m; n++)
    {
      ar localar = (ar)this.jtA.joh.getItem(n);
      if ((localar != null) && (localar.jK() == 0) && (localar.aJA()))
      {
        l locall = ap.yg().S(localar.kl());
        if (!locall.xQ())
          ap.yh().a(locall.xM(), localar.kk(), Integer.valueOf(n), com.tencent.mm.h.Tg, this.jtA);
      }
    }
    ap.yh().xH();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ie
 * JD-Core Version:    0.6.2
 */