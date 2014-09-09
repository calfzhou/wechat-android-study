package com.tencent.mm.pluginsdk.ui.tools;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.support.v4.app.Fragment;
import com.tencent.mm.a.c;
import com.tencent.mm.c.a.lp;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.dz;
import com.tencent.mm.ui.tools.l;
import java.io.File;

public final class bc
{
  private static String filePath = null;

  public static String Dv()
  {
    return i.Dv();
  }

  public static String a(Context paramContext, Intent paramIntent, String paramString)
  {
    if (filePath == null)
      filePath = paramContext.getSharedPreferences("system_config_prefs", 0).getString("camera_file_path", null);
    if ((filePath == null) || (!c.ac(filePath)))
      filePath = l.b(paramContext, paramIntent, paramString);
    i.e(filePath, paramContext);
    return filePath;
  }

  public static void a(Activity paramActivity, int paramInt1, int paramInt2, int paramInt3, Intent paramIntent)
  {
    Intent localIntent = new Intent();
    if (paramIntent != null)
      localIntent.putExtras(paramIntent.getExtras());
    localIntent.putExtra("max_select_count", paramInt2);
    localIntent.putExtra("query_source_type", paramInt3);
    localIntent.addFlags(67108864);
    com.tencent.mm.am.a.a(paramActivity, "gallery", ".ui.GalleryEntryUI", localIntent, paramInt1);
  }

  public static void a(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    if (!ch.jb(paramString2))
    {
      localIntent.putExtra("GalleryUI_FromUser", paramString1);
      localIntent.putExtra("GalleryUI_ToUser", paramString2);
    }
    localIntent.putExtra("max_select_count", paramInt2);
    localIntent.putExtra("query_source_type", paramInt3);
    localIntent.addFlags(67108864);
    com.tencent.mm.am.a.a(paramFragment, "gallery", ".ui.AlbumPreviewUI", localIntent, paramInt1);
  }

  public static void a(Fragment paramFragment, Intent paramIntent)
  {
    paramIntent.putExtra("max_select_count", 1);
    paramIntent.putExtra("query_media_type", 2);
    paramIntent.putExtra("query_source_type", 0);
    paramIntent.addFlags(67108864);
    com.tencent.mm.am.a.a(paramFragment, "gallery", ".ui.GalleryEntryUI", paramIntent, 218);
  }

  public static void a(Fragment paramFragment, String paramString1, String paramString2)
  {
    a(paramFragment, 217, 9, 3, paramString1, paramString2);
  }

  public static boolean a(Activity paramActivity, int paramInt, Intent paramIntent)
  {
    lp locallp = new lp();
    locallp.cOL.cOM = true;
    com.tencent.mm.sdk.c.a.aGB().g(locallp);
    a(paramActivity, paramInt, 1, 0, paramIntent);
    return true;
  }

