package com.tencent.mm.sdk.platformtools;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class ck
{
  private Context context;

  public ck(Context paramContext)
  {
    this.context = paramContext;
  }

  public final String toString()
  {
    Context localContext = this.context;
    if (localContext == null)
      return null;
    ActivityManager localActivityManager = (ActivityManager)localContext.getSystemService("activity");
    String str = localContext.getPackageName();
    if ((localActivityManager == null) || (ch.jb(str)))
      return null;
    List localList = localActivityManager.getRunningTasks(100);
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      ActivityManager.RunningTaskInfo localRunningTaskInfo = (ActivityManager.RunningTaskInfo)localIterator.next();
      if ((localRunningTaskInfo.baseActivity.getClassName().startsWith(str)) || (localRunningTaskInfo.topActivity.getClassName().startsWith(str)))
      {
        Object[] arrayOfObject = new Object[5];
        arrayOfObject[0] = Integer.valueOf(localRunningTaskInfo.id);
        arrayOfObject[1] = Integer.valueOf(localRunningTaskInfo.numRunning);
        arrayOfObject[2] = Integer.valueOf(localRunningTaskInfo.numActivities);
        arrayOfObject[3] = localRunningTaskInfo.topActivity.getShortClassName();
        arrayOfObject[4] = localRunningTaskInfo.baseActivity.getShortClassName();
        localStringBuffer.append(String.format("{id:%d num:%d/%d top:%s base:%s}", arrayOfObject));
      }
    }
    return localStringBuffer.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ck
 * JD-Core Version:    0.6.2
 */