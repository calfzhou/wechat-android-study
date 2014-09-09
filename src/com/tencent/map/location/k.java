package com.tencent.map.location;

import android.telephony.TelephonyManager;
import java.util.LinkedList;
import java.util.List;

final class k extends Thread
{
  k(j paramj)
  {
  }

  public final void run()
  {
    List localList;
    if (j.d(this.LK) != null)
      localList = j.d(this.LK).getNeighboringCellInfo();
    synchronized (j.e(this.LK))
    {
      if (j.f(this.LK) == null)
        j.a(this.LK, new LinkedList());
      j.f(this.LK).clear();
      if (localList != null)
        j.f(this.LK).addAll(localList);
      j.g(this.LK);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.k
 * JD-Core Version:    0.6.2
 */