package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.as.g;
import com.tencent.mm.as.h;
import com.tencent.mm.c.a.mo;
import com.tencent.mm.sdk.f.ae;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.List;

public final class l extends ah
  implements g
{
  public static final String[] dmc = arrayOfString;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(k.dhu, "ContactLabel");
  }

  public l(af paramaf)
  {
    this(paramaf, k.dhu, "ContactLabel");
  }

  private l(af paramaf, ae paramae, String paramString)
  {
    super(paramaf, paramae, paramString, null);
    this.dtV = paramaf;
  }

  private static String a(String paramString, k paramk)
  {
    if (paramk != null)
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramk);
      return j(paramString, localArrayList);
    }
    return null;
  }

  private boolean a(boolean paramBoolean, k paramk)
  {
    boolean bool = super.b(paramk);
    if ((bool) && (paramBoolean))
      Ba(a("insert", paramk));
    return bool;
  }

  private boolean a(boolean paramBoolean, k paramk, String[] paramArrayOfString)
  {
    boolean bool = super.b(paramk, paramArrayOfString);
    if ((bool) && (paramBoolean))
    {
      Ba(a("delete", paramk));
      aIn();
    }
    return bool;
  }

  private static void aIn()
  {
    z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[publishUpdateSearchIndexEvent]");
    mo localmo = new mo();
    localmo.cPj.cPk = 3000L;
    com.tencent.mm.sdk.c.a.aGB().g(localmo);
  }

  private int b(k paramk)
  {
    Cursor localCursor = null;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramk.field_labelID;
    try
    {
      localCursor = this.dtV.rawQuery("select * from ContactLabel where labelID=?", arrayOfString);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        String str = ch.Y(localCursor.getString(localCursor.getColumnIndex("labelName")), "");
        if (paramk.field_labelName.equalsIgnoreCase(str))
        {
          i = n.iia;
          return i;
        }
        int i = n.iib;
        return i;
      }
      return n.iic;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.toString();
        z.w("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[checkEqualsName] exception %s", arrayOfObject);
        if (localCursor != null)
          localCursor.close();
      }
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  private boolean b(boolean paramBoolean, k paramk, String[] paramArrayOfString)
  {
    boolean bool = super.a(paramk, paramArrayOfString);
    if ((bool) && (paramBoolean))
      Ba(a("update", paramk));
    return bool;
  }

  // ERROR //
  private String c(k paramk)
  {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray 14	java/lang/String
    //   4: astore_2
    //   5: aload_2
    //   6: iconst_0
    //   7: new 117	java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   14: aload_1
    //   15: getfield 166	com/tencent/mm/storage/k:field_labelName	Ljava/lang/String;
    //   18: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: aastore
    //   25: aload_2
    //   26: iconst_1
    //   27: ldc 204
    //   29: aastore
    //   30: aload_0
    //   31: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   34: ldc 206
    //   36: aload_2
    //   37: invokeinterface 138 3 0
    //   42: astore 9
    //   44: aload 9
    //   46: astore 4
    //   48: aload 4
    //   50: ifnull +131 -> 181
    //   53: aload 4
    //   55: invokeinterface 144 1 0
    //   60: ifeq +121 -> 181
    //   63: aload 4
    //   65: aload 4
    //   67: ldc 146
    //   69: invokeinterface 150 2 0
    //   74: invokeinterface 154 2 0
    //   79: ldc 156
    //   81: invokestatic 162	com/tencent/mm/sdk/platformtools/ch:Y	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   84: astore 10
    //   86: aload_1
    //   87: getfield 166	com/tencent/mm/storage/k:field_labelName	Ljava/lang/String;
    //   90: aload 10
    //   92: invokevirtual 170	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   95: istore 11
    //   97: iconst_2
    //   98: anewarray 186	java/lang/Object
    //   101: astore 12
    //   103: aload 12
    //   105: iconst_0
    //   106: new 117	java/lang/StringBuilder
    //   109: dup
    //   110: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   113: aload_1
    //   114: getfield 166	com/tencent/mm/storage/k:field_labelName	Ljava/lang/String;
    //   117: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: aastore
    //   124: aload 12
    //   126: iconst_1
    //   127: aload 10
    //   129: aastore
    //   130: ldc 77
    //   132: ldc 208
    //   134: aload 12
    //   136: invokestatic 210	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: iload 11
    //   141: ifeq +40 -> 181
    //   144: aload 4
    //   146: aload 4
    //   148: ldc 212
    //   150: invokeinterface 150 2 0
    //   155: invokeinterface 154 2 0
    //   160: astore 13
    //   162: aload 13
    //   164: astore 8
    //   166: aload 4
    //   168: ifnull +10 -> 178
    //   171: aload 4
    //   173: invokeinterface 178 1 0
    //   178: aload 8
    //   180: areturn
    //   181: aconst_null
    //   182: astore 8
    //   184: aload 4
    //   186: ifnull -8 -> 178
    //   189: aload 4
    //   191: invokeinterface 178 1 0
    //   196: aconst_null
    //   197: areturn
    //   198: astore 6
    //   200: aconst_null
    //   201: astore 4
    //   203: iconst_1
    //   204: anewarray 186	java/lang/Object
    //   207: astore 7
    //   209: aload 7
    //   211: iconst_0
    //   212: aload 6
    //   214: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   217: aastore
    //   218: ldc 77
    //   220: ldc 189
    //   222: aload 7
    //   224: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: aconst_null
    //   228: astore 8
    //   230: aload 4
    //   232: ifnull -54 -> 178
    //   235: aload 4
    //   237: invokeinterface 178 1 0
    //   242: aconst_null
    //   243: areturn
    //   244: astore_3
    //   245: aconst_null
    //   246: astore 4
    //   248: aload_3
    //   249: astore 5
    //   251: aload 4
    //   253: ifnull +10 -> 263
    //   256: aload 4
    //   258: invokeinterface 178 1 0
    //   263: aload 5
    //   265: athrow
    //   266: astore 5
    //   268: goto -17 -> 251
    //   271: astore 6
    //   273: goto -70 -> 203
    //
    // Exception table:
    //   from	to	target	type
    //   30	44	198	java/lang/Exception
    //   30	44	244	finally
    //   53	139	266	finally
    //   144	162	266	finally
    //   203	227	266	finally
    //   53	139	271	java/lang/Exception
    //   144	162	271	java/lang/Exception
  }

  private boolean iE(String paramString)
  {
    z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[delete] labelID:%s", new Object[] { paramString });
    z.d("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[query] SQL:%s", new Object[] { "labelID =? " });
    String[] arrayOfString = { paramString };
    try
    {
      int j = this.dtV.delete("ContactLabel", "labelID =? ", arrayOfString);
      i = j;
      if (i > 0)
        return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.toString();
        z.w("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[delete] exception %s", arrayOfObject);
        int i = -1;
      }
    }
    return false;
  }

  private static String j(String paramString, List paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" ");
    if ((paramList != null) && (paramList.size() > 0))
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        k localk = (k)paramList.get(j);
        if (localk != null)
        {
          localStringBuilder.append(localk.field_labelID);
          if (j < i - 1)
            localStringBuilder.append(" ");
        }
      }
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localStringBuilder.toString();
      z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[genNotifyString] event:%s", arrayOfObject);
      return localStringBuilder.toString();
    }
    return null;
  }

  // ERROR //
  public final ArrayList D(ArrayList paramArrayList)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_1
    //   3: ifnull +10 -> 13
    //   6: aload_1
    //   7: invokevirtual 242	java/util/ArrayList:size	()I
    //   10: ifgt +7 -> 17
    //   13: aconst_null
    //   14: astore_3
    //   15: aload_3
    //   16: areturn
    //   17: aload_1
    //   18: invokevirtual 242	java/util/ArrayList:size	()I
    //   21: istore 4
    //   23: new 117	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   30: astore 5
    //   32: aload 5
    //   34: ldc 244
    //   36: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload 5
    //   42: ldc 246
    //   44: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: iconst_0
    //   49: istore 8
    //   51: iload 8
    //   53: iload 4
    //   55: if_icmpge +61 -> 116
    //   58: aload 5
    //   60: new 117	java/lang/StringBuilder
    //   63: dup
    //   64: ldc 248
    //   66: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   69: aload_1
    //   70: iload 8
    //   72: invokevirtual 251	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   75: checkcast 14	java/lang/String
    //   78: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: ldc 248
    //   83: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: iload 8
    //   95: iload 4
    //   97: iconst_1
    //   98: isub
    //   99: if_icmpge +11 -> 110
    //   102: aload 5
    //   104: ldc 253
    //   106: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: iinc 8 1
    //   113: goto -62 -> 51
    //   116: aload 5
    //   118: ldc 255
    //   120: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: aload 5
    //   126: ldc_w 257
    //   129: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload 5
    //   135: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: astore 11
    //   140: ldc 77
    //   142: ldc_w 259
    //   145: iconst_1
    //   146: anewarray 186	java/lang/Object
    //   149: dup
    //   150: iconst_0
    //   151: aload 11
    //   153: aastore
    //   154: invokestatic 222	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aload_0
    //   158: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   161: aload 11
    //   163: aconst_null
    //   164: invokeinterface 138 3 0
    //   169: astore 16
    //   171: aload 16
    //   173: astore 13
    //   175: aload 13
    //   177: ifnull +111 -> 288
    //   180: aload 13
    //   182: invokeinterface 144 1 0
    //   187: ifeq +101 -> 288
    //   190: new 41	java/util/ArrayList
    //   193: dup
    //   194: invokespecial 43	java/util/ArrayList:<init>	()V
    //   197: astore_3
    //   198: aload 13
    //   200: invokeinterface 262 1 0
    //   205: istore 17
    //   207: iload_2
    //   208: iload 17
    //   210: if_icmpge +39 -> 249
    //   213: aload 13
    //   215: iload_2
    //   216: invokeinterface 266 2 0
    //   221: pop
    //   222: aload_3
    //   223: aload 13
    //   225: aload 13
    //   227: ldc 212
    //   229: invokeinterface 150 2 0
    //   234: invokeinterface 154 2 0
    //   239: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   242: pop
    //   243: iinc 2 1
    //   246: goto -39 -> 207
    //   249: iconst_1
    //   250: anewarray 186	java/lang/Object
    //   253: astore 20
    //   255: aload 20
    //   257: iconst_0
    //   258: iload 17
    //   260: invokestatic 273	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   263: aastore
    //   264: ldc 77
    //   266: ldc_w 275
    //   269: aload 20
    //   271: invokestatic 222	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   274: aload 13
    //   276: ifnull -261 -> 15
    //   279: aload 13
    //   281: invokeinterface 178 1 0
    //   286: aload_3
    //   287: areturn
    //   288: aload 13
    //   290: ifnull +10 -> 300
    //   293: aload 13
    //   295: invokeinterface 178 1 0
    //   300: aconst_null
    //   301: areturn
    //   302: astore 14
    //   304: aconst_null
    //   305: astore 13
    //   307: iconst_1
    //   308: anewarray 186	java/lang/Object
    //   311: astore 15
    //   313: aload 15
    //   315: iconst_0
    //   316: aload 14
    //   318: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   321: aastore
    //   322: ldc 77
    //   324: ldc_w 277
    //   327: aload 15
    //   329: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   332: aload 13
    //   334: ifnull -34 -> 300
    //   337: aload 13
    //   339: invokeinterface 178 1 0
    //   344: goto -44 -> 300
    //   347: astore 12
    //   349: aconst_null
    //   350: astore 13
    //   352: aload 13
    //   354: ifnull +10 -> 364
    //   357: aload 13
    //   359: invokeinterface 178 1 0
    //   364: aload 12
    //   366: athrow
    //   367: astore 12
    //   369: goto -17 -> 352
    //   372: astore 14
    //   374: goto -67 -> 307
    //
    // Exception table:
    //   from	to	target	type
    //   157	171	302	java/lang/Exception
    //   157	171	347	finally
    //   180	207	367	finally
    //   213	243	367	finally
    //   249	274	367	finally
    //   307	332	367	finally
    //   180	207	372	java/lang/Exception
    //   213	243	372	java/lang/Exception
    //   249	274	372	java/lang/Exception
  }

  public final int a(com.tencent.mm.as.f paramf)
  {
    if (paramf != null)
      this.dtV = paramf;
    return 0;
  }

  public final boolean a(k paramk, String[] paramArrayOfString)
  {
    return a(true, paramk, paramArrayOfString);
  }

  public final boolean aF(List paramList)
  {
    if (paramList.size() <= 0)
    {
      z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[insertAddLabel] list is null.");
      return false;
    }
    h localh2;
    long l;
    if ((this.dtV instanceof h))
    {
      localh2 = (h)this.dtV;
      l = localh2.dc(Thread.currentThread().getId());
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l);
      z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "begin insertOrUpdateList in a transaction, ticket = %d", arrayOfObject);
    }
    for (h localh1 = localh2; ; localh1 = null)
    {
      int i = paramList.size();
      new ArrayList();
      for (int j = 0; j < i; j++)
      {
        String str = c((k)paramList.get(j));
        if (!ch.jb(str))
          iE(str);
      }
      if (localh1 == null)
        break;
      localh1.dd(l);
      z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "end deleteLocalLabel transaction");
      return false;
      l = -1L;
    }
  }

  public final boolean aG(List paramList)
  {
    if (paramList.size() <= 0)
    {
      z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[insertOrUpdateList] list is null.");
      return false;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    h localh2;
    long l;
    if ((this.dtV instanceof h))
    {
      localh2 = (h)this.dtV;
      l = localh2.dc(Thread.currentThread().getId());
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l);
      z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "begin insertOrUpdateList in a transaction, ticket = %d", arrayOfObject);
    }
    for (h localh1 = localh2; ; localh1 = null)
    {
      int i = paramList.size();
      int j = 0;
      if (j < i)
      {
        k localk = (k)paramList.get(j);
        if (localk != null)
        {
          int k = b(localk);
          switch (m.ihZ[(k - 1)])
          {
          default:
            z.w("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[insertOrUpdateList] unknow result.");
          case 1:
          case 2:
          case 3:
          }
        }
        while (true)
        {
          j++;
          break;
          b(false, localk, new String[] { "labelID" });
          localArrayList2.add(localk);
          continue;
          localk.field_createTime = System.currentTimeMillis();
          a(false, localk);
          localArrayList1.add(localk);
        }
      }
      if (localh1 != null)
      {
        localh1.dd(l);
        z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "end insertOrUpdateList transaction");
      }
      if (localArrayList1.size() > 0)
        Ba(j("insert", localArrayList1));
      if (localArrayList2.size() <= 0)
        break;
      Ba(j("update", localArrayList2));
      return false;
      l = -1L;
    }
  }

  public final boolean aH(List paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0))
    {
      z.w("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[deleteList] list is null.");
      return false;
    }
    h localh2;
    long l;
    if ((this.dtV instanceof h))
    {
      localh2 = (h)this.dtV;
      l = localh2.dc(Thread.currentThread().getId());
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l);
      z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "begin deleteList in a transaction, ticket = %d", arrayOfObject);
    }
    for (h localh1 = localh2; ; localh1 = null)
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
        a(false, (k)paramList.get(j), new String[] { "labelID" });
      if (localh1 != null)
      {
        localh1.dd(l);
        z.i("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "end insertOrUpdateList transaction");
      }
      Ba(j("delete", paramList));
      aIn();
      return true;
      l = -1L;
    }
  }

  // ERROR //
  public final ArrayList aI(List paramList)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_1
    //   3: invokeinterface 233 1 0
    //   8: ifgt +9 -> 17
    //   11: aconst_null
    //   12: astore 16
    //   14: aload 16
    //   16: areturn
    //   17: aload_1
    //   18: invokeinterface 233 1 0
    //   23: istore_3
    //   24: new 117	java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   31: astore 4
    //   33: aload 4
    //   35: ldc_w 365
    //   38: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload 4
    //   44: ldc_w 367
    //   47: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: iconst_0
    //   52: istore 7
    //   54: iload 7
    //   56: iload_3
    //   57: if_icmpge +67 -> 124
    //   60: aload 4
    //   62: new 117	java/lang/StringBuilder
    //   65: dup
    //   66: ldc_w 369
    //   69: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: aload_1
    //   73: iload 7
    //   75: invokeinterface 237 2 0
    //   80: checkcast 16	com/tencent/mm/storage/k
    //   83: getfield 122	com/tencent/mm/storage/k:field_labelID	I
    //   86: invokevirtual 126	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   89: ldc_w 369
    //   92: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: iload 7
    //   104: iload_3
    //   105: iconst_1
    //   106: isub
    //   107: if_icmpge +11 -> 118
    //   110: aload 4
    //   112: ldc 253
    //   114: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: pop
    //   118: iinc 7 1
    //   121: goto -67 -> 54
    //   124: aload 4
    //   126: ldc 255
    //   128: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: aload 4
    //   134: ldc_w 257
    //   137: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload 4
    //   143: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: astore 10
    //   148: ldc 77
    //   150: ldc_w 371
    //   153: iconst_1
    //   154: anewarray 186	java/lang/Object
    //   157: dup
    //   158: iconst_0
    //   159: aload 10
    //   161: aastore
    //   162: invokestatic 222	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload_0
    //   166: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   169: aload 10
    //   171: aconst_null
    //   172: invokeinterface 138 3 0
    //   177: astore 15
    //   179: aload 15
    //   181: astore 12
    //   183: aload 12
    //   185: ifnull +116 -> 301
    //   188: aload 12
    //   190: invokeinterface 144 1 0
    //   195: ifeq +106 -> 301
    //   198: new 41	java/util/ArrayList
    //   201: dup
    //   202: invokespecial 43	java/util/ArrayList:<init>	()V
    //   205: astore 16
    //   207: aload 12
    //   209: invokeinterface 262 1 0
    //   214: istore 17
    //   216: iload_2
    //   217: iload 17
    //   219: if_icmpge +42 -> 261
    //   222: aload 12
    //   224: iload_2
    //   225: invokeinterface 266 2 0
    //   230: pop
    //   231: new 16	com/tencent/mm/storage/k
    //   234: dup
    //   235: invokespecial 372	com/tencent/mm/storage/k:<init>	()V
    //   238: astore 19
    //   240: aload 19
    //   242: aload 12
    //   244: invokevirtual 375	com/tencent/mm/storage/k:b	(Landroid/database/Cursor;)V
    //   247: aload 16
    //   249: aload 19
    //   251: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   254: pop
    //   255: iinc 2 1
    //   258: goto -42 -> 216
    //   261: iconst_1
    //   262: anewarray 186	java/lang/Object
    //   265: astore 21
    //   267: aload 21
    //   269: iconst_0
    //   270: iload 17
    //   272: invokestatic 273	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   275: aastore
    //   276: ldc 77
    //   278: ldc_w 377
    //   281: aload 21
    //   283: invokestatic 222	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: aload 12
    //   288: ifnull -274 -> 14
    //   291: aload 12
    //   293: invokeinterface 178 1 0
    //   298: aload 16
    //   300: areturn
    //   301: aload 12
    //   303: ifnull +10 -> 313
    //   306: aload 12
    //   308: invokeinterface 178 1 0
    //   313: aconst_null
    //   314: areturn
    //   315: astore 13
    //   317: aconst_null
    //   318: astore 12
    //   320: iconst_1
    //   321: anewarray 186	java/lang/Object
    //   324: astore 14
    //   326: aload 14
    //   328: iconst_0
    //   329: aload 13
    //   331: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   334: aastore
    //   335: ldc 77
    //   337: ldc_w 379
    //   340: aload 14
    //   342: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   345: aload 12
    //   347: ifnull -34 -> 313
    //   350: aload 12
    //   352: invokeinterface 178 1 0
    //   357: goto -44 -> 313
    //   360: astore 11
    //   362: aconst_null
    //   363: astore 12
    //   365: aload 12
    //   367: ifnull +10 -> 377
    //   370: aload 12
    //   372: invokeinterface 178 1 0
    //   377: aload 11
    //   379: athrow
    //   380: astore 11
    //   382: goto -17 -> 365
    //   385: astore 13
    //   387: goto -67 -> 320
    //
    // Exception table:
    //   from	to	target	type
    //   165	179	315	java/lang/Exception
    //   165	179	360	finally
    //   188	216	380	finally
    //   222	255	380	finally
    //   261	286	380	finally
    //   320	345	380	finally
    //   188	216	385	java/lang/Exception
    //   222	255	385	java/lang/Exception
    //   261	286	385	java/lang/Exception
  }

  // ERROR //
  public final ArrayList aIl()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   4: ldc 22
    //   6: iconst_1
    //   7: anewarray 14	java/lang/String
    //   10: dup
    //   11: iconst_0
    //   12: ldc 146
    //   14: aastore
    //   15: aconst_null
    //   16: aconst_null
    //   17: aconst_null
    //   18: ldc_w 383
    //   21: invokeinterface 386 7 0
    //   26: astore 5
    //   28: aload 5
    //   30: astore_2
    //   31: aload_2
    //   32: ifnull +80 -> 112
    //   35: aload_2
    //   36: invokeinterface 144 1 0
    //   41: ifeq +71 -> 112
    //   44: new 41	java/util/ArrayList
    //   47: dup
    //   48: invokespecial 43	java/util/ArrayList:<init>	()V
    //   51: astore 6
    //   53: aload_2
    //   54: invokeinterface 262 1 0
    //   59: istore 7
    //   61: iconst_0
    //   62: istore 8
    //   64: iload 8
    //   66: iload 7
    //   68: if_icmpge +31 -> 99
    //   71: aload_2
    //   72: iload 8
    //   74: invokeinterface 266 2 0
    //   79: pop
    //   80: aload 6
    //   82: aload_2
    //   83: iconst_0
    //   84: invokeinterface 154 2 0
    //   89: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   92: pop
    //   93: iinc 8 1
    //   96: goto -32 -> 64
    //   99: aload_2
    //   100: ifnull +9 -> 109
    //   103: aload_2
    //   104: invokeinterface 178 1 0
    //   109: aload 6
    //   111: areturn
    //   112: aload_2
    //   113: ifnull +9 -> 122
    //   116: aload_2
    //   117: invokeinterface 178 1 0
    //   122: aconst_null
    //   123: areturn
    //   124: astore_3
    //   125: aconst_null
    //   126: astore_2
    //   127: iconst_1
    //   128: anewarray 186	java/lang/Object
    //   131: astore 4
    //   133: aload 4
    //   135: iconst_0
    //   136: aload_3
    //   137: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   140: aastore
    //   141: ldc 77
    //   143: ldc_w 388
    //   146: aload 4
    //   148: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: aload_2
    //   152: ifnull -30 -> 122
    //   155: aload_2
    //   156: invokeinterface 178 1 0
    //   161: goto -39 -> 122
    //   164: astore_1
    //   165: aconst_null
    //   166: astore_2
    //   167: aload_2
    //   168: ifnull +9 -> 177
    //   171: aload_2
    //   172: invokeinterface 178 1 0
    //   177: aload_1
    //   178: athrow
    //   179: astore_1
    //   180: goto -13 -> 167
    //   183: astore_3
    //   184: goto -57 -> 127
    //
    // Exception table:
    //   from	to	target	type
    //   0	28	124	java/lang/Exception
    //   0	28	164	finally
    //   35	61	179	finally
    //   71	93	179	finally
    //   127	151	179	finally
    //   35	61	183	java/lang/Exception
    //   71	93	183	java/lang/Exception
  }

  // ERROR //
  public final ArrayList aIm()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   6: ldc_w 391
    //   9: aconst_null
    //   10: invokeinterface 138 3 0
    //   15: astore 6
    //   17: aload 6
    //   19: astore_3
    //   20: aload_3
    //   21: ifnull +132 -> 153
    //   24: aload_3
    //   25: invokeinterface 144 1 0
    //   30: ifeq +123 -> 153
    //   33: new 41	java/util/ArrayList
    //   36: dup
    //   37: invokespecial 43	java/util/ArrayList:<init>	()V
    //   40: astore 7
    //   42: aload_3
    //   43: invokeinterface 262 1 0
    //   48: istore 8
    //   50: iload_1
    //   51: iload 8
    //   53: if_icmpge +87 -> 140
    //   56: aload_3
    //   57: iload_1
    //   58: invokeinterface 266 2 0
    //   63: pop
    //   64: new 16	com/tencent/mm/storage/k
    //   67: dup
    //   68: invokespecial 372	com/tencent/mm/storage/k:<init>	()V
    //   71: astore 10
    //   73: aload 10
    //   75: aload_3
    //   76: invokevirtual 375	com/tencent/mm/storage/k:b	(Landroid/database/Cursor;)V
    //   79: iconst_2
    //   80: anewarray 186	java/lang/Object
    //   83: astore 11
    //   85: aload 11
    //   87: iconst_0
    //   88: aload 10
    //   90: getfield 166	com/tencent/mm/storage/k:field_labelName	Ljava/lang/String;
    //   93: aastore
    //   94: aload 11
    //   96: iconst_1
    //   97: new 117	java/lang/StringBuilder
    //   100: dup
    //   101: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   104: aload 10
    //   106: getfield 352	com/tencent/mm/storage/k:field_createTime	J
    //   109: invokevirtual 394	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   112: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: aastore
    //   116: ldc 77
    //   118: ldc_w 396
    //   121: aload 11
    //   123: invokestatic 222	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   126: aload 7
    //   128: aload 10
    //   130: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   133: pop
    //   134: iinc 1 1
    //   137: goto -87 -> 50
    //   140: aload_3
    //   141: ifnull +9 -> 150
    //   144: aload_3
    //   145: invokeinterface 178 1 0
    //   150: aload 7
    //   152: areturn
    //   153: aload_3
    //   154: ifnull +9 -> 163
    //   157: aload_3
    //   158: invokeinterface 178 1 0
    //   163: aconst_null
    //   164: areturn
    //   165: astore 4
    //   167: aconst_null
    //   168: astore_3
    //   169: iconst_1
    //   170: anewarray 186	java/lang/Object
    //   173: astore 5
    //   175: aload 5
    //   177: iconst_0
    //   178: aload 4
    //   180: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   183: aastore
    //   184: ldc 77
    //   186: ldc_w 398
    //   189: aload 5
    //   191: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_3
    //   195: ifnull -32 -> 163
    //   198: aload_3
    //   199: invokeinterface 178 1 0
    //   204: goto -41 -> 163
    //   207: astore_2
    //   208: aconst_null
    //   209: astore_3
    //   210: aload_3
    //   211: ifnull +9 -> 220
    //   214: aload_3
    //   215: invokeinterface 178 1 0
    //   220: aload_2
    //   221: athrow
    //   222: astore_2
    //   223: goto -13 -> 210
    //   226: astore 4
    //   228: goto -59 -> 169
    //
    // Exception table:
    //   from	to	target	type
    //   2	17	165	java/lang/Exception
    //   2	17	207	finally
    //   24	50	222	finally
    //   56	134	222	finally
    //   169	194	222	finally
    //   24	50	226	java/lang/Exception
    //   56	134	226	java/lang/Exception
  }

  public final boolean b(k paramk, String[] paramArrayOfString)
  {
    return b(true, paramk, paramArrayOfString);
  }

  // ERROR //
  public final ArrayList i(String paramString, List paramList)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc 77
    //   4: ldc 217
    //   6: iconst_1
    //   7: anewarray 186	java/lang/Object
    //   10: dup
    //   11: iconst_0
    //   12: ldc_w 401
    //   15: aastore
    //   16: invokestatic 222	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   19: iconst_3
    //   20: anewarray 14	java/lang/String
    //   23: astore 4
    //   25: aload 4
    //   27: iconst_0
    //   28: new 117	java/lang/StringBuilder
    //   31: dup
    //   32: ldc_w 403
    //   35: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: aload_1
    //   39: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc_w 403
    //   45: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: aastore
    //   52: aload 4
    //   54: iconst_1
    //   55: new 117	java/lang/StringBuilder
    //   58: dup
    //   59: ldc_w 403
    //   62: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   65: aload_1
    //   66: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: ldc_w 403
    //   72: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: aastore
    //   79: aload 4
    //   81: iconst_2
    //   82: new 117	java/lang/StringBuilder
    //   85: dup
    //   86: ldc_w 403
    //   89: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: aload_1
    //   93: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc_w 403
    //   99: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: aastore
    //   106: aload_0
    //   107: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   110: ldc_w 401
    //   113: aload 4
    //   115: invokeinterface 138 3 0
    //   120: astore 9
    //   122: aload 9
    //   124: astore 6
    //   126: aload 6
    //   128: ifnull +117 -> 245
    //   131: aload 6
    //   133: invokeinterface 144 1 0
    //   138: ifeq +107 -> 245
    //   141: new 41	java/util/ArrayList
    //   144: dup
    //   145: invokespecial 43	java/util/ArrayList:<init>	()V
    //   148: astore 10
    //   150: aload 6
    //   152: invokeinterface 262 1 0
    //   157: istore 11
    //   159: iload_3
    //   160: iload 11
    //   162: if_icmpge +68 -> 230
    //   165: aload 6
    //   167: iload_3
    //   168: invokeinterface 266 2 0
    //   173: pop
    //   174: aload 6
    //   176: aload 6
    //   178: ldc 146
    //   180: invokeinterface 150 2 0
    //   185: invokeinterface 154 2 0
    //   190: astore 13
    //   192: aload_2
    //   193: ifnull +23 -> 216
    //   196: aload_2
    //   197: invokeinterface 233 1 0
    //   202: ifle +14 -> 216
    //   205: aload_2
    //   206: aload 13
    //   208: invokeinterface 406 2 0
    //   213: ifne +11 -> 224
    //   216: aload 10
    //   218: aload 13
    //   220: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   223: pop
    //   224: iinc 3 1
    //   227: goto -68 -> 159
    //   230: aload 6
    //   232: ifnull +10 -> 242
    //   235: aload 6
    //   237: invokeinterface 178 1 0
    //   242: aload 10
    //   244: areturn
    //   245: aload 6
    //   247: ifnull +10 -> 257
    //   250: aload 6
    //   252: invokeinterface 178 1 0
    //   257: aconst_null
    //   258: areturn
    //   259: astore 7
    //   261: aconst_null
    //   262: astore 6
    //   264: iconst_1
    //   265: anewarray 186	java/lang/Object
    //   268: astore 8
    //   270: aload 8
    //   272: iconst_0
    //   273: aload 7
    //   275: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   278: aastore
    //   279: ldc 77
    //   281: ldc_w 408
    //   284: aload 8
    //   286: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   289: aload 6
    //   291: ifnull -34 -> 257
    //   294: aload 6
    //   296: invokeinterface 178 1 0
    //   301: goto -44 -> 257
    //   304: astore 5
    //   306: aconst_null
    //   307: astore 6
    //   309: aload 6
    //   311: ifnull +10 -> 321
    //   314: aload 6
    //   316: invokeinterface 178 1 0
    //   321: aload 5
    //   323: athrow
    //   324: astore 5
    //   326: goto -17 -> 309
    //   329: astore 7
    //   331: goto -67 -> 264
    //
    // Exception table:
    //   from	to	target	type
    //   106	122	259	java/lang/Exception
    //   106	122	304	finally
    //   131	159	324	finally
    //   165	192	324	finally
    //   196	216	324	finally
    //   216	224	324	finally
    //   264	289	324	finally
    //   131	159	329	java/lang/Exception
    //   165	192	329	java/lang/Exception
    //   196	216	329	java/lang/Exception
    //   216	224	329	java/lang/Exception
  }

  // ERROR //
  public final String mL(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 14	java/lang/String
    //   4: dup
    //   5: iconst_0
    //   6: aload_1
    //   7: aastore
    //   8: astore_2
    //   9: aload_0
    //   10: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   13: ldc 22
    //   15: iconst_1
    //   16: anewarray 14	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: ldc 146
    //   23: aastore
    //   24: ldc_w 412
    //   27: aload_2
    //   28: aconst_null
    //   29: aconst_null
    //   30: invokeinterface 386 7 0
    //   35: astore 7
    //   37: aload 7
    //   39: astore 4
    //   41: aload 4
    //   43: ifnull +63 -> 106
    //   46: aload 4
    //   48: invokeinterface 144 1 0
    //   53: ifeq +53 -> 106
    //   56: aload 4
    //   58: aload 4
    //   60: ldc 146
    //   62: invokeinterface 150 2 0
    //   67: invokeinterface 154 2 0
    //   72: astore 8
    //   74: ldc 77
    //   76: ldc_w 414
    //   79: iconst_1
    //   80: anewarray 186	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload 8
    //   87: aastore
    //   88: invokestatic 210	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aload 4
    //   93: ifnull +10 -> 103
    //   96: aload 4
    //   98: invokeinterface 178 1 0
    //   103: aload 8
    //   105: areturn
    //   106: aload 4
    //   108: ifnull +10 -> 118
    //   111: aload 4
    //   113: invokeinterface 178 1 0
    //   118: aconst_null
    //   119: areturn
    //   120: astore 5
    //   122: aconst_null
    //   123: astore 4
    //   125: iconst_1
    //   126: anewarray 186	java/lang/Object
    //   129: astore 6
    //   131: aload 6
    //   133: iconst_0
    //   134: aload 5
    //   136: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   139: aastore
    //   140: ldc 77
    //   142: ldc_w 416
    //   145: aload 6
    //   147: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: aload 4
    //   152: ifnull -34 -> 118
    //   155: aload 4
    //   157: invokeinterface 178 1 0
    //   162: goto -44 -> 118
    //   165: astore_3
    //   166: aconst_null
    //   167: astore 4
    //   169: aload 4
    //   171: ifnull +10 -> 181
    //   174: aload 4
    //   176: invokeinterface 178 1 0
    //   181: aload_3
    //   182: athrow
    //   183: astore_3
    //   184: goto -15 -> 169
    //   187: astore 5
    //   189: goto -64 -> 125
    //
    // Exception table:
    //   from	to	target	type
    //   9	37	120	java/lang/Exception
    //   9	37	165	finally
    //   46	91	183	finally
    //   125	150	183	finally
    //   46	91	187	java/lang/Exception
  }

  // ERROR //
  public final String mM(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 14	java/lang/String
    //   4: dup
    //   5: iconst_0
    //   6: aload_1
    //   7: aastore
    //   8: astore_2
    //   9: aload_0
    //   10: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   13: ldc 22
    //   15: iconst_1
    //   16: anewarray 14	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: ldc 212
    //   23: aastore
    //   24: ldc_w 419
    //   27: aload_2
    //   28: aconst_null
    //   29: aconst_null
    //   30: invokeinterface 386 7 0
    //   35: astore 7
    //   37: aload 7
    //   39: astore 4
    //   41: aload 4
    //   43: ifnull +63 -> 106
    //   46: aload 4
    //   48: invokeinterface 144 1 0
    //   53: ifeq +53 -> 106
    //   56: aload 4
    //   58: aload 4
    //   60: ldc 212
    //   62: invokeinterface 150 2 0
    //   67: invokeinterface 154 2 0
    //   72: astore 8
    //   74: ldc 77
    //   76: ldc_w 421
    //   79: iconst_1
    //   80: anewarray 186	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload 8
    //   87: aastore
    //   88: invokestatic 210	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aload 4
    //   93: ifnull +10 -> 103
    //   96: aload 4
    //   98: invokeinterface 178 1 0
    //   103: aload 8
    //   105: areturn
    //   106: aload 4
    //   108: ifnull +10 -> 118
    //   111: aload 4
    //   113: invokeinterface 178 1 0
    //   118: aconst_null
    //   119: areturn
    //   120: astore 5
    //   122: aconst_null
    //   123: astore 4
    //   125: iconst_1
    //   126: anewarray 186	java/lang/Object
    //   129: astore 6
    //   131: aload 6
    //   133: iconst_0
    //   134: aload 5
    //   136: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   139: aastore
    //   140: ldc 77
    //   142: ldc_w 423
    //   145: aload 6
    //   147: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: aload 4
    //   152: ifnull -34 -> 118
    //   155: aload 4
    //   157: invokeinterface 178 1 0
    //   162: goto -44 -> 118
    //   165: astore_3
    //   166: aconst_null
    //   167: astore 4
    //   169: aload 4
    //   171: ifnull +10 -> 181
    //   174: aload 4
    //   176: invokeinterface 178 1 0
    //   181: aload_3
    //   182: athrow
    //   183: astore_3
    //   184: goto -15 -> 169
    //   187: astore 5
    //   189: goto -64 -> 125
    //
    // Exception table:
    //   from	to	target	type
    //   9	37	120	java/lang/Exception
    //   9	37	165	finally
    //   46	91	183	finally
    //   125	150	183	finally
    //   46	91	187	java/lang/Exception
  }

  // ERROR //
  public final ArrayList y(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_1
    //   3: ifnull +8 -> 11
    //   6: aload_1
    //   7: arraylength
    //   8: ifgt +7 -> 15
    //   11: aconst_null
    //   12: astore_3
    //   13: aload_3
    //   14: areturn
    //   15: aload_1
    //   16: arraylength
    //   17: istore 4
    //   19: new 117	java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   26: astore 5
    //   28: aload 5
    //   30: ldc_w 365
    //   33: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload 5
    //   39: ldc 246
    //   41: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: iconst_0
    //   46: istore 8
    //   48: iload 8
    //   50: iload 4
    //   52: if_icmpge +58 -> 110
    //   55: aload 5
    //   57: new 117	java/lang/StringBuilder
    //   60: dup
    //   61: ldc_w 369
    //   64: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: aload_1
    //   68: iload 8
    //   70: aaload
    //   71: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: ldc_w 369
    //   77: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: iload 8
    //   89: iload 4
    //   91: iconst_1
    //   92: isub
    //   93: if_icmpge +11 -> 104
    //   96: aload 5
    //   98: ldc 253
    //   100: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: iinc 8 1
    //   107: goto -59 -> 48
    //   110: aload 5
    //   112: ldc 255
    //   114: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: pop
    //   118: aload 5
    //   120: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: astore 10
    //   125: ldc 77
    //   127: ldc_w 427
    //   130: iconst_1
    //   131: anewarray 186	java/lang/Object
    //   134: dup
    //   135: iconst_0
    //   136: aload 10
    //   138: aastore
    //   139: invokestatic 222	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: aload_0
    //   143: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   146: aload 10
    //   148: aconst_null
    //   149: invokeinterface 138 3 0
    //   154: astore 15
    //   156: aload 15
    //   158: astore 12
    //   160: aload 12
    //   162: ifnull +111 -> 273
    //   165: aload 12
    //   167: invokeinterface 144 1 0
    //   172: ifeq +101 -> 273
    //   175: new 41	java/util/ArrayList
    //   178: dup
    //   179: invokespecial 43	java/util/ArrayList:<init>	()V
    //   182: astore_3
    //   183: aload 12
    //   185: invokeinterface 262 1 0
    //   190: istore 16
    //   192: iload_2
    //   193: iload 16
    //   195: if_icmpge +39 -> 234
    //   198: aload 12
    //   200: iload_2
    //   201: invokeinterface 266 2 0
    //   206: pop
    //   207: aload_3
    //   208: aload 12
    //   210: aload 12
    //   212: ldc 146
    //   214: invokeinterface 150 2 0
    //   219: invokeinterface 154 2 0
    //   224: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   227: pop
    //   228: iinc 2 1
    //   231: goto -39 -> 192
    //   234: iconst_1
    //   235: anewarray 186	java/lang/Object
    //   238: astore 19
    //   240: aload 19
    //   242: iconst_0
    //   243: iload 16
    //   245: invokestatic 273	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   248: aastore
    //   249: ldc 77
    //   251: ldc_w 429
    //   254: aload 19
    //   256: invokestatic 222	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: aload 12
    //   261: ifnull -248 -> 13
    //   264: aload 12
    //   266: invokeinterface 178 1 0
    //   271: aload_3
    //   272: areturn
    //   273: aload 12
    //   275: ifnull +10 -> 285
    //   278: aload 12
    //   280: invokeinterface 178 1 0
    //   285: aconst_null
    //   286: areturn
    //   287: astore 13
    //   289: aconst_null
    //   290: astore 12
    //   292: iconst_1
    //   293: anewarray 186	java/lang/Object
    //   296: astore 14
    //   298: aload 14
    //   300: iconst_0
    //   301: aload 13
    //   303: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   306: aastore
    //   307: ldc 77
    //   309: ldc_w 431
    //   312: aload 14
    //   314: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   317: aload 12
    //   319: ifnull -34 -> 285
    //   322: aload 12
    //   324: invokeinterface 178 1 0
    //   329: goto -44 -> 285
    //   332: astore 11
    //   334: aconst_null
    //   335: astore 12
    //   337: aload 12
    //   339: ifnull +10 -> 349
    //   342: aload 12
    //   344: invokeinterface 178 1 0
    //   349: aload 11
    //   351: athrow
    //   352: astore 11
    //   354: goto -17 -> 337
    //   357: astore 13
    //   359: goto -67 -> 292
    //
    // Exception table:
    //   from	to	target	type
    //   142	156	287	java/lang/Exception
    //   142	156	332	finally
    //   165	192	352	finally
    //   198	228	352	finally
    //   234	259	352	finally
    //   292	317	352	finally
    //   165	192	357	java/lang/Exception
    //   198	228	357	java/lang/Exception
    //   234	259	357	java/lang/Exception
  }

  // ERROR //
  public final ArrayList yf(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 77
    //   4: ldc_w 435
    //   7: iconst_1
    //   8: anewarray 186	java/lang/Object
    //   11: dup
    //   12: iconst_0
    //   13: ldc_w 437
    //   16: aastore
    //   17: invokestatic 222	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   20: bipush 6
    //   22: anewarray 14	java/lang/String
    //   25: astore_3
    //   26: aload_3
    //   27: iconst_0
    //   28: new 117	java/lang/StringBuilder
    //   31: dup
    //   32: ldc_w 439
    //   35: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: aload_1
    //   39: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc_w 403
    //   45: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: aastore
    //   52: aload_3
    //   53: iconst_1
    //   54: new 117	java/lang/StringBuilder
    //   57: dup
    //   58: ldc_w 439
    //   61: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: aload_1
    //   65: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc_w 441
    //   71: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: aastore
    //   78: aload_3
    //   79: iconst_2
    //   80: new 117	java/lang/StringBuilder
    //   83: dup
    //   84: ldc_w 403
    //   87: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   90: aload_1
    //   91: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc_w 441
    //   97: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: aastore
    //   104: aload_3
    //   105: iconst_3
    //   106: new 117	java/lang/StringBuilder
    //   109: dup
    //   110: ldc_w 403
    //   113: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   116: aload_1
    //   117: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: ldc_w 443
    //   123: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: aastore
    //   130: aload_3
    //   131: iconst_4
    //   132: aload_1
    //   133: aastore
    //   134: aload_3
    //   135: iconst_5
    //   136: new 117	java/lang/StringBuilder
    //   139: dup
    //   140: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   143: invokestatic 448	com/tencent/mm/g/a:uN	()I
    //   146: invokevirtual 126	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   149: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: aastore
    //   153: aload_0
    //   154: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   157: ldc_w 437
    //   160: aload_3
    //   161: invokeinterface 138 3 0
    //   166: astore 8
    //   168: aload 8
    //   170: astore 5
    //   172: aload 5
    //   174: ifnull +91 -> 265
    //   177: aload 5
    //   179: invokeinterface 144 1 0
    //   184: ifeq +81 -> 265
    //   187: new 41	java/util/ArrayList
    //   190: dup
    //   191: invokespecial 43	java/util/ArrayList:<init>	()V
    //   194: astore 9
    //   196: aload 5
    //   198: invokeinterface 262 1 0
    //   203: istore 10
    //   205: iload_2
    //   206: iload 10
    //   208: if_icmpge +42 -> 250
    //   211: aload 5
    //   213: iload_2
    //   214: invokeinterface 266 2 0
    //   219: pop
    //   220: new 450	com/tencent/mm/storage/i
    //   223: dup
    //   224: invokespecial 451	com/tencent/mm/storage/i:<init>	()V
    //   227: astore 12
    //   229: aload 12
    //   231: aload 5
    //   233: invokevirtual 452	com/tencent/mm/storage/i:b	(Landroid/database/Cursor;)V
    //   236: aload 9
    //   238: aload 12
    //   240: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   243: pop
    //   244: iinc 2 1
    //   247: goto -42 -> 205
    //   250: aload 5
    //   252: ifnull +10 -> 262
    //   255: aload 5
    //   257: invokeinterface 178 1 0
    //   262: aload 9
    //   264: areturn
    //   265: aload 5
    //   267: ifnull +10 -> 277
    //   270: aload 5
    //   272: invokeinterface 178 1 0
    //   277: aconst_null
    //   278: areturn
    //   279: astore 6
    //   281: aconst_null
    //   282: astore 5
    //   284: iconst_1
    //   285: anewarray 186	java/lang/Object
    //   288: astore 7
    //   290: aload 7
    //   292: iconst_0
    //   293: aload 6
    //   295: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   298: aastore
    //   299: ldc 77
    //   301: ldc_w 454
    //   304: aload 7
    //   306: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   309: aload 5
    //   311: ifnull -34 -> 277
    //   314: aload 5
    //   316: invokeinterface 178 1 0
    //   321: goto -44 -> 277
    //   324: astore 4
    //   326: aconst_null
    //   327: astore 5
    //   329: aload 5
    //   331: ifnull +10 -> 341
    //   334: aload 5
    //   336: invokeinterface 178 1 0
    //   341: aload 4
    //   343: athrow
    //   344: astore 4
    //   346: goto -17 -> 329
    //   349: astore 6
    //   351: goto -67 -> 284
    //
    // Exception table:
    //   from	to	target	type
    //   153	168	279	java/lang/Exception
    //   153	168	324	finally
    //   177	205	344	finally
    //   211	244	344	finally
    //   284	309	344	finally
    //   177	205	349	java/lang/Exception
    //   211	244	349	java/lang/Exception
  }

  // ERROR //
  public final ArrayList yg(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 77
    //   4: ldc_w 435
    //   7: iconst_1
    //   8: anewarray 186	java/lang/Object
    //   11: dup
    //   12: iconst_0
    //   13: ldc_w 457
    //   16: aastore
    //   17: invokestatic 222	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   20: bipush 6
    //   22: anewarray 14	java/lang/String
    //   25: astore_3
    //   26: aload_3
    //   27: iconst_0
    //   28: new 117	java/lang/StringBuilder
    //   31: dup
    //   32: ldc_w 439
    //   35: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: aload_1
    //   39: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc_w 403
    //   45: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: aastore
    //   52: aload_3
    //   53: iconst_1
    //   54: new 117	java/lang/StringBuilder
    //   57: dup
    //   58: ldc_w 439
    //   61: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: aload_1
    //   65: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc_w 441
    //   71: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: aastore
    //   78: aload_3
    //   79: iconst_2
    //   80: new 117	java/lang/StringBuilder
    //   83: dup
    //   84: ldc_w 403
    //   87: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   90: aload_1
    //   91: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc_w 441
    //   97: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: aastore
    //   104: aload_3
    //   105: iconst_3
    //   106: new 117	java/lang/StringBuilder
    //   109: dup
    //   110: ldc_w 403
    //   113: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   116: aload_1
    //   117: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: ldc_w 443
    //   123: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: aastore
    //   130: aload_3
    //   131: iconst_4
    //   132: aload_1
    //   133: aastore
    //   134: aload_3
    //   135: iconst_5
    //   136: new 117	java/lang/StringBuilder
    //   139: dup
    //   140: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   143: invokestatic 448	com/tencent/mm/g/a:uN	()I
    //   146: invokevirtual 126	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   149: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: aastore
    //   153: aload_0
    //   154: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   157: ldc_w 457
    //   160: aload_3
    //   161: invokeinterface 138 3 0
    //   166: astore 8
    //   168: aload 8
    //   170: astore 5
    //   172: aload 5
    //   174: ifnull +94 -> 268
    //   177: aload 5
    //   179: invokeinterface 144 1 0
    //   184: ifeq +84 -> 268
    //   187: new 41	java/util/ArrayList
    //   190: dup
    //   191: invokespecial 43	java/util/ArrayList:<init>	()V
    //   194: astore 9
    //   196: aload 5
    //   198: invokeinterface 262 1 0
    //   203: istore 10
    //   205: iload_2
    //   206: iload 10
    //   208: if_icmpge +45 -> 253
    //   211: aload 5
    //   213: iload_2
    //   214: invokeinterface 266 2 0
    //   219: pop
    //   220: new 450	com/tencent/mm/storage/i
    //   223: dup
    //   224: invokespecial 451	com/tencent/mm/storage/i:<init>	()V
    //   227: astore 12
    //   229: aload 12
    //   231: aload 5
    //   233: invokevirtual 452	com/tencent/mm/storage/i:b	(Landroid/database/Cursor;)V
    //   236: aload 9
    //   238: aload 12
    //   240: invokevirtual 460	com/tencent/mm/storage/i:getUsername	()Ljava/lang/String;
    //   243: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   246: pop
    //   247: iinc 2 1
    //   250: goto -45 -> 205
    //   253: aload 5
    //   255: ifnull +10 -> 265
    //   258: aload 5
    //   260: invokeinterface 178 1 0
    //   265: aload 9
    //   267: areturn
    //   268: aload 5
    //   270: ifnull +10 -> 280
    //   273: aload 5
    //   275: invokeinterface 178 1 0
    //   280: aconst_null
    //   281: areturn
    //   282: astore 6
    //   284: aconst_null
    //   285: astore 5
    //   287: iconst_1
    //   288: anewarray 186	java/lang/Object
    //   291: astore 7
    //   293: aload 7
    //   295: iconst_0
    //   296: aload 6
    //   298: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   301: aastore
    //   302: ldc 77
    //   304: ldc_w 454
    //   307: aload 7
    //   309: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   312: aload 5
    //   314: ifnull -34 -> 280
    //   317: aload 5
    //   319: invokeinterface 178 1 0
    //   324: goto -44 -> 280
    //   327: astore 4
    //   329: aconst_null
    //   330: astore 5
    //   332: aload 5
    //   334: ifnull +10 -> 344
    //   337: aload 5
    //   339: invokeinterface 178 1 0
    //   344: aload 4
    //   346: athrow
    //   347: astore 4
    //   349: goto -17 -> 332
    //   352: astore 6
    //   354: goto -67 -> 287
    //
    // Exception table:
    //   from	to	target	type
    //   153	168	282	java/lang/Exception
    //   153	168	327	finally
    //   177	205	347	finally
    //   211	247	347	finally
    //   287	312	347	finally
    //   177	205	352	java/lang/Exception
    //   211	247	352	java/lang/Exception
  }

  // ERROR //
  public final k yh(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_1
    //   3: anewarray 14	java/lang/String
    //   6: dup
    //   7: iconst_0
    //   8: aload_1
    //   9: aastore
    //   10: astore_3
    //   11: aload_0
    //   12: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   15: ldc 22
    //   17: bipush 6
    //   19: anewarray 14	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: ldc 212
    //   26: aastore
    //   27: dup
    //   28: iconst_1
    //   29: ldc_w 464
    //   32: aastore
    //   33: dup
    //   34: iconst_2
    //   35: ldc_w 466
    //   38: aastore
    //   39: dup
    //   40: iconst_3
    //   41: ldc 146
    //   43: aastore
    //   44: dup
    //   45: iconst_4
    //   46: ldc_w 468
    //   49: aastore
    //   50: dup
    //   51: iconst_5
    //   52: ldc_w 470
    //   55: aastore
    //   56: ldc_w 419
    //   59: aload_3
    //   60: aconst_null
    //   61: aconst_null
    //   62: invokeinterface 386 7 0
    //   67: astore 8
    //   69: aload 8
    //   71: astore 6
    //   73: aload 6
    //   75: ifnull +44 -> 119
    //   78: aload 6
    //   80: invokeinterface 144 1 0
    //   85: ifeq +34 -> 119
    //   88: new 16	com/tencent/mm/storage/k
    //   91: dup
    //   92: invokespecial 372	com/tencent/mm/storage/k:<init>	()V
    //   95: astore 9
    //   97: aload 9
    //   99: aload 6
    //   101: invokevirtual 375	com/tencent/mm/storage/k:b	(Landroid/database/Cursor;)V
    //   104: aload 6
    //   106: ifnull +10 -> 116
    //   109: aload 6
    //   111: invokeinterface 178 1 0
    //   116: aload 9
    //   118: areturn
    //   119: aload 6
    //   121: ifnull +10 -> 131
    //   124: aload 6
    //   126: invokeinterface 178 1 0
    //   131: aconst_null
    //   132: areturn
    //   133: astore 5
    //   135: aconst_null
    //   136: astore 6
    //   138: iconst_1
    //   139: anewarray 186	java/lang/Object
    //   142: astore 7
    //   144: aload 7
    //   146: iconst_0
    //   147: aload 5
    //   149: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   152: aastore
    //   153: ldc 77
    //   155: ldc_w 423
    //   158: aload 7
    //   160: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload 6
    //   165: ifnull -34 -> 131
    //   168: aload 6
    //   170: invokeinterface 178 1 0
    //   175: goto -44 -> 131
    //   178: astore 4
    //   180: aload_2
    //   181: ifnull +9 -> 190
    //   184: aload_2
    //   185: invokeinterface 178 1 0
    //   190: aload 4
    //   192: athrow
    //   193: astore 4
    //   195: aload 6
    //   197: astore_2
    //   198: goto -18 -> 180
    //   201: astore 5
    //   203: goto -65 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   11	69	133	java/lang/Exception
    //   11	69	178	finally
    //   78	104	193	finally
    //   138	163	193	finally
    //   78	104	201	java/lang/Exception
  }

  // ERROR //
  public final k yi(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_1
    //   3: anewarray 14	java/lang/String
    //   6: dup
    //   7: iconst_0
    //   8: aload_1
    //   9: aastore
    //   10: astore_3
    //   11: aload_0
    //   12: getfield 38	com/tencent/mm/storage/l:dtV	Lcom/tencent/mm/sdk/f/af;
    //   15: ldc 22
    //   17: bipush 6
    //   19: anewarray 14	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: ldc 212
    //   26: aastore
    //   27: dup
    //   28: iconst_1
    //   29: ldc_w 464
    //   32: aastore
    //   33: dup
    //   34: iconst_2
    //   35: ldc_w 466
    //   38: aastore
    //   39: dup
    //   40: iconst_3
    //   41: ldc 146
    //   43: aastore
    //   44: dup
    //   45: iconst_4
    //   46: ldc_w 468
    //   49: aastore
    //   50: dup
    //   51: iconst_5
    //   52: ldc_w 470
    //   55: aastore
    //   56: ldc_w 412
    //   59: aload_3
    //   60: aconst_null
    //   61: aconst_null
    //   62: invokeinterface 386 7 0
    //   67: astore 8
    //   69: aload 8
    //   71: astore 6
    //   73: aload 6
    //   75: ifnull +44 -> 119
    //   78: aload 6
    //   80: invokeinterface 144 1 0
    //   85: ifeq +34 -> 119
    //   88: new 16	com/tencent/mm/storage/k
    //   91: dup
    //   92: invokespecial 372	com/tencent/mm/storage/k:<init>	()V
    //   95: astore 9
    //   97: aload 9
    //   99: aload 6
    //   101: invokevirtual 375	com/tencent/mm/storage/k:b	(Landroid/database/Cursor;)V
    //   104: aload 6
    //   106: ifnull +10 -> 116
    //   109: aload 6
    //   111: invokeinterface 178 1 0
    //   116: aload 9
    //   118: areturn
    //   119: aload 6
    //   121: ifnull +10 -> 131
    //   124: aload 6
    //   126: invokeinterface 178 1 0
    //   131: aconst_null
    //   132: areturn
    //   133: astore 5
    //   135: aconst_null
    //   136: astore 6
    //   138: iconst_1
    //   139: anewarray 186	java/lang/Object
    //   142: astore 7
    //   144: aload 7
    //   146: iconst_0
    //   147: aload 5
    //   149: invokevirtual 187	java/lang/Exception:toString	()Ljava/lang/String;
    //   152: aastore
    //   153: ldc 77
    //   155: ldc_w 473
    //   158: aload 7
    //   160: invokestatic 193	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload 6
    //   165: ifnull -34 -> 131
    //   168: aload 6
    //   170: invokeinterface 178 1 0
    //   175: goto -44 -> 131
    //   178: astore 4
    //   180: aload_2
    //   181: ifnull +9 -> 190
    //   184: aload_2
    //   185: invokeinterface 178 1 0
    //   190: aload 4
    //   192: athrow
    //   193: astore 4
    //   195: aload 6
    //   197: astore_2
    //   198: goto -18 -> 180
    //   201: astore 5
    //   203: goto -65 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   11	69	133	java/lang/Exception
    //   11	69	178	finally
    //   78	104	193	finally
    //   138	163	193	finally
    //   78	104	201	java/lang/Exception
  }

  public final int yj(String paramString)
  {
    z.d("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[getContactListById] SQL:%s", new Object[] { "select rcontact.* from rcontact ,ContactLabel where ( rcontact.contactLabelIds like ? or rcontact.contactLabelIds like ? or rcontact.contactLabelIds like ? or rcontact.contactLabelIds like ? ) and ContactLabel.labelID=? and type & ? !=0" });
    String[] arrayOfString = new String[6];
    arrayOfString[0] = ("%," + paramString + "%");
    arrayOfString[1] = ("%," + paramString + ",%");
    arrayOfString[2] = ("%" + paramString + ",%");
    arrayOfString[3] = ("%" + paramString + "");
    arrayOfString[4] = paramString;
    arrayOfString[5] = com.tencent.mm.g.a.uN();
    Cursor localCursor = null;
    try
    {
      localCursor = this.dtV.rawQuery("select rcontact.* from rcontact ,ContactLabel where ( rcontact.contactLabelIds like ? or rcontact.contactLabelIds like ? or rcontact.contactLabelIds like ? or rcontact.contactLabelIds like ? ) and ContactLabel.labelID=? and type & ? !=0", arrayOfString);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        int j = localCursor.getCount();
        i = j;
        return i;
      }
      i = 0;
      return 0;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.toString();
      z.w("!56@/B4Tb64lLpJCOQ883sGUEMKOml5Lxtpvbnl9FA4SRkD75eGCbJwZ7A==", "cpan[getMemberListById] exception %s", arrayOfObject);
      int i = 0;
      return 0;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.l
 * JD-Core Version:    0.6.2
 */