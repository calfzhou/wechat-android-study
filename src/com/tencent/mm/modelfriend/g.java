package com.tencent.mm.modelfriend;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;
import java.util.Iterator;

final class g extends cm
{
  g(Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    if (!bg.oE())
      return;
    l locall = new l();
    int i = c.dsK.size();
    boolean bool = Boolean.parseBoolean(paramMessage.obj.toString());
    Iterator localIterator = c.dsK.iterator();
    while (localIterator.hasNext())
      ((h)localIterator.next()).Z(bool);
    c.dsK.clear();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(i);
    arrayOfObject[1] = Long.valueOf(locall.nM());
    z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "callBackHandler setSize:%d time:%d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.g
 * JD-Core Version:    0.6.2
 */