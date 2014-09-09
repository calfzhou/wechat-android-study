package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.f;
import com.tencent.mm.as.g;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class cl extends ai
  implements g
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS role_info ( id TEXT PRIMARY KEY, name TEXT, status INT, text_reserved1 TEXT, text_reserved2 TEXT, text_reserved3 TEXT, text_reserved4 TEXT, int_reserved1 INT, int_reserved2 INT, int_reserved3 INT, int_reserved4 INT )" };
  private af dtV = null;

  public cl(h paramh)
  {
    this.dtV = paramh;
  }

  private void a(cj paramcj)
  {
    paramcj.db(135);
    ContentValues localContentValues = paramcj.ir();
    if ((localContentValues.size() > 0) && (this.dtV.insert("role_info", "id", localContentValues) != 0L))
      Bo();
  }

  private void b(cj paramcj)
  {
    ContentValues localContentValues = paramcj.ir();
    if (localContentValues.size() > 0)
    {
      af localaf = this.dtV;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = paramcj.getName();
      int i = localaf.update("role_info", localContentValues, "name like ?", arrayOfString);
      z.d("!32@/B4Tb64lLpI04WR7gCeMEW65frrKe7kY", "update role info, name=" + paramcj.getName() + ", res:" + i);
      if (i > 0)
        Bo();
    }
  }

  private cj zY(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0));
    for (boolean bool1 = true; ; bool1 = false)
    {
      Assert.assertTrue(bool1);
      cj localcj1 = new cj();
      Cursor localCursor = this.dtV.a("role_info", null, "name= ?", new String[] { paramString }, null, null);
      boolean bool2 = localCursor.moveToFirst();
      cj localcj2 = null;
      if (bool2)
      {
        localcj1.b(localCursor);
        localcj2 = localcj1;
      }
      localCursor.close();
      return localcj2;
    }
  }

  public final void L(String paramString, boolean paramBoolean)
  {
    if (ch.jb(paramString))
    {
      z.e("!32@/B4Tb64lLpI04WR7gCeMEW65frrKe7kY", "insert role info failed: empty user");
      return;
    }
    cj localcj = zY(paramString);
    if (localcj == null)
    {
      a(new cj(paramString, paramBoolean, 2));
      z.d("!32@/B4Tb64lLpI04WR7gCeMEW65frrKe7kY", "insert new role, user=" + paramString);
      return;
    }
    localcj.ei(paramBoolean);
    localcj.db(4);
    b(localcj);
  }

  public final int a(f paramf)
  {
    if (paramf != null)
      this.dtV = paramf;
    return 0;
  }

  public final List aKH()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = this.dtV.a("role_info", null, "int_reserved1=1", null, null, null);
    if (localCursor.getCount() > 0)
    {
      localCursor.moveToFirst();
      while (!localCursor.isAfterLast())
      {
        cj localcj = new cj();
        localcj.b(localCursor);
        localLinkedList.add(localcj);
        localCursor.moveToNext();
      }
    }
    localCursor.close();
    return localLinkedList;
  }

  public final void ao(String paramString, int paramInt)
  {
    if (ch.jb(paramString))
      z.e("!32@/B4Tb64lLpI04WR7gCeMEW65frrKe7kY", "insert role info failed: empty user");
    while (zY(paramString) != null)
      return;
    a(new cj(paramString, true, paramInt));
    z.d("!32@/B4Tb64lLpI04WR7gCeMEW65frrKe7kY", "insert new role, user=" + paramString);
  }

  public final void b(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (ch.jb(paramString))
    {
      z.e("!32@/B4Tb64lLpI04WR7gCeMEW65frrKe7kY", "insert role info failed: empty user");
      return;
    }
    cj localcj = zY(paramString);
    if (localcj == null)
    {
      a(new cj(paramString, paramBoolean1, 2));
      z.d("!32@/B4Tb64lLpI04WR7gCeMEW65frrKe7kY", "insert new role, user=" + paramString);
      return;
    }
    localcj.ei(paramBoolean1);
    localcj.ej(paramBoolean2);
    localcj.db(4);
    b(localcj);
  }

  public final void fA(String paramString)
  {
    if (paramString.length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      int i = this.dtV.delete("role_info", "name=?", new String[] { paramString });
      z.d("!32@/B4Tb64lLpI04WR7gCeMEW65frrKe7kY", "delete name name :" + paramString + ", res:" + i);
      if (i > 0)
        Bo();
      return;
    }
  }

  public final boolean has(String paramString)
  {
    cj localcj = zX(new ck(paramString).zW(""));
    return (localcj != null) && (paramString.equals(localcj.getName()));
  }

  public final String wj()
  {
    return "role_info";
  }

  public final cj zX(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    cj localcj1 = new cj();
    af localaf = this.dtV;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ("%" + paramString);
    Cursor localCursor = localaf.a("role_info", null, "name LIKE ?", arrayOfString, null, null);
    boolean bool = localCursor.moveToFirst();
    cj localcj2 = null;
    if (bool)
    {
      localcj1.b(localCursor);
      localcj2 = localcj1;
    }
    localCursor.close();
    return localcj2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cl
 * JD-Core Version:    0.6.2
 */