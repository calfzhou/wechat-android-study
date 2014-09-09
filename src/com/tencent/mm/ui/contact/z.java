package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.mm.model.y;
import com.tencent.mm.ui.tools.ei;
import com.tencent.mm.ui.voicesearch.j;

final class z
  implements AdapterView.OnItemLongClickListener
{
  z(e parame)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "onItemLongClick, targetview is SearchBar::ListView, pos = " + paramInt);
    if (paramInt < e.c(this.jxW).getHeaderViewsCount())
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "on item long click, but match header view");
    String str;
    do
    {
      do
        return true;
      while ((e.e(this.jxW) != null) && (e.e(this.jxW).bcb()));
      str = ((com.tencent.mm.storage.a)e.a(this.jxW).cn(paramInt - e.c(this.jxW).getHeaderViewsCount())).getUsername();
    }
    while ((y.dG(str)) || (y.dH(str)));
    e.b(this.jxW, str);
    e.h(this.jxW).a(paramView, paramInt, paramLong, this.jxW, e.g(this.jxW));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.z
 * JD-Core Version:    0.6.2
 */