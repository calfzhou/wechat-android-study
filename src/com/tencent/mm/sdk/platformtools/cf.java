package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.hardware.SensorManager;
import java.util.List;

public final class cf
{
  private cg iFW;
  private SensorManager manager;

  public cf(Context paramContext)
  {
    this.manager = ((SensorManager)paramContext.getSystemService("sensor"));
  }

  public final void aNE()
  {
    if ((this.manager != null) && (this.iFW != null))
      this.manager.unregisterListener(this.iFW, 2);
  }

  public final boolean r(Runnable paramRunnable)
  {
    if (this.manager == null);
    List localList;
    do
    {
      return false;
      localList = this.manager.getSensorList(1);
    }
    while ((localList == null) || (localList.size() <= 0));
    this.iFW = new cg(paramRunnable);
    this.manager.registerListener(this.iFW, 2, 3);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.cf
 * JD-Core Version:    0.6.2
 */