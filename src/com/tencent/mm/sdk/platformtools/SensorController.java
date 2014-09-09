package com.tencent.mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.jg.JgMethodChecked;

public class SensorController extends BroadcastReceiver
  implements SensorEventListener
{
  private static float iFM = 4.294967E+09F;
  private static float iFP = 0.5F;
  public static boolean iFV = false;
  private Context context;
  private SensorManager iFN;
  private float iFO;
  private ce iFQ;
  private Sensor iFR;
  private final boolean iFS;
  private boolean iFT = false;
  private boolean iFU = false;

  public SensorController(Context paramContext)
  {
    if (paramContext == null)
    {
      this.iFS = false;
      return;
    }
    this.context = paramContext;
    this.iFN = ((SensorManager)paramContext.getSystemService("sensor"));
    this.iFR = this.iFN.getDefaultSensor(8);
    if (this.iFR != null);
    for (boolean bool = true; ; bool = false)
    {
      this.iFS = bool;
      this.iFO = (1.0F + iFP);
      return;
    }
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public final void a(ce paramce)
  {
    z.v("!44@/B4Tb64lLpJt+7NPNZSjCaiqJqRs6K9tpKWl3ANG8UI=", "sensor callback set, isRegistered:" + this.iFU);
    if (!this.iFU)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.HEADSET_PLUG");
      this.context.registerReceiver(this, localIntentFilter);
      this.iFN.registerListener(this, this.iFR, 2);
      this.iFU = true;
    }
    this.iFQ = paramce;
  }

  public final void aNC()
  {
    z.v("!44@/B4Tb64lLpJt+7NPNZSjCaiqJqRs6K9tpKWl3ANG8UI=", "sensor callback removed");
    try
    {
      this.context.unregisterReceiver(this);
      this.iFN.unregisterListener(this, this.iFR);
      this.iFN.unregisterListener(this);
      this.iFU = false;
      this.iFQ = null;
      return;
    }
    catch (Exception localException)
    {
      while (true)
        z.v("!44@/B4Tb64lLpJt+7NPNZSjCaiqJqRs6K9tpKWl3ANG8UI=", "sensor receiver has already unregistered");
    }
  }

  public final boolean aND()
  {
    return this.iFU;
  }

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    int i;
    do
    {
      String str;
      do
      {
        return;
        str = paramIntent.getAction();
      }
      while ((str == null) || (!str.equals("android.intent.action.HEADSET_PLUG")));
      i = paramIntent.getIntExtra("state", 0);
      if (i == 1)
        this.iFT = true;
    }
    while (i != 0);
    this.iFT = false;
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if ((paramSensorEvent == null) || (paramSensorEvent.sensor == null));
    float f;
    do
    {
      do
      {
        do
          return;
        while (this.iFT);
        f = paramSensorEvent.values[0];
        switch (paramSensorEvent.sensor.getType())
        {
        default:
          return;
        case 8:
        }
        if (!iFV)
          break label136;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Float.valueOf(f);
        z.d("!44@/B4Tb64lLpJt+7NPNZSjCaiqJqRs6K9tpKWl3ANG8UI=", "isON: newValue:%f", arrayOfObject);
        if (0.0D != f)
          break;
      }
      while (this.iFQ == null);
      z.v("!44@/B4Tb64lLpJt+7NPNZSjCaiqJqRs6K9tpKWl3ANG8UI=", "sensor near-far event false");
      this.iFQ.au(false);
      return;
    }
    while (this.iFQ == null);
    z.v("!44@/B4Tb64lLpJt+7NPNZSjCaiqJqRs6K9tpKWl3ANG8UI=", "sensor near-far event true");
    this.iFQ.au(true);
    return;
    label136: if (f < iFM)
    {
      iFM = f;
      iFP = 0.5F + f;
    }
    z.d("!44@/B4Tb64lLpJt+7NPNZSjCaiqJqRs6K9tpKWl3ANG8UI=", "isON: minValue:" + iFM + " newValue: " + f);
    if ((this.iFO >= iFP) && (f < iFP))
      if (this.iFQ != null)
      {
        z.v("!44@/B4Tb64lLpJt+7NPNZSjCaiqJqRs6K9tpKWl3ANG8UI=", "sensor event false");
        this.iFQ.au(false);
      }
    while (true)
    {
      this.iFO = f;
      return;
      if ((this.iFO <= iFP) && (f > iFP) && (this.iFQ != null))
      {
        z.v("!44@/B4Tb64lLpJt+7NPNZSjCaiqJqRs6K9tpKWl3ANG8UI=", "sensor event true");
        this.iFQ.au(true);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.SensorController
 * JD-Core Version:    0.6.2
 */