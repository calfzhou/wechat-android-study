package com.tencent.mm.ap.a;

import java.util.ArrayList;
import java.util.List;

public final class ad
{
  private final List iAM;
  private final q iAo;

  public ad(q paramq)
  {
    this.iAo = paramq;
    this.iAM = new ArrayList();
    this.iAM.add(new r(paramq, new int[] { 1 }));
  }

  private r om(int paramInt)
  {
    if (paramInt >= this.iAM.size())
    {
      r localr1 = (r)this.iAM.get(-1 + this.iAM.size());
      int i = this.iAM.size();
      r localr2 = localr1;
      for (int j = i; j <= paramInt; j++)
      {
        q localq = this.iAo;
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = 1;
        arrayOfInt[1] = this.iAo.nN(j - 1 + this.iAo.aLY());
        localr2 = localr2.b(new r(localq, arrayOfInt));
        this.iAM.add(localr2);
      }
    }
    return (r)this.iAM.get(paramInt);
  }

  public final void c(int[] paramArrayOfInt, int paramInt)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException("No error correction bytes");
    int i = paramArrayOfInt.length - paramInt;
    if (i <= 0)
      throw new IllegalArgumentException("No data bytes provided");
    r localr = om(paramInt);
    int[] arrayOfInt1 = new int[i];
    System.arraycopy(paramArrayOfInt, 0, arrayOfInt1, 0, i);
    int[] arrayOfInt2 = new r(this.iAo, arrayOfInt1).aU(paramInt, 1).c(localr)[1].aLZ();
    int j = paramInt - arrayOfInt2.length;
    for (int k = 0; k < j; k++)
      paramArrayOfInt[(i + k)] = 0;
    System.arraycopy(arrayOfInt2, 0, paramArrayOfInt, i + j, arrayOfInt2.length);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.ad
 * JD-Core Version:    0.6.2
 */