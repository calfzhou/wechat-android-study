package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.ui.base.e;

final class o extends AsyncTask
{
  private String filePath;
  private ProgressDialog jOR;
  private boolean jOS;
  private Uri uri;

  o(Intent paramIntent1, Activity paramActivity, String paramString, q paramq, Intent paramIntent2, int paramInt)
  {
  }

  private Integer aZF()
  {
    try
    {
      if (this.uri == null)
        return null;
      Bitmap localBitmap = i.e(this.uri);
      this.filePath = l.t(this.jOU, localBitmap);
      return null;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  protected final void onPreExecute()
  {
    try
    {
      this.uri = this.fqu.getData();
      this.jOS = false;
      Activity localActivity = this.jOX;
      this.jOX.getString(n.buo);
      this.jOR = e.a(localActivity, this.jOX.getString(n.btD), true, new p(this));
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.o
 * JD-Core Version:    0.6.2
 */