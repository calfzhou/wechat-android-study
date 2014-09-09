package com.tencent.mm.compatible.c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.view.Display;
import android.view.WindowManager;

final class j
  implements e
{
  @TargetApi(9)
  public static f a(Activity paramActivity, int paramInt)
  {
    f localf = new f();
    localf.dMs = null;
    try
    {
      localf.dMs = Camera.open(paramInt);
      if (localf.dMs == null)
        return null;
    }
    catch (Exception localException)
    {
      return null;
    }
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    Camera.getCameraInfo(paramInt, localCameraInfo);
    int i = paramActivity.getWindowManager().getDefaultDisplay().getRotation();
    int j = 0;
    switch (i)
    {
    case 0:
    default:
      if (localCameraInfo.facing != 1)
        break;
    case 1:
    case 2:
    case 3:
    }
    for (int k = (360 - localCameraInfo.orientation % 360) % 360; ; k = (360 + (localCameraInfo.orientation - j)) % 360)
    {
      localf.dMs.setDisplayOrientation(k);
      localf.dMp = localCameraInfo.orientation;
      return localf;
      j = 90;
      break;
      j = 180;
      break;
      j = 270;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.j
 * JD-Core Version:    0.6.2
 */