package android.support.v4.app;

import android.app.Notification;

final class am
  implements al
{
  public final Notification a(aj paramaj)
  {
    Notification localNotification = paramaj.cO;
    localNotification.setLatestEventInfo(paramaj.mContext, paramaj.cy, paramaj.cz, paramaj.cA);
    if (paramaj.mPriority > 0)
      localNotification.flags = (0x80 | localNotification.flags);
    return localNotification;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.am
 * JD-Core Version:    0.6.2
 */