package com.tencent.mm.ui.contact;

import android.view.View;

final class ep
  implements Runnable
{
  ep(SelectContactUI paramSelectContactUI)
  {
  }

  public final void run()
  {
    SelectContactUI.I(this.jBX).setVisibility(8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ep
 * JD-Core Version:    0.6.2
 */