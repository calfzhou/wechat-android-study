package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.st;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bw extends cg
{
  private st ikC = new st();

  public bw(long paramLong, int paramInt, String paramString1, String paramString2)
  {
    super(arrayOfObject);
    this.ikC.hOY = paramLong;
    this.ikC.dZy = paramInt;
    this.ikC.hOP = new vt().wF(ch.ja(paramString1));
    this.ikC.hOQ = new vt().wF(ch.ja(paramString2));
  }

  public final a aKx()
  {
    return this.ikC;
  }

  public final int getCmdId()
  {
    return 6;
  }

  public final int wy()
  {
    return 103;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bw
 * JD-Core Version:    0.6.2
 */