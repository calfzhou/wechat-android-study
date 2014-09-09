package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

public final class cm
{
  public static void a(af paramaf)
  {
    if (!(paramaf instanceof h))
      z.e("!32@/B4Tb64lLpJGjaE010zo21XwV8JhYNa1", "!(db instanceof SqliteDB)");
    Cursor localCursor1;
    do
    {
      return;
      if (ch.a((Integer)bg.qW().oQ().get(49)) == -1)
      {
        z.w("!32@/B4Tb64lLpJGjaE010zo21XwV8JhYNa1", "check old contact not exist");
        return;
      }
      if ((!h.b((h)paramaf, "contact")) || (!h.b((h)paramaf, "contact_ext")))
      {
        z.w("!32@/B4Tb64lLpJGjaE010zo21XwV8JhYNa1", "check old contact not exist");
        bg.qW().oQ().set(49, Integer.valueOf(-1));
        return;
      }
      localCursor1 = paramaf.rawQuery("select contact.contactID,contact.sex,contact.type,contact.showHead,contact.username,contact.nickname,contact.pyInitial,contact.quanPin,contact.reserved,contact_ext.username,contact_ext.Uin,contact_ext.Email,contact_ext.Mobile,contact_ext.ShowFlag,contact_ext.ConType,contact_ext.ConRemark,contact_ext.ConRemark_PYShort,contact_ext.ConRemark_PYFull,contact_ext.ConQQMBlog,contact_ext.ConSMBlog,contact_ext.DomainList,contact_ext.reserved1,contact_ext.reserved2,contact_ext.reserved3,contact_ext.reserved4,contact_ext.reserved5,contact_ext.reserved6,contact_ext.reserved7,contact_ext.reserved8,contact_ext.reserved9,contact_ext.reserved10 , contact_ext.weiboflag , contact_ext.weibonickname from contact left join contact_ext on contact.username = contact_ext.username ", null);
    }
    while (localCursor1 == null);
    int i = localCursor1.getCount();
    z.d("!32@/B4Tb64lLpJGjaE010zo21XwV8JhYNa1", "Read From Old Contact :" + i);
    if (i == ch.a((Integer)bg.qW().oQ().get(49)))
    {
      z.w("!32@/B4Tb64lLpJGjaE010zo21XwV8JhYNa1", "Copy has been finished count:" + i);
      localCursor1.close();
      return;
    }
    long l = ((h)paramaf).dc(Thread.currentThread().getId());
    int j = 0;
    if (j < i)
    {
      localCursor1.moveToPosition(j);
      i locali = new i();
      locali.bj(localCursor1.getInt(1));
      locali.setType(localCursor1.getInt(2));
      locali.be(localCursor1.getInt(3));
      locali.setUsername(localCursor1.getString(4));
      locali.aU(localCursor1.getString(5));
      locali.aV(localCursor1.getString(6));
      locali.aW(localCursor1.getString(7));
      locali.aR(localCursor1.getString(8));
      locali.bk(localCursor1.getInt(10));
      locali.bd(localCursor1.getString(11));
      locali.bf(localCursor1.getString(12));
      locali.bm(localCursor1.getInt(13));
      locali.bn(localCursor1.getInt(14));
      locali.aT(localCursor1.getString(15));
      locali.ba(localCursor1.getString(16));
      locali.aZ(localCursor1.getString(17));
      locali.bk(localCursor1.getString(18));
      locali.bg(localCursor1.getString(19));
      locali.aX(localCursor1.getString(20));
      locali.bp(localCursor1.getInt(21));
      locali.bi(localCursor1.getInt(22));
      locali.bo(localCursor1.getInt(23));
      locali.bh(localCursor1.getString(26));
      locali.bi(localCursor1.getString(27));
      locali.bj(localCursor1.getString(28));
      locali.setSource(localCursor1.getInt(25));
      locali.bg(localCursor1.getInt(24));
      locali.bo(localCursor1.getString(29));
      locali.bl(localCursor1.getString(30));
      locali.bf(localCursor1.getInt(31));
      locali.aY(localCursor1.getString(32));
      String str;
      Cursor localCursor2;
      int k;
      StringBuilder localStringBuilder;
      if (!ch.jb(locali.getUsername()))
      {
        str = o.yl(locali.getUsername());
        localCursor2 = paramaf.rawQuery("select username from " + str + " where username=" + h.cG(locali.getUsername()), null);
        k = localCursor2.getCount();
        localStringBuilder = new StringBuilder("get Contact:").append(locali.getUsername()).append(" in rconnect:");
        if (k == 0)
          break label774;
      }
      label774: for (boolean bool = true; ; bool = false)
      {
        z.d("!32@/B4Tb64lLpJGjaE010zo21XwV8JhYNa1", bool);
        localCursor2.close();
        if (k == 0)
          paramaf.insert(str, "", locali.ir());
        j++;
        break;
      }
    }
    if (l != 0L)
      ((h)paramaf).dd(l);
    localCursor1.close();
    bg.qW().oQ().set(49, Integer.valueOf(i));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cm
 * JD-Core Version:    0.6.2
 */