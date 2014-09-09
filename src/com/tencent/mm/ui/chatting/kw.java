package com.tencent.mm.ui.chatting;

import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.z;

final class kw
  implements Runnable
{
  kw(hd paramhd, int paramInt)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.jui);
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "dz: scroll to select:%d", arrayOfObject);
    h.a(hd.e(this.jtA), this.jui);
    new cm().postDelayed(new kx(this), 600L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kw
 * JD-Core Version:    0.6.2
 */