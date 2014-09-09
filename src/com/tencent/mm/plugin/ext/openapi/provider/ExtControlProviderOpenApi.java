package com.tencent.mm.plugin.ext.openapi.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.mm.a.c;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.modelvoice.bb;
import com.tencent.mm.modelvoice.bq;
import com.tencent.mm.n.af;
import com.tencent.mm.n.m;
import com.tencent.mm.n.q;
import com.tencent.mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ci;
import com.tencent.mm.storage.cr;
import com.tencent.mm.storage.cs;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

public class ExtControlProviderOpenApi extends ExtContentProviderBase
{
  private static final String[] eLQ = { "retCode" };
  private static final String[] eLR = { "retCode", "selfId" };
  private static final String[] eLS = { "openid", "avatar" };
  private static final String[] eLT = { "voiceType", "sampleRateInHz", "channelConfig", "audioFormat", "filePath" };
  private Context context;
  private String[] eLU = null;
  private int eLV = -1;

  public ExtControlProviderOpenApi()
  {
  }

  public ExtControlProviderOpenApi(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.eLU = paramArrayOfString;
    this.eLV = paramInt;
    this.context = paramContext;
  }

  private Cursor d(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "registerMsgReceiver, op = %s", new Object[] { paramString1 });
    if (this.context == null)
    {
      z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "context == null");
      hg(4);
    }
    while (true)
    {
      return null;
      if (com.tencent.mm.sdk.platformtools.ch.jb(paramString1))
      {
        z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "wrong args, op is null");
        hg(3);
        return null;
      }
      int i = -1;
      try
      {
        int j = Integer.parseInt(paramString1);
        i = j;
        label70: if (i == 1)
          return n(paramString2, paramString3, paramString4);
        if (i == 2)
        {
          z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "doUnRegisterMsgListener");
          if (com.tencent.mm.plugin.ext.b.Qa().zP(Qg()) == null)
          {
            Object[] arrayOfObject4 = new Object[2];
            arrayOfObject4[0] = Qg();
            arrayOfObject4[1] = Qh();
            z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "This app never been registered, appId = %s, pkg = %s", arrayOfObject4);
            return null;
          }
          boolean bool = com.tencent.mm.plugin.ext.b.Qa().zQ(Qg());
          Object[] arrayOfObject2 = new Object[3];
          arrayOfObject2[0] = Boolean.valueOf(bool);
          arrayOfObject2[1] = Qg();
          arrayOfObject2[2] = Qh();
          z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "doUnRegisterMsgListener ret = %s, appId = %s, pkg = %s", arrayOfObject2);
          if (!bool)
            continue;
          MatrixCursor localMatrixCursor = new MatrixCursor(eLQ);
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(1);
          localMatrixCursor.addRow(arrayOfObject3);
          hg(0);
          return localMatrixCursor;
        }
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(i);
        z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "wrong args, no such op, %s", arrayOfObject1);
        hg(3);
        return null;
      }
      catch (Exception localException)
      {
        break label70;
      }
    }
  }

  private Cursor f(String[] paramArrayOfString)
  {
    z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "getUserAvatarByOpenId");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "wrong args");
      hg(3);
      return null;
    }
    MatrixCursor localMatrixCursor = new MatrixCursor(eLS);
    for (int i = 0; ; i++)
    {
      i locali;
      try
      {
        if ((i >= paramArrayOfString.length) || (i >= 5))
          break label239;
        if (com.tencent.mm.sdk.platformtools.ch.jb(paramArrayOfString[i]))
          continue;
        cr localcr = com.tencent.mm.plugin.ext.b.Qb().Ad(paramArrayOfString[i]);
        if ((localcr == null) || (com.tencent.mm.sdk.platformtools.ch.jb(localcr.field_openId)) || (com.tencent.mm.sdk.platformtools.ch.jb(localcr.field_username)))
        {
          z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "openidInApp is null");
        }
        else
        {
          locali = bg.qW().oT().ys(localcr.field_username);
          if ((locali == null) || (locali.getUsername() == null) || (locali.getUsername().length() <= 0))
            z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "contact is null");
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getMessage();
        z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "Exception occur, %s", arrayOfObject1);
        hg(4);
        localMatrixCursor.close();
        return null;
      }
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = paramArrayOfString[i];
      arrayOfObject2[1] = q.eY(af.sh().g(locali.getUsername(), false));
      localMatrixCursor.addRow(arrayOfObject2);
      continue;
      label239: hg(0);
      return localMatrixCursor;
    }
  }

  private Cursor g(String[] paramArrayOfString)
  {
    z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "decodeVoice");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0) || (paramArrayOfString[0].length() <= 0))
    {
      z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "wrong args");
      hg(3);
      return null;
    }
    int i = 0;
    MatrixCursor localMatrixCursor = null;
    while (true)
    {
      if ((i < 5) && (i < paramArrayOfString.length))
      {
        String str1 = paramArrayOfString[i];
        bb localbb;
        String str2;
        while (true)
        {
          try
          {
            if (!bq.b(str1, 0, true))
            {
              Object[] arrayOfObject4 = new Object[1];
              arrayOfObject4[0] = paramArrayOfString[i];
              z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "wrong args : %s", arrayOfObject4);
            }
            else
            {
              if (localMatrixCursor == null)
                localMatrixCursor = new MatrixCursor(eLT);
              localbb = new bb();
              str2 = com.tencent.mm.plugin.ext.b.Qc() + "/" + aj.AN(str1);
              if (c.ac(str2))
              {
                z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "pcm already exist");
                if (!com.tencent.mm.sdk.platformtools.ch.jb(str2))
                  break;
                z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "wrong args");
              }
            }
          }
          catch (Exception localException)
          {
            Object[] arrayOfObject1 = new Object[1];
            arrayOfObject1[0] = localException.getMessage();
            z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "Exception in decodeVoice, %s", arrayOfObject1);
          }
          str2 = localbb.S(str1, str2);
        }
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i);
        z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "decode to pcm success %d", arrayOfObject2);
        Object[] arrayOfObject3 = new Object[5];
        arrayOfObject3[0] = Integer.valueOf(1);
        arrayOfObject3[1] = Integer.valueOf(localbb.Bx());
        arrayOfObject3[2] = Integer.valueOf(localbb.By());
        arrayOfObject3[3] = Integer.valueOf(2);
        arrayOfObject3[4] = str2;
        localMatrixCursor.addRow(arrayOfObject3);
      }
      else
      {
        if (localMatrixCursor != null)
        {
          hg(0);
          return localMatrixCursor;
        }
        if (paramArrayOfString.length > 0)
        {
          z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "wrong args");
          hg(3);
        }
        return null;
      }
      i++;
    }
  }

  private Cursor n(String paramString1, String paramString2, String paramString3)
  {
    z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "doRegisterMsgListener");
    if ((com.tencent.mm.sdk.platformtools.ch.jb(paramString1)) || (com.tencent.mm.sdk.platformtools.ch.jb(paramString2)) || (com.tencent.mm.sdk.platformtools.ch.jb(paramString3)))
    {
      z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "wrong args, scene = %s, msgType = %s, msgState = %s", new Object[] { paramString1, paramString2, paramString3 });
      hg(3);
      return null;
    }
    Object localObject1 = null;
    try
    {
      int i = Integer.parseInt(paramString3);
      int j = Integer.parseInt(paramString1);
      int k = Integer.parseInt(paramString2);
      if (i != 2)
      {
        hg(3);
        return null;
      }
      if (com.tencent.mm.plugin.ext.b.Qa().zP(Qg()) == null)
      {
        com.tencent.mm.storage.ch localch = new com.tencent.mm.storage.ch();
        localch.field_appId = Qg();
        localch.field_packageName = Qh();
        String str1 = Qg();
        boolean bool1;
        if (com.tencent.mm.sdk.platformtools.ch.jb(str1))
        {
          bool1 = false;
          if (!bool1)
            break label287;
        }
        label287: for (localch.field_status = 1; ; localch.field_status = 0)
        {
          localch.field_sceneFlag = j;
          localch.field_msgTypeFlag = k;
          localch.field_msgState = i;
          boolean bool2 = com.tencent.mm.plugin.ext.b.Qa().b(localch);
          Object[] arrayOfObject2 = new Object[6];
          arrayOfObject2[0] = Boolean.valueOf(bool2);
          arrayOfObject2[1] = Qh();
          arrayOfObject2[2] = Integer.valueOf(j);
          arrayOfObject2[3] = Integer.valueOf(i);
          arrayOfObject2[4] = Integer.valueOf(i);
          arrayOfObject2[5] = Integer.valueOf(localch.field_status);
          z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "registerMsgReceiver ret = %s, pkgName = %s, scene = %s, msgType = %s, msgState = %s, appStatus = %s", arrayOfObject2);
          if (bool2)
            break label372;
          return null;
          bool1 = l.k(l.F(str1, true));
          break;
        }
      }
    }
    catch (Exception localException1)
    {
    }
    while (true)
    {
      hg(4);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException1.getMessage();
      z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "exception in doRegisterMsgListener, %s", arrayOfObject1);
      if (localObject1 != null)
        localObject1.close();
      return null;
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = Qg();
      arrayOfObject4[1] = Qh();
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "This app had already been registered, appId = %s, pkg = %s", arrayOfObject4);
      label372: String str2 = aj.AN(x.pG() + bg.qW().oD());
      MatrixCursor localMatrixCursor = new MatrixCursor(eLR);
      try
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Integer.valueOf(1);
        arrayOfObject3[1] = com.tencent.mm.sdk.platformtools.ch.ja(str2);
        localMatrixCursor.addRow(arrayOfObject3);
        hg(0);
        return localMatrixCursor;
      }
      catch (Exception localException2)
      {
        localObject1 = localMatrixCursor;
        Object localObject2 = localException2;
      }
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
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.eLV);
    z.d("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "query(), ApiId = %s", arrayOfObject);
    a(paramUri, this.context, this.eLV, this.eLU);
    if (paramUri == null)
    {
      hg(3);
      return null;
    }
    if ((com.tencent.mm.sdk.platformtools.ch.jb(Qg())) || (com.tencent.mm.sdk.platformtools.ch.jb(Qh())))
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
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy49S1HIxUdhGYAFEYo7Mlhqg==", "invalid appid ! return null");
      hg(2);
      return null;
    }
    switch (this.eLV)
    {
    case 24:
    default:
      hg(3);
      return null;
    case 22:
      return d(paramUri.getQueryParameter("op"), paramUri.getQueryParameter("scene"), paramUri.getQueryParameter("msgType"), paramUri.getQueryParameter("msgState"));
    case 23:
      return f(paramArrayOfString2);
    case 25:
    }
    return g(paramArrayOfString2);
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi
 * JD-Core Version:    0.6.2
 */