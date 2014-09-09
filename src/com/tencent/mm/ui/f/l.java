package com.tencent.mm.ui.f;

import android.view.View;
import android.view.View.OnClickListener;

final class l
  implements View.OnClickListener
{
  l(k paramk)
  {
  }

  public final void onClick(View paramView)
  {
    k.a(this.jZj).onCancel();
    this.jZj.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.l
 * JD-Core Version:    0.6.2
 */