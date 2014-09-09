package com.tencent.mm.k;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;

final class b extends cm
{
  b(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what == 0) && ((paramMessage.obj instanceof d)))
    {
      d locald = (d)paramMessage.obj;
      a.a(this.dQg, locald.dQh, locald.type, locald.value);
    }
    if ((paramMessage.what == 1) && ((paramMessage.obj instanceof e)))
    {
      e locale = (e)paramMessage.obj;
      a.a(this.dQg, locale.dQi, locale.dQh);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.k.b
 * JD-Core Version:    0.6.2
 */