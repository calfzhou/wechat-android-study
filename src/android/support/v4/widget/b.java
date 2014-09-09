package android.support.v4.widget;

import android.database.ContentObserver;

final class b extends ContentObserver
{
  public final boolean deliverSelfNotifications()
  {
    return true;
  }

  public final void onChange(boolean paramBoolean)
  {
    this.gc.onContentChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.b
 * JD-Core Version:    0.6.2
 */