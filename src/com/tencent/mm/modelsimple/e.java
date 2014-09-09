package com.tencent.mm.modelsimple;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.Profile;
import android.telephony.TelephonyManager;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class e
{
  @TargetApi(14)
  public static String D(Context paramContext)
  {
    z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Get name of a contacts record or profile.");
    if (paramContext == null)
    {
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "context is null.");
      return null;
    }
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (j.cp(14))
      z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "The Android API version is higher than 14.");
    while (true)
    {
      try
      {
        Cursor localCursor3 = localContentResolver.query(ContactsContract.Profile.CONTENT_URI, new String[] { "display_name" }, null, null, null);
        localCursor2 = localCursor3;
        if (localCursor2 == null)
          break label262;
        if (!localCursor2.moveToFirst())
          break label256;
        str3 = localCursor2.getString(localCursor2.getColumnIndex("display_name"));
        z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Have got name from profile, name is %s", new Object[] { str3 });
        localCursor2.close();
        str1 = str3;
        if (ch.jb(str1))
        {
          str2 = n(paramContext, f.N(paramContext));
          if (ch.jb(str2))
          {
            z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "contactId is null.");
            return null;
          }
        }
      }
      catch (Exception localException)
      {
        String str2;
        z.d("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "query crashed");
        Cursor localCursor2 = null;
        continue;
        Cursor localCursor1 = localContentResolver.query(ContactsContract.Data.CONTENT_URI, new String[] { "display_name" }, "contact_id=?", new String[] { str2 }, null);
        if (localCursor1 != null)
        {
          if (localCursor1.moveToFirst())
          {
            str1 = localCursor1.getString(localCursor1.getColumnIndex("display_name"));
            z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Have got name from contacts, name is %s", new Object[] { str1 });
          }
          localCursor1.close();
        }
      }
      return str1;
      label256: String str3 = null;
      continue;
      label262: String str1 = null;
    }
  }

  @TargetApi(14)
  public static Bitmap E(Context paramContext)
  {
    z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Get bitmap of a contacts record or profile.");
    if (paramContext == null)
    {
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "context is null.");
      return null;
    }
    ContentResolver localContentResolver = paramContext.getContentResolver();
    boolean bool = j.cp(14);
    Object localObject1 = null;
    Cursor localCursor3;
    Cursor localCursor4;
    Bitmap localBitmap;
    if (bool)
    {
      z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "The Android API version is higher than 14.");
      try
      {
        Cursor localCursor6 = localContentResolver.query(ContactsContract.Profile.CONTENT_URI, new String[] { "_id" }, null, null, null);
        localCursor3 = localCursor6;
        localObject1 = null;
        if (localCursor3 != null)
        {
          if (localCursor3.getCount() <= 0)
            break label480;
          localCursor3.close();
        }
      }
      catch (Exception localException1)
      {
        try
        {
          Cursor localCursor5 = localContentResolver.query(Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data"), new String[] { "data15", "data_sync1" }, "mimetype=?", new String[] { "vnd.android.cursor.item/photo" }, null);
          localCursor4 = localCursor5;
          localObject1 = null;
          if (localCursor4 != null)
          {
            if (!localCursor4.moveToFirst())
              break label900;
            if ((bc.bP(paramContext)) || (bc.bO(paramContext)) || (bc.bF(paramContext)))
            {
              z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "The network status is wifi or 3G or 4G.");
              String str5 = localCursor4.getString(localCursor4.getColumnIndex("data_sync1"));
              z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "get sync avatar url : [%s]", new Object[] { str5 });
              if (!ch.jb(str5))
              {
                int n = str5.lastIndexOf("https:");
                Object[] arrayOfObject2 = new Object[1];
                arrayOfObject2[0] = Integer.valueOf(n);
                z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "check is exist https download url :[%d]", arrayOfObject2);
                if (n >= 0)
                {
                  String str6 = str5.substring(n);
                  localBitmap = hs(str6);
                  z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Get image from google sync account in profile,url:[%s]", new Object[] { str6 });
                  if ((localBitmap == null) || (localBitmap.isRecycled()))
                    break label351;
                  localCursor4.close();
                  return localBitmap;
                  localException1 = localException1;
                  z.d("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "query crashed");
                  localCursor3 = null;
                }
              }
            }
          }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            z.d("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "query crashed");
            localCursor4 = localCursor3;
          }
          localBitmap = null;
          label351: int m = localCursor4.getColumnIndex("data15");
          if (m != -1)
          {
            byte[] arrayOfByte = localCursor4.getBlob(m);
            Object[] arrayOfObject1 = new Object[1];
            arrayOfObject1[0] = Boolean.valueOf(ch.B(arrayOfByte));
            z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "get bitmap data is null : [%b]", arrayOfObject1);
            if (!ch.B(arrayOfByte))
            {
              z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Get image from profile personal icon.");
              localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
            }
          }
        }
      }
    }
    while (true)
    {
      localCursor4.close();
      localObject1 = localBitmap;
      String str1;
      label480: Cursor localCursor1;
      Cursor localCursor2;
      while ((localObject1 == null) || (((Bitmap)localObject1).isRecycled()))
      {
        str1 = n(paramContext, f.N(paramContext));
        if (ch.jb(str1))
        {
          z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "contactId is null.");
          return null;
          localCursor3.close();
          localObject1 = null;
        }
        else
        {
          localCursor1 = localContentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] { "photo_id", "raw_contact_id" }, "contact_id=?", new String[] { str1 }, null);
          if (localCursor1 != null)
          {
            if (localCursor1.moveToFirst())
            {
              if ((!bc.bP(paramContext)) && (!bc.bO(paramContext)) && (!bc.bF(paramContext)))
                break label758;
              z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "The network status is wifi or 3G or 4G.");
              String str2 = localCursor1.getString(localCursor1.getColumnIndex("raw_contact_id"));
              localCursor2 = localContentResolver.query(ContactsContract.Data.CONTENT_URI, new String[] { "data15", "data_sync1" }, "mimetype=? AND raw_contact_id=?", new String[] { "vnd.android.cursor.item/photo", str2 }, null);
              if (localCursor2 == null)
                break label758;
              if (!localCursor2.moveToFirst())
                break label751;
              int j = localCursor2.getColumnIndex("data_sync1");
              if (j == -1)
                break label751;
              String str3 = localCursor2.getString(j);
              if (ch.jb(str3))
                break label751;
              int k = str3.lastIndexOf("https:");
              if (k < 0)
                break label751;
              String str4 = str3.substring(k);
              localObject1 = hs(str4);
              if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled()))
                break label751;
              z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Get image from google sync account in contacts,url:[%s]", new Object[] { str4 });
              localCursor2.close();
            }
            label742: localCursor1.close();
          }
        }
      }
      return localObject1;
      label751: localCursor2.close();
      label758: z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Get bitmap from contacts icon.");
      int i = localCursor1.getColumnIndex("photo_id");
      long l;
      if (i != -1)
      {
        l = localCursor1.getLong(i);
        z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Have got photoId,photoId is " + l);
      }
      while (true)
      {
        if (l > 0L)
        {
          localObject2 = BitmapFactory.decodeStream(ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(str1))));
          if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled()))
            break label872;
          z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Get image from contacts through google account.");
          localObject1 = localObject2;
          break label742;
        }
        Object localObject2 = localObject1;
        label872: if (!localCursor1.moveToNext())
        {
          localObject1 = localObject2;
          break label742;
        }
        localObject1 = localObject2;
        break;
        l = 0L;
      }
      label900: localBitmap = null;
    }
  }

  // ERROR //
  private static Bitmap hs(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 13
    //   4: ldc_w 265
    //   7: iconst_1
    //   8: anewarray 4	java/lang/Object
    //   11: dup
    //   12: iconst_0
    //   13: aload_0
    //   14: aastore
    //   15: invokestatic 75	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   18: aload_0
    //   19: invokestatic 85	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   22: ifeq +13 -> 35
    //   25: ldc 13
    //   27: ldc_w 267
    //   30: invokestatic 26	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   33: aload_1
    //   34: areturn
    //   35: aload_0
    //   36: invokevirtual 270	java/lang/String:trim	()Ljava/lang/String;
    //   39: astore_2
    //   40: aload_2
    //   41: ldc 152
    //   43: invokevirtual 273	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   46: ifne +13 -> 59
    //   49: ldc 13
    //   51: ldc_w 275
    //   54: invokestatic 26	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: aconst_null
    //   58: areturn
    //   59: new 277	java/io/ByteArrayOutputStream
    //   62: dup
    //   63: invokespecial 279	java/io/ByteArrayOutputStream:<init>	()V
    //   66: astore_3
    //   67: new 281	com/tencent/mm/network/bf
    //   70: dup
    //   71: aload_2
    //   72: invokespecial 282	com/tencent/mm/network/bf:<init>	(Ljava/lang/String;)V
    //   75: astore 4
    //   77: aload 4
    //   79: invokevirtual 286	com/tencent/mm/network/bf:getInputStream	()Ljava/io/InputStream;
    //   82: astore 18
    //   84: aload 18
    //   86: astore 6
    //   88: aload 6
    //   90: ifnonnull +69 -> 159
    //   93: ldc 13
    //   95: ldc_w 288
    //   98: iconst_1
    //   99: anewarray 4	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: aload_2
    //   105: aastore
    //   106: invokestatic 290	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: aload 4
    //   111: invokevirtual 293	com/tencent/mm/network/bf:disconnect	()V
    //   114: aload 6
    //   116: ifnull +8 -> 124
    //   119: aload 6
    //   121: invokevirtual 296	java/io/InputStream:close	()V
    //   124: aload_3
    //   125: invokevirtual 297	java/io/ByteArrayOutputStream:close	()V
    //   128: aconst_null
    //   129: areturn
    //   130: astore 23
    //   132: iconst_1
    //   133: anewarray 4	java/lang/Object
    //   136: astore 24
    //   138: aload 24
    //   140: iconst_0
    //   141: aload 23
    //   143: invokevirtual 300	java/io/IOException:getMessage	()Ljava/lang/String;
    //   146: aastore
    //   147: ldc 13
    //   149: ldc_w 302
    //   152: aload 24
    //   154: invokestatic 290	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aconst_null
    //   158: areturn
    //   159: sipush 1024
    //   162: newarray byte
    //   164: astore 19
    //   166: aload 6
    //   168: aload 19
    //   170: invokevirtual 306	java/io/InputStream:read	([B)I
    //   173: istore 20
    //   175: iload 20
    //   177: iconst_m1
    //   178: if_icmpeq +97 -> 275
    //   181: aload_3
    //   182: aload 19
    //   184: iconst_0
    //   185: iload 20
    //   187: invokevirtual 310	java/io/ByteArrayOutputStream:write	([BII)V
    //   190: goto -24 -> 166
    //   193: astore 5
    //   195: iconst_1
    //   196: anewarray 4	java/lang/Object
    //   199: astore 10
    //   201: aload 10
    //   203: iconst_0
    //   204: aload 5
    //   206: invokevirtual 300	java/io/IOException:getMessage	()Ljava/lang/String;
    //   209: aastore
    //   210: ldc 13
    //   212: ldc_w 312
    //   215: aload 10
    //   217: invokestatic 290	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   220: aload 4
    //   222: ifnull +8 -> 230
    //   225: aload 4
    //   227: invokevirtual 293	com/tencent/mm/network/bf:disconnect	()V
    //   230: aload 6
    //   232: ifnull +8 -> 240
    //   235: aload 6
    //   237: invokevirtual 296	java/io/InputStream:close	()V
    //   240: aload_3
    //   241: invokevirtual 297	java/io/ByteArrayOutputStream:close	()V
    //   244: aload_1
    //   245: areturn
    //   246: astore 11
    //   248: iconst_1
    //   249: anewarray 4	java/lang/Object
    //   252: astore 12
    //   254: aload 12
    //   256: iconst_0
    //   257: aload 11
    //   259: invokevirtual 300	java/io/IOException:getMessage	()Ljava/lang/String;
    //   262: aastore
    //   263: ldc 13
    //   265: ldc_w 302
    //   268: aload 12
    //   270: invokestatic 290	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   273: aload_1
    //   274: areturn
    //   275: aload_3
    //   276: invokevirtual 316	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   279: invokestatic 322	com/tencent/mm/sdk/platformtools/i:cB	([B)Landroid/graphics/Bitmap;
    //   282: astore_1
    //   283: aload_3
    //   284: invokevirtual 297	java/io/ByteArrayOutputStream:close	()V
    //   287: aload 4
    //   289: invokevirtual 293	com/tencent/mm/network/bf:disconnect	()V
    //   292: aload 6
    //   294: ifnull -261 -> 33
    //   297: aload 6
    //   299: invokevirtual 296	java/io/InputStream:close	()V
    //   302: aload_1
    //   303: areturn
    //   304: astore 21
    //   306: iconst_1
    //   307: anewarray 4	java/lang/Object
    //   310: astore 22
    //   312: aload 22
    //   314: iconst_0
    //   315: aload 21
    //   317: invokevirtual 300	java/io/IOException:getMessage	()Ljava/lang/String;
    //   320: aastore
    //   321: ldc 13
    //   323: ldc_w 302
    //   326: aload 22
    //   328: invokestatic 290	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: aload_1
    //   332: areturn
    //   333: astore 13
    //   335: aconst_null
    //   336: astore 4
    //   338: aconst_null
    //   339: astore 6
    //   341: iconst_1
    //   342: anewarray 4	java/lang/Object
    //   345: astore 14
    //   347: aload 14
    //   349: iconst_0
    //   350: aload 13
    //   352: invokevirtual 323	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   355: aastore
    //   356: ldc 13
    //   358: ldc_w 325
    //   361: aload 14
    //   363: invokestatic 290	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   366: aload 4
    //   368: ifnull +8 -> 376
    //   371: aload 4
    //   373: invokevirtual 293	com/tencent/mm/network/bf:disconnect	()V
    //   376: aload 6
    //   378: ifnull +8 -> 386
    //   381: aload 6
    //   383: invokevirtual 296	java/io/InputStream:close	()V
    //   386: aload_3
    //   387: invokevirtual 297	java/io/ByteArrayOutputStream:close	()V
    //   390: aload_1
    //   391: areturn
    //   392: astore 15
    //   394: iconst_1
    //   395: anewarray 4	java/lang/Object
    //   398: astore 16
    //   400: aload 16
    //   402: iconst_0
    //   403: aload 15
    //   405: invokevirtual 300	java/io/IOException:getMessage	()Ljava/lang/String;
    //   408: aastore
    //   409: ldc 13
    //   411: ldc_w 302
    //   414: aload 16
    //   416: invokestatic 290	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   419: aload_1
    //   420: areturn
    //   421: astore 25
    //   423: aconst_null
    //   424: astore 4
    //   426: aconst_null
    //   427: astore 6
    //   429: aload 25
    //   431: astore 7
    //   433: aload 4
    //   435: ifnull +8 -> 443
    //   438: aload 4
    //   440: invokevirtual 293	com/tencent/mm/network/bf:disconnect	()V
    //   443: aload 6
    //   445: ifnull +8 -> 453
    //   448: aload 6
    //   450: invokevirtual 296	java/io/InputStream:close	()V
    //   453: aload_3
    //   454: invokevirtual 297	java/io/ByteArrayOutputStream:close	()V
    //   457: aload 7
    //   459: athrow
    //   460: astore 8
    //   462: iconst_1
    //   463: anewarray 4	java/lang/Object
    //   466: astore 9
    //   468: aload 9
    //   470: iconst_0
    //   471: aload 8
    //   473: invokevirtual 300	java/io/IOException:getMessage	()Ljava/lang/String;
    //   476: aastore
    //   477: ldc 13
    //   479: ldc_w 302
    //   482: aload 9
    //   484: invokestatic 290	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   487: goto -30 -> 457
    //   490: astore 17
    //   492: aload 17
    //   494: astore 7
    //   496: aconst_null
    //   497: astore 6
    //   499: goto -66 -> 433
    //   502: astore 7
    //   504: goto -71 -> 433
    //   507: astore 13
    //   509: aconst_null
    //   510: astore_1
    //   511: aconst_null
    //   512: astore 6
    //   514: goto -173 -> 341
    //   517: astore 13
    //   519: goto -178 -> 341
    //   522: astore 5
    //   524: aconst_null
    //   525: astore_1
    //   526: aconst_null
    //   527: astore 4
    //   529: aconst_null
    //   530: astore 6
    //   532: goto -337 -> 195
    //   535: astore 5
    //   537: aconst_null
    //   538: astore_1
    //   539: aconst_null
    //   540: astore 6
    //   542: goto -347 -> 195
    //
    // Exception table:
    //   from	to	target	type
    //   109	114	130	java/io/IOException
    //   119	124	130	java/io/IOException
    //   124	128	130	java/io/IOException
    //   93	109	193	java/io/IOException
    //   159	166	193	java/io/IOException
    //   166	175	193	java/io/IOException
    //   181	190	193	java/io/IOException
    //   275	287	193	java/io/IOException
    //   225	230	246	java/io/IOException
    //   235	240	246	java/io/IOException
    //   240	244	246	java/io/IOException
    //   287	292	304	java/io/IOException
    //   297	302	304	java/io/IOException
    //   67	77	333	java/lang/Exception
    //   371	376	392	java/io/IOException
    //   381	386	392	java/io/IOException
    //   386	390	392	java/io/IOException
    //   67	77	421	finally
    //   438	443	460	java/io/IOException
    //   448	453	460	java/io/IOException
    //   453	457	460	java/io/IOException
    //   77	84	490	finally
    //   93	109	502	finally
    //   159	166	502	finally
    //   166	175	502	finally
    //   181	190	502	finally
    //   195	220	502	finally
    //   275	287	502	finally
    //   341	366	502	finally
    //   77	84	507	java/lang/Exception
    //   93	109	517	java/lang/Exception
    //   159	166	517	java/lang/Exception
    //   166	175	517	java/lang/Exception
    //   181	190	517	java/lang/Exception
    //   275	287	517	java/lang/Exception
    //   67	77	522	java/io/IOException
    //   77	84	535	java/io/IOException
  }

  @TargetApi(14)
  public static String m(Context paramContext, String paramString)
  {
    z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Get phone number. country code : %s", new Object[] { paramString });
    if (paramContext == null)
    {
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "The context is null.");
      return null;
    }
    if (ch.jb(paramString))
    {
      z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "countryCode is null or nil.");
      return null;
    }
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    ContentResolver localContentResolver;
    try
    {
      String str9 = localTelephonyManager.getLine1Number();
      str1 = str9;
      if (!ch.jb(str1))
      {
        str8 = str1.trim();
        if (!ch.jb(paramString))
        {
          if (str8.startsWith("+" + paramString))
            str8 = str8.substring(("+" + paramString).length());
        }
        else
        {
          z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Got phone number by TelephonyManager.");
          return str8;
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        String str8;
        z.e("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "get line number got exception");
        String str1 = null;
        continue;
        if (str8.startsWith(paramString))
          str8 = str8.substring(paramString.length());
      }
      localContentResolver = paramContext.getContentResolver();
      if (j.cq(14))
        break label956;
    }
    z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "The device os API version is higher than 14.");
    while (true)
    {
      try
      {
        Cursor localCursor7 = localContentResolver.query(ContactsContract.Profile.CONTENT_URI, new String[] { "has_phone_number" }, null, null, null);
        localCursor3 = localCursor7;
        if (localCursor3 == null)
          break label962;
      }
      catch (Exception localException7)
      {
        try
        {
          if (!localCursor3.moveToFirst())
            break label962;
          int m = localCursor3.getColumnIndex("has_phone_number");
          if (m == -1)
            break label962;
          int n = localCursor3.getInt(m);
          j = n;
        }
        catch (Exception localException7)
        {
          try
          {
            Cursor localCursor3;
            z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "The phone count of the profile is " + j);
            Cursor localCursor4 = localCursor3;
            if ((localCursor4 != null) && (!localCursor4.isClosed()))
              localCursor4.close();
            if (j > 0)
            {
              try
              {
                Cursor localCursor6 = localContentResolver.query(Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data"), new String[] { "data1" }, "mimetype=?", new String[] { "vnd.android.cursor.item/phone_v2" }, null);
                localCursor5 = localCursor6;
                if (localCursor5 == null)
                  continue;
              }
              catch (Exception localException4)
              {
                try
                {
                  if (!localCursor5.moveToFirst())
                    continue;
                  int k = localCursor5.getColumnIndex("data1");
                  if (k == -1)
                    continue;
                  String str7 = localCursor5.getString(k);
                  str6 = str7;
                }
                catch (Exception localException4)
                {
                  try
                  {
                    Cursor localCursor5;
                    z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Have got phone number from profile ,number is [%s]", new Object[] { str6 });
                    localCursor5.close();
                    if ((localCursor5 != null) && (!localCursor5.isClosed()))
                      localCursor5.close();
                    str2 = str6;
                    Cursor localCursor2;
                    if (ch.jb(str2))
                    {
                      String str5 = n(paramContext, f.N(paramContext));
                      if (!ch.jb(str5))
                      {
                        Cursor localCursor1 = localContentResolver.query(ContactsContract.Contacts.CONTENT_URI, new String[] { "has_phone_number" }, "_id=?", new String[] { str5 }, null);
                        if (localCursor1 == null)
                          continue;
                        if (!localCursor1.moveToFirst())
                          continue;
                        i = localCursor1.getInt(localCursor1.getColumnIndex("has_phone_number"));
                        localCursor1.close();
                        z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "The phone count of the profile is " + i);
                        if (i > 0)
                        {
                          localCursor2 = localContentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] { "data1", "data2" }, "contact_id =?", new String[] { str5 }, null);
                          if (localCursor2 != null)
                          {
                            if (localCursor2.moveToFirst())
                            {
                              str2 = localCursor2.getString(localCursor2.getColumnIndex("data1"));
                              if (ch.jb(str2))
                                continue;
                              z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "have got phone number from contacts ,number is [%s]", new Object[] { str2 });
                            }
                            localCursor2.close();
                          }
                        }
                      }
                    }
                    String str3;
                    if (!ch.jb(str2))
                    {
                      str3 = be.AT(str2);
                      z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "get phone num : %s, extract country code  : %s", new Object[] { str2, str3 });
                      if (!ch.jb(str3))
                      {
                        if (!str2.startsWith("+"))
                          continue;
                        str4 = "+" + str3;
                        if (str4 != null)
                          str2 = str2.substring(str4.length());
                      }
                      z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "after deal, the phone num is %s", new Object[] { str2 });
                    }
                    else
                    {
                      return str2;
                      localException2 = localException2;
                      j = 0;
                      localCursor3 = null;
                      z.d("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "query crashed");
                      localCursor4 = localCursor3;
                      continue;
                      localException3 = localException3;
                      str6 = null;
                      localCursor5 = localCursor4;
                      z.d("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "query crashed");
                      continue;
                      if (localCursor2.moveToNext())
                        continue;
                      continue;
                    }
                    boolean bool = str2.startsWith(str3);
                    String str4 = null;
                    if (!bool)
                      continue;
                    str4 = str3;
                    continue;
                    localException4 = localException4;
                    str6 = null;
                    continue;
                  }
                  catch (Exception localException5)
                  {
                    continue;
                  }
                }
              }
              localException7 = localException7;
              j = 0;
              continue;
            }
          }
          catch (Exception localException6)
          {
            continue;
            int i = 0;
            continue;
            i = 0;
            continue;
            String str6 = null;
            continue;
            str6 = null;
            continue;
          }
        }
      }
      label956: String str2 = null;
      continue;
      label962: int j = 0;
    }
  }

  private static String n(Context paramContext, String paramString)
  {
    z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Get contactId by email, email = %s", new Object[] { paramString });
    if (paramContext == null)
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "context is null.");
    Cursor localCursor;
    do
    {
      return null;
      if (ch.jb(paramString))
      {
        z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "email is null.");
        return null;
      }
      localCursor = paramContext.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[] { "contact_id", "data1" }, "data1=?", new String[] { paramString }, null);
    }
    while (localCursor == null);
    boolean bool = localCursor.moveToFirst();
    String str = null;
    if (bool)
    {
      str = localCursor.getString(localCursor.getColumnIndex("contact_id"));
      if (ch.jb(str))
        break label154;
      z.i("!32@/B4Tb64lLpLSOpQlr7qYXRHsd4oF45L0", "Have got contactId ,contactId is [%s]", new Object[] { str });
    }
    while (true)
    {
      localCursor.close();
      return str;
      label154: if (localCursor.moveToNext())
        break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.e
 * JD-Core Version:    0.6.2
 */