package com.tencent.mm.v;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.lc;
import com.tencent.mm.protocal.a.ld;
import com.tencent.mm.protocal.a.vt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class l extends x
  implements ab
{
  private m dlH;
  public a dmI;

  public l(List paramList)
  {
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedList.add(new vt().wF(str));
    }
    lc locallc = new lc();
    locallc.hvf = localLinkedList;
    locallc.ibH = localLinkedList.size();
    b localb = new b();
    localb.a(locallc);
    localb.b(new ld());
    localb.fi("/cgi-bin/micromsg-bin/getcontact");
    localb.de(182);
    localb.df(71);
    localb.dg(1000000071);
    this.dmI = localb.sU();
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
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
    return 182;
  }

  protected final int sB()
  {
    return 5;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.l
 * JD-Core Version:    0.6.2
 */