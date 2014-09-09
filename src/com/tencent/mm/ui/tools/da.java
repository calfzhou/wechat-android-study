package com.tencent.mm.ui.tools;

import com.tencent.mm.c.a.id;
import com.tencent.mm.c.a.ie;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class da extends g
{
  da(ImageGalleryUI paramImageGalleryUI)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if ((ImageGalleryUI.a(this.jSA) == null) || (ImageGalleryUI.b(this.jSA) == null))
    {
      z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "not in recoging");
      return false;
    }
    if ((parame == null) || (!(parame instanceof id)))
    {
      z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "receive invalid callbak");
      return false;
    }
    id localid = (id)parame;
    if (!localid.cMF.filePath.equals(ImageGalleryUI.b(this.jSA)))
    {
      z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "not same filepath");
      return false;
    }
    z.i("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "recog result: " + localid.cMF.cJT);
    if (!ch.jb(localid.cMF.cJT))
    {
      ImageGalleryUI.a(this.jSA, localid.cMF.cJT);
      ImageGalleryUI.a(this.jSA, false);
    }
    ImageGalleryUI.c(this.jSA);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.da
 * JD-Core Version:    0.6.2
 */