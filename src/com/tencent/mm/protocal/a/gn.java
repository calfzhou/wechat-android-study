package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class gn extends com.tencent.mm.ao.a
{
  public String fxH;
  public String hSc;
  public String hWc;
  public String hWd;
  public String hWe;
  public String hWf;
  public int hWg;
  public int hWh;
  public int hWi;
  public LinkedList hWj = new LinkedList();
  public String hWk;
  public int hWl;
  public String hWm;
  public String hWn;
  public String hWo;
  public String hWp;
  public String hWq;
  public int hWr;
  public LinkedList hWs = new LinkedList();
  public int hWt;
  public String hWu;
  public String hWv;
  public String hWw;

  public static boolean a(b.a.a.a.a parama, gn paramgn, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramgn.hSc = parama.ben();
      return true;
    case 2:
      paramgn.fxH = parama.ben();
      return true;
    case 3:
      paramgn.hWc = parama.ben();
      return true;
    case 4:
      paramgn.hWd = parama.ben();
      return true;
    case 5:
      paramgn.hWe = parama.ben();
      return true;
    case 6:
      paramgn.hWf = parama.ben();
      return true;
    case 7:
      paramgn.hWg = parama.bel();
      return true;
    case 8:
      paramgn.hWh = parama.bel();
      return true;
    case 9:
      paramgn.hWi = parama.bel();
      return true;
    case 10:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        vt localvt = new vt();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = vt.a(locala2, localvt, locala2.bet()));
        paramgn.hWj.add(localvt);
      }
      return true;
    case 11:
      paramgn.hWk = parama.ben();
      return true;
    case 12:
      paramgn.hWl = parama.bel();
      return true;
    case 13:
      paramgn.hWm = parama.ben();
      return true;
    case 14:
      paramgn.hWn = parama.ben();
      return true;
    case 15:
      paramgn.hWo = parama.ben();
      return true;
    case 16:
      paramgn.hWp = parama.ben();
      return true;
    case 17:
      paramgn.hWq = parama.ben();
      return true;
    case 18:
      paramgn.hWr = parama.bel();
      return true;
    case 19:
      LinkedList localLinkedList1 = parama.rN(paramInt);
      int i = localLinkedList1.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
        uc localuc = new uc();
        b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
        for (boolean bool1 = true; bool1; bool1 = uc.a(locala1, localuc, locala1.bet()));
        paramgn.hWs.add(localuc);
      }
      return true;
    case 20:
      paramgn.hWt = parama.bel();
      return true;
    case 21:
      paramgn.hWu = parama.ben();
      return true;
    case 22:
      paramgn.hWv = parama.ben();
      return true;
    case 23:
    }
    paramgn.hWw = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hSc != null)
      parama.I(1, this.hSc);
    if (this.fxH != null)
      parama.I(2, this.fxH);
    if (this.hWc != null)
      parama.I(3, this.hWc);
    if (this.hWd != null)
      parama.I(4, this.hWd);
    if (this.hWe != null)
      parama.I(5, this.hWe);
    if (this.hWf != null)
      parama.I(6, this.hWf);
    parama.by(7, this.hWg);
    parama.by(8, this.hWh);
    parama.by(9, this.hWi);
    parama.d(10, 8, this.hWj);
    if (this.hWk != null)
      parama.I(11, this.hWk);
    parama.by(12, this.hWl);
    if (this.hWm != null)
      parama.I(13, this.hWm);
    if (this.hWn != null)
      parama.I(14, this.hWn);
    if (this.hWo != null)
      parama.I(15, this.hWo);
    if (this.hWp != null)
      parama.I(16, this.hWp);
    if (this.hWq != null)
      parama.I(17, this.hWq);
    parama.by(18, this.hWr);
    parama.d(19, 8, this.hWs);
    parama.by(20, this.hWt);
    if (this.hWu != null)
      parama.I(21, this.hWu);
    if (this.hWv != null)
      parama.I(22, this.hWv);
    if (this.hWw != null)
      parama.I(23, this.hWw);
  }

  public final int hD()
  {
    String str = this.hSc;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hSc);
    if (this.fxH != null)
      i += b.a.a.b.b.a.J(2, this.fxH);
    if (this.hWc != null)
      i += b.a.a.b.b.a.J(3, this.hWc);
    if (this.hWd != null)
      i += b.a.a.b.b.a.J(4, this.hWd);
    if (this.hWe != null)
      i += b.a.a.b.b.a.J(5, this.hWe);
    if (this.hWf != null)
      i += b.a.a.b.b.a.J(6, this.hWf);
    int j = i + b.a.a.a.br(7, this.hWg) + b.a.a.a.br(8, this.hWh) + b.a.a.a.br(9, this.hWi) + b.a.a.a.c(10, 8, this.hWj);
    if (this.hWk != null)
      j += b.a.a.b.b.a.J(11, this.hWk);
    int k = j + b.a.a.a.br(12, this.hWl);
    if (this.hWm != null)
      k += b.a.a.b.b.a.J(13, this.hWm);
    if (this.hWn != null)
      k += b.a.a.b.b.a.J(14, this.hWn);
    if (this.hWo != null)
      k += b.a.a.b.b.a.J(15, this.hWo);
    if (this.hWp != null)
      k += b.a.a.b.b.a.J(16, this.hWp);
    if (this.hWq != null)
      k += b.a.a.b.b.a.J(17, this.hWq);
    int m = k + b.a.a.a.br(18, this.hWr) + b.a.a.a.c(19, 8, this.hWs) + b.a.a.a.br(20, this.hWt);
    if (this.hWu != null)
      m += b.a.a.b.b.a.J(21, this.hWu);
    if (this.hWv != null)
      m += b.a.a.b.b.a.J(22, this.hWv);
    if (this.hWw != null)
      m += b.a.a.b.b.a.J(23, this.hWw);
    return m;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gn
 * JD-Core Version:    0.6.2
 */