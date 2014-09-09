package com.tencent.mm.ui.chatting;

import com.tencent.mm.sdk.platformtools.z;

final class jx
  implements Runnable
{
  jx(jw paramjw, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.dYO);
    arrayOfObject[1] = Integer.valueOf(this.jtS);
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "on search click, click position %d, set selection %d", arrayOfObject);
    md.c(hd.e(this.jtY.jtA), this.jtS);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jx
 * JD-Core Version:    0.6.2
 */