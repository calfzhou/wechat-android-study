package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.xu;
import com.tencent.mm.protocal.a.xv;
import java.util.LinkedList;

public final class ao extends x
  implements ab
{
  private m dlH;
  private final a dmI;

  public ao(int[] paramArrayOfInt)
  {
    b localb = new b();
    localb.a(new xu());
    localb.b(new xv());
    localb.fi("/cgi-bin/micromsg-bin/sendinviteemail");
    localb.de(116);
    localb.df(41);
    localb.dg(1000000041);
    this.dmI = localb.sU();
    LinkedList localLinkedList = new LinkedList();
    for (int i = 0; i < paramArrayOfInt.length; i++)
      localLinkedList.add(Integer.valueOf(paramArrayOfInt[i]));
    ((xu)this.dmI.sO()).irK = localLinkedList;
    ((xu)this.dmI.sO()).irJ = localLinkedList.size();
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
    return 116;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ao
 * JD-Core Version:    0.6.2
 */