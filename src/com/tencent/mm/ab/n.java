package com.tencent.mm.ab;

import com.tencent.mm.c.a.kj;
import com.tencent.mm.c.a.t;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class n
{
  public static void a(long paramLong, int paramInt, String paramString)
  {
    z.i("!32@/B4Tb64lLpJRvkgZo4JKS+ippUZtfBu8", "dealWithSelector, selector = " + paramLong);
    if ((0x100 & paramLong) != 0L)
    {
      kj localkj = new kj();
      a.aGB().g(localkj);
    }
    long l = 0x5F & (0xFFFFFEFF & paramLong);
    if ((l != 0L) && (bg.oE()) && (bg.qW().oQ() != null))
    {
      bg.qW().oQ().set(8196, Long.valueOf(l));
      bg.qX().d(new k(paramInt));
    }
    if (!ap.jb(paramString))
    {
      z.i("!32@/B4Tb64lLpJRvkgZo4JKS+ippUZtfBu8", "dealWithSelector xml:%s", new Object[] { paramString });
      if (!ap.jb(paramString))
      {
        t localt = new t();
        localt.cHt.type = 3;
        localt.cHt.cHv = paramString;
        a.aGB().g(localt);
      }
    }
  }

  public static boolean yy()
  {
    return (ap.ja((String)bg.qW().oQ().get(8195)).length() <= 0) || (ap.a((Integer)bg.qW().oQ().get(15)) == 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.n
 * JD-Core Version:    0.6.2
 */