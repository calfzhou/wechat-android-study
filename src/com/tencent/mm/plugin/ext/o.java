package com.tencent.mm.plugin.ext;

import com.tencent.mm.ab.h;
import com.tencent.mm.c.a.bw;
import com.tencent.mm.c.a.bx;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

public final class o extends g
{
  public o()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof bw))
    {
      z.f("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "mismatched event");
      return false;
    }
    bw localbw = (bw)parame;
    String str1 = localbw.cIK.cIM;
    String str2 = localbw.cIK.content;
    int i = localbw.cIK.type;
    h localh = new h(str1, str2, i);
    localbw.cIL.cIN = localh;
    localbw.cIL.cDM = localh.kk();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.o
 * JD-Core Version:    0.6.2
 */