package com.tencent.mm.n;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.ch;

public final class w extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS hdheadimginfo ( username text  PRIMARY KEY , imgwidth int  , imgheigth int  , imgformat text  , totallen int  , startpos int  , headimgtype int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
  private h dmb;

  public w(h paramh)
  {
    this.dmb = paramh;
  }

  public final int a(String paramString, v paramv)
  {
    ContentValues localContentValues = paramv.ir();
    return this.dmb.update("hdheadimginfo", localContentValues, "username=?", new String[] { paramString });
  }

  public final boolean a(v paramv)
  {
    paramv.rF();
    ContentValues localContentValues = paramv.ir();
    return (int)this.dmb.insert("hdheadimginfo", "username", localContentValues) != -1;
  }

  public final v fd(String paramString)
  {
    String str = "select hdheadimginfo.username,hdheadimginfo.imgwidth,hdheadimginfo.imgheigth,hdheadimginfo.imgformat,hdheadimginfo.totallen,hdheadimginfo.startpos,hdheadimginfo.headimgtype,hdheadimginfo.reserved1,hdheadimginfo.reserved2,hdheadimginfo.reserved3,hdheadimginfo.reserved4 from hdheadimginfo   where hdheadimginfo.username = \"" + ch.iV(paramString) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
      return null;
    boolean bool = localCursor.moveToFirst();
    v localv = null;
    if (bool)
    {
      localv = new v();
      localv.b(localCursor);
    }
    localCursor.close();
    return localv;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.w
 * JD-Core Version:    0.6.2
 */