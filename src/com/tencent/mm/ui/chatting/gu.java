package com.tencent.mm.ui.chatting;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.fx;

final class gu
  implements fx
{
  gu(gm paramgm)
  {
  }

  public final void DR()
  {
    z.v("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "onQuitSearch");
    if (gm.a(this.jrm).isInEditMode())
    {
      gm.b(this.jrm).aVI();
      gm.d(this.jrm).setVisibility(0);
      gm.d(this.jrm).qf(gm.a(this.jrm).acU());
    }
  }

  public final void DS()
  {
    z.v("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "onEnterSearch");
    if (gm.a(this.jrm).isInEditMode())
    {
      gm.b(this.jrm).aVH();
      gm.d(this.jrm).setVisibility(8);
    }
  }

  public final boolean jG(String paramString)
  {
    return false;
  }

  public final void jH(String paramString)
  {
    z.v("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "on edit change");
    if (ch.jb(paramString))
      if (gm.b(this.jrm).aVJ())
      {
        if (gm.h(this.jrm) != null)
          gm.h(this.jrm).jI("");
        gm.b(this.jrm).qk(-1);
      }
    do
    {
      return;
      if (gm.i(this.jrm))
      {
        gm.b(this.jrm).aVI();
        gm.d(this.jrm).setVisibility(0);
        gm.d(this.jrm).qf(gm.a(this.jrm).acU());
        return;
      }
      gm.b(this.jrm).aVI();
      gm.d(this.jrm).setVisibility(8);
      return;
      z.v("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "enter search mode");
      gm.d(this.jrm).setVisibility(8);
      gm.b(this.jrm).aVH();
    }
    while (gm.h(this.jrm) == null);
    gm.h(this.jrm).jI(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gu
 * JD-Core Version:    0.6.2
 */