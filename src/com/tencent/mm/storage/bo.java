package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.pi;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bo extends cg
{
  private pi iku = new pi();

  public bo(String paramString, int paramInt)
  {
    super(arrayOfObject);
    this.iku.gnq = ch.ja(paramString);
    this.iku.ifp = paramInt;
  }

  public final a aKx()
  {
    return this.iku;
  }

  public final int getCmdId()
  {
    return 22;
  }

  public final int wy()
  {
    return 125;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bo
 * JD-Core Version:    0.6.2
 */