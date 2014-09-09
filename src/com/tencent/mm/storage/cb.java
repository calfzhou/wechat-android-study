package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.tz;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class cb extends cg
{
  private tz ikH = new tz();

  public cb(String paramString)
  {
    super(new Object[] { paramString });
    this.ikH.hUp = new vt().wF(ch.ja(paramString));
  }

  public final a aKx()
  {
    return this.ikH;
  }

  public final int getCmdId()
  {
    return 11;
  }

  public final int wy()
  {
    return 109;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cb
 * JD-Core Version:    0.6.2
 */