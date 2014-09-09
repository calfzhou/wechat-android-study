package com.tencent.mm.k;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import java.util.HashMap;

public class i
  implements bd
{
  private a dQq = a.Ci();

  public static a Ck()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    i locali = (i)bg.qF().eA(i.class.getName());
    if (locali == null)
    {
      locali = new i();
      bg.qF().a(i.class.getName(), locali);
      locali.dQq.init();
    }
    return locali.dQq;
  }

  public final void O(boolean paramBoolean)
  {
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    this.dQq.clear();
  }

  public final HashMap nw()
  {
    return null;
  }

  public final void r(String paramString1, String paramString2)
  {
    this.dQq.init();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.k.i
 * JD-Core Version:    0.6.2
 */