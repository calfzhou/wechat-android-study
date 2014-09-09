package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

final class q
  implements View.OnClickListener
{
  q(InputPreference paramInputPreference)
  {
  }

  public final void onClick(View paramView)
  {
    if ((InputPreference.a(this.jgW) != null) && (InputPreference.b(this.jgW) != null))
    {
      if (InputPreference.b(this.jgW).getText() == null)
        InputPreference.a(this.jgW);
    }
    else
      return;
    InputPreference.a(this.jgW);
    InputPreference.b(this.jgW).getText().toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.q
 * JD-Core Version:    0.6.2
 */