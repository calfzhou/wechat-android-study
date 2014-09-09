package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class ay
  implements Runnable
{
  volatile boolean hMu = false;
  az hMv;

  private ay(MMVideoView paramMMVideoView)
  {
  }

  public final void run()
  {
    if (this.hMt.hMc < 0)
    {
      Object[] arrayOfObject6 = new Object[2];
      arrayOfObject6[0] = Integer.valueOf(this.hMt.hashCode());
      arrayOfObject6[1] = Integer.valueOf(hashCode());
      z.w("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x-#0x%x error video id", arrayOfObject6);
      return;
    }
    if (this.hMu)
    {
      Object[] arrayOfObject5 = new Object[2];
      arrayOfObject5[0] = Integer.valueOf(this.hMt.hashCode());
      arrayOfObject5[1] = Integer.valueOf(hashCode());
      z.e("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x-#0x%x match stop decode cmd at beg", arrayOfObject5);
      return;
    }
    if (MMVideoView.e(this.hMt) == 0L)
      MMVideoView.a(this.hMt, System.currentTimeMillis());
    float f = (float)(System.currentTimeMillis() - MMVideoView.e(this.hMt)) / MMVideoView.f(this.hMt);
    long l1 = System.currentTimeMillis();
    MMVideoView.a(this.hMt, System.currentTimeMillis());
    if (f >= 2.0F)
      MMVideoView.g(this.hMt);
    while (MMVideoView.i(this.hMt))
    {
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(MMVideoView.h(this.hMt));
      z.e("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "match tolerate bad seek times %d", arrayOfObject4);
      this.hMt.clear();
      return;
      MMVideoView.a(this.hMt, Math.max(0, -1 + MMVideoView.h(this.hMt)));
    }
    if (MMVideoView.a(this.hMt.hMc, MMVideoView.j(this.hMt), (int)f) < 0)
    {
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = Integer.valueOf(this.hMt.hashCode());
      arrayOfObject3[1] = Integer.valueOf(hashCode());
      arrayOfObject3[2] = Integer.valueOf(this.hMt.hMc);
      z.e("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x-#0x%x do loop, video id %d", arrayOfObject3);
      MMVideoView.a(this.hMt, 0L);
    }
    Object[] arrayOfObject1 = new Object[5];
    arrayOfObject1[0] = Integer.valueOf(this.hMt.hashCode());
    arrayOfObject1[1] = Integer.valueOf(hashCode());
    arrayOfObject1[2] = Long.valueOf(System.currentTimeMillis() - l1);
    arrayOfObject1[3] = Float.valueOf(f);
    arrayOfObject1[4] = Integer.valueOf(this.hMt.hMc);
    z.v("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x-#0x%x tick: draw frame use %d ms, seek %f, video id %d", arrayOfObject1);
    if ((-1 != MMVideoView.k(this.hMt)) && (MMVideoView.l(this.hMt) != null))
    {
      long l2 = System.currentTimeMillis();
      MMVideoView.l(this.hMt).drawBitmap(MMVideoView.j(this.hMt), null, MMVideoView.m(this.hMt), MMVideoView.n(this.hMt));
      MMVideoView.l(this.hMt).drawBitmap(MMVideoView.o(this.hMt), null, MMVideoView.m(this.hMt), MMVideoView.p(this.hMt));
      Canvas localCanvas = MMVideoView.q(this.hMt);
      MMVideoView.a(this.hMt, MMVideoView.l(this.hMt));
      MMVideoView.b(this.hMt, localCanvas);
      Bitmap localBitmap = MMVideoView.r(this.hMt);
      MMVideoView.a(this.hMt, MMVideoView.s(this.hMt));
      MMVideoView.b(this.hMt, localBitmap);
      z.d("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "tick: draw mask bmp use " + (System.currentTimeMillis() - l2) + " ms");
    }
    if (this.hMu)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(this.hMt.hashCode());
      arrayOfObject2[1] = Integer.valueOf(hashCode());
      z.e("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x-#0x%x match stop decode cmd at end", arrayOfObject2);
      return;
    }
    MMVideoView.t(this.hMt).post(this.hMv);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.ay
 * JD-Core Version:    0.6.2
 */