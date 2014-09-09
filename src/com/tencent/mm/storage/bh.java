package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.ex;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bh extends cg
{
  private ex ikn = new ex();

  public bh(String paramString)
  {
    super(new Object[] { paramString });
    this.ikn.hVf = new vt().wF(ch.ja(paramString));
  }

  public final a aKx()
  {
    return this.ikn;
  }

  public final int getCmdId()
  {
    return 7;
  }

  public final int wy()
  {
    return 106;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bh
 * JD-Core Version:    0.6.2
 */