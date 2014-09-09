package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.z;

public final class ao extends ah
{
  public static final String[] dmc = arrayOfString;

  static
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = ah.a(an.dhu, "FileDownloadInfo");
    arrayOfString[1] = "CREATE INDEX IF NOT EXISTS filedownloadinfo_downloadkey  on FileDownloadInfo  (  downloadKey )";
    arrayOfString[2] = "CREATE INDEX IF NOT EXISTS filedownloadinfo_status  on FileDownloadInfo  (  status )";
  }

  public ao(af paramaf)
  {
    super(paramaf, an.dhu, "FileDownloadInfo", null);
  }

  public final an cx(long paramLong)
  {
    an localan = null;
    if (paramLong < 0L)
      z.e("!56@/B4Tb64lLpKVQlIh1YRBX94HnKLHqasj4QVB2Lzhv8UbwRqK+FziQw==", "download id is not avaiable");
    Cursor localCursor;
    do
    {
      do
      {
        return localan;
        localCursor = rawQuery("select * from FileDownloadInfo where downloadId=" + paramLong + " LIMIT 1", new String[0]);
        localan = null;
      }
      while (localCursor == null);
      boolean bool = localCursor.moveToFirst();
      localan = null;
      if (bool)
      {
        localan = new an();
        localan.b(localCursor);
      }
    }
    while (localCursor == null);
    localCursor.close();
    return localan;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ao
 * JD-Core Version:    0.6.2
 */