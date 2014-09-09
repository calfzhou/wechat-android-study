package com.tencent.mm.ab;

import com.tencent.mm.o.v;
import com.tencent.mm.protocal.aq;
import com.tencent.mm.protocal.ar;
import com.tencent.mm.protocal.p;
import com.tencent.mm.protocal.q;

public final class m extends v
{
  private final aq dzF = new aq();
  private final ar dzG;
  private final boolean dzH;

  public m(ar paramar)
  {
    this.dzG = paramar;
    this.dzH = true;
  }

  public m(boolean paramBoolean)
  {
    this.dzG = new ar();
    this.dzH = paramBoolean;
  }

  public final int getType()
  {
    return 38;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/newsync";
  }

  public final p sR()
  {
    return this.dzF;
  }

  public final q sS()
  {
    return this.dzG;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.m
 * JD-Core Version:    0.6.2
 */