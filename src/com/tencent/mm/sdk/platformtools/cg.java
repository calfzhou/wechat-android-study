package com.tencent.mm.sdk.platformtools;

import android.hardware.SensorListener;

final class cg
  implements SensorListener
{
  private float[] hwY = { 0.0F, 0.0F, 0.0F };
  private Runnable idI;

  public cg(Runnable paramRunnable)
  {
    this.idI = paramRunnable;
  }

  public final void onAccuracyChanged(int paramInt1, int paramInt2)
  {
  }

  public final void onSensorChanged(int paramInt, float[] paramArrayOfFloat)
  {
    int i = 0;
    float[] arrayOfFloat = new float[3];
    for (int j = 0; j < 3; j++)
    {
      arrayOfFloat[j] = Math.abs(paramArrayOfFloat[j] - this.hwY[j]);
      if ((this.hwY[j] != 0.0F) && (arrayOfFloat[j] > 1.0F))
      {
        i = 1;
        z.d("!32@/B4Tb64lLpKvYOkSzPmwxJaUdxCq9g2m", "isONShake:" + arrayOfFloat[j]);
      }
      this.hwY[j] = paramArrayOfFloat[j];
    }
    if (i != 0)
      this.idI.run();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.cg
 * JD-Core Version:    0.6.2
 */