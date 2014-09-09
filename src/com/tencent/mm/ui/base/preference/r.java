package com.tencent.mm.ui.base.preference;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class r
  implements TextView.OnEditorActionListener
{
  r(InputPreference paramInputPreference)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((3 == paramInt) && (InputPreference.a(this.jgW) != null) && (InputPreference.b(this.jgW) != null))
    {
      if (InputPreference.b(this.jgW).getText() == null)
        InputPreference.a(this.jgW);
      while (true)
      {
        return true;
        InputPreference.a(this.jgW);
        InputPreference.b(this.jgW).getText().toString();
      }
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.r
 * JD-Core Version:    0.6.2
 */