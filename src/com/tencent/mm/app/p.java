package com.tencent.mm.app;

import com.tencent.mm.c.a.ka;
import com.tencent.mm.c.a.kb;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.ui.contact.bb;

final class p extends g
{
  p(WorkerProfile paramWorkerProfile)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    ka localka = (ka)parame;
    bb.c(localka.cNT.intent, localka.cNT.username);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.p
 * JD-Core Version:    0.6.2
 */