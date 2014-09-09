package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.MMPullDownView;

final class jw
  implements AdapterView.OnItemClickListener
{
  jw(hd paramhd)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ar localar = (ar)hd.K(this.jtA).getItem(paramInt);
    if ((localar != null) && (!ch.jb(localar.kt())))
    {
      this.jtA.aVI();
      if (hd.I(this.jtA) != null)
        hd.I(this.jtA).K(localar);
      if (!hd.H(this.jtA))
      {
        hd.L(this.jtA);
        hd.F(this.jtA).eT(true);
        hd.e(this.jtA).setTranscriptMode(0);
      }
      hd.F(this.jtA).eR(false);
      hd.F(this.jtA).eS(false);
      int i = this.jtA.joh.f(localar.kk(), false);
      this.jtA.joh.eX(null);
      hd.e(this.jtA).post(new jx(this, paramInt, i));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jw
 * JD-Core Version:    0.6.2
 */