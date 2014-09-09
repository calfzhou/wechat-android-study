package com.tencent.mm.ui.tools.a;

import android.content.Context;
import java.util.concurrent.ExecutorService;

public final class w
{
  private final Context context;
  private e jWB;
  private ExecutorService jWO;
  private boolean jXd;

  public w(Context paramContext)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("Context must not be null.");
    this.context = paramContext.getApplicationContext();
  }

  public final u bbx()
  {
    Context localContext = this.context;
    if (this.jWB == null)
      this.jWB = new t(localContext);
    if (this.jWO == null)
      this.jWO = new aa();
    return new u(localContext, new n(localContext, this.jWO, u.jXe, this.jWB), this.jWB, this.jXd, (byte)0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.w
 * JD-Core Version:    0.6.2
 */