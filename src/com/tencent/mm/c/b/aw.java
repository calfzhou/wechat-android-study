package com.tencent.mm.c.b;

import com.tencent.mm.as.h;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.model.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import junit.framework.Assert;

public final class aw extends h
{
  private static HashMap cZG;
  private static aw dhn = null;

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("FavItemInfo".hashCode()), new ax());
    cZG.put(Integer.valueOf("FavSearchInfo".hashCode()), new ay());
    cZG.put(Integer.valueOf("FavEditInfo".hashCode()), new az());
    cZG.put(Integer.valueOf("FavCdnInfo".hashCode()), new ba());
    cZG.put(Integer.valueOf("FavConfigInfo".hashCode()), new bb());
  }

  private aw()
  {
    long l = System.currentTimeMillis();
    if (bg.qW().oD() != 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      String str1 = bg.qW().pt() + "enFavorite.db";
      z.d("!44@/B4Tb64lLpLDEDz50PfddIlApIYG88VSmt0pYLfAWus=", "db path", new Object[] { str1 });
      if (a("", str1, bg.qW().oD(), v.ng(), cZG, true))
        break;
      throw new a((byte)0);
    }
    String str2 = aKT();
    if (!ch.jb(str2))
    {
      z.e("!44@/B4Tb64lLpLDEDz50PfddIlApIYG88VSmt0pYLfAWus=", "dbinit failed :" + str2);
      com.tencent.mm.sdk.b.b.m("init db Favorite Failed: [ " + str2 + "]", "DBinit");
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(System.currentTimeMillis() - l);
    z.d("!44@/B4Tb64lLpLDEDz50PfddIlApIYG88VSmt0pYLfAWus=", "init db Favorite time:%d", arrayOfObject);
  }

  public static aw kL()
  {
    if (dhn == null)
      dhn = new aw();
    return dhn;
  }

  public final void bQ(String paramString)
  {
    super.bQ(paramString);
    dhn = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.aw
 * JD-Core Version:    0.6.2
 */