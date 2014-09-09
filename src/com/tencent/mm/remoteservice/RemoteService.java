package com.tencent.mm.remoteservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class RemoteService extends Service
{
  private g iBa = new i(this);

  public IBinder onBind(Intent paramIntent)
  {
    new StringBuilder("onBind, threadId:").append(Thread.currentThread().getId());
    return this.iBa;
  }

  public void onDestroy()
  {
    new StringBuilder("onDestroy, threadId:").append(Thread.currentThread().getId());
    super.onDestroy();
  }

  public void onRebind(Intent paramIntent)
  {
    new StringBuilder("onRebind, threadId:").append(Thread.currentThread().getId());
    super.onRebind(paramIntent);
  }

  public boolean onUnbind(Intent paramIntent)
  {
    new StringBuilder("onUnbind, threadId:").append(Thread.currentThread().getId());
    return super.onUnbind(paramIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.RemoteService
 * JD-Core Version:    0.6.2
 */