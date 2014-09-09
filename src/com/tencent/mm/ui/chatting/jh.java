package com.tencent.mm.ui.chatting;

import android.widget.ListView;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.cc;

final class jh
  implements cc
{
  private int count = 0;

  jh(hd paramhd)
  {
  }

  public final void DT()
  {
    if (this.jtA.aVK())
    {
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onPostRset fragment not foreground, return");
      return;
    }
    hd.f(this.jtA).aNu();
    if (hd.D(this.jtA))
      hd.f(this.jtA).cP(2000L);
    while (true)
    {
      hd.E(this.jtA);
      hd.e(this.jtA).post(new ji(this));
      hd.F(this.jtA).eR(this.jtA.joh.aUW());
      hd.F(this.jtA).eS(this.jtA.joh.aUX());
      if ((this.jtA.joh.Us() - this.count > 0) && (!hd.G(this.jtA)))
        this.jtA.a(false, false, null);
      if ((hd.H(this.jtA)) && (!hd.I(this.jtA).aVg()) && (this.jtA.joh.aUV()))
        this.jtA.a(false, false, null);
      if (this.jtA.aPF() == 1)
        this.jtA.a(true, false, null);
      if (!this.jtA.aVX())
        break;
      long l = System.currentTimeMillis();
      this.jtA.aVT();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(System.currentTimeMillis() - l);
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "ChattingUI writeOpLogAndMarkRead last : %d", arrayOfObject);
      return;
      hd.f(this.jtA).cP(300L);
    }
  }

  public final void DU()
  {
    if (this.jtA.aVK())
    {
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onPreReset fragment not foreground, return");
      return;
    }
    n.fTF.js(13);
    this.count = this.jtA.joh.Us();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jh
 * JD-Core Version:    0.6.2
 */