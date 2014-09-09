package com.tencent.mm.pluginsdk.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

final class af
  implements View.OnKeyListener
{
  af(MultiSelectContactView paramMultiSelectContactView)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 67) && (paramKeyEvent.getAction() == 0) && (MultiSelectContactView.c(this.hzg).getSelectionStart() == 0) && (MultiSelectContactView.c(this.hzg).getSelectionEnd() == 0))
      MultiSelectContactView.d(this.hzg);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.af
 * JD-Core Version:    0.6.2
 */