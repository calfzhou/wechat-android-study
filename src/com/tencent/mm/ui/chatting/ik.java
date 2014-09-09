package com.tencent.mm.ui.chatting;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class ik
  implements View.OnClickListener
{
  ik(hd paramhd, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
  }

  public final void onClick(View paramView)
  {
    if (!this.jtA.aPY())
      z.w("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "Actionbar customView onclick screen not enable");
    while (this.iMq == null)
      return;
    this.iMq.onMenuItemClick(null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ik
 * JD-Core Version:    0.6.2
 */