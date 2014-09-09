package com.tencent.mm.ui.contact;

import android.widget.TextView;
import com.tencent.mm.ui.base.AlphabetScrollBar;

final class fk
  implements dt
{
  fk(SelectContactUI paramSelectContactUI)
  {
  }

  public final void pd(int paramInt)
  {
    if (SelectContactUI.j(this.jBX))
    {
      this.jBX.eB(true);
      if (paramInt > 0)
      {
        SelectContactUI.k(this.jBX).setVisibility(8);
        SelectContactUI.l(this.jBX).setVisibility(8);
      }
    }
    while (true)
    {
      SelectContactUI.b(this.jBX, false);
      return;
      SelectContactUI.k(this.jBX).setVisibility(0);
      SelectContactUI.l(this.jBX).setVisibility(0);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fk
 * JD-Core Version:    0.6.2
 */