package com.tencent.mm.s;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.al;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.e;
import com.tencent.mm.q.m;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a extends al
{
  public final boolean cG(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 604372991);
  }

  public final String getTag()
  {
    return "!56@/B4Tb64lLpL9pXWJM+9GqX3fd4FF3yK+sRnAHO+TcmmrixzJI4AV6A==";
  }

  public final void transfer(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!56@/B4Tb64lLpL9pXWJM+9GqX3fd4FF3yK+sRnAHO+TcmmrixzJI4AV6A==", "the previous version is %d", arrayOfObject);
    if ((paramInt != 0) && (paramInt < 604372991))
    {
      h localh = bg.qW().oO();
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("select BizInfo.username").append(", BizInfo.extInfo");
      localStringBuilder1.append(" from rcontact , BizInfo");
      localStringBuilder1.append(" where rcontact.username").append(" = BizInfo.username");
      localStringBuilder1.append(" and (rcontact.type").append(" & 1 ) != 0 ");
      localStringBuilder1.append(" and ( rcontact.verifyFlag").append(" & 8 ) != 0 ");
      String str1 = localStringBuilder1.toString();
      LinkedList localLinkedList = new LinkedList();
      z.d("!56@/B4Tb64lLpL9pXWJM+9GqX3fd4FF3yK+sRnAHO+TcmmrixzJI4AV6A==", "sql %s", new Object[] { str1 });
      Cursor localCursor = localh.rawQuery(localStringBuilder1.toString(), null);
      if (localCursor != null)
      {
        localCursor.moveToFirst();
        while (!localCursor.isAfterLast())
        {
          com.tencent.mm.q.a locala = new com.tencent.mm.q.a();
          locala.b(localCursor);
          if (locala.tY().uz() == 1)
            localLinkedList.add(locala.field_username);
          localCursor.moveToNext();
        }
        localCursor.close();
      }
      if (localLinkedList.size() > 0)
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("Update BizInfo set type").append(" = 1 where 1 !=1 ");
        Iterator localIterator = localLinkedList.iterator();
        while (localIterator.hasNext())
        {
          String str3 = (String)localIterator.next();
          localStringBuilder2.append(" or username = '").append(str3).append("'");
        }
        String str2 = localStringBuilder2.toString();
        z.d("!56@/B4Tb64lLpL9pXWJM+9GqX3fd4FF3yK+sRnAHO+TcmmrixzJI4AV6A==", "update sql %s", new Object[] { str2 });
        aa.uY().bp("BizInfo", str2);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.s.a
 * JD-Core Version:    0.6.2
 */