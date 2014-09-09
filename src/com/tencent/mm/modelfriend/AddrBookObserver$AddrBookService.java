package com.tencent.mm.modelfriend;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.IBinder;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public class AddrBookObserver$AddrBookService extends Service
{
  public static boolean dsC = false;
  public static boolean dsD;
  public static String dsG = "key_sync_session";
  private h dsH = new b(this);

  static
  {
    dsD = false;
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    super.onStartCommand(paramIntent, paramInt1, paramInt2);
    Object[] arrayOfObject1 = new Object[1];
    if (paramIntent == null);
    for (boolean bool = true; ; bool = false)
    {
      arrayOfObject1[0] = Boolean.valueOf(bool);
      z.i("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "service start intent:%b", arrayOfObject1);
      if (paramIntent != null)
        break;
      z.e("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "intent == null, stop service");
      stopSelf();
      return 2;
    }
    float f1 = paramIntent.getFloatExtra(dsG, -1.0F);
    if (f1 == -1.0F)
    {
      z.e("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "onStartCommand session == -1, stop service");
      stopSelf();
      return 2;
    }
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences(ak.aHi(), 0);
    float f2 = localSharedPreferences.getFloat(dsG, 0.0F);
    if (f2 == f1)
    {
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Float.valueOf(f2);
      z.d("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "onStartCommand session the same : %f", arrayOfObject4);
      stopSelf();
      return 2;
    }
    localSharedPreferences.edit().putFloat(dsG, f1).commit();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Float.valueOf(f1);
    z.d("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "onStartCommand new session:%f", arrayOfObject2);
    if (dsD)
    {
      z.i("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "service canceled");
      dsD = false;
      stopSelf();
      return 2;
    }
    if (bg.CF())
    {
      z.e("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "[onStartCommand] getCode is null, stop service");
      stopSelf();
      return 2;
    }
    bg.rb();
    try
    {
      if (!bg.oE())
      {
        z.i("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "account not ready, stop sync");
        stopSelf();
        return 2;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = localException.getMessage();
      z.e("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "AddrBookService onStart [%s]", arrayOfObject3);
      stopSelf();
      return 2;
    }
    if ((aa.we()) && (!aa.wa()))
    {
      z.i("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "start sync");
      if (!f.K(this))
      {
        dsC = true;
        c.a(this.dsH);
        return 2;
      }
      z.e("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "requestSync false, stop service");
      stopSelf();
      return 2;
    }
    z.e("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "can not sync addr book now, stop service");
    stopSelf();
    return 2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.AddrBookObserver.AddrBookService
 * JD-Core Version:    0.6.2
 */