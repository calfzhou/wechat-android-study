package com.tencent.mm.s;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.al;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

public final class c extends al
{
  public final boolean cG(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 604176383);
  }

  public final String getTag()
  {
    return "!44@/B4Tb64lLpLYLFA5RsXPaniyp/fJB2W9QOIAqIRHvJI=";
  }

  public final void transfer(int paramInt)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpLYLFA5RsXPaniyp/fJB2W9QOIAqIRHvJI=", "the previous version is %d", arrayOfObject1);
    if (!cG(paramInt))
    {
      z.w("!44@/B4Tb64lLpLYLFA5RsXPaniyp/fJB2W9QOIAqIRHvJI=", "do not need transfer");
      return;
    }
    long l = System.currentTimeMillis();
    if (ch.a((Integer)bg.qW().oQ().get(86017)) == 3)
    {
      z.w("!44@/B4Tb64lLpLYLFA5RsXPaniyp/fJB2W9QOIAqIRHvJI=", "check old contact not exist");
      return;
    }
    bg.qW().oO().bp("rcontact", "update rcontact set verifyflag=0 where verifyflag is null;");
    Cursor localCursor = bg.qW().oT().a("@all.weixin.android", "", null, false);
    localCursor.moveToFirst();
    while (!localCursor.isAfterLast())
    {
      i locali = new i();
      locali.b(localCursor);
      bg.qW().oT().c(locali.getUsername(), locali);
      localCursor.moveToNext();
    }
    localCursor.close();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Long.valueOf(System.currentTimeMillis() - l);
    z.d("!44@/B4Tb64lLpLYLFA5RsXPaniyp/fJB2W9QOIAqIRHvJI=", "update verifyflag from the beginning to update finish use %d ms", arrayOfObject2);
    bg.qW().oQ().set(86017, Integer.valueOf(3));
    z.d("!44@/B4Tb64lLpLYLFA5RsXPaniyp/fJB2W9QOIAqIRHvJI=", "update verifyflag use time " + (System.currentTimeMillis() - l) + " ms");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.s.c
 * JD-Core Version:    0.6.2
 */