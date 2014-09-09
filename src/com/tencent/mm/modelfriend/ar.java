package com.tencent.mm.modelfriend;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.qz;
import com.tencent.mm.protocal.a.ra;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ar extends x
  implements ab
{
  private m dlH = null;
  private final a dmI;

  public ar(String paramString, List paramList)
  {
    b localb = new b();
    localb.a(new qz());
    localb.b(new ra());
    localb.fi("/cgi-bin/micromsg-bin/listmfriend");
    localb.de(431);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    qz localqz = (qz)this.dmI.sO();
    localqz.hVL = paramString;
    localqz.igz = 0;
    int i = 0;
    if (paramList == null);
    while (true)
    {
      localqz.igx = i;
      localqz.igA = new LinkedList();
      localqz.igy = new LinkedList();
      if (paramList == null)
        break;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String[] arrayOfString = (String[])localIterator.next();
        if (!ch.jb(arrayOfString[2]))
          localqz.igy.add(new vt().wF(arrayOfString[2]));
      }
      i = paramList.size();
    }
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    ra localra = (ra)this.dmI.sP();
    bg.qQ().a(new as(this, localra));
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 431;
  }

  public final LinkedList wD()
  {
    return ((ra)this.dmI.sP()).igB;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ar
 * JD-Core Version:    0.6.2
 */