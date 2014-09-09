package com.tencent.mm.ui.account.bind;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.mm.h;

final class b
  implements View.OnClickListener
{
  b(BindMobileStatusUI paramBindMobileStatusUI)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool1 = true;
    BindMobileStatusUI localBindMobileStatusUI1 = this.iTB;
    boolean bool2;
    label59: BindMobileStatusUI localBindMobileStatusUI2;
    if (!BindMobileStatusUI.b(this.iTB).booleanValue())
    {
      bool2 = bool1;
      BindMobileStatusUI.a(localBindMobileStatusUI1, Boolean.valueOf(bool2));
      if (!BindMobileStatusUI.b(this.iTB).booleanValue())
        break label97;
      BindMobileStatusUI.c(this.iTB).setImageResource(h.aai);
      localBindMobileStatusUI2 = this.iTB;
      if (BindMobileStatusUI.b(this.iTB).booleanValue())
        break label113;
    }
    while (true)
    {
      BindMobileStatusUI.a(localBindMobileStatusUI2, bool1, 512, 8);
      return;
      bool2 = false;
      break;
      label97: BindMobileStatusUI.c(this.iTB).setImageResource(h.aaj);
      break label59;
      label113: bool1 = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.b
 * JD-Core Version:    0.6.2
 */