package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.z;

final class bk
  implements Runnable
{
  bk(bi parambi, int paramInt)
  {
  }

  public final void run()
  {
    MMGridPaperGridView localMMGridPaperGridView = (MMGridPaperGridView)this.iZI.iZG.iZe.getChildAt(0);
    int i = this.iZH + (this.iZI.iZG.iZe.getChildCount() >> 1);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    z.i("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "move down, old index[0], new index[%d]", arrayOfObject);
    this.iZI.iZG.iZe.removeViewAt(0);
    localMMGridPaperGridView.a(i, this.iZI.iZG.iZo, this.iZI.iZG.eDG, this.iZI.iZG.iZf);
    this.iZI.iZG.iZe.addView(localMMGridPaperGridView);
    int j = this.iZI.iZG.iZe.getChildCount() >> 1;
    this.iZI.iZG.iZe.pv(j);
    MMGridPaper.a(this.iZI.iZG, 1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bk
 * JD-Core Version:    0.6.2
 */