package com.tencent.mm.ui.account.bind;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.mm.h;

final class c
  implements View.OnClickListener
{
  c(BindMobileStatusUI paramBindMobileStatusUI)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool1 = true;
    BindMobileStatusUI localBindMobileStatusUI1 = this.iTB;
    boolean bool2;
    label59: BindMobileStatusUI localBindMobileStatusUI2;
    if (!BindMobileStatusUI.d(this.iTB).booleanValue())
    {
      bool2 = bool1;
      BindMobileStatusUI.b(localBindMobileStatusUI1, Boolean.valueOf(bool2));
      if (!BindMobileStatusUI.d(this.iTB).booleanValue())
        break label123;
      BindMobileStatusUI.e(this.iTB).setImageResource(h.aai);
      localBindMobileStatusUI2 = this.iTB;
      if (BindMobileStatusUI.d(this.iTB).booleanValue())
        break label139;
    }
    while (true)
    {
      BindMobileStatusUI.a(localBindMobileStatusUI2, bool1, 256, 7);
      if (!BindMobileStatusUI.d(this.iTB).booleanValue())
        BindMobileStatusUI.a(this.iTB, false, 2097152, 32);
      return;
      bool2 = false;
      break;
      label123: BindMobileStatusUI.e(this.iTB).setImageResource(h.aaj);
      break label59;
      label139: bool1 = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.c
 * JD-Core Version:    0.6.2
 */