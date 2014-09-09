package com.tencent.mm.ah;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public final class e
{
  private static e dDz = null;
  private m dDA = null;
  private byte[] dcy = new byte[0];
  private bp dvm = new bp(1, "speex_worker");

  public static e zQ()
  {
    if (dDz == null)
      dDz = new e();
    return dDz;
  }

  public final void b(br parambr)
  {
    z.d("!12@nLQl5Xo8bwA=", "pushWork");
    this.dvm.c(parambr);
  }

  public final void pause()
  {
    z.d("!12@nLQl5Xo8bwA=", "now pause speex uploader");
    this.dvm.em(true);
  }

  public final void resume()
  {
    Looper.myQueue().addIdleHandler(new f(this));
  }

  public final void start()
  {
    if (!bc.bP(ak.getContext()))
      return;
    new cm(Looper.getMainLooper()).postDelayed(new g(this), 100L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.e
 * JD-Core Version:    0.6.2
 */