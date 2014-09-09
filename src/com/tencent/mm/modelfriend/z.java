package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cs;
import java.util.List;

public final class z extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS friend_ext ( username text  PRIMARY KEY , sex int  , personalcard int  , province text  , city text  , signature text  , reserved1 text  , reserved2 text  , reserved3 text  , reserved4 text  , reserved5 int  , reserved6 int  , reserved7 int  , reserved8 int  ) " };
  private h dmb;

  public z(h paramh)
  {
    this.dmb = paramh;
  }

  public final boolean a(y paramy)
  {
    boolean bool1 = true;
    String str1 = paramy.getUsername();
    String str2 = "select friend_ext.username,friend_ext.sex,friend_ext.personalcard,friend_ext.province,friend_ext.city,friend_ext.signature from friend_ext   where friend_ext.username = \"" + ch.iV(str1) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str2, null);
    boolean bool2;
    ContentValues localContentValues2;
    h localh;
    String[] arrayOfString;
    if (localCursor.getCount() > 0)
    {
      bool2 = bool1;
      localCursor.close();
      if (!bool2)
        break label143;
      if (paramy == null)
        break label138;
      localContentValues2 = paramy.ir();
      if (localContentValues2.size() <= 0)
        break label180;
      localh = this.dmb;
      arrayOfString = new String[bool1];
      arrayOfString[0] = "username";
    }
    label138: label143: label180: for (int i = localh.update("friend_ext", localContentValues2, "username=?", arrayOfString); ; i = 0)
    {
      if (i > 0);
      while (true)
      {
        Bo();
        return bool1;
        bool2 = false;
        break;
        bool1 = false;
        continue;
        if (paramy != null)
        {
          paramy.rF();
          ContentValues localContentValues1 = paramy.ir();
          if ((int)this.dmb.insert("friend_ext", "username", localContentValues1) != -1);
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }

  public final boolean g(List paramList)
  {
    if (paramList.size() <= 0)
      return false;
    cs localcs = new cs("!44@/B4Tb64lLpLakB5kto6z7ZqDoGWblGk+4pheC3MTT7Q=", "batchSetFriendExt transaction");
    localcs.addSplit("transation begin");
    long l = this.dmb.dc(Thread.currentThread().getId());
    int i = 0;
    try
    {
      while (i < paramList.size())
      {
        y localy = (y)paramList.get(i);
        if (localy != null)
          a(localy);
        i++;
      }
      bool = true;
      this.dmb.dd(l);
      localcs.addSplit("transation end");
      localcs.dumpToLog();
      Bo();
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLakB5kto6z7ZqDoGWblGk+4pheC3MTT7Q=", localException.getMessage());
        boolean bool = false;
      }
    }
  }

  public final y gv(String paramString)
  {
    String str = "select friend_ext.username,friend_ext.sex,friend_ext.personalcard,friend_ext.province,friend_ext.city,friend_ext.signature from friend_ext   where friend_ext.username = \"" + ch.iV(paramString) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
      return null;
    boolean bool = localCursor.moveToFirst();
    y localy = null;
    if (bool)
    {
      localy = new y();
      localy.b(localCursor);
    }
    localCursor.close();
    return localy;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.z
 * JD-Core Version:    0.6.2
 */