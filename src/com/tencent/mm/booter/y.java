package com.tencent.mm.booter;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.en;

final class y extends cm
{
  y(MountReceiver paramMountReceiver, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = MountReceiver.a(this.diH);
    arrayOfObject[bool] = Boolean.valueOf(bg.oE());
    if (MountReceiver.b(this.diH) == null)
    {
      arrayOfObject[2] = Boolean.valueOf(bool);
      arrayOfObject[3] = Boolean.valueOf(ap.DH());
      z.d("!32@/B4Tb64lLpL+FWZRD8Ro5jXlpJB9munM", "dkmount action:%s hasuin:%b ContextNull:%b SdcardFull:%b", arrayOfObject);
      if (MountReceiver.b(this.diH) != null)
        break label76;
    }
    label76: 
    while (!ap.DH())
    {
      return;
      bool = false;
      break;
    }
    en.cq(MountReceiver.b(this.diH));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.y
 * JD-Core Version:    0.6.2
 */