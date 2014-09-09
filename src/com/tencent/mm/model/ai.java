package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ai
{
  public static void e(b paramb)
  {
    File localFile = new File(paramb.pt() + "chatstate.cfg");
    try
    {
      if (localFile.exists())
      {
        if (localFile.length() == 0L)
          return;
        FileInputStream localFileInputStream = new FileInputStream(localFile);
        ObjectInputStream localObjectInputStream = new ObjectInputStream(localFileInputStream);
        Map localMap = (Map)localObjectInputStream.readObject();
        localObjectInputStream.close();
        localFileInputStream.close();
        if ((localMap != null) && (localMap.size() > 0))
        {
          Iterator localIterator = localMap.keySet().iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            Integer localInteger = (Integer)localMap.get(str);
            if (localInteger != null)
            {
              r localr = paramb.oW().yE(str);
              if ((localr != null) && (str.equals(localr.getUsername())) && (localr.jJ() != localInteger.intValue()))
              {
                localr.bu(localInteger.intValue());
                paramb.oW().a(localr, str);
              }
            }
          }
          localFile.delete();
          return;
        }
      }
    }
    catch (Exception localException)
    {
    }
  }

  public static void f(b paramb)
  {
    Cursor localCursor = paramb.oT().aIs();
    if (localCursor.moveToFirst())
      do
      {
        i locali = new i();
        locali.b(localCursor);
        locali.uH();
        paramb.oT().a(locali.getUsername(), locali);
      }
      while (localCursor.moveToNext());
    localCursor.close();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ai
 * JD-Core Version:    0.6.2
 */