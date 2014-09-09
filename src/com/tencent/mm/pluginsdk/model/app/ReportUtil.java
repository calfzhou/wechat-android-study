package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.sdk.a.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.modelmsg.j;

public final class ReportUtil
{
  public static ReportUtil.ReportArgs a(Bundle paramBundle, int paramInt)
  {
    String str1 = paramBundle.getString("SendAppMessageWrapper_AppId");
    if (str1 == null)
    {
      String str2 = paramBundle.getString("_mmessage_content");
      if (str2 != null)
        str1 = Uri.parse(str2).getQueryParameter("appid");
    }
    if (str1 == null)
      return null;
    k localk = new k();
    localk.field_appId = str1;
    bf.GO().c(localk, new String[0]);
    ReportUtil.ReportArgs localReportArgs = new ReportUtil.ReportArgs();
    localReportArgs.ehH = localk.field_packageName;
    localReportArgs.errCode = paramInt;
    j localj = new j();
    localj.e(paramBundle);
    localReportArgs.hvw = localj.hvw;
    localReportArgs.ehE = localk.field_openId;
    return localReportArgs;
  }

  public static void a(Context paramContext, ReportUtil.ReportArgs paramReportArgs)
  {
    com.tencent.mm.sdk.modelmsg.k localk = new com.tencent.mm.sdk.modelmsg.k();
    localk.errCode = paramReportArgs.errCode;
    localk.hvw = paramReportArgs.hvw;
    localk.ehE = paramReportArgs.ehE;
    Bundle localBundle = new Bundle();
    localk.d(localBundle);
    u.u(localBundle);
    b localb = new b();
    localb.iCY = paramReportArgs.ehH;
    localb.iDa = localBundle;
    a.a(paramContext, localb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ReportUtil
 * JD-Core Version:    0.6.2
 */