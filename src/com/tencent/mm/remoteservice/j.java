package com.tencent.mm.remoteservice;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.LinkedList;
import java.util.List;

public final class j
{
  private Context context;
  private ServiceConnection eIP = new k(this);
  private List ibC = new LinkedList();
  private f ibD;

  public j(Context paramContext)
  {
    this.context = paramContext;
  }

  final void a(c paramc, String paramString, Bundle paramBundle)
  {
    if (isConnected());
    try
    {
      this.ibD.a(paramc.getClass().getName(), paramString, paramBundle, paramc);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final boolean isConnected()
  {
    return (this.ibD != null) && (this.ibD.asBinder().isBinderAlive());
  }

  public final void m(Runnable paramRunnable)
  {
    new StringBuilder("RemoteServiceProxy construct, thread id:").append(Thread.currentThread().getId());
    if (isConnected())
    {
      paramRunnable.run();
      return;
    }
    this.ibC.add(paramRunnable);
    Intent localIntent = new Intent(this.context, RemoteService.class);
    this.context.bindService(localIntent, this.eIP, 1);
  }

  public final void release()
  {
    if ((this.ibD != null) && (this.eIP != null))
    {
      this.context.unbindService(this.eIP);
      this.ibD = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.j
 * JD-Core Version:    0.6.2
 */