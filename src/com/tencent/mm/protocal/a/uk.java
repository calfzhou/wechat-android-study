package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class uk extends com.tencent.mm.ao.a
{
  public String fuY;
  public int hOV;
  public String hOt;
  public int hTi;
  public String ipf;
  public int ipg;
  public int ipl;
  public String ipm;
  public String ipn;
  public int ipo;
  public String ipp;
  public int ipq;
  public String ipr;
  public String ips;
  public String ipt;
  public String ipu;
  public LinkedList ipv = new LinkedList();

  public static boolean a(b.a.a.a.a parama, uk paramuk, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramuk.ipf = parama.ben();
      return true;
    case 2:
      paramuk.ipl = parama.bel();
      return true;
    case 3:
      paramuk.ipm = parama.ben();
      return true;
    case 4:
      paramuk.hOV = parama.bel();
      return true;
    case 5:
      paramuk.ipn = parama.ben();
      return true;
    case 6:
      paramuk.ipo = parama.bel();
      return true;
    case 7:
      paramuk.ipp = parama.ben();
      return true;
    case 8:
      paramuk.ipq = parama.bel();
      return true;
    case 9:
      paramuk.ipg = parama.bel();
      return true;
    case 10:
      paramuk.ipr = parama.ben();
      return true;
    case 11:
      paramuk.hOt = parama.ben();
      return true;
    case 12:
      paramuk.fuY = parama.ben();
      return true;
    case 13:
      paramuk.ips = parama.ben();
      return true;
    case 14:
      paramuk.ipt = parama.ben();
      return true;
    case 15:
      paramuk.ipu = parama.ben();
      return true;
    case 16:
      paramuk.hTi = parama.bel();
      return true;
    case 17:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      zc localzc = new zc();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = zc.a(locala, localzc, locala.bet()));
      paramuk.ipv.add(localzc);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ipf != null)
      parama.I(1, this.ipf);
    parama.by(2, this.ipl);
    if (this.ipm != null)
      parama.I(3, this.ipm);
    parama.by(4, this.hOV);
    if (this.ipn != null)
      parama.I(5, this.ipn);
    parama.by(6, this.ipo);
    if (this.ipp != null)
      parama.I(7, this.ipp);
    parama.by(8, this.ipq);
    parama.by(9, this.ipg);
    if (this.ipr != null)
      parama.I(10, this.ipr);
    if (this.hOt != null)
      parama.I(11, this.hOt);
    if (this.fuY != null)
      parama.I(12, this.fuY);
    if (this.ips != null)
      parama.I(13, this.ips);
    if (this.ipt != null)
      parama.I(14, this.ipt);
    if (this.ipu != null)
      parama.I(15, this.ipu);
    parama.by(16, this.hTi);
    parama.d(17, 8, this.ipv);
  }

  public final int hD()
  {
    String str = this.ipf;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ipf);
    int j = i + b.a.a.a.br(2, this.ipl);
    if (this.ipm != null)
      j += b.a.a.b.b.a.J(3, this.ipm);
    int k = j + b.a.a.a.br(4, this.hOV);
    if (this.ipn != null)
      k += b.a.a.b.b.a.J(5, this.ipn);
    int m = k + b.a.a.a.br(6, this.ipo);
    if (this.ipp != null)
      m += b.a.a.b.b.a.J(7, this.ipp);
    int n = m + b.a.a.a.br(8, this.ipq) + b.a.a.a.br(9, this.ipg);
    if (this.ipr != null)
      n += b.a.a.b.b.a.J(10, this.ipr);
    if (this.hOt != null)
      n += b.a.a.b.b.a.J(11, this.hOt);
    if (this.fuY != null)
      n += b.a.a.b.b.a.J(12, this.fuY);
    if (this.ips != null)
      n += b.a.a.b.b.a.J(13, this.ips);
    if (this.ipt != null)
      n += b.a.a.b.b.a.J(14, this.ipt);
    if (this.ipu != null)
      n += b.a.a.b.b.a.J(15, this.ipu);
    return n + b.a.a.a.br(16, this.hTi) + b.a.a.a.c(17, 8, this.ipv);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.uk
 * JD-Core Version:    0.6.2
 */