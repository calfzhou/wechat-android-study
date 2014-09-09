package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;

final class s
  implements View.OnClickListener
{
  s(LinearLayout paramLinearLayout, w paramw)
  {
  }

  public final void onClick(View paramView)
  {
    for (int i = 0; i < this.iXK.getChildCount(); i++)
    {
      TextView localTextView = (TextView)this.iXK.getChildAt(i);
      if (localTextView.getId() != i.aSX)
        localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZM, 0);
    }
    ((TextView)paramView).setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZL, 0);
    paramView.post(new t(this, ((Integer)paramView.getTag()).intValue()));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.s
 * JD-Core Version:    0.6.2
 */