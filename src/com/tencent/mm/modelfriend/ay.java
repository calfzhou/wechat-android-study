package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.platformtools.z;

public final class ay extends ap
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS qqlist ( qq long  PRIMARY KEY , wexinstatus int  , groupid int  , username text  , nickname text  , pyinitial text  , quanpin text  , qqnickname text  , qqpyinitial text  , qqquanpin text  , qqremark text  , qqremarkpyinitial text  , qqremarkquanpin text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE INDEX IF NOT EXISTS groupid_index ON qqlist ( groupid ) ", "CREATE INDEX IF NOT EXISTS qq_index ON qqlist ( qq ) " };
  private final h dmb;

  public ay(h paramh)
  {
    this.dmb = paramh;
  }

  public final ax K(long paramLong)
  {
    String str = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.qq = \"" + paramLong + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
      return null;
    boolean bool = localCursor.moveToFirst();
    ax localax = null;
    if (bool)
    {
      localax = new ax();
      localax.b(localCursor);
    }
    localCursor.close();
    return localax;
  }

  public final boolean L(long paramLong)
  {
    z.d("!32@/B4Tb64lLpLDqTvM25JsITvy8IO+07dZ", "delete: QQ:" + paramLong);
    h localh = this.dmb;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    if (localh.delete("qqlist", "qq= ?", arrayOfString) > 0)
    {
      b(5, this, String.valueOf(paramLong));
      return true;
    }
    return false;
  }

  public final int a(long paramLong, ax paramax)
  {
    ContentValues localContentValues = paramax.wO();
    int i = localContentValues.size();
    int j = 0;
    if (i > 0)
    {
      h localh = this.dmb;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(paramLong);
      j = localh.update("qqlist", localContentValues, "qq=?", arrayOfString);
    }
    if (j > 0)
      b(3, this, String.valueOf(paramLong));
    return j;
  }

  public final boolean b(ax paramax)
  {
    if (paramax == null);
    ContentValues localContentValues;
    do
    {
      return false;
      z.d("!32@/B4Tb64lLpLDqTvM25JsITvy8IO+07dZ", "insert: name:" + paramax.wR());
      paramax.rF();
      localContentValues = paramax.wO();
    }
    while ((int)this.dmb.insert("qqlist", "qq", localContentValues) == -1);
    b(2, this, paramax.wP());
    return true;
  }

  public final boolean dL(int paramInt)
  {
    z.d("!32@/B4Tb64lLpLDqTvM25JsITvy8IO+07dZ", "delete: GroupID:" + paramInt);
    h localh = this.dmb;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramInt);
    return localh.delete("qqlist", "groupid= ?", arrayOfString) > 0;
  }

  public final Cursor dM(int paramInt)
  {
    z.d("!32@/B4Tb64lLpLDqTvM25JsITvy8IO+07dZ", "getByGroupID: GroupID:" + paramInt);
    String str = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt + "\"";
    return this.dmb.rawQuery(str, null);
  }

  public final Cursor dN(int paramInt)
  {
    z.d("!32@/B4Tb64lLpLDqTvM25JsITvy8IO+07dZ", "getByGroupID: GroupID:" + paramInt);
    String str = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt + "\" order by  case when wexinstatus = 1 then 0  when wexinstatus = 65536 then 1  when wexinstatus = 2 then 2 else 3 end ";
    return this.dmb.rawQuery(str, null);
  }

  public final ax gH(String paramString)
  {
    String str = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.username = \"" + paramString + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
      return null;
    boolean bool = localCursor.moveToFirst();
    ax localax = null;
    if (bool)
    {
      localax = new ax();
      localax.b(localCursor);
    }
    localCursor.close();
    return localax;
  }

  public final Cursor i(int paramInt, String paramString)
  {
    z.d("!32@/B4Tb64lLpLDqTvM25JsITvy8IO+07dZ", "getByGroupID: GroupID:" + paramInt + ", searchby:" + paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt + "\" and ( ");
    localStringBuilder.append("qqlist.qq like '%" + paramString + "%' or ");
    localStringBuilder.append("qqlist.username like '%" + paramString + "%' or ");
    localStringBuilder.append("qqlist.nickname like '%" + paramString + "%' or ");
    localStringBuilder.append("qqlist.pyinitial like '%" + paramString + "%' or ");
    localStringBuilder.append("qqlist.quanpin like '%" + paramString + "%' or ");
    localStringBuilder.append("qqlist.qqnickname like '%" + paramString + "%' or ");
    localStringBuilder.append("qqlist.qqpyinitial like '%" + paramString + "%' or ");
    localStringBuilder.append("qqlist.qqquanpin like '%" + paramString + "%' or ");
    localStringBuilder.append("qqlist.qqremark like '%" + paramString + "%' )");
    localStringBuilder.append(" order by  case when wexinstatus = 1 then 0  when wexinstatus = 65536 then 1  when wexinstatus = 2 then 2 else 3 end ");
    return this.dmb.rawQuery(localStringBuilder.toString(), null);
  }

  protected final boolean vQ()
  {
    boolean bool = true;
    Object[] arrayOfObject;
    if ((this.dmb == null) || (this.dmb.aHQ()))
    {
      arrayOfObject = new Object[bool];
      if (this.dmb != null)
        break label50;
    }
    label50: for (Object localObject = "null"; ; localObject = Boolean.valueOf(this.dmb.aHQ()))
    {
      arrayOfObject[0] = localObject;
      z.w("!32@/B4Tb64lLpLDqTvM25JsITvy8IO+07dZ", "shouldProcessEvent db is close :%s", arrayOfObject);
      bool = false;
      return bool;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ay
 * JD-Core Version:    0.6.2
 */