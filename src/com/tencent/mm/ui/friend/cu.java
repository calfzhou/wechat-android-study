package com.tencent.mm.ui.friend;

import android.os.Message;
import android.widget.ProgressBar;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.aa;

final class cu extends cm
{
  cu(ct paramct)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if (((ct.a(this.jJB) != null) && (!ct.a(this.jJB).isShowing())) || (ct.b(this.jJB)));
    do
    {
      return;
      ct.c(this.jJB);
      ct.e(this.jJB).setProgress(ct.d(this.jJB));
      if (ct.d(this.jJB) < -2 + ct.e(this.jJB).getMax())
      {
        sendEmptyMessageDelayed(0, 1000L);
        return;
      }
      ct.f(this.jJB);
      ct.e(this.jJB).setIndeterminate(true);
    }
    while (ct.g(this.jJB));
    if (ct.a(this.jJB) != null)
      ct.a(this.jJB).dismiss();
    ct.h(this.jJB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.cu
 * JD-Core Version:    0.6.2
 */