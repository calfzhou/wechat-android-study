package com.tencent.mm.q;

import com.tencent.mm.modelgeo.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class u
  implements c
{
  long dqV = 0L;

  u(s params)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2)
  {
    if (!paramBoolean)
      return true;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Float.valueOf(paramFloat2);
    arrayOfObject[1] = Float.valueOf(paramFloat1);
    z.d("!32@/B4Tb64lLpL9SB0DqhCSWgFPYrICdb5Q", "LBSManager notify. lat:%f, lng:%f", arrayOfObject);
    if (ch.CL() >= this.dqV + s.d(this.dqU))
    {
      s.a(s.a(this.dqU), paramFloat2, paramFloat1, (int)paramDouble2);
      this.dqV = ch.CL();
    }
    if (s.b(this.dqU) == 2)
      this.dqU.uV();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.u
 * JD-Core Version:    0.6.2
 */