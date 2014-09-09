package com.tencent.mm.booter;

import com.tencent.mm.sdk.platformtools.ah;

final class d
  implements ah
{
  d(CoreService paramCoreService)
  {
  }

  public final void cancel()
  {
    MMReceivers.AlarmReceiver.r(this.dhG.getApplicationContext());
  }

  public final void prepare()
  {
    MMReceivers.AlarmReceiver.q(this.dhG.getApplicationContext());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.d
 * JD-Core Version:    0.6.2
 */