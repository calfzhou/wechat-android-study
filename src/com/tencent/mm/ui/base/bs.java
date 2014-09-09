package com.tencent.mm.ui.base;

import android.database.DataSetObserver;

final class bs extends DataSetObserver
{
  bs(MMHorList paramMMHorList)
  {
  }

  public final void onChanged()
  {
    MMHorList.a(this.jar);
    this.jar.invalidate();
    this.jar.requestLayout();
  }

  public final void onInvalidated()
  {
    MMHorList.b(this.jar);
    this.jar.invalidate();
    this.jar.requestLayout();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bs
 * JD-Core Version:    0.6.2
 */