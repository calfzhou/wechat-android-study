package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ki extends com.tencent.mm.ao.a
  implements zd
{
  public int hQw;
  public int iaZ;
  public int iba;
  public int ibb;
  public LinkedList ibc = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hQw);
    parama.by(2, this.iaZ);
    parama.by(3, this.iba);
    parama.by(4, this.ibb);
    parama.d(5, 8, this.ibc);
  }

  public final int getRet()
  {
    return this.hQw;
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.hQw) + b.a.a.a.br(2, this.iaZ) + b.a.a.a.br(3, this.iba) + b.a.a.a.br(4, this.ibb) + b.a.a.a.c(5, 8, this.ibc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ki
 * JD-Core Version:    0.6.2
 */