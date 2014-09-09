package com.tencent.mm.ui;

import com.tencent.mm.sdk.platformtools.z;

final class m
  implements Runnable
{
  m(CheckCanSubscribeBizUI paramCheckCanSubscribeBizUI, String paramString)
  {
  }

  public final void run()
  {
    z.d("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "onNotifyChange toUserName = " + CheckCanSubscribeBizUI.c(this.iIk) + ", userName = " + this.iIl);
    if (CheckCanSubscribeBizUI.c(this.iIk).equals(this.iIl))
    {
      CheckCanSubscribeBizUI.d(this.iIk);
      if (!CheckCanSubscribeBizUI.e(this.iIk))
        CheckCanSubscribeBizUI.b(this.iIk);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.m
 * JD-Core Version:    0.6.2
 */