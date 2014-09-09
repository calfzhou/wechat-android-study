package com.tencent.mm.al;

import android.os.Message;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.cm;

final class h extends cm
{
  h(g paramg)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 2)
      if (f.a(this.dJs.dJr) != null)
        f.a(this.dJs.dJr).BV();
    label165: label197: 
    do
    {
      return;
      if (paramMessage.what == 0)
      {
        if (f.b(this.dJs.dJr) == 0)
        {
          bg.qX().a(349, this.dJs.dJr);
          if (f.b(this.dJs.dJr) != 0)
            break label197;
          if (f.c(this.dJs.dJr))
            break label165;
          f.a(this.dJs.dJr, new d(f.d(this.dJs.dJr), 0));
        }
        while (true)
        {
          bg.qX().d(f.e(this.dJs.dJr));
          return;
          bg.qX().a(206, this.dJs.dJr);
          break;
          f.a(this.dJs.dJr, new d(f.d(this.dJs.dJr), 1));
          continue;
          f.a(this.dJs.dJr, new b(f.d(this.dJs.dJr), f.b(this.dJs.dJr)));
        }
      }
    }
    while ((paramMessage.what != 3) || (f.a(this.dJs.dJr) == null));
    String[] arrayOfString = new String[0];
    f.a(this.dJs.dJr).a(arrayOfString, -1L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.h
 * JD-Core Version:    0.6.2
 */