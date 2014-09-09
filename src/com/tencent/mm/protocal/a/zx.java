package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class zx extends vn
{
  public String hOJ;
  public LinkedList ilD = new LinkedList();
  public int ilx;
  public int ioe;
  public ws isU;
  public int itd;
  public LinkedList ite = new LinkedList();
  public long iti;
  public int itj;
  public LinkedList itk = new LinkedList();
  public int itp;
  public int itq;
  public int itr;

  public final void a(b.a.a.c.a parama)
  {
    if (this.isU == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.isU != null)
    {
      parama.bv(2, this.isU.hD());
      this.isU.a(parama);
    }
    parama.by(3, this.itd);
    parama.d(4, 8, this.ite);
    parama.by(5, this.itp);
    parama.by(6, this.ilx);
    if (this.hOJ != null)
      parama.I(7, this.hOJ);
    parama.by(8, this.itq);
    parama.by(9, this.ioe);
    parama.d(10, 8, this.ilD);
    parama.by(11, this.itr);
    parama.k(12, this.iti);
    parama.by(13, this.itj);
    parama.d(14, 8, this.itk);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.isU != null)
      i += b.a.a.a.bs(2, this.isU.hD());
    int j = i + b.a.a.a.br(3, this.itd) + b.a.a.a.c(4, 8, this.ite) + b.a.a.a.br(5, this.itp) + b.a.a.a.br(6, this.ilx);
    if (this.hOJ != null)
      j += b.a.a.b.b.a.J(7, this.hOJ);
    return j + b.a.a.a.br(8, this.itq) + b.a.a.a.br(9, this.ioe) + b.a.a.a.c(10, 8, this.ilD) + b.a.a.a.br(11, this.itr) + b.a.a.a.i(12, this.iti) + b.a.a.a.br(13, this.itj) + b.a.a.a.c(14, 8, this.itk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zx
 * JD-Core Version:    0.6.2
 */