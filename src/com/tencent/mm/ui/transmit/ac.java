package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.mm.pluginsdk.ui.applet.aa;

final class ac
  implements aa
{
  ac(SendAppMessageWrapperUI paramSendAppMessageWrapperUI)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    this.jYG.setResult(-1, new Intent().putExtra("Select_stay_in_wx", true));
    this.jYG.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.ac
 * JD-Core Version:    0.6.2
 */