package com.tencent.mm.ui.chatting;

import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.tools.fx;

final class js
  implements fx
{
  private int jtW = 0;

  js(hd paramhd)
  {
  }

  public final void DR()
  {
    new cm().post(new jt(this));
  }

  public final void DS()
  {
  }

  public final boolean jG(String paramString)
  {
    return false;
  }

  public final void jH(String paramString)
  {
    if (ch.jb(paramString))
    {
      this.jtW = 0;
      this.jtA.qk(-1);
      return;
    }
    if (paramString.length() > this.jtW)
    {
      n localn2 = n.fTF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(1);
      localn2.d(10451, arrayOfObject2);
    }
    this.jtW = paramString.length();
    n localn1 = n.fTF;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(1);
    localn1.d(10456, arrayOfObject1);
    hd.K(this.jtA).jI(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.js
 * JD-Core Version:    0.6.2
 */