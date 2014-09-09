package com.tencent.mm.ui.pluginapp;

import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.wz;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.f;

final class m
  implements f
{
  m(k paramk)
  {
  }

  public final String dv(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.jKI.getCount()))
      z.e("!56@/B4Tb64lLpLSOpQlr7qYXSiotJyEnOm+7HXaKiCJndNViGfFNbhzqQ==", "pos is invalid");
    wz localwz;
    do
    {
      return null;
      localwz = this.jKI.qI(paramInt);
    }
    while (localwz == null);
    return localwz.hVf.getString();
  }

  public final int vX()
  {
    return this.jKI.getCount();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.m
 * JD-Core Version:    0.6.2
 */