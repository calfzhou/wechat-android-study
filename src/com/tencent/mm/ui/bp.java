package com.tencent.mm.ui;

import android.content.Intent;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;

final class bp
  implements Runnable
{
  int cKo;
  int cKp;
  Intent cKq;
  int iKo = 0;

  private bp(LauncherUI paramLauncherUI)
  {
  }

  public final void run()
  {
    if ((bg.oE()) && (LauncherUI.c(this.iKj)))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(this.iKo);
      z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "on post select image job, acc has ready, retry count %d", arrayOfObject2);
      this.iKj.Br(LauncherUI.d(this.iKj));
      am.h(new bq(this));
      return;
    }
    if (this.iKo >= 3)
    {
      z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "on post select image job, match max retry count");
      return;
    }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Boolean.valueOf(LauncherUI.c(this.iKj));
    arrayOfObject1[1] = Integer.valueOf(this.iKo);
    z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "on post select image job, acc not ready or view init(%B), cur retry count %d", arrayOfObject1);
    this.iKo = (1 + this.iKo);
    am.b(this, 300L);
  }

  public final String toString()
  {
    return super.toString() + "|PostSelectImageJob";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bp
 * JD-Core Version:    0.6.2
 */