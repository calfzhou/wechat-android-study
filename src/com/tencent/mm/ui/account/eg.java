package com.tencent.mm.ui.account;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;

final class eg extends cm
{
  eg(ef paramef)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    }
    do
    {
      do
        return;
      while (ef.a(this.iQd) == null);
      ef.a(this.iQd).onError(paramMessage.arg1, (String)paramMessage.obj);
      return;
    }
    while (ef.a(this.iQd) == null);
    ef.a(this.iQd).a(paramMessage.getData());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.eg
 * JD-Core Version:    0.6.2
 */