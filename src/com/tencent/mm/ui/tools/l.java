package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.dz;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class l
{
  public static void a(dz paramdz, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt)
  {
    if (!paramIntent1.getData().toString().startsWith("content://com.google.android.gallery3d"))
    {
      String str = b(paramdz.agh(), paramIntent1, paramString);
      if (!ch.jb(str))
      {
        paramIntent2.putExtra("CropImage_ImgPath", str);
        paramdz.startActivityForResult(paramIntent2, 203);
      }
      return;
    }
    m localm = new m(paramIntent1, paramdz, paramString, null, paramIntent2, 203);
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(0);
    localm.execute(arrayOfInteger);
  }

  public static String b(Context paramContext, Intent paramIntent, String paramString)
  {
    Object localObject = null;
    if ((paramContext == null) || (paramIntent == null) || (paramString == null))
      z.e("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "resolvePhotoFromIntent fail, invalid argument");
    Cursor localCursor;
    while (true)
    {
      return localObject;
      Uri localUri = Uri.parse(paramIntent.toURI());
      localCursor = paramContext.getContentResolver().query(localUri, null, null, null, null);
      if ((localCursor != null) && (localCursor.getCount() > 0))
        try
        {
          boolean bool2 = localUri.toString().startsWith("content://com.google.android.gallery3d");
          localObject = null;
          if (bool2)
          {
            String str2 = t(paramString, i.e(paramIntent.getData()));
            localObject = str2;
          }
          label97: 
          while (localCursor != null)
          {
            localCursor.close();
            return localObject;
            localCursor.moveToFirst();
            localObject = localCursor.getString(localCursor.getColumnIndex("_data"));
            z.d("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "photo from resolver, path:" + (String)localObject);
          }
        }
        catch (Exception localException)
        {
          break label97;
        }
    }
    String str1;
    if (paramIntent.getData() != null)
    {
      str1 = paramIntent.getData().getPath();
      boolean bool1 = new File(str1).exists();
      localObject = null;
      if (bool1)
        break label286;
    }
    while (true)
    {
      z.d("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "photo file from data, path:" + (String)localObject);
      break;
      if ((paramIntent.getAction() != null) && (paramIntent.getAction().equals("inline-data")))
      {
        localObject = t(paramString, (Bitmap)paramIntent.getExtras().get("data"));
        break;
      }
      if (localCursor != null)
        localCursor.close();
      z.e("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "resolve photo from intent failed");
      return null;
      label286: localObject = str1;
    }
  }

  public static void b(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt)
  {
    if ((paramIntent1 == null) || (paramIntent1.getData() == null));
    String str;
    do
    {
      return;
      if (paramIntent1.getData().toString().startsWith("content://com.google.android.gallery3d"))
        break;
      str = b(paramActivity, paramIntent1, paramString);
    }
    while (ch.jb(str));
    paramIntent2.putExtra("CropImage_ImgPath", str);
    paramActivity.startActivityForResult(paramIntent2, paramInt);
    return;
    o localo = new o(paramIntent1, paramActivity, paramString, null, paramIntent2, paramInt);
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(0);
    localo.execute(arrayOfInteger);
  }

  public static String t(String paramString, Bitmap paramBitmap)
  {
    try
    {
      String str1 = f.d(DateFormat.format("yyyy-MM-dd-HH-mm-ss", System.currentTimeMillis()).toString().getBytes()) + ".jpg";
      String str2 = paramString + str1;
      File localFile = new File(str2);
      if (!localFile.exists())
        localFile.createNewFile();
      BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(localFile));
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localBufferedOutputStream);
      localBufferedOutputStream.close();
      z.d("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "photo image from data, path:" + str2);
      return str2;
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.l
 * JD-Core Version:    0.6.2
 */