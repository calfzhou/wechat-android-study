package com.tencent.mm.network;

import com.tencent.mm.network.a.a;
import com.tencent.mm.sdk.platformtools.z;

final class j
  implements Runnable
{
  j(MMNativeNetComm.ReportInfo paramReportInfo, a parama)
  {
  }

  public final void run()
  {
    int i = C2Java.access$000(this.dTf.actionId);
    if (i == 0)
    {
      z.e("C2Java", "ActionId Can not convert");
      return;
    }
    new MMNativeNetComm.ReportInfo();
    MMNativeNetComm.ReportInfo localReportInfo = this.dTf;
    localReportInfo.actionId = i;
    this.dTb.a(i, "", localReportInfo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.j
 * JD-Core Version:    0.6.2
 */