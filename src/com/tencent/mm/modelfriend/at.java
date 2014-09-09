package com.tencent.mm.modelfriend;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ya;
import com.tencent.mm.protocal.a.yb;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class at extends x
  implements ab
{
  private m dlH = null;
  private final a dmI;

  public at(String paramString, List paramList)
  {
    b localb = new b();
    localb.a(new ya());
    localb.b(new yb());
    localb.fi("/cgi-bin/micromsg-bin/sendsmstomfriend");
    localb.de(432);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ya localya = (ya)this.dmI.sO();
    localya.hVL = paramString;
    localya.igy = new LinkedList();
    localya.igx = paramList.size();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!ch.jb(str))
        localya.igy.add(new vt().wF(str));
    }
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 432;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.at
 * JD-Core Version:    0.6.2
 */