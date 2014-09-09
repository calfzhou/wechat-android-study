package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.b.f;

public final class j extends g
{
  public j(k paramk)
  {
    this.kjD = 2064;
    this.kjE = 3;
    this.kjG = paramk;
  }

  public final int f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    f localf = new f();
    oicq.wlogin_sdk.b.g localg = new oicq.wlogin_sdk.b.g();
    int i = t(paramArrayOfByte, paramInt1 + 2);
    beO();
    int j = paramInt1 + 5;
    int k;
    switch (i)
    {
    case 3:
    case 4:
    default:
      e(paramArrayOfByte, j, -1 + (this.kjs - j));
      return i;
    case 2:
      k = localf.h(paramArrayOfByte, j, this.kjs - j);
      if (k >= 0)
      {
        this.kjG.kjL = localf;
        k = localg.h(paramArrayOfByte, j, this.kjs - j);
        if (k >= 0)
        {
          this.kjG.kjM = localg;
          return i;
        }
      }
      break;
    case 5:
      e(paramArrayOfByte, j, -1 + (this.kjs - j));
      return i;
    }
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.j
 * JD-Core Version:    0.6.2
 */