package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.jg.JgClassChecked;
import com.tencent.mm.network.bk;
import com.tencent.mm.network.bl;
import com.tencent.mm.sdk.platformtools.z;

@JgClassChecked(author=20, fComment="checked", lastDate="20140819", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class MMReceivers$ConnectionReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramContext == null);
    do
    {
      return;
      z.e("!44@/B4Tb64lLpLXcj0G0yuGG2G/QCZiipuK9xCOJSuDUew=", "onReceive threadID: " + Thread.currentThread().getId());
      if (!f.h(paramContext, "connection"))
      {
        MMReceivers.AlarmReceiver.t(paramContext);
        z.appenderFlush();
        return;
      }
    }
    while (bk.Dn() == null);
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    try
    {
      NetworkInfo localNetworkInfo2 = localConnectivityManager.getActiveNetworkInfo();
      localNetworkInfo1 = localNetworkInfo2;
      if ((localNetworkInfo1 == null) || (localNetworkInfo1.getState() != NetworkInfo.State.CONNECTED))
      {
        z.e("!44@/B4Tb64lLpLXcj0G0yuGG2G/QCZiipuK9xCOJSuDUew=", "NetworkAvailable: false");
        bl localbl1 = bk.Dn();
        if (localNetworkInfo1 != null)
          localNetworkInfo1.getTypeName();
        if (localNetworkInfo1 != null)
          localNetworkInfo1.getSubtypeName();
        localbl1.I(false);
        return;
      }
    }
    catch (Exception localException)
    {
      NetworkInfo localNetworkInfo1;
      while (true)
      {
        z.i("!44@/B4Tb64lLpLXcj0G0yuGG2G/QCZiipuK9xCOJSuDUew=", "getActiveNetworkInfo failed.");
        localNetworkInfo1 = null;
      }
      z.e("!44@/B4Tb64lLpLXcj0G0yuGG2G/QCZiipuK9xCOJSuDUew=", "NetworkAvailable: true");
      bl localbl2 = bk.Dn();
      localNetworkInfo1.getTypeName();
      localNetworkInfo1.getSubtypeName();
      localbl2.I(true);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MMReceivers.ConnectionReceiver
 * JD-Core Version:    0.6.2
 */