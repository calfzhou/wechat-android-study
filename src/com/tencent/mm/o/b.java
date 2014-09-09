package com.tencent.mm.o;

import com.tencent.mm.sdk.platformtools.ch;

public final class b
{
  private int doh;
  private com.tencent.mm.ao.a doi;
  private com.tencent.mm.ao.a doj;
  private int dok = -2147483648;
  private int dol = -2147483648;
  private boolean dom = true;
  private String uri;

  public final void a(com.tencent.mm.ao.a parama)
  {
    this.doi = parama;
  }

  public final void b(com.tencent.mm.ao.a parama)
  {
    this.doj = parama;
  }

  public final void de(int paramInt)
  {
    this.doh = paramInt;
  }

  public final void df(int paramInt)
  {
    this.dok = paramInt;
  }

  public final void dg(int paramInt)
  {
    this.dol = paramInt;
  }

  public final void fi(String paramString)
  {
    this.uri = paramString;
  }

  public final void sT()
  {
    this.dom = false;
  }

  public final a sU()
  {
    if ((this.doi == null) || (this.doj == null) || (ch.jb(this.uri)) || (this.doh <= 0) || (this.dok == -2147483648) || (this.dol == -2147483648))
      throw new IllegalArgumentException();
    return new a(this.doi, this.doj, this.uri, this.doh, this.dok, this.dol, this.dom, (byte)0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.b
 * JD-Core Version:    0.6.2
 */