package com.tencent.mm.ui.base;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;

final class ep extends cm
{
  ep(cn paramcn)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    this.jcY.dismiss();
    super.handleMessage(paramMessage);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ep
 * JD-Core Version:    0.6.2
 */