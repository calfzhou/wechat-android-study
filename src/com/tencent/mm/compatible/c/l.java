package com.tencent.mm.compatible.c;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import com.tencent.mm.sdk.platformtools.z;

final class l
  implements e
{
  @TargetApi(9)
  public static f cd(int paramInt)
  {
    f localf = new f();
    localf.dMs = null;
    try
    {
      localf.dMs = Camera.open(paramInt);
      if (localf.dMs == null)
        return null;
      localf.dMp = 0;
      z.d("!32@b/97oX4TlWjv/esh60/h7VhnAazUhcan", "DeviceInfo.mCameraInfo.hasVRInfo " + v.dNB.dMc);
      z.d("!32@b/97oX4TlWjv/esh60/h7VhnAazUhcan", "DeviceInfo.mCameraInfo.mVRFaceRotate " + v.dNB.dMd);
      z.d("!32@b/97oX4TlWjv/esh60/h7VhnAazUhcan", "DeviceInfo.mCameraInfo.mVRFaceDisplayOrientation " + v.dNB.dMe);
      z.d("!32@b/97oX4TlWjv/esh60/h7VhnAazUhcan", "DeviceInfo.mCameraInfo.mVRBackRotate " + v.dNB.dMf);
      z.d("!32@b/97oX4TlWjv/esh60/h7VhnAazUhcan", "DeviceInfo.mCameraInfo.mVRBackDisplayOrientation " + v.dNB.dMg);
      if (getNumberOfCameras() > 1)
      {
        try
        {
          Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
          Camera.getCameraInfo(paramInt, localCameraInfo);
          z.d("!32@b/97oX4TlWjv/esh60/h7VhnAazUhcan", "info.facing " + localCameraInfo.facing);
          if (localCameraInfo.facing == 1)
          {
            if ((v.dNB.dMc) && (v.dNB.dMd != -1))
              localf.dMp = v.dNB.dMd;
            if ((v.dNB.dMc) && (v.dNB.dMe != -1))
              localf.dMs.setDisplayOrientation(v.dNB.dMe);
          }
          else
          {
            if ((v.dNB.dMc) && (v.dNB.dMf != -1))
              localf.dMp = v.dNB.dMf;
            if ((v.dNB.dMc) && (v.dNB.dMg != -1))
              localf.dMs.setDisplayOrientation(v.dNB.dMg);
          }
        }
        catch (Exception localException2)
        {
        }
      }
      else
      {
        if ((v.dNB.dMc) && (v.dNB.dMf != -1))
          localf.dMp = v.dNB.dMf;
        if ((v.dNB.dMc) && (v.dNB.dMg != -1))
          localf.dMs.setDisplayOrientation(v.dNB.dMg);
      }
    }
    catch (Exception localException1)
    {
      return null;
    }
    return localf;
  }

  public static int getNumberOfCameras()
  {
    int i;
    if ((v.dNB.dMj) && (v.dNB.dMi != -1))
    {
      i = v.dNB.dMi;
      z.d("!32@b/97oX4TlWjv/esh60/h7VhnAazUhcan", "mVRCameraNum " + i);
    }
    do
    {
      return i;
      i = d.getNumberOfCameras();
      z.d("!32@b/97oX4TlWjv/esh60/h7VhnAazUhcan", "getNumberOfCameras " + i);
    }
    while (i > 1);
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.l
 * JD-Core Version:    0.6.2
 */