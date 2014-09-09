package com.tencent.mm.ui.conversation;

import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.z;

final class bh
  implements Runnable
{
  bh(bg parambg)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis();
    int i;
    boolean bool;
    label59: int j;
    label87: bg localbg;
    if ((l - bg.a(this.jHi) < 3000L) && (bg.b(this.jHi) >= 0))
    {
      i = bg.b(this.jHi);
      ab localab = aj.e(this.jHi.jGZ);
      if (aj.jGV <= 0)
        break label210;
      bool = true;
      j = localab.z(i, bool);
      if (j >= 0)
        break label216;
      h.a(aj.c(this.jHi.jGZ));
      bg.a(this.jHi, l);
      localbg = this.jHi;
      if (j >= 0)
        break label248;
    }
    label210: label216: label248: for (int k = 0; ; k = j)
    {
      bg.a(localbg, k);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(aj.c(this.jHi.jGZ).getHeaderViewsCount());
      arrayOfObject[1] = Integer.valueOf(i);
      arrayOfObject[2] = Integer.valueOf(j);
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "headerCount %d, scroll from %d to %d", arrayOfObject);
      return;
      i = 1 + (aj.c(this.jHi.jGZ).getFirstVisiblePosition() - aj.c(this.jHi.jGZ).getHeaderViewsCount());
      if (i >= 0)
        break;
      i = 0;
      break;
      bool = false;
      break label59;
      h.b(aj.c(this.jHi.jGZ), j + aj.c(this.jHi.jGZ).getHeaderViewsCount());
      break label87;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.bh
 * JD-Core Version:    0.6.2
 */