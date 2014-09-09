package com.tencent.mm.ui.tools;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.mm.a.d;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.z;

final class cy
  implements br
{
  private Bitmap eXB = null;

  cy(cv paramcv, String paramString)
  {
  }

  public final boolean rD()
  {
    if (TextUtils.isEmpty(this.jRQ))
      return false;
    this.eXB = ck.Dn(this.jRQ);
    return true;
  }

  public final boolean rE()
  {
    cv.a(this.jRS);
    if ((this.jRQ != null) && (this.eXB != null))
    {
      this.jRS.eXu.put(this.jRQ, this.eXB);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(cv.s(this.eXB));
      z.i("!56@/B4Tb64lLpJSmuQVFTi9B1wKFR288HDGmPdrb8f/E9dleBmZ5DE8Ew==", "bmp size : %s", arrayOfObject);
    }
    this.eXB = null;
    cv.b(this.jRS);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.cy
 * JD-Core Version:    0.6.2
 */