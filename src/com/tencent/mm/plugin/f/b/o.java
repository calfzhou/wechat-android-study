package com.tencent.mm.plugin.f.b;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.pz;
import com.tencent.mm.protocal.a.qa;
import com.tencent.mm.protocal.a.qb;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class o extends x
  implements ab
{
  private LinkedList dJw;
  private m dlH;
  private final com.tencent.mm.o.a dmI;

  public o(LinkedList paramLinkedList)
  {
    b localb = new b();
    localb.a(new qa());
    localb.b(new qb());
    localb.fi("/cgi-bin/micromsg-bin/kvreport");
    localb.de(310);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    this.dJw = paramLinkedList;
    qa localqa = (qa)this.dmI.sO();
    localqa.hSn = com.tencent.mm.protocal.a.hrh;
    localqa.hSm = com.tencent.mm.protocal.a.hri;
    localqa.hSp = com.tencent.mm.protocal.a.hrl;
    localqa.hSq = y.aGW();
    localqa.hSo = com.tencent.mm.protocal.a.hrk;
    localqa.ifJ = paramLinkedList.size();
    localqa.hQc = paramLinkedList;
  }

  private void dump(boolean paramBoolean)
  {
    if (this.dJw == null)
      z.w("!44@/B4Tb64lLpK+IBX8XDgnvvBNFPu8K248RL5cCWB2FBA=", "want to dump report list, but list is empty");
    while (true)
    {
      return;
      Iterator localIterator = this.dJw.iterator();
      while (localIterator.hasNext())
      {
        pz localpz = (pz)localIterator.next();
        if (paramBoolean)
        {
          Object[] arrayOfObject2 = new Object[5];
          arrayOfObject2[0] = Integer.valueOf(localpz.ifI);
          arrayOfObject2[1] = Integer.valueOf(localpz.huF);
          arrayOfObject2[2] = localpz.ifH;
          arrayOfObject2[3] = Integer.valueOf(localpz.hUm);
          arrayOfObject2[4] = Integer.valueOf(localpz.hUn);
          z.i("!44@/B4Tb64lLpK+IBX8XDgnvvBNFPu8K248RL5cCWB2FBA=", "report id[%d] count[%d] value[%s] startTime[%d] endTime[%d]", arrayOfObject2);
        }
        else
        {
          Object[] arrayOfObject1 = new Object[5];
          arrayOfObject1[0] = Integer.valueOf(localpz.ifI);
          arrayOfObject1[1] = Integer.valueOf(localpz.huF);
          arrayOfObject1[2] = localpz.ifH;
          arrayOfObject1[3] = Integer.valueOf(localpz.hUm);
          arrayOfObject1[4] = Integer.valueOf(localpz.hUn);
          z.d("!44@/B4Tb64lLpK+IBX8XDgnvvBNFPu8K248RL5cCWB2FBA=", "report id[%d] count[%d] value[%s] startTime[%d] endTime[%d]", arrayOfObject1);
        }
      }
    }
  }

  public final int a(r paramr, m paramm)
  {
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvvBNFPu8K248RL5cCWB2FBA=", "doScene:<!-- dump report list beg -->");
    dump(false);
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvvBNFPu8K248RL5cCWB2FBA=", "doScene:<!-- dump report list end -->");
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt2);
      arrayOfObject[1] = Integer.valueOf(paramInt3);
      z.w("!44@/B4Tb64lLpK+IBX8XDgnvvBNFPu8K248RL5cCWB2FBA=", "onGYNetEnd: errType is %d, errorCode is %d", arrayOfObject);
      z.w("!44@/B4Tb64lLpK+IBX8XDgnvvBNFPu8K248RL5cCWB2FBA=", "<!-- dump report list beg -->");
      dump(true);
      z.w("!44@/B4Tb64lLpK+IBX8XDgnvvBNFPu8K248RL5cCWB2FBA=", "<!-- dump report list end -->");
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 310;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.o
 * JD-Core Version:    0.6.2
 */