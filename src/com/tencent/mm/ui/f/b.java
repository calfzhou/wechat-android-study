package com.tencent.mm.ui.f;

import android.content.Context;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.c.a.m;

final class b extends cm
{
  b(a parama)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    String str;
    Context localContext;
    a locala;
    if (paramMessage.what == 1000)
    {
      str = (String)paramMessage.obj;
      if (str == null)
        break label106;
      localContext = a.a(this.jZb);
      locala = this.jZb;
      if (localContext.checkCallingOrSelfPermission("android.permission.INTERNET") == 0)
        break label88;
      m.p(localContext, "Error", "Application requires permission to access the Internet");
    }
    while (true)
    {
      if (paramMessage.what == 1010)
      {
        j localj = (j)paramMessage.obj;
        a.b(this.jZb, localj);
      }
      return;
      label88: new k(localContext, str, locala).show();
      continue;
      label106: a.a(this.jZb, j.jZf);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.b
 * JD-Core Version:    0.6.2
 */