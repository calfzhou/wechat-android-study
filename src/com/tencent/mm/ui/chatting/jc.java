package com.tencent.mm.ui.chatting;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.cv;

final class jc
  implements Runnable
{
  jc(jb paramjb, String paramString)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.jtQ.dtH);
    arrayOfObject[1] = this.jtP;
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "preload position : %s bigImgPath : %s", arrayOfObject);
    hd.h(this.jtQ.jtA).i(this.jtQ.jtO, this.jtP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jc
 * JD-Core Version:    0.6.2
 */