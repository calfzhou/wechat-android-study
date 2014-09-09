package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

final class dx
  implements View.OnClickListener
{
  dx(MMTagPanel paramMMTagPanel)
  {
  }

  public final void onClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0)
    {
      this.jcy.a((TextView)paramView, true, false);
      if (MMTagPanel.e(this.jcy) != null)
        paramView.post(new dy(this, paramView));
    }
    do
    {
      do
      {
        return;
        if ((MMTagPanel.f(this.jcy)) && (!MMTagPanel.c(this.jcy)))
          break;
        this.jcy.a((TextView)paramView, false, false);
      }
      while (MMTagPanel.e(this.jcy) == null);
      paramView.post(new dz(this, paramView));
      return;
      if (MMTagPanel.d(this.jcy) == null)
      {
        MMTagPanel.a(this.jcy, MMTagPanel.a(this.jcy, ((TextView)paramView).getText().toString()));
        this.jcy.a(MMTagPanel.d(this.jcy).jcM, false, true);
        return;
      }
      if (MMTagPanel.d(this.jcy).jcM != paramView)
        break;
      MMTagPanel.a(this.jcy, null);
      this.jcy.a((TextView)paramView, false, false);
    }
    while (MMTagPanel.e(this.jcy) == null);
    paramView.post(new ea(this, paramView));
    return;
    this.jcy.aSO();
    MMTagPanel.a(this.jcy, MMTagPanel.a(this.jcy, ((TextView)paramView).getText().toString()));
    this.jcy.a(MMTagPanel.d(this.jcy).jcM, false, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.dx
 * JD-Core Version:    0.6.2
 */