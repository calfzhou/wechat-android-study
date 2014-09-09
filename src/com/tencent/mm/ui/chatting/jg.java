package com.tencent.mm.ui.chatting;

import com.tencent.mm.sdk.platformtools.z;

final class jg
  implements Runnable
{
  jg(hd paramhd, long paramLong, int paramInt)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(this.jtR);
    arrayOfObject[1] = Integer.valueOf(this.jtS);
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "if (isShowSearchChatResult || isFromGlobalSearch) on set position %d, set selection %d", arrayOfObject);
    md.c(hd.e(this.jtA), this.jtS);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jg
 * JD-Core Version:    0.6.2
 */