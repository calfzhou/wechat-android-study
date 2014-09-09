package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.sdk.platformtools.z;

final class k extends Thread
{
  k(AppPanel paramAppPanel)
  {
  }

  public final void run()
  {
    int i = com.tencent.mm.modelcdntran.k.vm().ve();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    z.i("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "preMakeConnection ret:%d", arrayOfObject);
    AppPanel.aBm();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.k
 * JD-Core Version:    0.6.2
 */