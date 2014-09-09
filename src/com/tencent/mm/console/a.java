package com.tencent.mm.console;

import com.tencent.mm.c.a.ag;
import com.tencent.mm.c.a.ah;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;

public final class a extends g
{
  public a()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof ag))
      return false;
    ag localag = (ag)parame;
    localag.cHK.cCM = b.k(localag.cHJ.context, localag.cHJ.cHM);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a
 * JD-Core Version:    0.6.2
 */