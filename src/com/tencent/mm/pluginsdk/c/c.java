package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.c.a.gi;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public abstract class c extends g
  implements m
{
  private static HashMap dvl = new HashMap();
  private static HashMap hub = new HashMap();
  private int hua = 0;

  public c(int paramInt)
  {
    super(0);
  }

  public static void e(e parame)
  {
    Iterator localIterator = hub.entrySet().iterator();
    Map.Entry localEntry;
    do
    {
      if (!localIterator.hasNext())
        break;
      localEntry = (Map.Entry)localIterator.next();
    }
    while (localEntry.getValue() != parame);
    for (x localx = (x)localEntry.getKey(); ; localx = null)
    {
      if (localx != null)
      {
        bg.qX().c(localx);
        hub.remove(localx);
      }
      return;
    }
  }

  public final void FM()
  {
    if (this.hua == 0)
      bg.qX().a(KF(), this);
    this.hua = (1 + this.hua);
  }

  public abstract int KF();

  public final void Vs()
  {
    if (this.hua == 0);
    do
    {
      return;
      this.hua = (-1 + this.hua);
    }
    while (this.hua != 0);
    bg.qX().b(KF(), this);
  }

  public abstract e a(x paramx, e parame);

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    e locale;
    if (KF() == paramx.getType())
    {
      locale = (e)hub.remove(paramx);
      if (locale != null);
    }
    else
    {
      return;
    }
    gi localgi = new gi();
    localgi.cLy.cLz = a(paramx, locale);
    localgi.cLy.errType = paramInt1;
    localgi.cLy.errCode = paramInt2;
    localgi.cLy.cGy = paramString;
    a.aGB().g(localgi);
  }

  public abstract x b(e parame);

  public final void f(e parame)
  {
    x localx = b(parame);
    bg.qX().d(localx);
    hub.put(localx, parame);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.c.c
 * JD-Core Version:    0.6.2
 */