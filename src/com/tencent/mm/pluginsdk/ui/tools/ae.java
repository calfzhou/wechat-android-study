package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.mm.sdk.platformtools.z;

public final class ae
  implements bj
{
  public static ae hLr = null;
  private float[] hLm = new float[3];
  int hLn = -10000;
  int hLo = -10000;
  private SensorManager hLp;
  private SensorEventListener hLq;
  public boolean hasInit = false;

  public final int aET()
  {
    z.d("!44@/B4Tb64lLpL9QWdfCuQ83fK9Jq2zEatwik+a4P9gxQo=", "getHeading() " + this.hLn);
    return this.hLn;
  }

  public final void aEU()
  {
    hLr = this;
  }

  public final void aEV()
  {
    hLr = null;
  }

  public final void aEW()
  {
    if ((this.hLp != null) && (this.hLq != null))
      this.hLp.unregisterListener(this.hLq);
    this.hasInit = false;
  }

  public final void bn(Context paramContext)
  {
    z.d("!44@/B4Tb64lLpL9QWdfCuQ83fK9Jq2zEatwik+a4P9gxQo=", "initSensor() ");
    if (paramContext == null)
    {
      z.e("!44@/B4Tb64lLpL9QWdfCuQ83fK9Jq2zEatwik+a4P9gxQo=", "initSensor() context == null");
      return;
    }
    if (this.hLp == null)
      this.hLp = ((SensorManager)paramContext.getSystemService("sensor"));
    if (this.hLq == null)
      this.hLq = new af(this);
    this.hLp.registerListener(this.hLq, this.hLp.getDefaultSensor(3), 3);
    this.hasInit = true;
    z.d("!44@/B4Tb64lLpL9QWdfCuQ83fK9Jq2zEatwik+a4P9gxQo=", "initSensor() finish");
  }

  public final void bo(Context paramContext)
  {
    bn(paramContext);
  }

  public final String getName()
  {
    return "HeadingPitchSensorMgr";
  }

  public final int getPitch()
  {
    z.d("!44@/B4Tb64lLpL9QWdfCuQ83fK9Jq2zEatwik+a4P9gxQo=", "getPitch() " + this.hLo);
    return this.hLo;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.ae
 * JD-Core Version:    0.6.2
 */