package com.tencent.mm.modelfriend;

import com.tencent.mm.a.f;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.adj;
import com.tencent.mm.protocal.a.adk;
import com.tencent.mm.protocal.a.rf;
import com.tencent.mm.protocal.a.sc;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class au extends com.tencent.mm.o.x
  implements ab
{
  private int cEg;
  private m dlH;
  private final List duk;
  private final List dul;
  private final String dum = (String)bg.qW().oQ().get(6);
  private int dun = 0;
  private int duo = 0;

  public au(List paramList1, List paramList2)
  {
    this.duk = paramList1;
    this.dul = paramList2;
    this.cEg = 1;
  }

  private static List o(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.size() == 0))
    {
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWOtU+5CktrO0=", "the req emai list is empty");
      return localArrayList;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((rf)localIterator.next()).igM);
    return localArrayList;
  }

  private static List p(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.size() == 0))
    {
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWOtU+5CktrO0=", "the req mobile list is empty");
      return localArrayList;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(f.d(com.tencent.mm.pluginsdk.a.pR(((sc)localIterator.next()).igM).getBytes()));
    return localArrayList;
  }

  protected final int a(aj paramaj)
  {
    adj localadj = (adj)((com.tencent.mm.o.a)paramaj).sO();
    int i = localadj.iwo.size() + localadj.igy.size();
    if ((i == 0) || (i > 200))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWOtU+5CktrO0=", "security checked failed : exceed max send count");
      return com.tencent.mm.o.aa.doN;
    }
    if ((localadj.hQV == null) || (localadj.hQV.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWOtU+5CktrO0=", "security checked failed : moblie null");
      return com.tencent.mm.o.aa.doN;
    }
    if ((localadj.gnq == null) || (localadj.gnq.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWOtU+5CktrO0=", "security checked failed : username null");
      return com.tencent.mm.o.aa.doN;
    }
    return com.tencent.mm.o.aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    if (((this.duk == null) || (this.duk.size() == 0)) && ((this.dul == null) || (this.dul.size() == 0)))
      return -1;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new adj());
    localb.b(new adk());
    localb.fi("/cgi-bin/micromsg-bin/uploadmcontact");
    localb.de(133);
    localb.df(0);
    localb.dg(0);
    com.tencent.mm.o.a locala = localb.sU();
    adj localadj = (adj)locala.sO();
    localadj.hQV = this.dum;
    localadj.gnq = com.tencent.mm.model.x.pG();
    localadj.hQH = this.cEg;
    int i = 200;
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    do
    {
      if (i <= 0)
        break;
      if ((this.duk != null) && (this.dun < this.duk.size()))
      {
        if (this.duk.get(this.dun) != null)
        {
          sc localsc = new sc();
          localsc.igM = ((String)this.duk.get(this.dun));
          localLinkedList1.add(localsc);
        }
        this.dun = (1 + this.dun);
        i--;
      }
      if ((this.dul != null) && (this.duo < this.dul.size()))
      {
        if (this.dul.get(this.duo) != null)
        {
          rf localrf = new rf();
          localrf.igM = ((String)this.dul.get(this.duo));
          localLinkedList2.add(localrf);
        }
        this.duo = (1 + this.duo);
        i--;
      }
    }
    while (((this.dul != null) && (this.duo < this.dul.size())) || ((this.duk != null) && (this.dun < this.duk.size())));
    localadj.igy = localLinkedList1;
    localadj.iwm = localLinkedList1.size();
    localadj.iwo = localLinkedList2;
    localadj.iwn = localLinkedList2.size();
    StringBuilder localStringBuilder1 = new StringBuilder("doscene in:[");
    int j;
    StringBuilder localStringBuilder2;
    int k;
    if (this.dul == null)
    {
      j = 0;
      localStringBuilder2 = localStringBuilder1.append(j).append(",");
      List localList = this.duk;
      k = 0;
      if (localList != null)
        break label576;
    }
    while (true)
    {
      z.v("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWOtU+5CktrO0=", k + "] index:[" + this.duo + "," + this.dun + "] req:[" + localadj.iwo.size() + "," + localadj.igy.size() + "]");
      return a(paramr, locala, this);
      j = this.dul.size();
      break;
      label576: k = this.duk.size();
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWOtU+5CktrO0=", "onSceneEnd: errType = " + paramInt2 + " errCode = " + paramInt3 + " errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWOtU+5CktrO0=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
    }
    do
    {
      return;
      adj localadj = (adj)((com.tencent.mm.o.a)paramaj).sO();
      aa.m(o(localadj.iwo));
      aa.m(p(localadj.igy));
      if (((this.dul == null) || (this.duo >= this.dul.size())) && ((this.duk == null) || (this.dun >= this.duk.size())))
      {
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    }
    while (a(tp(), this.dlH) >= 0);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 133;
  }

  protected final int sB()
  {
    return 10;
  }

  public final List wE()
  {
    return this.duk;
  }

  public final List wF()
  {
    return this.dul;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.au
 * JD-Core Version:    0.6.2
 */