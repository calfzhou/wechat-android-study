package com.tencent.mm.modelsimple;

import com.tencent.mm.o.v;
import com.tencent.mm.protocal.az;
import com.tencent.mm.protocal.ba;
import com.tencent.mm.protocal.p;
import com.tencent.mm.protocal.q;

final class h extends v
{
  private final az dCh = new az();
  private final ba dCi = new ba();

  public final int getType()
  {
    return 26;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/sendcard";
  }

  protected final p sR()
  {
    return this.dCh;
  }

  public final q sS()
  {
    return this.dCi;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.h
 * JD-Core Version:    0.6.2
 */