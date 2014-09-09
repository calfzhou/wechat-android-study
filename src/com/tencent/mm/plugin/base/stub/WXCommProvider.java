package com.tencent.mm.plugin.base.stub;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Looper;
import android.os.Process;
import com.jg.JgClassChecked;
import com.tencent.mm.c.a.bl;
import com.tencent.mm.c.a.bn;
import com.tencent.mm.c.a.bp;
import com.tencent.mm.c.a.bz;
import com.tencent.mm.c.a.cb;
import com.tencent.mm.c.a.ns;
import com.tencent.mm.c.a.nu;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class WXCommProvider extends ContentProvider
{
  public static final String ehM = ak.getPackageName() + "_comm_preferences";
  private static final String[] ehN = { "packageName", "data" };
  private static final UriMatcher ehP = new UriMatcher(-1);
  protected static boolean ehQ = false;
  public static Object lock = new Object();
  private SharedPreferences dkI;
  protected MatrixCursor ehO = new MatrixCursor(new String[0]);
  private cm gQj;

  static
  {
    ehP.addURI("com.tencent.mm.sdk.comm.provider", "pref", 1);
    ehP.addURI("com.tencent.mm.sdk.comm.provider", "openQRCodeScan", 18);
    ehP.addURI("com.tencent.mm.sdk.comm.provider", "batchAddShortcut", 19);
    ehP.addURI("com.tencent.mm.sdk.comm.provider", "getUnreadCount", 20);
    ehP.addURI("com.tencent.mm.sdk.comm.provider", "jumpToBizProfile", 21);
    ehP.addURI("com.tencent.mm.sdk.comm.provider", "registerMsgListener", 22);
    ehP.addURI("com.tencent.mm.sdk.comm.provider", "getAvatar", 23);
    ehP.addURI("com.tencent.mm.sdk.comm.provider", "regWatchAppId", 24);
    ehP.addURI("com.tencent.mm.sdk.comm.provider", "decodeVoice", 25);
  }

  private String[] HK()
  {
    String[] arrayOfString;
    try
    {
      int i = Binder.getCallingUid();
      arrayOfString = getContext().getPackageManager().getPackagesForUid(Binder.getCallingUid());
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      if (arrayOfString == null);
      for (int j = 0; ; j = arrayOfString.length)
      {
        arrayOfObject2[1] = Integer.valueOf(j);
        z.d("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "getCallingPackages, callingUid = %d, packages size = %d", arrayOfObject2);
        if (arrayOfString != null)
          break;
        z.w("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "getCallingPackages fail, packages is null");
        return new String[0];
      }
      int k = arrayOfString.length;
      for (int m = 0; m < k; m++)
        z.v("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "getCallingPackages = %s", new Object[] { arrayOfString[m] });
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException.getMessage();
      z.e("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "getCallingPackages, ex = %s", arrayOfObject1);
      arrayOfString = new String[0];
    }
    return arrayOfString;
  }

  private boolean HL()
  {
    try
    {
      z.i("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "checkIsLogin()");
      if ((!ehQ) && (!((Boolean)new n(this, Boolean.valueOf(false)).b(this.gQj)).booleanValue()))
      {
        ehQ = false;
        return false;
      }
      if ((bg.oE()) && (bg.ra()) && (!bg.rd()));
      for (ehQ = true; ; ehQ = false)
      {
        z.i("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "hasLogin = " + ehQ);
        return ehQ;
      }
    }
    catch (Exception localException)
    {
      z.w("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", localException.getMessage());
    }
    return false;
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    if (paramUri == null)
    {
      z.e("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "delete fail, uri is null");
      return 0;
    }
    int i = ehP.match(paramUri);
    String[] arrayOfString = HK();
    return ((Integer)new m(this, Integer.valueOf(0), paramUri, i, arrayOfString).b(this.gQj)).intValue();
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    z.d("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "onCreate");
    this.gQj = new cm();
    z.i("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "pid = " + Process.myPid() + ", tid : = " + Process.myTid());
    this.dkI = getContext().getSharedPreferences(ehM, 0);
    SharedPreferences localSharedPreferences = this.dkI;
    boolean bool = false;
    if (localSharedPreferences != null)
      bool = true;
    return bool;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    Cursor localCursor;
    if (paramUri == null)
    {
      z.e("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "query fail, uri is null");
      localCursor = null;
    }
    String[] arrayOfString;
    int i;
    while (true)
    {
      return localCursor;
      arrayOfString = HK();
      if ((arrayOfString == null) || (arrayOfString.length <= 0))
      {
        z.e("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "CallingPackages is null");
        return null;
      }
      i = ehP.match(paramUri);
      if (a.aGB() == null)
        new ay(Looper.getMainLooper(), new k(this), true).cP(50L);
      try
      {
        synchronized (lock)
        {
          z.i("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "Lock to wait for the first initialize of the Application.");
          lock.wait();
          switch (i)
          {
          default:
            MatrixCursor localMatrixCursor = new MatrixCursor(ehN);
            localCursor = (Cursor)new l(this, paramUri, i, arrayOfString, localMatrixCursor).b(this.gQj);
            if (localCursor == null)
            {
              localMatrixCursor.close();
              return localCursor;
            }
            break;
          case 18:
          case 19:
          case 20:
          case 22:
          case 23:
          case 25:
          case 24:
          case 21:
          }
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          z.e("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "the lock may have some problem," + localInterruptedException.getMessage());
        if (!HL())
          return null;
        bn localbn = new bn();
        localbn.cIq.cIs = i;
        localbn.cIq.uri = paramUri;
        localbn.cIq.selectionArgs = paramArrayOfString2;
        localbn.cIq.context = getContext();
        localbn.cIq.cIo = arrayOfString;
        if (!a.aGB().g(localbn))
        {
          z.e("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "ExtCallEvent fail");
          return null;
        }
        return localbn.cIr.cursor;
      }
    }
    if (!HL())
      return this.ehO;
    bz localbz = new bz();
    localbz.cIO.cIs = i;
    localbz.cIO.uri = paramUri;
    localbz.cIO.selectionArgs = paramArrayOfString2;
    localbz.cIO.context = getContext();
    localbz.cIO.cIo = arrayOfString;
    if (!a.aGB().g(localbz))
    {
      z.e("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "ExtCallEvent fail");
      return null;
    }
    return localbz.cIP.cursor;
    if (!HL())
      return this.ehO;
    ns localns = new ns();
    localns.cPR.cIs = i;
    localns.cPR.uri = paramUri;
    localns.cPR.context = getContext();
    for (int j = 0; ; j++)
      if (j < arrayOfString.length)
      {
        if (arrayOfString[j] != null)
          localns.cPR.cPT = arrayOfString[j];
      }
      else
      {
        if (a.aGB().g(localns))
          break;
        z.e("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "WatchAppIdRegEvent fail");
        return null;
      }
    return localns.cPS.cursor;
    bl localbl = new bl();
    localbl.cIn.aRG = 1;
    localbl.cIn.selectionArgs = paramArrayOfString2;
    localbl.cIn.context = getContext();
    localbl.cIn.cIo = arrayOfString;
    if (!a.aGB().g(localbl))
      z.e("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "ExtCallBizEvent fail");
    return null;
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCommProvider
 * JD-Core Version:    0.6.2
 */