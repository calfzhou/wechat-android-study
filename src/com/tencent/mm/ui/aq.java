package com.tencent.mm.ui;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.mm.booter.ak;
import com.tencent.mm.booter.ao;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

final class aq
  implements MessageQueue.IdleHandler
{
  aq(LauncherUI paramLauncherUI)
  {
  }

  public final boolean queueIdle()
  {
    if (ap.a((Integer)bg.qW().oQ().get(15)) == 0);
    for (int i = 1; i != 0; i = 0)
    {
      z.e("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "not init finish , do not post sync task");
      return false;
    }
    String str = bf.dkH.z("login_user_name", "");
    if ((bg.ra()) || (!str.equals("")))
      bg.qX().d(new ce(new ar(this), "launch normal"));
    new ao(this.iKj).lD();
    ak.J(true);
    LauncherUI.aPx();
    Looper.myQueue().removeIdleHandler(this.iKj.iJS);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.aq
 * JD-Core Version:    0.6.2
 */