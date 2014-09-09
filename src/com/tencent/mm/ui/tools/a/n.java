package com.tencent.mm.ui.tools.a;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

final class n
{
  final Context context;
  final cm gQj;
  final e jWB;
  final p jWN = new p();
  final ExecutorService jWO;
  final Map jWP;
  final cm jWQ;
  final List jWR;

  n(Context paramContext, ExecutorService paramExecutorService, cm paramcm, e parame)
  {
    this.jWN.start();
    this.context = paramContext;
    this.jWO = paramExecutorService;
    this.jWP = new LinkedHashMap();
    this.gQj = new o(this.jWN.getLooper(), this);
    this.jWQ = paramcm;
    this.jWB = parame;
    this.jWR = new ArrayList(4);
  }

  private void c(d paramd)
  {
    int i;
    if ((paramd.jWD != null) && (paramd.jWD.isCancelled()))
    {
      i = 1;
      if (i == 0)
        break label31;
    }
    label31: 
    do
    {
      return;
      i = 0;
      break;
      this.jWR.add(paramd);
    }
    while (this.gQj.hasMessages(7));
    this.gQj.sendEmptyMessageDelayed(7, 200L);
  }

  final void a(d paramd)
  {
    this.jWB.u(paramd.dqq, paramd.dwV);
    this.jWP.remove(paramd.dqq);
    c(paramd);
  }

  final void b(d paramd)
  {
    this.jWP.remove(paramd.dqq);
    c(paramd);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.n
 * JD-Core Version:    0.6.2
 */