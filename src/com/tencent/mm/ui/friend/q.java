package com.tencent.mm.ui.friend;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.g;
import com.tencent.mm.aj.l;
import com.tencent.mm.pluginsdk.ui.applet.a;
import com.tencent.mm.pluginsdk.ui.preference.n;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

final class q
  implements View.OnClickListener
{
  q(m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    if ((paramView.getTag() instanceof n))
    {
      z.d("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "addOnClick onClick");
      n localn = (n)paramView.getTag();
      f localf = l.AE().hK(localn.username);
      a locala = new a(m.a(this.jId), new r(this, localn, localf));
      z.d("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "try to addcontact, username = " + localn.username + ", opcode = MM_VERIFYUSER_ADDCONTACT");
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(Integer.valueOf(localn.gsc));
      locala.a(localn.username, localLinkedList, true);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.q
 * JD-Core Version:    0.6.2
 */