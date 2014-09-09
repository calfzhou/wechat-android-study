package com.tencent.mm.ui.bindqq;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.MMWizardActivity;

final class s
  implements View.OnClickListener
{
  s(QQGroupUI paramQQGroupUI)
  {
  }

  public final void onClick(View paramView)
  {
    MMWizardActivity.j(this.jld, new Intent(this.jld, BindQQUI.class));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.s
 * JD-Core Version:    0.6.2
 */