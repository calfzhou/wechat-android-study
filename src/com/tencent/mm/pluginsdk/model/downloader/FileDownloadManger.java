package com.tencent.mm.pluginsdk.model.downloader;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ay;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ao;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class FileDownloadManger
{
  private static Set hvS = new HashSet();

  static
  {
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("off_line_download_ids", 0);
    if (localSharedPreferences != null)
    {
      Map localMap = localSharedPreferences.getAll();
      if ((localMap != null) && (localMap.size() > 0))
      {
        Iterator localIterator = localMap.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if ((localEntry != null) && (!ch.jb((String)localEntry.getKey())))
            try
            {
              hvS.add(Long.valueOf(Long.parseLong((String)localEntry.getKey())));
            }
            catch (Exception localException)
            {
              z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "parse download task failed: " + localException.toString());
            }
        }
      }
    }
  }

  public static long a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return i(paramString1, paramString2, paramString3, paramString4);
  }

  public static long a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5)
  {
    return a(paramString1, paramString2, paramString3, paramString4, paramInt, true, false, paramString5);
  }

  private static long a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString5)
  {
    z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", " downloadUrl: [" + paramString1 + "] downloadFileName: [" + paramString2 + "] downloadKey : [" + paramString3 + "] md5: [" + paramString4 + "]");
    long l;
    if (ch.jb(paramString4))
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "md5 should not null");
      l = -2L;
    }
    Object localObject;
    label195: 
    do
    {
      return l;
      if (ch.jb(paramString1))
      {
        z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "download url is null");
        return -2L;
      }
      if (ch.jb(paramString2))
      {
        z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "download fileaName is null");
        return -2L;
      }
      l locall1 = m.azp();
      if ((!ch.jb(paramString1)) && ((paramString1.startsWith("http")) || (paramString1.startsWith("https"))))
        break;
      localObject = null;
      if (localObject == null)
        break label425;
      if (!ch.jb(paramString2))
        ((k)localObject).hT(paramString2);
      if (!ch.jb(paramString3))
        break label391;
      ((k)localObject).setKey(paramString1.hashCode());
      if (!ch.jb(paramString4))
        ((k)localObject).vj(paramString4);
      ((k)localObject).mp(paramInt);
      ((k)localObject).db(paramBoolean1);
      ((k)localObject).dc(paramBoolean2);
      ((k)localObject).vk(paramString5);
      l = locall1.a((k)localObject);
      if (at.qy() != null)
        at.qy().x(0, 0);
      z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "start net statisc, download file : %s, download url : %s, ", new Object[] { paramString2, paramString1 });
    }
    while (l != -4L);
    z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "add task by system downloadmanager failed, change to download the file by browser");
    l locall2 = m.azq();
    if ((ch.jb(paramString1)) || ((!paramString1.startsWith("http")) && (!paramString1.startsWith("https"))));
    for (h localh = null; ; localh = new h(paramString1))
    {
      if (localh != null)
        break label415;
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "get download request failed, download url is null or not a http or https url");
      return -2L;
      if (Build.VERSION.SDK_INT >= 9)
      {
        localObject = new g(paramString1);
        break;
      }
      localObject = new h(paramString1);
      break;
      label391: ((k)localObject).setKey(paramString3);
      break label195;
    }
    label415: return locall2.a(localh);
    label425: z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "get download request failed, download url is null or not a http or https url");
    return -2L;
  }

  public static void a(long paramLong, c paramc)
  {
    if ((!bg.oE()) || (bg.rd()))
    {
      z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "no user login, wait next login");
      paramc.d(" ", " ", true);
      return;
    }
    an localan = cx(paramLong);
    if (!a(localan))
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "get saved downloaditem failed: " + paramLong);
      cv(localan.field_downloadId);
      paramc.d(localan.field_md5, "", false);
      return;
    }
    File localFile = new File(localan.field_filePath);
    if (!localFile.exists())
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localan.field_filePath;
      z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "file not exists:[%s], check the download uri", arrayOfObject1);
      if (!ch.jb(localan.field_filePathFromURI))
        localFile = new File(localan.field_filePathFromURI);
      if (!localFile.exists())
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localan.field_downloadUrl;
        z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "file not esists:[%s] from downloadurl", arrayOfObject2);
        paramc.d(localan.field_md5, "", false);
        return;
      }
    }
    String str = localan.field_md5;
    if (ch.jb(str))
    {
      paramc.d(str, "", false);
      return;
    }
    am.h(new a(str, paramc, localFile));
  }

  public static void a(k paramk, long paramLong)
  {
    if ((!bg.oE()) || (bg.rd()))
    {
      z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "no user login, wait next login to deal this download :" + paramLong);
      return;
    }
    if (paramk == null)
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "updateDownloadStatus failed: request is null");
      return;
    }
    an localan1 = bg.qW().oX().cx(paramLong);
    e locale = g(ak.getContext(), paramLong);
    if (localan1 == null)
    {
      an localan2 = new an();
      localan2.field_downloadId = paramLong;
      localan2.field_downloadKey = paramk.getKey();
      localan2.field_fileName = paramk.getFileName();
      localan2.field_filePath = paramk.azh();
      localan2.field_isNotified = 0;
      localan2.field_md5 = paramk.azj();
      localan2.field_downloadUrl = paramk.azi().toString();
      localan2.field_status = 2;
      localan2.field_source = paramk.azk();
      int i;
      int j;
      if (paramk.azl())
      {
        i = 1;
        localan2.field_autoInstall = i;
        boolean bool1 = paramk.azm();
        j = 0;
        if (!bool1)
          break label310;
        label203: localan2.field_isGameFile = j;
        localan2.field_fromAppId = paramk.azn();
        if (locale.hvX == null)
          break label316;
        localan2.field_filePathFromURI = locale.hvX.getPath();
      }
      while (true)
      {
        boolean bool2 = bg.qW().oX().b(localan2);
        z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "insert downloadinfo: " + paramLong + ", ret = " + bool2 + ", status=2, savePath:" + paramk.azh());
        return;
        i = 0;
        break;
        label310: j = 1;
        break label203;
        label316: z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "query download uri is null");
      }
    }
    localan1.field_status = 2;
    boolean bool3 = bg.qW().oX().a(localan1, new String[0]);
    z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "update downloadinfo: " + paramLong + ", ret = " + bool3 + ", status=2, savePath:" + paramk.azh());
  }

  public static void a(n paramn)
  {
    m.azp().e(paramn);
  }

  private static boolean a(an paraman)
  {
    if (paraman == null)
      z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "filedownload info is null");
    do
    {
      return false;
      if ((!ch.jb(paraman.field_filePath)) && (com.tencent.mm.a.c.ac(paraman.field_filePath)))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = paraman.field_filePath;
        z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "file exist:field_filePath [%s]", arrayOfObject2);
        return true;
      }
    }
    while ((ch.jb(paraman.field_filePathFromURI)) || (!com.tencent.mm.a.c.ac(paraman.field_filePathFromURI)));
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = paraman.field_filePathFromURI;
    z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "file exist:field_filePathFromURI [%s]", arrayOfObject1);
    return true;
  }

  public static void azf()
  {
    m.azp().azo();
  }

  public static void b(n paramn)
  {
    m.azp().d(paramn);
  }

  public static List bi(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = bg.qW().oX().rawQuery("select * from FileDownloadInfo where status=8 or status=2", new String[0]);
    if (localCursor == null)
      return localArrayList;
    if (localCursor.moveToFirst());
    while (true)
    {
      an localan = new an();
      localan.b(localCursor);
      e locale;
      if ((!ch.jb(localan.field_downloadKey)) && (localan.field_downloadKey.startsWith("wx")))
      {
        if (!ch.jb(localan.field_filePath))
        {
          boolean bool2 = com.tencent.mm.a.c.ac(localan.field_filePath);
          locale = null;
          if (bool2);
        }
        else
        {
          boolean bool1 = ch.jb(localan.field_filePathFromURI);
          locale = null;
          if (bool1)
          {
            locale = g(paramContext, localan.field_downloadId);
            if (locale.hvX != null)
            {
              localan.field_filePathFromURI = locale.hvX.getPath();
              Object[] arrayOfObject5 = new Object[1];
              arrayOfObject5[0] = localan.field_fileName;
              z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "get download successful task: [%s]", arrayOfObject5);
              bg.qW().oX().a(localan, new String[0]);
              Object[] arrayOfObject6 = new Object[1];
              arrayOfObject6[0] = locale.hvX.getPath();
              z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "update local downloadinfo filepath from uri:[%s]", arrayOfObject6);
            }
          }
        }
        if (a(localan))
          break label332;
        if (locale == null)
          locale = g(paramContext, localan.field_downloadId);
        z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "download filepath is null or file not exist" + localan.field_filePath);
        if (locale.status == 0)
        {
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = localan.field_fileName;
          z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "query from content provider download task has been deleted, delete this task, wait another download: [%s]", arrayOfObject4);
          bg.qW().oX().b(localan, new String[0]);
        }
      }
      while (!localCursor.moveToNext())
      {
        if (localCursor != null)
          localCursor.close();
        return localArrayList;
        label332: if (localan.field_status == 8)
        {
          if (!localArrayList.contains(localan.field_downloadKey))
            localArrayList.add(localan.field_downloadKey);
        }
        else
        {
          if (locale == null)
            locale = g(paramContext, localan.field_downloadId);
          if (locale.status == 8)
          {
            if (!localArrayList.contains(localan.field_downloadKey))
              localArrayList.add(localan.field_downloadKey);
            localan.field_status = 8;
            Object[] arrayOfObject3 = new Object[1];
            arrayOfObject3[0] = localan.field_fileName;
            z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "get download successful task: [%s]", arrayOfObject3);
            bg.qW().oX().a(localan, new String[0]);
          }
          else if ((locale.status == 16) || (locale.status == 0))
          {
            Object[] arrayOfObject1 = new Object[1];
            arrayOfObject1[0] = localan.field_fileName;
            z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "douwnload task failed, delete this task, wait another download: [%s]", arrayOfObject1);
            bg.qW().oX().b(localan, new String[0]);
          }
          else
          {
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(locale.status);
            z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "download from content provider status:[%d]", arrayOfObject2);
          }
        }
      }
    }
  }

  public static void c(n paramn)
  {
    m.azp().f(paramn);
  }

  public static boolean cs(long paramLong)
  {
    if (paramLong <= 0L)
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "download id is not avaiable");
    String str;
    do
    {
      return false;
      if (!hvS.contains(Long.valueOf(paramLong)))
        break;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "offline download task:[%d]", arrayOfObject);
      str = g(ak.getContext(), paramLong).hvX.getPath();
    }
    while ((ch.jb(str)) || (!com.tencent.mm.a.c.ac(str)));
    z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "file exist:[%s]", new Object[] { str });
    return true;
    return a(cx(paramLong));
  }

  public static void ct(long paramLong)
  {
    if ((!bg.oE()) || (bg.rd()))
    {
      z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "no user login, wait next login to deal this download :" + paramLong + ", nofity: 1");
      return;
    }
    an localan = bg.qW().oX().cx(paramLong);
    if (localan == null)
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "query download info failed: " + paramLong);
      return;
    }
    localan.field_status = 8;
    localan.field_isNotified = 1;
    boolean bool = bg.qW().oX().a(localan, new String[0]);
    z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "update downloadinfo: " + paramLong + ", ret = " + bool + ", status=8, notify: 1");
  }

  public static void cu(long paramLong)
  {
    if ((!bg.oE()) || (bg.rd()))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "account not ready, ignore delte download file: [%d]", arrayOfObject);
      return;
    }
    an localan = bg.qW().oX().cx(paramLong);
    if (localan == null)
    {
      z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "no task added or has been deleted:" + paramLong);
      return;
    }
    if (!ch.jb(localan.field_filePath))
      com.tencent.mm.a.c.deleteFile(localan.field_filePath);
    bg.qW().oX().b(localan, new String[0]);
  }

  public static int cv(long paramLong)
  {
    if (paramLong < 0L)
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "invaild downloadid: " + paramLong);
      return -1;
    }
    return m.azp().cv(paramLong);
  }

  public static an cx(long paramLong)
  {
    boolean bool1 = bg.oE();
    an localan = null;
    if (bool1)
    {
      boolean bool2 = bg.rd();
      localan = null;
      if (!bool2)
        localan = bg.qW().oX().cx(paramLong);
    }
    if (localan == null)
      localan = new an();
    return localan;
  }

  public static long d(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    long l = i(paramString1, paramString2, null, paramString3);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(l);
    z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "add download task with out login:[%d]", arrayOfObject);
    if (l > 0L)
    {
      hvS.add(Long.valueOf(l));
      paramContext.getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(l), l).commit();
    }
    return l;
  }

  public static e g(Context paramContext, long paramLong)
  {
    e locale = new e();
    if (Build.VERSION.SDK_INT < 9)
    {
      locale.status = -1;
      return locale;
    }
    Cursor localCursor = new d(paramContext).cw(paramLong);
    if (localCursor == null)
    {
      locale.status = 0;
      return locale;
    }
    if (localCursor == null)
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "query download status failed: cursor is null");
      return locale;
    }
    int i;
    int j;
    int k;
    int m;
    int n;
    if (localCursor.moveToFirst())
    {
      i = localCursor.getColumnIndex("status");
      j = localCursor.getColumnIndex("local_uri");
      k = localCursor.getColumnIndex("reason");
      m = localCursor.getColumnIndex("bytes_so_far");
      n = localCursor.getColumnIndex("total_size");
      if (i == -1);
    }
    try
    {
      locale.status = localCursor.getInt(i);
      if (j != -1)
      {
        String str = localCursor.getString(j);
        if (ch.jb(str))
          break label330;
        z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "get download uri: [%s]", new Object[] { str });
        locale.hvX = Uri.parse(str);
      }
      while (true)
      {
        if (k != -1)
        {
          int i1 = localCursor.getInt(k);
          z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "download failed: reason: " + i1);
          if (i1 == 1009)
            locale.status = 8;
        }
        if (m != -1)
          locale.hvY = localCursor.getLong(m);
        if (n != -1)
          locale.hvZ = localCursor.getLong(n);
        localCursor.close();
        z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "FileDownloadQueryItem result: " + locale.toString());
        return locale;
        label330: z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "get download uri failed");
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.toString();
        z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "query download info failed: [%s]", arrayOfObject);
        locale.status = 16;
        locale.hvX = null;
      }
    }
  }

  public static long h(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return a(paramString1, paramString2, paramString3, paramString4, 0, false, true, paramString3);
  }

  private static long i(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return a(paramString1, paramString2, paramString3, paramString4, 0, true, false, paramString3);
  }

  public static void t(long paramLong, int paramInt)
  {
    if ((!bg.oE()) || (bg.rd()))
    {
      z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "no user login, wait next login to deal this download :" + paramLong);
      return;
    }
    an localan = bg.qW().oX().cx(paramLong);
    if (localan == null)
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "query download info failed: " + paramLong);
      return;
    }
    localan.field_status = paramInt;
    boolean bool = bg.qW().oX().a(localan, new String[0]);
    z.i("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "update downloadinfo: " + paramLong + ", ret = " + bool + ", status=" + paramInt);
  }

  public static an vh(String paramString)
  {
    an localan = new an();
    if ((!bg.oE()) || (bg.rd()))
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "getDownloadInfo account not ready, ignore this query: [%s]", new Object[] { paramString });
      return localan;
    }
    ao localao = bg.qW().oX();
    if (ch.jb(paramString))
    {
      z.e("!56@/B4Tb64lLpKVQlIh1YRBX94HnKLHqasj4QVB2Lzhv8UbwRqK+FziQw==", "spKey is null");
      localan = null;
    }
    label154: 
    while (true)
    {
      label63: Cursor localCursor;
      if (localan == null)
      {
        return new an();
        localCursor = localao.rawQuery("select * from FileDownloadInfo where downloadKey=\"" + paramString + "\" order by downloadId desc LIMIT 1", new String[0]);
        if (localCursor == null)
        {
          localan = null;
        }
        else if (localCursor.moveToFirst())
        {
          localan = new an();
          localan.b(localCursor);
        }
      }
      else
      {
        while (true)
        {
          if (localCursor == null)
            break label154;
          localCursor.close();
          break label63;
          break;
          localan = null;
        }
      }
    }
  }

  public static void vi(String paramString)
  {
    an localan = vh(paramString);
    if (localan.field_downloadId > 0L)
    {
      cv(localan.field_downloadId);
      return;
    }
    z.d("!44@/B4Tb64lLpKVQlIh1YRBX5g76KoiZ4SPl8LswwueEiY=", "removeDownloadTask failed: get downloadinfo faild : [%s]", new Object[] { paramString });
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.FileDownloadManger
 * JD-Core Version:    0.6.2
 */