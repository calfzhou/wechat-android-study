package com.tencent.mm.ui.chatting;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.List;

final class mk extends cm
{
  mk(mj parammj, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    if (mj.a(this.juL) == null);
    String str;
    do
    {
      return;
      Iterator localIterator;
      while (!localIterator.hasNext())
      {
        z.d("!24@/B4Tb64lLpKqZzcmoNorjw==", "post start egg");
        localIterator = mj.a(this.juL).iterator();
      }
      str = (String)localIterator.next();
    }
    while (!mj.a(this.juL, str, mj.b(this.juL), mj.c(this.juL)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mk
 * JD-Core Version:    0.6.2
 */