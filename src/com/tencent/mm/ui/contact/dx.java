package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.EditText;
import android.widget.ListView;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.friend.f;
import com.tencent.mm.ui.voicesearch.j;

final class dx
  implements AdapterView.OnItemLongClickListener
{
  dx(SelectContactUI paramSelectContactUI)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "onItemLongClick, targetview is SearchBar::ListView, pos = " + paramInt);
    if ((paramInt < SelectContactUI.m(this.jBX).getHeaderViewsCount()) && (paramView != null) && ((paramView instanceof EditText)))
    {
      z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "onItemLongClick, targetview is EditText, pos = " + paramInt);
      return false;
    }
    if ((SelectContactUI.n(this.jBX) != null) && (SelectContactUI.n(this.jBX).bcb()))
      return true;
    if ((SelectContactUI.o(this.jBX) == 0) || (SelectContactUI.o(this.jBX) == 1) || (SelectContactUI.o(this.jBX) == 3) || (SelectContactUI.o(this.jBX) == 4) || (SelectContactUI.o(this.jBX) == 5) || (SelectContactUI.o(this.jBX) == 7) || (SelectContactUI.o(this.jBX) == 12) || (SelectContactUI.o(this.jBX) == 10))
      return true;
    if (paramInt < SelectContactUI.m(this.jBX).getHeaderViewsCount())
    {
      if ((paramView != null) && (paramView.getParent() != null) && ((paramView.getParent().getParent() instanceof f)))
      {
        z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "onItemLongClick, targetview is FMessageContactView::ListView, pos = " + paramInt);
        return false;
      }
      return true;
    }
    String str = SelectContactUI.g(this.jBX).hX(paramInt - SelectContactUI.m(this.jBX).getHeaderViewsCount()).elz.getUsername();
    if ((y.dG(str)) || (y.dH(str)))
      return true;
    SelectContactUI.c(this.jBX, str);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dx
 * JD-Core Version:    0.6.2
 */