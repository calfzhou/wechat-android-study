package com.tencent.mm.ui.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.n;
import java.util.ArrayList;

final class gg
  implements AdapterView.OnItemClickListener
{
  gg(ShareImageUI paramShareImageUI, gk paramgk)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.jUL.rk(paramInt);
    ShareImageUI localShareImageUI1 = this.jUM;
    if (this.jUL.baS().size() > 0);
    for (boolean bool = true; ; bool = false)
    {
      localShareImageUI1.eB(bool);
      ShareImageUI localShareImageUI2 = this.jUM;
      ShareImageUI localShareImageUI3 = this.jUM;
      int i = n.bTl;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.jUL.baS().size());
      localShareImageUI2.C(0, localShareImageUI3.getString(i, arrayOfObject));
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gg
 * JD-Core Version:    0.6.2
 */