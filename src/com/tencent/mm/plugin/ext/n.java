package com.tencent.mm.plugin.ext;

import com.tencent.mm.c.a.bq;
import com.tencent.mm.c.a.br;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.t;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

public final class n extends g
{
  public n()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof bq))
    {
      z.f("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "mismatched event");
      return false;
    }
    bq localbq = (bq)parame;
    if (am.aym() != null)
      localbq.cIu.cursor = am.aym().sq(localbq.cIt.cIv);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.n
 * JD-Core Version:    0.6.2
 */