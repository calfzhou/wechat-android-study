package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.mm.h;

final class az
  implements View.OnFocusChangeListener
{
  az(MMFormInputView paramMMFormInputView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramView == MMFormInputView.a(this.iYZ))
    {
      MMFormInputView.b(this.iYZ);
      if (!paramBoolean)
        break label64;
      this.iYZ.setBackgroundResource(h.VZ);
    }
    while (true)
    {
      MMFormInputView.c(this.iYZ);
      if (MMFormInputView.d(this.iYZ) != null)
        MMFormInputView.d(this.iYZ).onFocusChange(paramView, paramBoolean);
      return;
      label64: this.iYZ.setBackgroundResource(h.Wa);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.az
 * JD-Core Version:    0.6.2
 */