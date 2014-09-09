package com.tencent.mm.aj;

import com.tencent.mm.c.a.cr;
import com.tencent.mm.c.a.cs;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;

final class r extends g
{
  r(l paraml)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    cr localcr = (cr)parame;
    int i = localcr.cJd.cEg;
    String str = localcr.cJd.cEh;
    int j = localcr.cJd.state;
    if (i == 1)
      j = l.AF().hE(str);
    while (true)
    {
      localcr.cJe.state = j;
      return false;
      if (i == 0)
        if (j == 2)
          l.AF().q(str, 2);
        else if (j == 1)
          l.AF().q(str, 1);
        else
          l.AF().q(str, 0);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.r
 * JD-Core Version:    0.6.2
 */