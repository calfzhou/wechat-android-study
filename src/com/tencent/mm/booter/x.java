package com.tencent.mm.booter;

import com.tencent.mm.c.a.jy;
import com.tencent.mm.c.a.jz;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;

final class x extends g
{
  x(u paramu)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if ((parame != null) && ((parame instanceof jy)))
    {
      jy localjy = (jy)parame;
      String str = localjy.cNR.cMU;
      int i = localjy.cNR.cNS;
      this.diD.e(str, i);
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.x
 * JD-Core Version:    0.6.2
 */