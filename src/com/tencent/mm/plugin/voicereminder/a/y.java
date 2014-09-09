package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class y
  implements az
{
  y(v paramv)
  {
  }

  public final boolean kJ()
  {
    z.d("!44@/B4Tb64lLpLcQwGQMRj/JTqm3tSvFCTzMyP/DRnOfzs=", "onTimerExpired");
    try
    {
      v.h(this.gSV);
      label14: return false;
    }
    catch (Exception localException)
    {
      break label14;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.y
 * JD-Core Version:    0.6.2
 */