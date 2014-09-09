package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.c.a.aw;
import com.tencent.mm.f.c;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;

final class bn extends g
{
  bn(bf parambf)
  {
    super(0);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    int i = ch.getInt(com.tencent.mm.f.e.or().getValue("AndroidUseUnicodeEmoji"), 0);
    aw localaw = new aw();
    localaw.cIa.cIb = i;
    a.aGB().g(localaw);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.bn
 * JD-Core Version:    0.6.2
 */