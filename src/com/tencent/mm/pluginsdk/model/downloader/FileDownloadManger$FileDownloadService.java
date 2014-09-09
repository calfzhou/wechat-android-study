package com.tencent.mm.pluginsdk.model.downloader;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.downloader.c;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ao;
import java.io.File;
import java.util.Set;

public class FileDownloadManger$FileDownloadService extends Service
{
  private void a(long paramLong, Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    e locale = FileDownloadManger.g(paramContext, paramLong);
    an localan = FileDownloadManger.cx(paramLong);
    String str1 = null;
    if (localan != null)
    {
      boolean bool = ch.jb(localan.field_fileName);
      str1 = null;
      if (!bool)
        str1 = localan.field_fileName;
    }
    if (locale.hvX != null)
    {
      PendingIntent localPendingIntent2;
      if (paramBoolean1)
        if ((localan != null) && (localan.field_fileName.equals(c.uL("shoot"))))
        {
          Intent localIntent3 = new Intent();
          localIntent3.addFlags(268435456);
          if (bg.oE())
          {
            localIntent3.putExtra("shootflashui_myusername", x.pG());
            localIntent3.putExtra("shootflashui_mynickname", x.pI());
          }
          localIntent3.setClassName(ak.getPackageName(), "com.tencent.mm.plugin.shoot.ui.ShootFlashUI");
          localPendingIntent2 = PendingIntent.getActivity(paramContext, (int)paramLong, localIntent3, 268435456);
          if ((!FileDownloadManger.azg().contains(Long.valueOf(paramLong))) && (localPendingIntent2 != null))
          {
            if ((localan == null) || (!localan.field_fileName.equals(c.uL("shoot"))))
              break label296;
            a(paramContext, paramLong, localPendingIntent2, ch.ja(str1) + paramContext.getString(n.bMo), paramContext.getString(n.cDl));
          }
          label231: FileDownloadManger.ct(paramLong);
          m.azp().onDownloadFinished(paramLong);
        }
      label296: String str2;
      do
      {
        return;
        Intent localIntent2 = new Intent("com.tencent.mm.game.md5check");
        localIntent2.addCategory("android.intent.category.DEFAULT");
        localIntent2.addFlags(268435456);
        localIntent2.putExtra("game_download_id", paramLong);
        localPendingIntent2 = PendingIntent.getActivity(paramContext, (int)paramLong, localIntent2, 268435456);
        break;
        a(paramContext, paramLong, localPendingIntent2, ch.ja(str1) + paramContext.getString(n.bMo), paramContext.getString(n.bMm));
        break label231;
        str2 = localan.field_filePath;
        z.d("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "filepath:%s", new Object[] { str2 });
      }
      while (TextUtils.isEmpty(str2));
      Uri localUri = Uri.fromFile(new File(str2));
      Intent localIntent1 = new Intent("android.intent.action.VIEW");
      localIntent1.setDataAndType(localUri, "application/vnd.android.package-archive");
      localIntent1.addFlags(268435456);
      PendingIntent localPendingIntent1 = PendingIntent.getActivity(paramContext, (int)paramLong, localIntent1, 268435456);
      if ((localan != null) && (localan.field_fileName.equals(c.uL("shoot"))))
        a(paramContext, paramLong, localPendingIntent1, ch.ja(str1) + paramContext.getString(n.bMo), paramContext.getString(n.cDl));
      while (true)
      {
        FileDownloadManger.t(paramLong, 8);
        m.azp().onDownloadFinished(paramLong);
        if (!paramBoolean2)
          break;
        u.c(paramContext, localUri);
        return;
        a(paramContext, paramLong, localPendingIntent1, ch.ja(str1) + paramContext.getString(n.bMo), paramContext.getString(n.bMm));
      }
    }
    b(paramLong, paramContext);
  }

  private static void a(Context paramContext, long paramLong, PendingIntent paramPendingIntent, String paramString1, String paramString2)
  {
    Notification localNotification = new Notification(17301634, "", System.currentTimeMillis());
    localNotification.tickerText = "";
    localNotification.setLatestEventInfo(paramContext, paramString1, paramString2, paramPendingIntent);
    localNotification.defaults = -1;
    localNotification.flags = (0x10 | localNotification.flags);
    ((NotificationManager)paramContext.getSystemService("notification")).notify((int)paramLong, localNotification);
    z.i("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "show notification");
  }

  private static void b(long paramLong, Context paramContext)
  {
    an localan = FileDownloadManger.cx(paramLong);
    String str = null;
    if (localan != null)
    {
      boolean bool = ch.jb(localan.field_fileName);
      str = null;
      if (!bool)
        str = localan.field_fileName;
    }
    a(paramContext, paramLong, PendingIntent.getActivity(paramContext, (int)paramLong, new Intent(), 268435456), ch.ja(str), paramContext.getString(n.bMn));
    FileDownloadManger.cv(paramLong);
    m.azp().onDownloadError(paramLong);
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    z.i("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "FileDownloadService onCreate");
    super.onCreate();
  }

  public void onDestroy()
  {
    z.i("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "FileDownloadService onDestroy");
    super.onDestroy();
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (paramIntent == null)
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "null intent");
      stopSelf(paramInt2);
      return 3;
    }
    long l = paramIntent.getLongExtra("extra_download_id", -1L);
    an localan = FileDownloadManger.cx(l);
    boolean bool1;
    if (localan.field_isGameFile == 0)
    {
      bool1 = true;
      if (localan.field_autoInstall != 0)
        break label109;
    }
    label109: for (boolean bool2 = false; ; bool2 = true)
    {
      if (((bg.oE()) && (!bg.rd())) || (FileDownloadManger.azg().contains(Long.valueOf(l))))
        break label115;
      z.d("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "no user login, wait next login");
      stopSelf(paramInt2);
      return 3;
      bool1 = false;
      break;
    }
    label115: if (l == -1L)
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "receive error downloadId : -1");
      stopSelf(paramInt2);
      return 3;
    }
    if (FileDownloadManger.azg().contains(Long.valueOf(l)))
    {
      a(l, this, bool1, bool2);
      stopSelf();
      return 3;
    }
    if (localan.field_downloadId == -1L)
    {
      z.d("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "query local downloadinfo failed, maybe changed account");
      stopSelf(paramInt2);
      return 3;
    }
    e locale = FileDownloadManger.g(this, l);
    if (locale.status == 8)
    {
      if (locale.hvX != null)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localan.field_fileName;
        z.d("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "query from content provider uri is not null, update loacal download info:[%s]", arrayOfObject2);
        localan.field_filePathFromURI = locale.hvX.getPath();
        bg.qW().oX().a(localan, new String[0]);
      }
      FileDownloadManger.a(l, new f(this, localan, locale, l, bool1, bool2, paramInt2));
    }
    while (true)
    {
      return 3;
      if (locale.status == 16)
      {
        if ((bg.oE()) && (!bg.rd()))
        {
          z.i("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "download failed, do notify");
          b(l, this);
        }
        while (true)
        {
          stopSelf(paramInt2);
          break;
          z.d("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "no account login, ingnore notify");
        }
      }
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(locale.status);
      z.d("!44@/B4Tb64lLpKVQlIh1YRBX64FNPvMa6moiRmEMqimpyI=", "do not deal this download status:[%d], just stop service", arrayOfObject1);
      stopSelf(paramInt2);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.FileDownloadManger.FileDownloadService
 * JD-Core Version:    0.6.2
 */