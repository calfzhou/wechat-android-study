package com.tencent.mm.ui.account;

import android.content.Context;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cl;

final class ba
  implements cl
{
  ba(int paramInt, Context paramContext)
  {
  }

  public final void a(cg paramcg)
  {
    if ((0x1 & this.iOv) != 0)
      paramcg.a(1, this.dLL.getString(n.bXR));
    if ((0x2 & this.iOv) != 0)
      paramcg.a(2, this.dLL.getString(n.bXS));
    if ((0x4 & this.iOv) != 0)
      paramcg.a(4, this.dLL.getString(n.bXQ));
    if ((0x8 & this.iOv) > 0)
      paramcg.a(8, this.dLL.getString(n.cgQ));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ba
 * JD-Core Version:    0.6.2
 */