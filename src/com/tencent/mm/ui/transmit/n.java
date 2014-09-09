package com.tencent.mm.ui.transmit;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.contact.da;

final class n
  implements com.tencent.mm.pluginsdk.ui.ap
{
  n(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final void vt(String paramString)
  {
    z.d("!44@/B4Tb64lLpJQGo7VtHU/glxECqNzQuUbU+29i/gx8/w=", "onSearchTextChange  %s", new Object[] { paramString });
    String str = com.tencent.mm.platformtools.ap.iV(paramString);
    if ((str != null) && (str.length() > 0))
      SelectConversationUI.a(this.jYz).fA(true);
    while (true)
    {
      SelectConversationUI.a(this.jYz).a(str, new int[] { 131072, 131073 });
      return;
      SelectConversationUI.a(this.jYz).fA(false);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.n
 * JD-Core Version:    0.6.2
 */