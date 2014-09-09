package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.ar.d;
import com.tencent.mm.storage.ad;

final class au
  implements AdapterView.OnItemClickListener
{
  au(SmileyGrid paramSmileyGrid)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (SmileyGrid.a(this.hzy))
    {
    case 21:
    case 22:
    case 24:
    default:
    case 23:
    case 25:
    case 20:
    }
    int i;
    do
    {
      do
      {
        do
        {
          return;
          ad localad = (ad)this.hzy.hzj.getItem(paramInt);
          SmileyGrid.a(this.hzy, localad);
          return;
          if (paramInt != -1 + this.hzy.hzj.getCount())
            break;
        }
        while (SmileyGrid.b(this.hzy) == null);
        SmileyGrid.b(this.hzy).aov();
        return;
      }
      while (paramInt + this.hzy.hzq * (-1 + this.hzy.hzo) >= SmileyGrid.c(this.hzy));
      i = paramInt + this.hzy.hzq * (-1 + this.hzy.hzo);
    }
    while (SmileyGrid.b(this.hzy) == null);
    if (SmileyGrid.d(this.hzy))
    {
      SmileyGrid.b(this.hzy).append(d.G(this.hzy.getContext(), i));
      return;
    }
    SmileyGrid.b(this.hzy).append(d.F(this.hzy.getContext(), i));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.au
 * JD-Core Version:    0.6.2
 */