package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.c.a.mv;
import com.tencent.mm.c.a.mw;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.pluginsdk.e.m;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ar;

final class i extends g
{
  i(f paramf)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    mv localmv = (mv)parame;
    l locall = l.tg(localmv.cPp.cPq);
    ar localar = localmv.cPp.cCp;
    if (locall != null)
    {
      f localf = (f)bg.qF().eA(f.class.getName());
      String str1 = localar.kt();
      String str2 = localmv.cPp.description;
      int i = locall.gSK;
      String str3 = m.j(ak.getContext(), i);
      String str4 = "";
      if ((str3 != null) && (str3.length() > 0))
      {
        String[] arrayOfString = str3.split(";");
        str4 = str4 + arrayOfString[0];
        if (arrayOfString.length > 1)
          str4 = str4 + arrayOfString[1];
      }
      if (str2 != null)
        str4 = str4 + str2;
      localf.f(str1, str4, localar.kn());
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.i
 * JD-Core Version:    0.6.2
 */