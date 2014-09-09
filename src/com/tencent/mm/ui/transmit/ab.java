package com.tencent.mm.ui.transmit;

import com.tencent.mm.pluginsdk.ui.applet.aa;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;

final class ab
  implements aa
{
  ab(SendAppMessageWrapperUI paramSendAppMessageWrapperUI, WXMediaMessage paramWXMediaMessage)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    if (paramBoolean)
    {
      SendAppMessageWrapperUI.a(this.jYG, this.cHa, paramString, paramInt);
      return;
    }
    SendAppMessageWrapperUI.d(this.jYG);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.ab
 * JD-Core Version:    0.6.2
 */