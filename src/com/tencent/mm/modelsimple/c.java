package com.tencent.mm.modelsimple;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Looper;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import com.tencent.mm.f.e;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.i;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class c extends Thread
{
  private Account dCa;
  private d dCb;
  private Looper dCc;
  private String dCd;
  private Context mContext;
  private String username;

  public c(Context paramContext, Account paramAccount)
  {
    this(paramContext, paramAccount, null, null);
  }

  public c(Context paramContext, Account paramAccount, String paramString)
  {
    this(paramContext, paramAccount, paramString, null);
  }

  public c(Context paramContext, Account paramAccount, String paramString1, String paramString2)
  {
    super("ContactsOperations");
    this.mContext = paramContext;
    this.dCa = paramAccount;
    this.username = paramString1;
    this.dCd = paramString2;
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "username = " + paramString1 + ", " + paramString2);
  }

  private void b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "add wechat contact: displayname:" + paramString1 + ", phoneNum:" + paramString2 + ", " + paramString3 + ", username:" + paramString4);
    ContentProviderOperation.Builder localBuilder1 = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
    localBuilder1.withValue("account_name", this.dCa.name);
    localBuilder1.withValue("account_type", this.dCa.type);
    localBuilder1.withValue("sync1", paramString3);
    this.dCb.a(localBuilder1.build());
    ContentProviderOperation.Builder localBuilder2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
    localBuilder2.withValueBackReference("raw_contact_id", 0);
    localBuilder2.withValue("mimetype", "vnd.android.cursor.item/name");
    localBuilder2.withValue("data1", paramString1);
    this.dCb.a(localBuilder2.build());
    ContentProviderOperation.Builder localBuilder3 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
    localBuilder3.withValueBackReference("raw_contact_id", 0);
    localBuilder3.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile");
    localBuilder3.withValue("data1", paramString2);
    localBuilder3.withValue("data2", this.mContext.getString(n.age));
    localBuilder3.withValue("data3", this.mContext.getString(n.bDA));
    localBuilder3.withValue("data4", paramString3);
    this.dCb.a(localBuilder3.build());
    if ("1".equals(e.or().getValue("VOIPCallType")))
    {
      ContentProviderOperation.Builder localBuilder6 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      localBuilder6.withValueBackReference("raw_contact_id", 0);
      localBuilder6.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video");
      localBuilder6.withValue("data1", paramString2);
      localBuilder6.withValue("data2", this.mContext.getString(n.age));
      localBuilder6.withValue("data3", this.mContext.getString(n.bDC));
      localBuilder6.withValue("data4", paramString3);
      this.dCb.a(localBuilder6.build());
    }
    while (true)
    {
      ContentProviderOperation.Builder localBuilder5 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      localBuilder5.withValueBackReference("raw_contact_id", 0);
      localBuilder5.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline");
      localBuilder5.withValue("data1", paramString2);
      localBuilder5.withValue("data2", this.mContext.getString(n.age));
      localBuilder5.withValue("data3", this.mContext.getString(n.bDD));
      localBuilder5.withValue("data4", paramString3);
      this.dCb.a(localBuilder5.build());
      return;
      ContentProviderOperation.Builder localBuilder4 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      localBuilder4.withValueBackReference("raw_contact_id", 0);
      localBuilder4.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip");
      localBuilder4.withValue("data1", paramString2);
      localBuilder4.withValue("data2", this.mContext.getString(n.age));
      localBuilder4.withValue("data3", this.mContext.getString(n.bDB));
      localBuilder4.withValue("data4", paramString3);
      this.dCb.a(localBuilder4.build());
    }
  }

  private void hq(String paramString)
  {
    if (ch.jb(paramString))
    {
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "delete wechat contact fail, phoneNum5 is null");
      return;
    }
    Cursor localCursor1;
    try
    {
      Cursor localCursor2 = this.mContext.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "contact_id", "_id" }, "(mimetype= ? or mimetype= ? or mimetype= ? or mimetype= ?) AND data4 = ?", new String[] { "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile", "vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video", paramString }, null);
      localCursor1 = localCursor2;
      if (localCursor1 == null)
      {
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "get null cursor");
        return;
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localException1.getMessage();
        arrayOfObject[1] = ch.b(localException1);
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "query fail, match error %s \n %s", arrayOfObject);
        localCursor1 = null;
      }
    }
    try
    {
      String str1;
      label163: int j;
      if (localCursor1.moveToFirst())
      {
        int i = localCursor1.getColumnIndex("contact_id");
        if (i < 0)
          break label283;
        str1 = localCursor1.getString(i);
        j = localCursor1.getColumnIndex("_id");
        if (j < 0)
          break label291;
      }
      label283: label291: for (String str2 = localCursor1.getString(j); ; str2 = "")
      {
        if ((!ch.jb(str1)) && (!ch.jb(str2)))
        {
          this.mContext.getContentResolver().delete(ContactsContract.Data.CONTENT_URI, "_id = ?", new String[] { str2 });
          this.mContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI, "contact_id = ? AND account_type = ?", new String[] { str1, "com.tencent.mm.account" });
        }
        boolean bool = localCursor1.moveToNext();
        if (bool)
          break;
        localCursor1.close();
        return;
        str1 = "";
        break label163;
      }
    }
    catch (Exception localException2)
    {
      while (true)
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "delete wechat contact failed : " + localException2.getMessage());
    }
  }

  private boolean hr(String paramString)
  {
    try
    {
      Cursor localCursor2 = this.mContext.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "contact_id" }, "mimetype= ?", new String[] { paramString }, null);
      localCursor1 = localCursor2;
      if (localCursor1 == null);
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          Cursor localCursor1;
          if (localCursor1.getCount() > 0)
          {
            z.d("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "has minetype:" + paramString);
            bool = true;
            if (localCursor1 != null)
              localCursor1.close();
            return bool;
            localException1 = localException1;
            localCursor1 = null;
            z.e("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "hasMIMEType search failed : " + localException1.getMessage());
            bool = true;
            continue;
          }
        }
        catch (Exception localException2)
        {
          continue;
        }
        boolean bool = false;
      }
    }
  }

  private void quit()
  {
    if (this.dCc != null)
      this.dCc.quit();
  }

  // ERROR //
  private void yW()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 288	com/tencent/mm/model/bg:oE	()Z
    //   5: ifne +18 -> 23
    //   8: ldc 36
    //   10: ldc_w 290
    //   13: invokestatic 68	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: aload_0
    //   17: invokespecial 291	com/tencent/mm/modelsimple/c:quit	()V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: invokestatic 297	com/tencent/mm/modelfriend/az:wZ	()Lcom/tencent/mm/modelfriend/j;
    //   26: invokevirtual 303	com/tencent/mm/modelfriend/j:vP	()Ljava/util/List;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnull +12 -> 43
    //   34: aload_2
    //   35: invokeinterface 308 1 0
    //   40: ifne +23 -> 63
    //   43: ldc 36
    //   45: ldc_w 310
    //   48: invokestatic 201	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: aload_0
    //   52: invokespecial 291	com/tencent/mm/modelsimple/c:quit	()V
    //   55: goto -35 -> 20
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: new 312	java/util/HashMap
    //   66: dup
    //   67: invokespecial 314	java/util/HashMap:<init>	()V
    //   70: astore_3
    //   71: getstatic 74	android/provider/ContactsContract$RawContacts:CONTENT_URI	Landroid/net/Uri;
    //   74: invokevirtual 320	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   77: ldc 82
    //   79: aload_0
    //   80: getfield 30	com/tencent/mm/modelsimple/c:dCa	Landroid/accounts/Account;
    //   83: getfield 87	android/accounts/Account:name	Ljava/lang/String;
    //   86: invokevirtual 326	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   89: ldc 95
    //   91: aload_0
    //   92: getfield 30	com/tencent/mm/modelsimple/c:dCa	Landroid/accounts/Account;
    //   95: getfield 98	android/accounts/Account:type	Ljava/lang/String;
    //   98: invokevirtual 326	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   101: invokevirtual 329	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   104: astore 4
    //   106: aload_0
    //   107: getfield 28	com/tencent/mm/modelsimple/c:mContext	Landroid/content/Context;
    //   110: invokevirtual 205	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   113: aload 4
    //   115: iconst_2
    //   116: anewarray 168	java/lang/String
    //   119: dup
    //   120: iconst_0
    //   121: ldc 100
    //   123: aastore
    //   124: dup
    //   125: iconst_1
    //   126: ldc 209
    //   128: aastore
    //   129: ldc_w 331
    //   132: aconst_null
    //   133: aconst_null
    //   134: invokevirtual 217	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   137: astore 17
    //   139: aload 17
    //   141: astore 6
    //   143: aload 6
    //   145: ifnonnull +227 -> 372
    //   148: ldc 36
    //   150: ldc_w 333
    //   153: invokestatic 201	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   156: aload 6
    //   158: ifnull +10 -> 168
    //   161: aload 6
    //   163: invokeinterface 260 1 0
    //   168: aload_0
    //   169: ldc 174
    //   171: invokespecial 335	com/tencent/mm/modelsimple/c:hr	(Ljava/lang/String;)Z
    //   174: ifne +320 -> 494
    //   177: aload_0
    //   178: ldc 184
    //   180: invokespecial 335	com/tencent/mm/modelsimple/c:hr	(Ljava/lang/String;)Z
    //   183: ifne +311 -> 494
    //   186: iconst_1
    //   187: istore 7
    //   189: aload_0
    //   190: getfield 28	com/tencent/mm/modelsimple/c:mContext	Landroid/content/Context;
    //   193: pop
    //   194: aload_0
    //   195: new 108	com/tencent/mm/modelsimple/d
    //   198: dup
    //   199: aload_0
    //   200: aload_0
    //   201: getfield 28	com/tencent/mm/modelsimple/c:mContext	Landroid/content/Context;
    //   204: invokevirtual 205	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   207: invokespecial 338	com/tencent/mm/modelsimple/d:<init>	(Lcom/tencent/mm/modelsimple/c;Landroid/content/ContentResolver;)V
    //   210: putfield 102	com/tencent/mm/modelsimple/c:dCb	Lcom/tencent/mm/modelsimple/d;
    //   213: aload_2
    //   214: invokeinterface 342 1 0
    //   219: astore 9
    //   221: aload 9
    //   223: invokeinterface 347 1 0
    //   228: ifeq +247 -> 475
    //   231: aload 9
    //   233: invokeinterface 351 1 0
    //   238: checkcast 353	com/tencent/mm/modelfriend/i
    //   241: astore 10
    //   243: aload 10
    //   245: invokevirtual 356	com/tencent/mm/modelfriend/i:getUsername	()Ljava/lang/String;
    //   248: astore 11
    //   250: invokestatic 360	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   253: invokevirtual 366	com/tencent/mm/model/b:oT	()Lcom/tencent/mm/storage/o;
    //   256: aload 11
    //   258: invokevirtual 372	com/tencent/mm/storage/o:ys	(Ljava/lang/String;)Lcom/tencent/mm/storage/i;
    //   261: astore 12
    //   263: aload 12
    //   265: ifnull +198 -> 463
    //   268: aload 12
    //   270: invokevirtual 377	com/tencent/mm/g/a:getType	()I
    //   273: invokestatic 381	com/tencent/mm/g/a:cv	(I)Z
    //   276: ifeq +187 -> 463
    //   279: aload 10
    //   281: invokevirtual 384	com/tencent/mm/modelfriend/i:vw	()Ljava/lang/String;
    //   284: invokestatic 196	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   287: ifeq +166 -> 453
    //   290: aload 10
    //   292: invokevirtual 387	com/tencent/mm/modelfriend/i:vz	()Ljava/lang/String;
    //   295: astore 13
    //   297: aload 10
    //   299: invokevirtual 390	com/tencent/mm/modelfriend/i:vC	()Ljava/lang/String;
    //   302: astore 14
    //   304: aload 10
    //   306: invokevirtual 393	com/tencent/mm/modelfriend/i:vH	()Ljava/lang/String;
    //   309: astore 15
    //   311: aload 12
    //   313: invokevirtual 398	com/tencent/mm/storage/i:jo	()Ljava/lang/String;
    //   316: pop
    //   317: aload_3
    //   318: aload 15
    //   320: invokeinterface 404 2 0
    //   325: ifnull +8 -> 333
    //   328: iload 7
    //   330: ifeq +32 -> 362
    //   333: aload_3
    //   334: aload 15
    //   336: invokeinterface 404 2 0
    //   341: ifnull +9 -> 350
    //   344: aload_0
    //   345: aload 15
    //   347: invokespecial 406	com/tencent/mm/modelsimple/c:hq	(Ljava/lang/String;)V
    //   350: aload_0
    //   351: aload 13
    //   353: aload 14
    //   355: aload 15
    //   357: aload 11
    //   359: invokespecial 408	com/tencent/mm/modelsimple/c:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   362: aload_0
    //   363: getfield 102	com/tencent/mm/modelsimple/c:dCb	Lcom/tencent/mm/modelsimple/d;
    //   366: invokevirtual 411	com/tencent/mm/modelsimple/d:execute	()V
    //   369: goto -148 -> 221
    //   372: aload 6
    //   374: invokeinterface 238 1 0
    //   379: ifeq -223 -> 156
    //   382: aload_3
    //   383: aload 6
    //   385: iconst_0
    //   386: invokeinterface 243 2 0
    //   391: aload 6
    //   393: iconst_1
    //   394: invokeinterface 415 2 0
    //   399: invokestatic 421	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   402: invokeinterface 425 3 0
    //   407: pop
    //   408: aload 6
    //   410: invokeinterface 256 1 0
    //   415: istore 19
    //   417: iload 19
    //   419: ifne -37 -> 382
    //   422: goto -266 -> 156
    //   425: astore 5
    //   427: aconst_null
    //   428: astore 6
    //   430: ldc 36
    //   432: aload 5
    //   434: ldc_w 262
    //   437: iconst_1
    //   438: anewarray 221	java/lang/Object
    //   441: dup
    //   442: iconst_0
    //   443: ldc_w 262
    //   446: aastore
    //   447: invokestatic 429	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   450: goto -294 -> 156
    //   453: aload 10
    //   455: invokevirtual 384	com/tencent/mm/modelfriend/i:vw	()Ljava/lang/String;
    //   458: astore 13
    //   460: goto -163 -> 297
    //   463: aload_0
    //   464: aload 10
    //   466: invokevirtual 393	com/tencent/mm/modelfriend/i:vH	()Ljava/lang/String;
    //   469: invokespecial 406	com/tencent/mm/modelsimple/c:hq	(Ljava/lang/String;)V
    //   472: goto -251 -> 221
    //   475: aload_0
    //   476: getfield 102	com/tencent/mm/modelsimple/c:dCb	Lcom/tencent/mm/modelsimple/d;
    //   479: invokevirtual 411	com/tencent/mm/modelsimple/d:execute	()V
    //   482: aload_0
    //   483: invokespecial 291	com/tencent/mm/modelsimple/c:quit	()V
    //   486: goto -466 -> 20
    //   489: astore 5
    //   491: goto -61 -> 430
    //   494: iconst_0
    //   495: istore 7
    //   497: goto -308 -> 189
    //
    // Exception table:
    //   from	to	target	type
    //   2	20	58	finally
    //   23	30	58	finally
    //   34	43	58	finally
    //   43	55	58	finally
    //   63	106	58	finally
    //   106	139	58	finally
    //   148	156	58	finally
    //   161	168	58	finally
    //   168	186	58	finally
    //   189	221	58	finally
    //   221	263	58	finally
    //   268	297	58	finally
    //   297	328	58	finally
    //   333	350	58	finally
    //   350	362	58	finally
    //   362	369	58	finally
    //   372	382	58	finally
    //   382	417	58	finally
    //   430	450	58	finally
    //   453	460	58	finally
    //   463	472	58	finally
    //   475	486	58	finally
    //   106	139	425	java/lang/Exception
    //   148	156	489	java/lang/Exception
    //   372	382	489	java/lang/Exception
    //   382	417	489	java/lang/Exception
  }

  public final void run()
  {
    Looper.prepare();
    this.dCc = Looper.myLooper();
    long l = System.currentTimeMillis();
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "start time:" + l);
    if ((ch.jb(this.username)) && (ch.jb(this.dCd)))
      yW();
    while (true)
    {
      z.i("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "end time:" + System.currentTimeMillis());
      Looper.loop();
      return;
      if (!ch.jb(this.dCd))
        break;
      i locali3 = az.wZ().gl(this.username);
      if ((locali3 != null) && (!ch.jb(locali3.vH())))
        hq(locali3.vH());
      quit();
    }
    i locali1 = az.wZ().gl(this.username);
    if ((locali1 == null) || (ch.jb(locali1.vH())));
    for (i locali2 = az.wZ().gl(this.dCd); ; locali2 = locali1)
    {
      if ((locali2 != null) && (!ch.jb(locali2.vH())));
      while (true)
      {
        try
        {
          Uri localUri = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", this.dCa.name).appendQueryParameter("account_type", this.dCa.type).build();
          Cursor localCursor = this.mContext.getContentResolver().query(localUri, new String[] { "sync1", "_id" }, "deleted=\"0\" AND sync1=\"" + locali2.vH() + "\"", null, null);
          if ((localCursor == null) || (localCursor.getCount() == 0))
          {
            if (ch.jb(locali2.vw()))
            {
              localObject = locali2.vz();
              this.dCb = new d(this, this.mContext.getContentResolver());
              b((String)localObject, locali2.vC(), locali2.vH(), this.username);
              this.dCb.execute();
            }
          }
          else
          {
            if (localCursor != null)
              localCursor.close();
            quit();
            break;
          }
          String str = locali2.vw();
          Object localObject = str;
          continue;
        }
        catch (Exception localException)
        {
          z.printErrStackTrace("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", localException, "", new Object[] { "" });
          continue;
        }
        z.d("!44@/B4Tb64lLpLSOpQlr7qYXTiZp5uLNFEb0T3I5Eq6Cf8=", "query addrupload is null " + this.username);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.c
 * JD-Core Version:    0.6.2
 */