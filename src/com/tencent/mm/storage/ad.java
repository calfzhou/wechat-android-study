package com.tencent.mm.storage;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.a.c;
import com.tencent.mm.c.b.l;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.f.ae;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;

public final class ad extends l
{
  protected static ae dhu = localae;
  public static int iiK;
  public static int iiL = 17;
  public static int iiM = 32;
  public static int iiN = 33;
  public static int iiO = 34;
  public static int iiP = 35;
  public static int iiQ = 36;
  public static int iiR = 37;
  public static int iiS = 38;
  public static int iiT = 49;
  public static int iiU = 50;
  public static int iiV;
  public static int iiW;
  public static int iiX;
  public static int iiY;
  public static int iiZ;
  public static int ija;
  public static int ijb;
  public static int ijc;
  public static int ijd;
  public static int ije;
  public static int ijf;
  public static String ijg;
  private final String fqZ;
  public String ijh;

  static
  {
    iiK = 65;
    iiV = 81;
    iiW = 1;
    iiX = 2;
    iiY = 3;
    iiZ = 4;
    ija = 10;
    ijb = 11;
    ijc = 0;
    ijd = 1;
    ije = 2;
    ijf = 3;
    ijg = "0_0";
    ae localae = new ae();
    localae.dFq = new Field[19];
    localae.dhI = new String[20];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "md5";
    localae.iGy.put("md5", "TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" md5 TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    localae.ihb = "md5";
    localae.dhI[1] = "svrid";
    localae.iGy.put("svrid", "TEXT");
    localStringBuilder.append(" svrid TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "catalog";
    localae.iGy.put("catalog", "INTEGER");
    localStringBuilder.append(" catalog INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[3] = "type";
    localae.iGy.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[4] = "size";
    localae.iGy.put("size", "INTEGER");
    localStringBuilder.append(" size INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[5] = "start";
    localae.iGy.put("start", "INTEGER");
    localStringBuilder.append(" start INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[6] = "state";
    localae.iGy.put("state", "INTEGER");
    localStringBuilder.append(" state INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[7] = "name";
    localae.iGy.put("name", "TEXT");
    localStringBuilder.append(" name TEXT");
    localStringBuilder.append(", ");
    localae.dhI[8] = "content";
    localae.iGy.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    localae.dhI[9] = "reserved1";
    localae.iGy.put("reserved1", "TEXT");
    localStringBuilder.append(" reserved1 TEXT");
    localStringBuilder.append(", ");
    localae.dhI[10] = "reserved2";
    localae.iGy.put("reserved2", "TEXT");
    localStringBuilder.append(" reserved2 TEXT");
    localStringBuilder.append(", ");
    localae.dhI[11] = "reserved3";
    localae.iGy.put("reserved3", "INTEGER");
    localStringBuilder.append(" reserved3 INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[12] = "reserved4";
    localae.iGy.put("reserved4", "INTEGER");
    localStringBuilder.append(" reserved4 INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[13] = "app_id";
    localae.iGy.put("app_id", "TEXT");
    localStringBuilder.append(" app_id TEXT");
    localStringBuilder.append(", ");
    localae.dhI[14] = "groupId";
    localae.iGy.put("groupId", "TEXT default '' ");
    localStringBuilder.append(" groupId TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[15] = "lastUseTime";
    localae.iGy.put("lastUseTime", "LONG");
    localStringBuilder.append(" lastUseTime LONG");
    localStringBuilder.append(", ");
    localae.dhI[16] = "framesInfo";
    localae.iGy.put("framesInfo", "TEXT default '' ");
    localStringBuilder.append(" framesInfo TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[17] = "idx";
    localae.iGy.put("idx", "INTEGER default '0' ");
    localStringBuilder.append(" idx INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[18] = "temp";
    localae.iGy.put("temp", "INTEGER default '0' ");
    localStringBuilder.append(" temp INTEGER default '0' ");
    localae.dhI[19] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  public ad()
  {
    this.fqZ = bg.qW().pi();
    reset();
  }

  public ad(String paramString)
  {
    this.fqZ = paramString;
    reset();
  }

  public static InputStream ap(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (ch.jb(paramString)))
      return null;
    try
    {
      String str = paramString.split("\\.")[0];
      z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOy1eremAdBD6M=", "emoji drawable name is %s", new Object[] { str });
      int i = paramContext.getResources().getIdentifier(str, "drawable", paramContext.getPackageName());
      InputStream localInputStream = paramContext.getResources().openRawResource(i);
      return localInputStream;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getMessage();
      z.w("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOy1eremAdBD6M=", "get emoji file fail, %s", arrayOfObject);
    }
    return null;
  }

  public static boolean oe(int paramInt)
  {
    return (paramInt == iiU) || (paramInt == iiT);
  }

  public final String aJf()
  {
    return this.fqZ;
  }

  public final boolean aJg()
  {
    if ((this.field_catalog == iiL) || (this.field_catalog == iiU) || (this.field_catalog == iiT))
      return true;
    if ((this.field_type == ab.iiE) || (!TextUtils.isEmpty(this.field_groupId)));
    for (File localFile = new File(this.fqZ + this.field_groupId + File.separator + vu()); ; localFile = new File(this.fqZ + vu()))
      return localFile.exists();
  }

  public final boolean aJh()
  {
    if ((this.field_catalog == iiL) || (this.field_catalog == iiU) || (this.field_catalog == iiT))
      return true;
    return new File(this.fqZ + this.field_groupId + File.separator + vu()).exists();
  }

  public final boolean aJi()
  {
    return ((this.field_type != iiX) && (this.field_type != ija)) || ((aJn().length() > 0) && (!aJn().equals(ijg)));
  }

  public final boolean aJj()
  {
    return (this.field_type == iiX) || (this.field_type == ija);
  }

  public final boolean aJk()
  {
    return (TextUtils.isEmpty(this.field_app_id)) && (!TextUtils.isEmpty(this.field_groupId)) && (!this.field_groupId.equals(String.valueOf(ab.iiI))) && (!this.field_groupId.equals(String.valueOf(ab.iiH))) && (!this.field_groupId.equals(String.valueOf(ab.iiJ))) && (!this.field_groupId.equals(String.valueOf(iiK)));
  }

  public final boolean aJl()
  {
    return vu().length() == 32;
  }

  public final String aJm()
  {
    if (this.field_svrid == null)
      return "";
    return this.field_svrid;
  }

  public final String aJn()
  {
    if (TextUtils.isEmpty(this.field_framesInfo))
      return "";
    return this.field_framesInfo;
  }

  public final boolean aJo()
  {
    if ((this.field_catalog == iiL) || (this.field_catalog == ab.iiI) || (this.field_catalog == iiU) || (this.field_catalog == iiT))
      return true;
    String str;
    if (aJk())
    {
      str = ag.b(this.fqZ, vu(), this.field_groupId, this.field_catalog, this.field_type);
      if (str == null)
        str = this.fqZ + this.field_groupId + File.separator + vu();
    }
    for (File localFile = new File(str); localFile.exists(); localFile = new File(this.fqZ + vu()))
      return true;
    return false;
  }

  // ERROR //
  public final byte[] aS(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iload_1
    //   3: iflt +9 -> 12
    //   6: aconst_null
    //   7: astore_3
    //   8: iload_2
    //   9: ifge +5 -> 14
    //   12: aload_3
    //   13: areturn
    //   14: aload_0
    //   15: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   18: getstatic 37	com/tencent/mm/storage/ad:iiL	I
    //   21: if_icmpeq +23 -> 44
    //   24: aload_0
    //   25: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   28: getstatic 55	com/tencent/mm/storage/ad:iiU	I
    //   31: if_icmpeq +13 -> 44
    //   34: aload_0
    //   35: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   38: getstatic 53	com/tencent/mm/storage/ad:iiT	I
    //   41: if_icmpne +95 -> 136
    //   44: iconst_1
    //   45: anewarray 261	java/lang/Object
    //   48: astore 11
    //   50: aload 11
    //   52: iconst_0
    //   53: aload_0
    //   54: invokevirtual 391	com/tencent/mm/storage/ad:getName	()Ljava/lang/String;
    //   57: aastore
    //   58: ldc_w 257
    //   61: ldc_w 393
    //   64: aload 11
    //   66: invokestatic 267	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: invokestatic 399	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   72: aload_0
    //   73: invokevirtual 391	com/tencent/mm/storage/ad:getName	()Ljava/lang/String;
    //   76: invokestatic 401	com/tencent/mm/storage/ad:ap	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   79: astore 12
    //   81: aload 12
    //   83: astore 5
    //   85: iload_1
    //   86: i2l
    //   87: lstore 13
    //   89: aload 5
    //   91: lload 13
    //   93: invokevirtual 407	java/io/InputStream:skip	(J)J
    //   96: pop2
    //   97: iload_2
    //   98: newarray byte
    //   100: astore_3
    //   101: aload 5
    //   103: aload_3
    //   104: iconst_0
    //   105: iload_2
    //   106: invokevirtual 411	java/io/InputStream:read	([BII)I
    //   109: pop
    //   110: aload 5
    //   112: ifnull -100 -> 12
    //   115: aload 5
    //   117: invokevirtual 414	java/io/InputStream:close	()V
    //   120: aload_3
    //   121: areturn
    //   122: astore 19
    //   124: aload_3
    //   125: areturn
    //   126: astore 8
    //   128: aload_3
    //   129: ifnull +7 -> 136
    //   132: aload_3
    //   133: invokevirtual 414	java/io/InputStream:close	()V
    //   136: new 102	java/lang/StringBuilder
    //   139: dup
    //   140: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   143: aload_0
    //   144: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   147: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: aload_0
    //   151: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   154: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: astore 9
    //   162: aload_0
    //   163: invokevirtual 378	com/tencent/mm/storage/ad:aJk	()Z
    //   166: ifeq +42 -> 208
    //   169: new 102	java/lang/StringBuilder
    //   172: dup
    //   173: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   176: aload_0
    //   177: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   180: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload_0
    //   184: getfield 315	com/tencent/mm/storage/ad:field_groupId	Ljava/lang/String;
    //   187: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: getstatic 326	java/io/File:separator	Ljava/lang/String;
    //   193: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: aload_0
    //   197: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   200: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: astore 9
    //   208: aload 9
    //   210: aload_0
    //   211: getfield 417	com/tencent/mm/storage/ad:field_start	I
    //   214: iload_2
    //   215: invokestatic 423	com/tencent/mm/a/c:a	(Ljava/lang/String;II)[B
    //   218: areturn
    //   219: astore 4
    //   221: aconst_null
    //   222: astore 5
    //   224: aload 4
    //   226: astore 6
    //   228: aload 5
    //   230: ifnull +8 -> 238
    //   233: aload 5
    //   235: invokevirtual 414	java/io/InputStream:close	()V
    //   238: aload 6
    //   240: athrow
    //   241: astore 10
    //   243: goto -107 -> 136
    //   246: astore 7
    //   248: goto -10 -> 238
    //   251: astore 6
    //   253: goto -25 -> 228
    //   256: astore 15
    //   258: aload 5
    //   260: astore_3
    //   261: goto -133 -> 128
    //
    // Exception table:
    //   from	to	target	type
    //   115	120	122	java/io/IOException
    //   44	81	126	java/io/IOException
    //   44	81	219	finally
    //   132	136	241	java/io/IOException
    //   233	238	246	java/io/IOException
    //   89	110	251	finally
    //   89	110	256	java/io/IOException
  }

  public final boolean avN()
  {
    return (this.field_catalog == iiU) || (this.field_catalog == iiT);
  }

  public final void b(Cursor paramCursor)
  {
    super.b(paramCursor);
    try
    {
      int i = paramCursor.getColumnIndex("desc");
      if (i != -1)
        this.ijh = paramCursor.getString(i);
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.toString();
      z.w("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOy1eremAdBD6M=", "cpan [convertFrom] %s", arrayOfObject);
    }
  }

  // ERROR //
  public final android.graphics.Bitmap bS(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   8: getstatic 37	com/tencent/mm/storage/ad:iiL	I
    //   11: if_icmpeq +41 -> 52
    //   14: aload_0
    //   15: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   18: getstatic 355	com/tencent/mm/storage/ab:iiI	I
    //   21: if_icmpeq +31 -> 52
    //   24: aload_0
    //   25: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   28: getstatic 55	com/tencent/mm/storage/ad:iiU	I
    //   31: if_icmpeq +21 -> 52
    //   34: aload_0
    //   35: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   38: istore 17
    //   40: getstatic 53	com/tencent/mm/storage/ad:iiT	I
    //   43: istore 18
    //   45: iload 17
    //   47: iload 18
    //   49: if_icmpne +164 -> 213
    //   52: aload_0
    //   53: invokevirtual 391	com/tencent/mm/storage/ad:getName	()Ljava/lang/String;
    //   56: astore 10
    //   58: aload_0
    //   59: getfield 307	com/tencent/mm/storage/ad:field_type	I
    //   62: getstatic 63	com/tencent/mm/storage/ad:iiX	I
    //   65: if_icmpne +19 -> 84
    //   68: aload_0
    //   69: invokevirtual 450	com/tencent/mm/storage/ad:getContent	()Ljava/lang/String;
    //   72: invokestatic 249	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   75: ifeq +72 -> 147
    //   78: aload_0
    //   79: invokevirtual 391	com/tencent/mm/storage/ad:getName	()Ljava/lang/String;
    //   82: astore 10
    //   84: aload_1
    //   85: aload 10
    //   87: invokestatic 401	com/tencent/mm/storage/ad:ap	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   90: astore 11
    //   92: aload 11
    //   94: astore 7
    //   96: aload 7
    //   98: ldc_w 451
    //   101: invokestatic 456	com/tencent/mm/sdk/platformtools/i:a	(Ljava/io/InputStream;F)Landroid/graphics/Bitmap;
    //   104: astore 14
    //   106: aload 14
    //   108: astore 8
    //   110: aload 7
    //   112: ifnull +8 -> 120
    //   115: aload 7
    //   117: invokevirtual 414	java/io/InputStream:close	()V
    //   120: aload_0
    //   121: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   124: invokestatic 249	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   127: ifne +15 -> 142
    //   130: invokestatic 462	com/tencent/mm/storage/aj:aJr	()Lcom/tencent/mm/storage/ai;
    //   133: aload_0
    //   134: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   137: aload 8
    //   139: invokevirtual 468	com/tencent/mm/storage/ai:r	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   142: aload_0
    //   143: monitorexit
    //   144: aload 8
    //   146: areturn
    //   147: aload_0
    //   148: invokevirtual 450	com/tencent/mm/storage/ad:getContent	()Ljava/lang/String;
    //   151: astore 16
    //   153: aload 16
    //   155: astore 10
    //   157: goto -73 -> 84
    //   160: astore 6
    //   162: aconst_null
    //   163: astore 7
    //   165: aload 7
    //   167: ifnull +40 -> 207
    //   170: aload 7
    //   172: invokevirtual 414	java/io/InputStream:close	()V
    //   175: aconst_null
    //   176: astore 8
    //   178: goto -58 -> 120
    //   181: astore 9
    //   183: aconst_null
    //   184: astore 8
    //   186: goto -66 -> 120
    //   189: astore 4
    //   191: aload_2
    //   192: ifnull +7 -> 199
    //   195: aload_2
    //   196: invokevirtual 414	java/io/InputStream:close	()V
    //   199: aload 4
    //   201: athrow
    //   202: astore_3
    //   203: aload_0
    //   204: monitorexit
    //   205: aload_3
    //   206: athrow
    //   207: aconst_null
    //   208: astore 8
    //   210: goto -90 -> 120
    //   213: aload_0
    //   214: invokevirtual 378	com/tencent/mm/storage/ad:aJk	()Z
    //   217: istore 25
    //   219: aconst_null
    //   220: astore_2
    //   221: iload 25
    //   223: ifeq +149 -> 372
    //   226: aload_0
    //   227: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   230: aload_0
    //   231: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   234: aload_0
    //   235: getfield 315	com/tencent/mm/storage/ad:field_groupId	Ljava/lang/String;
    //   238: aload_0
    //   239: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   242: aload_0
    //   243: getfield 307	com/tencent/mm/storage/ad:field_type	I
    //   246: invokestatic 384	com/tencent/mm/storage/ag:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
    //   249: astore 26
    //   251: aconst_null
    //   252: astore_2
    //   253: aload 26
    //   255: ifnonnull +703 -> 958
    //   258: new 102	java/lang/StringBuilder
    //   261: dup
    //   262: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   265: aload_0
    //   266: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   269: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: aload_0
    //   273: getfield 315	com/tencent/mm/storage/ad:field_groupId	Ljava/lang/String;
    //   276: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: getstatic 326	java/io/File:separator	Ljava/lang/String;
    //   282: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: aload_0
    //   286: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   289: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: ldc_w 470
    //   295: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   301: astore 27
    //   303: new 323	java/io/File
    //   306: dup
    //   307: aload 27
    //   309: invokespecial 331	java/io/File:<init>	(Ljava/lang/String;)V
    //   312: astore 28
    //   314: aload 28
    //   316: invokevirtual 334	java/io/File:exists	()Z
    //   319: istore 29
    //   321: aconst_null
    //   322: astore_2
    //   323: iload 29
    //   325: ifeq +121 -> 446
    //   328: new 472	java/io/FileInputStream
    //   331: dup
    //   332: aload 28
    //   334: invokespecial 475	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   337: astore 30
    //   339: aload 30
    //   341: ldc_w 451
    //   344: invokestatic 456	com/tencent/mm/sdk/platformtools/i:a	(Ljava/io/InputStream;F)Landroid/graphics/Bitmap;
    //   347: astore 31
    //   349: aload 30
    //   351: astore_2
    //   352: aload 31
    //   354: astore 8
    //   356: aload_2
    //   357: ifnull -237 -> 120
    //   360: aload_2
    //   361: invokevirtual 476	java/io/FileInputStream:close	()V
    //   364: goto -244 -> 120
    //   367: astore 32
    //   369: goto -249 -> 120
    //   372: new 323	java/io/File
    //   375: dup
    //   376: new 102	java/lang/StringBuilder
    //   379: dup
    //   380: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   383: aload_0
    //   384: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   387: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: aload_0
    //   391: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   394: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: ldc_w 478
    //   400: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   406: invokespecial 331	java/io/File:<init>	(Ljava/lang/String;)V
    //   409: astore 28
    //   411: goto -97 -> 314
    //   414: astore 23
    //   416: aconst_null
    //   417: astore 8
    //   419: ldc_w 257
    //   422: aload 23
    //   424: invokevirtual 479	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   427: invokestatic 483	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   430: aload_2
    //   431: ifnull -311 -> 120
    //   434: aload_2
    //   435: invokevirtual 476	java/io/FileInputStream:close	()V
    //   438: goto -318 -> 120
    //   441: astore 24
    //   443: goto -323 -> 120
    //   446: aload_0
    //   447: invokevirtual 378	com/tencent/mm/storage/ad:aJk	()Z
    //   450: istore 33
    //   452: aconst_null
    //   453: astore_2
    //   454: iload 33
    //   456: ifeq +223 -> 679
    //   459: getstatic 488	android/os/Build$VERSION:SDK_INT	I
    //   462: istore 34
    //   464: aconst_null
    //   465: astore_2
    //   466: iload 34
    //   468: bipush 19
    //   470: if_icmpge +480 -> 950
    //   473: new 472	java/io/FileInputStream
    //   476: dup
    //   477: new 102	java/lang/StringBuilder
    //   480: dup
    //   481: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   484: aload_0
    //   485: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   488: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   491: aload_0
    //   492: getfield 315	com/tencent/mm/storage/ad:field_groupId	Ljava/lang/String;
    //   495: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: getstatic 326	java/io/File:separator	Ljava/lang/String;
    //   501: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   504: aload_0
    //   505: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   508: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   514: invokespecial 489	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   517: astore 35
    //   519: aload 35
    //   521: aload_1
    //   522: invokestatic 495	com/tencent/mm/aq/a:getDensity	(Landroid/content/Context;)F
    //   525: invokestatic 456	com/tencent/mm/sdk/platformtools/i:a	(Ljava/io/InputStream;F)Landroid/graphics/Bitmap;
    //   528: astore 36
    //   530: aload 36
    //   532: astore 8
    //   534: aload 35
    //   536: astore_2
    //   537: aload_0
    //   538: invokevirtual 378	com/tencent/mm/storage/ad:aJk	()Z
    //   541: ifeq +191 -> 732
    //   544: ldc_w 257
    //   547: ldc_w 497
    //   550: invokestatic 499	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   553: new 323	java/io/File
    //   556: dup
    //   557: new 102	java/lang/StringBuilder
    //   560: dup
    //   561: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   564: aload_0
    //   565: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   568: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   571: aload_0
    //   572: getfield 315	com/tencent/mm/storage/ad:field_groupId	Ljava/lang/String;
    //   575: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   578: getstatic 326	java/io/File:separator	Ljava/lang/String;
    //   581: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: aload_0
    //   585: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   588: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   591: ldc_w 501
    //   594: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   597: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   600: invokespecial 331	java/io/File:<init>	(Ljava/lang/String;)V
    //   603: invokevirtual 334	java/io/File:exists	()Z
    //   606: ifne -250 -> 356
    //   609: getstatic 488	android/os/Build$VERSION:SDK_INT	I
    //   612: bipush 19
    //   614: if_icmpge -258 -> 356
    //   617: aload 8
    //   619: bipush 100
    //   621: getstatic 507	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   624: new 102	java/lang/StringBuilder
    //   627: dup
    //   628: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   631: aload_0
    //   632: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   635: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: aload_0
    //   639: getfield 315	com/tencent/mm/storage/ad:field_groupId	Ljava/lang/String;
    //   642: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   645: getstatic 326	java/io/File:separator	Ljava/lang/String;
    //   648: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   651: aload_0
    //   652: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   655: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   658: ldc_w 501
    //   661: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   664: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   667: iconst_0
    //   668: invokestatic 510	com/tencent/mm/sdk/platformtools/i:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   671: goto -315 -> 356
    //   674: astore 23
    //   676: goto -257 -> 419
    //   679: new 472	java/io/FileInputStream
    //   682: dup
    //   683: new 102	java/lang/StringBuilder
    //   686: dup
    //   687: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   690: aload_0
    //   691: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   694: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   697: aload_0
    //   698: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   701: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   704: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   707: invokespecial 489	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   710: astore 37
    //   712: aload 37
    //   714: ldc_w 451
    //   717: invokestatic 456	com/tencent/mm/sdk/platformtools/i:a	(Ljava/io/InputStream;F)Landroid/graphics/Bitmap;
    //   720: astore 38
    //   722: aload 38
    //   724: astore 8
    //   726: aload 37
    //   728: astore_2
    //   729: goto -192 -> 537
    //   732: aload 8
    //   734: bipush 100
    //   736: getstatic 507	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   739: new 102	java/lang/StringBuilder
    //   742: dup
    //   743: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   746: aload_0
    //   747: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   750: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   753: aload_0
    //   754: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   757: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   760: ldc_w 478
    //   763: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   766: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   769: iconst_0
    //   770: invokestatic 510	com/tencent/mm/sdk/platformtools/i:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   773: goto -417 -> 356
    //   776: astore 19
    //   778: ldc_w 257
    //   781: aload 19
    //   783: invokevirtual 291	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   786: invokestatic 483	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   789: aload_2
    //   790: ifnull -670 -> 120
    //   793: aload_2
    //   794: invokevirtual 476	java/io/FileInputStream:close	()V
    //   797: goto -677 -> 120
    //   800: astore 22
    //   802: goto -682 -> 120
    //   805: astore 20
    //   807: aload_2
    //   808: ifnull +7 -> 815
    //   811: aload_2
    //   812: invokevirtual 476	java/io/FileInputStream:close	()V
    //   815: aload 20
    //   817: athrow
    //   818: astore 15
    //   820: goto -700 -> 120
    //   823: astore 5
    //   825: goto -626 -> 199
    //   828: astore 21
    //   830: goto -15 -> 815
    //   833: astore 20
    //   835: aload 30
    //   837: astore_2
    //   838: goto -31 -> 807
    //   841: astore 20
    //   843: aload 35
    //   845: astore_2
    //   846: goto -39 -> 807
    //   849: astore 20
    //   851: aload 37
    //   853: astore_2
    //   854: goto -47 -> 807
    //   857: astore 19
    //   859: aconst_null
    //   860: astore_2
    //   861: aconst_null
    //   862: astore 8
    //   864: goto -86 -> 778
    //   867: astore 19
    //   869: aload 30
    //   871: astore_2
    //   872: aconst_null
    //   873: astore 8
    //   875: goto -97 -> 778
    //   878: astore 19
    //   880: aload 35
    //   882: astore_2
    //   883: aconst_null
    //   884: astore 8
    //   886: goto -108 -> 778
    //   889: astore 19
    //   891: aload 37
    //   893: astore_2
    //   894: aconst_null
    //   895: astore 8
    //   897: goto -119 -> 778
    //   900: astore 23
    //   902: aload 30
    //   904: astore_2
    //   905: aconst_null
    //   906: astore 8
    //   908: goto -489 -> 419
    //   911: astore 23
    //   913: aload 35
    //   915: astore_2
    //   916: aconst_null
    //   917: astore 8
    //   919: goto -500 -> 419
    //   922: astore 23
    //   924: aload 37
    //   926: astore_2
    //   927: aconst_null
    //   928: astore 8
    //   930: goto -511 -> 419
    //   933: astore 13
    //   935: aload 7
    //   937: astore_2
    //   938: aload 13
    //   940: astore 4
    //   942: goto -751 -> 191
    //   945: astore 12
    //   947: goto -782 -> 165
    //   950: aconst_null
    //   951: astore_2
    //   952: aconst_null
    //   953: astore 8
    //   955: goto -418 -> 537
    //   958: aload 26
    //   960: astore 27
    //   962: goto -659 -> 303
    //
    // Exception table:
    //   from	to	target	type
    //   52	84	160	java/lang/Exception
    //   84	92	160	java/lang/Exception
    //   147	153	160	java/lang/Exception
    //   170	175	181	java/io/IOException
    //   52	84	189	finally
    //   84	92	189	finally
    //   147	153	189	finally
    //   4	45	202	finally
    //   115	120	202	finally
    //   120	142	202	finally
    //   170	175	202	finally
    //   195	199	202	finally
    //   199	202	202	finally
    //   360	364	202	finally
    //   434	438	202	finally
    //   793	797	202	finally
    //   811	815	202	finally
    //   815	818	202	finally
    //   360	364	367	java/io/IOException
    //   213	219	414	java/io/FileNotFoundException
    //   226	251	414	java/io/FileNotFoundException
    //   258	303	414	java/io/FileNotFoundException
    //   303	314	414	java/io/FileNotFoundException
    //   314	321	414	java/io/FileNotFoundException
    //   328	339	414	java/io/FileNotFoundException
    //   372	411	414	java/io/FileNotFoundException
    //   446	452	414	java/io/FileNotFoundException
    //   459	464	414	java/io/FileNotFoundException
    //   473	519	414	java/io/FileNotFoundException
    //   679	712	414	java/io/FileNotFoundException
    //   434	438	441	java/io/IOException
    //   537	671	674	java/io/FileNotFoundException
    //   732	773	674	java/io/FileNotFoundException
    //   537	671	776	java/lang/Exception
    //   732	773	776	java/lang/Exception
    //   793	797	800	java/io/IOException
    //   213	219	805	finally
    //   226	251	805	finally
    //   258	303	805	finally
    //   303	314	805	finally
    //   314	321	805	finally
    //   328	339	805	finally
    //   372	411	805	finally
    //   419	430	805	finally
    //   446	452	805	finally
    //   459	464	805	finally
    //   473	519	805	finally
    //   537	671	805	finally
    //   679	712	805	finally
    //   732	773	805	finally
    //   778	789	805	finally
    //   115	120	818	java/io/IOException
    //   195	199	823	java/io/IOException
    //   811	815	828	java/io/IOException
    //   339	349	833	finally
    //   519	530	841	finally
    //   712	722	849	finally
    //   213	219	857	java/lang/Exception
    //   226	251	857	java/lang/Exception
    //   258	303	857	java/lang/Exception
    //   303	314	857	java/lang/Exception
    //   314	321	857	java/lang/Exception
    //   328	339	857	java/lang/Exception
    //   372	411	857	java/lang/Exception
    //   446	452	857	java/lang/Exception
    //   459	464	857	java/lang/Exception
    //   473	519	857	java/lang/Exception
    //   679	712	857	java/lang/Exception
    //   339	349	867	java/lang/Exception
    //   519	530	878	java/lang/Exception
    //   712	722	889	java/lang/Exception
    //   339	349	900	java/io/FileNotFoundException
    //   519	530	911	java/io/FileNotFoundException
    //   712	722	922	java/io/FileNotFoundException
    //   96	106	933	finally
    //   96	106	945	java/lang/Exception
  }

  // ERROR //
  public final android.graphics.Bitmap bT(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   4: getstatic 37	com/tencent/mm/storage/ad:iiL	I
    //   7: if_icmpeq +33 -> 40
    //   10: aload_0
    //   11: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   14: getstatic 355	com/tencent/mm/storage/ab:iiI	I
    //   17: if_icmpeq +23 -> 40
    //   20: aload_0
    //   21: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   24: getstatic 55	com/tencent/mm/storage/ad:iiU	I
    //   27: if_icmpeq +13 -> 40
    //   30: aload_0
    //   31: getfield 304	com/tencent/mm/storage/ad:field_catalog	I
    //   34: getstatic 53	com/tencent/mm/storage/ad:iiT	I
    //   37: if_icmpne +5 -> 42
    //   40: aconst_null
    //   41: areturn
    //   42: new 472	java/io/FileInputStream
    //   45: dup
    //   46: new 102	java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   53: aload_0
    //   54: getfield 235	com/tencent/mm/storage/ad:fqZ	Ljava/lang/String;
    //   57: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload_0
    //   61: getfield 315	com/tencent/mm/storage/ad:field_groupId	Ljava/lang/String;
    //   64: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: getstatic 326	java/io/File:separator	Ljava/lang/String;
    //   70: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: aload_0
    //   74: invokevirtual 329	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   77: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: invokespecial 489	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   86: astore_2
    //   87: aload_2
    //   88: aload_1
    //   89: invokestatic 495	com/tencent/mm/aq/a:getDensity	(Landroid/content/Context;)F
    //   92: invokestatic 456	com/tencent/mm/sdk/platformtools/i:a	(Ljava/io/InputStream;F)Landroid/graphics/Bitmap;
    //   95: astore 9
    //   97: aload_2
    //   98: invokevirtual 476	java/io/FileInputStream:close	()V
    //   101: aload 9
    //   103: areturn
    //   104: astore 10
    //   106: aload 9
    //   108: areturn
    //   109: astore_3
    //   110: aconst_null
    //   111: astore_2
    //   112: ldc_w 257
    //   115: aload_3
    //   116: invokevirtual 479	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   119: invokestatic 483	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: aload_2
    //   123: ifnull -83 -> 40
    //   126: aload_2
    //   127: invokevirtual 476	java/io/FileInputStream:close	()V
    //   130: aconst_null
    //   131: areturn
    //   132: astore 6
    //   134: aconst_null
    //   135: areturn
    //   136: astore 7
    //   138: aconst_null
    //   139: astore_2
    //   140: ldc_w 257
    //   143: aload 7
    //   145: invokevirtual 291	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   148: invokestatic 483	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   151: aload_2
    //   152: ifnull -112 -> 40
    //   155: aload_2
    //   156: invokevirtual 476	java/io/FileInputStream:close	()V
    //   159: aconst_null
    //   160: areturn
    //   161: astore 8
    //   163: aconst_null
    //   164: areturn
    //   165: astore 11
    //   167: aconst_null
    //   168: astore_2
    //   169: aload 11
    //   171: astore 4
    //   173: aload_2
    //   174: ifnull +7 -> 181
    //   177: aload_2
    //   178: invokevirtual 476	java/io/FileInputStream:close	()V
    //   181: aload 4
    //   183: athrow
    //   184: astore 5
    //   186: goto -5 -> 181
    //   189: astore 4
    //   191: goto -18 -> 173
    //   194: astore 7
    //   196: goto -56 -> 140
    //   199: astore_3
    //   200: goto -88 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   97	101	104	java/io/IOException
    //   42	87	109	java/io/FileNotFoundException
    //   126	130	132	java/io/IOException
    //   42	87	136	java/lang/Exception
    //   155	159	161	java/io/IOException
    //   42	87	165	finally
    //   177	181	184	java/io/IOException
    //   87	97	189	finally
    //   112	122	189	finally
    //   140	151	189	finally
    //   87	97	194	java/lang/Exception
    //   87	97	199	java/io/FileNotFoundException
  }

  public final boolean cJ(byte[] paramArrayOfByte)
  {
    if ((this.field_type == ab.iiE) || (!TextUtils.isEmpty(this.field_groupId)))
      c.a(this.fqZ + this.field_groupId + File.separator, vu(), "", paramArrayOfByte);
    while (true)
    {
      return true;
      c.a(this.fqZ, vu(), "", paramArrayOfByte);
    }
  }

  public final String getContent()
  {
    if (this.field_content == null)
      return "";
    return this.field_content;
  }

  public final String getName()
  {
    if (this.field_name == null)
      return "";
    return this.field_name;
  }

  protected final ae nF()
  {
    return dhu;
  }

  public final void reset()
  {
    this.field_md5 = "";
    this.field_svrid = "";
    this.field_catalog = iiL;
    this.field_type = iiW;
    this.field_size = 0;
    this.field_start = 0;
    this.field_state = ijc;
    this.field_name = "";
    this.field_content = "";
    this.field_reserved1 = "";
    this.field_reserved2 = "";
    this.field_reserved3 = 0;
    this.field_reserved4 = 0;
    this.field_app_id = "";
  }

  public final String vu()
  {
    if (this.field_md5 == null)
      return "";
    return this.field_md5;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ad
 * JD-Core Version:    0.6.2
 */