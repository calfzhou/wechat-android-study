package com.tencent.map.location;

import android.content.Context;
import android.location.LocationManager;

public final class o
{
  private static LocationManager LT = null;
  private static float vL = 0.0F;
  private int KZ = 0;
  private Context LB = null;
  private byte[] LH = new byte[0];
  private boolean LJ = false;
  private p LU = null;
  private r LV = null;
  private q LW = null;
  private boolean Lw = false;
  private long Lz = 0L;
  private int a = 1024;
  private int b = 0;

  public final void a()
  {
    synchronized (this.LH)
    {
      if (!this.Lw)
        return;
      if ((LT != null) && (this.LU != null))
      {
        LT.removeGpsStatusListener(this.LU);
        LT.removeUpdates(this.LU);
      }
      this.Lw = false;
      return;
    }
  }

  public final boolean a(r paramr, Context paramContext)
  {
    synchronized (this.LH)
    {
      if (this.Lw)
        return true;
      if ((paramContext == null) || (paramr == null))
        return false;
      this.LB = paramContext;
      this.LV = paramr;
      try
      {
        LT = (LocationManager)this.LB.getSystemService("location");
        this.LU = new p(this, (byte)0);
        if (LT != null)
        {
          p localp = this.LU;
          if (localp != null);
        }
        else
        {
          return false;
        }
      }
      catch (Exception localException1)
      {
        return false;
      }
      try
      {
        LT.requestLocationUpdates("gps", 1000L, 0.0F, this.LU);
        LT.addGpsStatusListener(this.LU);
        if (LT.isProviderEnabled("gps"));
        for (this.a = 4; ; this.a = 0)
        {
          this.Lw = true;
          return this.Lw;
        }
      }
      catch (Exception localException2)
      {
        return false;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.o
 * JD-Core Version:    0.6.2
 */