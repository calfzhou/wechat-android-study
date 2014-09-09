package com.tencent.mm.jni.platformcomm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.TreeSet;

public class Alarm extends BroadcastReceiver
{
  private static WakerLock dQK = null;
  private static Alarm dQL = null;
  private static TreeSet dQM = new TreeSet(new a((byte)0));

  public static void Z(Context paramContext)
  {
    synchronized (dQM)
    {
      Iterator localIterator = dQM.iterator();
      if (localIterator.hasNext())
        a(paramContext, (PendingIntent)((Object[])localIterator.next())[(-1 + b.dQP)]);
    }
    dQM.clear();
    if (dQL != null)
    {
      paramContext.unregisterReceiver(dQL);
      dQL = null;
    }
  }

  public static boolean a(long paramLong, int paramInt, Context paramContext)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    arrayOfObject1[1] = Integer.valueOf(paramInt);
    z.i("!24@/B4Tb64lLpJgcLwqaN0ERg==", "start id=%d, after=%d", arrayOfObject1);
    if (paramInt < 0)
    {
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(paramInt);
      z.e("!24@/B4Tb64lLpJgcLwqaN0ERg==", "after=%d", arrayOfObject4);
      return false;
    }
    if (paramContext == null)
    {
      z.e("!24@/B4Tb64lLpJgcLwqaN0ERg==", "context==null");
      return false;
    }
    synchronized (dQM)
    {
      if (dQK == null)
      {
        dQK = new WakerLock(paramContext);
        z.i("!24@/B4Tb64lLpJgcLwqaN0ERg==", "start new wakerlock");
      }
      if (dQL == null)
      {
        dQL = new Alarm();
        paramContext.registerReceiver(dQL, new IntentFilter("ALARM_ACTION(" + String.valueOf(Process.myPid()) + ")"));
      }
      Iterator localIterator = dQM.iterator();
      while (localIterator.hasNext())
        if (((Long)((Object[])localIterator.next())[(-1 + b.dQN)]).longValue() == paramLong)
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Long.valueOf(paramLong);
          z.e("!24@/B4Tb64lLpJgcLwqaN0ERg==", "id exist=%d", arrayOfObject3);
          return false;
        }
      long l1 = SystemClock.elapsedRealtime() + paramInt;
      AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
      Object localObject2;
      if (localAlarmManager == null)
      {
        z.e("!24@/B4Tb64lLpJgcLwqaN0ERg==", "am == null");
        localObject2 = null;
        if (localObject2 == null)
          return false;
      }
      else
      {
        if (l1 >= SystemClock.elapsedRealtime());
        for (long l2 = l1; ; l2 = SystemClock.elapsedRealtime())
        {
          Intent localIntent = new Intent();
          localIntent.setAction("ALARM_ACTION(" + String.valueOf(Process.myPid()) + ")");
          localIntent.putExtra("ID", paramLong);
          localIntent.putExtra("PID", Process.myPid());
          PendingIntent localPendingIntent = PendingIntent.getBroadcast(paramContext, (int)paramLong, localIntent, 268435456);
          localAlarmManager.set(2, l2, localPendingIntent);
          localObject2 = localPendingIntent;
          break;
        }
      }
      TreeSet localTreeSet2 = dQM;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Long.valueOf(paramLong);
      arrayOfObject2[1] = Long.valueOf(l1);
      arrayOfObject2[2] = localObject2;
      localTreeSet2.add(arrayOfObject2);
      return true;
    }
  }

  public static boolean a(long paramLong, Context paramContext)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    z.i("!24@/B4Tb64lLpJgcLwqaN0ERg==", "stop id=%d", arrayOfObject1);
    if (paramContext == null)
    {
      z.e("!24@/B4Tb64lLpJgcLwqaN0ERg==", "context==null");
      return false;
    }
    synchronized (dQM)
    {
      if (dQK == null)
      {
        dQK = new WakerLock(paramContext);
        z.i("!24@/B4Tb64lLpJgcLwqaN0ERg==", "stop new wakerlock");
      }
      if (dQL == null)
      {
        dQL = new Alarm();
        IntentFilter localIntentFilter = new IntentFilter();
        paramContext.registerReceiver(dQL, localIntentFilter);
        z.i("!24@/B4Tb64lLpJgcLwqaN0ERg==", "stop new Alarm");
      }
      Iterator localIterator = dQM.iterator();
      while (localIterator.hasNext())
      {
        Object[] arrayOfObject2 = (Object[])localIterator.next();
        if (((Long)arrayOfObject2[(-1 + b.dQN)]).longValue() == paramLong)
        {
          a(paramContext, (PendingIntent)arrayOfObject2[(-1 + b.dQP)]);
          localIterator.remove();
          return true;
        }
      }
      return false;
    }
  }

  private static boolean a(Context paramContext, PendingIntent paramPendingIntent)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (localAlarmManager == null)
    {
      z.e("!24@/B4Tb64lLpJgcLwqaN0ERg==", "am == null");
      return false;
    }
    if (paramPendingIntent == null)
    {
      z.e("!24@/B4Tb64lLpJgcLwqaN0ERg==", "pendingIntent == null");
      return false;
    }
    localAlarmManager.cancel(paramPendingIntent);
    paramPendingIntent.cancel();
    return true;
  }

  private native void onAlarm(long paramLong);

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null));
    Long localLong1;
    Integer localInteger;
    do
    {
      return;
      localLong1 = Long.valueOf(paramIntent.getLongExtra("ID", 0L));
      localInteger = Integer.valueOf(paramIntent.getIntExtra("PID", 0));
    }
    while ((0L == localLong1.longValue()) || (localInteger.intValue() == 0));
    if (localInteger.intValue() != Process.myPid())
    {
      Object[] arrayOfObject4 = new Object[3];
      arrayOfObject4[0] = localLong1;
      arrayOfObject4[1] = localInteger;
      arrayOfObject4[2] = Integer.valueOf(Process.myPid());
      z.w("!24@/B4Tb64lLpJgcLwqaN0ERg==", "onReceive id=%d, pid=%d, mypid=%d", arrayOfObject4);
      return;
    }
    z.i("!24@/B4Tb64lLpJgcLwqaN0ERg==", "onReceive id=%d, pid=%d", new Object[] { localLong1, localInteger });
    synchronized (dQM)
    {
      Iterator localIterator = dQM.iterator();
      while (localIterator.hasNext())
      {
        Object[] arrayOfObject2 = (Object[])localIterator.next();
        Long localLong2 = (Long)arrayOfObject2[(-1 + b.dQN)];
        z.i("!24@/B4Tb64lLpJgcLwqaN0ERg==", "onReceive id=%d, curId=%d", new Object[] { localLong1, localLong2 });
        if (localLong2.equals(localLong1))
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = ((Long)arrayOfObject2[(-1 + b.dQO)]);
          z.i("!24@/B4Tb64lLpJgcLwqaN0ERg==", "find alarm, waittime=%d", arrayOfObject3);
          localIterator.remove();
          if (dQK != null)
            dQK.lock(200L);
          onAlarm(localLong1.longValue());
          return;
        }
      }
    }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = localLong1;
    arrayOfObject1[1] = Integer.valueOf(dQM.size());
    z.e("!24@/B4Tb64lLpJgcLwqaN0ERg==", "onReceive not found id=%d, alarm_waiting_set.size=%d", arrayOfObject1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jni.platformcomm.Alarm
 * JD-Core Version:    0.6.2
 */