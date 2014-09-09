package com.tencent.mm.plugin.b.a;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.f.b.j;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

public final class b extends x
  implements ab
{
  private m dlH;
  private final aj dpk = new a();

  public b(LinkedList paramLinkedList)
  {
    j localj = (j)this.dpk.tk();
    localj.fTh.hSn = com.tencent.mm.protocal.a.hrh;
    localj.fTh.hSm = com.tencent.mm.protocal.a.hri;
    localj.fTh.hSp = com.tencent.mm.protocal.a.hrl;
    localj.fTh.hSq = y.aGW();
    localj.fTh.hSo = com.tencent.mm.protocal.a.hrk;
    localj.fTh.ifJ = paramLinkedList.size();
    localj.fTh.hQc = paramLinkedList;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvpiV08MuN8SqrS9Mj4Vcfso=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvpiV08MuN8SqrS9Mj4Vcfso=", "get report strategy ok");
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 443;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.b.a.b
 * JD-Core Version:    0.6.2
 */