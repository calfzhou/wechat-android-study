package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class gq
  implements View.OnClickListener
{
  gq(gm paramgm)
  {
  }

  public final void onClick(View paramView)
  {
    if (gm.a(this.jrm).acU() == 0)
    {
      z.w("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "ignore click del btn, selected items count is 0");
      return;
    }
    bk.a(gm.b(this.jrm), gm.e(this.jrm), gm.f(this.jrm), this.jrm, gm.g(this.jrm));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gq
 * JD-Core Version:    0.6.2
 */