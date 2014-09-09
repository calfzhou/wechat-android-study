package com.tencent.mm.pluginsdk.model;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.x;
import com.tencent.mm.o.j;
import com.tencent.mm.o.k;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.e;

public final class a
  implements j
{
  public final k a(q paramq)
  {
    if ((paramq == null) || (paramq.hOR != 47))
      z.f("!32@/B4Tb64lLpJAz7ZZyuqdwFauBzP/voPJ", "parseEmojiMsg failed, invalid cmdAM");
    String str1;
    String str3;
    String str4;
    do
    {
      return null;
      str1 = ai.a(paramq.hOP);
      String str2 = ai.a(paramq.hOQ);
      if (!((String)bg.qW().oQ().get(2)).equals(str1))
        break;
      str3 = str2;
      str4 = ai.a(paramq.hOS);
    }
    while (g.axR().c(str3, str4, paramq.hOY));
    z.w("!32@/B4Tb64lLpJAz7ZZyuqdwFauBzP/voPJ", "emoji plugin not found");
    ar localar = new ar();
    localar.setType(47);
    localar.bJ(str3);
    if (x.cY(str1));
    for (int i = 1; ; i = 0)
    {
      localar.bv(i);
      localar.bK("no_plugin_md5");
      localar.p(paramq.hOY);
      localar.setContent(str4);
      localar.q(bw.eo(localar.kt()));
      localar.setStatus(3);
      bg.qW().oV().y(localar);
      return null;
      str3 = str1;
      break;
    }
  }

  public final void d(ar paramar)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.a
 * JD-Core Version:    0.6.2
 */