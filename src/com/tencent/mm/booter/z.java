package com.tencent.mm.booter;

import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.cm;

final class z
  implements Runnable
{
  z(MountReceiver paramMountReceiver)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = MountReceiver.a(this.diH);
    arrayOfObject[1] = Boolean.valueOf(bg.oE());
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpL+FWZRD8Ro5jXlpJB9munM", "dkmount [MOUNT] action:%s hasuin:%b", arrayOfObject);
    if (!bg.oE())
      return;
    bg.qV();
    MountReceiver.c(this.diH).sendEmptyMessage(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.z
 * JD-Core Version:    0.6.2
 */