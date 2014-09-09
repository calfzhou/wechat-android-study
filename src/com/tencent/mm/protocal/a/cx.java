package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class cx extends com.tencent.mm.ao.a
{
  public int hQv;
  public int hSV;
  public int hSW;
  public int hSX;
  public int hSY;
  public LinkedList hSZ = new LinkedList();
  public String hTa;
  public ws hTb;
  public int hTc;
  public int hTd;
  public LinkedList hTe = new LinkedList();

  public static boolean a(b.a.a.a.a parama, cx paramcx, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramcx.hSV = parama.bel();
      return true;
    case 2:
      paramcx.hQv = parama.bel();
      return true;
    case 3:
      paramcx.hSW = parama.bel();
      return true;
    case 4:
      paramcx.hSX = parama.bel();
      return true;
    case 5:
      paramcx.hSY = parama.bel();
      return true;
    case 6:
      LinkedList localLinkedList3 = parama.rN(paramInt);
      int n = localLinkedList3.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        byte[] arrayOfByte3 = (byte[])localLinkedList3.get(i1);
        vt localvt2 = new vt();
        b.a.a.a.a locala3 = new b.a.a.a.a(arrayOfByte3, hre);
        for (boolean bool3 = true; bool3; bool3 = vt.a(locala3, localvt2, locala3.bet()));
        paramcx.hSZ.add(localvt2);
      }
      return true;
    case 7:
      paramcx.hTa = parama.ben();
      return true;
    case 8:
      LinkedList localLinkedList2 = parama.rN(paramInt);
      int k = localLinkedList2.size();
      for (int m = 0; m < k; m++)
      {
        byte[] arrayOfByte2 = (byte[])localLinkedList2.get(m);
        ws localws = new ws();
        b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte2, hre);
        for (boolean bool2 = true; bool2; bool2 = ws.a(locala2, localws, locala2.bet()));
        paramcx.hTb = localws;
      }
      return true;
    case 9:
      paramcx.hTc = parama.bel();
      return true;
    case 10:
      paramcx.hTd = parama.bel();
      return true;
    case 11:
    }
    LinkedList localLinkedList1 = parama.rN(paramInt);
    int i = localLinkedList1.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte1 = (byte[])localLinkedList1.get(j);
      vt localvt1 = new vt();
      b.a.a.a.a locala1 = new b.a.a.a.a(arrayOfByte1, hre);
      for (boolean bool1 = true; bool1; bool1 = vt.a(locala1, localvt1, locala1.bet()));
      paramcx.hTe.add(localvt1);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hTb == null)
      throw new b("Not all required fields were included");
    parama.by(1, this.hSV);
    parama.by(2, this.hQv);
    parama.by(3, this.hSW);
    parama.by(4, this.hSX);
    parama.by(5, this.hSY);
    parama.d(6, 8, this.hSZ);
    if (this.hTa != null)
      parama.I(7, this.hTa);
    if (this.hTb != null)
    {
      parama.bv(8, this.hTb.hD());
      this.hTb.a(parama);
    }
    parama.by(9, this.hTc);
    parama.by(10, this.hTd);
    parama.d(11, 8, this.hTe);
  }

  public final cx be(byte[] paramArrayOfByte)
  {
    this.hSZ.clear();
    this.hTe.clear();
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    if (this.hTb == null)
      throw new b("Not all required fields were included");
    return this;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hSV) + b.a.a.a.br(2, this.hQv) + b.a.a.a.br(3, this.hSW) + b.a.a.a.br(4, this.hSX) + b.a.a.a.br(5, this.hSY) + b.a.a.a.c(6, 8, this.hSZ);
    if (this.hTa != null)
      i += b.a.a.b.b.a.J(7, this.hTa);
    if (this.hTb != null)
      i += b.a.a.a.bs(8, this.hTb.hD());
    return i + b.a.a.a.br(9, this.hTc) + b.a.a.a.br(10, this.hTd) + b.a.a.a.c(11, 8, this.hTe);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cx
 * JD-Core Version:    0.6.2
 */