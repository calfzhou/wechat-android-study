package com.tencent.mm.app;

import android.content.Intent;
import com.tencent.mm.c.a.b;
import com.tencent.mm.c.a.c;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.dm;

final class q extends g
{
  q(WorkerProfile paramWorkerProfile)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    b localb = (b)parame;
    MMActivity localMMActivity = localb.cHg.cHh;
    dm.a(localMMActivity, localb.cHg.errType, localb.cHg.errCode, new Intent().setClass(localMMActivity, LauncherUI.class).putExtra("Intro_Switch", true).addFlags(67108864), null);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.q
 * JD-Core Version:    0.6.2
 */