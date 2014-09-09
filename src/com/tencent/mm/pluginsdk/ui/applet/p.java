package com.tencent.mm.pluginsdk.ui.applet;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.d;

final class p extends cm
{
  p(CdnImageView paramCdnImageView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    byte[] arrayOfByte = (byte[])paramMessage.obj;
    if ((arrayOfByte == null) || (arrayOfByte.length == 0))
    {
      z.e("!32@/B4Tb64lLpIqiy54boRLZF2keoz/j0Rc", "handleMsg fail, data is null");
      return;
    }
    Bitmap localBitmap1 = i.cB(arrayOfByte);
    ap.yf();
    d.g(CdnImageView.a(this.hAU), localBitmap1);
    if ((localBitmap1 != null) && (CdnImageView.b(this.hAU) > 0) && (CdnImageView.c(this.hAU) > 0));
    for (Bitmap localBitmap2 = i.a(localBitmap1, CdnImageView.c(this.hAU), CdnImageView.b(this.hAU), true, false); ; localBitmap2 = localBitmap1)
    {
      if ((localBitmap2 != null) && (!ch.jb(CdnImageView.d(this.hAU))));
      try
      {
        i.a(localBitmap2, 100, Bitmap.CompressFormat.JPEG, CdnImageView.d(this.hAU), false);
        this.hAU.setImageBitmap(localBitmap2);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = localException.getMessage();
          z.e("!32@/B4Tb64lLpIqiy54boRLZF2keoz/j0Rc", "save image failed, %s", arrayOfObject);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.p
 * JD-Core Version:    0.6.2
 */