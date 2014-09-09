package com.tencent.mm.pluginsdk.f;

import android.content.Context;
import android.hardware.SensorManager;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

public final class e
{
  private f hwW;
  private SensorManager manager;

  public e(Context paramContext)
  {
    this.manager = ((SensorManager)paramContext.getSystemService("sensor"));
  }

  private boolean azz()
  {
    if (this.manager == null)
      z.e("!44@/B4Tb64lLpKkRgsT9+JYRcoWQ2MuwIsRoSVLX+uQoiY=", "cannot init sensor manager");
    List localList;
    do
    {
      return false;
      localList = this.manager.getSensorList(1);
    }
    while ((localList == null) || (localList.size() <= 0));
    return true;
  }

  public final void UR()
  {
    if (this.hwW != null)
    {
      this.hwW.onRelease();
      this.manager.unregisterListener(this.hwW, this.manager.getDefaultSensor(1));
      this.hwW = null;
    }
  }

  public final void a(f paramf)
  {
    UR();
    if (azz())
    {
      this.hwW = paramf;
      this.manager.registerListener(this.hwW, this.manager.getDefaultSensor(1), 0);
      return;
    }
    z.e("!44@/B4Tb64lLpKkRgsT9+JYRcoWQ2MuwIsRoSVLX+uQoiY=", "no sensor found for shake detection");
  }

  public final boolean azw()
  {
    return this.hwW != null;
  }

  public final void azx()
  {
    if (this.hwW != null)
      f.reset();
  }

  public final boolean azy()
  {
    return azz();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.e
 * JD-Core Version:    0.6.2
 */