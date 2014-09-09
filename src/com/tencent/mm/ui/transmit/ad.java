package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.app.ReportUtil.ReportArgs;
import com.tencent.mm.pluginsdk.ui.applet.aa;

final class ad
  implements aa
{
  ad(SendAppMessageWrapperUI paramSendAppMessageWrapperUI)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    this.jYG.setResult(-1);
    this.jYG.finish();
    ReportUtil.ReportArgs localReportArgs = ReportUtil.a(this.jYG.getIntent().getExtras(), 0);
    ReportUtil.a(this.jYG, localReportArgs);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.ad
 * JD-Core Version:    0.6.2
 */