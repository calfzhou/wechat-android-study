package com.tencent.mm.dbsupport.newcursor;

import android.database.CursorIndexOutOfBoundsException;

public final class f
{
  private Object[] dPK;
  private final int endIndex;
  private int index;

  f(e parame, int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    this.index = paramInt1;
    this.endIndex = paramInt2;
    this.dPK = paramArrayOfObject;
  }

  public final f Q(Object paramObject)
  {
    if (this.index == this.endIndex)
      throw new CursorIndexOutOfBoundsException("No more columns left.");
    Object[] arrayOfObject = this.dPK;
    int i = this.index;
    this.index = (i + 1);
    arrayOfObject[i] = paramObject;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.f
 * JD-Core Version:    0.6.2
 */