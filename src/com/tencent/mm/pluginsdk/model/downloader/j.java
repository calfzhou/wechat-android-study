package com.tencent.mm.pluginsdk.model.downloader;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.sdk.platformtools.ak;

public final class j
  implements l
{
  private Context mContext = ak.getContext();

  public final long a(k paramk)
  {
    Uri localUri = paramk.azi();
    Intent localIntent;
    if (localUri != null)
    {
      localIntent = new Intent("android.intent.action.VIEW", localUri);
      localIntent.addFlags(268435456);
    }
    try
    {
      this.mContext.startActivity(localIntent);
      label37: return 0L;
    }
    catch (Exception localException)
    {
      break label37;
    }
  }

  public final void azo()
  {
  }

  public final int cv(long paramLong)
  {
    return -1;
  }

  public final void d(n paramn)
  {
  }

  public final void e(n paramn)
  {
  }

  public final void f(n paramn)
  {
  }

  public final void onDownloadError(long paramLong)
  {
  }

  public final void onDownloadFinished(long paramLong)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.j
 * JD-Core Version:    0.6.2
 */