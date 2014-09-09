package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.dz;

final class m extends AsyncTask
{
  private String filePath;
  private ProgressDialog jOR;
  private boolean jOS;
  private Uri uri;

  m(Intent paramIntent1, dz paramdz, String paramString, q paramq, Intent paramIntent2, int paramInt)
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
      Activity localActivity = this.jOT.agh();
      this.jOT.getString(com.tencent.mm.n.buo);
      this.jOR = e.a(localActivity, this.jOT.getString(com.tencent.mm.n.btD), true, new n(this));
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.m
 * JD-Core Version:    0.6.2
 */