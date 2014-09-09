package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.c.a.eh;
import com.tencent.mm.f.c;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;

final class bm extends g
{
  bm(bf parambf)
  {
    super(0);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    int i = ch.getInt(com.tencent.mm.f.e.or().getValue("AndroidUseUnicodeEmoji"), 0);
    ((eh)parame).cJX.cIb = i;
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.bm
 * JD-Core Version:    0.6.2
 */