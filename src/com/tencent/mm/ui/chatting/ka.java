package com.tencent.mm.ui.chatting;

import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.cv;

final class ka
  implements cv
{
  ka(hd paramhd)
  {
  }

  public final void NE()
  {
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "buttom load data");
    if ((hd.G(this.jtA)) || (hd.H(this.jtA)))
      this.jtA.joh.aUU();
    if (this.jtA.joh.aUX())
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(-1 + this.jtA.joh.getCount());
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "pullDownView showButtomAll on set position %d", arrayOfObject);
      hd.e(this.jtA).setSelection(-1 + this.jtA.joh.getCount());
      hd.F(this.jtA).eS(true);
    }
    int i;
    do
    {
      return;
      i = this.jtA.joh.getCount();
    }
    while (this.jtA.joh.getCount() <= i);
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "pullDownView height: " + hd.F(this.jtA).getHeight() + ", chatHistoryList height: " + hd.e(this.jtA).getHeight() + " header height: " + this.jtA.jsf.getHeight() + " topHeight: " + hd.F(this.jtA).aSo());
    md.a(hd.e(this.jtA), i + 1, hd.e(this.jtA).getHeight() - hd.N(this.jtA) - hd.F(this.jtA).aSo());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ka
 * JD-Core Version:    0.6.2
 */