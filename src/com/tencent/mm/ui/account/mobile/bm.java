package com.tencent.mm.ui.account.mobile;

import android.graphics.Bitmap;
import com.tencent.mm.network.k;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;

final class bm
  implements Runnable
{
  bm(MobileLoginOrForceReg paramMobileLoginOrForceReg, String paramString)
  {
  }

  public final void run()
  {
    try
    {
      Bitmap localBitmap2 = i.decodeStream(k.g(this.esU, 10000, 20000));
      localBitmap1 = localBitmap2;
      MobileLoginOrForceReg.b(this.iUG).sendMessage(MobileLoginOrForceReg.b(this.iUG).obtainMessage(0, localBitmap1));
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        z.e("!44@kCDfVf11b5ODuKlWMsaJVoc4C30kOcNmvf8lIbZ2/oI=", "download avatar failed");
        Bitmap localBitmap1 = null;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.bm
 * JD-Core Version:    0.6.2
 */