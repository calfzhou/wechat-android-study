package com.tencent.map.location;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;

public final class g
{
  private Context LB = null;
  private byte[] LH = new byte[0];
  private boolean Lw = false;
  private z Mg = null;
  private Handler QG = null;
  private Runnable QH = new y(this);
  private WifiManager UA = null;
  private g.a Yj = null;
  private aa Yn = null;
  private int a = 1;

  public final void a()
  {
    synchronized (this.LH)
    {
      if (!this.Lw)
        return;
      if ((this.LB == null) || (this.Yj == null))
        return;
    }
    try
    {
      this.LB.unregisterReceiver(this.Yj);
      label50: this.QG.removeCallbacks(this.QH);
      this.Lw = false;
      return;
    }
    catch (Exception localException)
    {
      break label50;
    }
  }

  public final boolean a(Context paramContext, aa paramaa)
  {
    synchronized (this.LH)
    {
      if (this.Lw)
        return true;
      if ((paramContext == null) || (paramaa == null))
        return false;
      this.QG = new Handler(Looper.getMainLooper());
      this.LB = paramContext;
      this.Yn = paramaa;
      this.a = 1;
      try
      {
        this.UA = ((WifiManager)this.LB.getSystemService("wifi"));
        IntentFilter localIntentFilter = new IntentFilter();
        this.Yj = new g.a(this);
        if (this.UA != null)
        {
          g.a locala = this.Yj;
          if (locala != null);
        }
        else
        {
          return false;
        }
        localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        localIntentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        localIntentFilter.setPriority(2147483647);
        this.LB.registerReceiver(this.Yj, localIntentFilter);
        f(0L);
        this.Lw = true;
        return this.Lw;
      }
      catch (Exception localException)
      {
        return false;
      }
    }
  }

  public final void f(long paramLong)
  {
    if ((this.QG != null) && (this.Lw))
    {
      this.QG.removeCallbacks(this.QH);
      this.QG.postDelayed(this.QH, paramLong);
    }
  }

  public final boolean gZ()
  {
    return this.Lw;
  }

  public final boolean hd()
  {
    if ((this.LB == null) || (this.UA == null))
      return false;
    return this.UA.isWifiEnabled();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.g
 * JD-Core Version:    0.6.2
 */