package com.tencent.mm.modelsimple;

import com.tencent.mm.o.v;
import com.tencent.mm.protocal.aw;
import com.tencent.mm.protocal.ax;
import com.tencent.mm.protocal.p;
import com.tencent.mm.protocal.q;

public final class ag extends v
{
  private final aw dCU = new aw();
  private final ax dCV = new ax();

  public final int getType()
  {
    return 126;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/newreg";
  }

  protected final p sR()
  {
    return this.dCU;
  }

  public final q sS()
  {
    return this.dCV;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ag
 * JD-Core Version:    0.6.2
 */