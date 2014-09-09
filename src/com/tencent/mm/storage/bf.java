package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.ed;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bf extends cg
{
  private ed ikl = new ed();

  public bf(String paramString)
  {
    super(new Object[] { paramString });
    this.ikl.hUp = new vt().wF(ch.ja(paramString));
  }

  public final a aKx()
  {
    return this.ikl;
  }

  public final int getCmdId()
  {
    return 12;
  }

  public final int wy()
  {
    return 110;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bf
 * JD-Core Version:    0.6.2
 */