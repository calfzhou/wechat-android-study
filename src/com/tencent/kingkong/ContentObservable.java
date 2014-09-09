package com.tencent.kingkong;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

public class ContentObservable extends Observable
{
  @Deprecated
  public void dispatchChange(boolean paramBoolean)
  {
    dispatchChange(paramBoolean, null);
  }

  public void dispatchChange(boolean paramBoolean, Uri paramUri)
  {
    synchronized (this.mObservers)
    {
      Iterator localIterator = this.mObservers.iterator();
      ContentObserver localContentObserver;
      do
      {
        if (!localIterator.hasNext())
          return;
        localContentObserver = (ContentObserver)localIterator.next();
      }
      while ((paramBoolean) && (!localContentObserver.deliverSelfNotifications()));
      localContentObserver.dispatchChanges(paramBoolean, paramUri);
    }
  }

  @Deprecated
  public void notifyChange(boolean paramBoolean)
  {
    synchronized (this.mObservers)
    {
      Iterator localIterator = this.mObservers.iterator();
      if (!localIterator.hasNext())
        return;
      ((ContentObserver)localIterator.next()).onChange(paramBoolean, null);
    }
  }

  public void registerObserver(ContentObserver paramContentObserver)
  {
    super.registerObserver(paramContentObserver);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.ContentObservable
 * JD-Core Version:    0.6.2
 */