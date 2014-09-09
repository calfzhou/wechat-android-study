package com.tencent.mm.sdk.platformtools;

import android.telephony.PhoneStateListener;
import java.util.Iterator;
import java.util.List;

final class bj extends PhoneStateListener
{
  bj(bi parambi)
  {
  }

  public final void onCallStateChanged(int paramInt, String paramString)
  {
    Iterator localIterator = bi.a(this.iFd).iterator();
    while (localIterator.hasNext())
      ((bk)localIterator.next()).bO(paramInt);
    super.onCallStateChanged(paramInt, paramString);
    switch (paramInt)
    {
    default:
      return;
    case 0:
      bi.M(false);
      return;
    case 1:
    case 2:
    }
    bi.M(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bj
 * JD-Core Version:    0.6.2
 */