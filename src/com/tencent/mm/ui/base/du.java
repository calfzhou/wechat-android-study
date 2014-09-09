package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class du
  implements View.OnClickListener
{
  du(MMTagPanel paramMMTagPanel)
  {
  }

  public final void onClick(View paramView)
  {
    z.d("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "on edittext click");
    this.jcy.aSO();
    if (MMTagPanel.e(this.jcy) != null)
      MMTagPanel.e(this.jcy).RQ();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.du
 * JD-Core Version:    0.6.2
 */