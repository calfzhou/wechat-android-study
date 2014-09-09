package com.tencent.mm.compatible.c;

import android.hardware.Camera;

final class h
  implements e
{
  public static f mS()
  {
    f localf = new f();
    try
    {
      localf.dMs = Camera.open();
      localf.dMp = 0;
      if (localf.dMs == null)
        return null;
      return localf;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.h
 * JD-Core Version:    0.6.2
 */