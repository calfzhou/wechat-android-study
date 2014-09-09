package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.fh;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.LinkedList;

@Deprecated
public final class bk extends cg
{
  private fh ikq = new fh();

  public bk(String paramString, long paramLong)
  {
    super(arrayOfObject);
    this.ikq.hVf = new vt().wF(ch.ja(paramString));
    this.ikq.hVk.add(Integer.valueOf((int)paramLong));
    this.ikq.huF = 1;
  }

  public final a aKx()
  {
    return this.ikq;
  }

  public final int getCmdId()
  {
    return 9;
  }

  public final int wy()
  {
    return 107;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bk
 * JD-Core Version:    0.6.2
 */