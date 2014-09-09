package com.tencent.mm.ui.contact;

import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class ci
  implements Runnable
{
  ci(ch paramch, boolean paramBoolean)
  {
  }

  public final void run()
  {
    if (!this.eiw)
    {
      e.aw(this.jzt.jzs, this.jzt.jzs.getString(n.btk));
      return;
    }
    ContactRemarkInfoViewUI.e(this.jzt.jzs);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ci
 * JD-Core Version:    0.6.2
 */