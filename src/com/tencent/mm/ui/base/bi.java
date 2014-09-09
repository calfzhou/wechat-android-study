package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class bi
  implements ax
{
  bi(MMGridPaper paramMMGridPaper)
  {
  }

  public final void jE(int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Integer.valueOf(this.iZG.iZl);
    arrayOfObject[2] = Integer.valueOf(this.iZG.iZm);
    arrayOfObject[3] = Integer.valueOf(this.iZG.iZn);
    z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "onScreenChanged:curScreen[%d], topEdge[%d], bottomEdge[%d], virtualPage[%d]", arrayOfObject);
    if ((paramInt <= this.iZG.iZl) && (this.iZG.iZl > 0))
      this.iZG.eRb.post(new bj(this, paramInt));
    while (true)
    {
      this.iZG.iZj = paramInt;
      this.iZG.eER.pu(paramInt);
      return;
      if ((paramInt >= this.iZG.iZm) && (this.iZG.iZm < -1 + this.iZG.iZn))
        this.iZG.eRb.post(new bk(this, paramInt));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bi
 * JD-Core Version:    0.6.2
 */