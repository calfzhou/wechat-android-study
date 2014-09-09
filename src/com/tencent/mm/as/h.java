package com.tencent.mm.as;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.dbsupport.newcursor.d;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.List;
import junit.framework.Assert;

public class h
  implements af
{
  private String TAG = "!32@/B4Tb64lLpKlhk8lO29eCVkug351r3JK";
  private long dUR = 0L;
  protected e ikZ = null;
  private i ilo = null;
  private a ilp = new a();
  private String ilq = "";
  private String ilr = "";

  public h()
  {
  }

  public h(i parami)
  {
    this.ilo = parami;
  }

  private void Ag(String paramString)
  {
    String str1 = ak.aHm();
    String str2 = ak.getPackageName();
    z.i(this.TAG, "check process :[%s] [%s] path[%s]", new Object[] { str1, str2, paramString });
    if ((str1 != null) && (str2 != null) && (!str2.equals(str1)))
      Assert.assertTrue("processName:" + str1 + "  packagename:" + str2, false);
  }

  public static boolean b(h paramh, String paramString)
  {
    return e.a(paramh.ikZ, paramString);
  }

  public static String cG(String paramString)
  {
    if (ch.jb(paramString))
      return "";
    return DatabaseUtils.sqlEscapeString(paramString);
  }

  public final boolean Bn(String paramString)
  {
    if (!isOpen())
    {
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      return false;
    }
    try
    {
      this.ikZ.execSQL("DROP TABLE " + paramString);
      return false;
    }
    catch (Exception localException)
    {
      z.e(this.TAG, "drop table Error :" + localException.getMessage());
      b.aKP();
    }
    return false;
  }

  public final Cursor J(String paramString, boolean paramBoolean)
  {
    if (!ch.jb(paramString));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("sql is null ", bool);
      if (isOpen())
        break;
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      return c.aKQ();
    }
    b.begin();
    try
    {
      Cursor localCursor = this.ikZ.a(paramString, null, paramBoolean);
      b.a(paramString, localCursor, this.dUR);
      return localCursor;
    }
    catch (Exception localException)
    {
      z.e(this.TAG, "execSQL Error :" + localException.getMessage());
      b.aKP();
    }
    return c.aKQ();
  }

  public final Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4)
  {
    if (!isOpen())
    {
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      return c.aKQ();
    }
    b.begin();
    try
    {
      Cursor localCursor = this.ikZ.query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, null, paramString4);
      b.a(paramString1, localCursor, this.dUR);
      return localCursor;
    }
    catch (Exception localException)
    {
      z.e(this.TAG, "execSQL Error :" + localException.getMessage());
      b.aKP();
    }
    return c.aKQ();
  }

  public final boolean a(String paramString1, String paramString2, long paramLong, String paramString3, HashMap paramHashMap, boolean paramBoolean)
  {
    int i = paramString1.lastIndexOf("/");
    if (i != -1)
      this.TAG = (this.TAG + "." + paramString1.substring(i + 1));
    Ag(paramString2);
    if ((this.ilp.a(paramString1, paramString2, paramLong, paramString3, paramHashMap, paramBoolean)) && (this.ilp.aKM() != null))
    {
      this.ilr = this.ilp.aKN();
      this.ikZ = this.ilp.aKM();
      return true;
    }
    this.ilr = this.ilp.aKN();
    this.ikZ = null;
    this.ilp = null;
    z.d(this.TAG, "initDB failed.");
    return false;
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, List paramList, d paramd)
  {
    if (!isOpen())
    {
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      return false;
    }
    return this.ikZ.a(paramString1, paramString2, paramString3, paramList, null, paramd, true);
  }

  public final boolean aHQ()
  {
    return (this.ikZ == null) || (!this.ikZ.isOpen());
  }

  public final String aKT()
  {
    return this.ilr;
  }

  public final long aKU()
  {
    try
    {
      long l = dc(-1L);
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean b(String paramString, HashMap paramHashMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramString.lastIndexOf("/");
    if (i != -1)
      this.TAG = (this.TAG + "." + paramString.substring(i + 1));
    Ag(paramString);
    if ((this.ilp.a(paramString, paramHashMap, true, paramBoolean2)) && (this.ilp.aKM() != null))
    {
      this.ikZ = this.ilp.aKM();
      return true;
    }
    this.ikZ = null;
    this.ilp = null;
    z.e(this.TAG, "initDB failed.");
    return false;
  }

  public void bQ(String paramString)
  {
    if (this.ikZ == null)
      return;
    if (this.ilo != null)
      this.ilo.pz();
    String str1 = this.TAG;
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Boolean.valueOf(inTransaction());
    arrayOfObject1[1] = Long.toHexString(this.dUR);
    arrayOfObject1[2] = Long.valueOf(Thread.currentThread().getId());
    arrayOfObject1[3] = ch.aHN();
    z.w(str1, "begin close db, inTrans:%b ticket:%s  thr:%d {%s}", arrayOfObject1);
    l locall = new l();
    if (paramString != null)
      this.ilq = paramString;
    this.ikZ.close();
    this.ikZ = null;
    String str2 = this.TAG;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Long.valueOf(locall.nM());
    z.d(str2, "end close db time:%d", arrayOfObject2);
  }

  public final boolean bp(String paramString1, String paramString2)
  {
    if (!ch.jb(paramString2));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("sql is null ", bool);
      if (isOpen())
        break;
      String str2 = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str2, "DB IS CLOSED ! {%s}", arrayOfObject);
      return false;
    }
    b.begin();
    try
    {
      this.ikZ.execSQL(paramString2);
      b.a(paramString2, null, this.dUR);
      return true;
    }
    catch (Exception localException)
    {
      String str1 = localException.getMessage();
      z.e(this.TAG, "execSQL Error :" + str1);
      if ((str1 != null) && (str1.contains("no such table")))
      {
        this.ilp.aKO();
        Assert.assertTrue("clean ini cache and reboot", false);
      }
      b.aKP();
    }
    return false;
  }

  public final long dc(long paramLong)
  {
    long l1 = -1L;
    while (true)
    {
      long l2;
      try
      {
        l2 = Thread.currentThread().getId();
        String str1 = this.TAG;
        Object[] arrayOfObject1 = new Object[5];
        arrayOfObject1[0] = Long.valueOf(paramLong);
        arrayOfObject1[1] = Long.valueOf(l2);
        arrayOfObject1[2] = Long.valueOf(this.dUR);
        arrayOfObject1[3] = Boolean.valueOf(isOpen());
        arrayOfObject1[4] = ch.aHN();
        z.i(str1, "beginTransaction thr:(%d,%d) ticket:%d db:%b  {%s}", arrayOfObject1);
        if (!isOpen())
        {
          String str3 = this.TAG;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = ch.aHN();
          z.e(str3, "DB IS CLOSED ! {%s}", arrayOfObject3);
          l1 = -4L;
          return l1;
        }
        if (this.dUR > 0L)
        {
          z.e(this.TAG, "ERROR beginTransaction transactionTicket:" + this.dUR);
          continue;
        }
      }
      finally
      {
      }
      if ((!am.isMainThread()) && (paramLong == l1))
      {
        String str2 = this.TAG;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Long.valueOf(paramLong);
        arrayOfObject2[1] = Long.valueOf(l2);
        z.e(str2, "FORBID: beginTrans UNKNOW_THREAD ParamID:%d nowThr:%d", arrayOfObject2);
        l1 = -2L;
      }
      else
      {
        try
        {
          b.begin();
          this.ikZ.beginTransaction();
          b.a("beginTrans", null, 0L);
          this.dUR = (0x7FFFFFFF & ch.CM());
          this.dUR |= (l2 & 0x7FFFFFFF) << 32;
          if (this.ilo != null)
            this.ilo.pA();
          l1 = this.dUR;
        }
        catch (Exception localException)
        {
          z.e(this.TAG, "beginTransaction Error :" + localException.getMessage());
          b.aKP();
          l1 = -3L;
        }
      }
    }
  }

  // ERROR //
  public final int dd(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 310	com/tencent/mm/sdk/platformtools/ch:CM	()J
    //   5: lstore 4
    //   7: invokestatic 245	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   10: invokevirtual 248	java/lang/Thread:getId	()J
    //   13: lstore 6
    //   15: aload_0
    //   16: getfield 26	com/tencent/mm/as/h:TAG	Ljava/lang/String;
    //   19: astore 8
    //   21: iconst_5
    //   22: anewarray 4	java/lang/Object
    //   25: astore 9
    //   27: aload 9
    //   29: iconst_0
    //   30: lload 6
    //   32: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   35: aastore
    //   36: aload 9
    //   38: iconst_1
    //   39: lload_1
    //   40: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   43: aastore
    //   44: aload 9
    //   46: iconst_2
    //   47: aload_0
    //   48: getfield 43	com/tencent/mm/as/h:dUR	J
    //   51: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   54: aastore
    //   55: aload 9
    //   57: iconst_3
    //   58: aload_0
    //   59: invokevirtual 118	com/tencent/mm/as/h:isOpen	()Z
    //   62: invokestatic 233	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   65: aastore
    //   66: aload 9
    //   68: iconst_4
    //   69: invokestatic 122	com/tencent/mm/sdk/platformtools/ch:aHN	()Lcom/tencent/mm/sdk/platformtools/cl;
    //   72: aastore
    //   73: aload 8
    //   75: ldc_w 321
    //   78: aload 9
    //   80: invokestatic 63	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: aload_0
    //   84: invokevirtual 118	com/tencent/mm/as/h:isOpen	()Z
    //   87: ifne +40 -> 127
    //   90: aload_0
    //   91: getfield 26	com/tencent/mm/as/h:TAG	Ljava/lang/String;
    //   94: astore 19
    //   96: iconst_1
    //   97: anewarray 4	java/lang/Object
    //   100: astore 20
    //   102: aload 20
    //   104: iconst_0
    //   105: invokestatic 122	com/tencent/mm/sdk/platformtools/ch:aHN	()Lcom/tencent/mm/sdk/platformtools/cl;
    //   108: aastore
    //   109: aload 19
    //   111: ldc 124
    //   113: aload 20
    //   115: invokestatic 127	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: bipush 252
    //   120: istore 14
    //   122: aload_0
    //   123: monitorexit
    //   124: iload 14
    //   126: ireturn
    //   127: lload_1
    //   128: aload_0
    //   129: getfield 43	com/tencent/mm/as/h:dUR	J
    //   132: lcmp
    //   133: ifeq +46 -> 179
    //   136: aload_0
    //   137: getfield 26	com/tencent/mm/as/h:TAG	Ljava/lang/String;
    //   140: new 71	java/lang/StringBuilder
    //   143: dup
    //   144: ldc_w 323
    //   147: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   150: lload_1
    //   151: invokevirtual 291	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   154: ldc_w 325
    //   157: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: aload_0
    //   161: getfield 43	com/tencent/mm/as/h:dUR	J
    //   164: invokevirtual 291	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   167: invokevirtual 84	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: invokestatic 140	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   173: iconst_m1
    //   174: istore 14
    //   176: goto -54 -> 122
    //   179: ldc2_w 306
    //   182: lload_1
    //   183: bipush 32
    //   185: lshr
    //   186: land
    //   187: lstore 10
    //   189: lload 10
    //   191: lload 6
    //   193: lcmp
    //   194: ifeq +58 -> 252
    //   197: aload_0
    //   198: getfield 26	com/tencent/mm/as/h:TAG	Ljava/lang/String;
    //   201: astore 12
    //   203: iconst_3
    //   204: anewarray 4	java/lang/Object
    //   207: astore 13
    //   209: aload 13
    //   211: iconst_0
    //   212: lload_1
    //   213: invokestatic 239	java/lang/Long:toHexString	(J)Ljava/lang/String;
    //   216: aastore
    //   217: aload 13
    //   219: iconst_1
    //   220: lload 10
    //   222: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   225: aastore
    //   226: aload 13
    //   228: iconst_2
    //   229: lload 6
    //   231: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   234: aastore
    //   235: aload 12
    //   237: ldc_w 327
    //   240: aload 13
    //   242: invokestatic 127	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   245: bipush 254
    //   247: istore 14
    //   249: goto -127 -> 122
    //   252: invokestatic 157	com/tencent/mm/as/b:begin	()V
    //   255: aload_0
    //   256: getfield 28	com/tencent/mm/as/h:ikZ	Lcom/tencent/mm/as/e;
    //   259: invokevirtual 330	com/tencent/mm/as/e:endTransaction	()V
    //   262: aload_0
    //   263: getfield 26	com/tencent/mm/as/h:TAG	Ljava/lang/String;
    //   266: astore 16
    //   268: bipush 6
    //   270: anewarray 4	java/lang/Object
    //   273: astore 17
    //   275: aload 17
    //   277: iconst_0
    //   278: lload 4
    //   280: invokestatic 333	com/tencent/mm/sdk/platformtools/ch:ac	(J)J
    //   283: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   286: aastore
    //   287: aload 17
    //   289: iconst_1
    //   290: lload 6
    //   292: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   295: aastore
    //   296: aload 17
    //   298: iconst_2
    //   299: lload_1
    //   300: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   303: aastore
    //   304: aload 17
    //   306: iconst_3
    //   307: aload_0
    //   308: getfield 43	com/tencent/mm/as/h:dUR	J
    //   311: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   314: aastore
    //   315: aload 17
    //   317: iconst_4
    //   318: aload_0
    //   319: invokevirtual 118	com/tencent/mm/as/h:isOpen	()Z
    //   322: invokestatic 233	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   325: aastore
    //   326: aload 17
    //   328: iconst_5
    //   329: invokestatic 122	com/tencent/mm/sdk/platformtools/ch:aHN	()Lcom/tencent/mm/sdk/platformtools/cl;
    //   332: aastore
    //   333: aload 16
    //   335: ldc_w 335
    //   338: aload 17
    //   340: invokestatic 63	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   343: ldc_w 337
    //   346: aconst_null
    //   347: lconst_0
    //   348: invokestatic 163	com/tencent/mm/as/b:a	(Ljava/lang/String;Landroid/database/Cursor;J)V
    //   351: aload_0
    //   352: lconst_0
    //   353: putfield 43	com/tencent/mm/as/h:dUR	J
    //   356: aload_0
    //   357: getfield 30	com/tencent/mm/as/h:ilo	Lcom/tencent/mm/as/i;
    //   360: astore 18
    //   362: iconst_0
    //   363: istore 14
    //   365: aload 18
    //   367: ifnull -245 -> 122
    //   370: aload_0
    //   371: getfield 30	com/tencent/mm/as/h:ilo	Lcom/tencent/mm/as/i;
    //   374: invokeinterface 340 1 0
    //   379: iconst_0
    //   380: istore 14
    //   382: goto -260 -> 122
    //   385: astore_3
    //   386: aload_0
    //   387: monitorexit
    //   388: aload_3
    //   389: athrow
    //   390: astore 15
    //   392: aload_0
    //   393: getfield 26	com/tencent/mm/as/h:TAG	Ljava/lang/String;
    //   396: new 71	java/lang/StringBuilder
    //   399: dup
    //   400: ldc_w 342
    //   403: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   406: aload 15
    //   408: invokevirtual 137	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   411: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   414: invokevirtual 84	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   417: invokestatic 140	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   420: invokestatic 145	com/tencent/mm/as/b:aKP	()V
    //   423: bipush 253
    //   425: istore 14
    //   427: goto -305 -> 122
    //
    // Exception table:
    //   from	to	target	type
    //   2	118	385	finally
    //   127	173	385	finally
    //   197	245	385	finally
    //   252	351	385	finally
    //   351	362	385	finally
    //   370	379	385	finally
    //   392	423	385	finally
    //   252	351	390	java/lang/Exception
  }

  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    if (!isOpen())
    {
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      return -2;
    }
    b.begin();
    try
    {
      int i = this.ikZ.delete(paramString1, paramString2, paramArrayOfString);
      b.a(paramString1, null, this.dUR);
      return i;
    }
    catch (Exception localException)
    {
      z.e(this.TAG, "delete Error :" + localException.getMessage());
      b.aKP();
    }
    return -1;
  }

  protected void finalize()
  {
    bQ(null);
  }

  public final String getKey()
  {
    if (this.ilp == null)
      return null;
    return this.ilp.getKey();
  }

  public final String getPath()
  {
    if (!isOpen())
    {
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      return null;
    }
    return this.ikZ.getPath();
  }

  public final boolean inTransaction()
  {
    boolean bool1 = false;
    try
    {
      if (!isOpen())
      {
        String str = this.TAG;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = ch.aHN();
        z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      }
      while (true)
      {
        return bool1;
        long l = this.dUR;
        boolean bool2 = l < 0L;
        bool1 = false;
        if (bool2)
          bool1 = true;
      }
    }
    finally
    {
    }
  }

  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    if (!isOpen())
    {
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      return -2L;
    }
    b.begin();
    try
    {
      long l = this.ikZ.insert(paramString1, paramString2, paramContentValues);
      b.a(paramString1, null, this.dUR);
      return l;
    }
    catch (Exception localException)
    {
      z.e(this.TAG, "insert Error :" + localException.getMessage());
      b.aKP();
    }
    return -1L;
  }

  public final boolean isOpen()
  {
    if ((this.ikZ != null) && (this.ikZ.isOpen()))
      return true;
    Assert.assertTrue("DB has been closed :[" + this.ilq + "]", ch.jb(this.ilq));
    return false;
  }

  public void oG()
  {
    bQ(null);
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    if (!ch.jb(paramString));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("sql is null ", bool);
      if (isOpen())
        break;
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      return c.aKQ();
    }
    b.begin();
    try
    {
      Cursor localCursor = this.ikZ.rawQuery(paramString, paramArrayOfString);
      b.a(paramString, localCursor, this.dUR);
      return localCursor;
    }
    catch (Exception localException)
    {
      z.e(this.TAG, "execSQL Error :" + localException.getMessage());
      b.aKP();
    }
    return c.aKQ();
  }

  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    if (!isOpen())
    {
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      return -2L;
    }
    b.begin();
    try
    {
      long l = this.ikZ.replace(paramString1, paramString2, paramContentValues);
      b.a(paramString1, null, this.dUR);
      return l;
    }
    catch (Exception localException)
    {
      z.e(this.TAG, "repalce  Error :" + localException.getMessage());
      b.aKP();
    }
    return -1L;
  }

  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    if (!isOpen())
    {
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e(str, "DB IS CLOSED ! {%s}", arrayOfObject);
      return -2;
    }
    b.begin();
    try
    {
      int i = this.ikZ.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
      b.a(paramString1, null, this.dUR);
      return i;
    }
    catch (Exception localException)
    {
      z.e(this.TAG, "update Error :" + localException.getMessage());
      b.aKP();
    }
    return -1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.as.h
 * JD-Core Version:    0.6.2
 */