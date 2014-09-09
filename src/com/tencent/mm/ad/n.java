package com.tencent.mm.ad;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;

public final class n extends g
{
  public n()
  {
    super(0);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    if (1000L * ch.ab(ch.a((Long)bg.qW().oQ().get(66818), 0L)) > 1800000L);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        int j = ch.a((Integer)bg.qW().oQ().get(66820), -99999);
        if (j != -99999)
        {
          cx.g(9, String.valueOf(j));
          bg.qW().oQ().set(66820, Integer.valueOf(-99999));
        }
        bg.qW().oQ().set(66818, Long.valueOf(ch.CL()));
      }
      return false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.n
 * JD-Core Version:    0.6.2
 */