package com.tencent.mm.sandbox.updater;

import android.os.Message;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.sandbox.c;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class ab extends cm
{
  ab(aa paramaa)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if ((1 == paramMessage.what) && (!aa.a(this.iBV)))
    {
      new File(this.iBV.aMt()).delete();
      if (paramMessage.arg1 != 0)
        break label79;
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "patch ok");
      aa.b(this.iBV).a(200, 0, (vo)paramMessage.obj);
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      return;
      label79: if (paramMessage.arg1 == 3)
        aa.b(this.iBV).a(3, -1, (vo)paramMessage.obj);
      else if (paramMessage.arg1 == 4)
        aa.b(this.iBV).a(4, -1, (vo)paramMessage.obj);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.ab
 * JD-Core Version:    0.6.2
 */