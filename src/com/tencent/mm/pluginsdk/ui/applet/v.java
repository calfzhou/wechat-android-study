package com.tencent.mm.pluginsdk.ui.applet;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.base.cn;

final class v
  implements View.OnClickListener
{
  v(aa paramaa, cn paramcn)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.hAV != null)
      this.hAV.a(false, null, 0);
    this.hAW.dismiss();
    this.hAW.setFocusable(false);
    this.hAW.setTouchable(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.v
 * JD-Core Version:    0.6.2
 */