package com.tencent.mm.ui.base;

import android.os.Message;
import android.view.View;
import com.tencent.mm.sdk.platformtools.cm;

final class cs extends cm
{
  cs(MMPullDownView paramMMPullDownView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (MMPullDownView.a(this.jbx))
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      MMPullDownView.g(this.jbx);
      return;
      if (MMPullDownView.b(this.jbx) != null)
        MMPullDownView.b(this.jbx).Zc();
      if (MMPullDownView.c(this.jbx).getVisibility() == 0)
      {
        this.jbx.scrollTo(0, MMPullDownView.d(this.jbx));
        continue;
        if (MMPullDownView.e(this.jbx) != null)
          MMPullDownView.e(this.jbx).NE();
        if (MMPullDownView.f(this.jbx).getVisibility() == 0)
          this.jbx.scrollTo(0, MMPullDownView.d(this.jbx));
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.cs
 * JD-Core Version:    0.6.2
 */