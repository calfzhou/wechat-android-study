package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.mm.h;

final class ag
  implements View.OnFocusChangeListener
{
  ag(MultiSelectContactView paramMultiSelectContactView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      MultiSelectContactView.e(this.hzg).setBackgroundResource(h.VZ);
      MultiSelectContactView.e(this.hzg).setPadding(MultiSelectContactView.f(this.hzg), MultiSelectContactView.f(this.hzg), MultiSelectContactView.f(this.hzg), MultiSelectContactView.f(this.hzg));
    }
    while (true)
    {
      if (MultiSelectContactView.g(this.hzg) != null)
        MultiSelectContactView.g(this.hzg).dh(paramBoolean);
      return;
      MultiSelectContactView.e(this.hzg).setBackgroundResource(h.Wa);
      MultiSelectContactView.e(this.hzg).setPadding(MultiSelectContactView.f(this.hzg), MultiSelectContactView.f(this.hzg), MultiSelectContactView.f(this.hzg), MultiSelectContactView.f(this.hzg));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ag
 * JD-Core Version:    0.6.2
 */