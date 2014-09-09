package com.tencent.mm.pluginsdk.ui.chat;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Images.Thumbnails;
import com.tencent.mm.a.c;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;

final class aw
{
  private ContentResolver dCe;
  protected Context mContext;

  protected aw(Context paramContext)
  {
    this.mContext = paramContext;
    this.dCe = this.mContext.getContentResolver();
  }

  private String vI(String paramString)
  {
    if (ch.jb(paramString))
    {
      z.e("!56@/B4Tb64lLpLZHVZfQnz6xEg7TjdBcGb0TQan+WtNeTNISqsLdE8nBQ==", "null or nill imageId");
      return null;
    }
    String str1 = "image_id=\"" + paramString + "\"";
    Cursor localCursor;
    try
    {
      localCursor = this.dCe.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, null, str1, null, null);
      if (localCursor == null)
      {
        z.e("!56@/B4Tb64lLpLZHVZfQnz6xEg7TjdBcGb0TQan+WtNeTNISqsLdE8nBQ==", "get cursor null:" + paramString);
        return null;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.toString();
      z.e("!56@/B4Tb64lLpLZHVZfQnz6xEg7TjdBcGb0TQan+WtNeTNISqsLdE8nBQ==", "query thumb exception e : %s", arrayOfObject);
      return null;
    }
    String str2;
    if (localCursor.moveToFirst())
      do
        str2 = localCursor.getString(localCursor.getColumnIndexOrThrow("_data"));
      while (localCursor.moveToNext());
    while (true)
    {
      localCursor.close();
      return str2;
      str2 = null;
    }
  }

  public final ArrayList aCG()
  {
    ArrayList localArrayList = new ArrayList();
    String str1 = "date_added desc limit 1";
    String[] arrayOfString = { "_id", "_data", "date_added" };
    ch.CM();
    Cursor localCursor;
    try
    {
      localCursor = this.dCe.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, arrayOfString, null, null, str1);
      if (localCursor == null)
        return localArrayList;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.toString();
      z.e("!56@/B4Tb64lLpLZHVZfQnz6xEg7TjdBcGb0TQan+WtNeTNISqsLdE8nBQ==", "query photo exception e : %s", arrayOfObject);
      return null;
    }
    if (localCursor.moveToFirst());
    while (true)
    {
      String str2 = localCursor.getString(localCursor.getColumnIndexOrThrow("_id"));
      String str3 = localCursor.getString(localCursor.getColumnIndexOrThrow("_data"));
      String str4 = localCursor.getString(localCursor.getColumnIndexOrThrow("date_added"));
      String str5 = vI(str2);
      if ((ch.jb(str3)) || (!c.ac(str3)))
        z.e("!56@/B4Tb64lLpLZHVZfQnz6xEg7TjdBcGb0TQan+WtNeTNISqsLdE8nBQ==", "file not exist");
      while (!localCursor.moveToNext())
      {
        localCursor.close();
        return localArrayList;
        if (str3.startsWith(h.dOL))
        {
          z.i("!56@/B4Tb64lLpLZHVZfQnz6xEg7TjdBcGb0TQan+WtNeTNISqsLdE8nBQ==", "exclude weixin path image");
        }
        else
        {
          av localav = new av();
          localav.hEg = Long.parseLong(str2);
          localav.eVN = Long.parseLong(str4);
          if ((!ch.jb(str5)) && (c.ac(str5)))
            localav.cEF = str5;
          if ((!ch.jb(str3)) && (c.ac(str3)))
            localav.hEh = str3;
          if ((ch.jb(localav.hEh)) && (ch.jb(localav.hEh)))
            z.e("!56@/B4Tb64lLpLZHVZfQnz6xEg7TjdBcGb0TQan+WtNeTNISqsLdE8nBQ==", "thumb file and orignal file both not exist");
          else
            localArrayList.add(localav);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.aw
 * JD-Core Version:    0.6.2
 */