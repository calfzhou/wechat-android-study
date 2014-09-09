package com.tencent.mm.ui.tools;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.mm.a.d;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

final class ct
  implements br
{
  private Bitmap eXB = null;

  ct(cm paramcm, String paramString)
  {
  }

  public final boolean rD()
  {
    if ((cm.b(this.jRN) == null) || (TextUtils.isEmpty(this.jRQ)))
      return false;
    this.eXB = cm.b(this.jRN).Dm(this.jRQ);
    return true;
  }

  public final boolean rE()
  {
    cm.d(this.jRN);
    int i;
    if (cm.e(this.jRN).containsKey(this.jRQ))
    {
      i = ((Integer)cm.e(this.jRN).get(this.jRQ)).intValue();
      if (cm.f(this.jRN))
        break label129;
      cm.g(this.jRN).put(i, this.eXB);
    }
    while (true)
    {
      this.jRN.eXu.b(this.jRQ, this.eXB);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(cv.s(this.eXB));
      z.i("!44@/B4Tb64lLpJSmuQVFTi9B6QdAPUqkDaT/sMIXOVKzm0=", "bmp size : %s", arrayOfObject);
      this.eXB = null;
      cm.h(this.jRN);
      return false;
      label129: cm.a(this.jRN, i, this.eXB);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ct
 * JD-Core Version:    0.6.2
 */