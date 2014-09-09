package com.tencent.mm.booter.cache;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class CacheService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return a.diW;
  }

  public void onCreate()
  {
    super.onCreate();
    a.prepare();
  }

  public void onDestroy()
  {
    super.onDestroy();
    a.destroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.cache.CacheService
 * JD-Core Version:    0.6.2
 */