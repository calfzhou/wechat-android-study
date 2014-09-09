package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.tencent.mm.as.d;
import com.tencent.mm.model.bg;
import com.tencent.mm.n.af;
import com.tencent.mm.n.m;
import com.tencent.mm.n.p;
import com.tencent.mm.pluginsdk.c.b;
import com.tencent.mm.protocal.a.qh;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class ExtControlProviderNearBy extends ExtContentProviderBase
  implements p
{
  private static final String[] cY = { "nickname", "avatar", "distance", "signature", "sex" };
  private static final UriMatcher eMC;
  private static boolean eME = false;
  private static ay eMF = new ay(new f(), false);
  private com.tencent.mm.modelgeo.h dqP;
  private com.tencent.mm.modelgeo.c dqT = new i(this);
  private qh eMA;
  private boolean eMB;
  private boolean eMD = false;
  private int eMu;
  private List eMv;
  private d eMw;
  private Set eMx;
  private CountDownLatch eMy;
  private CountDownLatch eMz;
  private b euj = new h(this);

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    eMC = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.NearBy", "male", 1);
    eMC.addURI("com.tencent.mm.plugin.ext.NearBy", "female", 2);
    eMC.addURI("com.tencent.mm.plugin.ext.NearBy", "all", 0);
  }

  private void Qk()
  {
    if (this.eMx.size() > 0)
    {
      Iterator localIterator = this.eMx.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "add lbsfriend has no avatar: " + str);
        this.eMA = lY(str);
        if ((this.eMA != null) && (this.eMA.gnq != null))
        {
          d locald = this.eMw;
          Object[] arrayOfObject = new Object[5];
          arrayOfObject[0] = this.eMA.hwV;
          arrayOfObject[1] = null;
          arrayOfObject[2] = this.eMA.ifN;
          arrayOfObject[3] = this.eMA.dtg;
          arrayOfObject[4] = Integer.valueOf(this.eMA.dtf);
          locald.addRow(arrayOfObject);
        }
      }
    }
    z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "all user has got avatar");
  }

  private void a(qh paramqh)
  {
    if ((paramqh == null) || (paramqh.gnq == null))
      z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "lbsContactInfo is null or lbsContactInfo's userName is null");
    Bitmap localBitmap;
    do
    {
      return;
      this.eMx.add(paramqh.gnq);
      localBitmap = com.tencent.mm.n.c.a(paramqh.gnq, false, -1);
      z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "countDownLatchGet now count: " + this.eMz.getCount());
    }
    while (localBitmap == null);
    z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "countDownLatchGet countDown now");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[0];
    if (localBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream))
      arrayOfByte = localByteArrayOutputStream.toByteArray();
    this.eMx.remove(paramqh.gnq);
    d locald = this.eMw;
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramqh.hwV;
    arrayOfObject[1] = arrayOfByte;
    arrayOfObject[2] = paramqh.ifN;
    arrayOfObject[3] = paramqh.dtg;
    arrayOfObject[4] = Integer.valueOf(paramqh.dtf);
    locald.addRow(arrayOfObject);
    localBitmap.recycle();
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

  private qh lY(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
    {
      z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "username is null or nill");
      return null;
    }
    Iterator localIterator = this.eMv.iterator();
    while (localIterator.hasNext())
    {
      qh localqh = (qh)localIterator.next();
      if (localqh.gnq.equals(paramString))
        return localqh;
    }
    return null;
  }

  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public final void eX(String paramString)
  {
    z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "notifyChanged: " + paramString);
    if (this.eMB)
    {
      z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "has finished");
      return;
    }
    a(lY(paramString));
    this.eMz.countDown();
  }

  public final String getType(Uri paramUri)
  {
    this.eMu = -1;
    switch (eMC.match(paramUri))
    {
    default:
      this.eMu = -1;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return null;
      this.eMu = 1;
      continue;
      this.eMu = 3;
      continue;
      this.eMu = 4;
    }
  }

  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public final boolean onCreate()
  {
    return true;
  }

  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "query() " + paramUri);
    a(paramUri, getContext(), 15);
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
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "isDoingRequest, return null");
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
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "invalid appid ! return null");
      aQ(false);
      hg(2);
      return null;
    }
    z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "find type = " + this.eMu);
    getType(paramUri);
    if (this.eMu < 0)
    {
      z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "unkown uri, return null");
      aQ(false);
      hg(3);
      return null;
    }
    try
    {
      this.eMv = new ArrayList();
      this.eMw = new d(cY, (byte)0);
      this.eMy = new CountDownLatch(1);
      this.eMz = null;
      this.eMx = new HashSet();
      this.eMv = new ArrayList();
      this.eMB = false;
      z.v("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "start()");
      if (!bg.oE())
        z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "!MMCore.hasSetUin()");
      while (true)
      {
        z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "wait for get lbs info");
        if (!this.eMy.await(15000L, TimeUnit.MILLISECONDS))
          z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "countDownLatchWait time out");
        if (this.eMz == null)
          break;
        z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "get lbs info success, wait for get lbs friend");
        if (!this.eMz.await(15000L, TimeUnit.MILLISECONDS))
          z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "countDownLatchGet time out");
        aQ(false);
        af.sh().b(this);
        this.eMB = true;
        Qk();
        if ((this.eMw == null) || (this.eMw.getCount() <= 0))
          break label477;
        hg(0);
        z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "return now");
        return this.eMw;
        b.a("NetSceneLbsFind", this.euj);
        am.h(new g(this));
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        z.w("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", localException.getMessage());
        hg(4);
        continue;
        z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "not init countDownGet. return null");
        continue;
        label477: hg(4);
      }
    }
  }

  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy
 * JD-Core Version:    0.6.2
 */