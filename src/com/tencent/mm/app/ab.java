package com.tencent.mm.app;

import com.tencent.mm.ab.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ah;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;

final class ab extends ah
{
  ab(WorkerProfile paramWorkerProfile)
  {
  }

  public final void aW(int paramInt)
  {
    if ((paramInt != 5) && (paramInt != 1));
    while ((!bg.oE()) || (bg.rd()))
      return;
    z.v("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "dkmsg Network connected , try send msg.");
    bg.qX().d(new h());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ab
 * JD-Core Version:    0.6.2
 */