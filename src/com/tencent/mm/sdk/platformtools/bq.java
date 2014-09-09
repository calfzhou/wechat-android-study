package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import android.os.Message;

final class bq extends cm
{
  bq(bp parambp, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    if ((paramMessage != null) && (paramMessage.obj != null))
      ((br)paramMessage.obj).rE();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bq
 * JD-Core Version:    0.6.2
 */