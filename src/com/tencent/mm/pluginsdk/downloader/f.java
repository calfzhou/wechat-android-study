package com.tencent.mm.pluginsdk.downloader;

import android.content.Context;
import com.tencent.mm.compatible.loader.PluginDescription;
import com.tencent.mm.compatible.loader.p;
import com.tencent.mm.pluginsdk.downloader.d.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

final class f
  implements com.tencent.mm.pluginsdk.model.downloader.n
{
  f(c paramc, String paramString, b paramb, PluginDescription paramPluginDescription)
  {
  }

  public final void onDownloadError(long paramLong)
  {
    z.w("!44@/B4Tb64lLpJVwK899MjSHkgJWTIHf/+q/8VnyBTv2XM=", "onDownloadError:" + paramLong);
    if ((c.d(this.jSa) > 0L) && (c.d(this.jSa) == paramLong))
    {
      this.jSd.a(this.jSe.name, new IllegalArgumentException("fileDownloadManage Failed"));
      c.uM(ak.getContext().getString(com.tencent.mm.n.fAy));
      c.c(this.jSa);
    }
  }

  public final void onDownloadFinished(long paramLong)
  {
    z.i("!44@/B4Tb64lLpJVwK899MjSHkgJWTIHf/+q/8VnyBTv2XM=", "onDownloadFinished:" + paramLong);
    if ((c.d(this.jSa) > 0L) && (c.d(this.jSa) == paramLong))
    {
      this.jSd.a(p.a(this.jSe), this.jSe.cHL);
      c.uM(ak.getContext().getString(com.tencent.mm.n.fBk));
      c.c(this.jSa);
    }
  }

  public final void onRemoveDownloadTaskFailed(long paramLong)
  {
    z.w("!44@/B4Tb64lLpJVwK899MjSHkgJWTIHf/+q/8VnyBTv2XM=", "onRemoveDownloadTaskFailed" + paramLong);
    if ((c.d(this.jSa) > 0L) && (c.d(this.jSa) == paramLong))
      c.c(this.jSa);
  }

  public final void onRemoveDownloadTaskSucceed(long paramLong)
  {
    z.i("!44@/B4Tb64lLpJVwK899MjSHkgJWTIHf/+q/8VnyBTv2XM=", "onRemoveDownloadTaskSucceed" + paramLong);
    if ((c.d(this.jSa) > 0L) && (c.d(this.jSa) == paramLong))
      c.c(this.jSa);
  }

  public final void onStartFailed(String paramString)
  {
    z.w("!44@/B4Tb64lLpJVwK899MjSHkgJWTIHf/+q/8VnyBTv2XM=", "onStartFailed:" + paramString);
    c.c(this.jSa);
  }

  public final void onStartSucceed(long paramLong, String paramString)
  {
    z.i("!44@/B4Tb64lLpJVwK899MjSHkgJWTIHf/+q/8VnyBTv2XM=", "onStartSucceed" + paramLong);
    this.jSa.htF = com.tencent.mm.pluginsdk.downloader.a.c.htJ;
    c.f(paramLong, this.jSc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.f
 * JD-Core Version:    0.6.2
 */