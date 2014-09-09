package com.tencent.kingkong;

import android.net.Uri;

final class ContentObserver$Transport extends IContentObserver.Stub
{
  private ContentObserver mContentObserver;

  public ContentObserver$Transport(ContentObserver paramContentObserver)
  {
    this.mContentObserver = paramContentObserver;
  }

  public final void onChange(boolean paramBoolean, Uri paramUri)
  {
    ContentObserver localContentObserver = this.mContentObserver;
    if (localContentObserver != null)
      localContentObserver.dispatchChanges(paramBoolean, paramUri);
  }

  public final void releaseContentObserver()
  {
    this.mContentObserver = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.ContentObserver.Transport
 * JD-Core Version:    0.6.2
 */