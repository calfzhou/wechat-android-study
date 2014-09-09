package com.tencent.mm.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.z;

final class cn
  implements View.OnClickListener
{
  cn(SettingsChattingUI paramSettingsChattingUI, LinearLayout paramLinearLayout, int paramInt)
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
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT0rq7ozlS8hfaamGM7cAkVA=", "choice: %d", arrayOfObject);
    if (this.jMr == j)
      return;
    paramView.post(new co(this, j));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.cn
 * JD-Core Version:    0.6.2
 */