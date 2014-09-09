package com.tencent.mm.o;

import com.tencent.mm.protocal.a.vn;

public final class a extends v
{
  private c dof = null;
  private d dog = null;
  private int doh;
  private String uri;

  private a(com.tencent.mm.ao.a parama1, com.tencent.mm.ao.a parama2, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((paramBoolean) && ((parama1 instanceof vn)));
    for (boolean bool = true; ; bool = false)
    {
      this.dof = new c(parama1, paramInt1, paramInt2, bool);
      this.dog = new d(parama2, paramInt3, paramBoolean);
      this.uri = paramString;
      this.doh = paramInt1;
      return;
    }
  }

  public final int getType()
  {
    return this.doh;
  }

  public final String getUri()
  {
    return this.uri;
  }

  public final com.tencent.mm.ao.a sO()
  {
    return c.a(this.dof);
  }

  public final com.tencent.mm.ao.a sP()
  {
    return d.a(this.dog);
  }

  public final d sQ()
  {
    return this.dog;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.a
 * JD-Core Version:    0.6.2
 */