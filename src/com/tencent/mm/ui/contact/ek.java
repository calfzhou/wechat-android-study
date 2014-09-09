package com.tencent.mm.ui.contact;

import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.ao;

final class ek
  implements ao
{
  ek(SelectContactUI paramSelectContactUI)
  {
  }

  public final void vs(String paramString)
  {
    int i;
    if (paramString != null)
    {
      SelectContactUI.g(this.jBX).CB(paramString);
      i = -1 + SelectContactUI.w(this.jBX);
      if (i != 0)
        break label66;
      this.jBX.C(1, this.jBX.getString(n.btQ));
    }
    while (SelectContactUI.x(this.jBX))
    {
      this.jBX.eB(true);
      return;
      label66: this.jBX.C(1, this.jBX.getString(n.btQ) + "(" + i + ")");
    }
    SelectContactUI localSelectContactUI = this.jBX;
    if (SelectContactUI.w(this.jBX) > 0);
    for (boolean bool = true; ; bool = false)
    {
      localSelectContactUI.t(1, bool);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ek
 * JD-Core Version:    0.6.2
 */