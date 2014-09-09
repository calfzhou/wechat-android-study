package com.tencent.mm.ui.base;

import android.view.View;
import com.tencent.mm.sdk.platformtools.z;

public abstract class bm
{
  private bn iZJ;

  public final void a(bn parambn)
  {
    this.iZJ = parambn;
  }

  public final void aRX()
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    if (this.iZJ == null);
    while (true)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.i("!44@/B4Tb64lLpJ3ysDJ3BtNKexHqJchH0ZEIjMRGRDec0o=", "notifyDataSetChange, notifier is null ? %B", arrayOfObject);
      if (this.iZJ != null)
        break;
      return;
      bool = false;
    }
    this.iZJ.aRX();
  }

  public abstract View f(int paramInt, View paramView);

  public abstract int getCount();

  public abstract Object getItem(int paramInt);

  public abstract long getItemId(int paramInt);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bm
 * JD-Core Version:    0.6.2
 */