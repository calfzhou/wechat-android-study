package com.tencent.mm.ui.contact;

import android.view.View;

final class eo
  implements Runnable
{
  eo(SelectContactUI paramSelectContactUI)
  {
  }

  public final void run()
  {
    SelectContactUI.I(this.jBX).setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.eo
 * JD-Core Version:    0.6.2
 */