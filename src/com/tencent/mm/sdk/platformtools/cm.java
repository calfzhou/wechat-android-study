package com.tencent.mm.sdk.platformtools;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class cm
  implements av
{
  private static final String TAG = "!32@/B4Tb64lLpL3oiL6hKHAvQPHylMV7oAE";
  private static at sLogCallback;
  private au handler;
  private ConcurrentHashMap map = new ConcurrentHashMap();

  public cm()
  {
    this.handler = new au(this);
    if (getLooper().getThread().getName().equals("initThread"))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e("!32@/B4Tb64lLpL3oiL6hKHAvQPHylMV7oAE", "MMHandler can not init handler with initThread looper, stack %s", arrayOfObject);
    }
  }

  public cm(Looper paramLooper)
  {
    this.handler = new au(paramLooper, this);
    if (paramLooper.getThread().getName().equals("initThread"))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e("!32@/B4Tb64lLpL3oiL6hKHAvQPHylMV7oAE", "MMHandler can not init handler with initThread looper, stack %s", arrayOfObject);
    }
  }

  public cm(Looper paramLooper, cn paramcn)
  {
    this.handler = new au(paramLooper, paramcn, this);
    if (paramLooper.getThread().getName().equals("initThread"))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e("!32@/B4Tb64lLpL3oiL6hKHAvQPHylMV7oAE", "MMHandler can not init handler with initThread looper, stack %s", arrayOfObject);
    }
  }

  public cm(cn paramcn)
  {
    this.handler = new au(paramcn, this);
    if (getLooper().getThread().getName().equals("initThread"))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e("!32@/B4Tb64lLpL3oiL6hKHAvQPHylMV7oAE", "MMHandler can not init handler with initThread looper, stack %s", arrayOfObject);
    }
  }

  public static Handler fetchFreeHandler()
  {
    return new Handler();
  }

  public static Handler fetchFreeHandler(Looper paramLooper)
  {
    return new Handler(paramLooper);
  }

  public static Handler fetchFreeHandler(Looper paramLooper, cn paramcn)
  {
    return new Handler(paramLooper, paramcn);
  }

  public static Handler fetchFreeHandler(cn paramcn)
  {
    return new Handler(paramcn);
  }

  public static void setLogCallback(at paramat)
  {
    sLogCallback = paramat;
  }

  public final void dump(Printer paramPrinter, String paramString)
  {
    this.handler.dump(paramPrinter, paramString);
  }

  public final Looper getLooper()
  {
    return this.handler.getLooper();
  }

  @TargetApi(14)
  public String getMessageName(Message paramMessage)
  {
    if (Build.VERSION.SDK_INT < 14)
    {
      if (paramMessage.getCallback() != null)
        return paramMessage.getCallback().getClass().getName();
      return "0x" + Integer.toHexString(paramMessage.what);
    }
    return this.handler.getMessageName(paramMessage);
  }

  public void handleMessage(Message paramMessage)
  {
  }

  public final boolean hasMessages(int paramInt)
  {
    return this.handler.hasMessages(paramInt);
  }

  public final boolean hasMessages(int paramInt, Object paramObject)
  {
    return this.handler.hasMessages(paramInt, paramObject);
  }

  public final Message obtainMessage()
  {
    return this.handler.obtainMessage();
  }

  public final Message obtainMessage(int paramInt)
  {
    return this.handler.obtainMessage(paramInt);
  }

  public final Message obtainMessage(int paramInt1, int paramInt2, int paramInt3)
  {
    return this.handler.obtainMessage(paramInt1, paramInt2, paramInt3);
  }

  public final Message obtainMessage(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    return this.handler.obtainMessage(paramInt1, paramInt2, paramInt3, paramObject);
  }

  public final Message obtainMessage(int paramInt, Object paramObject)
  {
    return this.handler.obtainMessage(paramInt, paramObject);
  }

  public boolean onLog(Message paramMessage, Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2)
  {
    if (sLogCallback != null)
      return sLogCallback.onLog(paramMessage, paramRunnable, paramThread, paramLong1, paramLong2);
    return false;
  }

  public final void onTaskAdded(Runnable paramRunnable, ba paramba)
  {
    this.map.put(paramRunnable, new WeakReference(paramba));
  }

  public final void onTaskRunEnd(Runnable paramRunnable, ba paramba)
  {
    WeakReference localWeakReference = (WeakReference)this.map.get(paramRunnable);
    if ((localWeakReference != null) && (localWeakReference.get() != null) && (localWeakReference.get() == paramba))
      this.map.remove(paramRunnable);
  }

  public final boolean post(Runnable paramRunnable)
  {
    return this.handler.post(paramRunnable);
  }

  public final boolean postAtFrontOfQueue(Runnable paramRunnable)
  {
    return this.handler.postAtFrontOfQueue(paramRunnable);
  }

  public final boolean postAtFrontOfQueueV2(Runnable paramRunnable)
  {
    Message localMessage = Message.obtain(this.handler, paramRunnable);
    return this.handler.sendMessageAtTime(localMessage, 0L);
  }

  public final boolean postAtTime(Runnable paramRunnable, long paramLong)
  {
    return this.handler.postAtTime(paramRunnable, paramLong);
  }

  public final boolean postAtTime(Runnable paramRunnable, Object paramObject, long paramLong)
  {
    return this.handler.postAtTime(paramRunnable, paramObject, paramLong);
  }

  public final boolean postDelayed(Runnable paramRunnable, long paramLong)
  {
    return this.handler.postDelayed(paramRunnable, paramLong);
  }

  public final void removeCallbacks(Runnable paramRunnable)
  {
    if (paramRunnable == null)
      return;
    WeakReference localWeakReference = (WeakReference)this.map.get(paramRunnable);
    if ((localWeakReference != null) && (localWeakReference.get() != null))
      this.handler.removeCallbacks((Runnable)localWeakReference.get());
    this.map.remove(paramRunnable);
  }

  public final void removeCallbacks(Runnable paramRunnable, Object paramObject)
  {
    if (paramRunnable == null)
      return;
    WeakReference localWeakReference = (WeakReference)this.map.get(paramRunnable);
    if ((localWeakReference != null) && (localWeakReference.get() != null) && ((paramObject == null) || (((ba)localWeakReference.get()).iEH == paramObject)))
      this.handler.removeCallbacks((Runnable)localWeakReference.get(), paramObject);
    this.map.remove(paramRunnable);
  }

  public final void removeCallbacksAndMessages(Object paramObject)
  {
    this.handler.removeCallbacksAndMessages(paramObject);
    if (paramObject == null)
      this.map.clear();
    while (true)
    {
      return;
      Iterator localIterator = this.map.entrySet().iterator();
      if (localIterator != null)
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (localEntry != null)
          {
            WeakReference localWeakReference = (WeakReference)localEntry.getValue();
            if ((localWeakReference != null) && (localWeakReference.get() != null) && (((ba)localWeakReference.get()).iEH == paramObject))
              localIterator.remove();
          }
        }
    }
  }

  public final void removeMessages(int paramInt)
  {
    this.handler.removeMessages(paramInt);
  }

  public final void removeMessages(int paramInt, Object paramObject)
  {
    this.handler.removeMessages(paramInt, paramObject);
  }

  public final boolean sendEmptyMessage(int paramInt)
  {
    return this.handler.sendEmptyMessage(paramInt);
  }

  public final boolean sendEmptyMessageAtTime(int paramInt, long paramLong)
  {
    return this.handler.sendEmptyMessageAtTime(paramInt, paramLong);
  }

  public final boolean sendEmptyMessageDelayed(int paramInt, long paramLong)
  {
    return this.handler.sendEmptyMessageDelayed(paramInt, paramLong);
  }

  public final boolean sendMessage(Message paramMessage)
  {
    return this.handler.sendMessage(paramMessage);
  }

  public final boolean sendMessageAtFrontOfQueue(Message paramMessage)
  {
    return this.handler.sendMessageAtFrontOfQueue(paramMessage);
  }

  public boolean sendMessageAtTime(Message paramMessage, long paramLong)
  {
    return this.handler.sendMessageAtTime(paramMessage, paramLong);
  }

  public final boolean sendMessageDelayed(Message paramMessage, long paramLong)
  {
    return this.handler.sendMessageDelayed(paramMessage, paramLong);
  }

  public String toString()
  {
    return "MMHandler(" + getClass().getName() + ")";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.cm
 * JD-Core Version:    0.6.2
 */