package com.tencent.mm.plugin.exdevice.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class a
{
  private static void b(SharedPreferences paramSharedPreferences)
  {
    int i = 0;
    z.i("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "tryToClearDirtyData");
    if (Build.VERSION.SDK_INT < 11)
      return;
    if (paramSharedPreferences == null)
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "null == aSP");
      return;
    }
    String[] arrayOfString = { "conneted_device", "shut_down_device" };
    while (i < 2)
    {
      String str = arrayOfString[i];
      try
      {
        if (paramSharedPreferences.getStringSet(str, null) != null)
        {
          z.i("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "find dirty data, remove it, key = %s", new Object[] { str });
          if (!paramSharedPreferences.edit().remove(str).commit())
            z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "remove dirty data failed!!!");
        }
        label107: i++;
      }
      catch (Exception localException)
      {
        break label107;
      }
    }
  }

  public static boolean e(String paramString, long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Long.valueOf(paramLong);
    z.i("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "isItemInSharedPreferences, key = %s, device id = %d", arrayOfObject);
    if (ch.jb(paramString))
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "key is null or nil");
    SharedPreferences localSharedPreferences;
    do
    {
      return false;
      localSharedPreferences = ak.getContext().getSharedPreferences("exdevice_pref", 0);
      if (localSharedPreferences == null)
      {
        z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "null == sp");
        return false;
      }
      b(localSharedPreferences);
    }
    while (!com.tencent.mm.plugin.exdevice.g.a.ap(String.valueOf(paramLong), localSharedPreferences.getString(paramString, new String())));
    return true;
  }

  public static boolean f(String paramString, long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Long.valueOf(paramLong);
    z.i("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "addToSharedPreferences, key = %s, deviceId = %d", arrayOfObject);
    if (ch.jb(paramString))
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "key is null or nil");
      return false;
    }
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences == null)
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "null == sp");
      return false;
    }
    b(localSharedPreferences);
    String str1 = String.valueOf(paramLong);
    String str2 = localSharedPreferences.getString(paramString, new String());
    z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "addDeviceToDeviceList, device = %s, device list = %s", new Object[] { str1, str2 });
    String str3;
    if ((ch.jb(str1)) || (str2 == null))
    {
      z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "Error parameters!!!");
      str3 = null;
    }
    while (str3 == null)
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "addDeviceToDeviceList failed!!!");
      return false;
      String str4 = new String();
      String str5 = str4 + str2;
      String str6 = str5 + str1;
      str3 = str6 + "|";
      z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "add device to device list successful, new device list = %s", new Object[] { str3 });
    }
    if (!localSharedPreferences.edit().putString(paramString, str3).commit())
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "sp.edit().putString().commit() Failed!!!");
      return false;
    }
    z.i("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "add to sharepreference successful, new device list is %s", new Object[] { str3 });
    return true;
  }

  public static boolean g(String paramString, long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Long.valueOf(paramLong);
    z.i("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "removeFromSharedPreferences, key = %s, deviceId = %d", arrayOfObject);
    if (ch.jb(paramString))
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "key is null or nil");
      return false;
    }
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences == null)
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "null == sp");
      return false;
    }
    b(localSharedPreferences);
    String str = com.tencent.mm.plugin.exdevice.g.a.aq(String.valueOf(paramLong), localSharedPreferences.getString(paramString, new String()));
    if (str == null)
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "remove device from device list failed!!!");
      return false;
    }
    if (str.length() == 0);
    for (boolean bool = localSharedPreferences.edit().remove(paramString).commit(); !bool; bool = localSharedPreferences.edit().putString(paramString, str).commit())
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "sp.edit().putString().commit()");
      return false;
    }
    z.i("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "remove from sharepreference successful, new device list is %s", new Object[] { str });
    return true;
  }

  // ERROR //
  public static long[] lN(String paramString)
  {
    // Byte code:
    //   0: ldc 10
    //   2: ldc 168
    //   4: iconst_1
    //   5: anewarray 4	java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: aload_0
    //   11: aastore
    //   12: invokestatic 46	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   15: aload_0
    //   16: invokestatic 77	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   19: ifeq +12 -> 31
    //   22: ldc 10
    //   24: ldc 79
    //   26: invokestatic 29	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: aconst_null
    //   30: areturn
    //   31: invokestatic 85	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   34: ldc 87
    //   36: iconst_0
    //   37: invokevirtual 93	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   40: astore_1
    //   41: aload_1
    //   42: ifnonnull +12 -> 54
    //   45: ldc 10
    //   47: ldc 95
    //   49: invokestatic 29	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   52: aconst_null
    //   53: areturn
    //   54: aload_1
    //   55: invokestatic 97	com/tencent/mm/plugin/exdevice/e/a:b	(Landroid/content/SharedPreferences;)V
    //   58: aload_1
    //   59: aload_0
    //   60: new 31	java/lang/String
    //   63: dup
    //   64: invokespecial 104	java/lang/String:<init>	()V
    //   67: invokeinterface 108 3 0
    //   72: ldc 170
    //   74: invokevirtual 174	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   77: astore 4
    //   79: aload 4
    //   81: ifnull +9 -> 90
    //   84: aload 4
    //   86: arraylength
    //   87: ifne +35 -> 122
    //   90: ldc 10
    //   92: ldc 176
    //   94: invokestatic 29	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   97: aconst_null
    //   98: areturn
    //   99: astore_2
    //   100: iconst_1
    //   101: anewarray 4	java/lang/Object
    //   104: astore_3
    //   105: aload_3
    //   106: iconst_0
    //   107: aload_2
    //   108: invokevirtual 179	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   111: aastore
    //   112: ldc 10
    //   114: ldc 181
    //   116: aload_3
    //   117: invokestatic 183	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: aconst_null
    //   121: areturn
    //   122: aload 4
    //   124: arraylength
    //   125: newarray long
    //   127: astore 5
    //   129: aload 4
    //   131: arraylength
    //   132: istore 6
    //   134: iconst_0
    //   135: istore 7
    //   137: iconst_0
    //   138: istore 8
    //   140: iload 7
    //   142: iload 6
    //   144: if_icmpge +97 -> 241
    //   147: aload 4
    //   149: iload 7
    //   151: aaload
    //   152: astore 9
    //   154: ldc 10
    //   156: ldc 185
    //   158: iconst_1
    //   159: anewarray 4	java/lang/Object
    //   162: dup
    //   163: iconst_0
    //   164: aload 9
    //   166: aastore
    //   167: invokestatic 46	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   170: aload 9
    //   172: invokevirtual 160	java/lang/String:length	()I
    //   175: istore 11
    //   177: iload 11
    //   179: ifne +9 -> 188
    //   182: iinc 7 1
    //   185: goto -45 -> 140
    //   188: iload 8
    //   190: iconst_1
    //   191: iadd
    //   192: istore 12
    //   194: aload 5
    //   196: iload 8
    //   198: aload 9
    //   200: invokestatic 189	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   203: lastore
    //   204: iload 12
    //   206: istore 8
    //   208: goto -26 -> 182
    //   211: astore 10
    //   213: ldc 10
    //   215: new 127	java/lang/StringBuilder
    //   218: dup
    //   219: ldc 191
    //   221: invokespecial 194	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   224: aload 10
    //   226: invokevirtual 179	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   229: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   235: invokestatic 29	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   238: goto -56 -> 182
    //   241: iload 8
    //   243: ifne +5 -> 248
    //   246: aconst_null
    //   247: areturn
    //   248: aload 5
    //   250: areturn
    //   251: astore 13
    //   253: iload 12
    //   255: istore 8
    //   257: aload 13
    //   259: astore 10
    //   261: goto -48 -> 213
    //
    // Exception table:
    //   from	to	target	type
    //   58	79	99	java/lang/Exception
    //   154	177	211	java/lang/Exception
    //   194	204	251	java/lang/Exception
  }

  public static boolean lO(String paramString)
  {
    z.i("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "removeFromSharedPreferences, key = %s", new Object[] { paramString });
    if (ch.jb(paramString))
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "key is null or nil");
      return false;
    }
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences == null)
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "null == sp");
      return false;
    }
    b(localSharedPreferences);
    if (!localSharedPreferences.edit().remove(paramString).commit())
    {
      z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "sp.edit().remove(aKey).commit() failed!!!");
      return false;
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.e.a
 * JD-Core Version:    0.6.2
 */