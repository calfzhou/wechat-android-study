package com.tencent.mm.ui.chatting;

import com.tencent.mm.n.p;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class ia
  implements p
{
  ia(hd paramhd)
  {
  }

  public final void eX(String paramString)
  {
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "cpan[notifyChanged] user:%s", new Object[] { paramString });
    hd.j(this.jtA).postDelayed(new ib(this, paramString), 1000L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ia
 * JD-Core Version:    0.6.2
 */