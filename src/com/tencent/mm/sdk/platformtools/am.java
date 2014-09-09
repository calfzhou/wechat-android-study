package com.tencent.mm.sdk.platformtools;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;

public final class am
{
  private static cm jSS = null;
  private HandlerThread ifi = null;
  private cm jNE = null;

  public am()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ch.aHN();
    z.i("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "init stack:%s", arrayOfObject);
    xi(null);
  }

  public am(String paramString)
  {
    xi(paramString);
  }

  public static void b(Runnable paramRunnable, long paramLong)
  {
    if (paramRunnable == null)
      return;
    bcz().postDelayed(paramRunnable, paramLong);
  }

  private static cm bcz()
  {
    if (jSS == null)
      jSS = new cm(Looper.getMainLooper());
    return jSS;
  }

  public static void h(Runnable paramRunnable)
  {
    if (paramRunnable == null)
      return;
    bcz().post(paramRunnable);
  }

  public static boolean isMainThread()
  {
    return Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
  }

  public static void o(Runnable paramRunnable)
  {
    if (paramRunnable == null)
      return;
    bcz().removeCallbacks(paramRunnable);
  }

  private void xi(String paramString)
  {
    this.jNE = null;
    if (ch.jb(paramString))
      paramString = "MMHandlerThread";
    this.ifi = new HandlerThread(paramString, 0);
    this.ifi.start();
  }

  public final int a(aq paramaq)
  {
    if (new cm(this.ifi.getLooper()).postAtFrontOfQueueV2(new ao(this, paramaq)))
      return 0;
    return -2;
  }

  // ERROR //
  public final int a(ar paramar)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 4	java/lang/Object
    //   4: astore_2
    //   5: aload_2
    //   6: iconst_0
    //   7: invokestatic 26	com/tencent/mm/sdk/platformtools/ch:aHN	()Lcom/tencent/mm/sdk/platformtools/cl;
    //   10: aastore
    //   11: ldc 28
    //   13: ldc 122
    //   15: aload_2
    //   16: invokestatic 36	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   19: ldc 124
    //   21: invokestatic 126	com/tencent/mm/sdk/platformtools/am:isMainThread	()Z
    //   24: invokestatic 132	junit/framework/Assert:assertTrue	(Ljava/lang/String;Z)V
    //   27: iconst_0
    //   28: newarray byte
    //   30: astore_3
    //   31: new 134	com/tencent/mm/sdk/platformtools/an
    //   34: dup
    //   35: aload_0
    //   36: aload_1
    //   37: aload_3
    //   38: invokespecial 137	com/tencent/mm/sdk/platformtools/an:<init>	(Lcom/tencent/mm/sdk/platformtools/am;Lcom/tencent/mm/sdk/platformtools/ar;Ljava/lang/Object;)V
    //   41: astore 4
    //   43: aload_3
    //   44: monitorenter
    //   45: aload_0
    //   46: aload 4
    //   48: invokevirtual 139	com/tencent/mm/sdk/platformtools/am:a	(Lcom/tencent/mm/sdk/platformtools/aq;)I
    //   51: istore 6
    //   53: iload 6
    //   55: ifne +7 -> 62
    //   58: aload_3
    //   59: invokevirtual 142	java/lang/Object:wait	()V
    //   62: aload_3
    //   63: monitorexit
    //   64: iload 6
    //   66: ireturn
    //   67: astore 5
    //   69: aload_3
    //   70: monitorexit
    //   71: aload 5
    //   73: athrow
    //   74: astore 7
    //   76: goto -14 -> 62
    //
    // Exception table:
    //   from	to	target	type
    //   45	53	67	finally
    //   58	62	67	finally
    //   62	64	67	finally
    //   58	62	74	java/lang/Exception
  }

  public final int a(Runnable paramRunnable, long paramLong)
  {
    bcy().postDelayed(paramRunnable, paramLong);
    return 0;
  }

  public final void aHn()
  {
    if ((this.ifi == null) || (!this.ifi.isAlive()))
    {
      z.e("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "setLowestPriority failed thread is dead");
      return;
    }
    int i = this.ifi.getThreadId();
    try
    {
      if (19 == Process.getThreadPriority(i))
      {
        z.w("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "setLowestPriority No Need.");
        return;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      z.w("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "thread:%d setLowestPriority failed", arrayOfObject1);
      return;
    }
    Process.setThreadPriority(i, 19);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(i);
    arrayOfObject2[1] = Integer.valueOf(Process.getThreadPriority(i));
    z.i("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "thread:%d setLowestPriority to %d", arrayOfObject2);
  }

  public final void aHo()
  {
    if ((this.ifi == null) || (!this.ifi.isAlive()))
    {
      z.e("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "setHighPriority failed thread is dead");
      return;
    }
    int i = this.ifi.getThreadId();
    try
    {
      if (-8 == Process.getThreadPriority(i))
      {
        z.w("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "setHighPriority No Need.");
        return;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      z.w("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "thread:%d setHighPriority failed", arrayOfObject1);
      return;
    }
    Process.setThreadPriority(i, -8);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(i);
    arrayOfObject2[1] = Integer.valueOf(Process.getThreadPriority(i));
    z.i("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "thread:%d setHighPriority to %d", arrayOfObject2);
  }

  public final boolean aHp()
  {
    boolean bool = true;
    if ((this.ifi == null) || (!this.ifi.isAlive()))
    {
      z.e("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "check inHighPriority failed thread is dead");
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = this.ifi.getThreadId();
      try
      {
        int j = Process.getThreadPriority(i);
        if (-8 == j)
          continue;
        return false;
      }
      catch (Exception localException)
      {
        while (true)
        {
          Object[] arrayOfObject = new Object[bool];
          arrayOfObject[0] = Integer.valueOf(i);
          z.w("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "thread:%d  check inHighPriority failed", arrayOfObject);
        }
      }
    }
  }

  public final void aHq()
  {
    if ((this.ifi == null) || (!this.ifi.isAlive()))
    {
      z.e("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "setLowPriority failed thread is dead");
      return;
    }
    int i = this.ifi.getThreadId();
    try
    {
      if (Process.getThreadPriority(i) == 0)
      {
        z.w("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "setLowPriority No Need.");
        return;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      z.w("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "thread:%d setLowPriority failed", arrayOfObject1);
      return;
    }
    Process.setThreadPriority(i, 0);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(i);
    arrayOfObject2[1] = Integer.valueOf(Process.getThreadPriority(i));
    z.i("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "thread:%d setLowPriority to %d", arrayOfObject2);
  }

  public final boolean aHs()
  {
    return Thread.currentThread().getId() == this.ifi.getId();
  }

  public final cm bcy()
  {
    if (this.jNE == null)
      this.jNE = new cm(this.ifi.getLooper());
    return this.jNE;
  }

  public final Looper getLooper()
  {
    return this.ifi.getLooper();
  }

  public final int n(Runnable paramRunnable)
  {
    bcy().post(paramRunnable);
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.am
 * JD-Core Version:    0.6.2
 */