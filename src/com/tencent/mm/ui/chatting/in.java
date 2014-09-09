package com.tencent.mm.ui.chatting;

import com.tencent.mm.sdk.platformtools.z;

final class in
  implements Runnable
{
  in(hd paramhd)
  {
  }

  public final void run()
  {
    if ((hd.t(this.jtA)) || (hd.u(this.jtA) != 0))
    {
      z.w("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "error state user has touch listview, not need to scroll to last");
      return;
    }
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "first time in, scroll to last");
    hd.a(this.jtA, true, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.in
 * JD-Core Version:    0.6.2
 */