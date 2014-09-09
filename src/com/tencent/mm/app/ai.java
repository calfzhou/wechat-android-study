package com.tencent.mm.app;

import android.os.HandlerThread;
import com.tencent.mm.sdk.platformtools.cm;

public final class ai
{
  HandlerThread cGY;
  cm gQj;

  public ai(WorkerProfile paramWorkerProfile, String paramString)
  {
    this.cGY = new HandlerThread(paramString, 10);
    this.cGY.start();
    this.gQj = new cm(this.cGY.getLooper());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ai
 * JD-Core Version:    0.6.2
 */