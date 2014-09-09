package com.tencent.mm.sdk.platformtools;

import android.os.Message;

public abstract interface av
{
  public abstract void handleMessage(Message paramMessage);

  public abstract boolean onLog(Message paramMessage, Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2);

  public abstract void onTaskAdded(Runnable paramRunnable, ba paramba);

  public abstract void onTaskRunEnd(Runnable paramRunnable, ba paramba);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.av
 * JD-Core Version:    0.6.2
 */