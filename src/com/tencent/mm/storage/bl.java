package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.fk;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bl extends cg
{
  private fk ikr = new fk();

  public bl(String paramString1, String paramString2)
  {
    super(new Object[] { paramString1, paramString2 });
    this.ikr.hVf = new vt().wF(ch.ja(paramString1));
    this.ikr.hVm = new vt().wF(ch.ja(paramString2));
  }

  public final a aKx()
  {
    return this.ikr;
  }

  public final int getCmdId()
  {
    return 19;
  }

  public final int wy()
  {
    return 115;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bl
 * JD-Core Version:    0.6.2
 */