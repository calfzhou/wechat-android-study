package com.tencent.mm.ui.base.preference;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

final class e
  implements RadioGroup.OnCheckedChangeListener
{
  e(ChoicePreference paramChoicePreference)
  {
  }

  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    if (ChoicePreference.a(this.jgz) != null)
    {
      if (paramInt == -1)
        break label82;
      ChoicePreference.a(this.jgz, ChoicePreference.b(this.jgz)[(paramInt - 1048576)]);
    }
    while (true)
    {
      ChoicePreference.a(this.jgz, paramInt);
      ChoicePreference.a(this.jgz).a(this.jgz, this.jgz.getValue());
      return;
      label82: ChoicePreference.a(this.jgz, null);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.e
 * JD-Core Version:    0.6.2
 */