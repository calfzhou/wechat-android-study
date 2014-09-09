package com.tencent.mm.app;

import com.tencent.mm.ab.h;
import com.tencent.mm.c.a.jw;
import com.tencent.mm.c.a.jx;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;

final class af extends g
{
  af(WorkerProfile paramWorkerProfile)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    jw localjw = (jw)parame;
    String str1 = localjw.cNP.cNQ;
    String str2 = localjw.cNP.content;
    int i = localjw.cNP.type;
    h localh = new h(str1, str2, i);
    bg.qX().d(localh);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.af
 * JD-Core Version:    0.6.2
 */