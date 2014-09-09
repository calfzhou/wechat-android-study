package com.tencent.mm.s;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.al;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b extends al
{
  public final boolean cG(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 620757033);
  }

  public final String getTag()
  {
    return "!64@/B4Tb64lLpJAUoyR9+C90MMU43lT9KAqJwf4F+scGXAfjuF7uSzMHMZUMVy1zvD2";
  }

  public final void transfer(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!64@/B4Tb64lLpJAUoyR9+C90MMU43lT9KAqJwf4F+scGXAfjuF7uSzMHMZUMVy1zvD2", "the previous version is %d", arrayOfObject);
    if ((paramInt != 0) && (paramInt < 620757033))
    {
      LinkedList localLinkedList = new LinkedList();
      Cursor localCursor = bg.qW().oT().d("@black.android", "", null);
      if (localCursor != null)
      {
        localCursor.moveToFirst();
        while (!localCursor.isAfterLast())
        {
          i locali = new i();
          locali.b(localCursor);
          localLinkedList.add(locali.getUsername());
          localCursor.moveToNext();
        }
        localCursor.close();
      }
      if (localLinkedList.size() > 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Update rconversation");
        localStringBuilder.append(" set parentRef = '@blacklist").append("' where 1 != 1 ");
        Iterator localIterator = localLinkedList.iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          localStringBuilder.append(" or username = '").append(str2).append("'");
        }
        String str1 = localStringBuilder.toString();
        z.d("!64@/B4Tb64lLpJAUoyR9+C90MMU43lT9KAqJwf4F+scGXAfjuF7uSzMHMZUMVy1zvD2", "update sql: %s", new Object[] { str1 });
        bg.qW().oO().bp("rconversation", str1);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.s.b
 * JD-Core Version:    0.6.2
 */