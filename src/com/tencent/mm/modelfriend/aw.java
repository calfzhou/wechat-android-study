package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

public final class aw extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS qqgroup ( grouopid int PRIMARY KEY,membernum int,weixinnum int,insert_time int,lastupdate_time int,needupdate int,updatekey text,groupname text,reserved1 text ,reserved2 text ,reserved3 int ,reserved4 int )" };
  private final h dmb;

  public aw(h paramh)
  {
    this.dmb = paramh;
  }

  public final boolean a(av paramav)
  {
    if (paramav == null);
    ContentValues localContentValues;
    do
    {
      return false;
      z.d("!32@/B4Tb64lLpJ+zgjqUamJQfLmk15RM/5N", "insert: name:" + paramav.wM());
      paramav.db(-1);
      localContentValues = paramav.wG();
    }
    while ((int)this.dmb.insert("qqgroup", "grouopid", localContentValues) < 0);
    Bo();
    return true;
  }

  public final boolean b(av paramav)
  {
    boolean bool;
    ContentValues localContentValues;
    if (paramav != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localContentValues = paramav.wG();
      if (localContentValues.size() > 0)
        break label36;
      z.e("!32@/B4Tb64lLpJ+zgjqUamJQfLmk15RM/5N", "update failed, no values set");
    }
    label36: h localh;
    String[] arrayOfString;
    do
    {
      return false;
      bool = false;
      break;
      localh = this.dmb;
      arrayOfString = new String[1];
      arrayOfString[0] = paramav.wH();
    }
    while (localh.update("qqgroup", localContentValues, "grouopid= ?", arrayOfString) <= 0);
    Bo();
    return true;
  }

  public final av dH(int paramInt)
  {
    Cursor localCursor = this.dmb.rawQuery("select qqgroup.grouopid,qqgroup.membernum,qqgroup.weixinnum,qqgroup.insert_time,qqgroup.lastupdate_time,qqgroup.needupdate,qqgroup.updatekey,qqgroup.groupname from qqgroup  where grouopid = " + paramInt, null);
    if (localCursor == null)
      return null;
    boolean bool = localCursor.moveToFirst();
    av localav = null;
    if (bool)
    {
      localav = new av();
      localav.b(localCursor);
    }
    localCursor.close();
    return localav;
  }

  public final boolean dI(int paramInt)
  {
    z.d("!32@/B4Tb64lLpJ+zgjqUamJQfLmk15RM/5N", "delete: id:" + paramInt);
    h localh = this.dmb;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramInt);
    if (localh.delete("qqgroup", "grouopid= ?", arrayOfString) > 0)
    {
      Bo();
      return true;
    }
    return false;
  }

  public final Cursor wN()
  {
    return this.dmb.rawQuery("select qqgroup.grouopid,qqgroup.membernum,qqgroup.weixinnum,qqgroup.insert_time,qqgroup.lastupdate_time,qqgroup.needupdate,qqgroup.updatekey,qqgroup.groupname from qqgroup ", null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.aw
 * JD-Core Version:    0.6.2
 */