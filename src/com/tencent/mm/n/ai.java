package com.tencent.mm.n;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

final class ai
  implements az
{
  ai(af paramaf)
  {
  }

  public final boolean kJ()
  {
    if ((!bg.oE()) || (af.sh() == null))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(bg.oE());
      arrayOfObject[1] = af.sh();
      z.w("!32@/B4Tb64lLpIAhUt0Bg2QTjPirIFtLxXY", "upAssetsHandler onTimerExpired acc:%b astg:%s ", arrayOfObject);
      return false;
    }
    if (((Boolean)bg.qW().oQ().get(90113, Boolean.valueOf(false))).booleanValue())
    {
      af.sN();
      af.sM();
    }
    bg.qW().oQ().set(90113, Boolean.valueOf(false));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.ai
 * JD-Core Version:    0.6.2
 */