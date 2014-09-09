package com.tencent.mm.v;

import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ch;

final class e
  implements Runnable
{
  e(g paramg, aw paramaw1, String paramString1, boolean paramBoolean, aw paramaw2, String paramString2)
  {
  }

  public final void run()
  {
    if (this.dSl != null)
      this.dSl.f(this.dSm, this.dSn);
    if ((this.dSo != null) && (!ch.jb(this.dSp)))
      this.dSo.f(this.dSp, this.dSn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.e
 * JD-Core Version:    0.6.2
 */