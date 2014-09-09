package com.tencent.mm.app;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.cm;

public final class l
{
  public static l cGt;
  private boolean cGu;
  private cm cGv = new m(this, Looper.getMainLooper());

  public static l id()
  {
    if (cGt == null)
      cGt = new l();
    return cGt;
  }

  public final void resume()
  {
    this.cGu = true;
    this.cGv.removeMessages(-1999);
    this.cGv.removeMessages(-2999);
  }

  public final void start()
  {
    this.cGu = false;
    this.cGv.removeMessages(-1999);
    this.cGv.removeMessages(-2999);
    this.cGv.sendEmptyMessageDelayed(-1999, 3000L);
    this.cGv.sendEmptyMessageDelayed(-2999, 30000L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.l
 * JD-Core Version:    0.6.2
 */