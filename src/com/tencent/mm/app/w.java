package com.tencent.mm.app;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.ui.tools.fh;

final class w
  implements m
{
  private fh cGW;

  w(WorkerProfile paramWorkerProfile)
  {
  }

  public final boolean a(Context paramContext, String paramString, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    return fh.a(paramContext, paramString, paramOnDismissListener);
  }

  public final boolean aw(String paramString)
  {
    return fh.aw(paramString);
  }

  public final void detach()
  {
    this.cGW = null;
  }

  public final String e(Context paramContext, String paramString)
  {
    if (this.cGW == null)
      this.cGW = new fh(paramContext);
    return this.cGW.ub(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.w
 * JD-Core Version:    0.6.2
 */