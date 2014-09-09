package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class ar
  implements View.OnFocusChangeListener
{
  ar(MMClearEditText paramMMClearEditText)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (MMClearEditText.c(this.iYE) != null)
      MMClearEditText.c(this.iYE).onFocusChange(paramView, paramBoolean);
    MMClearEditText.b(this.iYE);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ar
 * JD-Core Version:    0.6.2
 */