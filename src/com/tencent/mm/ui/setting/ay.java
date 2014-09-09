package com.tencent.mm.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.z;

final class ay
  implements View.OnClickListener
{
  ay(SettingsAboutSystemUI paramSettingsAboutSystemUI, LinearLayout paramLinearLayout, float paramFloat)
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
    float f = ((Float)paramView.getTag()).floatValue();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Float.valueOf(f);
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT+BSAsOwccJqRYDj4eEZzt8=", "select size %f", arrayOfObject);
    if (this.jMm == f)
      return;
    paramView.post(new az(this, f));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ay
 * JD-Core Version:    0.6.2
 */