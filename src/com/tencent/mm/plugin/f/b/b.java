package com.tencent.mm.plugin.f.b;

import com.tencent.mm.protocal.a.pw;
import com.tencent.mm.protocal.m;
import com.tencent.mm.protocal.n;
import com.tencent.mm.protocal.p;

public final class b extends p
  implements n
{
  public pw fSZ = new pw();

  public final int getCmdId()
  {
    return 0;
  }

  public final int sV()
  {
    return 499;
  }

  public final byte[] sW()
  {
    this.fSZ.hRy = m.b(this);
    return this.fSZ.toByteArray();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.b
 * JD-Core Version:    0.6.2
 */