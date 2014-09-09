package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.fd;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bj extends cg
{
  private fd ikp = new fd();

  public bj(String paramString, long paramLong)
  {
    super(arrayOfObject);
    this.ikp.hVf = new vt().wF(ch.ja(paramString));
    this.ikp.hOY = paramLong;
  }

  public final a aKx()
  {
    return this.ikp;
  }

  public final int getCmdId()
  {
    return 8;
  }

  public final int wy()
  {
    return 105;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bj
 * JD-Core Version:    0.6.2
 */