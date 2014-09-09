package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.tg;
import com.tencent.mm.protocal.a.th;
import com.tencent.mm.protocal.a.tk;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class aa extends x
  implements ab
{
  private m dlH;
  private final a dmI;

  public aa(int paramInt)
  {
    b localb = new b();
    localb.a(new tg());
    localb.b(new th());
    localb.fi("/cgi-bin/micromsg-bin/newgetinvitefriend");
    localb.de(135);
    localb.df(23);
    localb.dg(1000000023);
    this.dmI = localb.sU();
    ((tg)this.dmI.sO()).ifp = paramInt;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    th localth = (th)this.dmI.sP();
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvqap27kdYXmZIfk0eYczXx/3sYDluEMlOg==", "friend:" + localth.hEV.size() + " group:" + localth.hPe.size());
    HashSet localHashSet = new HashSet();
    LinkedList localLinkedList = new LinkedList();
    for (int i = 0; i < localth.hEU; i++)
      if (!localHashSet.contains(((tk)localth.hEV.get(i)).gnq))
      {
        localLinkedList.add(localth.hEV.get(i));
        localHashSet.add(((tk)localth.hEV.get(i)).gnq);
      }
    localth.hEV = localLinkedList;
    localth.hEU = localLinkedList.size();
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 135;
  }

  public final LinkedList zv()
  {
    return ((th)this.dmI.sP()).hEV;
  }

  public final LinkedList zw()
  {
    return ((th)this.dmI.sP()).hPe;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.aa
 * JD-Core Version:    0.6.2
 */