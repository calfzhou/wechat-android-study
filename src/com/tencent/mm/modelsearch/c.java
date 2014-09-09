package com.tencent.mm.modelsearch;

import com.tencent.mm.c.a.jr;
import com.tencent.mm.c.a.jt;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.Comparator;

public final class c
{
  public static l a(String paramString, int[] paramArrayOfInt, Comparator paramComparator, k paramk, cm paramcm)
  {
    jr localjr = new jr();
    localjr.cNC.cNE = 2;
    localjr.cNC.cNF = paramString;
    localjr.cNC.cNH = new Object[] { paramArrayOfInt };
    localjr.cNC.cNG = paramComparator;
    localjr.cNC.cNI = paramk;
    localjr.cNC.gQj = paramcm;
    a.aGB().g(localjr);
    return localjr.cND.cNJ;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsearch.c
 * JD-Core Version:    0.6.2
 */