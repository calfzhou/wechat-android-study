package com.tencent.mm.modelfriend;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;

final class b
  implements h
{
  b(AddrBookObserver.AddrBookService paramAddrBookService)
  {
  }

  public final void Z(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      z.v("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "onSyncEnd not sync succ, do not upload");
      this.dsI.stopSelf();
      AddrBookObserver.AddrBookService.dsC = false;
      return;
    }
    System.currentTimeMillis();
    au localau = new au(aa.vN(), aa.wh());
    bg.qX().d(localau);
    this.dsI.stopSelf();
    AddrBookObserver.AddrBookService.dsC = false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.b
 * JD-Core Version:    0.6.2
 */