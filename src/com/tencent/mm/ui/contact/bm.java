package com.tencent.mm.ui.contact;

import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class bm
  implements Runnable
{
  bm(bl parambl, boolean paramBoolean)
  {
  }

  public final void run()
  {
    if (!this.eiw)
    {
      e.aw(this.jzn.jzm, this.jzn.jzm.getString(n.btk));
      ContactRemarkInfoModUI.r(this.jzn.jzm).setVisibility(0);
      ContactRemarkInfoModUI.s(this.jzn.jzm).setVisibility(8);
      ContactRemarkInfoModUI.t(this.jzn.jzm).setVisibility(8);
      return;
    }
    ContactRemarkInfoModUI.u(this.jzn.jzm);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bm
 * JD-Core Version:    0.6.2
 */