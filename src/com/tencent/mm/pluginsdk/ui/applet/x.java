package com.tencent.mm.pluginsdk.ui.applet;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.base.cn;

final class x
  implements View.OnClickListener
{
  x(aa paramaa, View paramView, cn paramcn)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.hAY != null)
      this.hAY.a(true, r.ae(this.dYk), r.af(this.dYk));
    this.hAW.dismiss();
    this.hAW.setFocusable(false);
    this.hAW.setTouchable(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.x
 * JD-Core Version:    0.6.2
 */