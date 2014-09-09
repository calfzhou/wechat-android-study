package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.c.a.fp;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;

public abstract class d
  implements al
{
  public int hua = 0;

  public abstract ai Zv();

  public final void a(String paramString, ao paramao)
  {
    fp localfp = new fp();
    localfp.cKN.cKO = oF(paramString);
    a.aGB().g(localfp);
  }

  public final void ayp()
  {
    if (this.hua == 0)
    {
      ai localai = Zv();
      if (localai != null)
        localai.g(this);
    }
    this.hua = (1 + this.hua);
  }

  public abstract e oF(String paramString);

  public final void unregister()
  {
    if (this.hua == 0);
    ai localai;
    do
    {
      do
      {
        return;
        this.hua = (-1 + this.hua);
      }
      while (this.hua != 0);
      localai = Zv();
    }
    while (localai == null);
    localai.h(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.c.d
 * JD-Core Version:    0.6.2
 */