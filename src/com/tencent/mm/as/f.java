package com.tencent.mm.as;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cl;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import junit.framework.Assert;

public final class f
  implements af
{
  private static String ill = "";
  private boolean haL = false;
  private e ikZ = null;
  private h ilk = null;
  Map ilm = new HashMap();
  Queue iln = new LinkedList();

  public f(h paramh)
  {
    this.ilk = paramh;
    if (!ch.jb(paramh.getKey()))
      this.ikZ = e.b(null, null, 0, false);
  }

  private int Af(String paramString)
  {
    if (!this.haL)
      return -4;
    if ((this.ilk == null) || (this.ilk.inTransaction()))
    {
      z.d("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "copy table but diskDB inTransaction");
      return -3;
    }
    try
    {
      if (e.a(this.ikZ, paramString))
      {
        this.ikZ.execSQL("drop table " + paramString);
        z.i("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "table %s is in Memory DB,drop! ", new Object[] { paramString });
      }
      Cursor localCursor = this.ilk.rawQuery(" select sql from sqlite_master where tbl_name=\"" + paramString + "\" and type = \"table\"", null);
      String str = null;
      if (localCursor != null)
      {
        int i = localCursor.getCount();
        str = null;
        if (i == 1)
        {
          localCursor.moveToFirst();
          str = localCursor.getString(0);
        }
        localCursor.close();
      }
      if (str == null)
      {
        z.w("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "diskDB has not this table !");
        return -1;
      }
      this.ikZ.execSQL(str);
      this.ikZ.execSQL("insert into " + paramString + " select * from old." + paramString);
      z.d("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "copy table %s success", new Object[] { paramString });
      return 0;
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", localException, "copy table failed with exception.\n", new Object[0]);
    }
    return -2;
  }

  public final Cursor J(String paramString, boolean paramBoolean)
  {
    return null;
  }

  public final Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4)
  {
    if ((this.ikZ != null) && (this.ikZ.isOpen()))
      return this.ikZ.query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, null, paramString4);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = ill;
    z.w("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "memoryDB already close query [%s] [%s]", arrayOfObject);
    return c.aKQ();
  }

  public final boolean aHQ()
  {
    boolean bool1;
    if (this.ikZ != null)
    {
      boolean bool2 = this.ikZ.isOpen();
      bool1 = false;
      if (bool2);
    }
    else
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ill;
      z.e("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "memory db is close [%s]", arrayOfObject);
      bool1 = true;
    }
    return bool1;
  }

  public final void aKS()
  {
    Iterator localIterator = this.ilm.keySet().iterator();
    while (localIterator.hasNext())
      ((k)this.ilm.get(localIterator.next())).aKV();
  }

  public final boolean bp(String paramString1, String paramString2)
  {
    Assert.assertTrue("Not Attach Mem Storage:" + paramString1, this.ilm.containsKey(paramString1));
    boolean bool1;
    if ((this.ikZ != null) && (this.ikZ.isOpen()))
    {
      ((k)this.ilm.get(paramString1)).Ah(paramString2);
      this.ikZ.execSQL(paramString2);
      bool1 = true;
    }
    boolean bool2;
    do
    {
      h localh;
      do
      {
        return bool1;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString1;
        arrayOfObject[1] = ill;
        z.w("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "memoryDB already close execSQL [%s] [%s]", arrayOfObject);
        localh = this.ilk;
        bool1 = false;
      }
      while (localh == null);
      bool2 = this.ilk.isOpen();
      bool1 = false;
    }
    while (!bool2);
    this.ilk.bp(paramString2, paramString1);
    return true;
  }

  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    Assert.assertTrue("Not Attach Mem Storage:" + paramString1, this.ilm.containsKey(paramString1));
    if ((this.ikZ != null) && (this.ikZ.isOpen()))
    {
      ((k)this.ilm.get(paramString1)).c(paramString2, paramArrayOfString);
      return this.ikZ.delete(paramString1, paramString2, paramArrayOfString);
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = ill;
    z.w("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "memoryDB already close delete [%s] [%s]", arrayOfObject);
    if ((this.ilk != null) && (this.ilk.isOpen()))
      return this.ilk.delete(paramString1, paramString2, paramArrayOfString);
    return -1;
  }

  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    Assert.assertTrue("Not Attach Mem Storage:" + paramString1, this.ilm.containsKey(paramString1));
    if ((this.ikZ != null) && (this.ikZ.isOpen()))
    {
      ((k)this.ilm.get(paramString1)).a(paramString2, paramContentValues);
      return this.ikZ.insert(paramString1, paramString2, paramContentValues);
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = ill;
    z.w("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "memoryDB already close insert [%s] [%s]", arrayOfObject);
    if ((this.ilk != null) && (this.ilk.isOpen()))
      return this.ilk.insert(paramString1, paramString2, paramContentValues);
    return -1L;
  }

  public final void oG()
  {
    ill = ch.aHN().toString();
    if (this.ikZ != null)
    {
      this.ikZ.close();
      this.ikZ = null;
    }
  }

  public final void pB()
  {
    if (this.iln.size() != 0)
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = "stg_null";
      arrayOfObject1[1] = Integer.valueOf(this.iln.size());
      z.i("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "attachTable begin stg:%s size:%d", arrayOfObject1);
      if (this.ikZ != null)
        break label63;
      z.e("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "attachTable db is null");
    }
    label63: label599: 
    while (true)
    {
      return;
      g localg;
      if (this.ilk.inTransaction())
      {
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = Integer.valueOf(this.iln.size());
        z.w("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "attachTable is in transcation ,give up attach table size:%d", arrayOfObject5);
        return;
        localg = (g)this.iln.peek();
        if (localg != null)
          break label185;
        this.iln.poll();
      }
      while (true)
      {
        if (this.iln.size() <= 0)
          break label599;
        if (!this.ilk.inTransaction())
          break;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(this.iln.size());
        z.w("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "attachTable is in transcation , break attach table size:%d", arrayOfObject2);
        return;
        String str = localg.wj();
        if (ch.jb(str))
        {
          z.e("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "attachTable Error table Name :%s", new Object[] { str });
          this.iln.poll();
        }
        else if (e.a(this.ikZ, str))
        {
          z.e("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "attachTable Error Attach table twice :%s", new Object[] { str });
          this.iln.poll();
        }
        else
        {
          if (Af(str) != 0)
            try
            {
              if (this.haL)
              {
                this.ikZ.execSQL("DETACH DATABASE old");
                z.i("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "DETACH DATABASE ");
                this.haL = false;
              }
              if (ch.jb(this.ilk.getKey()))
                this.ikZ.execSQL("ATTACH DATABASE '" + this.ilk.getPath() + "' AS old ");
              while (true)
              {
                z.i("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "ATTACH DATABASE ");
                this.haL = true;
                if (Af(str) == 0)
                  break;
                z.e("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "copy table failed :" + str);
                return;
                this.ikZ.execSQL("ATTACH DATABASE '" + this.ilk.getPath() + "' AS old KEY '" + this.ilk.getKey() + "'");
              }
            }
            catch (Exception localException)
            {
              while (true)
              {
                this.haL = false;
                Object[] arrayOfObject4 = new Object[1];
                arrayOfObject4[0] = localException.getMessage();
                z.e("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "ERROR : attach disk db [%s] , will do again !", arrayOfObject4);
              }
            }
          Object[] arrayOfObject3 = new Object[3];
          arrayOfObject3[0] = str;
          arrayOfObject3[1] = Integer.valueOf(this.iln.size());
          arrayOfObject3[2] = Integer.valueOf(this.ilm.size());
          z.i("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "attachTable %s succ , waitsize:%d finsize:%d", arrayOfObject3);
          k localk = new k(this.ilk, str);
          this.ilm.put(str, localk);
          localg.a(this);
          this.iln.poll();
        }
      }
    }
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    if ((this.ikZ != null) && (this.ikZ.isOpen()))
      return this.ikZ.rawQuery(paramString, paramArrayOfString);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = ill;
    z.w("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "memoryDB already close rawQuery [%s] [%s]", arrayOfObject);
    return c.aKQ();
  }

  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    Assert.assertTrue("Not Attach Mem Storage:" + paramString1, this.ilm.containsKey(paramString1));
    if ((this.ikZ != null) && (this.ikZ.isOpen()))
    {
      ((k)this.ilm.get(paramString1)).b(paramString2, paramContentValues);
      return this.ikZ.replace(paramString1, paramString2, paramContentValues);
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = ill;
    z.w("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "memoryDB already close replace [%s] [%s]", arrayOfObject);
    if ((this.ilk != null) && (this.ilk.isOpen()))
      return this.ilk.replace(paramString1, paramString2, paramContentValues);
    return -1L;
  }

  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    Assert.assertTrue("Not Attach Mem Storage:" + paramString1, this.ilm.containsKey(paramString1));
    if ((this.ikZ != null) && (this.ikZ.isOpen()))
    {
      ((k)this.ilm.get(paramString1)).a(paramContentValues, paramString2, paramArrayOfString);
      return this.ikZ.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = ill;
    z.w("!32@/B4Tb64lLpIsV0xS6l3RDQ3i/yyW4Gaj", "memoryDB already close update [%s] [%s]", arrayOfObject);
    if ((this.ilk != null) && (this.ilk.isOpen()))
      return this.ilk.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
    return -1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.as.f
 * JD-Core Version:    0.6.2
 */