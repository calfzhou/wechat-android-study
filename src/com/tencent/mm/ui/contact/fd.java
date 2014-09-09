package com.tencent.mm.ui.contact;

import com.tencent.mm.ui.base.MMTagPanel;
import java.util.List;

final class fd
  implements Runnable
{
  fd(fc paramfc)
  {
  }

  public final void run()
  {
    if (this.jCb.jBX.jBW == fl.jCg)
      if ((SelectContactUI.E(this.jCb.jBX) != null) && (SelectContactUI.E(this.jCb.jBX).size() > 0))
        this.jCb.jBX.qy(fl.jCe);
    while ((SelectContactUI.T(this.jCb.jBX) == null) || (SelectContactUI.E(this.jCb.jBX) == null) || (SelectContactUI.E(this.jCb.jBX).size() <= 0))
    {
      return;
      this.jCb.jBX.qy(fl.jCd);
      return;
    }
    SelectContactUI.T(this.jCb.jBX).a(null, SelectContactUI.E(this.jCb.jBX));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fd
 * JD-Core Version:    0.6.2
 */