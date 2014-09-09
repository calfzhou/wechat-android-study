package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.mm.pluginsdk.ui.bl;

final class bp
  implements bl
{
  bp(bm parambm)
  {
  }

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong)
  {
    if ((bm.a(this.hFv) != null) && (paramArrayOfString != null) && (paramArrayOfString.length > 0))
      bm.a(this.hFv).vG(paramArrayOfString[0]);
    if (bm.b(this.hFv) == null)
      bm.c(this.hFv);
  }

  public final void aAF()
  {
  }

  public final void aAG()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.bp
 * JD-Core Version:    0.6.2
 */