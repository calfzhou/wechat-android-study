package com.tencent.mm.ui.transmit;

import android.view.View;
import android.view.Window;
import com.tencent.mm.sdk.platformtools.az;

final class aa
  implements az
{
  aa(SendAppMessageWrapperUI paramSendAppMessageWrapperUI)
  {
  }

  public final boolean kJ()
  {
    if ((this.jYG.getWindow() == null) || (this.jYG.getWindow().getDecorView() == null) || (this.jYG.getWindow().getDecorView().getWindowToken() == null))
    {
      int i = SendAppMessageWrapperUI.a(this.jYG);
      boolean bool = false;
      if (i < 10)
      {
        SendAppMessageWrapperUI.b(this.jYG);
        bool = true;
      }
      return bool;
    }
    SendAppMessageWrapperUI.c(this.jYG);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.aa
 * JD-Core Version:    0.6.2
 */