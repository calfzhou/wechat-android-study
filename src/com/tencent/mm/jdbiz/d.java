package com.tencent.mm.jdbiz;

import android.os.Bundle;
import com.tencent.mm.c.a.go;
import com.tencent.mm.c.a.gp;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.platformtools.ch;

final class d extends com.tencent.mm.sdk.c.g
{
  d(c paramc)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof go));
    go localgo;
    do
    {
      return false;
      localgo = (go)parame;
    }
    while ((localgo.cLF.cLH == null) || (localgo.cLF.cLG == null) || (!"bizjd".equals(localgo.cLF.cLG)));
    String str1 = ch.Y(localgo.cLF.cLH.getString("activity_id"), "");
    String str2 = ch.Y(localgo.cLF.cLH.getString("jump_url"), "");
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = str2;
    arrayOfObject[1] = g.Cp().Cu().dQx;
    arrayOfObject[2] = Integer.valueOf(4);
    localn.d(11179, arrayOfObject);
    f localf = g.Cp().Cu();
    if ((localf != null) && (localf.dQx != null) && (localf.dQx.equals(str1)))
    {
      g.Cp();
      g.Ct();
      g.Cp();
      g.Cs();
    }
    a.aGB().b("NotifyStartWebViewParams", c.a(this.dQu));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jdbiz.d
 * JD-Core Version:    0.6.2
 */