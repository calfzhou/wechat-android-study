package com.tencent.smtt.sdk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.smtt.export.external.interfaces.DownloadListener;

final class c
  implements DownloadListener
{
  private WebView jij;
  private d kdI;

  public c(WebView paramWebView, d paramd)
  {
    this.kdI = paramd;
    this.jij = paramWebView;
  }

  public final void onDownloadStart(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3, String paramString4, String paramString5, long paramLong, String paramString6, String paramString7)
  {
    if (this.kdI == null)
    {
      if (e.aF(this.jij.getContext(), paramString5))
      {
        Intent localIntent1 = new Intent("com.tencent.QQBrowser.action.sdk.document");
        localIntent1.setFlags(268435456);
        localIntent1.putExtra("key_reader_sdk_url", paramString1);
        localIntent1.putExtra("key_reader_sdk_type", 1);
        localIntent1.setData(Uri.parse(paramString1));
        this.jij.getContext().startActivity(localIntent1);
        return;
      }
      Intent localIntent2 = new Intent("com.tencent.QQBrowser.action.SHOWDOWNLOAD", Uri.parse(paramString1));
      localIntent2.addCategory("android.intent.category.DEFAULT");
      localIntent2.putExtra("method", paramString2);
      localIntent2.putExtra("postData", paramArrayOfByte);
      localIntent2.putExtra("userAgent", paramString3);
      localIntent2.putExtra("contentDisposition", paramString4);
      localIntent2.putExtra("mimetype", paramString5);
      localIntent2.putExtra("contentLength", paramLong);
      localIntent2.putExtra("referer", paramString6);
      localIntent2.putExtra("urlBeforeRedirect", paramString7);
      try
      {
        this.jij.getContext().startActivity(localIntent2);
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        return;
      }
    }
    this.kdI.t(paramString1, paramString3, paramString5);
  }

  public final void onDownloadVideo(String paramString, long paramLong, int paramInt)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.c
 * JD-Core Version:    0.6.2
 */