package com.tencent.mm.ui.pluginapp;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.platformtools.ap;

final class p
  implements TextView.OnEditorActionListener
{
  p(ContactSearchUI paramContactSearchUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 66) && (!ap.jb(ContactSearchUI.a(this.jKK).getText().toString().trim())))
      ContactSearchUI.b(this.jKK);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.p
 * JD-Core Version:    0.6.2
 */