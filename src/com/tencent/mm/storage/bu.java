package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.sj;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bu extends cg
{
  private sj ikA = new sj();

  public bu(String paramString1, String paramString2)
  {
    super(new Object[] { paramString1, paramString2 });
    this.ikA.hOC = new vt().wF(ch.ja(paramString1));
    this.ikA.ilY = new vt().wF(ch.ja(paramString2));
  }

  public final a aKx()
  {
    return this.ikA;
  }

  public final int getCmdId()
  {
    return 27;
  }

  public final int wy()
  {
    return 118;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bu
 * JD-Core Version:    0.6.2
 */