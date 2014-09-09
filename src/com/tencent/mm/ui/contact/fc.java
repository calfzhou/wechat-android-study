package com.tencent.mm.ui.contact;

import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.sdk.platformtools.am;

final class fc
  implements Runnable
{
  fc(SelectContactUI paramSelectContactUI)
  {
  }

  public final void run()
  {
    SelectContactUI.a(this.jBX, g.ayc().Vr());
    SelectContactUI.S(this.jBX);
    am.h(new fd(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fc
 * JD-Core Version:    0.6.2
 */