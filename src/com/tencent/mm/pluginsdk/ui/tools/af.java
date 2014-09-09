package com.tencent.mm.pluginsdk.ui.tools;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.mm.sdk.platformtools.z;

final class af
  implements SensorEventListener
{
  af(ae paramae)
  {
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    z.i("!44@/B4Tb64lLpL9QWdfCuQ83fK9Jq2zEatwik+a4P9gxQo=", "onAccuracyChanged");
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (paramSensorEvent.sensor.getType() == 3)
    {
      ae.a(this.hLs)[0] = paramSensorEvent.values[0];
      ae.a(this.hLs)[1] = paramSensorEvent.values[1];
      ae.a(this.hLs)[2] = paramSensorEvent.values[2];
      if (this.hLs.hLn != -10000)
        break label158;
      this.hLs.hLn = ((int)ae.a(this.hLs)[0]);
    }
    while (true)
    {
      if (this.hLs.hLn == 0)
        this.hLs.hLn = 1;
      if (this.hLs.hLn == 365)
        this.hLs.hLn = 364;
      if (this.hLs.hLo != -10000)
        break;
      this.hLs.hLo = ((int)ae.a(this.hLs)[1]);
      return;
      label158: if ((ae.a(this.hLs)[0] - this.hLs.hLn > 300.0F) || (ae.a(this.hLs)[0] - this.hLs.hLn < -300.0F))
        this.hLs.hLn = ((int)ae.a(this.hLs)[0]);
      else
        this.hLs.hLn = ((int)(0.6D * this.hLs.hLn + 0.4D * ae.a(this.hLs)[0]));
    }
    if (ae.a(this.hLs)[1] < -68.0F)
    {
      int i = (int)(-68.0D + (68.0F + ae.a(this.hLs)[1]) / 1.5D);
      if (i < -89)
        i = -89;
      this.hLs.hLo = i;
      return;
    }
    if (ae.a(this.hLs)[1] > 89.0F)
    {
      this.hLs.hLo = 89;
      return;
    }
    this.hLs.hLo = ((int)(0.6D * this.hLs.hLo + 0.4D * ae.a(this.hLs)[1]));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.af
 * JD-Core Version:    0.6.2
 */