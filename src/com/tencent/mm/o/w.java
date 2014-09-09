package com.tencent.mm.o;

import com.tencent.mm.protocal.ad;
import com.tencent.mm.protocal.ae;
import com.tencent.mm.protocal.p;
import com.tencent.mm.protocal.q;

public final class w extends v
{
  private final ad dox = new ad();
  private final ae doy = new ae();

  public final int getType()
  {
    return 381;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/getcert";
  }

  protected final p sR()
  {
    return this.dox;
  }

  public final q sS()
  {
    return this.doy;
  }

  public final int tl()
  {
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.w
 * JD-Core Version:    0.6.2
 */