package com.tencent.map.location;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class af
{
  private static af adF;
  private Context LB;

  public static boolean gZ()
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)hh().LB.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        int i = localNetworkInfo.getType();
        if (i == 1)
          return true;
      }
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean hd()
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)hh().LB.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        boolean bool = localNetworkInfo.isAvailable();
        return bool;
      }
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static af hh()
  {
    if (adF == null)
      adF = new af();
    return adF;
  }

  public static Context hi()
  {
    return hh().LB;
  }

  public final void a(Context paramContext)
  {
    if (this.LB == null)
      this.LB = paramContext.getApplicationContext();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.af
 * JD-Core Version:    0.6.2
 */