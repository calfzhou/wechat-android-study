package com.tencent.mm.modelsimple;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Settings;
import com.jg.JgMethodChecked;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public static void F(Context paramContext)
  {
    a.aCl();
    if (l.cFz == 0)
      z.d("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "do not auto add account");
    do
    {
      return;
      if (l.cFz == 1)
      {
        if (aa.wb() == ab.dtS)
        {
          int j = a(paramContext, aa.wd(), null);
          z.d("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "auto add account result: " + j);
          return;
        }
        z.i("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "the user not bind mobile or not aggreed to upload addressbook");
        return;
      }
    }
    while (l.cFz != 2);
    int i = a(paramContext, null);
    z.d("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "auto add account result: " + i);
  }

  public static boolean G(Context paramContext)
  {
    return o(paramContext, null);
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
  public static boolean H(Context paramContext)
  {
    boolean bool = false;
    if (paramContext != null)
    {
      Intent localIntent = new Intent("com.tencent.mm.login.ACTION_LOGOUT");
      localIntent.putExtra("accountName", yX());
      localIntent.putExtra("accountType", "com.tencent.mm.account");
      bool = o(paramContext, yX());
      if (bool)
        paramContext.sendBroadcast(localIntent);
    }
    return bool;
  }

  public static void I(Context paramContext)
  {
    if (J(paramContext))
    {
      new c(paramContext, L(paramContext)).start();
      return;
    }
    o(paramContext, null);
    z.d("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "no account added or not current account");
  }

  private static boolean J(Context paramContext)
  {
    Account localAccount = L(paramContext);
    if (localAccount == null);
    while (!localAccount.name.equals(yX()))
      return false;
    return true;
  }

  public static boolean K(Context paramContext)
  {
    if (!J(paramContext))
    {
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "no account added or not current account");
      return false;
    }
    Account localAccount = L(paramContext);
    if (localAccount != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("expedited", true);
      localBundle.putBoolean("do_not_retry", true);
      ContentResolver.requestSync(localAccount, "com.android.contacts", localBundle);
      return true;
    }
    z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "no account added");
    return false;
  }

  private static Account L(Context paramContext)
  {
    String str = yX();
    if (ch.jb(str))
      str = (String)bg.qW().oQ().get(6, "");
    if (!ch.jb(str))
    {
      Account[] arrayOfAccount = M(paramContext);
      if (arrayOfAccount == null)
        return null;
      int i = arrayOfAccount.length;
      for (int j = 0; j < i; j++)
      {
        Account localAccount = arrayOfAccount[j];
        if (localAccount.name.equals(str))
          return localAccount;
      }
    }
    return null;
  }

  private static Account[] M(Context paramContext)
  {
    try
    {
      Account[] arrayOfAccount = AccountManager.get(paramContext).getAccountsByType("com.tencent.mm.account");
      return arrayOfAccount;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "get all accounts failed");
    }
    return null;
  }

  public static String N(Context paramContext)
  {
    Account[] arrayOfAccount = r(paramContext, "com.google");
    String str = null;
    if (arrayOfAccount != null)
    {
      int i = arrayOfAccount.length;
      str = null;
      if (i > 0)
      {
        int j = arrayOfAccount.length;
        for (int k = 0; k < j; k++)
        {
          str = arrayOfAccount[k].name;
          if ((!ch.jb(str)) && (ch.iX(str)))
            break;
        }
      }
    }
    return str;
  }

  public static int a(Context paramContext, g paramg)
  {
    if (paramContext == null)
    {
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "context is null");
      return 0;
    }
    String str = yX();
    if (ch.jb(str))
    {
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "account username is null or nil");
      str = (String)bg.qW().oQ().get(6, "");
      if (ch.jb(str));
    }
    else
    {
      if (!q(paramContext, str))
        break label67;
      return 3;
    }
    return 0;
    try
    {
      label67: AccountManager localAccountManager = AccountManager.get(paramContext);
      Account localAccount = new Account(str, "com.tencent.mm.account");
      if (localAccountManager.addAccountExplicitly(localAccount, "", null))
      {
        ContentResolver.setSyncAutomatically(localAccount, "com.android.contacts", true);
        Bundle localBundle = new Bundle();
        localBundle.putString("authAccount", str);
        localBundle.putString("accountType", "com.tencent.mm.account");
        if (paramg != null)
          paramg.b(localBundle);
        return 1;
      }
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "exception in addAccountNoNeedBindMobile() " + localException.getMessage());
      if (paramg != null)
        paramg.b(null);
    }
    return 2;
  }

  public static int a(Context paramContext, String paramString, g paramg)
  {
    if (paramContext == null)
    {
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "activity is null");
      return 0;
    }
    if (ch.jb(paramString))
    {
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "account username is null or nil");
      return 0;
    }
    String str = yX();
    if (ch.jb(str));
    while (true)
    {
      try
      {
        AccountManager localAccountManager = AccountManager.get(paramContext);
        Account localAccount = new Account(paramString, "com.tencent.mm.account");
        if (q(paramContext, paramString))
        {
          ContentResolver.setSyncAutomatically(localAccount, "com.android.contacts", true);
          return 3;
        }
        o(paramContext, null);
        if (localAccountManager.addAccountExplicitly(localAccount, "", null))
        {
          ContentResolver.setSyncAutomatically(localAccount, "com.android.contacts", true);
          Bundle localBundle = new Bundle();
          localBundle.putString("authAccount", paramString);
          localBundle.putString("accountType", "com.tencent.mm.account");
          if (paramg != null)
            paramg.b(localBundle);
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("account_name", paramString);
          localContentValues.put("account_type", "com.tencent.mm.account");
          localContentValues.put("should_sync", Integer.valueOf(1));
          localContentValues.put("ungrouped_visible", Integer.valueOf(1));
          paramContext.getContentResolver().insert(ContactsContract.Settings.CONTENT_URI, localContentValues);
          return 1;
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "exception in addAccount() " + localException.getMessage());
        if (paramg != null)
          paramg.b(null);
        return 2;
      }
      paramString = str;
    }
  }

  public static void c(Context paramContext, String paramString1, String paramString2)
  {
    if (J(paramContext))
    {
      new c(paramContext, L(paramContext), paramString1, paramString2).start();
      return;
    }
    o(paramContext, null);
    z.d("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "no account added or not current account");
  }

  private static String ht(String paramString)
  {
    try
    {
      String str = Pattern.compile("[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]").matcher(paramString).replaceAll("_").trim();
      return str;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = localException.getMessage();
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "stringFilter failed, %s, %s", arrayOfObject);
    }
    return paramString;
  }

  private static boolean o(Context paramContext, String paramString)
  {
    boolean bool = ch.jb(paramString);
    z.v("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "remove account : " + paramString);
    if (paramContext == null)
    {
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "null context");
      return false;
    }
    while (true)
    {
      int j;
      try
      {
        Account[] arrayOfAccount = M(paramContext);
        if ((arrayOfAccount == null) || (arrayOfAccount.length == 0))
        {
          z.d("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "get account info is null or nil");
          return true;
        }
        AccountManager localAccountManager = AccountManager.get(paramContext);
        int i = arrayOfAccount.length;
        j = 0;
        if (j < i)
        {
          Account localAccount = arrayOfAccount[j];
          if (bool)
          {
            localAccountManager.removeAccount(localAccount, null, null);
          }
          else if (localAccount.name.equals(paramString))
          {
            localAccountManager.removeAccount(localAccount, null, null);
            z.i("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "remove account success: " + paramString);
          }
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "exception in removeAccount() " + localException.getMessage());
        return false;
      }
      return true;
      j++;
    }
  }

  public static void p(Context paramContext, String paramString)
  {
    if (J(paramContext))
    {
      new c(paramContext, L(paramContext), paramString).start();
      return;
    }
    o(paramContext, null);
    z.d("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "no account added or not current account");
  }

  private static boolean q(Context paramContext, String paramString)
  {
    Account[] arrayOfAccount = M(paramContext);
    if ((arrayOfAccount == null) || (arrayOfAccount.length == 0));
    while (true)
    {
      return false;
      int i = arrayOfAccount.length;
      for (int j = 0; j < i; j++)
        if (arrayOfAccount[j].name.equals(paramString))
          return true;
    }
  }

  private static Account[] r(Context paramContext, String paramString)
  {
    try
    {
      Account[] arrayOfAccount = AccountManager.get(paramContext).getAccountsByType(paramString);
      return arrayOfAccount;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "get all accounts failed");
    }
    return null;
  }

  private static String yX()
  {
    if (!bg.oE())
    {
      z.e("!44@/B4Tb64lLpKKKHTL+uUSWr8RQSJ6YRj00998+t8XZdQ=", "getCurrentAccountName MMCore.acc Not Ready");
      return "";
    }
    String str = (String)bg.qW().oQ().get(4);
    if (!ch.jb(str));
    while (true)
    {
      return ht(str);
      str = x.pH();
      if (ch.jb(str))
      {
        str = x.pG();
        if ((ch.jb(str)) || (i.yd(str)))
          str = "";
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.f
 * JD-Core Version:    0.6.2
 */