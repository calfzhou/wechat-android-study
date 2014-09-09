package com.tencent.mm.ui.base;

import android.database.DataSetObserver;

final class ca extends DataSetObserver
{
  private ca(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final void onChanged()
  {
    if (this.jay.isShowing())
      this.jay.show();
  }

  public final void onInvalidated()
  {
    this.jay.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ca
 * JD-Core Version:    0.6.2
 */