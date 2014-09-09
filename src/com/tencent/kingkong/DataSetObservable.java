package com.tencent.kingkong;

import java.util.ArrayList;

public class DataSetObservable extends Observable
{
  public void notifyChanged()
  {
    synchronized (this.mObservers)
    {
      int i = -1 + this.mObservers.size();
      if (i < 0)
        return;
      ((DataSetObserver)this.mObservers.get(i)).onChanged();
      i--;
    }
  }

  public void notifyInvalidated()
  {
    synchronized (this.mObservers)
    {
      int i = -1 + this.mObservers.size();
      if (i < 0)
        return;
      ((DataSetObserver)this.mObservers.get(i)).onInvalidated();
      i--;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.DataSetObservable
 * JD-Core Version:    0.6.2
 */