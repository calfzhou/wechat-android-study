package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.z;

final class bh
  implements aw
{
  bh(MMGridPaper paramMMGridPaper)
  {
  }

  public final void al(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject1 = new Object[6];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(this.iZG.iZg);
    arrayOfObject1[2] = Integer.valueOf(paramInt2);
    arrayOfObject1[3] = Integer.valueOf(this.iZG.iZh);
    arrayOfObject1[4] = Boolean.valueOf(this.iZG.iZw);
    arrayOfObject1[5] = Boolean.valueOf(this.iZG.iZv);
    z.v("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "onMeasure width:[new %d, old %d] height:[new %d, old %d], dialogMode[%B], orientationChange[%B]", arrayOfObject1);
    if (((Math.abs(this.iZG.iZh - paramInt2) < 50) && (Math.abs(this.iZG.iZg - paramInt1) < 50)) || (paramInt2 == 0) || (paramInt1 == 0))
    {
      z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "match width height limit, return");
      return;
    }
    if ((this.iZG.iZw) && (this.iZG.iZg > paramInt1) && (!this.iZG.iZv))
    {
      z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "match ori limit, return");
      return;
    }
    z.v("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "onMeasure: match");
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Boolean.valueOf(this.iZG.iZC);
    z.v("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "onMeasure: mIsManualMeasureMode[%b]", arrayOfObject2);
    this.iZG.iZv = false;
    if (!this.iZG.iZC)
    {
      this.iZG.iZh = paramInt2;
      this.iZG.iZg = paramInt1;
    }
    this.iZG.refresh();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bh
 * JD-Core Version:    0.6.2
 */