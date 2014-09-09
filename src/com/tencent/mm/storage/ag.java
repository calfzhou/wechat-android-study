package com.tencent.mm.storage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.mm.a.c;
import com.tencent.mm.aq.a;
import com.tencent.mm.as.g;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class ag extends ah
  implements g
{
  public static final String[] dmc = arrayOfString;
  private static int[] ijj = { 2, 4, 8 };
  private af dtV;
  private String emojiPath;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(ad.dhu, "EmojiInfo");
  }

  public ag(af paramaf, String paramString)
  {
    super(paramaf, ad.dhu, "EmojiInfo", null);
    this.emojiPath = paramString;
    this.dtV = paramaf;
  }

  private static String a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString3))
    {
      z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "getIconPath : productId is null.");
      str1 = paramString1 + File.separator + paramString2;
      return str1;
    }
    String str1 = null;
    label96: StringBuilder localStringBuilder;
    switch (paramInt1)
    {
    default:
      if ((paramInt2 > 0) && (paramBoolean))
      {
        localStringBuilder = new StringBuilder().append(str1);
        if (paramInt2 <= 0)
          break label491;
      }
      break;
    case 1:
    case 7:
    case 5:
    case 6:
    case 2:
    case 3:
    case 4:
    case 8:
    case 9:
    }
    label491: for (String str2 = "&" + String.valueOf(paramInt2); ; str2 = "")
    {
      return str2;
      str1 = paramString1 + paramString3 + File.separator + com.tencent.mm.a.f.d(paramString3.getBytes());
      break label96;
      str1 = paramString1 + paramString3 + File.separator + paramString2;
      break label96;
      str1 = paramString1 + paramString3 + File.separator + paramString2 + "_panel";
      break label96;
      str1 = paramString1 + paramString3 + File.separator + paramString2 + "_panel_enable";
      break label96;
      str1 = paramString1 + paramString3 + File.separator + paramString2 + "_banner";
      break label96;
      str1 = paramString1 + paramString3 + File.separator + paramString2;
      break label96;
      str1 = paramString1 + paramString3 + File.separator + paramString2 + "_cover";
      break label96;
      str1 = paramString1 + paramString3 + File.separator + paramString2 + "_preview";
      break label96;
      str1 = paramString1 + paramString3 + File.separator + paramString2 + "_tagtip";
      break label96;
      break;
    }
  }

  private List a(InputStream[] paramArrayOfInputStream)
  {
    ArrayList localArrayList = new ArrayList();
    DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
    while (true)
    {
      int m;
      String str1;
      try
      {
        DocumentBuilder localDocumentBuilder = localDocumentBuilderFactory.newDocumentBuilder();
        int i = 0;
        if (i < 2)
        {
          InputStream localInputStream = paramArrayOfInputStream[i];
          if (localInputStream != null)
          {
            NodeList localNodeList1 = localDocumentBuilder.parse(localInputStream).getDocumentElement().getElementsByTagName("catalog");
            int j = 0;
            if (j < localNodeList1.getLength())
            {
              Element localElement1 = (Element)localNodeList1.item(j);
              int k = Integer.decode(localElement1.getAttribute("id")).intValue();
              NodeList localNodeList2 = localElement1.getElementsByTagName("emoji");
              m = 0;
              if (m < localNodeList2.getLength())
              {
                ad localad = new ad(this.emojiPath);
                Element localElement2 = (Element)localNodeList2.item(m);
                localad.field_md5 = localElement2.getAttribute("md5");
                if (!localad.aJl())
                  break label360;
                localad.field_catalog = k;
                localad.field_groupId = String.valueOf(k);
                localad.field_name = localElement2.getAttribute("name");
                localad.field_type = Integer.decode(localElement2.getAttribute("type")).intValue();
                Node localNode = localElement2.getFirstChild();
                if ((localNode instanceof CharacterData))
                {
                  str1 = ((CharacterData)localNode).getData();
                  if (localad.field_type != ad.iiZ)
                    break label353;
                  str2 = new String(Base64.decode(str1, 0));
                  localad.field_content = str2;
                  localArrayList.add(localad);
                  break label360;
                }
                str1 = "";
                continue;
              }
              j++;
              continue;
            }
          }
          i++;
          continue;
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "parse xml error; " + localException.getMessage());
      }
      return localArrayList;
      label353: String str2 = str1;
      continue;
      label360: m++;
    }
  }

  public static String b(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    int i;
    int k;
    switch (paramInt1)
    {
    default:
      i = -1;
      int[] arrayOfInt = ijj;
      int j = arrayOfInt.length;
      k = 0;
      label44: if (k < j)
        if (i != arrayOfInt[k])
          break;
      break;
    case 82:
    case 83:
    case 84:
    }
    for (int m = 1; ; m = 0)
    {
      if (m == 0)
        break label112;
      return a(paramString1, paramString2, paramString3, i, paramInt2, true);
      i = 2;
      break;
      i = 4;
      break;
      i = 8;
      break;
      k++;
      break label44;
    }
    label112: return a(paramString1, paramString2, paramString3, i, paramInt2, false);
  }

  public static String bs(String paramString1, String paramString2)
  {
    return com.tencent.mm.a.f.d((paramString1 + paramString2).getBytes());
  }

  public static Bitmap i(Context paramContext, String paramString, int paramInt)
  {
    int i;
    int j;
    switch (paramInt)
    {
    default:
      i = a.fromDPToPix(paramContext, 70);
      j = a.fromDPToPix(paramContext, 70);
    case 3:
    case 4:
    case 2:
    case 5:
    case 6:
    case 7:
    case 1:
    }
    while (true)
    {
      return i.a(paramString, i, j, false);
      i = a.fromDPToPix(paramContext, 50);
      j = a.fromDPToPix(paramContext, 50);
      continue;
      i = a.fromDPToPix(paramContext, 160);
      j = a.fromDPToPix(paramContext, 320);
      continue;
      i = a.fromDPToPix(paramContext, 160);
      j = a.fromDPToPix(paramContext, 320);
      continue;
      j = a.fromDPToPix(paramContext, 26);
      i = j;
      continue;
      i = a.fromDPToPix(paramContext, 70);
      j = a.fromDPToPix(paramContext, 70);
      continue;
      i = a.fromDPToPix(paramContext, 48);
      j = a.fromDPToPix(paramContext, 48);
    }
  }

  private boolean j(ad paramad)
  {
    if ((paramad == null) || (!paramad.aJl()))
      z.f("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "insert assertion!, invalid emojiInfo");
    long l;
    do
    {
      return false;
      ContentValues localContentValues = paramad.ir();
      l = this.dtV.replace("EmojiInfo", "md5", localContentValues);
      if (l != -1L)
        Ba(paramad.vu());
    }
    while (l < 0L);
    return true;
  }

  private boolean og(int paramInt)
  {
    af localaf = this.dtV;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramInt);
    return localaf.delete("EmojiInfo", "catalog=?", arrayOfString) >= 0;
  }

  public static int oi(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return ad.iiL;
    case 2:
      return 82;
    case 4:
      return 83;
    case 8:
    }
    return 84;
  }

  public final int KG()
  {
    String str = "select  count(*) from EmojiInfo where catalog=" + ab.iiI + " or catalog=" + ab.iiJ;
    Cursor localCursor = this.dtV.rawQuery(str, null);
    localCursor.moveToFirst();
    int i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final List KH()
  {
    ArrayList localArrayList = new ArrayList();
    String str = "select * from EmojiInfo where catalog=" + ab.iiI + " or catalog=" + ab.iiJ;
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor.getCount() > 0)
    {
      localCursor.moveToFirst();
      do
      {
        ad localad = new ad(this.emojiPath);
        localad.b(localCursor);
        localArrayList.add(localad);
      }
      while (localCursor.moveToNext());
    }
    localCursor.close();
    return localArrayList;
  }

  public final int a(com.tencent.mm.as.f paramf)
  {
    if (paramf != null)
      this.dtV = paramf;
    return 0;
  }

  // ERROR //
  public final Bitmap a(Context paramContext, int paramInt, ad paramad)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc_w 344
    //   6: fstore 5
    //   8: aload_3
    //   9: invokevirtual 347	com/tencent/mm/storage/ad:aJk	()Z
    //   12: istore 13
    //   14: aconst_null
    //   15: astore 4
    //   17: iload 13
    //   19: ifeq +70 -> 89
    //   22: new 62	java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   29: aload_3
    //   30: invokevirtual 350	com/tencent/mm/storage/ad:aJf	()Ljava/lang/String;
    //   33: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: aload_3
    //   37: getfield 189	com/tencent/mm/storage/ad:field_groupId	Ljava/lang/String;
    //   40: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: getstatic 73	java/io/File:separator	Ljava/lang/String;
    //   46: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: aload_3
    //   50: invokevirtual 277	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   53: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: ldc_w 352
    //   59: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: iload_2
    //   63: invokevirtual 304	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   66: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: astore 14
    //   71: invokestatic 358	com/tencent/mm/storage/aj:aJr	()Lcom/tencent/mm/storage/ai;
    //   74: aload 14
    //   76: invokevirtual 364	com/tencent/mm/storage/ai:zi	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   79: astore 10
    //   81: aload 10
    //   83: ifnull +49 -> 132
    //   86: aload 10
    //   88: areturn
    //   89: new 62	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   96: aload_3
    //   97: invokevirtual 350	com/tencent/mm/storage/ad:aJf	()Ljava/lang/String;
    //   100: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload_3
    //   104: invokevirtual 277	com/tencent/mm/storage/ad:vu	()Ljava/lang/String;
    //   107: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: ldc_w 352
    //   113: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: iload_2
    //   117: invokevirtual 304	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   120: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: astore 18
    //   125: aload 18
    //   127: astore 14
    //   129: goto -58 -> 71
    //   132: new 366	java/io/FileInputStream
    //   135: dup
    //   136: aload 14
    //   138: invokespecial 367	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   141: astore 15
    //   143: aload_1
    //   144: invokestatic 371	com/tencent/mm/aq/a:getDensity	(Landroid/content/Context;)F
    //   147: fload 5
    //   149: fcmpl
    //   150: ifle +35 -> 185
    //   153: aload 15
    //   155: fload 5
    //   157: invokestatic 374	com/tencent/mm/sdk/platformtools/i:a	(Ljava/io/InputStream;F)Landroid/graphics/Bitmap;
    //   160: astore 10
    //   162: invokestatic 358	com/tencent/mm/storage/aj:aJr	()Lcom/tencent/mm/storage/ai;
    //   165: aload 14
    //   167: aload 10
    //   169: invokevirtual 378	com/tencent/mm/storage/ai:q	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   172: aload 15
    //   174: invokevirtual 379	java/io/FileInputStream:close	()V
    //   177: aload 10
    //   179: areturn
    //   180: astore 16
    //   182: aload 10
    //   184: areturn
    //   185: aload_1
    //   186: invokestatic 371	com/tencent/mm/aq/a:getDensity	(Landroid/content/Context;)F
    //   189: fstore 17
    //   191: fload 17
    //   193: fstore 5
    //   195: goto -42 -> 153
    //   198: astore 8
    //   200: aload 8
    //   202: astore 9
    //   204: aconst_null
    //   205: astore 10
    //   207: ldc 52
    //   209: aload 9
    //   211: invokevirtual 380	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   214: invokestatic 236	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   217: aload_3
    //   218: ldc 109
    //   220: putfield 383	com/tencent/mm/storage/ad:field_framesInfo	Ljava/lang/String;
    //   223: aload_0
    //   224: aload_3
    //   225: invokevirtual 386	com/tencent/mm/storage/ag:k	(Lcom/tencent/mm/storage/ad;)Z
    //   228: pop
    //   229: aload 4
    //   231: ifnull +62 -> 293
    //   234: aload 4
    //   236: invokevirtual 379	java/io/FileInputStream:close	()V
    //   239: aload 10
    //   241: areturn
    //   242: astore 12
    //   244: aload 10
    //   246: areturn
    //   247: astore 6
    //   249: aload 4
    //   251: ifnull +8 -> 259
    //   254: aload 4
    //   256: invokevirtual 379	java/io/FileInputStream:close	()V
    //   259: aload 6
    //   261: athrow
    //   262: astore 7
    //   264: goto -5 -> 259
    //   267: astore 6
    //   269: aload 15
    //   271: astore 4
    //   273: goto -24 -> 249
    //   276: astore 9
    //   278: aconst_null
    //   279: astore 4
    //   281: goto -74 -> 207
    //   284: astore 9
    //   286: aload 15
    //   288: astore 4
    //   290: goto -83 -> 207
    //   293: aload 10
    //   295: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   172	177	180	java/io/IOException
    //   8	14	198	java/io/FileNotFoundException
    //   22	71	198	java/io/FileNotFoundException
    //   71	81	198	java/io/FileNotFoundException
    //   89	125	198	java/io/FileNotFoundException
    //   234	239	242	java/io/IOException
    //   8	14	247	finally
    //   22	71	247	finally
    //   71	81	247	finally
    //   89	125	247	finally
    //   132	143	247	finally
    //   207	229	247	finally
    //   254	259	262	java/io/IOException
    //   143	153	267	finally
    //   153	172	267	finally
    //   185	191	267	finally
    //   132	143	276	java/io/FileNotFoundException
    //   143	153	284	java/io/FileNotFoundException
    //   153	172	284	java/io/FileNotFoundException
    //   185	191	284	java/io/FileNotFoundException
  }

  public final Bitmap a(Context paramContext, String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString1))
      z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "getIcon : productId is null.");
    int i;
    Object localObject;
    String str;
    if (paramBoolean)
    {
      int[] arrayOfInt = new int[4];
      arrayOfInt[0] = -1;
      arrayOfInt[1] = ad.iiW;
      arrayOfInt[2] = ad.iiX;
      arrayOfInt[3] = ad.iiY;
      i = 0;
      localObject = null;
      if (i >= 4)
        break label205;
      str = a(paramString1, paramInt, paramString2, arrayOfInt[i], true);
      if (c.ac(str))
        localObject = str;
    }
    label205: for (int j = 1; ; j = 0)
    {
      if (j == 0)
      {
        z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "banner icon does not exist. icon path :" + (String)localObject + "...., icon type:" + paramInt);
        return null;
        i++;
        localObject = str;
        break;
        localObject = j(paramString1, paramInt, paramString2);
        if (!c.ac((String)localObject))
        {
          z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "icon does not exist. icon path :" + (String)localObject + ", icon type:" + paramInt);
          return null;
        }
      }
      return i(paramContext, (String)localObject, paramInt);
    }
  }

  public final ad a(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    while (true)
    {
      int i;
      int j;
      try
      {
        if (TextUtils.isEmpty(paramString1))
        {
          z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "getIcon : productId is null.");
          localObject4 = null;
          return localObject4;
        }
        ad localad = new ad();
        if (paramBoolean)
        {
          int[] arrayOfInt = new int[3];
          arrayOfInt[0] = ad.iiX;
          arrayOfInt[1] = ad.iiW;
          arrayOfInt[2] = ad.iiY;
          i = 0;
          localObject2 = "";
          if (i >= 3)
            break label292;
          j = arrayOfInt[i];
          localObject3 = a(paramString1, paramInt, paramString2, j, true);
          File localFile = new File((String)localObject3);
          if (!localFile.exists())
            break label302;
          if (localFile.length() >= 1L)
            break label312;
          localFile.delete();
          break label302;
          localad.field_type = j;
          k = 1;
          if (k != 0)
            continue;
          z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "banner icon does not exist. icon path :" + (String)localObject3 + "...., icon type:" + paramInt);
          localObject4 = null;
          continue;
          j = ad.iiW;
          continue;
        }
        String str = j(paramString1, paramInt, paramString2);
        if (!c.ac(str))
        {
          z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "icon does not exist. icon path :" + str + ", icon type:" + paramInt);
          localObject4 = null;
          continue;
        }
        localad.field_md5 = bs(paramString1, paramString2);
        localad.field_catalog = oi(paramInt);
        localad.field_groupId = paramString1;
        Object localObject4 = localad;
        continue;
      }
      finally
      {
      }
      label292: Object localObject3 = localObject2;
      int k = 0;
      continue;
      label302: i++;
      Object localObject2 = localObject3;
      continue;
      label312: if (j <= 0);
    }
  }

  public final ad a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    return a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, null, null, null, paramString3);
  }

  public final ad a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    if ((paramString1 == null) || (paramString1.length() <= 0))
      z.f("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "create assertion!, invalid md5");
    while (true)
    {
      return null;
      ad localad;
      if ((paramString1 == null) || (paramString1.length() <= 0))
      {
        z.f("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "create assertion!, invalid md5");
        localad = null;
      }
      while (j(localad))
      {
        Ba("create_emoji_info_notify");
        return localad;
        localad = ze(paramString1);
        if (localad == null)
          localad = new ad(this.emojiPath);
        localad.field_md5 = paramString1;
        localad.field_svrid = paramString2;
        localad.field_catalog = paramInt1;
        localad.field_type = paramInt2;
        localad.field_size = paramInt3;
        localad.field_state = ad.ijc;
        localad.field_reserved1 = null;
        localad.field_reserved2 = paramString4;
        localad.field_app_id = paramString5;
        if (!TextUtils.isEmpty(paramString6))
          localad.field_groupId = paramString6;
      }
    }
  }

  public final String a(String paramString1, int paramInt1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    return a(this.emojiPath, bs(paramString1, paramString2), paramString1, paramInt1, paramInt2, paramBoolean);
  }

  public final boolean a(String paramString1, int paramInt1, String paramString2, byte[] paramArrayOfByte, int paramInt2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "save icon fail. invalid argumnet");
      return false;
    }
    boolean bool = false;
    if (paramInt2 > 0)
      bool = true;
    return e(paramString1, a(paramString1, paramInt1, paramString2, paramInt2, bool), paramArrayOfByte);
  }

  public final List aJq()
  {
    ArrayList localArrayList = new ArrayList();
    String str = "select * from EmojiInfo where catalog=" + ab.iiJ;
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor.getCount() > 0)
    {
      localCursor.moveToFirst();
      do
      {
        ad localad = new ad(this.emojiPath);
        localad.b(localCursor);
        localArrayList.add(localad);
      }
      while (localCursor.moveToNext());
    }
    localCursor.close();
    return localArrayList;
  }

  public final boolean aQ(List paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0))
      return false;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UPDATE");
    localStringBuilder.append(" EmojiInfo ");
    localStringBuilder.append(" SET ");
    localStringBuilder.append("catalog");
    localStringBuilder.append("=");
    localStringBuilder.append(ad.iiK);
    localStringBuilder.append(" where ");
    localStringBuilder.append("md5");
    localStringBuilder.append(" IN (");
    for (int i = 0; i < paramList.size(); i++)
    {
      localStringBuilder.append("'" + (String)paramList.get(i) + "'");
      if (i < -1 + paramList.size())
        localStringBuilder.append(",");
    }
    localStringBuilder.append(")");
    z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", localStringBuilder.toString());
    if (this.dtV.bp("EmojiInfo", localStringBuilder.toString()))
      Ba("delete_emoji_info_notify");
    return true;
  }

  public final ad b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, String paramString4, String paramString5)
  {
    return a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, null, paramString3, paramString4, paramString5);
  }

  // ERROR //
  public final boolean bU(Context paramContext)
  {
    // Byte code:
    //   0: ldc 52
    //   2: ldc_w 522
    //   5: invokestatic 524	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   8: aload_0
    //   9: ldc_w 526
    //   12: invokevirtual 452	com/tencent/mm/storage/ag:ze	(Ljava/lang/String;)Lcom/tencent/mm/storage/ad;
    //   15: astore_2
    //   16: aload_0
    //   17: ldc_w 528
    //   20: invokevirtual 452	com/tencent/mm/storage/ag:ze	(Ljava/lang/String;)Lcom/tencent/mm/storage/ad;
    //   23: astore_3
    //   24: aload_0
    //   25: getstatic 531	com/tencent/mm/storage/ad:iiM	I
    //   28: invokevirtual 534	com/tencent/mm/storage/ag:oh	(I)I
    //   31: istore 4
    //   33: iconst_1
    //   34: anewarray 536	java/lang/Object
    //   37: astore 5
    //   39: aload 5
    //   41: iconst_0
    //   42: iload 4
    //   44: invokestatic 539	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   47: aastore
    //   48: ldc 52
    //   50: ldc_w 541
    //   53: aload 5
    //   55: invokestatic 544	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: aload_2
    //   59: ifnonnull +23 -> 82
    //   62: aload_3
    //   63: ifnull +13 -> 76
    //   66: aload_3
    //   67: invokevirtual 547	com/tencent/mm/storage/ad:getContent	()Ljava/lang/String;
    //   70: invokevirtual 442	java/lang/String:length	()I
    //   73: ifeq +9 -> 82
    //   76: iload 4
    //   78: iconst_2
    //   79: if_icmpgt +35 -> 114
    //   82: ldc 52
    //   84: ldc_w 549
    //   87: invokestatic 524	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   90: aload_0
    //   91: getstatic 293	com/tencent/mm/storage/ad:iiL	I
    //   94: invokespecial 551	com/tencent/mm/storage/ag:og	(I)Z
    //   97: pop
    //   98: aload_0
    //   99: getstatic 554	com/tencent/mm/storage/ad:iiU	I
    //   102: invokespecial 551	com/tencent/mm/storage/ag:og	(I)Z
    //   105: pop
    //   106: aload_0
    //   107: getstatic 557	com/tencent/mm/storage/ad:iiT	I
    //   110: invokespecial 551	com/tencent/mm/storage/ag:og	(I)Z
    //   113: pop
    //   114: aload_0
    //   115: ldc_w 559
    //   118: invokevirtual 452	com/tencent/mm/storage/ag:ze	(Ljava/lang/String;)Lcom/tencent/mm/storage/ad;
    //   121: astore 9
    //   123: aload 9
    //   125: ifnull +46 -> 171
    //   128: aload 9
    //   130: getfield 186	com/tencent/mm/storage/ad:field_catalog	I
    //   133: getstatic 293	com/tencent/mm/storage/ad:iiL	I
    //   136: if_icmpne +35 -> 171
    //   139: ldc 52
    //   141: ldc_w 561
    //   144: invokestatic 524	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   147: aload_0
    //   148: getstatic 293	com/tencent/mm/storage/ad:iiL	I
    //   151: invokespecial 551	com/tencent/mm/storage/ag:og	(I)Z
    //   154: pop
    //   155: aload_0
    //   156: getstatic 554	com/tencent/mm/storage/ad:iiU	I
    //   159: invokespecial 551	com/tencent/mm/storage/ag:og	(I)Z
    //   162: pop
    //   163: aload_0
    //   164: getstatic 557	com/tencent/mm/storage/ad:iiT	I
    //   167: invokespecial 551	com/tencent/mm/storage/ag:og	(I)Z
    //   170: pop
    //   171: aload_1
    //   172: ldc_w 563
    //   175: invokestatic 567	com/tencent/mm/storage/ad:ap	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   178: astore 10
    //   180: aload 10
    //   182: ifnull +35 -> 217
    //   185: ldc 52
    //   187: ldc_w 569
    //   190: invokestatic 524	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: aload_0
    //   194: getstatic 293	com/tencent/mm/storage/ad:iiL	I
    //   197: invokespecial 551	com/tencent/mm/storage/ag:og	(I)Z
    //   200: pop
    //   201: aload_0
    //   202: getstatic 554	com/tencent/mm/storage/ad:iiU	I
    //   205: invokespecial 551	com/tencent/mm/storage/ag:og	(I)Z
    //   208: pop
    //   209: aload_0
    //   210: getstatic 557	com/tencent/mm/storage/ad:iiT	I
    //   213: invokespecial 551	com/tencent/mm/storage/ag:og	(I)Z
    //   216: pop
    //   217: aload 10
    //   219: ifnull +8 -> 227
    //   222: aload 10
    //   224: invokevirtual 572	java/io/InputStream:close	()V
    //   227: aload_0
    //   228: getstatic 293	com/tencent/mm/storage/ad:iiL	I
    //   231: invokevirtual 534	com/tencent/mm/storage/ag:oh	(I)I
    //   234: ifeq +5 -> 239
    //   237: iconst_1
    //   238: ireturn
    //   239: aconst_null
    //   240: astore 11
    //   242: aconst_null
    //   243: astore 12
    //   245: ldc 52
    //   247: ldc_w 574
    //   250: invokestatic 524	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   253: invokestatic 579	java/lang/System:currentTimeMillis	()J
    //   256: lstore 17
    //   258: aload_1
    //   259: invokevirtual 585	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   262: ldc_w 587
    //   265: invokevirtual 593	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   268: astore 11
    //   270: aconst_null
    //   271: astore 12
    //   273: iload 4
    //   275: ifne +15 -> 290
    //   278: aload_1
    //   279: invokevirtual 585	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   282: ldc_w 595
    //   285: invokevirtual 593	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   288: astore 12
    //   290: aload_0
    //   291: iconst_2
    //   292: anewarray 571	java/io/InputStream
    //   295: dup
    //   296: iconst_0
    //   297: aload 11
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload 12
    //   304: aastore
    //   305: invokespecial 597	com/tencent/mm/storage/ag:a	([Ljava/io/InputStream;)Ljava/util/List;
    //   308: astore 19
    //   310: invokestatic 579	java/lang/System:currentTimeMillis	()J
    //   313: lstore 20
    //   315: iconst_1
    //   316: anewarray 536	java/lang/Object
    //   319: astore 22
    //   321: aload 22
    //   323: iconst_0
    //   324: lload 20
    //   326: lload 17
    //   328: lsub
    //   329: invokestatic 602	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   332: aastore
    //   333: ldc 52
    //   335: ldc_w 604
    //   338: aload 22
    //   340: invokestatic 544	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   343: invokestatic 579	java/lang/System:currentTimeMillis	()J
    //   346: lstore 23
    //   348: aload 19
    //   350: invokeinterface 485 1 0
    //   355: ifle +121 -> 476
    //   358: aload 19
    //   360: invokeinterface 485 1 0
    //   365: ifle +111 -> 476
    //   368: ldc2_w 273
    //   371: lstore 29
    //   373: aload_0
    //   374: getfield 43	com/tencent/mm/storage/ag:dtV	Lcom/tencent/mm/sdk/f/af;
    //   377: instanceof 606
    //   380: ifeq +271 -> 651
    //   383: aload_0
    //   384: getfield 43	com/tencent/mm/storage/ag:dtV	Lcom/tencent/mm/sdk/f/af;
    //   387: checkcast 606	com/tencent/mm/as/h
    //   390: astore 36
    //   392: aload 36
    //   394: invokestatic 612	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   397: invokevirtual 615	java/lang/Thread:getId	()J
    //   400: invokevirtual 619	com/tencent/mm/as/h:dc	(J)J
    //   403: lstore 29
    //   405: aload 36
    //   407: astore 31
    //   409: aload 19
    //   411: invokeinterface 623 1 0
    //   416: astore 32
    //   418: aload 32
    //   420: invokeinterface 628 1 0
    //   425: ifeq +114 -> 539
    //   428: aload 32
    //   430: invokeinterface 632 1 0
    //   435: checkcast 20	com/tencent/mm/storage/ad
    //   438: invokevirtual 266	com/tencent/mm/storage/ad:ir	()Landroid/content/ContentValues;
    //   441: astore 34
    //   443: aload_0
    //   444: getfield 43	com/tencent/mm/storage/ag:dtV	Lcom/tencent/mm/sdk/f/af;
    //   447: ldc 26
    //   449: ldc 175
    //   451: aload 34
    //   453: invokeinterface 272 4 0
    //   458: lconst_0
    //   459: lcmp
    //   460: ifge -42 -> 418
    //   463: aload 31
    //   465: ifnull +11 -> 476
    //   468: aload 31
    //   470: lload 29
    //   472: invokevirtual 636	com/tencent/mm/as/h:dd	(J)I
    //   475: pop
    //   476: invokestatic 579	java/lang/System:currentTimeMillis	()J
    //   479: lstore 25
    //   481: iconst_1
    //   482: anewarray 536	java/lang/Object
    //   485: astore 27
    //   487: aload 27
    //   489: iconst_0
    //   490: lload 25
    //   492: lload 23
    //   494: lsub
    //   495: invokestatic 602	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   498: aastore
    //   499: ldc 52
    //   501: ldc_w 638
    //   504: aload 27
    //   506: invokestatic 544	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   509: ldc 52
    //   511: ldc_w 640
    //   514: invokestatic 60	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   517: aload 11
    //   519: ifnull +18 -> 537
    //   522: aload 12
    //   524: ifnull +13 -> 537
    //   527: aload 11
    //   529: invokevirtual 572	java/io/InputStream:close	()V
    //   532: aload 12
    //   534: invokevirtual 572	java/io/InputStream:close	()V
    //   537: iconst_1
    //   538: ireturn
    //   539: aload 31
    //   541: ifnull -65 -> 476
    //   544: aload 31
    //   546: lload 29
    //   548: invokevirtual 636	com/tencent/mm/as/h:dd	(J)I
    //   551: pop
    //   552: goto -76 -> 476
    //   555: astore 15
    //   557: ldc 52
    //   559: new 62	java/lang/StringBuilder
    //   562: dup
    //   563: ldc_w 642
    //   566: invokespecial 82	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   569: aload 15
    //   571: invokevirtual 643	java/io/IOException:getMessage	()Ljava/lang/String;
    //   574: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   580: invokestatic 236	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   583: aload 11
    //   585: ifnull -48 -> 537
    //   588: aload 12
    //   590: ifnull -53 -> 537
    //   593: aload 11
    //   595: invokevirtual 572	java/io/InputStream:close	()V
    //   598: aload 12
    //   600: invokevirtual 572	java/io/InputStream:close	()V
    //   603: goto -66 -> 537
    //   606: astore 16
    //   608: goto -71 -> 537
    //   611: astore 13
    //   613: aload 11
    //   615: ifnull +18 -> 633
    //   618: aload 12
    //   620: ifnull +13 -> 633
    //   623: aload 11
    //   625: invokevirtual 572	java/io/InputStream:close	()V
    //   628: aload 12
    //   630: invokevirtual 572	java/io/InputStream:close	()V
    //   633: aload 13
    //   635: athrow
    //   636: astore 37
    //   638: goto -411 -> 227
    //   641: astore 14
    //   643: goto -10 -> 633
    //   646: astore 28
    //   648: goto -111 -> 537
    //   651: aconst_null
    //   652: astore 31
    //   654: goto -245 -> 409
    //
    // Exception table:
    //   from	to	target	type
    //   245	270	555	java/io/IOException
    //   278	290	555	java/io/IOException
    //   290	368	555	java/io/IOException
    //   373	405	555	java/io/IOException
    //   409	418	555	java/io/IOException
    //   418	463	555	java/io/IOException
    //   468	476	555	java/io/IOException
    //   476	517	555	java/io/IOException
    //   544	552	555	java/io/IOException
    //   593	603	606	java/lang/Exception
    //   245	270	611	finally
    //   278	290	611	finally
    //   290	368	611	finally
    //   373	405	611	finally
    //   409	418	611	finally
    //   418	463	611	finally
    //   468	476	611	finally
    //   476	517	611	finally
    //   544	552	611	finally
    //   557	583	611	finally
    //   222	227	636	java/lang/Exception
    //   623	633	641	java/lang/Exception
    //   527	537	646	java/lang/Exception
  }

  public final boolean br(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() != 32));
    ContentValues localContentValues;
    do
    {
      return false;
      localContentValues = new ContentValues();
      localContentValues.put("md5", paramString1);
      localContentValues.put("framesInfo", paramString2);
    }
    while (this.dtV.replace("EmojiInfo", "md5", localContentValues) < 0L);
    return true;
  }

  public final boolean e(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    if (TextUtils.isEmpty(paramString2))
    {
      z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "save icon fail. icon path is null.");
      return false;
    }
    File localFile = new File(paramString2);
    if (localFile.exists())
      localFile.delete();
    try
    {
      while (true)
      {
        FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
        localFileOutputStream.write(paramArrayOfByte);
        localFileOutputStream.close();
        Ba(paramString1);
        return true;
        localFile.getParentFile().mkdirs();
      }
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "saveIcon, exception, e = " + localException.getMessage());
    }
    return false;
  }

  public final boolean g(List paramList, String paramString)
  {
    if (paramList.size() <= 0)
    {
      z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "insert emoji list faild. list is null or size is 0.");
      return false;
    }
    h localh1;
    long l1;
    if ((this.dtV instanceof h))
    {
      h localh2 = (h)this.dtV;
      long l2 = localh2.dc(Thread.currentThread().getId());
      localh1 = localh2;
      l1 = l2;
    }
    while (true)
    {
      List localList = kK(paramString);
      HashMap localHashMap = new HashMap();
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext())
      {
        ad localad3 = (ad)localIterator1.next();
        localHashMap.put(localad3.vu(), localad3);
      }
      for (int i = 0; i < paramList.size(); i++)
      {
        ad localad2 = (ad)paramList.get(i);
        this.dtV.replace("EmojiInfo", "md5", localad2.ir());
        localHashMap.remove(localad2.vu());
      }
      Iterator localIterator2 = localHashMap.entrySet().iterator();
      while (localIterator2.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator2.next();
        String str = (String)localEntry.getKey();
        ad localad1 = (ad)localEntry.getValue();
        localad1.field_temp = 1;
        this.dtV.update("EmojiInfo", localad1.ir(), "md5=?", new String[] { str });
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localad1.field_groupId;
        z.d("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "jacks modify excess emoji to %s", arrayOfObject);
      }
      if (localh1 != null)
        localh1.dd(l1);
      return true;
      l1 = -1L;
      localh1 = null;
    }
  }

  public final List gq(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = null;
    try
    {
      localCursor = of(paramInt);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        boolean bool;
        do
        {
          ad localad = new ad(this.emojiPath);
          localad.b(localCursor);
          localArrayList.add(localad);
          bool = localCursor.moveToNext();
        }
        while (bool);
      }
      return localArrayList;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.toString();
      z.e("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "[getAllByGroup]Exception:%s", arrayOfObject);
      return localArrayList;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  public final String j(String paramString1, int paramInt, String paramString2)
  {
    return a(paramString1, paramInt, paramString2, -1, false);
  }

  public final boolean k(ad paramad)
  {
    boolean bool = true;
    if ((paramad == null) || (!paramad.aJl()))
    {
      z.f("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "insert assertion!, invalid emojiInfo");
      bool = false;
    }
    int i;
    do
    {
      return bool;
      af localaf = this.dtV;
      ContentValues localContentValues = paramad.ir();
      String[] arrayOfString = new String[bool];
      arrayOfString[0] = paramad.vu();
      i = localaf.update("EmojiInfo", localContentValues, "md5=?", arrayOfString);
      if (i > 0)
      {
        Ba(paramad.vu());
        Ba("event_update_emoji");
      }
    }
    while (i > 0);
    return false;
  }

  public final boolean kI(String paramString)
  {
    boolean bool1 = true;
    if ((paramString == null) || (paramString.trim().equals("")))
      bool1 = false;
    while (true)
    {
      return bool1;
      Cursor localCursor = null;
      try
      {
        af localaf = this.dtV;
        String[] arrayOfString = new String[2];
        arrayOfString[0] = ad.iiK;
        arrayOfString[1] = h.cG(paramString);
        localCursor = localaf.rawQuery("select reserved2 from EmojiInfo where catalog != ? and reserved2 = ?", arrayOfString);
        if (localCursor != null)
        {
          boolean bool2 = localCursor.moveToFirst();
          if (bool2)
            return bool1;
        }
        return false;
      }
      catch (Exception localException)
      {
        while (true)
        {
          z.e("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "Check GroupId Exist Faild." + localException.getMessage());
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
  }

  public final int kJ(String paramString)
  {
    Cursor localCursor = null;
    try
    {
      localCursor = this.dtV.rawQuery("select count(*) from EmojiInfo where groupId= ? and temp=?", new String[] { paramString, "0" });
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
      z.e("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "[countProductId]Count ProductId fail." + localException.getMessage());
      int i = 0;
      return 0;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  public final List kK(String paramString)
  {
    int i = 1;
    ArrayList localArrayList = new ArrayList();
    String str1 = "default";
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramString;
    arrayOfString[i] = y.aGW().toLowerCase();
    Cursor localCursor1 = this.dtV.rawQuery("select desc from EmojiInfoDesc where groupId=? and lang=? ", arrayOfString);
    if ((localCursor1 != null) && (localCursor1.moveToFirst()))
    {
      String str2 = localCursor1.getString(localCursor1.getColumnIndex("desc"));
      Object[] arrayOfObject2 = new Object[i];
      arrayOfObject2[0] = str2;
      z.i("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "cpan[checkProductLangExist] desc:%s", arrayOfObject2);
      if (ch.jb(str2));
    }
    while (true)
    {
      if (localCursor1 != null)
        localCursor1.close();
      if (i != 0)
        str1 = y.aGW().toLowerCase();
      Cursor localCursor2 = null;
      try
      {
        localCursor2 = this.dtV.rawQuery("SELECT a.*, b.desc FROM EmojiInfo AS a LEFT OUTER JOIN EmojiInfoDesc AS b ON a.md5 = b.md5 AND b.lang =? WHERE a.groupId =? AND a.temp=? ORDER BY a.idx ASC", new String[] { str1, paramString, "0" });
        if ((localCursor2 != null) && (localCursor2.moveToFirst()))
        {
          boolean bool;
          do
          {
            ad localad = new ad(this.emojiPath);
            localad.b(localCursor2);
            localArrayList.add(localad);
            bool = localCursor2.moveToNext();
          }
          while (bool);
        }
        return localArrayList;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.toString();
        z.w("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "[getEmojiListByGroupId] Exception:%s", arrayOfObject1);
        return localArrayList;
      }
      finally
      {
        if (localCursor2 != null)
          localCursor2.close();
      }
      i = 0;
    }
  }

  public final Cursor of(int paramInt)
  {
    af localaf = this.dtV;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = String.valueOf(paramInt);
    arrayOfString[1] = "0";
    return localaf.a("EmojiInfo", null, "catalog=? and temp=?", arrayOfString, null, null);
  }

  public final int oh(int paramInt)
  {
    af localaf = this.dtV;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = String.valueOf(paramInt);
    arrayOfString[1] = "0";
    Cursor localCursor = localaf.rawQuery("select count(*) from EmojiInfo where catalog= ? and temp=?", arrayOfString);
    localCursor.moveToFirst();
    int i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final String wj()
  {
    return "EmojiInfo";
  }

  public final String zd(String paramString)
  {
    String str1 = null;
    if (paramString != null)
    {
      int i = paramString.length();
      str1 = null;
      if (i == 32)
        break label21;
    }
    label21: Cursor localCursor;
    do
    {
      return str1;
      String str2 = String.format("select %s from %s where %s=?", new Object[] { "framesInfo", "EmojiInfo", "md5" });
      String[] arrayOfString = { paramString };
      localCursor = this.dtV.rawQuery(str2, arrayOfString);
      int j = localCursor.getCount();
      str1 = null;
      if (j > 0)
      {
        localCursor.moveToFirst();
        str1 = localCursor.getString(localCursor.getColumnIndex("framesInfo"));
      }
    }
    while (localCursor == null);
    localCursor.close();
    return str1;
  }

  // ERROR //
  public final ad ze(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: ifnull +12 -> 15
    //   6: aload_1
    //   7: invokevirtual 442	java/lang/String:length	()I
    //   10: bipush 32
    //   12: if_icmpeq +7 -> 19
    //   15: aconst_null
    //   16: astore_3
    //   17: aload_3
    //   18: areturn
    //   19: aload_0
    //   20: getfield 43	com/tencent/mm/storage/ag:dtV	Lcom/tencent/mm/sdk/f/af;
    //   23: ldc 26
    //   25: aconst_null
    //   26: ldc_w 712
    //   29: iconst_1
    //   30: anewarray 18	java/lang/String
    //   33: dup
    //   34: iconst_0
    //   35: aload_1
    //   36: aastore
    //   37: aconst_null
    //   38: aconst_null
    //   39: invokeinterface 794 7 0
    //   44: astore 8
    //   46: aload 8
    //   48: ifnull +147 -> 195
    //   51: aload 8
    //   53: invokeinterface 318 1 0
    //   58: ifeq +137 -> 195
    //   61: new 20	com/tencent/mm/storage/ad
    //   64: dup
    //   65: aload_0
    //   66: getfield 41	com/tencent/mm/storage/ag:emojiPath	Ljava/lang/String;
    //   69: invokespecial 173	com/tencent/mm/storage/ad:<init>	(Ljava/lang/String;)V
    //   72: astore 10
    //   74: aload 10
    //   76: aload 8
    //   78: invokevirtual 334	com/tencent/mm/storage/ad:b	(Landroid/database/Cursor;)V
    //   81: aload 10
    //   83: astore_3
    //   84: aload 8
    //   86: ifnull -69 -> 17
    //   89: aload 8
    //   91: invokeinterface 324 1 0
    //   96: aload_3
    //   97: areturn
    //   98: astore 5
    //   100: aload 5
    //   102: astore 6
    //   104: aconst_null
    //   105: astore_3
    //   106: iconst_1
    //   107: anewarray 536	java/lang/Object
    //   110: astore 7
    //   112: aload 7
    //   114: iconst_0
    //   115: aload 6
    //   117: invokevirtual 727	java/lang/Exception:toString	()Ljava/lang/String;
    //   120: aastore
    //   121: ldc 52
    //   123: ldc_w 806
    //   126: aload 7
    //   128: invokestatic 731	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: aload_2
    //   132: ifnull -115 -> 17
    //   135: aload_2
    //   136: invokeinterface 324 1 0
    //   141: aload_3
    //   142: areturn
    //   143: astore 4
    //   145: aload_2
    //   146: ifnull +9 -> 155
    //   149: aload_2
    //   150: invokeinterface 324 1 0
    //   155: aload 4
    //   157: athrow
    //   158: astore 4
    //   160: aload 8
    //   162: astore_2
    //   163: goto -18 -> 145
    //   166: astore 9
    //   168: aload 8
    //   170: astore_2
    //   171: aload 9
    //   173: astore 6
    //   175: aconst_null
    //   176: astore_3
    //   177: goto -71 -> 106
    //   180: astore 11
    //   182: aload 8
    //   184: astore_2
    //   185: aload 11
    //   187: astore 6
    //   189: aload 10
    //   191: astore_3
    //   192: goto -86 -> 106
    //   195: aconst_null
    //   196: astore_3
    //   197: goto -113 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   19	46	98	java/lang/Exception
    //   19	46	143	finally
    //   106	131	143	finally
    //   51	74	158	finally
    //   74	81	158	finally
    //   51	74	166	java/lang/Exception
    //   74	81	180	java/lang/Exception
  }

  public final boolean zf(String paramString)
  {
    boolean bool = true;
    if ((paramString == null) || (paramString.length() != 32))
    {
      z.f("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "delete by md5 assertion");
      bool = false;
    }
    int i;
    do
    {
      return bool;
      af localaf = this.dtV;
      String[] arrayOfString = new String[bool];
      arrayOfString[0] = paramString;
      i = localaf.delete("EmojiInfo", "md5=?", arrayOfString);
      if (i > 0)
        Ba("event_update_emoji");
    }
    while (i > 0);
    return false;
  }

  // ERROR //
  public final ad zg(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 43	com/tencent/mm/storage/ag:dtV	Lcom/tencent/mm/sdk/f/af;
    //   6: ldc_w 812
    //   9: iconst_1
    //   10: anewarray 18	java/lang/String
    //   13: dup
    //   14: iconst_0
    //   15: aload_1
    //   16: aastore
    //   17: invokeinterface 313 3 0
    //   22: astore 8
    //   24: aload 8
    //   26: ifnull +151 -> 177
    //   29: aload 8
    //   31: invokeinterface 318 1 0
    //   36: ifeq +141 -> 177
    //   39: new 20	com/tencent/mm/storage/ad
    //   42: dup
    //   43: invokespecial 422	com/tencent/mm/storage/ad:<init>	()V
    //   46: astore 10
    //   48: aload 10
    //   50: aload 8
    //   52: invokevirtual 334	com/tencent/mm/storage/ad:b	(Landroid/database/Cursor;)V
    //   55: aload 10
    //   57: astore 6
    //   59: aload 8
    //   61: ifnull +10 -> 71
    //   64: aload 8
    //   66: invokeinterface 324 1 0
    //   71: aload 6
    //   73: areturn
    //   74: astore 4
    //   76: aload 4
    //   78: astore 5
    //   80: aconst_null
    //   81: astore 6
    //   83: iconst_2
    //   84: anewarray 536	java/lang/Object
    //   87: astore 7
    //   89: aload 7
    //   91: iconst_0
    //   92: aload_1
    //   93: aastore
    //   94: aload 7
    //   96: iconst_1
    //   97: aload 5
    //   99: invokevirtual 233	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   102: aastore
    //   103: ldc 52
    //   105: ldc_w 814
    //   108: aload 7
    //   110: invokestatic 731	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: aload_2
    //   114: ifnull -43 -> 71
    //   117: aload_2
    //   118: invokeinterface 324 1 0
    //   123: aload 6
    //   125: areturn
    //   126: astore_3
    //   127: aload_2
    //   128: ifnull +9 -> 137
    //   131: aload_2
    //   132: invokeinterface 324 1 0
    //   137: aload_3
    //   138: athrow
    //   139: astore_3
    //   140: aload 8
    //   142: astore_2
    //   143: goto -16 -> 127
    //   146: astore 9
    //   148: aload 8
    //   150: astore_2
    //   151: aload 9
    //   153: astore 5
    //   155: aconst_null
    //   156: astore 6
    //   158: goto -75 -> 83
    //   161: astore 11
    //   163: aload 8
    //   165: astore_2
    //   166: aload 11
    //   168: astore 5
    //   170: aload 10
    //   172: astore 6
    //   174: goto -91 -> 83
    //   177: aconst_null
    //   178: astore 6
    //   180: goto -121 -> 59
    //
    // Exception table:
    //   from	to	target	type
    //   2	24	74	java/lang/Exception
    //   2	24	126	finally
    //   83	113	126	finally
    //   29	48	139	finally
    //   48	55	139	finally
    //   29	48	146	java/lang/Exception
    //   48	55	161	java/lang/Exception
  }

  public final boolean zh(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    boolean bool2 = false;
    String str;
    if (!bool1)
      str = "groupId = '" + paramString + "'";
    try
    {
      int i = this.dtV.delete("EmojiInfo", str, null);
      bool2 = false;
      if (i >= 0)
        bool2 = true;
      return bool2;
    }
    catch (Exception localException)
    {
      z.i("!44@/B4Tb64lLpKW6XSoHkFWULQuFhd8yLOyJ6UPPid1Otg=", "Delete By ProductId fail." + localException.getMessage());
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ag
 * JD-Core Version:    0.6.2
 */