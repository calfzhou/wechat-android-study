package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.tu;
import com.tencent.mm.protocal.a.tv;
import java.util.LinkedList;

public final class a extends x
  implements ab
{
  private m dlH;
  private com.tencent.mm.o.a dmI;

  public a(LinkedList paramLinkedList, int paramInt)
  {
    b localb = new b();
    localb.a(new tu());
    localb.b(new tv());
    localb.fi("/cgi-bin/micromsg-bin/opvoicereminder");
    localb.de(331);
    localb.df(150);
    localb.dg(1000000150);
    this.dmI = localb.sU();
    tu localtu = (tu)this.dmI.sO();
    localtu.hQF = 1;
    localtu.ioK = paramLinkedList;
    localtu.ioJ = paramInt;
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
    return 331;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.a
 * JD-Core Version:    0.6.2
 */