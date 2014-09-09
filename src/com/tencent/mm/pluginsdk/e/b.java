package com.tencent.mm.pluginsdk.e;

import android.app.Activity;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class b
  implements m
{
  public Activity cHB;
  private Set hwt = new HashSet();

  public b(Activity paramActivity)
  {
    this.cHB = paramActivity;
  }

  public final boolean a(n paramn)
  {
    if (paramn.action == 0)
      return false;
    switch (paramn.action)
    {
    case 3:
    default:
      return false;
    case 1:
      return b(paramn);
    case 2:
      return c(paramn);
    case 4:
      return d(paramn);
    case 5:
    }
    return e(paramn);
  }

  public final void b(m paramm)
  {
    Iterator localIterator = this.hwt.iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      bg.qX().b(localInteger.intValue(), paramm);
    }
    this.cHB = null;
  }

  public abstract boolean b(n paramn);

  public abstract boolean c(n paramn);

  public abstract boolean d(n paramn);

  public abstract boolean e(n paramn);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.b
 * JD-Core Version:    0.6.2
 */