package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;
import java.util.Iterator;
import java.util.List;

final class bo
  implements cm
{
  bo(hd paramhd, List paramList, i parami, gm paramgm, Context paramContext, boolean paramBoolean)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    if (paramMenuItem.getItemId() == 1193046)
      if ((bs.a(this.jnV, this.jnR, this.jnW)) && (this.jnX != null))
        this.jnX.aVe();
    do
    {
      return;
      if (be.bb(this.jnR))
      {
        e.a(this.dLL, this.dLL.getString(n.bDI), "", new bp(this), null);
        return;
      }
      List localList = this.jnR;
      int i;
      if ((localList == null) || (localList.isEmpty()))
      {
        z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "check contain invalid send to brand msg error, selected item empty");
        i = 1;
      }
      while (i != 0)
      {
        e.a(this.dLL, this.dLL.getString(n.bOY), "", new bq(this, paramMenuItem), null);
        return;
        Iterator localIterator = localList.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            ar localar = (ar)localIterator.next();
            if ((localar.aJw()) || (be.F(localar)) || (localar.aJB()) || (be.G(localar)) || (be.H(localar)) || (localar.getType() == -1879048186))
            {
              i = 1;
              break;
            }
          }
        i = 0;
      }
      Context localContext = this.dLL;
      this.dLL.getString(n.buo);
      bk.a(e.a(localContext, this.dLL.getString(n.cen), false, null));
      gm.jrh.c(new br(this.dLL, this.jnR, this.jnT, paramMenuItem.getTitle()));
    }
    while (this.jnX == null);
    this.jnX.aVe();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bo
 * JD-Core Version:    0.6.2
 */