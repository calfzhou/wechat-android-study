package com.tencent.mm.pluginsdk.model;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.aeo;
import com.tencent.mm.protocal.a.aep;
import com.tencent.mm.protocal.a.aeq;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class p extends x
  implements ab
{
  private int cEg = 0;
  private m dlH;
  private final a dmI;
  private String dwx;
  private List huk = null;
  private String hul;
  private List hum = null;

  public p(int paramInt, List paramList1, List paramList2, String paramString1, String paramString2)
  {
    this(paramInt, paramList1, paramList2, paramString1, paramString2, null);
  }

  public p(int paramInt, List paramList1, List paramList2, String paramString1, String paramString2, Map paramMap)
  {
    boolean bool;
    aep localaep;
    LinkedList localLinkedList1;
    int i;
    label158: aeo localaeo;
    if (paramInt != 3)
    {
      bool = true;
      Assert.assertTrue("This NetSceneVerifyUser init NEVER use opcode == MM_VERIFYUSER_VERIFYOK", bool);
      this.cEg = paramInt;
      this.huk = paramList1;
      b localb = new b();
      localb.a(new aep());
      localb.b(new aeq());
      localb.fi("/cgi-bin/micromsg-bin/verifyuser");
      localb.de(137);
      localb.df(44);
      localb.dg(1000000044);
      this.dmI = localb.sU();
      localaep = (aep)this.dmI.sO();
      localaep.hQH = paramInt;
      localaep.idA = paramString1;
      this.hul = paramString1;
      localLinkedList1 = new LinkedList();
      i = 0;
      if (i >= paramList1.size())
        break label280;
      localaeo = new aeo();
      localaeo.ifH = ((String)paramList1.get(i));
      if (paramString2 != null)
        break label273;
    }
    label273: for (String str = ""; ; str = paramString2)
    {
      localaeo.ixn = str;
      if ((paramMap != null) && (paramMap.containsKey(localaeo.ifH)))
        localaeo.ixo = ((Integer)paramMap.get(localaeo.ifH)).intValue();
      localLinkedList1.add(localaeo);
      i++;
      break label158;
      bool = false;
      break;
    }
    label280: localaep.ixq = localLinkedList1;
    localaep.ixp = localLinkedList1.size();
    LinkedList localLinkedList2 = new LinkedList();
    localLinkedList2.addAll(paramList2);
    localaep.ixs = localLinkedList2;
    localaep.ixr = localLinkedList2.size();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(localaep.ixq.size());
    arrayOfObject[1] = Integer.valueOf(localaep.ixs.size());
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvjTi6XprtAzYGM0KIh//1dw=", "dkverify scene:%d user:%d", arrayOfObject);
  }

  public p(String paramString1, String paramString2, int paramInt)
  {
    Assert.assertTrue("This NetSceneVerifyUser init MUST use opcode == MM_VERIFYUSER_VERIFYOK", true);
    this.huk = new LinkedList();
    this.huk.add(paramString1);
    this.cEg = 3;
    b localb = new b();
    localb.a(new aep());
    localb.b(new aeq());
    localb.fi("/cgi-bin/micromsg-bin/verifyuser");
    localb.de(137);
    localb.df(44);
    localb.dg(1000000044);
    this.dmI = localb.sU();
    aep localaep = (aep)this.dmI.sO();
    localaep.hQH = 3;
    localaep.idA = "";
    LinkedList localLinkedList1 = new LinkedList();
    aeo localaeo = new aeo();
    localaeo.ifH = paramString1;
    localaeo.ixn = paramString2;
    localLinkedList1.add(localaeo);
    localaep.ixq = localLinkedList1;
    localaep.ixp = localLinkedList1.size();
    LinkedList localLinkedList2 = new LinkedList();
    localLinkedList2.add(Integer.valueOf(paramInt));
    localaep.ixs = localLinkedList2;
    localaep.ixr = localLinkedList2.size();
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(localaep.ixq.size());
    arrayOfObject[1] = Integer.valueOf(localaep.ixs.size());
    arrayOfObject[2] = paramString2;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvjTi6XprtAzYGM0KIh//1dw=", "dkverify scene:%d user:%d ticket:%s", arrayOfObject);
  }

  public final int a(r paramr, m paramm)
  {
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
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvjTi6XprtAzYGM0KIh//1dw=", "errType:%d, errCode:%d", arrayOfObject);
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final String ayu()
  {
    if ((this.dmI != null) && (this.dmI.sQ() != null))
      return ((aeq)this.dmI.sP()).gnq;
    return "";
  }

  public final List ayv()
  {
    return this.huk;
  }

  public final int ayw()
  {
    return this.cEg;
  }

  public final String ayx()
  {
    return this.hul;
  }

  public final List ayy()
  {
    return this.hum;
  }

  public final LinkedList ayz()
  {
    if ((this.dmI != null) && (this.dmI.tk() != null))
      return ((aep)this.dmI.sO()).ixs;
    return null;
  }

  public final int getType()
  {
    return 30;
  }

  public final String xA()
  {
    return this.dwx;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.p
 * JD-Core Version:    0.6.2
 */