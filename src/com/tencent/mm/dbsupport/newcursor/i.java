package com.tencent.mm.dbsupport.newcursor;

import android.database.DataSetObserver;

final class i extends DataSetObserver
{
  i(h paramh)
  {
  }

  public final void onChanged()
  {
    h.a(this.dPO);
  }

  public final void onInvalidated()
  {
    h.a(this.dPO);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.i
 * JD-Core Version:    0.6.2
 */