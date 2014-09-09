package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class vs extends com.tencent.mm.ao.a
{
  public int hEU;
  public String hOq;
  public String hOr;
  public String hOs;
  public String hOt;
  public String hOu;
  public String hOv;
  public String hOw;
  public String hOx;
  public agb hOy;
  public String hPE;
  public int hRW;
  public String hsT;
  public String iqk;
  public String iql;
  public int iqm;
  public LinkedList iqn = new LinkedList();
  public String iqo;
  public String iqp;
  public String iqq;
  public String iqr;
  public String iqs;
  public String iqt;
  public String iqu;
  public int iqv;

  public static boolean a(b.a.a.a.a parama, vs paramvs, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramvs.hsT = parama.ben();
      return true;
    case 2:
      paramvs.hOt = parama.ben();
      return true;
    case 3:
      paramvs.hOu = parama.ben();
      return true;
    case 4:
      paramvs.iqk = parama.ben();
      return true;
    case 5:
      paramvs.hOr = parama.ben();
      return true;
    case 6:
      paramvs.hOq = parama.ben();
      return true;
    case 7:
      paramvs.iql = parama.ben();
      return true;
    case 8:
      paramvs.iqm = parama.bel();
      return true;
    case 9:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        vt localvt = new vt();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = vt.a(locala2, localvt, locala2.bet()));
        paramvs.iqn.add(localvt);
      }
      return true;
    case 10:
      paramvs.hOv = parama.ben();
      return true;
    case 11:
      paramvs.iqo = parama.ben();
      return true;
    case 12:
      paramvs.iqp = parama.ben();
      return true;
    case 13:
      paramvs.hEU = parama.bel();
      return true;
    case 14:
      paramvs.hPE = parama.ben();
      return true;
    case 15:
      paramvs.hOs = parama.ben();
      return true;
    case 16:
      paramvs.hOw = parama.ben();
      return true;
    case 17:
      paramvs.iqq = parama.ben();
      return true;
    case 18:
      paramvs.iqr = parama.ben();
      return true;
    case 19:
      paramvs.hOx = parama.ben();
      return true;
    case 20:
      paramvs.iqs = parama.ben();
      return true;
    case 21:
      paramvs.iqt = parama.ben();
      return true;
    case 22:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        agb localagb = new agb();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = agb.a(locala1, localagb, locala1.bet()));
        paramvs.hOy = localagb;
      }
      return true;
    case 23:
      paramvs.iqu = parama.ben();
      return true;
    case 24:
      paramvs.iqv = parama.bel();
      return true;
    case 25:
    }
    paramvs.hRW = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hsT != null)
      parama.I(1, this.hsT);
    if (this.hOt != null)
      parama.I(2, this.hOt);
    if (this.hOu != null)
      parama.I(3, this.hOu);
    if (this.iqk != null)
      parama.I(4, this.iqk);
    if (this.hOr != null)
      parama.I(5, this.hOr);
    if (this.hOq != null)
      parama.I(6, this.hOq);
    if (this.iql != null)
      parama.I(7, this.iql);
    parama.by(8, this.iqm);
    parama.d(9, 8, this.iqn);
    if (this.hOv != null)
      parama.I(10, this.hOv);
    if (this.iqo != null)
      parama.I(11, this.iqo);
    if (this.iqp != null)
      parama.I(12, this.iqp);
    parama.by(13, this.hEU);
    if (this.hPE != null)
      parama.I(14, this.hPE);
    if (this.hOs != null)
      parama.I(15, this.hOs);
    if (this.hOw != null)
      parama.I(16, this.hOw);
    if (this.iqq != null)
      parama.I(17, this.iqq);
    if (this.iqr != null)
      parama.I(18, this.iqr);
    if (this.hOx != null)
      parama.I(19, this.hOx);
    if (this.iqs != null)
      parama.I(20, this.iqs);
    if (this.iqt != null)
      parama.I(21, this.iqt);
    if (this.hOy != null)
    {
      parama.bv(22, this.hOy.hD());
      this.hOy.a(parama);
    }
    if (this.iqu != null)
      parama.I(23, this.iqu);
    parama.by(24, this.iqv);
    parama.by(25, this.hRW);
  }

  public final int hD()
  {
    String str = this.hsT;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hsT);
    if (this.hOt != null)
      i += b.a.a.b.b.a.J(2, this.hOt);
    if (this.hOu != null)
      i += b.a.a.b.b.a.J(3, this.hOu);
    if (this.iqk != null)
      i += b.a.a.b.b.a.J(4, this.iqk);
    if (this.hOr != null)
      i += b.a.a.b.b.a.J(5, this.hOr);
    if (this.hOq != null)
      i += b.a.a.b.b.a.J(6, this.hOq);
    if (this.iql != null)
      i += b.a.a.b.b.a.J(7, this.iql);
    int j = i + b.a.a.a.br(8, this.iqm) + b.a.a.a.c(9, 8, this.iqn);
    if (this.hOv != null)
      j += b.a.a.b.b.a.J(10, this.hOv);
    if (this.iqo != null)
      j += b.a.a.b.b.a.J(11, this.iqo);
    if (this.iqp != null)
      j += b.a.a.b.b.a.J(12, this.iqp);
    int k = j + b.a.a.a.br(13, this.hEU);
    if (this.hPE != null)
      k += b.a.a.b.b.a.J(14, this.hPE);
    if (this.hOs != null)
      k += b.a.a.b.b.a.J(15, this.hOs);
    if (this.hOw != null)
      k += b.a.a.b.b.a.J(16, this.hOw);
    if (this.iqq != null)
      k += b.a.a.b.b.a.J(17, this.iqq);
    if (this.iqr != null)
      k += b.a.a.b.b.a.J(18, this.iqr);
    if (this.hOx != null)
      k += b.a.a.b.b.a.J(19, this.hOx);
    if (this.iqs != null)
      k += b.a.a.b.b.a.J(20, this.iqs);
    if (this.iqt != null)
      k += b.a.a.b.b.a.J(21, this.iqt);
    if (this.hOy != null)
      k += b.a.a.a.bs(22, this.hOy.hD());
    if (this.iqu != null)
      k += b.a.a.b.b.a.J(23, this.iqu);
    return k + b.a.a.a.br(24, this.iqv) + b.a.a.a.br(25, this.hRW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vs
 * JD-Core Version:    0.6.2
 */