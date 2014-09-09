package com.tencent.mm.ui.account.mobile;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.tools.ei;

final class dv
  implements View.OnClickListener
{
  private final int iVs = 0;
  private final int iVt = 1;
  private final int iVu = 2;
  private final int iVv = 3;
  private final int iVw = 4;

  dv(MobileVerifyUI paramMobileVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    ei localei = new ei(this.iVq);
    localei.a(new dw(this));
    localei.b(new dx(this));
    localei.baG();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.dv
 * JD-Core Version:    0.6.2
 */