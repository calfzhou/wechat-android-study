package com.tencent.mm.ui.contact;

import com.tencent.mm.pluginsdk.ui.aq;
import java.util.List;

final class em
  implements aq
{
  em(SelectContactUI paramSelectContactUI)
  {
  }

  public final void dh(boolean paramBoolean)
  {
    if (!SelectContactUI.z(this.jBX))
    {
      this.jBX.qy(fl.jCg);
      return;
    }
    if ((paramBoolean) && (SelectContactUI.g(this.jBX) != null) && (!SelectContactUI.g(this.jBX).aXw()) && (SelectContactUI.E(this.jBX) != null) && (SelectContactUI.E(this.jBX).size() > 0))
    {
      this.jBX.qy(fl.jCe);
      return;
    }
    this.jBX.qy(fl.jCd);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.em
 * JD-Core Version:    0.6.2
 */