  private static boolean a(Fragment paramFragment, int paramInt)
  {
    Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
    localIntent.setType("video/*");
    try
    {
      paramFragment.startActivityForResult(localIntent, 208);
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
    return false;
  }

  public static boolean a(dz paramdz, String paramString1, String paramString2)
  {
    boolean bool = a(paramdz, paramString1, paramString2, 201);
    if (bool)
    {
      lp locallp = new lp();
      locallp.cOL.cOM = true;
      com.tencent.mm.sdk.c.a.aGB().g(locallp);
    }
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = Integer.valueOf(201);
    arrayOfObject[3] = Boolean.valueOf(bool);
    z.i("!32@/B4Tb64lLpJDfbPMEgfq4ZraojIE8LWp", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", arrayOfObject);
    return bool;
  }

  private static boolean a(dz paramdz, String paramString1, String paramString2, int paramInt)
  {
    filePath = paramString1 + paramString2;
    z.i("!32@/B4Tb64lLpJDfbPMEgfq4ZraojIE8LWp", "takePhotoFromSys(), filePath = " + filePath);
    ao(paramdz.agh(), filePath);
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    File localFile = new File(paramString1);
    if (!localFile.exists());
    try
    {
      localFile.mkdirs();
      label89: if (!localFile.exists())
      {
        z.e("!32@/B4Tb64lLpJDfbPMEgfq4ZraojIE8LWp", "takePhotoFromSys(), dir not exist. " + paramString1);
        return false;
      }
      localIntent.putExtra("output", Uri.fromFile(new File(filePath)));
      try
      {
        paramdz.startActivityForResult(localIntent, 201);
        return true;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        z.e("!32@/B4Tb64lLpJDfbPMEgfq4ZraojIE8LWp", "takePhotoFromSys(), " + localActivityNotFoundException.getMessage());
        return false;
      }
    }
    catch (Exception localException)
    {
      break label89;
    }
  }

  @TargetApi(8)
  public static String aFg()
  {
    return h.dOL;
  }

  private static void ao(Context paramContext, String paramString)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("system_config_prefs", 0).edit();
    localEditor.putString("camera_file_path", paramString);
    localEditor.commit();
  }

  public static void c(Activity paramActivity, Intent paramIntent)
  {
    paramIntent.putExtra("max_select_count", 1);
    paramIntent.putExtra("query_media_type", 2);
    paramIntent.putExtra("query_source_type", 0);
    paramIntent.addFlags(67108864);
    com.tencent.mm.am.a.a(paramActivity, "gallery", ".ui.GalleryEntryUI", paramIntent, 7);
  }

  public static boolean c(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    boolean bool = d(paramActivity, paramString1, paramString2, paramInt);
    if (bool)
    {
      lp locallp = new lp();
      locallp.cOL.cOM = true;
      com.tencent.mm.sdk.c.a.aGB().g(locallp);
    }
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = Integer.valueOf(paramInt);
    arrayOfObject[3] = Boolean.valueOf(bool);
    z.i("!32@/B4Tb64lLpJDfbPMEgfq4ZraojIE8LWp", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", arrayOfObject);
    return bool;
  }

  private static boolean d(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    filePath = paramString1 + paramString2;
    z.i("!32@/B4Tb64lLpJDfbPMEgfq4ZraojIE8LWp", "takePhotoFromSys(), filePath = " + filePath);
    ao(paramActivity, filePath);
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    File localFile = new File(paramString1);
    if (!localFile.exists());
    try
    {
      localFile.mkdirs();
      label86: if (!localFile.exists())
      {
        z.e("!32@/B4Tb64lLpJDfbPMEgfq4ZraojIE8LWp", "takePhotoFromSys(), dir not exist. " + paramString1);
        return false;
      }
      localIntent.putExtra("output", Uri.fromFile(new File(filePath)));
      try
      {
        paramActivity.startActivityForResult(localIntent, paramInt);
        return true;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        z.e("!32@/B4Tb64lLpJDfbPMEgfq4ZraojIE8LWp", "takePhotoFromSys(), " + localActivityNotFoundException.getMessage());
        return false;
      }
    }
    catch (Exception localException)
    {
      break label86;
    }
  }

  public static void e(String paramString, Context paramContext)
  {
    i.e(paramString, paramContext);
  }

  private static boolean e(Activity paramActivity, int paramInt)
  {
    Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
    localIntent.setType("video/*");
    try
    {
      paramActivity.startActivityForResult(localIntent, 6);
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
    return false;
  }

  public static boolean i(Fragment paramFragment)
  {
    lp locallp = new lp();
    locallp.cOL.cOM = true;
    com.tencent.mm.sdk.c.a.aGB().g(locallp);
    a(paramFragment, 200, 1, 0, "", "");
    return true;
  }

  public static void j(String paramString, Context paramContext)
  {
    i.d(paramString, paramContext);
  }

  public static boolean j(Fragment paramFragment)
  {
    return a(paramFragment, 208);
  }

  public static String jz(String paramString)
  {
    return i.jz(paramString);
  }

  public static boolean n(Activity paramActivity)
  {
    lp locallp = new lp();
    locallp.cOL.cOM = true;
    com.tencent.mm.sdk.c.a.aGB().g(locallp);
    a(paramActivity, 2, 1, 5, null);
    return true;
  }

  public static boolean o(Activity paramActivity)
  {
    return e(paramActivity, 6);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.bc
 * JD-Core Version:    0.6.2
 */