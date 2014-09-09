package com.tencent.mm.pluginsdk.f;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build;
import com.tencent.mm.sdk.platformtools.z;

public abstract class f
  implements SensorEventListener
{
  private static int hwZ = 5;
  private final float[] hwX = { 2.0F, 2.5F, 0.5F };
  private float[] hwY = new float[3];

  static
  {
    if (Build.MODEL.equals("LG-E510"))
      hwZ = 4;
  }

  public static void reset()
  {
    z.d("!44@/B4Tb64lLpKkRgsT9+JYRWdon5tK2EBdKeEF7h2bY/8=", "reset threadHold");
    hwZ = 5;
    if (Build.MODEL.equals("LG-E510"))
      hwZ = 4;
  }

  public abstract void akg();

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public abstract void onRelease();

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float[] arrayOfFloat1 = new float[3];
    float[] arrayOfFloat2 = paramSensorEvent.values;
    int i = 0;
    int j = 0;
    if (i < 3)
    {
      arrayOfFloat1[i] = Math.round(0.45F * (this.hwX[i] * (arrayOfFloat2[i] - this.hwY[i])));
      float f = Math.abs(arrayOfFloat1[i]);
      if (f >= 4.0F)
        z.v("!44@/B4Tb64lLpKkRgsT9+JYRWdon5tK2EBdKeEF7h2bY/8=", "result:" + f + " THREAHOLD:" + hwZ);
      if (hwZ < 9)
      {
        if (f < 14.0F)
          break label153;
        hwZ = 9;
      }
      while (true)
      {
        if (f > hwZ)
          j = 1;
        this.hwY[i] = arrayOfFloat2[i];
        i++;
        break;
        label153: int k = (int)f;
        if (hwZ < k - 4)
          hwZ = k - 4;
      }
    }
    if (j != 0)
    {
      z.d("!44@/B4Tb64lLpKkRgsT9+JYRWdon5tK2EBdKeEF7h2bY/8=", "sensorChanged " + paramSensorEvent.sensor.getName() + " (" + arrayOfFloat2[0] + ", " + arrayOfFloat2[1] + ", " + arrayOfFloat2[2] + ") diff(" + arrayOfFloat1[0] + " " + arrayOfFloat1[1] + " " + arrayOfFloat1[2] + ")");
      akg();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.f
 * JD-Core Version:    0.6.2
 */