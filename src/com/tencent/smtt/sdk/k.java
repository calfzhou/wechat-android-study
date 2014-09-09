package com.tencent.smtt.sdk;

import android.database.sqlite.SQLiteException;

public final class k
  implements Thread.UncaughtExceptionHandler
{
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if ((paramThrowable instanceof SQLiteException))
      return;
    throw new RuntimeException(paramThrowable);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.k
 * JD-Core Version:    0.6.2
 */