package com.tencent.kingkong.database;

import java.io.Closeable;

public abstract class SQLiteClosable
  implements Closeable
{
  private int mReferenceCount = 1;

  public void acquireReference()
  {
    try
    {
      if (this.mReferenceCount <= 0)
        throw new IllegalStateException("attempt to re-open an already-closed object: " + this);
    }
    finally
    {
    }
    this.mReferenceCount = (1 + this.mReferenceCount);
  }

  public void close()
  {
    releaseReference();
  }

  protected abstract void onAllReferencesReleased();

  @Deprecated
  protected void onAllReferencesReleasedFromContainer()
  {
    onAllReferencesReleased();
  }

  public void releaseReference()
  {
    try
    {
      int i = -1 + this.mReferenceCount;
      this.mReferenceCount = i;
      if (i == 0);
      for (int j = 1; ; j = 0)
      {
        if (j != 0)
          onAllReferencesReleased();
        return;
      }
    }
    finally
    {
    }
  }

  @Deprecated
  public void releaseReferenceFromContainer()
  {
    try
    {
      int i = -1 + this.mReferenceCount;
      this.mReferenceCount = i;
      if (i == 0);
      for (int j = 1; ; j = 0)
      {
        if (j != 0)
          onAllReferencesReleasedFromContainer();
        return;
      }
    }
    finally
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteClosable
 * JD-Core Version:    0.6.2
 */