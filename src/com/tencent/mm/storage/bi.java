package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.fa;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bi extends cg
{
  private fa iko = new fa();

  public bi(String paramString)
  {
    super(new Object[] { paramString });
    this.iko.hVf = new vt().wF(ch.ja(paramString));
  }

  public final a aKx()
  {
    return this.iko;
  }

  public final int getCmdId()
  {
    return 4;
  }

  public final int wy()
  {
    return 102;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bi
 * JD-Core Version:    0.6.2
 */