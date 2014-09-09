package com.tencent.mm.app;

import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.chatting.pf;

final class f
  implements pf
{
  f(e parame)
  {
  }

  public final void hQ()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(WorkerProfile.jdMethod_if().in());
    arrayOfObject[1] = Long.valueOf(System.currentTimeMillis() - LauncherUI.iJC);
    z.i("!24@/B4Tb64lLpKk4tudMInS/w==", "start time check WorkerProfile.getInstance().hasCreate:%b, onviewDrawed time: %d", arrayOfObject);
    am.h(new g(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.f
 * JD-Core Version:    0.6.2
 */