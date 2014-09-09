package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import com.tencent.mm.n.af;
import com.tencent.mm.n.m;
import com.tencent.mm.n.s;
import com.tencent.mm.n.u;
import com.tencent.mm.sdk.platformtools.z;

final class w
  implements u
{
  w(v paramv, Bitmap paramBitmap)
  {
  }

  public final int A(int paramInt1, int paramInt2)
  {
    v.a(this.hyF).sk();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.i("!32@/B4Tb64lLpJVNeQZm2lJBnzQojVcN8Km", "onSceneEnd: errType=%d, errCode=%d", arrayOfObject);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      Bitmap localBitmap = af.sh().eV(v.b(this.hyF));
      if (localBitmap != null)
      {
        v.a(this.hyF, localBitmap, af.sh().g(v.b(this.hyF), true));
        if (v.c(this.hyF) != null)
        {
          v.c(this.hyF);
          v.b(this.hyF);
        }
      }
    }
    do
    {
      return 0;
      v.a(this.hyF, this.hyE, null);
      break;
      v.a(this.hyF, this.hyE, null);
    }
    while (v.c(this.hyF) == null);
    v.c(this.hyF);
    v.b(this.hyF);
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.w
 * JD-Core Version:    0.6.2
 */