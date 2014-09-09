package com.tencent.mm.compatible.loader;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.tencent.mm.sdk.platformtools.ak;

public class LoaderApplication extends Application
{
  private l cGb = null;

  public Resources getResources()
  {
    return g.dOg;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (this.cGb == null)
      return;
    this.cGb.aQ();
  }

  public void onCreate()
  {
    ak.setContext(this);
    g.a(this);
    try
    {
      this.cGb = ((m)g.dOf.loadClass(ak.aHh() + ".compatible.loader.ProfileFactoryImpl").newInstance()).a(this, null);
      label52: if (this.cGb == null)
        return;
      this.cGb.onCreate();
      return;
    }
    catch (Exception localException)
    {
      break label52;
    }
  }

  public void onTerminate()
  {
    if (this.cGb == null)
      return;
    this.cGb.onTerminate();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.LoaderApplication
 * JD-Core Version:    0.6.2
 */