package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.mm.pluginsdk.ui.applet.aa;

final class v
  implements aa
{
  v(SelectConversationUI paramSelectConversationUI, Intent paramIntent)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    if (paramBoolean)
    {
      this.jYz.setResult(-1, this.exR);
      this.jYz.finish();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.v
 * JD-Core Version:    0.6.2
 */