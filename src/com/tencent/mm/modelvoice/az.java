package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.c.p;
import com.tencent.mm.compatible.g.o;
import com.tencent.mm.sdk.platformtools.z;

public final class az
{
  private static boolean dHV = true;

  static
  {
    int i = p.mU();
    if ((i & 0x400) != 0);
    try
    {
      o.a("wechatvoicesilk_v7a", ab.class.getClassLoader());
      dHV = false;
      return;
      if ((i & 0x200) != 0)
      {
        o.a("wechatvoicesilk", ab.class.getClassLoader());
        dHV = false;
        return;
      }
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      z.e("SilkCodec", "load library failed!");
      dHV = true;
      return;
    }
    z.e("SilkCodec", "load library failed! silk don't support armv5!!!!");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.az
 * JD-Core Version:    0.6.2
 */