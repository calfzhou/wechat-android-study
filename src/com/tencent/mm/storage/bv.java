package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.fp;
import com.tencent.mm.protocal.a.fq;
import com.tencent.mm.protocal.a.sm;

@Deprecated
public final class bv extends cg
{
  private sm ikB = new sm();

  public bv()
  {
    this(false, 22, 8);
  }

  public bv(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    super(arrayOfObject);
    fp localfp = new fp();
    if (paramBoolean);
    for (int j = i; ; j = 0)
    {
      localfp.hVr = j;
      if (paramBoolean)
        i = 0;
      localfp.hVt = i;
      fq localfq = new fq();
      localfq.hVv = paramInt1;
      localfq.hUn = paramInt2;
      localfp.hVs = localfq;
      localfq.hVv = 0;
      localfq.hUn = 0;
      localfp.hVu = localfq;
      this.ikB.imt = localfp;
      return;
    }
  }

  public final a aKx()
  {
    return this.ikB;
  }

  public final int getCmdId()
  {
    return 31;
  }

  public final int wy()
  {
    return 119;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bv
 * JD-Core Version:    0.6.2
 */