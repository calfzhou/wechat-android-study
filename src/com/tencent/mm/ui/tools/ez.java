package com.tencent.mm.ui.tools;

import com.tencent.mm.model.bg;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelgeo.h;
import com.tencent.mm.o.ac;

final class ez
  implements c
{
  ez(MultiStageCitySelectUI paramMultiStageCitySelectUI)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2)
  {
    if (MultiStageCitySelectUI.a(this.jUj) == null);
    while (true)
    {
      return false;
      if (paramBoolean)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Float.valueOf(paramFloat2);
        arrayOfObject[1] = Float.valueOf(paramFloat1);
        arrayOfObject[2] = Double.valueOf(paramDouble2);
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpIde65kiMeUpqlCN7YBh+S07SSwJ3cICKI=", "lat:%f lng:%f accuracy:%f", arrayOfObject);
        com.tencent.mm.modelsimple.z localz = new com.tencent.mm.modelsimple.z(paramFloat2, paramFloat1);
        bg.qX().d(localz);
      }
      while (MultiStageCitySelectUI.a(this.jUj) != null)
      {
        MultiStageCitySelectUI.a(this.jUj).c(MultiStageCitySelectUI.c(this.jUj));
        MultiStageCitySelectUI.d(this.jUj);
        return false;
        MultiStageCitySelectUI.b(this.jUj);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ez
 * JD-Core Version:    0.6.2
 */