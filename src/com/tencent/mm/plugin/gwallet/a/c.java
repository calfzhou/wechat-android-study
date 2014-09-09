package com.tencent.mm.plugin.gwallet.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.a.a.a;

final class c
  implements ServiceConnection
{
  c(b paramb, h paramh)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    b.nA("Billing service connected.");
    b.a(this.fdI, com.android.a.a.b.a(paramIBinder));
    String str = b.a(this.fdI).getPackageName();
    try
    {
      b.nA("Checking for in-app billing 3 support.");
      int i = b.b(this.fdI).b(3, str, "inapp");
      if (i != 0)
      {
        if (this.fdH != null)
          this.fdH.a(new k(i, "Error checking for billing v3 support."));
        this.fdI.fdD = false;
        return;
      }
      b.nA("In-app billing version 3 supported for " + str);
      int j = b.b(this.fdI).b(3, str, "subs");
      if (j == 0)
      {
        b.nA("Subscriptions AVAILABLE.");
        this.fdI.fdD = true;
      }
      while (true)
      {
        b.c(this.fdI);
        if (this.fdH == null)
          break;
        this.fdH.a(new k(0, "Setup successful."));
        return;
        b.nA("Subscriptions NOT AVAILABLE. Response: " + j);
      }
    }
    catch (RemoteException localRemoteException)
    {
      if (this.fdH != null)
        this.fdH.a(new k(-1001, "RemoteException while setting up in-app billing."));
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    b.nA("Billing service disconnected.");
    b.a(this.fdI, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.a.c
 * JD-Core Version:    0.6.2
 */