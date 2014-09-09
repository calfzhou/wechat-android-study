package com.tencent.mm.plugin.ext;

import com.tencent.mm.g.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.model.h;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.protocal.a.aee;
import com.tencent.mm.protocal.a.oc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cr;
import com.tencent.mm.storage.cs;
import java.util.Iterator;
import java.util.LinkedList;

final class f
  implements com.tencent.mm.pluginsdk.model.i
{
  f(b paramb)
  {
  }

  public final void a(com.tencent.mm.pluginsdk.model.o paramo)
  {
    if (paramo == null);
    int i;
    do
    {
      return;
      Iterator localIterator = paramo.ayt().iej.iterator();
      i = 0;
      while (localIterator.hasNext())
      {
        aee localaee = (aee)localIterator.next();
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = paramo.geE;
        arrayOfObject1[1] = localaee.gnq;
        arrayOfObject1[2] = localaee.hPx;
        z.v("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "AppId[%s], UserName[%s], Xml[%s]", arrayOfObject1);
        if ((!ch.jb(localaee.gnq)) && (!ch.jb(localaee.hPx)))
        {
          com.tencent.mm.storage.i locali = bg.qW().oT().yq(localaee.gnq);
          if ((locali == null) || ((int)locali.dhv <= 0))
          {
            z.e("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "contact is null");
          }
          else if (locali.aIg())
          {
            z.w("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "isBizContact");
          }
          else
          {
            j localj = h.uQ(localaee.hPx);
            if ((localj != null) && (!ch.jb(localj.hug)))
            {
              Object[] arrayOfObject2 = new Object[2];
              arrayOfObject2[0] = paramo.geE;
              arrayOfObject2[1] = localj.hug;
              z.v("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "AppId[%s], openId[%s]", arrayOfObject2);
              cr localcr = new cr(paramo.geE, localaee.gnq, localj.hug);
              b.Qb().a(localcr);
              i = 1;
            }
          }
        }
      }
    }
    while (i == 0);
    this.eLF.Qd();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.f
 * JD-Core Version:    0.6.2
 */