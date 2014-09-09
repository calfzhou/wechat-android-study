package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.su;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bx extends cg
{
  private su ikD = new su();

  public bx(String paramString, int paramInt)
  {
    super(arrayOfObject);
    this.ikD.hVf = new vt().wF(ch.ja(paramString));
    this.ikD.dZy = paramInt;
  }

  public final a aKx()
  {
    return this.ikD;
  }

  public final int getCmdId()
  {
    return 14;
  }

  public final int wy()
  {
    return 111;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bx
 * JD-Core Version:    0.6.2
 */