package com.tencent.mm.ui.contact;

import android.database.Cursor;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.m;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

final class ah
  implements Runnable
{
  ah(BizContactEntranceView paramBizContactEntranceView)
  {
  }

  public final void run()
  {
    long l1 = 0L;
    m localm = aa.uY();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select updateTime from BizInfo").append(" where type = 1");
    localStringBuilder.append(" and status = 1").append(" ORDER BY updateTime DESC");
    String str = localStringBuilder.toString();
    z.d("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "getLastNewBizUpdateTime, sql %s", new Object[] { str });
    Cursor localCursor = localm.rawQuery(str, new String[0]);
    if (localCursor == null);
    while (true)
    {
      long l2 = ch.aa(bg.qW().oQ().get(233473));
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Long.valueOf(l1);
      arrayOfObject[1] = Long.valueOf(l2);
      z.d("!44@/B4Tb64lLpJcZAIZpKXu2mTdFdAbI/Q60cydqQUhVTI=", "last updateTime %d, enterTime %d", arrayOfObject);
      am.h(new ai(this, l1, l2));
      return;
      if (!localCursor.moveToFirst())
      {
        localCursor.close();
      }
      else
      {
        l1 = localCursor.getLong(0);
        localCursor.close();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ah
 * JD-Core Version:    0.6.2
 */