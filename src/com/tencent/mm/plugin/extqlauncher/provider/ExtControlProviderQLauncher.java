package com.tencent.mm.plugin.extqlauncher.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;

public class ExtControlProviderQLauncher extends ExtContentProviderBase
{
  private static final String[] eLQ = { "retCode" };
  private static final UriMatcher eMf;
  private static final String[] eNb = { "id", "count" };
  private Context context;
  private String[] eLU;
  private int eNc = -1;

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    eMf = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "openQRCodeScan", 18);
    eMf.addURI("com.tencent.mm.plugin.extqlauncher", "batchAddShortcut", 19);
    eMf.addURI("com.tencent.mm.plugin.extqlauncher", "getUnreadCount", 20);
  }

  public ExtControlProviderQLauncher()
  {
  }

  public ExtControlProviderQLauncher(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.eLU = paramArrayOfString;
    this.eNc = paramInt;
    this.context = paramContext;
  }

  private Cursor o(String[] paramArrayOfString)
  {
    z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4yPAPgXGWObnIdVH1stncFA==", "getUnreadCount");
    if (this.context == null)
    {
      hg(4);
      return null;
    }
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4yPAPgXGWObnIdVH1stncFA==", "wrong args");
      hg(3);
      return null;
    }
    MatrixCursor localMatrixCursor = new MatrixCursor(eNb);
    for (int i = 0; ; i++)
    {
      try
      {
        if ((i >= paramArrayOfString.length) || (i >= 10))
          break label260;
        if (ch.jb(paramArrayOfString[i]))
          continue;
        if (paramArrayOfString[i].equals("0"))
        {
          Object[] arrayOfObject4 = new Object[2];
          arrayOfObject4[0] = paramArrayOfString[i];
          com.tencent.mm.plugin.extqlauncher.b.Qn();
          arrayOfObject4[1] = Integer.valueOf(com.tencent.mm.plugin.extqlauncher.b.Qo());
          localMatrixCursor.addRow(arrayOfObject4);
        }
        else
        {
          String str = com.tencent.mm.plugin.base.a.a.ko(paramArrayOfString[i]);
          if (!ch.jb(str))
          {
            r localr = bg.qW().oW().yE(str);
            if (localr != null)
            {
              Object[] arrayOfObject2 = new Object[2];
              arrayOfObject2[0] = paramArrayOfString[i];
              arrayOfObject2[1] = Integer.valueOf(localr.jI());
              localMatrixCursor.addRow(arrayOfObject2);
            }
          }
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getMessage();
        z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4yPAPgXGWObnIdVH1stncFA==", "exception in updateShortcut, %s", arrayOfObject1);
        hg(4);
        localMatrixCursor.close();
        return null;
      }
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = paramArrayOfString[i];
      arrayOfObject3[1] = Integer.valueOf(0);
      localMatrixCursor.addRow(arrayOfObject3);
      continue;
      label260: hg(0);
      return localMatrixCursor;
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
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
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4yPAPgXGWObnIdVH1stncFA==", "query()");
    a(paramUri, this.context, this.eNc, this.eLU);
    if (paramUri == null)
    {
      hg(3);
      return null;
    }
    if ((ch.jb(Qg())) || (ch.jb(Qh())))
    {
      hg(3);
      return null;
    }
    if (!HL())
    {
      hg(1);
      return this.ehO;
    }
    if (!as(this.context))
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4yPAPgXGWObnIdVH1stncFA==", "invalid appid ! return null");
      hg(2);
      return null;
    }
    switch (this.eNc)
    {
    default:
      hg(3);
      return null;
    case 18:
      z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4yPAPgXGWObnIdVH1stncFA==", "toScanQRCode");
      if (this.context == null)
      {
        hg(4);
        return null;
      }
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("BaseScanUI_select_scan_mode", 1);
      localIntent2.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
      com.tencent.mm.am.a.b(this.context, "scanner", ".ui.BaseScanUI", localIntent2);
      MatrixCursor localMatrixCursor2 = new MatrixCursor(eLQ);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(1);
      localMatrixCursor2.addRow(arrayOfObject2);
      hg(0);
      return localMatrixCursor2;
    case 19:
      z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4yPAPgXGWObnIdVH1stncFA==", "toCreateShortcut");
      if (this.context == null)
      {
        hg(4);
        return null;
      }
      Intent localIntent1 = new Intent();
      com.tencent.mm.am.a.b(this.context, "extqlauncher", ".ui.QLauncherCreateShortcutUI", localIntent1);
      MatrixCursor localMatrixCursor1 = new MatrixCursor(eLQ);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(1);
      localMatrixCursor1.addRow(arrayOfObject1);
      hg(0);
      return localMatrixCursor1;
    case 20:
    }
    return o(paramArrayOfString2);
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.provider.ExtControlProviderQLauncher
 * JD-Core Version:    0.6.2
 */