package com.tencent.mm.ui.base;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

final class da
  implements ViewGroup.OnHierarchyChangeListener
{
  private ViewGroup.OnHierarchyChangeListener jbG;

  private da(MMRadioGroupView paramMMRadioGroupView)
  {
  }

  public final void onChildViewAdded(View paramView1, View paramView2)
  {
    if ((paramView1 == this.jbF) && ((paramView2 instanceof MMRadioImageButton)))
    {
      if (paramView2.getId() == -1)
      {
        int i = paramView2.hashCode();
        if (i < 0)
          i &= 2147483647;
        paramView2.setId(i);
      }
      ((MMRadioImageButton)paramView2).a(MMRadioGroupView.b(this.jbF));
    }
    if (this.jbG != null)
      this.jbG.onChildViewAdded(paramView1, paramView2);
  }

  public final void onChildViewRemoved(View paramView1, View paramView2)
  {
    if ((paramView1 == this.jbF) && ((paramView2 instanceof MMRadioImageButton)))
      ((MMRadioImageButton)paramView2).a(null);
    if (this.jbG != null)
      this.jbG.onChildViewRemoved(paramView1, paramView2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.da
 * JD-Core Version:    0.6.2
 */