package com.tencent.mm.protocal.a;

public final class zt extends com.tencent.mm.ao.a
{
  public int hWX;
  public ws ipc;
  public long isD;

  public final void a(b.a.a.c.a parama)
  {
    parama.k(1, this.isD);
    parama.by(2, this.hWX);
    if (this.ipc != null)
    {
      parama.bv(3, this.ipc.hD());
      this.ipc.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.i(1, this.isD) + b.a.a.a.br(2, this.hWX);
    if (this.ipc != null)
      i += b.a.a.a.bs(3, this.ipc.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zt
 * JD-Core Version:    0.6.2
 */