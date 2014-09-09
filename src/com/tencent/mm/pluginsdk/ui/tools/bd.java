package com.tencent.mm.pluginsdk.ui.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public final class bd
{
  public Context context;
  public String filePath;
  public int hMx = 0;
  public Uri uri;

  public bd(Context paramContext, Uri paramUri)
  {
    this.context = paramContext;
    this.uri = paramUri;
    if (paramUri == null)
    {
      z.e("!32@/B4Tb64lLpK2EJJwsKvUAXxao2NOZxz+", "initFileTypeAndPath uri == null");
      return;
    }
    if (this.context == null)
    {
      z.e("!32@/B4Tb64lLpK2EJJwsKvUAXxao2NOZxz+", "initFileTypeAndPath context == null");
      return;
    }
    MimeTypeMap localMimeTypeMap = MimeTypeMap.getSingleton();
    String str2 = this.context.getContentResolver().getType(paramUri);
    String str3;
    if ((str2 == null) || (str2.length() <= 0))
    {
      if (paramUri.getPath() != null)
      {
        File localFile = new File(paramUri.getPath());
        if (!localFile.exists())
        {
          z.e("!32@/B4Tb64lLpK2EJJwsKvUAXxao2NOZxz+", "File is null");
          this.hMx = 0;
          return;
        }
        this.filePath = localFile.getAbsolutePath();
        int i = this.filePath.lastIndexOf(".");
        if ((i == -1) || (i >= -1 + this.filePath.length()))
          this.hMx = 1;
        for (str3 = str2; (str3 == null) || (this.filePath == null); str3 = localMimeTypeMap.getMimeTypeFromExtension(this.filePath.substring(i + 1)))
        {
          this.hMx = 0;
          return;
        }
      }
    }
    else
    {
      if (this.context != null)
        break label234;
      z.e("!32@/B4Tb64lLpK2EJJwsKvUAXxao2NOZxz+", "getFilePath context == null");
    }
    while (true)
    {
      this.filePath = str1;
      str3 = str2;
      break;
      label234: Cursor localCursor = this.context.getContentResolver().query(paramUri, null, null, null, null);
      if (localCursor == null)
      {
        z.e("!32@/B4Tb64lLpK2EJJwsKvUAXxao2NOZxz+", "getFilePath : fail, cursor is null");
        str1 = null;
      }
      else if ((localCursor.getCount() <= 0) || (!localCursor.moveToFirst()))
      {
        localCursor.close();
        z.e("!32@/B4Tb64lLpK2EJJwsKvUAXxao2NOZxz+", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
        str1 = null;
      }
      else
      {
        int j = localCursor.getColumnIndex("_data");
        if (j == -1)
        {
          localCursor.close();
          z.e("!32@/B4Tb64lLpK2EJJwsKvUAXxao2NOZxz+", "getFilePath : columnIdx is -1, column with columnName = _data does not exist");
          str1 = null;
        }
        else
        {
          str1 = localCursor.getString(j);
          localCursor.close();
        }
      }
    }
    if (str3.contains("image"))
      this.hMx = 3;
    while (true)
    {
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = str3;
      arrayOfObject[1] = this.filePath;
      arrayOfObject[2] = Integer.valueOf(this.hMx);
      arrayOfObject[3] = str3;
      arrayOfObject[4] = paramUri.toString();
      z.d("!32@/B4Tb64lLpK2EJJwsKvUAXxao2NOZxz+", "MimeType[%s], filePath = [%s], fileType = [%s], type = [%s], Uri[%s]", arrayOfObject);
      return;
      if (str3.contains("video"))
        this.hMx = 4;
      else if (str3.contains("audio"))
        this.hMx = 5;
      else if (str3.contains("mm_item"))
        this.hMx = 2;
      else
        this.hMx = 1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.bd
 * JD-Core Version:    0.6.2
 */