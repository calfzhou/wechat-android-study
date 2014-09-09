package com.tencent.mm.ui.friend;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.dj;
import com.tencent.mm.ui.base.dl;

final class o
  implements View.OnClickListener
{
  o(m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    z.v("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "on delView clicked");
    this.jId.ekC.aoN();
    if (this.jId.ekB != null)
      this.jId.ekB.S(paramView.getTag());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.o
 * JD-Core Version:    0.6.2
 */