package com.tencent.mm.compatible.c;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.os.Build;

final class m
  implements e
{
  @TargetApi(8)
  public static f mS()
  {
    f localf = new f();
    try
    {
      localf.dMs = Camera.open();
      localf.dMp = 0;
      if (localf.dMs == null)
        return null;
      if (Build.DISPLAY.startsWith("Flyme"))
      {
        localf.dMp = 90;
        localf.dMs.setDisplayOrientation(90);
      }
      label154: 
      while (true)
      {
        return localf;
        int i;
        if (!Build.MODEL.equals("M9"))
          i = -1;
        while (true)
        {
          if (i < 7093)
            break label154;
          localf.dMp = 90;
          localf.dMs.setDisplayOrientation(180);
          break;
          String str = Build.DISPLAY;
          if (str.substring(0, 0).equals("1"))
          {
            i = -1;
          }
          else
          {
            String[] arrayOfString = str.split("-");
            if ((arrayOfString == null) || (arrayOfString.length < 2))
              i = -1;
            else
              i = Integer.parseInt(arrayOfString[1]);
          }
        }
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.m
 * JD-Core Version:    0.6.2
 */