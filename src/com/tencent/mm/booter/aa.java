package com.tencent.mm.booter;

import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;

final class aa
  implements Runnable
{
  aa(MountReceiver paramMountReceiver)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = MountReceiver.a(this.diH);
    arrayOfObject[1] = Boolean.valueOf(bg.oE());
    z.d("!32@/B4Tb64lLpL+FWZRD8Ro5jXlpJB9munM", "dkmount [EJECT] action:%s hasuin:%b", arrayOfObject);
    if (!bg.oE())
      return;
    bg.qV();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.aa
 * JD-Core Version:    0.6.2
 */