package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import com.tencent.mm.model.cd;

final class ew
  implements cd
{
  ew(SelectContactUI paramSelectContactUI)
  {
  }

  public final void rv()
  {
    if (SelectContactUI.O(this.jBX) != null)
    {
      SelectContactUI.O(this.jBX).dismiss();
      SelectContactUI.P(this.jBX);
    }
  }

  public final boolean rw()
  {
    return SelectContactUI.N(this.jBX);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ew
 * JD-Core Version:    0.6.2
 */