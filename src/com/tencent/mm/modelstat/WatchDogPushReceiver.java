package com.tencent.mm.modelstat;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.model.x;
import com.tencent.mm.network.a.a;
import com.tencent.mm.network.bk;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.text.SimpleDateFormat;
import java.util.Date;
import junit.framework.Assert;

public class WatchDogPushReceiver extends BroadcastReceiver
{
  private static String className = "";

  public static void Aq()
  {
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ak.getPackageName(), getClassName()));
    localIntent.putExtra("type", 2);
    ak.getContext().sendBroadcast(localIntent);
  }

  public static void Ar()
  {
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ak.getPackageName(), getClassName()));
    localIntent.putExtra("type", 3);
    ak.getContext().sendBroadcast(localIntent);
  }

  public static void As()
  {
    if (!com.tencent.mm.sdk.b.b.aNa())
      return;
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ak.getPackageName(), getClassName()));
    localIntent.putExtra("type", 5);
    ak.getContext().sendBroadcast(localIntent);
  }

  public static void At()
  {
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ak.getPackageName(), getClassName()));
    localIntent.putExtra("type", 6);
    ak.getContext().sendBroadcast(localIntent);
  }

  public static void a(c paramc)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ak.getPackageName(), getClassName()));
    localIntent.putExtra("type", 1);
    localIntent.putExtra("rtType", paramc.rtType);
    localIntent.putExtra("beginTime", paramc.beginTime);
    localIntent.putExtra("endTime", paramc.endTime);
    localIntent.putExtra("rtType", paramc.rtType);
    localIntent.putExtra("dataLen", paramc.dDP);
    localIntent.putExtra("isSend", paramc.dsv);
    localIntent.putExtra("cost", paramc.dDR);
    localIntent.putExtra("doSceneCount", paramc.dDQ);
    ak.getContext().sendBroadcast(localIntent);
  }

  public static void eD(int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ak.getPackageName(), getClassName()));
    localIntent.putExtra("type", 4);
    localIntent.putExtra("timespan", paramInt);
    localIntent.putExtra("username", x.pG());
    ak.getContext().sendBroadcast(localIntent);
  }

  private static String getClassName()
  {
    if (ch.jb(className))
      className = ak.getPackageName() + ".modelstat.WatchDogPushReceiver";
    return className;
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
      z.e("!44@/B4Tb64lLpKEPjPLln9Idp+6rq1MKr03FVcWSWrfMmw=", "onReceive intent == null");
    int i;
    do
    {
      return;
      if (bk.Dj() == null)
      {
        z.e("!44@/B4Tb64lLpKEPjPLln9Idp+6rq1MKr03FVcWSWrfMmw=", "onReceive pushCore is not ready");
        return;
      }
      i = paramIntent.getIntExtra("type", 0);
      z.d("!44@/B4Tb64lLpKEPjPLln9Idp+6rq1MKr03FVcWSWrfMmw=", "onReceive type:" + i);
      if (i == 1)
      {
        com.tencent.mm.network.a.b localb = new com.tencent.mm.network.a.b();
        localb.rtType = paramIntent.getIntExtra("rtType", 0);
        localb.beginTime = paramIntent.getLongExtra("beginTime", 0L);
        localb.endTime = paramIntent.getLongExtra("endTime", 0L);
        boolean bool = paramIntent.getBooleanExtra("isSend", false);
        if (!bool)
          localb.dUv = paramIntent.getLongExtra("dataLen", 0L);
        while (true)
        {
          localb.dDR = paramIntent.getLongExtra("cost", 0L);
          localb.dUw = paramIntent.getLongExtra("doSceneCount", 0L);
          z.d("!44@/B4Tb64lLpKEPjPLln9Idp+6rq1MKr03FVcWSWrfMmw=", "onRecv: rtType:" + localb.rtType + " isSend:" + bool + " tx:" + localb.dUu + " rx:" + localb.dUv + " begin:" + localb.beginTime + " end:" + localb.endTime);
          if ((localb.dUw != 0L) && (localb.rtType != 0L) && (localb.beginTime != 0L) && (localb.endTime != 0L) && (localb.endTime - localb.beginTime > 0L))
            break;
          z.w("!44@/B4Tb64lLpKEPjPLln9Idp+6rq1MKr03FVcWSWrfMmw=", "onRecv: count:" + localb.dUw + " rtType:" + localb.rtType + " begin:" + localb.beginTime + " end:" + localb.endTime);
          return;
          localb.dUu = paramIntent.getLongExtra("dataLen", 0L);
        }
        bk.Dj().a(10401, null, localb);
        return;
      }
      if (i == 2)
      {
        ((l)bk.Dj()).Aj();
        return;
      }
      if (i == 3)
      {
        bk.Dj().a(99999, null, null);
        return;
      }
      if (i == 4)
      {
        bk.Dj().a(99998, paramIntent.getStringExtra("username"), Integer.valueOf(paramIntent.getIntExtra("timespan", -1)));
        return;
      }
      if ((i == 5) && (com.tencent.mm.sdk.b.b.aNa()))
      {
        Assert.assertTrue("test errlog push " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), false);
        return;
      }
    }
    while (i != 6);
    z.appenderFlush();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.WatchDogPushReceiver
 * JD-Core Version:    0.6.2
 */