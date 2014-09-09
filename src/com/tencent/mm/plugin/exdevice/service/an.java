package com.tencent.mm.plugin.exdevice.service;

import com.tencent.mm.plugin.exdevice.b.b;

public final class an
{
  private static an eKt = null;
  private b eKu;
  private n eKv;

  private static an PM()
  {
    if (eKt == null)
      eKt = new an();
    return eKt;
  }

  public static n PN()
  {
    if (PM().eKv == null)
      PM().eKv = new n();
    return PM().eKv;
  }

  public static b PO()
  {
    if (PM().eKu == null)
      PM().eKu = b.OY();
    return PM().eKu;
  }

  public static void b(af paramaf)
  {
    PO().a(paramaf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.an
 * JD-Core Version:    0.6.2
 */