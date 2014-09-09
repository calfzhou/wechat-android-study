package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.ch;

public final class ah extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS invitefriendopen ( username text  PRIMARY KEY , friendtype int  , updatetime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
  private h dmb;

  public ah(h paramh)
  {
    this.dmb = paramh;
  }

  public final boolean a(ag paramag)
  {
    if (gy(paramag.getUsername()))
    {
      paramag.rF();
      ContentValues localContentValues2 = paramag.ir();
      h localh = this.dmb;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = paramag.getUsername();
      if (localh.update("invitefriendopen", localContentValues2, "username=?", arrayOfString) <= 0);
    }
    ContentValues localContentValues1;
    do
    {
      return true;
      return false;
      paramag.rF();
      localContentValues1 = paramag.ir();
    }
    while ((int)this.dmb.insert("invitefriendopen", "username", localContentValues1) != -1);
    return false;
  }

  public final boolean gy(String paramString)
  {
    String str = "select invitefriendopen.username,invitefriendopen.friendtype,invitefriendopen.updatetime,invitefriendopen.reserved1,invitefriendopen.reserved2,invitefriendopen.reserved3,invitefriendopen.reserved4 from invitefriendopen   where invitefriendopen.username = \"" + ch.iV(paramString) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor.getCount() > 0);
    for (boolean bool = true; ; bool = false)
    {
      localCursor.close();
      return bool;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ah
 * JD-Core Version:    0.6.2
 */