package com.tencent.mm.plugin.ext;

import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.LinkedList;

final class j
  implements al
{
  j(b paramb)
  {
  }

  public final void a(String paramString, ao paramao)
  {
    if (!b.b(this.eLF).contains(paramString))
      b.b(this.eLF).add(paramString);
    b.c(this.eLF).removeMessages(0);
    b.c(this.eLF).sendEmptyMessageDelayed(0, 60L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.j
 * JD-Core Version:    0.6.2
 */