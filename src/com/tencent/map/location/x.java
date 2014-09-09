package com.tencent.map.location;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class x extends Handler
{
  public x(s params)
  {
    super(Looper.getMainLooper());
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 256:
    case 16:
    case 8:
    }
    do
    {
      do
      {
        do
        {
          return;
          s.a(this.Me, (q)paramMessage.obj);
          return;
          s.a(this.Me, (m)paramMessage.obj);
          return;
          s.a(this.Me, (z)paramMessage.obj);
          return;
          s.a(this.Me, paramMessage.arg1);
          return;
          s.b(this.Me, paramMessage.arg1);
          return;
          s.a(this.Me, (Location)paramMessage.obj);
          return;
        }
        while (s.e(this.Me) != 1);
        s.c(this.Me);
        return;
      }
      while (paramMessage.obj == null);
      s.a(this.Me, (String)paramMessage.obj);
      s.f(this.Me);
      return;
      if (paramMessage.arg1 == 0)
      {
        s.b(this.Me, (String)paramMessage.obj);
        return;
      }
    }
    while ((s.g(this.Me) != null) && (s.g(this.Me).gZ()));
    s.h(this.Me);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.x
 * JD-Core Version:    0.6.2
 */