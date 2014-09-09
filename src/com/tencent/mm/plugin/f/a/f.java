package com.tencent.mm.plugin.f.a;

import com.tencent.mm.protocal.a.pz;
import com.tencent.mm.sdk.platformtools.ch;

public final class f extends pz
  implements e
{
  private int fSS;

  public final int aeP()
  {
    return this.fSS;
  }

  public final int aeQ()
  {
    int i = 1 + this.huF;
    this.huF = i;
    return i;
  }

  public final int aew()
  {
    int i = this.ifI;
    if (ch.jb(this.ifH));
    for (int j = "".hashCode(); ; j = this.ifH.hashCode())
      return i + (0x4000000 | j & 0x7FFFFFFF);
  }

  public final int getType()
  {
    return 1;
  }

  public final void jo(int paramInt)
  {
    this.fSS = 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.a.f
 * JD-Core Version:    0.6.2
 */