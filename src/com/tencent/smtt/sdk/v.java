package com.tencent.smtt.sdk;

import android.webkit.WebStorage.QuotaUpdater;
import com.tencent.smtt.export.external.interfaces.QuotaUpdater;

final class v
  implements QuotaUpdater
{
  WebStorage.QuotaUpdater kes;

  v(SystemWebChromeClient paramSystemWebChromeClient, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    this.kes = paramQuotaUpdater;
  }

  public final void updateQuota(long paramLong)
  {
    this.kes.updateQuota(paramLong);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.v
 * JD-Core Version:    0.6.2
 */