package com.tencent.mm.pluginsdk.model.app;

import android.database.Cursor;
import android.graphics.Bitmap;
import com.tencent.mm.pluginsdk.ad;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

final class bg
  implements ad
{
  bg(bf parambf)
  {
  }

  public final void R(LinkedList paramLinkedList)
  {
    bf.aza().S(paramLinkedList);
  }

  public final Bitmap a(String paramString, int paramInt, float paramFloat)
  {
    return bf.GO().a(paramString, paramInt, paramFloat);
  }

  public final Cursor aH(int paramInt1, int paramInt2)
  {
    return bf.GO().aH(paramInt1, paramInt2);
  }

  public final void aa(String paramString, int paramInt)
  {
    bf.ayZ().ab(paramString, paramInt);
  }

  public final o ayd()
  {
    return bf.GO();
  }

  public final Cursor aye()
  {
    o localo = bf.GO();
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append("select * from AppInfo");
    localStringBuilder.append(" where ");
    localStringBuilder.append("serviceAppType > 0");
    Cursor localCursor = localo.rawQuery(localStringBuilder.toString(), new String[0]);
    if (localCursor == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getAllServices : cursor is null");
      return null;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localCursor.getCount());
    z.d("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getAllServices count = %d", arrayOfObject);
    return localCursor;
  }

  public final Cursor d(int[] paramArrayOfInt)
  {
    o localo = bf.GO();
    String str = "select * from AppInfo where ";
    for (int i = 0; i <= 0; i++)
      str = str + " status = " + paramArrayOfInt[0];
    Cursor localCursor = localo.rawQuery(str + " order by status desc, modifyTime asc", new String[0]);
    if (localCursor == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getAppByStatus : cursor is null");
      localCursor = null;
    }
    return localCursor;
  }

  public final void f(k paramk)
  {
    bf.GO().a(paramk, new String[0]);
  }

  public final void g(k paramk)
  {
    o localo = bf.GO();
    if ((paramk != null) && (paramk.field_status != 5))
    {
      paramk.field_status = 3;
      localo.a(paramk, new String[0]);
    }
  }

  public final void h(k paramk)
  {
    o localo = bf.GO();
    if ((paramk == null) || (paramk.field_status != 3))
      return;
    paramk.field_status = 4;
    localo.a(paramk, new String[0]);
  }

  public final Cursor mf(int paramInt)
  {
    Cursor localCursor = bf.GO().rawQuery("select * from AppInfo where status = 5" + " order by modifyTime asc", new String[0]);
    if (localCursor == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getAppByStatus : cursor is null");
      localCursor = null;
    }
    return localCursor;
  }

  public final k nt(String paramString)
  {
    return bf.GO().uY(paramString);
  }

  public final void uJ(String paramString)
  {
    bf.aza().uX(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.bg
 * JD-Core Version:    0.6.2
 */