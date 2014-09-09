package com.tencent.mm.modelstat;

import com.tencent.mm.network.bm;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ct;
import com.tencent.mm.sdk.platformtools.z;

public final class k
{
  static
  {
    ct.reset();
  }

  private static void a(f paramf, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 522:
      paramf.dEk = (paramf.dEr + paramf.dEs);
      paramf.db(0x8000 | paramf.ss());
      return;
    case 37:
    case 38:
      paramf.dDY = (paramf.dEf + paramf.dEg);
      paramf.db(0x8 | paramf.ss());
      return;
    case 110:
      paramf.dEm = (paramf.dEr + paramf.dEs);
      paramf.db(0x20000 | paramf.ss());
      return;
    case 109:
    case 123:
      paramf.dEa = (paramf.dEf + paramf.dEg);
      paramf.db(0x20 | paramf.ss());
      return;
    case 127:
      paramf.dEo = (paramf.dEr + paramf.dEs);
      paramf.db(0x80000 | paramf.ss());
      return;
    case 128:
      paramf.dEc = (paramf.dEf + paramf.dEg);
      paramf.db(0x80 | paramf.ss());
      return;
    case 149:
      paramf.dEq = (paramf.dEr + paramf.dEs);
      paramf.db(0x200000 | paramf.ss());
      return;
    case 150:
    }
    paramf.dEe = (paramf.dEf + paramf.dEg);
    paramf.db(0x200 | paramf.ss());
  }

  private static void d(f paramf)
  {
    ct.update();
    paramf.dEh = ((int)ct.aNI());
    paramf.dEt = ((int)ct.aNH());
    paramf.dEi = ((int)ct.aNG());
    paramf.dEu = ((int)ct.aNF());
    paramf.dSD = ((int)ct.aNM());
    paramf.dSF = ((int)ct.aNL());
    paramf.dSE = ((int)ct.aNK());
    paramf.dSG = ((int)ct.aNJ());
    paramf.db(0x10000000 | (0x4000000 | (0x20000000 | (0x8000000 | (0x1000000 | (0x1000 | (0x2000000 | (0x2000 | paramf.ss()))))))));
  }

  public static void h(int paramInt1, int paramInt2, int paramInt3)
  {
    if (bm.ab(ak.getContext()))
    {
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(paramInt1);
      arrayOfObject2[1] = Integer.valueOf(paramInt2);
      arrayOfObject2[2] = Integer.valueOf(0);
      z.i("!44@/B4Tb64lLpKaLNAssnLXZl1wY8MbRHCtlBQKyQ1d02k=", "dknetflow wifi recv:%d send:%d type:%d", arrayOfObject2);
      i(paramInt1, paramInt2, 0);
      return;
    }
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    arrayOfObject1[2] = Integer.valueOf(0);
    z.i("!44@/B4Tb64lLpKaLNAssnLXZl1wY8MbRHCtlBQKyQ1d02k=", "dknetflow mobile recv:%d send:%d type:%d", arrayOfObject1);
    j(paramInt1, paramInt2, 0);
  }

  public static void i(int paramInt1, int paramInt2, int paramInt3)
  {
    f localf = new f();
    localf.dEg = paramInt1;
    localf.dEs = paramInt2;
    localf.db(8390656);
    d(localf);
    a(localf, paramInt3);
    r.Ap().b(localf);
  }

  public static void j(int paramInt1, int paramInt2, int paramInt3)
  {
    f localf = new f();
    localf.dEf = paramInt1;
    localf.dEr = paramInt2;
    localf.db(4195328);
    d(localf);
    a(localf, paramInt3);
    r.Ap().b(localf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.k
 * JD-Core Version:    0.6.2
 */