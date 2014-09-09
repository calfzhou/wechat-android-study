package com.tencent.mm.ui.voicesearch;

import android.database.Cursor;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.o;
import java.util.ArrayList;
import java.util.List;

final class s
  implements Runnable
{
  s(j paramj)
  {
  }

  public final void run()
  {
    int i = 0;
    if ((j.g(this.jZD) != null) && (j.g(this.jZD).length != 0))
    {
      ArrayList localArrayList3 = new ArrayList();
      String[] arrayOfString = j.g(this.jZD);
      int j = arrayOfString.length;
      while (i < j)
      {
        String str2 = arrayOfString[i];
        if (this.jZD.Dz(str2))
          localArrayList3.add(str2);
        i++;
      }
      if (localArrayList3.size() > 0)
      {
        j.a(this.jZD, bg.qW().oT().a((String[])localArrayList3.toArray(new String[localArrayList3.size()]), j.h(this.jZD), j.a(this.jZD)));
        return;
      }
      j.b(this.jZD, bg.qW().oT().aIA());
      return;
    }
    if (j.i(this.jZD) != null)
    {
      if (!j.h(this.jZD).equals("@all.chatroom.contact"))
      {
        Cursor localCursor3 = bg.qW().oT().a(j.i(this.jZD), j.h(this.jZD), null, j.a(this.jZD), true);
        j.c(this.jZD, localCursor3);
        return;
      }
      Cursor localCursor1 = bg.qW().oT().a(j.i(this.jZD), "@micromsg.with.all.biz.qq.com", null, j.a(this.jZD), false);
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      while (localCursor1.moveToNext())
      {
        String str1 = localCursor1.getString(localCursor1.getColumnIndex("username"));
        if (!str1.endsWith("@chatroom"))
          localArrayList1.add(str1);
        else
          localArrayList2.add(str1);
      }
      if (!localCursor1.isClosed())
        localCursor1.close();
      if ((localArrayList1.size() != 0) || (localArrayList2.size() != 0));
      for (Cursor localCursor2 = bg.qW().oT().a(j.i(this.jZD), localArrayList1, null, localArrayList2, j.a(this.jZD)); ; localCursor2 = bg.qW().oT().aIA())
      {
        j.d(this.jZD, localCursor2);
        return;
      }
    }
    j.e(this.jZD, bg.qW().oT().aIA());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.s
 * JD-Core Version:    0.6.2
 */