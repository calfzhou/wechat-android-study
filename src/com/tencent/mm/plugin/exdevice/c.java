package com.tencent.mm.plugin.exdevice;

import com.tencent.mm.c.a.gq;
import com.tencent.mm.c.a.gr;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.chatting.hd;

final class c extends g
{
  public c(a parama)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof gq))
    {
      z.f("!64@/B4Tb64lLpLHXwcx366fGo2wcxwH4rCJR7HpyE+E0/zfnN6G97cBRqZ3oCdpuO6G", "mismatched event");
      return false;
    }
    gq localgq = (gq)parame;
    if (a.a(this.eIa) == null)
    {
      z.e("!64@/B4Tb64lLpLHXwcx366fGo2wcxwH4rCJR7HpyE+E0/zfnN6G97cBRqZ3oCdpuO6G", "context == null");
      return false;
    }
    if (a.a(this.eIa).isFinishing())
    {
      z.e("!64@/B4Tb64lLpLHXwcx366fGo2wcxwH4rCJR7HpyE+E0/zfnN6G97cBRqZ3oCdpuO6G", "context isFinishing");
      return false;
    }
    int i = localgq.cLI.op;
    String str = localgq.cLI.cKL;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(i);
    arrayOfObject[1] = str;
    z.i("!64@/B4Tb64lLpLHXwcx366fGo2wcxwH4rCJR7HpyE+E0/zfnN6G97cBRqZ3oCdpuO6G", "opcode is %d, brand name is %s", arrayOfObject);
    if (!a.a(this.eIa).aUL().equals(str))
    {
      z.i("!64@/B4Tb64lLpLHXwcx366fGo2wcxwH4rCJR7HpyE+E0/zfnN6G97cBRqZ3oCdpuO6G", "not current brandname");
      return true;
    }
    switch (i)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      return true;
      a.a(this.eIa, localgq.cLI.cKI, str);
      continue;
      a.a(this.eIa, localgq.cLI.cLJ);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c
 * JD-Core Version:    0.6.2
 */