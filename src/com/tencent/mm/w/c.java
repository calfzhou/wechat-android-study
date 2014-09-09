package com.tencent.mm.w;

import com.tencent.mm.compatible.g.h;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;

public final class c
  implements ax
{
  private String f(int paramInt, boolean paramBoolean)
  {
    if (!bg.qW().isSDCardAvailable())
      return null;
    int i;
    int j;
    if (paramInt == 0)
    {
      i = -1;
      j = 0;
      if (i != -1)
        break label69;
      label25: if (j != 0)
        break label77;
    }
    label67: label69: label77: for (String str = null; ; str = e(j, paramBoolean))
    {
      if (!com.tencent.mm.a.c.ac(str))
        break label89;
      return str;
      for (i = 0; ; i++)
      {
        if (i >= 32)
          break label67;
        paramInt = 0x7FFFFFFF & paramInt >> 1;
        if (paramInt == 0)
          break;
      }
      break;
      j = 1 << i;
      break label25;
    }
    label89: qB();
    return null;
  }

  public final String cI(int paramInt)
  {
    return f(paramInt, true);
  }

  public final String cJ(int paramInt)
  {
    return f(paramInt, false);
  }

  public final boolean cK(int paramInt)
  {
    if (paramInt == 0)
      return false;
    for (int i = 0; ; i++)
    {
      if (i >= 32)
        break label52;
      if ((!com.tencent.mm.a.c.ac(e(paramInt & 1 << i, false))) || (!com.tencent.mm.a.c.ac(e(paramInt & 1 << i, true))))
        break;
    }
    label52: return true;
  }

  public final String e(int paramInt, boolean paramBoolean)
  {
    if (paramInt == 0)
      return null;
    StringBuilder localStringBuilder = new StringBuilder().append(h.dOM).append("vuserpic_").append(Integer.toHexString(paramInt));
    if (paramBoolean);
    for (String str = "_HD"; ; str = "")
      return str + ".png";
  }

  public final void qB()
  {
    if (!bg.qW().isSDCardAvailable());
    long l1;
    long l2;
    do
    {
      return;
      l1 = ch.a((Long)bg.qW().oQ().get(66051), 0L);
      l2 = ch.CM();
    }
    while (432000000L > l2 - l1);
    bg.qW().oQ().set(66051, Long.valueOf(l2));
    new d();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.c
 * JD-Core Version:    0.6.2
 */