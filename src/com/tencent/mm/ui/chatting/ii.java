package com.tencent.mm.ui.chatting;

import com.tencent.mm.model.v;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

final class ii
  implements al
{
  ii(hd paramhd)
  {
  }

  public final void a(String paramString, ao paramao)
  {
    z.v("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "roommember watcher notify " + paramString);
    if (this.jtA.jsq)
      v.b(this.jtA.aUL(), this.jtA.jsr);
    while (true)
    {
      if (!ch.jb(paramString))
      {
        this.jtA.aVP();
        this.jtA.aVA();
        this.jtA.aWf();
      }
      this.jtA.joh.eX(null);
      return;
      this.jtA.jsr.clear();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ii
 * JD-Core Version:    0.6.2
 */