package com.tencent.mm.storage;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.as.f;
import com.tencent.mm.as.g;
import com.tencent.mm.as.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.protocal.a.gp;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ac extends ah
  implements g
{
  public static final String[] dmc = arrayOfString;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(ab.dhu, "EmojiGroupInfo");
  }

  public ac(af paramaf)
  {
    super(paramaf, ab.dhu, "EmojiGroupInfo", null);
    this.dtV = paramaf;
  }

  private int aIT()
  {
    Cursor localCursor = null;
    try
    {
      af localaf = this.dtV;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = ab.iiJ;
      localCursor = localaf.rawQuery("select  count(*) from EmojiInfo where catalog=?", arrayOfString);
      i = 0;
      if (localCursor != null)
      {
        boolean bool = localCursor.moveToFirst();
        i = 0;
        if (bool)
        {
          int j = localCursor.getInt(0);
          i = j;
        }
      }
      return i;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "Check GroupId Exist Faild." + localException.getMessage());
      int i = 0;
      return 0;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  private HashMap aIW()
  {
    Cursor localCursor = null;
    HashMap localHashMap = new HashMap();
    String str = "select * from EmojiGroupInfo where " + new StringBuilder().append(oc(ab.iiD)).append(" or ").append(oc(ab.TYPE_CUSTOM)).append(" or ").append(oc(ab.iiE)).append(" or ").append(oc(ab.iiG)).toString() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localCursor = this.dtV.rawQuery(str, null);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        boolean bool;
        do
        {
          ab localab = new ab();
          localab.b(localCursor);
          localHashMap.put(localab.field_productID, localab);
          bool = localCursor.moveToNext();
        }
        while (bool);
      }
      return localHashMap;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "get all group fail." + localException.getMessage());
      return localHashMap;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  public static boolean aJb()
  {
    return ((Boolean)bg.qW().oQ().get(208912, Boolean.valueOf(false))).booleanValue();
  }

  private static String aJd()
  {
    return " ( " + oc(ab.iiE) + " and " + aJe() + " ) ";
  }

  private static String aJe()
  {
    return " ( status = '7" + "' ) ";
  }

  private static String oc(int paramInt)
  {
    return " ( type = '" + paramInt + "' ) ";
  }

  private static String od(int paramInt)
  {
    return " ( " + oc(paramInt) + " and ( ( ( flag & 256 ) = 0 )  or ( flag is null ) )  ) ";
  }

  // ERROR //
  public final ab K(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/tencent/mm/storage/ac:dtV	Lcom/tencent/mm/sdk/f/af;
    //   4: ldc 192
    //   6: iconst_1
    //   7: anewarray 14	java/lang/String
    //   10: dup
    //   11: iconst_0
    //   12: aload_1
    //   13: aastore
    //   14: invokeinterface 63 3 0
    //   19: astore 8
    //   21: aload 8
    //   23: ifnull +44 -> 67
    //   26: aload 8
    //   28: invokeinterface 69 1 0
    //   33: ifeq +34 -> 67
    //   36: new 16	com/tencent/mm/storage/ab
    //   39: dup
    //   40: invokespecial 123	com/tencent/mm/storage/ab:<init>	()V
    //   43: astore 7
    //   45: aload 7
    //   47: aload 8
    //   49: invokevirtual 127	com/tencent/mm/storage/ab:b	(Landroid/database/Cursor;)V
    //   52: aload 8
    //   54: ifnull +10 -> 64
    //   57: aload 8
    //   59: invokeinterface 76 1 0
    //   64: aload 7
    //   66: areturn
    //   67: aload 8
    //   69: ifnull +159 -> 228
    //   72: aload 8
    //   74: invokeinterface 76 1 0
    //   79: aconst_null
    //   80: astore 7
    //   82: aload 7
    //   84: ifnonnull -20 -> 64
    //   87: iload_2
    //   88: ifeq +84 -> 172
    //   91: aconst_null
    //   92: areturn
    //   93: astore 5
    //   95: aconst_null
    //   96: astore 4
    //   98: aconst_null
    //   99: astore 6
    //   101: ldc 78
    //   103: new 41	java/lang/StringBuilder
    //   106: dup
    //   107: ldc 194
    //   109: invokespecial 83	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   112: aload_1
    //   113: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: ldc 196
    //   118: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: aload 5
    //   123: invokevirtual 86	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   126: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokestatic 95	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   135: aload 4
    //   137: ifnull +84 -> 221
    //   140: aload 4
    //   142: invokeinterface 76 1 0
    //   147: aload 6
    //   149: astore 7
    //   151: goto -69 -> 82
    //   154: astore_3
    //   155: aconst_null
    //   156: astore 4
    //   158: aload 4
    //   160: ifnull +10 -> 170
    //   163: aload 4
    //   165: invokeinterface 76 1 0
    //   170: aload_3
    //   171: athrow
    //   172: new 16	com/tencent/mm/storage/ab
    //   175: dup
    //   176: invokespecial 123	com/tencent/mm/storage/ab:<init>	()V
    //   179: areturn
    //   180: astore_3
    //   181: aload 8
    //   183: astore 4
    //   185: goto -27 -> 158
    //   188: astore_3
    //   189: goto -31 -> 158
    //   192: astore 5
    //   194: aload 8
    //   196: astore 4
    //   198: aconst_null
    //   199: astore 6
    //   201: goto -100 -> 101
    //   204: astore 9
    //   206: aload 8
    //   208: astore 4
    //   210: aload 7
    //   212: astore 6
    //   214: aload 9
    //   216: astore 5
    //   218: goto -117 -> 101
    //   221: aload 6
    //   223: astore 7
    //   225: goto -143 -> 82
    //   228: aconst_null
    //   229: astore 7
    //   231: goto -149 -> 82
    //
    // Exception table:
    //   from	to	target	type
    //   0	21	93	java/lang/Exception
    //   0	21	154	finally
    //   26	45	180	finally
    //   45	52	180	finally
    //   101	135	188	finally
    //   26	45	192	java/lang/Exception
    //   45	52	204	java/lang/Exception
  }

  public final int a(f paramf)
  {
    if (paramf != null)
      this.dtV = paramf;
    return 0;
  }

  public final boolean aIU()
  {
    boolean bool1 = true;
    Cursor localCursor = null;
    try
    {
      af localaf = this.dtV;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = ab.iiD;
      localCursor = localaf.rawQuery("select * from EmojiGroupInfo where type=?", arrayOfString);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        ab localab = new ab();
        localab.b(localCursor);
        int i = localab.field_flag;
        boolean bool2;
        if ((i & 0x100) > 0)
        {
          bool2 = bool1;
          if (bool2)
            break label118;
        }
        while (true)
        {
          return bool1;
          bool2 = false;
          break;
          label118: bool1 = false;
        }
      }
      return false;
    }
    catch (Exception localException)
    {
      while (true)
      {
        z.d("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", localException.toString());
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

  public final List aIV()
  {
    Cursor localCursor = null;
    ArrayList localArrayList = new ArrayList();
    String str = "select * from EmojiGroupInfo where " + od(ab.iiD) + " or " + od(ab.TYPE_CUSTOM) + " order by sort ASC";
    try
    {
      localCursor = this.dtV.rawQuery(str, null);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        boolean bool;
        do
        {
          ab localab = new ab();
          localab.b(localCursor);
          localArrayList.add(localab);
          bool = localCursor.moveToNext();
        }
        while (bool);
      }
      return localArrayList;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "get system group fail." + localException.getMessage());
      return localArrayList;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  public final ArrayList aIX()
  {
    Cursor localCursor = null;
    ArrayList localArrayList = new ArrayList();
    String str = "select * from EmojiGroupInfo where " + oc(ab.iiE) + " or " + oc(ab.iiD) + " order by sort ASC,lastUseTime DESC";
    try
    {
      localCursor = this.dtV.rawQuery(str, null);
      z.v("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "jacks panel group : ===========");
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        boolean bool;
        do
        {
          ab localab = new ab();
          localab.b(localCursor);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = localab.field_packName;
          arrayOfObject[1] = Long.valueOf(localab.field_lastUseTime);
          arrayOfObject[2] = Integer.valueOf(localab.field_sort);
          z.d("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "jacks panel group : %s, lastTime: %d, sort: %d", arrayOfObject);
          localArrayList.add(localab);
          bool = localCursor.moveToNext();
        }
        while (bool);
      }
      return localArrayList;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "get Panel EmojiGroupInfo." + localException.getMessage());
      return localArrayList;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  public final ArrayList aIY()
  {
    ArrayList localArrayList1 = aIZ();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = localArrayList1.iterator();
    while (localIterator.hasNext())
    {
      ab localab = (ab)localIterator.next();
      if (localab.field_type != ab.TYPE_CUSTOM)
        localArrayList2.add(localab);
    }
    return localArrayList2;
  }

  public final ArrayList aIZ()
  {
    Cursor localCursor = null;
    ArrayList localArrayList = new ArrayList();
    String str = "select * from EmojiGroupInfo where " + aJd() + " or " + od(ab.iiD) + " or " + od(ab.TYPE_CUSTOM) + " order by sort ASC,lastUseTime DESC";
    try
    {
      localCursor = this.dtV.rawQuery(str, null);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        boolean bool;
        do
        {
          ab localab = new ab();
          localab.b(localCursor);
          localArrayList.add(localab);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = localab.field_packName;
          arrayOfObject[1] = Long.valueOf(localab.field_lastUseTime);
          arrayOfObject[2] = Integer.valueOf(localab.field_sort);
          z.d("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "jacks getPanelGroupList: packname: %s, lasttime: %d, sort: %d", arrayOfObject);
          bool = localCursor.moveToNext();
        }
        while (bool);
      }
      return localArrayList;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "get Panel EmojiGroupInfo." + localException.getMessage());
      return localArrayList;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  public final HashMap aJa()
  {
    Cursor localCursor = null;
    HashMap localHashMap = new HashMap();
    String str1 = "select * from EmojiGroupInfo where " + aJd() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localCursor = this.dtV.rawQuery(str1, null);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        aa localaa = new aa();
        boolean bool;
        do
        {
          String str2 = localCursor.getString(localCursor.getColumnIndex("productID"));
          localaa.kX(str2);
          localaa.yX(localCursor.getString(localCursor.getColumnIndex("packName")));
          localaa.nZ(7);
          localHashMap.put(str2, localaa);
          bool = localCursor.moveToNext();
        }
        while (bool);
      }
      return localHashMap;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "get download group map failed." + localException.getMessage());
      return localHashMap;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  public final void aJc()
  {
    String str1 = ab.TYPE_CUSTOM;
    String str2 = "UPDATE EmojiGroupInfo SET sort=-1,lastUseTime=" + System.currentTimeMillis() + " WHERE type=" + str1;
    if (this.dtV.bp("EmojiGroupInfo", str2))
      Ba("event_update_group");
    bg.qW().oQ().set(208912, Boolean.valueOf(true));
  }

  public final boolean aO(List paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0))
    {
      z.d("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "updateList . list is null.");
      return false;
    }
    h localh2;
    long l;
    if ((this.dtV instanceof h))
    {
      localh2 = (h)this.dtV;
      l = localh2.dc(Thread.currentThread().getId());
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(l);
      z.i("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "surround updateList in a transaction, ticket = %d", arrayOfObject2);
    }
    for (h localh1 = localh2; ; localh1 = null)
    {
      for (int i = 0; i < paramList.size(); i++)
      {
        ab localab = (ab)paramList.get(i);
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = localab.field_packName;
        arrayOfObject1[1] = Long.valueOf(localab.field_lastUseTime);
        arrayOfObject1[2] = Integer.valueOf(localab.field_sort);
        z.d("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "jacks packname: productid: %s, lasttime: %d, sort: %d", arrayOfObject1);
        a(localab);
      }
      if (localh1 != null)
      {
        localh1.dd(l);
        z.i("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "end updateList transaction");
      }
      Ba("event_update_group");
      return true;
      l = -1L;
    }
  }

  public final boolean aP(List paramList)
  {
    if (paramList.size() <= 0)
    {
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "updateEmojiGroupByEmotionSummary empty summary.");
      return false;
    }
    HashMap localHashMap = aIW();
    int i = 0;
    if (i < paramList.size())
    {
      gp localgp = (gp)paramList.get(i);
      if (localHashMap.containsKey(localgp.hSc));
      for (ab localab = (ab)localHashMap.get(localgp.hSc); ; localab = new ab())
      {
        localab.field_productID = localgp.hSc;
        localab.field_packIconUrl = localgp.fxH;
        localab.field_packGrayIconUrl = localgp.hWp;
        localab.field_packCoverUrl = localgp.hWk;
        localab.field_packName = localgp.hWc;
        localab.field_packDesc = localgp.hWd;
        localab.field_packAuthInfo = localgp.hWe;
        localab.field_packPrice = localgp.hWf;
        localab.field_packType = localgp.hWg;
        localab.field_packFlag = localgp.hWh;
        localab.field_packExpire = localgp.hWl;
        localab.field_packTimeStamp = localgp.hWx;
        localab.field_type = ab.iiE;
        if (localab.field_sort == 0)
          localab.field_sort = 1;
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = localab.field_packName;
        arrayOfObject[1] = Long.valueOf(localab.field_lastUseTime);
        arrayOfObject[2] = Integer.valueOf(localab.field_sort);
        z.d("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "jacks updateEmojiGroupByEmotionSummary: packname: %s, lasttime: %d, sort: %d", arrayOfObject);
        a(localab);
        i++;
        break;
      }
    }
    Ba("event_update_group");
    return true;
  }

  // ERROR //
  public final ArrayList bR(android.content.Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 211	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 212	java/util/ArrayList:<init>	()V
    //   9: astore_3
    //   10: invokestatic 481	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   13: astore 4
    //   15: ldc 78
    //   17: ldc_w 483
    //   20: invokestatic 382	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: aload_1
    //   24: invokevirtual 489	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   27: ldc_w 491
    //   30: invokevirtual 497	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   33: astore_2
    //   34: aload 4
    //   36: invokevirtual 501	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   39: aload_2
    //   40: invokevirtual 507	javax/xml/parsers/DocumentBuilder:parse	(Ljava/io/InputStream;)Lorg/w3c/dom/Document;
    //   43: invokeinterface 513 1 0
    //   48: ldc_w 515
    //   51: invokeinterface 521 2 0
    //   56: astore 11
    //   58: iconst_0
    //   59: istore 12
    //   61: iload 12
    //   63: aload 11
    //   65: invokeinterface 526 1 0
    //   70: if_icmpge +348 -> 418
    //   73: new 16	com/tencent/mm/storage/ab
    //   76: dup
    //   77: invokespecial 123	com/tencent/mm/storage/ab:<init>	()V
    //   80: astore 13
    //   82: aload 11
    //   84: iload 12
    //   86: invokeinterface 530 2 0
    //   91: checkcast 517	org/w3c/dom/Element
    //   94: astore 14
    //   96: aload 14
    //   98: ldc_w 532
    //   101: invokeinterface 536 2 0
    //   106: invokestatic 540	java/lang/Integer:decode	(Ljava/lang/String;)Ljava/lang/Integer;
    //   109: invokevirtual 543	java/lang/Integer:intValue	()I
    //   112: istore 15
    //   114: aload 14
    //   116: ldc_w 545
    //   119: invokeinterface 536 2 0
    //   124: invokestatic 551	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   127: ifne +110 -> 237
    //   130: iconst_2
    //   131: anewarray 233	java/lang/Object
    //   134: astore 17
    //   136: aload 17
    //   138: iconst_0
    //   139: iload 15
    //   141: invokestatic 253	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   144: aastore
    //   145: aload 17
    //   147: iconst_1
    //   148: aload 14
    //   150: ldc_w 545
    //   153: invokeinterface 536 2 0
    //   158: invokestatic 540	java/lang/Integer:decode	(Ljava/lang/String;)Ljava/lang/Integer;
    //   161: aastore
    //   162: ldc 78
    //   164: ldc_w 553
    //   167: aload 17
    //   169: invokestatic 258	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: getstatic 556	com/tencent/mm/storage/ab:iiI	I
    //   175: istore 18
    //   177: iload 15
    //   179: iload 18
    //   181: iand
    //   182: iload 18
    //   184: if_icmpne +339 -> 523
    //   187: iconst_1
    //   188: istore 19
    //   190: iload 19
    //   192: ifeq +176 -> 368
    //   195: aload_0
    //   196: invokespecial 558	com/tencent/mm/storage/ac:aIT	()I
    //   199: ifgt +9 -> 208
    //   202: invokestatic 560	com/tencent/mm/storage/ac:aJb	()Z
    //   205: ifeq +163 -> 368
    //   208: aload 13
    //   210: iconst_m1
    //   211: putfield 248	com/tencent/mm/storage/ab:field_sort	I
    //   214: invokestatic 147	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   217: invokevirtual 153	com/tencent/mm/model/b:oQ	()Lcom/tencent/mm/storage/e;
    //   220: ldc 154
    //   222: iconst_1
    //   223: invokestatic 160	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   226: invokevirtual 339	com/tencent/mm/storage/e:set	(ILjava/lang/Object;)V
    //   229: ldc 78
    //   231: ldc_w 562
    //   234: invokestatic 207	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: aload 13
    //   239: iload 15
    //   241: invokestatic 564	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   244: putfield 131	com/tencent/mm/storage/ab:field_productID	Ljava/lang/String;
    //   247: aload 13
    //   249: aload 14
    //   251: ldc_w 566
    //   254: invokeinterface 536 2 0
    //   259: putfield 236	com/tencent/mm/storage/ab:field_packName	Ljava/lang/String;
    //   262: aload 14
    //   264: ldc_w 568
    //   267: invokeinterface 536 2 0
    //   272: invokestatic 551	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   275: ifne +24 -> 299
    //   278: aload 13
    //   280: aload 14
    //   282: ldc_w 568
    //   285: invokeinterface 536 2 0
    //   290: invokestatic 540	java/lang/Integer:decode	(Ljava/lang/String;)Ljava/lang/Integer;
    //   293: invokevirtual 543	java/lang/Integer:intValue	()I
    //   296: putfield 281	com/tencent/mm/storage/ab:field_type	I
    //   299: aload 14
    //   301: ldc_w 570
    //   304: invokeinterface 536 2 0
    //   309: invokestatic 551	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   312: ifne +24 -> 336
    //   315: aload 13
    //   317: aload 14
    //   319: ldc_w 568
    //   322: invokeinterface 536 2 0
    //   327: invokestatic 540	java/lang/Integer:decode	(Ljava/lang/String;)Ljava/lang/Integer;
    //   330: invokevirtual 543	java/lang/Integer:intValue	()I
    //   333: putfield 447	com/tencent/mm/storage/ab:field_packType	I
    //   336: aload 13
    //   338: getfield 281	com/tencent/mm/storage/ab:field_type	I
    //   341: getstatic 105	com/tencent/mm/storage/ab:iiD	I
    //   344: if_icmpeq +14 -> 358
    //   347: aload 13
    //   349: getfield 281	com/tencent/mm/storage/ab:field_type	I
    //   352: getstatic 114	com/tencent/mm/storage/ab:TYPE_CUSTOM	I
    //   355: if_icmpne +162 -> 517
    //   358: aload_3
    //   359: aload 13
    //   361: invokevirtual 259	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   364: pop
    //   365: goto +152 -> 517
    //   368: aload 13
    //   370: iload 12
    //   372: iconst_1
    //   373: iadd
    //   374: putfield 248	com/tencent/mm/storage/ab:field_sort	I
    //   377: goto -140 -> 237
    //   380: astore 9
    //   382: ldc 78
    //   384: new 41	java/lang/StringBuilder
    //   387: dup
    //   388: ldc_w 572
    //   391: invokespecial 83	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   394: aload 9
    //   396: invokevirtual 573	java/io/IOException:getMessage	()Ljava/lang/String;
    //   399: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   405: invokestatic 95	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   408: aload_2
    //   409: ifnull +7 -> 416
    //   412: aload_2
    //   413: invokevirtual 576	java/io/InputStream:close	()V
    //   416: aload_3
    //   417: areturn
    //   418: aload_3
    //   419: invokevirtual 577	java/util/ArrayList:size	()I
    //   422: ifle +9 -> 431
    //   425: aload_0
    //   426: aload_3
    //   427: invokevirtual 579	com/tencent/mm/storage/ac:aO	(Ljava/util/List;)Z
    //   430: pop
    //   431: ldc 78
    //   433: ldc_w 581
    //   436: invokestatic 207	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   439: aload_2
    //   440: ifnull -24 -> 416
    //   443: aload_2
    //   444: invokevirtual 576	java/io/InputStream:close	()V
    //   447: aload_3
    //   448: areturn
    //   449: astore 20
    //   451: aload_3
    //   452: areturn
    //   453: astore 7
    //   455: ldc 78
    //   457: new 41	java/lang/StringBuilder
    //   460: dup
    //   461: ldc_w 583
    //   464: invokespecial 83	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   467: aload 7
    //   469: invokevirtual 86	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   472: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   475: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   478: invokestatic 95	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   481: aload_2
    //   482: ifnull -66 -> 416
    //   485: aload_2
    //   486: invokevirtual 576	java/io/InputStream:close	()V
    //   489: aload_3
    //   490: areturn
    //   491: astore 8
    //   493: aload_3
    //   494: areturn
    //   495: astore 5
    //   497: aload_2
    //   498: ifnull +7 -> 505
    //   501: aload_2
    //   502: invokevirtual 576	java/io/InputStream:close	()V
    //   505: aload 5
    //   507: athrow
    //   508: astore 10
    //   510: aload_3
    //   511: areturn
    //   512: astore 6
    //   514: goto -9 -> 505
    //   517: iinc 12 1
    //   520: goto -459 -> 61
    //   523: iconst_0
    //   524: istore 19
    //   526: goto -336 -> 190
    //
    // Exception table:
    //   from	to	target	type
    //   15	58	380	java/io/IOException
    //   61	177	380	java/io/IOException
    //   195	208	380	java/io/IOException
    //   208	237	380	java/io/IOException
    //   237	299	380	java/io/IOException
    //   299	336	380	java/io/IOException
    //   336	358	380	java/io/IOException
    //   358	365	380	java/io/IOException
    //   368	377	380	java/io/IOException
    //   418	431	380	java/io/IOException
    //   431	439	380	java/io/IOException
    //   443	447	449	java/lang/Exception
    //   15	58	453	java/lang/Exception
    //   61	177	453	java/lang/Exception
    //   195	208	453	java/lang/Exception
    //   208	237	453	java/lang/Exception
    //   237	299	453	java/lang/Exception
    //   299	336	453	java/lang/Exception
    //   336	358	453	java/lang/Exception
    //   358	365	453	java/lang/Exception
    //   368	377	453	java/lang/Exception
    //   418	431	453	java/lang/Exception
    //   431	439	453	java/lang/Exception
    //   485	489	491	java/lang/Exception
    //   15	58	495	finally
    //   61	177	495	finally
    //   195	208	495	finally
    //   208	237	495	finally
    //   237	299	495	finally
    //   299	336	495	finally
    //   336	358	495	finally
    //   358	365	495	finally
    //   368	377	495	finally
    //   382	408	495	finally
    //   418	431	495	finally
    //   431	439	495	finally
    //   455	481	495	finally
    //   412	416	508	java/lang/Exception
    //   501	505	512	java/lang/Exception
  }

  public final boolean f(ab paramab)
  {
    boolean bool = false;
    if (paramab == null)
      z.f("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "insert assertion!,invalid emojigroup info.");
    do
    {
      return bool;
      paramab.field_lastUseTime = System.currentTimeMillis();
      paramab.field_sort = 1;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramab.field_packName;
      arrayOfObject[1] = Long.valueOf(paramab.field_lastUseTime);
      z.d("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "jacks insert: packname: %s, lasttime: %d", arrayOfObject);
      paramab.field_lastUseTime = System.currentTimeMillis();
      if (paramab != null)
        paramab.field_flag = (0xFFFFFEFF & paramab.field_flag);
      bool = a(paramab);
    }
    while (!bool);
    Ba("event_update_group");
    return bool;
  }

  public final String wj()
  {
    return "EmojiGroupInfo";
  }

  public final boolean yY(String paramString)
  {
    Cursor localCursor = null;
    if (TextUtils.isEmpty(paramString))
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "product id is null.");
    String str = "select count(*) from EmojiGroupInfo where productID = '" + paramString + "' AND " + aJe() + " AND ( ( ( flag & 256 ) = 0 )  or ( flag is null ) ) ";
    try
    {
      localCursor = this.dtV.rawQuery(str, null);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        int i = localCursor.getInt(0);
        bool = false;
        if (i > 0)
          bool = true;
        return bool;
      }
      bool = false;
      return false;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "Check GroupId Exist Faild." + localException.getMessage());
      boolean bool = false;
      return false;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  public final boolean yZ(String paramString)
  {
    if (!TextUtils.isEmpty(paramString));
    while (true)
    {
      try
      {
        ab localab = K(paramString, true);
        if (localab == null)
        {
          bool = false;
          if (bool)
          {
            Ba("event_update_group");
            Ba("delete_group");
          }
          return bool;
        }
        if (localab != null)
        {
          if (localab.field_type == ab.TYPE_CUSTOM)
            z.d("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "jacks refuse delete custom emoji");
        }
        else
        {
          localab.field_lastUseTime = System.currentTimeMillis();
          bool = a(localab);
          continue;
        }
        localab.field_flag = (0x100 | localab.field_flag);
        localab.field_status = -1;
        localab.field_sort = 1;
        continue;
      }
      catch (Exception localException)
      {
        z.e("!56@/B4Tb64lLpKW6XSoHkFWUKjrfHlRdYTkPNgCqzuVREfnwf/nbV6Y1w==", "Delete By ProductId fail." + localException.getMessage());
      }
      boolean bool = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ac
 * JD-Core Version:    0.6.2
 */