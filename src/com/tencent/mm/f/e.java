package com.tencent.mm.f;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import java.util.HashMap;

public class e
  implements bd
{
  private c dPl = new c();
  private a dPm = new a();

  private static e oo()
  {
    e locale = (e)bg.qF().eA(e.class.getName());
    if (locale == null)
    {
      locale = new e();
      bg.qF().a(e.class.getName(), locale);
    }
    return locale;
  }

  public static c or()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    return oo().dPl;
  }

  public static a os()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    return oo().dPm;
  }

  public final void O(boolean paramBoolean)
  {
    if (paramBoolean)
      this.dPm.nW();
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
  }

  public final HashMap nw()
  {
    return null;
  }

  public final void r(String paramString1, String paramString2)
  {
    this.dPl.gu();
    this.dPm.init();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.f.e
 * JD-Core Version:    0.6.2
 */