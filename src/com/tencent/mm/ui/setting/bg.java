package com.tencent.mm.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.z;

final class bg
  implements View.OnClickListener
{
  bg(SettingsAboutSystemUI paramSettingsAboutSystemUI, LinearLayout paramLinearLayout, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    for (int i = 0; i < this.iXK.getChildCount(); i++)
    {
      TextView localTextView = (TextView)this.iXK.getChildAt(i);
      if (i.aSX != localTextView.getId())
        localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZM, 0);
    }
    ((TextView)paramView).setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZL, 0);
    int j = ((Integer)paramView.getTag()).intValue();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(j);
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT+BSAsOwccJqRYDj4eEZzt8=", "choice: %d", arrayOfObject);
    if (this.jMr == j)
      return;
    paramView.post(new bh(this, j));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bg
 * JD-Core Version:    0.6.2
 */