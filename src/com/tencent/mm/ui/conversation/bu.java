package com.tencent.mm.ui.conversation;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.dm;

final class bu
  implements Runnable
{
  bu(aj paramaj)
  {
  }

  public final void run()
  {
    aj localaj = this.jGZ;
    if (dm.cj(localaj.agh()))
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "we got a install");
    while (!dm.r(localaj.agh()))
      return;
    z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "we got an unfinished silence download");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.bu
 * JD-Core Version:    0.6.2
 */