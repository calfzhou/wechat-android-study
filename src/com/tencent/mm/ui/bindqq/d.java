package com.tencent.mm.ui.bindqq;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;

final class d
  implements View.OnClickListener
{
  d(BindQQUI paramBindQQUI)
  {
  }

  public final void onClick(View paramView)
  {
    s locals = new s(s.dCx);
    bg.qX().d(locals);
    BindQQUI localBindQQUI1 = this.jkS;
    BindQQUI localBindQQUI2 = this.jkS;
    this.jkS.getString(n.buo);
    BindQQUI.a(localBindQQUI1, com.tencent.mm.ui.base.e.a(localBindQQUI2, this.jkS.getString(n.cfP), true, new e(this)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.d
 * JD-Core Version:    0.6.2
 */