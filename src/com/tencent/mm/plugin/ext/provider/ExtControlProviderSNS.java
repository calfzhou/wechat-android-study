package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.mm.as.d;
import com.tencent.mm.c.a.bq;
import com.tencent.mm.c.a.bs;
import com.tencent.mm.c.a.bt;
import com.tencent.mm.c.a.bv;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n.c;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.List;

public final class ExtControlProviderSNS extends ExtContentProviderBase
{
  private static boolean eME = false;
  private static ay eMF = new ay(new j(), false);
  private static final String[] eMH = { "feedId", "desc", "url", "nickname", "avatar", "timestamp", "mediaCount", "type", "bigImgUrl", "firstImgWidth", "firstImgHeight" };
  private static final UriMatcher eMf;
  private boolean cIV = false;
  private boolean cIW = false;
  private int cIX = 0;
  private String eMI = "";

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    eMf = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.SNS", "snsInfo", 17);
  }

  private Cursor Ql()
  {
    z.i("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "getSnsCursor() , needDownload = true");
    d locald = new d(eMH, (byte)0);
    bq localbq = new bq();
    localbq.cIt.cIv = this.eMI;
    if (!com.tencent.mm.sdk.c.a.aGB().g(localbq))
    {
      locald.close();
      return null;
    }
    Cursor localCursor = localbq.cIu.cursor;
    if (localCursor != null);
    while (true)
    {
      try
      {
        int i = localCursor.getCount();
        z.i("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "in getSnsCursor(), snsCount = " + i);
        bt localbt;
        if ((i > 0) && (localCursor.moveToFirst()))
        {
          if (localCursor != null)
          {
            localbt = new bt();
            localbt.cIw.cIy = localCursor;
            if (!com.tencent.mm.sdk.c.a.aGB().g(localbt))
              z.w("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "ExtGetSnsDataEvent publish error");
          }
          else
          {
            if (localCursor.moveToNext())
              continue;
          }
        }
        else
        {
          z.i("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "in getSnsCursor(), matrixCursor Count = " + locald.getCount());
          localCursor.close();
          break label805;
        }
        i locali = bg.qW().oT().yq(localbt.cIx.cIz);
        if ((locali == null) || ((int)locali.dhv <= 0))
          continue;
        String str1 = "";
        switch (localbt.cIx.cIE)
        {
        case 2:
          if ((localbt.cIx.cIG == null) || (localbt.cIx.cIG.size() <= 0) || (getContext() == null))
            break label798;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(localbt.cIx.cIG.size());
          z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "uris.size() = [%s]", arrayOfObject3);
          if ((j != 2) && (j != 6) && (j != 3) && (j != 4))
            break label798;
          str2 = (String)localbt.cIx.cIG.get(0);
          if ((localbt.cIx.cIH != null) && (localbt.cIx.cIH.size() > 0) && (getContext() != null))
          {
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(localbt.cIx.cIH.size());
            arrayOfObject2[1] = Integer.valueOf(localbt.cIx.cII);
            arrayOfObject2[2] = Integer.valueOf(localbt.cIx.cIJ);
            z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "bigImgUris.size() = [%s], firstImgWidth = [%s], firstImgHeight = [%s]", arrayOfObject2);
            if ((j == 2) || (j == 6) || (j == 3) || (j == 4))
              str1 = (String)localbt.cIx.cIH.get(0);
          }
          String str3 = c.eL(localbt.cIx.cIz);
          String str4 = str3;
          try
          {
            Object[] arrayOfObject1 = new Object[11];
            arrayOfObject1[0] = com.tencent.mm.plugin.ext.a.a.aS(localbt.cIx.cIB);
            arrayOfObject1[1] = localbt.cIx.cIC;
            arrayOfObject1[2] = str2;
            arrayOfObject1[3] = locali.od();
            if (str4 == null)
              str4 = "";
            arrayOfObject1[4] = str4;
            arrayOfObject1[5] = Long.valueOf(localbt.cIx.cID);
            arrayOfObject1[6] = Integer.valueOf(localbt.cIx.cIF);
            arrayOfObject1[7] = Integer.valueOf(j);
            arrayOfObject1[8] = str1;
            arrayOfObject1[9] = Integer.valueOf(localbt.cIx.cII);
            arrayOfObject1[10] = Integer.valueOf(localbt.cIx.cIJ);
            locald.addRow(arrayOfObject1);
          }
          catch (Exception localException2)
          {
            z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", localException2.getMessage());
          }
          continue;
        case 1:
        case 7:
        case 8:
        case 4:
        case 3:
        case 5:
        case 6:
        }
      }
      catch (Exception localException1)
      {
        z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", localException1.getMessage());
        if (localCursor != null)
          localCursor.close();
        locald.close();
        return null;
      }
      int j = 1;
      continue;
      j = 2;
      continue;
      j = 3;
      continue;
      j = 6;
      continue;
      j = 4;
      continue;
      label798: String str2 = "";
      continue;
      label805: return locald;
      j = 5;
    }
  }

  private static void aQ(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      eME = true;
      eMF.cP(15000L);
      return;
    }
    eMF.cP(0L);
  }

  private Cursor aT(long paramLong)
  {
    int i = 1;
    z.i("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "handleGetSnsInfo() userId = " + paramLong);
    try
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(paramLong);
      z.i("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "startGetSNSInfo, userId=[%s]", arrayOfObject1);
      i locali;
      if (paramLong == 0L)
      {
        locali = bg.qW().oT().yq(x.pG());
        if ((locali != null) && ((int)locali.dhv > 0))
          break label121;
        z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "ct == null");
        i = 0;
      }
      while (true)
      {
        if (i != 0)
          break label236;
        z.w("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "startGetSNSInfo() return false");
        return null;
        locali = bg.qW().oT().cT(paramLong);
        break;
        label121: this.cIV = com.tencent.mm.g.a.cv(locali.getType());
        this.cIW = x.cY(locali.getUsername());
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = locali.getUsername();
        arrayOfObject2[1] = Boolean.valueOf(this.cIV);
        arrayOfObject2[2] = Boolean.valueOf(this.cIW);
        z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "ct.getUsername()=[%s], isFriend=[%s], isSelf=[%s]", arrayOfObject2);
        com.tencent.mm.pluginsdk.d.a.a locala = new com.tencent.mm.pluginsdk.d.a.a();
        locala.a(10000L, new k(this, locali, locala));
      }
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", localException.getMessage());
    }
    label236: return Ql();
  }

  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public final String getType(Uri paramUri)
  {
    return null;
  }

  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public final boolean onCreate()
  {
    return false;
  }

  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    z.i("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "query() " + paramUri);
    a(paramUri, getContext(), eMf);
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
    if (eME)
    {
      z.w("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "isBusy, return null");
      hg(5);
      return null;
    }
    aQ(true);
    if (!HL())
    {
      aQ(false);
      hg(1);
      return this.ehO;
    }
    if (!as(getContext()))
    {
      z.w("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "invalid appid ! return null");
      aQ(false);
      hg(2);
      return null;
    }
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "invaild selections");
      aQ(false);
      hg(3);
      return null;
    }
    String str = paramArrayOfString2[0];
    if (ch.jb(str))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", "userIdStr should not be null or nil");
      aQ(false);
      hg(3);
      return null;
    }
    while (true)
    {
      long l2;
      try
      {
        boolean bool = "0".equals(str.trim());
        if (bool)
          l2 = 0L;
        switch (eMf.match(paramUri))
        {
        default:
          localCursor = null;
          if (localCursor == null)
            break label333;
          hg(0);
          aQ(false);
          return localCursor;
          long l1 = Long.valueOf(com.tencent.mm.plugin.ext.a.a.lX(str.trim())).longValue();
          l2 = l1;
          continue;
        case 17:
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4QAahF9Px7Zg=", localException.getMessage());
        aQ(false);
        hg(4);
        return null;
      }
      Cursor localCursor = aT(l2);
      continue;
      label333: hg(4);
    }
  }

  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS
 * JD-Core Version:    0.6.2
 */