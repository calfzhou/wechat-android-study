package com.tencent.mm.pluginsdk.ui.tools;

import android.text.TextUtils;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.model.downloader.FileDownloadManger;
import com.tencent.mm.pluginsdk.model.downloader.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.e;

final class i
  implements n
{
  i(AppChooserUI paramAppChooserUI)
  {
  }

  public final void onDownloadError(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "onDownloadError downloadId:%s", arrayOfObject);
    bg.qW().oQ().set(AppChooserUI.a(this.hKu, 274560), Long.valueOf(0L));
    if (AppChooserUI.a(this.hKu) != null)
    {
      AppChooserUI.a(this.hKu).no(p.hKN);
      AppChooserUI.a(this.hKu).notifyDataSetChanged();
    }
  }

  public final void onDownloadFinished(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "onDownloadFinished downloadId:%s", arrayOfObject);
    if (FileDownloadManger.cs(AppChooserUI.j(this.hKu)))
    {
      String str = FileDownloadManger.cx(AppChooserUI.j(this.hKu)).field_filePath;
      z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "filepath:%s", new Object[] { str });
      if (!TextUtils.isEmpty(str))
      {
        bg.qW().oQ().set(AppChooserUI.a(this.hKu, 274560), Long.valueOf(AppChooserUI.j(this.hKu)));
        if ((AppChooserUI.a(this.hKu) != null) && (AppChooserUI.j(this.hKu) == paramLong))
        {
          AppChooserUI.a(this.hKu).no(p.hKP);
          AppChooserUI.a(this.hKu).notifyDataSetChanged();
        }
      }
    }
  }

  public final void onRemoveDownloadTaskFailed(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "onRemoveDownloadTaskFailed downloadId:%s", arrayOfObject);
  }

  public final void onRemoveDownloadTaskSucceed(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "onRemoveDownloadTaskSucceed downloadId:%s", arrayOfObject);
  }

  public final void onStartFailed(String paramString)
  {
    z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "onStartFailed errMsg:%s ", new Object[] { paramString });
  }

  public final void onStartSucceed(long paramLong, String paramString)
  {
    AppChooserUI.a(this.hKu, paramLong);
    bg.qW().oQ().set(AppChooserUI.a(this.hKu, 274560), Long.valueOf(AppChooserUI.j(this.hKu)));
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = String.valueOf(paramLong);
    arrayOfObject[1] = paramString;
    z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "onStartSucceed downloadId:%s savedFilePath:%s", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.i
 * JD-Core Version:    0.6.2
 */