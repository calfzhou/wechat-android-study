package com.tencent.mm.compatible.c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

public final class d
{
  public static f a(Activity paramActivity, int paramInt)
  {
    if (v.dNB.dMk == 1)
    {
      z.d("!32@/B4Tb64lLpIbGsIG/EE4YUq4NCnwmUc1", "openCamera(), CameraUtilImpl20, cameraId = " + paramInt);
      new h();
      return h.mS();
    }
    if (v.dNB.dMc)
    {
      z.d("!32@/B4Tb64lLpIbGsIG/EE4YUq4NCnwmUc1", "openCamera(), CameraUtilImplConfig, cameraId = " + paramInt);
      new l();
      return l.cd(paramInt);
    }
    if (Build.MODEL.equals("M9"))
    {
      new m();
      return m.mS();
    }
    if ((Build.VERSION.SDK_INT >= 9) && (getNumberOfCameras() > 1))
    {
      z.d("!32@/B4Tb64lLpIbGsIG/EE4YUq4NCnwmUc1", "openCamera(), CameraUtilImpl23, cameraId = " + paramInt);
      new j();
      return j.a(paramActivity, paramInt);
    }
    if (Build.VERSION.SDK_INT >= 8)
    {
      new i();
      return i.mS();
    }
    if (Build.VERSION.SDK_INT >= 5)
    {
      new h();
      return h.mS();
    }
    new g();
    return g.mS();
  }

  public static List a(Camera.Parameters paramParameters)
  {
    if (Build.VERSION.SDK_INT >= 5)
    {
      new j();
      return paramParameters.getSupportedPreviewSizes();
    }
    return null;
  }

  public static List b(Camera.Parameters paramParameters)
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      new k();
      return paramParameters.getSupportedVideoSizes();
    }
    return null;
  }

  @TargetApi(9)
  public static int getNumberOfCameras()
  {
    if ((v.dNB.dMc) && (v.dNB.dMj))
    {
      new l();
      return l.getNumberOfCameras();
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      new j();
      return Camera.getNumberOfCameras();
    }
    return -1;
  }

  public static boolean mR()
  {
    if (v.dNB.dMk == 1);
    while (((Build.VERSION.SDK_INT == 9) && (Build.MODEL.equals("M9"))) || ((Build.VERSION.SDK_INT == 10) && (Build.MODEL.equals("GT-S5360"))) || (Build.VERSION.SDK_INT < 8))
      return true;
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.d
 * JD-Core Version:    0.6.2
 */