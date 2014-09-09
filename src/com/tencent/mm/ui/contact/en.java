package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.cn;

final class en
  implements AbsListView.OnScrollListener
{
  en(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 2);
    while (SelectContactUI.F(this.jBX))
      return;
    SelectContactUI.G(this.jBX);
    if (SelectContactUI.H(this.jBX) != null)
      SelectContactUI.H(this.jBX).dismiss();
    SelectContactUI.a(this.jBX, com.tencent.mm.ui.base.en.a(this.jBX, this.jBX.getString(n.bRg), 4000L));
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 0)
    {
      View localView = SelectContactUI.m(this.jBX).getChildAt(SelectContactUI.m(this.jBX).getFirstVisiblePosition());
      if ((localView != null) && (localView.getTop() == 0))
      {
        SelectContactUI.I(this.jBX).setVisibility(8);
        return;
      }
      SelectContactUI.I(this.jBX).setVisibility(0);
      return;
    }
    SelectContactUI.I(this.jBX).setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.en
 * JD-Core Version:    0.6.2
 */