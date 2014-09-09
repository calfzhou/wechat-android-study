package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;

final class bx
  implements Runnable
{
  bx(String paramString, cd paramcd)
  {
  }

  public final void run()
  {
    Cursor localCursor = bg.qW().oV().zy(this.dlA);
    if (localCursor.moveToFirst())
      while ((!localCursor.isAfterLast()) && ((this.dlB == null) || (!this.dlB.rw())))
      {
        ar localar = new ar();
        localar.b(localCursor);
        bw.g(localar);
        localCursor.moveToNext();
      }
    localCursor.close();
    bg.qW().oV().zw(this.dlA);
    am.h(new by(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bx
 * JD-Core Version:    0.6.2
 */