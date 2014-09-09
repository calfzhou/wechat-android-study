package com.tencent.mm.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.y;

final class l
  implements View.OnClickListener
{
  l(SelfQRCodeUI paramSelfQRCodeUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (y.dc(SelfQRCodeUI.a(this.jLL)))
      return;
    this.jLL.aZc();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.l
 * JD-Core Version:    0.6.2
 */