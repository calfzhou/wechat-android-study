package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class el extends com.tencent.mm.ao.a
{
  public int dtf;
  public String dti;
  public String gnq;
  public ws hOU;
  public String hTI;
  public String hUA;
  public String hUB;
  public int hUC;
  public int hUD;
  public String hUE;
  public int hUF;
  public String hUG;
  public String hUH;
  public int hUI;
  public int hUJ;
  public LinkedList hUK = new LinkedList();
  public String hUL;
  public int hUM;
  public int hUN;
  public int hUO;
  public int hUP;
  public String hwV;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hOU == null)
      throw new b("Not all required fields were included");
    if (this.gnq != null)
      parama.I(1, this.gnq);
    if (this.hwV != null)
      parama.I(2, this.hwV);
    if (this.hUA != null)
      parama.I(3, this.hUA);
    if (this.hUB != null)
      parama.I(4, this.hUB);
    parama.by(5, this.dtf);
    if (this.hOU != null)
    {
      parama.bv(6, this.hOU.hD());
      this.hOU.a(parama);
    }
    parama.by(7, this.hUC);
    parama.by(8, this.hUD);
    if (this.hUE != null)
      parama.I(9, this.hUE);
    parama.by(10, this.hUF);
    if (this.hUG != null)
      parama.I(11, this.hUG);
    if (this.hUH != null)
      parama.I(12, this.hUH);
    parama.by(13, this.hUI);
    parama.by(14, this.hUJ);
    parama.d(15, 8, this.hUK);
    if (this.hUL != null)
      parama.I(16, this.hUL);
    parama.by(17, this.hUM);
    parama.by(18, this.hUN);
    if (this.hTI != null)
      parama.I(19, this.hTI);
    parama.by(20, this.hUO);
    parama.by(21, this.hUP);
    if (this.dti != null)
      parama.I(22, this.dti);
  }

  public final el bg(byte[] paramArrayOfByte)
  {
    this.hUK.clear();
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      default:
        j = 0;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        this.gnq = locala1.ben();
        j = 1;
        continue;
        this.hwV = locala1.ben();
        j = 1;
        continue;
        this.hUA = locala1.ben();
        j = 1;
        continue;
        this.hUB = locala1.ben();
        j = 1;
        continue;
        this.dtf = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList2 = locala1.rN(i);
        int n = localLinkedList2.size();
        for (int i1 = 0; i1 < n; i1++)
        {
          byte[] arrayOfByte2 = (byte[])localLinkedList2.get(i1);
          ws localws = new ws();
          b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte2, hre);
          for (boolean bool2 = true; bool2; bool2 = ws.a(locala3, localws, locala3.bet()));
          this.hOU = localws;
        }
        j = 1;
        continue;
        this.hUC = locala1.bel();
        j = 1;
        continue;
        this.hUD = locala1.bel();
        j = 1;
        continue;
        this.hUE = locala1.ben();
        j = 1;
        continue;
        this.hUF = locala1.bel();
        j = 1;
        continue;
        this.hUG = locala1.ben();
        j = 1;
        continue;
        this.hUH = locala1.ben();
        j = 1;
        continue;
        this.hUI = locala1.bel();
        j = 1;
        continue;
        this.hUJ = locala1.bel();
        j = 1;
        continue;
        LinkedList localLinkedList1 = locala1.rN(i);
        int k = localLinkedList1.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte1 = (byte[])localLinkedList1.get(m);
          wr localwr = new wr();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte1, hre);
          for (boolean bool1 = true; bool1; bool1 = wr.a(locala2, localwr, locala2.bet()));
          this.hUK.add(localwr);
        }
        j = 1;
        continue;
        this.hUL = locala1.ben();
        j = 1;
        continue;
        this.hUM = locala1.bel();
        j = 1;
        continue;
        this.hUN = locala1.bel();
        j = 1;
        continue;
        this.hTI = locala1.ben();
        j = 1;
        continue;
        this.hUO = locala1.bel();
        j = 1;
        continue;
        this.hUP = locala1.bel();
        j = 1;
        continue;
        this.dti = locala1.ben();
        j = 1;
      }
    }
    if (this.hOU == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    if (this.hwV != null)
      i += b.a.a.b.b.a.J(2, this.hwV);
    if (this.hUA != null)
      i += b.a.a.b.b.a.J(3, this.hUA);
    if (this.hUB != null)
      i += b.a.a.b.b.a.J(4, this.hUB);
    int j = i + b.a.a.a.br(5, this.dtf);
    if (this.hOU != null)
      j += b.a.a.a.bs(6, this.hOU.hD());
    int k = j + b.a.a.a.br(7, this.hUC) + b.a.a.a.br(8, this.hUD);
    if (this.hUE != null)
      k += b.a.a.b.b.a.J(9, this.hUE);
    int m = k + b.a.a.a.br(10, this.hUF);
    if (this.hUG != null)
      m += b.a.a.b.b.a.J(11, this.hUG);
    if (this.hUH != null)
      m += b.a.a.b.b.a.J(12, this.hUH);
    int n = m + b.a.a.a.br(13, this.hUI) + b.a.a.a.br(14, this.hUJ) + b.a.a.a.c(15, 8, this.hUK);
    if (this.hUL != null)
      n += b.a.a.b.b.a.J(16, this.hUL);
    int i1 = n + b.a.a.a.br(17, this.hUM) + b.a.a.a.br(18, this.hUN);
    if (this.hTI != null)
      i1 += b.a.a.b.b.a.J(19, this.hTI);
    int i2 = i1 + b.a.a.a.br(20, this.hUO) + b.a.a.a.br(21, this.hUP);
    if (this.dti != null)
      i2 += b.a.a.b.b.a.J(22, this.dti);
    return i2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.el
 * JD-Core Version:    0.6.2
 */