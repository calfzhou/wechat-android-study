package com.tencent.mm.ui.account;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.net.Uri;
import com.tencent.mm.c;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.regex.Pattern;

public final class ki extends ContentObserver
{
  private ContentResolver contentResolver;
  private final Context context;
  private final String[] hda;
  private Pattern hpz = Pattern.compile("\\d{4,8}");
  private final kj iSO;

  public ki(Context paramContext, kj paramkj)
  {
    super(cm.fetchFreeHandler());
    if ((paramContext == null) || (paramkj == null))
      throw new NullPointerException("SmsContentObserver Construction");
    this.context = paramContext;
    this.hda = paramContext.getResources().getStringArray(c.ND);
    this.iSO = paramkj;
  }

  public final void aQV()
  {
    this.context.getContentResolver().registerContentObserver(Uri.parse("content://sms/"), true, this);
  }

  public final void aQW()
  {
    this.context.getContentResolver().unregisterContentObserver(this);
  }

  // ERROR //
  public final void onChange(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokespecial 97	android/database/ContentObserver:onChange	(Z)V
    //   5: ldc 99
    //   7: invokestatic 80	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   10: astore_2
    //   11: aload_0
    //   12: aload_0
    //   13: getfield 44	com/tencent/mm/ui/account/ki:context	Landroid/content/Context;
    //   16: invokevirtual 72	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   19: putfield 101	com/tencent/mm/ui/account/ki:contentResolver	Landroid/content/ContentResolver;
    //   22: iconst_3
    //   23: anewarray 103	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: ldc 105
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: ldc 107
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: ldc 109
    //   40: aastore
    //   41: astore_3
    //   42: ldc 111
    //   44: astore 4
    //   46: iconst_0
    //   47: istore 5
    //   49: iload 5
    //   51: aload_0
    //   52: getfield 64	com/tencent/mm/ui/account/ki:hda	[Ljava/lang/String;
    //   55: arraylength
    //   56: if_icmpge +98 -> 154
    //   59: iload 5
    //   61: iconst_m1
    //   62: aload_0
    //   63: getfield 64	com/tencent/mm/ui/account/ki:hda	[Ljava/lang/String;
    //   66: arraylength
    //   67: iadd
    //   68: if_icmpne +46 -> 114
    //   71: new 113	java/lang/StringBuilder
    //   74: dup
    //   75: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   78: aload 4
    //   80: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: ldc 121
    //   85: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_0
    //   89: getfield 64	com/tencent/mm/ui/account/ki:hda	[Ljava/lang/String;
    //   92: iload 5
    //   94: aaload
    //   95: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: ldc 123
    //   100: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: astore 4
    //   108: iinc 5 1
    //   111: goto -62 -> 49
    //   114: new 113	java/lang/StringBuilder
    //   117: dup
    //   118: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   121: aload 4
    //   123: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: ldc 129
    //   128: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: aload_0
    //   132: getfield 64	com/tencent/mm/ui/account/ki:hda	[Ljava/lang/String;
    //   135: iload 5
    //   137: aaload
    //   138: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: ldc 131
    //   143: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: astore 4
    //   151: goto -43 -> 108
    //   154: new 113	java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   161: aload 4
    //   163: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: ldc 133
    //   168: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: invokestatic 139	java/lang/System:currentTimeMillis	()J
    //   174: ldc2_w 140
    //   177: lsub
    //   178: invokevirtual 144	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   181: ldc 146
    //   183: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: astore 6
    //   191: ldc 148
    //   193: new 113	java/lang/StringBuilder
    //   196: dup
    //   197: ldc 150
    //   199: invokespecial 151	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   202: aload 6
    //   204: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: invokestatic 157	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   213: aload 6
    //   215: ifnull +13 -> 228
    //   218: aload 6
    //   220: ldc 159
    //   222: invokevirtual 163	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   225: ifeq +4 -> 229
    //   228: return
    //   229: aload_0
    //   230: getfield 101	com/tencent/mm/ui/account/ki:contentResolver	Landroid/content/ContentResolver;
    //   233: aload_2
    //   234: aload_3
    //   235: aload 6
    //   237: aconst_null
    //   238: aconst_null
    //   239: invokevirtual 167	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   242: astore 11
    //   244: aload 11
    //   246: astore 10
    //   248: iconst_m1
    //   249: istore 12
    //   251: lconst_0
    //   252: lstore 13
    //   254: aload 10
    //   256: invokeinterface 173 1 0
    //   261: ifeq +33 -> 294
    //   264: aload 10
    //   266: iconst_2
    //   267: invokeinterface 177 2 0
    //   272: lstore 20
    //   274: lload 20
    //   276: lload 13
    //   278: lcmp
    //   279: ifle +218 -> 497
    //   282: aload 10
    //   284: invokeinterface 181 1 0
    //   289: istore 22
    //   291: goto +214 -> 505
    //   294: iload 12
    //   296: iflt +98 -> 394
    //   299: aload 10
    //   301: iload 12
    //   303: invokeinterface 185 2 0
    //   308: pop
    //   309: aload 10
    //   311: aload 10
    //   313: ldc 105
    //   315: invokeinterface 189 2 0
    //   320: invokeinterface 193 2 0
    //   325: astore 16
    //   327: aload_0
    //   328: getfield 35	com/tencent/mm/ui/account/ki:hpz	Ljava/util/regex/Pattern;
    //   331: aload 16
    //   333: invokevirtual 197	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   336: astore 17
    //   338: aload 17
    //   340: invokevirtual 202	java/util/regex/Matcher:find	()Z
    //   343: istore 18
    //   345: aconst_null
    //   346: astore 19
    //   348: iload 18
    //   350: ifeq +10 -> 360
    //   353: aload 17
    //   355: invokevirtual 205	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   358: astore 19
    //   360: aload_0
    //   361: getfield 66	com/tencent/mm/ui/account/ki:iSO	Lcom/tencent/mm/ui/account/kj;
    //   364: aload 19
    //   366: invokeinterface 210 2 0
    //   371: aload 10
    //   373: ifnull -145 -> 228
    //   376: aload 10
    //   378: invokeinterface 213 1 0
    //   383: ifne -155 -> 228
    //   386: aload 10
    //   388: invokeinterface 216 1 0
    //   393: return
    //   394: aload_0
    //   395: getfield 66	com/tencent/mm/ui/account/ki:iSO	Lcom/tencent/mm/ui/account/kj;
    //   398: invokeinterface 219 1 0
    //   403: goto -32 -> 371
    //   406: astore 7
    //   408: aload 10
    //   410: astore 8
    //   412: ldc 148
    //   414: aload 7
    //   416: invokevirtual 220	java/lang/Exception:toString	()Ljava/lang/String;
    //   419: invokestatic 223	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   422: aload 8
    //   424: ifnull -196 -> 228
    //   427: aload 8
    //   429: invokeinterface 213 1 0
    //   434: ifne -206 -> 228
    //   437: aload 8
    //   439: invokeinterface 216 1 0
    //   444: return
    //   445: astore 9
    //   447: aconst_null
    //   448: astore 10
    //   450: aload 10
    //   452: ifnull +20 -> 472
    //   455: aload 10
    //   457: invokeinterface 213 1 0
    //   462: ifne +10 -> 472
    //   465: aload 10
    //   467: invokeinterface 216 1 0
    //   472: aload 9
    //   474: athrow
    //   475: astore 9
    //   477: goto -27 -> 450
    //   480: astore 9
    //   482: aload 8
    //   484: astore 10
    //   486: goto -36 -> 450
    //   489: astore 7
    //   491: aconst_null
    //   492: astore 8
    //   494: goto -82 -> 412
    //   497: lload 13
    //   499: lstore 20
    //   501: iload 12
    //   503: istore 22
    //   505: iload 22
    //   507: istore 12
    //   509: lload 20
    //   511: lstore 13
    //   513: goto -259 -> 254
    //
    // Exception table:
    //   from	to	target	type
    //   254	274	406	java/lang/Exception
    //   282	291	406	java/lang/Exception
    //   299	345	406	java/lang/Exception
    //   353	360	406	java/lang/Exception
    //   360	371	406	java/lang/Exception
    //   394	403	406	java/lang/Exception
    //   229	244	445	finally
    //   254	274	475	finally
    //   282	291	475	finally
    //   299	345	475	finally
    //   353	360	475	finally
    //   360	371	475	finally
    //   394	403	475	finally
    //   412	422	480	finally
    //   229	244	489	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ki
 * JD-Core Version:    0.6.2
 */