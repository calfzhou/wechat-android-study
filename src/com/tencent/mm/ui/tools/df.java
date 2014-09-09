package com.tencent.mm.ui.tools;

import com.tencent.mm.c.a.gm;
import com.tencent.mm.c.a.gn;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

final class df extends g
{
  df(ImageGalleryUI paramImageGalleryUI)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if ((parame == null) || (!(parame instanceof gm)))
    {
      z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "event is null or not a instant of NotifyDealQBarStrResultEvent");
      return false;
    }
    gm localgm = (gm)parame;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localgm.cLD.cLB);
    z.i("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "notify Event: %d", arrayOfObject);
    if ((localgm.cLD.cHB != this.jSA) || (localgm.cLD.cHA.equals(ImageGalleryUI.d(this.jSA))))
    {
      z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "not the same");
      return false;
    }
    switch (localgm.cLD.cLB)
    {
    case 0:
    case 1:
    case 2:
    default:
      return false;
    case 3:
    }
    this.jSA.finish();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.df
 * JD-Core Version:    0.6.2
 */