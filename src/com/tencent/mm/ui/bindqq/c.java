package com.tencent.mm.ui.bindqq;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.MMWizardActivity;

final class c
  implements View.OnClickListener
{
  c(BindQQUI paramBindQQUI)
  {
  }

  public final void onClick(View paramView)
  {
    MMWizardActivity.j(this.jkS, new Intent(this.jkS, VerifyQQUI.class));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.c
 * JD-Core Version:    0.6.2
 */