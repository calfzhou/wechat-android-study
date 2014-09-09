package com.tencent.mm.ui.base.preference;

import android.widget.RadioButton;

final class d
{
  int id;
  CharSequence text;

  public d(CharSequence paramCharSequence, int paramInt)
  {
    this.text = paramCharSequence;
    this.id = paramInt;
  }

  public final void a(RadioButton paramRadioButton)
  {
    paramRadioButton.setText(this.text);
    paramRadioButton.setId(this.id);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.d
 * JD-Core Version:    0.6.2
 */