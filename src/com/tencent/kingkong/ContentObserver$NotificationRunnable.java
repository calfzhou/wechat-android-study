package com.tencent.kingkong;

import android.net.Uri;

final class ContentObserver$NotificationRunnable
  implements Runnable
{
  private final boolean mSelfChange;
  private final Uri mUri;

  public ContentObserver$NotificationRunnable(ContentObserver paramContentObserver, boolean paramBoolean, Uri paramUri)
  {
    this.mSelfChange = paramBoolean;
    this.mUri = paramUri;
  }

  public final void run()
  {
    this.this$0.onChange(this.mSelfChange, this.mUri);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.ContentObserver.NotificationRunnable
 * JD-Core Version:    0.6.2
 */