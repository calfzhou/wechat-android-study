package com.tencent.mm.ui.applet;

import android.os.Message;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.cm;

final class x extends cm
{
  x(t paramt)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if (t.h(this.iWh).getVisibility() != 0)
    {
      t.i(this.iWh);
      return;
    }
    t.j(this.iWh);
    t.k(this.iWh);
    super.handleMessage(paramMessage);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.x
 * JD-Core Version:    0.6.2
 */