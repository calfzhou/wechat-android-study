package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.util.Iterator;
import java.util.List;

final class cb
  implements Runnable
{
  cb(List paramList, cd paramcd)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.dlE.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Cursor localCursor = bg.qW().oV().zy(str);
      if (localCursor != null)
      {
        if (localCursor.moveToFirst())
          while ((!localCursor.isAfterLast()) && ((this.dlB == null) || (!this.dlB.rw())))
          {
            ar localar = new ar();
            localar.b(localCursor);
            bw.g(localar);
            localCursor.moveToNext();
          }
        localCursor.close();
        int i = bg.qW().oV().zw(str);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = str;
        arrayOfObject[1] = Integer.valueOf(i);
        z.v("!44@/B4Tb64lLpLj7S4izLo0fBMWNYO9d/rc0VQyi6V1H5o=", "delete msgs %s, %d", arrayOfObject);
      }
    }
    am.h(new cc(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cb
 * JD-Core Version:    0.6.2
 */