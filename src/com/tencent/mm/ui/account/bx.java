package com.tencent.mm.ui.account;

import com.tencent.mm.modelsimple.i;
import com.tencent.mm.sdk.platformtools.z;

final class bx
  implements Runnable
{
  bx(LoginHistoryUI paramLoginHistoryUI, i parami)
  {
  }

  public final void run()
  {
    z.d("!32@/B4Tb64lLpKxsTbPEeLD3A+BAp2nPFbL", "onSceneEnd, in runnable");
    LoginHistoryUI.a(this.iPx, this.iPz);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bx
 * JD-Core Version:    0.6.2
 */