package com.tencent.kingkong;

import java.lang.ref.WeakReference;

public class AbstractCursor$SelfContentObserver extends ContentObserver
{
  WeakReference mCursor;

  public AbstractCursor$SelfContentObserver(AbstractCursor paramAbstractCursor)
  {
    super(null);
    this.mCursor = new WeakReference(paramAbstractCursor);
  }

  public boolean deliverSelfNotifications()
  {
    return false;
  }

  public void onChange(boolean paramBoolean)
  {
    AbstractCursor localAbstractCursor = (AbstractCursor)this.mCursor.get();
    if (localAbstractCursor != null)
      localAbstractCursor.onChange(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.AbstractCursor.SelfContentObserver
 * JD-Core Version:    0.6.2
 */