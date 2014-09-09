package com.tencent.mm.booter;

import com.tencent.mm.c.a.iz;
import com.tencent.mm.c.a.ja;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.storage.ar;

final class w extends g
{
  w(u paramu)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if ((parame != null) && ((parame instanceof iz)))
    {
      ar localar = ((iz)parame).cNk.cMM;
      if (localar != null)
        this.diD.a(localar);
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.w
 * JD-Core Version:    0.6.2
 */