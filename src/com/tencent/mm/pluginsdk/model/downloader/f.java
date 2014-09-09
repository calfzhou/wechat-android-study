package com.tencent.mm.pluginsdk.model.downloader;

import com.tencent.mm.c.a.iq;
import com.tencent.mm.c.a.ir;
import com.tencent.mm.c.a.is;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ao;

final class f
  implements c
{
  f(FileDownloadManger.FileDownloadService paramFileDownloadService, an paraman, e parame, long paramLong, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
  }

  public final void d(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((bg.oE()) && (!bg.rd()))
    {
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = this.hwa.field_fileName;
      arrayOfObject1[1] = this.hwa.field_downloadKey;
      arrayOfObject1[2] = this.hwa.field_downloadUrl;
      z.i("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "download successful, report to server:[%s],[%s],[%s]", arrayOfObject1);
      iq localiq = new iq();
      localiq.cMV.appId = this.hwa.field_downloadKey;
      localiq.cMV.cMW = this.hwb.hvY;
      localiq.cMV.cMX = this.hwb.hvZ;
      localiq.cMV.cMY = this.hwa.field_fileName;
      localiq.cMV.cMZ = this.hwa.field_downloadUrl;
      localiq.cMV.cHL = this.hwa.field_md5;
      localiq.cMV.cCn = this.hwa.field_source;
      ir localir1 = localiq.cMV;
      boolean bool1;
      boolean bool2;
      label221: ir localir3;
      if (this.hwa.field_autoInstall == 0)
      {
        bool1 = false;
        localir1.cNb = bool1;
        ir localir2 = localiq.cMV;
        if (this.hwa.field_isGameFile != 0)
          break label435;
        bool2 = true;
        localir2.cNa = bool2;
        localir3 = localiq.cMV;
        if (!paramBoolean)
          break label441;
      }
      label435: label441: for (int i = 1; ; i = 0)
      {
        localir3.cNc = i;
        localiq.cMV.cNd = this.hwa.field_fromAppId;
        a.aGB().g(localiq);
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = this.hwa.field_downloadKey;
        arrayOfObject2[1] = paramString2;
        arrayOfObject2[2] = paramString1;
        z.i("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "check md5 finished, report the checked result:appid:[%s],checkedMD5:[%s],origMD5:[%s]", arrayOfObject2);
        is localis = new is();
        localis.cNe.appId = this.hwa.field_downloadKey;
        localis.cNe.cNg = paramString2;
        localis.cNe.cNf = paramString1;
        localis.cNe.cMZ = this.hwa.field_downloadUrl;
        a.aGB().g(localis);
        if (!paramBoolean)
          break label593;
        if (!paramString1.startsWith("qq_browser_apk_md5"))
          break label558;
        if ((bg.oE()) && (!bg.rd()))
          break label447;
        z.d("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "no user login, wait next login to deal this download :" + this.eYj);
        return;
        bool1 = true;
        break;
        bool2 = false;
        break label221;
      }
      label447: an localan = bg.qW().oX().cx(this.eYj);
      if (localan == null)
      {
        z.e("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "query download info failed: " + this.eYj);
        return;
      }
      localan.field_md5 = paramString2;
      boolean bool3 = bg.qW().oX().a(localan, new String[0]);
      z.i("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "update downloadinfo: " + this.eYj + ", ret = " + bool3 + ", field md5=" + paramString2);
      label558: FileDownloadManger.FileDownloadService.a(this.hwf, this.eYj, this.hwf, this.hwc, this.hwd);
    }
    while (true)
    {
      this.hwf.stopSelf(this.hwe);
      return;
      label593: z.e("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "check md5 failed, origmd5:[%s], checked md5:[%s]", new Object[] { paramString1, paramString2 });
      FileDownloadManger.FileDownloadService.a(this.hwf, this.eYj, this.hwf);
      continue;
      z.d("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "no account login, ingnore report");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.f
 * JD-Core Version:    0.6.2
 */