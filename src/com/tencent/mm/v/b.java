package com.tencent.mm.v;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;
import java.util.ArrayList;
import java.util.List;

public final class b extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS getcontactinfov2 ( username text  PRIMARY KEY , inserttime long  , type int  , lastgettime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
  private h dmb;

  public b(h paramh)
  {
    this.dmb = paramh;
  }

  public final boolean a(a parama)
  {
    parama.rF();
    ContentValues localContentValues = parama.ir();
    if ((int)this.dmb.replace("getcontactinfov2", "username", localContentValues) != -1)
    {
      Ba(parama.getUsername());
      return true;
    }
    return false;
  }

  public final List ae(long paramLong)
  {
    int i = 0;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = String.valueOf(paramLong);
    arrayOfString[1] = "80";
    Cursor localCursor = this.dmb.rawQuery("select getcontactinfov2.username,getcontactinfov2.inserttime,getcontactinfov2.type,getcontactinfov2.lastgettime,getcontactinfov2.reserved1,getcontactinfov2.reserved2,getcontactinfov2.reserved3,getcontactinfov2.reserved4 from getcontactinfov2 where inserttime> ?  order by inserttime asc limit ?", arrayOfString);
    if (localCursor == null)
      return null;
    int j = localCursor.getCount();
    if (j <= 0)
    {
      localCursor.close();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    while (i < j)
    {
      localCursor.moveToPosition(i);
      a locala = new a();
      locala.b(localCursor);
      localArrayList.add(locala);
      i++;
    }
    localCursor.close();
    return localArrayList;
  }

  public final boolean gI(String paramString)
  {
    if (this.dmb.delete("getcontactinfov2", "username= ?", new String[] { paramString }) > 0)
    {
      Ba(paramString);
      return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.b
 * JD-Core Version:    0.6.2
 */