package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;

final class ey
  implements View.OnClickListener
{
  ey(ew paramew, ar paramar, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    if (ap.jb(this.jpH.kp()))
    {
      z.d("!56@/B4Tb64lLpKwUcOR+EdWcgrQWCeRaP+fpwTv6y+mNLvWE+WR3rr02g==", "filename is null");
      return;
    }
    ew.c(this.jpP).joh.joi.d(this.jpI, this.jpH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ey
 * JD-Core Version:    0.6.2
 */