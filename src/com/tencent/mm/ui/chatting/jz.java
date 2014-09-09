package com.tencent.mm.ui.chatting;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.cx;

final class jz
  implements cx
{
  jz(hd paramhd)
  {
  }

  public final void Zc()
  {
    if ((hd.G(this.jtA)) || (hd.H(this.jtA)) || (hd.M(this.jtA)))
      this.jtA.joh.aUT();
    if (this.jtA.joh.aUW())
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(1);
      arrayOfObject2[1] = Integer.valueOf(hd.F(this.jtA).aSo());
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "pullDownView showTopAll on set position %d, set pullDownView.getTopHeight() %d", arrayOfObject2);
      md.a(hd.e(this.jtA), 1, hd.F(this.jtA).aSo());
      hd.F(this.jtA).eR(true);
    }
    int i;
    int j;
    do
    {
      return;
      i = this.jtA.joh.getCount();
      this.jtA.joh.YZ();
      this.jtA.joh.eX(null);
      j = this.jtA.joh.getCount();
    }
    while (j <= i);
    int k = j - i;
    this.jtA.joh.qh(k);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(k + 1);
    arrayOfObject1[1] = Integer.valueOf(hd.N(this.jtA) + hd.F(this.jtA).aSo());
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "pullDownView nowCount > preCount on set position %d, set pullDownView.getTopHeight() %d", arrayOfObject1);
    md.a(hd.e(this.jtA), k + 1, hd.N(this.jtA) + hd.F(this.jtA).aSo());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jz
 * JD-Core Version:    0.6.2
 */