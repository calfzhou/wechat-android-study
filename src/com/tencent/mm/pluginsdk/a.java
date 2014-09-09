package com.tencent.mm.pluginsdk;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  public static String[] a(Context paramContext, Uri paramUri)
  {
    if (paramUri == null)
      z.d("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "uri == null");
    label294: label443: 
    while (true)
    {
      return null;
      Cursor localCursor1 = paramContext.getContentResolver().query(paramUri, null, null, null, null);
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (localCursor1 != null)
      {
        localCursor1.moveToFirst();
        int i = localCursor1.getColumnIndex("has_phone_number");
        if ((i <= 0) || (localCursor1.getInt(i) > 0))
        {
          String str1 = localCursor1.getString(localCursor1.getColumnIndex("_id"));
          Cursor localCursor2 = paramContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + str1, null, null);
          if ((localCursor2 != null) && (localCursor2.moveToFirst()))
          {
            localObject1 = null;
            localObject2 = null;
            if (!localCursor2.isAfterLast())
            {
              int j = localCursor2.getColumnIndex("data1");
              int k = localCursor2.getColumnIndex("display_name");
              String str2 = localCursor2.getString(j);
              String str3 = localCursor2.getString(k);
              z.d("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "username : " + str3);
              if (str2 == null)
                break label422;
              z.d("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "phoneNumber : " + str2);
              if (str2 == null)
                localObject3 = null;
              while (true)
              {
                z.d("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "phoneNumber : " + (String)localObject3);
                if (!PhoneNumberUtils.isGlobalPhoneNumber((String)localObject3))
                  break label415;
                z.d("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "phoneResult : " + (String)localObject3);
                localCursor2.moveToNext();
                localObject2 = localObject3;
                localObject1 = str3;
                break;
                localObject3 = str2.replaceAll("\\D", "");
                if (((String)localObject3).startsWith("86"))
                  localObject3 = ((String)localObject3).substring(2);
              }
            }
          }
          else
          {
            localObject1 = null;
            localObject2 = null;
          }
          if ((localCursor2 != null) && (!localCursor2.isClosed()))
            localCursor2.close();
          label371: if (!localCursor1.isClosed())
            localCursor1.close();
        }
      }
      while (true)
      {
        if ((TextUtils.isEmpty(localObject1)) && (TextUtils.isEmpty(localObject2)))
          break label443;
        return new String[] { localObject1, localObject2 };
        localObject3 = localObject2;
        break;
        localObject3 = localObject2;
        break label294;
        localObject1 = null;
        localObject2 = null;
        break label371;
        localObject1 = null;
        localObject2 = null;
      }
    }
  }

  public static List aX(Context paramContext)
  {
    LinkedList localLinkedList = new LinkedList();
    ContentResolver localContentResolver = paramContext.getContentResolver();
    try
    {
      Cursor localCursor2 = localContentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
      localCursor1 = localCursor2;
      if (localCursor1 == null)
      {
        z.e("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "getMobileInfo: mobile is null");
        return localLinkedList;
      }
    }
    catch (Exception localException)
    {
      Cursor localCursor1;
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        z.e("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "getMobileInfo: exception occured [%s]", arrayOfObject);
        localCursor1 = null;
      }
      if (localCursor1.getCount() > 0)
        while (localCursor1.moveToNext())
        {
          String str1 = localCursor1.getString(localCursor1.getColumnIndex("display_name"));
          String str2 = localCursor1.getString(localCursor1.getColumnIndex("contact_id"));
          String str3 = localCursor1.getString(localCursor1.getColumnIndex("data1"));
          String str4 = localCursor1.getString(localCursor1.getColumnIndex("raw_contact_id"));
          Long localLong = Long.valueOf(localCursor1.getLong(localCursor1.getColumnIndex("photo_id")));
          String[] arrayOfString = new String[5];
          arrayOfString[0] = str2;
          arrayOfString[1] = str1;
          arrayOfString[2] = str3;
          arrayOfString[3] = str4;
          arrayOfString[4] = String.valueOf(localLong);
          localLinkedList.add(arrayOfString);
        }
      localCursor1.close();
    }
    return localLinkedList;
  }

  public static List aY(Context paramContext)
  {
    LinkedList localLinkedList = new LinkedList();
    ContentResolver localContentResolver = paramContext.getContentResolver();
    try
    {
      Cursor localCursor2 = localContentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, "sort_key_alt");
      localCursor1 = localCursor2;
      if (localCursor1 == null)
      {
        z.e("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "getMobileInfo: mobile is null");
        return localLinkedList;
      }
    }
    catch (Exception localException)
    {
      Cursor localCursor1;
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        z.e("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "exception in getMoblieOrderInfo(), [%s]", arrayOfObject);
        localCursor1 = localContentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
      }
      if (localCursor1.getCount() > 0)
        while (localCursor1.moveToNext())
        {
          String str = localCursor1.getString(localCursor1.getColumnIndex("display_name"));
          localLinkedList.add(new String[] { localCursor1.getString(localCursor1.getColumnIndex("contact_id")), str, localCursor1.getString(localCursor1.getColumnIndex("data1")), localCursor1.getString(localCursor1.getColumnIndex("raw_contact_id")) });
        }
      localCursor1.close();
    }
    return localLinkedList;
  }

  public static List aZ(Context paramContext)
  {
    LinkedList localLinkedList = new LinkedList();
    ContentResolver localContentResolver = paramContext.getContentResolver();
    Cursor localCursor;
    try
    {
      localCursor = localContentResolver.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, null, null, null);
      if (localCursor == null)
        return localLinkedList;
    }
    catch (Exception localException)
    {
      return localLinkedList;
    }
    if (localCursor.moveToFirst())
      do
      {
        String str = localCursor.getString(localCursor.getColumnIndex("data1"));
        localLinkedList.add(new String[] { localCursor.getString(localCursor.getColumnIndex("contact_id")), localCursor.getString(localCursor.getColumnIndex("data4")), str, localCursor.getString(localCursor.getColumnIndex("raw_contact_id")), localCursor.getString(localCursor.getColumnIndex("photo_id")) });
      }
      while (localCursor.moveToNext());
    localCursor.close();
    return localLinkedList;
  }

  public static Uri axP()
  {
    try
    {
      Uri localUri = ContactsContract.Contacts.CONTENT_URI;
      return localUri;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  // ERROR //
  public static boolean b(String paramString, Context paramContext, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +12 -> 13
    //   4: aload_0
    //   5: ldc 98
    //   7: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   10: ifeq +5 -> 15
    //   13: iconst_0
    //   14: ireturn
    //   15: aload_1
    //   16: invokevirtual 22	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   19: astore 5
    //   21: aload_0
    //   22: invokestatic 200	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   25: lstore 6
    //   27: new 202	android/content/ContentValues
    //   30: dup
    //   31: invokespecial 203	android/content/ContentValues:<init>	()V
    //   34: astore 8
    //   36: iconst_4
    //   37: anewarray 4	java/lang/Object
    //   40: astore 9
    //   42: aload 9
    //   44: iconst_0
    //   45: ldc 154
    //   47: aastore
    //   48: aload 9
    //   50: iconst_1
    //   51: lload 6
    //   53: invokestatic 166	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   56: aastore
    //   57: aload 9
    //   59: iconst_2
    //   60: ldc 205
    //   62: aastore
    //   63: aload 9
    //   65: iconst_3
    //   66: ldc 207
    //   68: aastore
    //   69: ldc 209
    //   71: aload 9
    //   73: invokestatic 213	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   76: astore 10
    //   78: ldc 8
    //   80: ldc 215
    //   82: iconst_1
    //   83: anewarray 4	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload 10
    //   90: aastore
    //   91: invokestatic 217	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: aload 5
    //   96: getstatic 220	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   99: aconst_null
    //   100: aload 10
    //   102: aconst_null
    //   103: aconst_null
    //   104: invokevirtual 28	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   107: astore 11
    //   109: aload 11
    //   111: ldc 46
    //   113: invokeinterface 223 2 0
    //   118: istore 13
    //   120: aload 11
    //   122: invokeinterface 34 1 0
    //   127: ifeq +149 -> 276
    //   130: aload 11
    //   132: iload 13
    //   134: invokeinterface 44 2 0
    //   139: istore 14
    //   141: aload 11
    //   143: invokeinterface 119 1 0
    //   148: aload 8
    //   150: ldc 154
    //   152: lload 6
    //   154: invokestatic 166	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   157: invokevirtual 227	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   160: aload 8
    //   162: ldc 229
    //   164: iconst_1
    //   165: invokestatic 234	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   168: invokevirtual 237	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   171: aload 8
    //   173: ldc 239
    //   175: aload_2
    //   176: invokevirtual 242	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   179: aload 8
    //   181: ldc 205
    //   183: ldc 207
    //   185: invokevirtual 244	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   188: iload 14
    //   190: iflt +36 -> 226
    //   193: aload 5
    //   195: getstatic 220	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   198: aload 8
    //   200: new 58	java/lang/StringBuilder
    //   203: dup
    //   204: ldc 246
    //   206: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   209: iload 14
    //   211: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   214: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   217: aconst_null
    //   218: invokevirtual 253	android/content/ContentResolver:update	(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   221: ifle +61 -> 282
    //   224: iconst_1
    //   225: ireturn
    //   226: aload 5
    //   228: getstatic 220	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   231: aload 8
    //   233: invokevirtual 257	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   236: pop
    //   237: iconst_1
    //   238: ireturn
    //   239: astore_3
    //   240: aconst_null
    //   241: astore 4
    //   243: aload 4
    //   245: ifnull +20 -> 265
    //   248: aload 4
    //   250: invokeinterface 115 1 0
    //   255: ifne +10 -> 265
    //   258: aload 4
    //   260: invokeinterface 119 1 0
    //   265: iconst_0
    //   266: ireturn
    //   267: astore 12
    //   269: aload 11
    //   271: astore 4
    //   273: goto -30 -> 243
    //   276: iconst_m1
    //   277: istore 14
    //   279: goto -138 -> 141
    //   282: iconst_0
    //   283: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   15	109	239	java/lang/Exception
    //   109	141	267	java/lang/Exception
    //   141	188	267	java/lang/Exception
    //   193	224	267	java/lang/Exception
    //   226	237	267	java/lang/Exception
  }

  public static List ba(Context paramContext)
  {
    LinkedList localLinkedList = new LinkedList();
    ContentResolver localContentResolver = paramContext.getContentResolver();
    try
    {
      Cursor localCursor2 = localContentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
      localCursor1 = localCursor2;
      if (localCursor1 == null)
      {
        z.e("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "getPhonesCursor: cursor is null.");
        return localLinkedList;
      }
    }
    catch (Exception localException)
    {
      Cursor localCursor1;
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        z.e("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", "exception in getMobileList, [%s]", arrayOfObject);
        localCursor1 = null;
      }
      if (localCursor1.moveToFirst())
        do
          localLinkedList.add(localCursor1.getString(localCursor1.getColumnIndex("data1")));
        while (localCursor1.moveToNext());
      localCursor1.close();
    }
    return localLinkedList;
  }

  public static Bitmap h(String paramString, Context paramContext)
  {
    Bitmap localBitmap1;
    if ((paramString == null) || (paramString.equals("")))
      localBitmap1 = null;
    while (true)
    {
      return localBitmap1;
      ContentResolver localContentResolver = paramContext.getContentResolver();
      try
      {
        long l = Long.parseLong(paramString);
        localBitmap1 = i.decodeStream(ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, l)));
        if (localBitmap1 != null)
        {
          Bitmap localBitmap2 = i.a(localBitmap1, true, 4.0F);
          return localBitmap2;
        }
      }
      catch (Exception localException)
      {
        z.printErrStackTrace("!44@/B4Tb64lLpJvPADYHZ60V7vMtEyCa8ns0dH9+bQxd4o=", localException, "getAvatar, contactId:%s", new Object[] { paramString });
      }
    }
    return null;
  }

  public static String pR(String paramString)
  {
    String str = paramString.trim();
    boolean bool = str.startsWith("+");
    if ((bool) && (str.length() > 1))
      str = str.substring(1, str.length());
    Matcher localMatcher = Pattern.compile("[^0-9]").matcher(str);
    if (bool)
      return "+" + localMatcher.replaceAll("").trim();
    return localMatcher.replaceAll("").trim();
  }

  public static boolean uI(String paramString)
  {
    return paramString.length() > 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.a
 * JD-Core Version:    0.6.2
 */