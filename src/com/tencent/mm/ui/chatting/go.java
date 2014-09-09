package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;

final class go
  implements View.OnClickListener
{
  go(gm paramgm)
  {
  }

  public final void onClick(View paramView)
  {
    if (gm.a(this.jrm).acU() == 0)
    {
      z.w("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "ignore click del btn, selected items count is 0");
      return;
    }
    Activity localActivity = gm.b(this.jrm).agh();
    e.a(localActivity, localActivity.getString(n.bAN), "", localActivity.getString(n.bEi), localActivity.getString(n.bsK), new gp(this, localActivity), null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.go
 * JD-Core Version:    0.6.2
 */