package com.tencent.mm.ad;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.ch;
import junit.framework.Assert;

public final class b extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS chattingbginfo ( username text  PRIMARY KEY , bgflag int  , path text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
  private h dmb;

  public b(h paramh)
  {
    this.dmb = paramh;
  }

  public final boolean a(a parama)
  {
    parama.rF();
    ContentValues localContentValues = parama.ir();
    if ((int)this.dmb.insert("chattingbginfo", "username", localContentValues) != -1)
    {
      Ba(parama.getUsername());
      return true;
    }
    return false;
  }

  public final boolean b(a parama)
  {
    if (parama != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ContentValues localContentValues = parama.ir();
      if (localContentValues.size() <= 0)
        break;
      h localh = this.dmb;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = parama.getUsername();
      if (localh.update("chattingbginfo", localContentValues, "username= ?", arrayOfString) <= 0)
        break;
      Ba(parama.getUsername());
      return true;
    }
    return false;
  }

  public final a ha(String paramString)
  {
    String str = "select chattingbginfo.username,chattingbginfo.bgflag,chattingbginfo.path,chattingbginfo.reserved1,chattingbginfo.reserved2,chattingbginfo.reserved3,chattingbginfo.reserved4 from chattingbginfo   where chattingbginfo.username = \"" + ch.iV(paramString) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
      return null;
    boolean bool = localCursor.moveToFirst();
    a locala = null;
    if (bool)
    {
      locala = new a();
      locala.b(localCursor);
    }
    localCursor.close();
    return locala;
  }

  public final boolean vT()
  {
    int i = this.dmb.delete("chattingbginfo", null, null);
    if (i > 0)
      Bo();
    return i > 0;
  }

  public final Cursor yF()
  {
    return this.dmb.rawQuery("select chattingbginfo.username,chattingbginfo.bgflag,chattingbginfo.path,chattingbginfo.reserved1,chattingbginfo.reserved2,chattingbginfo.reserved3,chattingbginfo.reserved4 from chattingbginfo  ", null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.b
 * JD-Core Version:    0.6.2
 */