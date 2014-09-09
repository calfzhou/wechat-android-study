package com.tencent.mm.pluginsdk.model.downloader;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.jg.JgClassChecked;
import com.tencent.mm.c.a.kr;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ay;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ao;
import java.util.Set;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class FileDownloadManger$FileDownloadReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null))
      return;
    String str = paramIntent.getAction();
    z.i("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", str);
    if (ch.jb(str))
    {
      z.e("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "action is null or nill, ignore");
      return;
    }
    if (at.qy() != null)
    {
      at.qy().x(0, 0);
      z.i("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "start net statisic receive system boradcast, action : %s ", new Object[] { str });
    }
    long l = paramIntent.getLongExtra("extra_download_id", -1L);
    if (((!bg.oE()) || (bg.rd())) && (!FileDownloadManger.azg().contains(Long.valueOf(l))))
    {
      z.d("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "no user login, wait next login to deal");
      return;
    }
    if (str.equals("android.intent.action.DOWNLOAD_COMPLETE"))
    {
      if (l == -1L)
      {
        z.e("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "get download id failed");
        return;
      }
      Intent localIntent2 = new Intent();
      localIntent2.setClass(paramContext, FileDownloadManger.FileDownloadService.class);
      localIntent2.putExtras(paramIntent);
      ComponentName localComponentName = paramContext.startService(localIntent2);
      z.d("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "start download service: " + localComponentName.getClassName() + ", " + localComponentName.getPackageName());
      return;
    }
    if (str.equals("android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED"))
    {
      Intent localIntent1 = new Intent("android.intent.action.VIEW_DOWNLOADS");
      localIntent1.addCategory("android.intent.category.DEFAULT");
      localIntent1.addFlags(268435456);
      try
      {
        paramContext.startActivity(localIntent1);
        return;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getMessage();
        z.e("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "launch system default view download activity failed: [%s]", arrayOfObject1);
        if ((bg.oE()) && (!bg.rd()))
        {
          if (l != -1L)
          {
            an localan = bg.qW().oX().cx(l);
            if ((localan != null) && (!ch.jb(localan.field_downloadKey)))
            {
              kr localkr = new kr();
              localkr.cOf.flags = 335544320;
              localkr.cOf.cJO = localan.field_downloadKey;
              a.aGB().g(localkr);
              z.i("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "start launcher ui to the gamedetail info");
              return;
            }
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = ch.Y(localan.field_fileName, "");
            z.e("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "the appid is null or nill:[%s]", arrayOfObject2);
            return;
          }
          z.e("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "system not pass the clicked downloadid: download is is -1");
          return;
        }
        z.d("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "no account login, ignore click notify");
        return;
      }
    }
    if (str.equals("android.intent.action.VIEW_DOWNLOADS"))
    {
      z.i("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "action_view_downloads, ignore this action");
      return;
    }
    z.e("!44@/B4Tb64lLpJY5frTR9Nb+0npA4nhpGkSF892SOI+gLQ=", "unexception action");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.FileDownloadManger.FileDownloadReceiver
 * JD-Core Version:    0.6.2
 */