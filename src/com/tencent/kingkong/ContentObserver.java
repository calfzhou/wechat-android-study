package com.tencent.kingkong;

import android.net.Uri;
import android.os.Handler;

public abstract class ContentObserver extends android.database.ContentObserver
{
  Handler mHandler;
  private final Object mLock = new Object();
  private ContentObserver.Transport mTransport;

  public ContentObserver(Handler paramHandler)
  {
    super(paramHandler);
    this.mHandler = paramHandler;
  }

  public boolean deliverSelfNotifications()
  {
    return false;
  }

  public final void dispatchChanges(boolean paramBoolean, Uri paramUri)
  {
    if (this.mHandler == null)
    {
      onChange(paramBoolean, paramUri);
      return;
    }
    this.mHandler.post(new ContentObserver.NotificationRunnable(this, paramBoolean, paramUri));
  }

  public IContentObserver getContentObserver()
  {
    synchronized (this.mLock)
    {
      if (this.mTransport == null)
        this.mTransport = new ContentObserver.Transport(this);
      ContentObserver.Transport localTransport = this.mTransport;
      return localTransport;
    }
  }

  public void onChange(boolean paramBoolean)
  {
  }

  public void onChange(boolean paramBoolean, Uri paramUri)
  {
    onChange(paramBoolean);
  }

  public IContentObserver releaseContentObserver()
  {
    synchronized (this.mLock)
    {
      ContentObserver.Transport localTransport = this.mTransport;
      if (localTransport != null)
      {
        localTransport.releaseContentObserver();
        this.mTransport = null;
      }
      return localTransport;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.ContentObserver
 * JD-Core Version:    0.6.2
 */