package com.tencent.mm.compatible.c;

import android.annotation.TargetApi;
import android.hardware.Camera;

final class i
  implements e
{
  @TargetApi(8)
  public static f mS()
  {
    f localf = new f();
    try
    {
      localf.dMs = Camera.open();
      localf.dMp = 90;
      if (localf.dMs == null)
        return null;
      localf.dMs.setDisplayOrientation(localf.dMp);
      return localf;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.i
 * JD-Core Version:    0.6.2
 */