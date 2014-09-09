package com.tencent.mm.ui;

import com.tencent.mm.aq.a;

final class co
  implements ca
{
  private final int iMr = a.fromDPToPix(cg.c(this.iMo), 100);

  co(cg paramcg)
  {
  }

  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 != 0) && (paramInt2 != 0) && (paramInt3 != 0) && (paramInt4 != 0) && (paramInt1 == paramInt3))
    {
      if ((paramInt2 <= paramInt4) || (paramInt2 - paramInt4 <= this.iMr))
        break label47;
      cg.f(this.iMo);
    }
    label47: 
    while ((paramInt4 <= paramInt2) || (paramInt4 - paramInt2 <= this.iMr))
      return;
    cg.g(this.iMo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.co
 * JD-Core Version:    0.6.2
 */