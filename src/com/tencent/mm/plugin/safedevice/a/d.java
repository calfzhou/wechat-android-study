package com.tencent.mm.plugin.safedevice.a;

import android.database.Cursor;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d extends ah
{
  public static final String[] dmc = arrayOfString;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(c.dhu, "SafeDeviceInfo");
  }

  public d(af paramaf)
  {
    super(paramaf, c.dhu, "SafeDeviceInfo", null);
  }

  public final boolean a(c paramc)
  {
    return super.b(paramc);
  }

  public final List afh()
  {
    LinkedList localLinkedList = new LinkedList();
    if (getCount() > 0)
    {
      Cursor localCursor = super.yF();
      while (localCursor.moveToNext())
      {
        c localc = new c();
        localc.b(localCursor);
        localLinkedList.add(localc);
      }
      localCursor.close();
    }
    return localLinkedList;
  }

  public final void afi()
  {
    List localList = afh();
    if (localList.size() > 0)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
        b((c)localIterator.next(), new String[0]);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.a.d
 * JD-Core Version:    0.6.2
 */