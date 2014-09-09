package com.tencent.mm.sandbox.updater;

import android.content.Context;
import com.tencent.mm.c.a.mq;
import com.tencent.mm.c.a.mr;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;

public final class am extends g
{
  public am()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof mq));
    mq localmq;
    Updater localUpdater;
    do
    {
      return false;
      localmq = (mq)parame;
      Context localContext = localmq.cPl.context;
      localUpdater = Updater.a(localContext, null);
    }
    while (localUpdater == null);
    localUpdater.r(localmq.cPl.type, true);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.am
 * JD-Core Version:    0.6.2
 */