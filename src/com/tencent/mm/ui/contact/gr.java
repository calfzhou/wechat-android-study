package com.tencent.mm.ui.contact;

import com.tencent.mm.pluginsdk.ui.ap;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class gr
  implements ap
{
  gr(VoipAddressUI paramVoipAddressUI)
  {
  }

  public final void vt(String paramString)
  {
    z.d("!32@/B4Tb64lLpLsucrmy2Y99b8+/t/IjGYU", "onSearchTextChange  %s", new Object[] { paramString });
    String str = ch.iV(paramString.toString());
    VoipAddressUI.a(this.jCH, str);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.gr
 * JD-Core Version:    0.6.2
 */