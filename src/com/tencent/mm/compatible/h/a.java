package com.tencent.mm.compatible.h;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Video.Media;
import android.provider.MediaStore.Video.Thumbnails;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public final class a
{
  @TargetApi(5)
  public static b a(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent == null) || (paramIntent.getData() == null));
    String str1;
    do
    {
      return null;
      str1 = paramIntent.getDataString();
      z.d("!44@/B4Tb64lLpIljRJFyiVofGMcDr+YD3NbUQ0G+tQqm38=", "dataString " + str1);
    }
    while (str1 == null);
    ContentResolver localContentResolver = paramContext.getContentResolver();
    b localb = new b();
    if (str1.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString()));
    label539: for (Cursor localCursor1 = localContentResolver.query(paramIntent.getData(), null, null, null, null); ; localCursor1 = null)
    {
      int i;
      if (localCursor1 != null)
        if (localCursor1.getCount() > 0)
        {
          localCursor1.moveToFirst();
          i = localCursor1.getInt(localCursor1.getColumnIndexOrThrow("_id"));
          localb.duration = localCursor1.getInt(localCursor1.getColumnIndexOrThrow("duration"));
          if (localb.filename == null)
            localb.filename = localCursor1.getString(localCursor1.getColumnIndexOrThrow("_data"));
          localb.bitmap = null;
          label181: localCursor1.close();
        }
      while (true)
      {
        while (true)
        {
          long l;
          if (i != 2147483647)
            l = i;
          try
          {
            localb.bitmap = MediaStore.Video.Thumbnails.getThumbnail(localContentResolver, l, 1, null);
            if (localb.filename == null)
              break;
            return localb;
            if (str1.startsWith("content://"))
            {
              Cursor localCursor2 = localContentResolver.query(paramIntent.getData(), null, null, null, null);
              localCursor2.moveToFirst();
              localb.filename = localCursor2.getString(localCursor2.getColumnIndexOrThrow("_data"));
              localCursor2.close();
              label283: if (localb.filename == null)
                break label539;
              if (!localb.filename.startsWith("/storage/emulated/legacy"))
                break label461;
              localb.filename = (m.getExternalStorageDirectory().getAbsolutePath() + localb.filename.substring(24));
            }
            while (true)
            {
              String str2 = "_data LIKE " + DatabaseUtils.sqlEscapeString(localb.filename);
              localCursor1 = localContentResolver.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, null, str2, null, null);
              break;
              if (!str1.startsWith("file://"))
                break label283;
              if (paramIntent.getExtras() != null)
              {
                Uri localUri = (Uri)paramIntent.getExtras().getParcelable("android.intent.extra.STREAM");
                if ((localUri != null) && (!ch.jb(localUri.getPath())))
                  localb.filename = localUri.getPath();
              }
              if (localb.filename != null)
                break label283;
              localb.filename = str1.substring(7);
              break label283;
              label461: if (localb.filename.startsWith("/sdcard"))
                localb.filename = (m.getExternalStorageDirectory().getAbsolutePath() + localb.filename.substring(7));
            }
          }
          catch (Exception localException)
          {
            while (true)
              localb.bitmap = null;
          }
        }
        i = 2147483647;
        break label181;
        i = 2147483647;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.h.a
 * JD-Core Version:    0.6.2
 */