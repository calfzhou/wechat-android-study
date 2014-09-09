package com.tencent.mm.ui.conversation;

import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

final class t
  implements Runnable
{
  t(r paramr)
  {
  }

  public final void run()
  {
    if (!bg.oE())
    {
      r.f(this.jFF).aNu();
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HIqvfOQFnQw777RTG6BmS5Y=", "dkpno handleDataChange acc has not ready");
      return;
    }
    long l1 = ap.CM();
    r.g(this.jFF);
    long l2 = 3L * ap.ac(l1);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(l2);
    arrayOfObject[1] = Long.valueOf(r.mI());
    arrayOfObject[2] = Boolean.valueOf(r.d(this.jFF));
    z.d("!44@/B4Tb64lLpJN/RyYD3u7HIqvfOQFnQw777RTG6BmS5Y=", "dkpno handleDataChange guest:%d old:%d needNotify:%b", arrayOfObject);
    r.s((l2 + r.mI()) / 2L);
    r.h(this.jFF);
    r.f(this.jFF).cP(r.mI());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.t
 * JD-Core Version:    0.6.2
 */