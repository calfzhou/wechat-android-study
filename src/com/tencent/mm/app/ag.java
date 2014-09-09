package com.tencent.mm.app;

import com.tencent.mm.c.a.ju;
import com.tencent.mm.c.a.jv;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;

final class ag extends g
{
  ag(WorkerProfile paramWorkerProfile)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    ju localju = (ju)parame;
    if (!ch.jb(localju.cNK.cNO))
      s.a(localju.cNK.cKt, localju.cNK.appId, localju.cNK.appName, localju.cNK.cIA, localju.cNK.cNL, localju.cNK.cNO);
    while (true)
    {
      return false;
      s.a(localju.cNK.cKt, localju.cNK.appId, localju.cNK.appName, localju.cNK.cIA, localju.cNK.cNL, localju.cNK.cNM, localju.cNK.cNN);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ag
 * JD-Core Version:    0.6.2
 */