package com.tencent.mm.ui.conversation;

import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.z;

final class cf
  implements Runnable
{
  cf(aj paramaj)
  {
  }

  public final void run()
  {
    if (aj.l(this.jGZ));
    while (true)
    {
      return;
      int i = aj.c(this.jGZ).getLastVisiblePosition();
      int j = aj.c(this.jGZ).getFirstVisiblePosition();
      int k = i - j;
      if (j != aj.m(this.jGZ))
      {
        aj.b(this.jGZ, j);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(j);
        arrayOfObject[1] = Integer.valueOf(k);
        z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "Jacks PreLod to Show, fistVisibleItem: %d, visibleItemCout: %d", arrayOfObject);
        for (int m = i + 1; (m < aj.e(this.jGZ).getCount()) && (m < i + k * 1); m++)
          aj.e(this.jGZ).qD(m);
        for (int n = j - 1; (n >= 0) && (n > j - k * 1); n--)
          aj.e(this.jGZ).qD(n);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.cf
 * JD-Core Version:    0.6.2
 */