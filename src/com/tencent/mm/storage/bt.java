package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.si;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bt extends cg
{
  private si ikz = new si();

  public bt(String paramString, int paramInt)
  {
    super(arrayOfObject);
    this.ikz.hOC = new vt().wF(ch.ja(paramString));
    this.ikz.dZy = paramInt;
  }

  public final a aKx()
  {
    return this.ikz;
  }

  public final int getCmdId()
  {
    return 20;
  }

  public final int wy()
  {
    return 114;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bt
 * JD-Core Version:    0.6.2
 */