package com.tencent.mm.ui.f;

import android.os.Message;
import c.a.e.b;
import com.tencent.mm.sdk.platformtools.cm;

final class c extends Thread
{
  c(a parama)
  {
  }

  public final void run()
  {
    try
    {
      a.a(this.jZb, a.b(this.jZb).bfQ());
      String str2 = a.b(this.jZb).c(a.c(this.jZb));
      str1 = str2;
      Message localMessage = a.d(this.jZb).obtainMessage(1000, str1);
      a.d(this.jZb).sendMessage(localMessage);
      return;
    }
    catch (c.a.b.a locala)
    {
      while (true)
        String str1 = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.c
 * JD-Core Version:    0.6.2
 */