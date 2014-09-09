package com.tencent.mm.ui.friend;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.g;
import com.tencent.mm.aj.l;
import com.tencent.mm.pluginsdk.ui.applet.a;
import com.tencent.mm.pluginsdk.ui.preference.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.av;

final class s
  implements View.OnClickListener
{
  s(m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    n localn;
    f localf;
    if ((paramView.getTag() instanceof n))
    {
      z.d("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "verifyOkOnClick onClick");
      localn = (n)paramView.getTag();
      localf = l.AE().hK(localn.username);
      if ((localf == null) || (localf.field_msgContent == null))
        z.e("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "lastRecvFmsg is null, verify fail, talker = " + localn.username);
    }
    else
    {
      return;
    }
    av localav = av.zp(localf.field_msgContent);
    z.d("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "try to addcontact, username = " + localn.username + ", opcode = MM_VERIFYUSER_VERIFYOK");
    new a(m.a(this.jId), new t(this, localn, localf)).k(localn.username, localav.aKg(), localn.gsc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.s
 * JD-Core Version:    0.6.2
 */