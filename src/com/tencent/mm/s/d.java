package com.tencent.mm.s;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.al;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.w;

public final class d extends al
{
  public final boolean cG(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 604372991);
  }

  public final String getTag()
  {
    return "!56@/B4Tb64lLpJN/RyYD3u7HF8juPJa6nglxXMYkxC4P3qVkLeQLye5rQ==";
  }

  public final void transfer(int paramInt)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.d("!56@/B4Tb64lLpJN/RyYD3u7HF8juPJa6nglxXMYkxC4P3qVkLeQLye5rQ==", "the previous version is %d", arrayOfObject1);
    Cursor localCursor;
    r localr1;
    r localr2;
    if ((paramInt != 0) && (paramInt < 604372991))
    {
      h localh = bg.qW().oO();
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("select rconversation.username").append(" from rconversation, rcontact").append(", bizinfo where rconversation").append(".username = rcontact").append(".username and rconversation").append(".username = bizinfo").append(".username and ( rcontact").append(".verifyFlag & 8").append(" ) != 0 ");
      String str1 = localStringBuilder1.toString();
      z.d("!56@/B4Tb64lLpJN/RyYD3u7HF8juPJa6nglxXMYkxC4P3qVkLeQLye5rQ==", "select sql %s", new Object[] { str1 });
      localCursor = localh.rawQuery(str1, null);
      if ((localCursor == null) || (!localCursor.moveToFirst()))
        break label553;
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("Update rconversation set parentRef").append(" = 'officialaccounts' where 1 !=1 ");
      do
      {
        String str2 = localCursor.getString(0);
        if (!y.dO(str2))
          localStringBuilder2.append(" or username = '").append(str2).append("'");
      }
      while (localCursor.moveToNext());
      localCursor.close();
      String str3 = localStringBuilder2.toString();
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Boolean.valueOf(true);
      arrayOfObject2[1] = str3;
      z.d("!56@/B4Tb64lLpJN/RyYD3u7HF8juPJa6nglxXMYkxC4P3qVkLeQLye5rQ==", "changed[%B] exec sql[%s]", arrayOfObject2);
      localh.bp("rconversation", str3);
      localr1 = bg.qW().oW().yE("officialaccounts");
      if (localr1 != null)
        break label576;
      localr2 = new r("officialaccounts");
      localr2.aIB();
      bg.qW().oW().d(localr2);
    }
    label553: label576: for (r localr3 = localr2; ; localr3 = localr1)
    {
      String str4 = bg.qW().oW().aII();
      if (ch.jb(str4))
        z.w("!56@/B4Tb64lLpJN/RyYD3u7HF8juPJa6nglxXMYkxC4P3qVkLeQLye5rQ==", "last convBiz is null");
      do
      {
        return;
        ar localar = bg.qW().oV().zr(str4);
        if ((localar == null) || (localar.kk() == 0L))
        {
          z.w("!56@/B4Tb64lLpJN/RyYD3u7HF8juPJa6nglxXMYkxC4P3qVkLeQLye5rQ==", "last biz msg is error");
          return;
        }
        localr3.v(localar);
        localr3.setContent(localar.kt() + ":" + localar.getContent());
        localr3.bv(Integer.toString(localar.getType()));
        w localw = bg.qW().oW().ih();
        if (localw != null)
        {
          PString localPString1 = new PString();
          PString localPString2 = new PString();
          PInt localPInt = new PInt();
          localar.bJ("officialaccounts");
          localar.setContent(localr3.getContent());
          localw.a(localar, localPString1, localPString2, localPInt, false);
          localr3.bu(localPString1.value);
          localr3.bw(localPString2.value);
          localr3.bx(localPInt.value);
        }
        bg.qW().oW().a(localr3, localr3.getUsername());
      }
      while ((localCursor == null) || (localCursor.isClosed()));
      localCursor.close();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.s.d
 * JD-Core Version:    0.6.2
 */